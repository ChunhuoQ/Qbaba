/**
 * Project Name:Qbaba
 * File Name:LoginController.java
 * Package Name:m05.d28.com.dt59.controller.front
 * Date:2018年5月29日下午3:21:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d28.com.dt59.controller.front;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import m05.d28.com.dt59.ojpo.Auction;
import m05.d28.com.dt59.ojpo.AuctionUser;
import m05.d28.com.dt59.service.AuctionService;
import m05.d28.com.dt59.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:   <br/>
 * Date:     2018年5月29日 下午3:21:36 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
@Controller
@Scope("prototype")
public class LoginController {
   
    @Autowired
    LoginService ls;
    
    @Autowired
    AuctionService as;
    
    @RequestMapping(value="/doLogin")
    public String doLogin(String username,String userpassword,String inputCode,HttpServletRequest request){
        int flag=0;
        AuctionUser au=new AuctionUser();
        HttpSession session=request.getSession();
        String mRand=(String)session.getAttribute("numrand");
        au.setUsername(username);
        au.setUserpassword(userpassword);
        System.out.println(au);
        flag=ls.selectByUserAndPwd(au);
        if(flag>0&&mRand.equals(inputCode)){
            List<Auction> listau = as.selectAuctionAll();
            session.setAttribute("listau", listau);
            return "redirect:m05/d28/auctionList.jsp";
        }else{
        return "redirect:m05/d28/login.jsp";
        }
    }
    
    @RequestMapping(value="/auctionList")
    public String auctionList(HttpServletRequest request,String auctionname,
            String auctiondesc,String auctionstarttime,String auctionendtime,Double auctionstartprice){
        HttpSession session=request.getSession();
        System.out.println(auctionname);
        Auction auction=new Auction();
        if(auctionname.length()!=0){
            auction.setAuctionname("%"+auctionname+"%");
        }
        System.out.println(auctionname.length());
        if(auctiondesc.length()!=0){
         auction.setAuctiondesc("%"+auctiondesc+"%");
        }
        System.out.println(auctionname+"\t"+auctiondesc+"\t"+auctionstarttime+"\t");
        auction.setAuctionstarttime(auctionstarttime);
        auction.setAuctionendtime(auctionendtime);
        auction.setAuctionstartprice(auctionstartprice);
        System.out.println(auction);
        List<Auction> listau = as.selectByDynamic(auction);
        System.out.println(listau+"\t"+listau.size());
        if(listau.size()==0){
            session.removeAttribute("listau");
            return "redirect:m05/d28/auctionList.jsp";
        }else{
           session.setAttribute("listau", listau);
        return "redirect:m05/d28/auctionList.jsp";
        }
      }
    
    @RequestMapping(value="/auctionRevise")
    public String auctionRevise(HttpServletRequest request,Integer auctionid){
        HttpSession session=request.getSession();
        System.out.println(auctionid);
        Auction auction = as.selectAuctionById(auctionid);
        session.setAttribute("auction", auction);
        InputStream ist=null;
        OutputStream ost=null;
        try {      
                ost=new FileOutputStream("H:\\软件/apache-tomcat-8.0.50/wtpwebapps/Qbaba/m05/d28/images/"+auction.getAuctionid()+".jpg");
                Blob blob=(Blob)auction.getAuctionpic();
                ist= blob.getBinaryStream();//接收的二进制流
                byte[] bt=new byte[(int)blob.length()];//自已去找图片大小
                int len=ist.read(bt);
                while(len!=-1){
                    ost.write(bt);
                    len=ist.read(bt);
                System.out.println("读写完成！");
                }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                ost.close();
                ist.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "redirect:m05/d28/auctionrevise.jsp";
    }  
}


/**
 * Project Name:pinhong1
 * File Name:BizDaoImpl.java
 * Package Name:com.dao.impl
 * Date:2018年4月12日下午9:53:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d17.dusen.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import m04.d17.dusen.dao.BaseDao;
import m04.d17.dusen.dao.BizDao;
import m04.d17.dusen.entity.Message;
import m04.d17.dusen.entity.News;
import m04.d17.dusen.entity.Page;
import m04.d17.dusen.entity.Product;
import m04.d17.dusen.entity.Revert;
import m04.d17.dusen.entity.Use;


/**
 * Description: <br/>
 * Date: 2018年4月12日 下午9:53:16 <br/>
 * 
 * @author lenovopc
 * @version
 * @see
 */
public class BizDaoImpl extends BaseDao implements BizDao {

    @Override
    public List<News> getAllNews() {
        List<News> list = new ArrayList<News>();
        String sql = "SELECT * FROM news";
        try {
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                News ne = new News();
                ne.setNid(rs.getInt(1));
                ne.setNtitle(rs.getString(2));
                ne.setNcontent(rs.getString(3));
                ne.setNdate(rs.getDate(4));
                list.add(ne);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, cs, rs);
        }
        return list;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> listpro = new ArrayList<Product>();
        String sql = "SELECT * FROM product";

        try {
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setPid(rs.getInt(1));
                pro.setPname(rs.getString(2));
                pro.setPdrand(rs.getString(3));
                pro.setPmodel(rs.getString(4));
                pro.setPprice(rs.getDouble(5));
                pro.setPpicture(rs.getString(6));
                pro.setPdes(rs.getString(7));
                listpro.add(pro);
            }
        } catch (Exception e) {

            // Auto-generated catch block
            e.printStackTrace();

        } finally {
            close(con, cs, rs);
        }
        // Auto-generated method stub
        return listpro;
    }

    @Override
    public boolean getUser(Use use) {
        boolean flag = false;
        String sql = "SELECT * FROM USER WHERE uname=? AND upwd=?";
        try {
            pst = getCon().prepareStatement(sql);
            pst.setString(1, use.getUname());
            pst.setString(2, use.getUpwd());
            rs = pst.executeQuery();
            while (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, cs, rs);
        }

        return flag;
    }

    @Override
    public List<Use> getAllUse() {
        List<Use> listu = new ArrayList<Use>();
        String sql = "SELECT * FROM USER";
        try {
            pst = getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Use us = new Use();
                us.setUid(rs.getInt(1));
                us.setUname(rs.getString(2));
                us.setUpwd(rs.getString(3));
                us.setUstatus(rs.getString(4));
                us.setUpic(rs.getString(5));
                listu.add(us);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, cs, rs);
        }
        return listu;
    }

    public String getQuanXian(Use use) {
        String qx = "";
        String sql = "SELECT ustatus FROM USER WHERE uname=? AND upwd=?";
        try {
            pst = getCon().prepareStatement(sql);
            pst.setString(1, use.getUname());
            pst.setString(2, use.getUpwd());
            rs = pst.executeQuery();
            while (rs.next()) {
                qx = rs.getString(1);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            close(con, cs, rs);
        }

        return qx;
    }

    @Override
    public List<Product> fen(Page page) {
        List<Product> list = new ArrayList<Product>();
        String sql = "SELECT * FROM  product LIMIT  ?,? ";
        try {
            pst = getCon().prepareStatement(sql);
            pst.setInt(1, (page.getCurrentpage() - 1) * page.getPagesize());
            pst.setInt(2, page.getPagesize());
            rs = pst.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setPid(rs.getInt(1));
                pro.setPname(rs.getString(2));
                pro.setPdrand(rs.getString(3));
                pro.setPmodel(rs.getString(4));
                pro.setPprice(rs.getDouble(5));
                pro.setPpicture(rs.getString(6));
                pro.setPdes(rs.getString(7));
                list.add(pro);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }finally{
            close(con, cs, rs);
        }
        // Auto-generated method stub
        return list;
    }
    
    public int count(){
        int flag=0;
        try {
            String sql="SELECT COUNT(1) FROM  product";
            pst=getCon().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                flag=rs.getInt(1);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return flag;
        
    }

    @Override
    public List<Message> getAllMessage() {
        List<Message> listn=new ArrayList<Message>();
        try {
            String sql="SELECT * FROM `message`";
            pst=getCon().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                Message mess=new Message();
                mess.setMid(rs.getInt(1));
                mess.setMtitle(rs.getString(2));
                mess.setMcontent(rs.getString(3));
                mess.setMname(rs.getString(4));
                mess.setMdate(rs.getString(5));
                mess.setRcount(rs.getInt(6));
                listn.add(mess);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            close(con, cs, rs);
        }
        //  Auto-generated method stub
        return listn;
    }

    @Override
    public int addRevert(Revert rev) {
        int flag=0;
        String sql="INSERT INTO revert (`mid`,rcontent,rname,rdate) VALUES (?,?,?,now()) ";
        try {
            pst=getCon().prepareStatement(sql);
            pst.setInt(1, rev.getMid());
            pst.setString(2, rev.getRcontent());
            pst.setString(3, rev.getRname());
            flag=pst.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
            close(con, cs, rs);
        }
       
        //  Auto-generated method stub
        return flag;
    }
    public List<Message> getAllMessage(int mid) {
        List<Message> listmes=new ArrayList<Message>();
        String sql= "SELECT * FROM `message` WHERE mid=?";
        try{
           pst= getCon().prepareStatement(sql);
           pst.setInt(1, mid);
           rs=pst.executeQuery();
           while(rs.next()){
               Message mess=new Message();
               mess.setMid(rs.getInt(1));
               mess.setMtitle(rs.getString(2));
               mess.setMcontent(rs.getString(3));
               mess.setMname(rs.getString(4));
               mess.setMdate(rs.getString(5));
               mess.setRcount(rs.getInt(6));
               listmes.add(mess);
           }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            close(con, cs, rs);
        }
        
        return listmes;
    }
    public List<Revert> getAllRevert( int mid){
        List<Revert> listr=new ArrayList<Revert>();
        String sql="SELECT * FROM revert WHERE mid=?";
        try {
            pst=getCon().prepareStatement(sql);
            pst.setInt(1,mid);
            rs=pst.executeQuery();
            while(rs.next()){
                Revert rev=new Revert();
               rev.setRid(rs.getInt(1));
               rev.setMid(rs.getInt(2));
               rev.setRcontent(rs.getString(3));
               rev.setRname(rs.getString(4));
               rev.setRdate(rs.getString(5));
               listr.add(rev);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            close(con, cs, rs);
        }
      return listr;
    }

}

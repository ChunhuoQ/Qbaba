package m05.d17.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import m05.d17.mapper.SmbmsUserMapper;
import m05.d17.opjo.SmbmsUser;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginDoServlet extends HttpServlet {
  
    
    
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see Servlet#init(ServletConfig)
     */
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
    }

    /**
     * @see Servlet#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        SqlSessionFactoryBuilder sfb= new SqlSessionFactoryBuilder();
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory ssf=sfb.build(ins);
            SqlSession session= ssf.openSession();
            
        SmbmsUserMapper sum = session.getMapper(SmbmsUserMapper.class);
        
        String userCode=request.getParameter("userCode");
        String password=request.getParameter("userPassword");
        SmbmsUser user=new SmbmsUser();
        user.setUsercode(userCode);
        user.setUserpassword(password);
        
        List<SmbmsUser> listsu=sum.selectByPrimaryNmae(user);
        System.out.println(listsu);
        
        if(listsu.size()>0){
            
            request.setAttribute("username", listsu.get(0).getUsername());
            response.sendRedirect("m05/d17/jsp/frame.jsp");
        }else{
            response.sendRedirect("m05/d17/login.jsp");
        }
    }
}

package m04.d12.Qbaba.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d12.Qbaba.entity.User;
import m04.d12.Qbaba.impl.UserDaoImpl;

/**
 * Servlet implementation class Login2Servlet
 */
public class Login2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login2Servlet() {
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
	    doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    HttpSession session= request.getSession();
        String userName= request.getParameter("userName");
        String password= request.getParameter("password");
        User user=new User();
        user.setUname(userName);
        user.setUpwd(password);
        
        UserDaoImpl udl= new UserDaoImpl();
        boolean flag=udl.getviliteUser(user); 
        List<User> listuser=udl.selectUserAll();
        session.setAttribute("userName", userName);
        session.setAttribute("password", password);
        session.setAttribute("listuser", listuser);
        response.setCharacterEncoding("utf-8");
        PrintWriter out= response.getWriter();
        if(flag){
            response.sendRedirect("message");
        }else{
            out.print("<script>");
            out.print("location.href='m04/d12/Qbaba/Jsp_Proscenium/Login.jsp';");
            out.print("</script>");
            out.flush();
            out.close();
        }
	    
	}

}

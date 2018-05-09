package m04.d19.Qbaba.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d19.Qbaba.entity.User;
import m04.d19.Qbaba.impl.UserDaoImpl;



/**
 * Servlet implementation class S_LoginServlet
 */
public class S_LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S_LoginServlet() {
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
	    request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        HttpSession session=request.getSession();
        String userName= request.getParameter("userName");
        String password= request.getParameter("password");
        User user=new User();
        user.setUname(userName);
        user.setUpwd(password);
        UserDaoImpl udl= new UserDaoImpl();
        boolean flag=udl.getviliteUser(user); 
        List<User> listuser=udl.selectUserAll();
        session.setAttribute("listuser", listuser);
        PrintWriter out= response.getWriter();
        if(flag){
            session.setAttribute("userName", userName);
            session.setAttribute("password", password);
            out.print("<script>");
            out.print("alert('登录成功');");
            out.print("location.href='m04/d19/Qbaba/home.jsp';");
            out.print("</script>");
            out.flush();
            out.close();
            request.getRequestDispatcher("m04/d19/Qbaba/admin/home.jsp").forward(request, response);
        }else{
            out.print("<script>");
            out.print("alert('账号或密码错误');");
            out.print("location.href='m04/d19/Qbaba/home.jsp';");
            out.print("</script>");
            out.flush();
            out.close();
        }
	}

}

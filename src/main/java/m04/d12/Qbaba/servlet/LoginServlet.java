package m04.d12.Qbaba.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d12.Qbaba.entity.User;
import m04.d12.Qbaba.impl.ProductDaoImpl;
import m04.d12.Qbaba.impl.UserDaoImpl;



public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	    HttpSession session= request.getSession();
		request.setCharacterEncoding("utf-8");
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
			request.getRequestDispatcher("m04/d12/Qbaba/admin/index.jsp").forward(request, response);
		}else{
			out.print("<script>");
			out.print("location.href='m04/d12/Qbaba/Jsp_Proscenium/Login.jsp';");
			out.print("</script>");
			out.flush();
			out.close();
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}

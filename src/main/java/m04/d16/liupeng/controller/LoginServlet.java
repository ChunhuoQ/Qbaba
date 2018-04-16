package m04.d16.liupeng.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d16.liupeng.dao.impl.BizDaoImpl;
import m04.d16.liupeng.entity.User;
import m04.d16.liupeng.service.impl.BizServiceImpl;

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
	@Override
    public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        // request.setCharacterEncoding("utf-8");
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		User user=new User();
		user.setUname(userName);
		user.setUpwd(password);
        String status = user.getUstatus();
		BizDaoImpl bizdao=new BizDaoImpl();
		BizServiceImpl bsi=new BizServiceImpl();
		bsi.setBizDao(bizdao);//ΪʲôҪע��
		boolean flag=bsi.validateUser(user);
        // response.setCharacterEncoding("utf-8");
        // response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
        HttpSession session = request.getSession(false);
		if(flag){
            session.setAttribute("loginName", userName);
            session.setAttribute("loginStatus", status);
			request.getRequestDispatcher("admin/index.jsp").forward(request, response);
		}else{
			out.print("<script>");
            out.print("alert('用户名或密码错误！');");
			out.print("location.href='Jsp_Proscenium/Login.jsp';");
			//out.print("location.href='init';");
			out.print("</script>");
			out.flush();//ˢ��
			out.close();
		}

	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	@Override
    public void init() throws ServletException {
		// Put your code here
	}

}

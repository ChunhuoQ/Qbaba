package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.impl.BizDaoImpl;
import com.entity.Use;
import com.service.impl.BizServiceImpl;

/**
 * Servlet implementation class UseServlet
 */
public class UseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UseServlet() {
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
	    doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    //request.setCharacterEncoding("utf-8");
	     String uname= request.getParameter("userName");//获取
	     String pwd= request.getParameter("password");
	    
	    BizDaoImpl bdi=new BizDaoImpl();
	    BizServiceImpl bsi=new BizServiceImpl();
	    bsi.setBizDao(bdi);//注入
	    
	    Use use=new Use();
	    use.setUname(uname);
	    use.setUpwd(pwd);
	    
	   // response.setCharacterEncoding("utf-8");
	    PrintWriter out=response.getWriter();
	    HttpSession session=request.getSession();
	    
	    String qx=bsi.getQuanXian(use);
	    
	    boolean flag=bsi.getUser(use);
	    if(flag){
	        
	        session.setAttribute("uname",uname);
	        session.setAttribute("qx", qx);
	        
	        request.getRequestDispatcher("admin/index.jsp").forward(request, response);
	    }else{
	        out.print("<script>");
	        out.print("alert('用户名或密码错误');");
	        out.print("location.href='Jsp_Proscenium/Login.jsp';");
	        out.print("</script>");
	        out.flush();
	        out.close();
	    }
	    
	}

}

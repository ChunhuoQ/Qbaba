package m04.d16.dusen.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import m04.d16.dusen.dao.impl.BizDaoImpl;
import m04.d16.dusen.entity.Use;
import m04.d16.dusen.service.impl.BizServiceImpl;



/**
 * Servlet implementation class ManagerUseServlet
 */
public class ManagerUseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerUseServlet() {
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
	    request.setCharacterEncoding("utf-8");
	    BizDaoImpl bdi=new BizDaoImpl();
	    BizServiceImpl bsi=new BizServiceImpl();
	    bsi.setBizDao(bdi);
	    
	    List<Use> litsu=bsi.getAllUse();
	    request.setAttribute("listu", litsu);
	    request.getRequestDispatcher("admin/showUserList.jsp").forward(request, response);
	    
	    
	}

}

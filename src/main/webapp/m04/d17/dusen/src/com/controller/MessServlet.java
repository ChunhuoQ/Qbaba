package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.impl.BizDaoImpl;
import com.entity.Message;
import com.service.impl.BizServiceImpl;

/**
 * Servlet implementation class MessServlet
 */
public class MessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessServlet() {
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
	   BizDaoImpl bdi=new BizDaoImpl();
	   BizServiceImpl bsi=new BizServiceImpl();
	   bsi.setBizDao(bdi);
	   
	   List<Message> listm=bsi.getAllMessage();
	   HttpSession session=request.getSession();
	   session.setAttribute("listm", listm);
	   request.getRequestDispatcher("Jsp_Proscenium/S_MessageBoard.jsp").forward(request, response);
	}

}

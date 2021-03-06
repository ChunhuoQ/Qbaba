package m04.d12.Qbaba.servlet;

import java.io.IOException;


import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import m04.d12.Qbaba.entity.Revert;
import m04.d12.Qbaba.impl.MessageDapImpl;
import m04.d12.Qbaba.impl.RevertDaoImpl;

/**
 * Servlet implementation class Submit
 */
public class SubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmitServlet() {
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
	    HttpSession session=request.getSession();
	    RevertDaoImpl rdl=new RevertDaoImpl();
	    MessageDapImpl mdl=new MessageDapImpl();
	    String mid=(String)session.getAttribute("id");
	    String rname=request.getParameter("name");
	    String rcontent=request.getParameter("content");
	    Revert revert =new Revert();
	    revert.setMid(Integer.valueOf(mid));
	    revert.setRname(rname);
	    revert.setRcontent(rcontent);
	    java.util.Date rdate = new java.util.Date();
	    revert.setRdate(rdate);
	    rdl.insertRev(revert);
	    mdl.updatemess(Integer.valueOf(mid));
	    List<Revert> listrev=rdl.reveListById(mid);
	    session.setAttribute("listrev",listrev);
	    
	    response.sendRedirect("m04/d12/Qbaba/Jsp_Proscenium/R_MessageBoard.jsp");
	}

}


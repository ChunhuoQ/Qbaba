package m04.d17.dusen.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d17.dusen.dao.impl.BizDaoImpl;
import m04.d17.dusen.entity.Revert;
import m04.d17.dusen.service.impl.BizServiceImpl;


/**
 * Servlet implementation class RevertServlet
 */
public class RevertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RevertServlet() {
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
	    String path = request.getContextPath();
	   HttpSession session= request.getSession();
	   String rcontent= request.getParameter("content");//内容
	   String rname=request.getParameter("name");//姓名
	   String mid=request.getParameter("messageid");//mid
	   
	   BizDaoImpl bdi=new BizDaoImpl();
	   BizServiceImpl bsi=new BizServiceImpl();
	   bsi.setBizDao(bdi);
	   
	   Revert rev=new Revert();
	   rev.setMid(Integer.valueOf(mid));
	   rev.setRcontent(rcontent);
	   rev.setRname(rname);
	   int flag=bsi.addRevert(rev);
	   
	   List<Revert> listr=bsi.getAllRevert(Integer.valueOf(mid));
	   
	   if(flag>0){
	       session.setAttribute("listr", listr);
	      
	        request.getRequestDispatcher("Jsp_Proscenium/MessageBoard_replay.jsp").forward(request, response);
	   }else{
	       request.getRequestDispatcher("one.jsp").forward(request,response);
	   }
	   
	}

}

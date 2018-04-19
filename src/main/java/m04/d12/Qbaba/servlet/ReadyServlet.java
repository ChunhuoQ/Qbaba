package m04.d12.Qbaba.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d12.Qbaba.entity.Message;
import m04.d12.Qbaba.entity.Revert;
import m04.d12.Qbaba.impl.MessageDapImpl;
import m04.d12.Qbaba.impl.RevertDaoImpl;

/**
 * Servlet implementation class ReadyServlet
 */
public class ReadyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadyServlet() {
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
	    
	    String id=request.getParameter("id");
        MessageDapImpl mdl=new MessageDapImpl();
        RevertDaoImpl rdl=new RevertDaoImpl();
      
        List<Message> listmess=mdl.messListById(id);
        List<Revert> listrev=rdl.reveListById(id);
        session.setAttribute("listmess",listmess);
        session.setAttribute("listrev",listrev);
        session.setAttribute("id", id);
        System.out.println(id);
        response.sendRedirect("m04/d12/Qbaba/Jsp_Proscenium/R_MessageBoard.jsp");
	}

}

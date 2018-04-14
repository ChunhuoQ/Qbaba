package m04.d12.Qbaba.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d12.Qbaba.entity.ProPage;
import m04.d12.Qbaba.entity.Product;
import m04.d12.Qbaba.entity.User;
import m04.d12.Qbaba.impl.ProductDaoImpl;
import m04.d12.Qbaba.impl.UserDaoImpl;



public class PageServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public PageServlet() {
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
	    int currentpage=Integer.valueOf(request.getParameter("currentpage"));
	    ProductDaoImpl pdi=new ProductDaoImpl();
	    ProPage proPage=new ProPage();
	    
	    List<Product> listpl=pdi.getByView(currentpage);
	    
	    session.setAttribute("listpl", listpl);
	    session.setAttribute("currentpage", currentpage);
	    
	    response.sendRedirect("m04/d12/Qbaba/Jsp_Proscenium/M_ShowProduct.jsp");
	    
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

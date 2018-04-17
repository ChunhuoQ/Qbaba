package m04.d16.dusen.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d16.dusen.dao.impl.BizDaoImpl;
import m04.d16.dusen.entity.Page;
import m04.d16.dusen.entity.Product;
import m04.d16.dusen.service.impl.BizServiceImpl;


/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
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

	    List<Product> listpro=bsi.getAllProduct();
	    HttpSession session=request.getSession();
	   
	    Page page1=new Page();
	    if(page1.getCurrentpage()==0){
	        page1.setCurrentpage(1);
	    }else{
	        page1.setCurrentpage(1);
	    }
	    int flag=bsi.count();
        page1.setLastpage(flag);
        
        List<Product> listt=bsi.fen(page1);
        request.setAttribute("page1", page1);
        session.setAttribute("listt", listt);
        
        session.removeAttribute("page1");
        
        
	    request.getRequestDispatcher("Jsp_Proscenium/M_ShowProduct.jsp").forward(request, response);
	}

}

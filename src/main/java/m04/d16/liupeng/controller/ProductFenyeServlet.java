package m04.d16.liupeng.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d16.liupeng.dao.impl.BizDaoImpl;
import m04.d16.liupeng.entity.Page;
import m04.d16.liupeng.entity.Product;
import m04.d16.liupeng.service.impl.BizServiceImpl;

/**
 * Servlet implementation class ProductFenyeServlet
 */
public class ProductFenyeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductFenyeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	@Override
    public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // request.setCharacterEncoding("utf-8");
        // response.setCharacterEncoding("utf-8");
        // response.setContentType("text/html; charset=utf-8");
        String currentpage = request.getParameter("currentpage");
        Page pagep = new Page();

        BizDaoImpl bizdao = new BizDaoImpl();
        BizServiceImpl bsi = new BizServiceImpl();
        bsi.setBizDao(bizdao);

        int count = bsi.getProductSize();
        pagep.setSumsize(count);
        pagep.setLastpage(pagep.getSumsize() % pagep.getPagesize() == 0 ? pagep.getSumsize() / pagep.getPagesize()
                : (pagep.getSumsize() / pagep.getPagesize() + 1));
        pagep.setCurrentpage(Integer.parseInt(currentpage));
        List<Product> listp = bsi.getProductByPage(pagep);
        HttpSession session = request.getSession();
        session.setAttribute("pagep", pagep);
        session.setAttribute("listp", listp);
        request.getRequestDispatcher("Jsp_Proscenium/M_ShowProduct.jsp").forward(request, response);
	}

}

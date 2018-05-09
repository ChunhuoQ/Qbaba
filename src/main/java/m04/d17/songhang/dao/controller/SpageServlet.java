package m04.d17.songhang.dao.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SpageServlet
 */
public class SpageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpageServlet() {
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
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        // TODO Auto-generated method stub
        /* request.setCharacterEncoding("utf-8"); */
        // String currentpage = request.getParameter("currentpage");
        // BizDaoImpl bizdao = new BizDaoImpl();
        // BizServiceImpl bsi = new BizServiceImpl();
        // bsi.setBizDao(bizdao);// 为什么要注入
        // int count = bsi.getsum();
        // Page pg = new Page();
        // pg.setLastpage(count);
        // pg.setCurrentpage(Integer.valueOf(currentpage));
        // List<Product> listproduct = bsi.getNewsInfoPageById(pg);
        // HttpSession session = request.getSession(false);
        // session.setAttribute("listproduct", listproduct);
        // session.setAttribute("pg", pg);
        // request.getRequestDispatcher("Jsp_Proscenium/M_ShowProduct.jsp").forward(request,
        // response);
    }
}

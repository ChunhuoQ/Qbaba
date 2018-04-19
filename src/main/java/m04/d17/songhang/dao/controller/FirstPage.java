package m04.d17.songhang.dao.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d17.songhang.dao.impl.BizDaoImpl;
import m04.d17.songhang.entity.Page;
import m04.d17.songhang.entity.Product;
import m04.d17.songhang.service.impl.BizServiceImpl;

/**
 * Servlet implementation class FirstPage
 */
public class FirstPage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstPage() {
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
        // request.setCharacterEncoding("utf-8");
        String currentpage = request.getParameter("currentpage");
        Page pg = new Page();

        // pg.setCurrentpage(1);

        BizDaoImpl bdi = new BizDaoImpl();
        BizServiceImpl bsi = new BizServiceImpl();
        bsi.setBizDao(bdi);// 注入

        // int count = bsi.getsum();
        // pg.setLastpage(count);

        List<Product> list = bsi.getProductAll();
        // List<Product> list = bsi.getNewsInfoPageById(pg);
        HttpSession session = request.getSession();
        // request.setAttribute("pg", pg);
        session.setAttribute("listpage", list);
        request.getRequestDispatcher("Jsp_Proscenium/M_ShowProduct.jsp").forward(request, response);

    }

}

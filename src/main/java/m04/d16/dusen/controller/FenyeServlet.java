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
import com.entity.Page;
import com.entity.Product;
import com.service.impl.BizServiceImpl;

/**
 * Servlet implementation class FenyeServlet
 */
public class FenyeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FenyeServlet() {
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
        request.setCharacterEncoding("utf-8");
        String currentpage = request.getParameter("currentpage");
        BizDaoImpl bdi = new BizDaoImpl();
        BizServiceImpl bsi = new BizServiceImpl();
        bsi.setBizDao(bdi);// 注入

        Page page1 = new Page();
        int flag = bsi.count();
        page1.setLastpage(flag);
        int curr;
        try {
            curr = Integer.parseInt(currentpage);
        } catch (Exception e) {
            // TODO: handle exception
            curr = 2;
        }

        page1.setCurrentpage(curr);

        List<Product> list = bsi.fen(page1);
        HttpSession session = request.getSession();
        session.setAttribute("page1", page1);
        session.setAttribute("listt", list);

        request.getRequestDispatcher("Jsp_Proscenium/M_ShowProduct.jsp").forward(request, response);
    }

}

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
import m04.d16.liupeng.entity.News;
import m04.d16.liupeng.entity.Product;
import m04.d16.liupeng.service.impl.BizServiceImpl;

/**
 * Servlet implementation class InitServlet
 */
public class InitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
   

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
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        // TODO Auto-generated method stub
        BizDaoImpl bizdao = new BizDaoImpl();
        BizServiceImpl bis = new BizServiceImpl();
        bis.setBizDao(bizdao);
        List<News> listnews = bis.getAllNews();
        HttpSession session = request.getSession();
        session.setAttribute("listnews", listnews);

        List<Product> listpro = bis.getAllProduct();
        session.setAttribute("listpro", listpro);
        request.getRequestDispatcher("Jsp_Proscenium/M_Index.jsp").forward(request, response);

    }

}

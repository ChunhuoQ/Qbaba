package m04.d17.songhang.dao.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InitServlet
 */

public class InitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitServlet() {
        super();
        // TODO Auto-generated constructor stub
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
        BizDaoImpl bdi = new BizDaoImpl();
        BizServiceImpl bzi = new BizServiceImpl();
        bzi.setBizDao(bdi);
        List<News> listnews = bzi.getNewsAll();
        HttpSession session = request.getSession();
        session.setAttribute("listnews", listnews);
        List<Product> listpro = bzi.getProductAll();
        session.setAttribute("listpro", listpro);
        request.getRequestDispatcher("Jsp_Proscenium/M_Index.jsp").forward(request, response);
    }
}

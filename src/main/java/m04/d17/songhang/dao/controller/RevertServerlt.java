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

/**
 * Servlet implementation class RevertServerlt
 */
public class RevertServerlt extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RevertServerlt() {
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
        BizDaoImpl bdi = new BizDaoImpl();
        BizServiceImpl bzi = new BizServiceImpl();
        bzi.setBizDao(bdi);

        String id = request.getParameter("id");

        List<Revert> listpev = bzi.getAllRevert();
        Message mess = bzi.getMessageById(Integer.parseInt(id));
        /*
         * User user = new User(); String utatus = bzi.getUstatus(user);
         */
        HttpSession session = request.getSession();
        session.setAttribute("listpev", listpev);
        session.setAttribute("listmess", mess);
        /* session.setAttribute("loginName", utatus); */
        request.getRequestDispatcher("Jsp_Proscenium/R_MessageBoard.jsp").forward(request, response);
    }

}

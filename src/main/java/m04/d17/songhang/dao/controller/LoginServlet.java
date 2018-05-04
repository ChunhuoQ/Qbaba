package m04.d17.songhang.dao.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d17.songhang.dao.impl.BizDaoImpl;
import m04.d17.songhang.entity.User;
import m04.d17.songhang.service.impl.BizServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        // request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user = new User();
        user.setUname(userName);
        user.setUpwd(password);
        BizDaoImpl bizdao = new BizDaoImpl();
        BizServiceImpl bsi = new BizServiceImpl();
        bsi.setBizDao(bizdao);// 为什么要注入
        boolean flag = bsi.validataUser(user);
        String utatus = bsi.getUstatus(user);
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        if (flag) {
            session.setAttribute("loginName", utatus);
            request.getRequestDispatcher("admin/index.jsp").forward(request, response);
        } else {
            out.print("<script>");
            out.print("alert('用户名或密码错误！');");
            out.print("location.href='Jsp_Proscenium/Login.jsp';");
            // out.print("location.href='init';");
            out.print("</script>");
            out.flush();// 刷新
            out.close();
        }
    }

}

package m04.d12.Qbaba.servlet;

import java.io.IOException;





import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d12.Qbaba.entity.News;
import m04.d12.Qbaba.entity.ProPage;
import m04.d12.Qbaba.entity.Product;
import m04.d12.Qbaba.impl.NewsDaoImpl;
import m04.d12.Qbaba.impl.ProductDaoImpl;



public class InitServlet extends HttpServlet {
    
    int nowPage=1;
    /**
     * serialVersionUID:
     */
    private static final long serialVersionUID = 1L;


    /**
     * Constructor of the object.
     */
    public InitServlet() {
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
        
        ProPage proPage=new ProPage();
        NewsDaoImpl ndi= new NewsDaoImpl();
        ProductDaoImpl pdi=new ProductDaoImpl();
        System.getProperty("user.dir");
        String cpath= request.getContextPath();
        System.out.println(cpath);
        String method= request.getMethod();
        System.out.println(method);
        List<News> listnews= ndi.selectNewsAll();
        HttpSession session= request.getSession();
        session.setAttribute("listnews", listnews);
        List<Product> listpro = pdi.selectProAll();
        List<Product> listpl=pdi.getByView(nowPage);
        session.setAttribute("currentpage", nowPage);
        session.setAttribute("listpro", listpro);
        session.setAttribute("listpl", listpl);
        response.sendRedirect("m04/d12/Qbaba/index.jsp");
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

package m04.d19.Qbaba.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d19.Qbaba.entity.ShangPing;
import m04.d19.Qbaba.impl.SpDaoImpl;

/**
 * Servlet implementation class BuyServlet
 */
public class BuyServlet extends HttpServlet {
    Map <Integer,ShangPing> map=null;
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	    map=new HashMap<Integer,ShangPing>();
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
	    doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
	    request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        HttpSession session=request.getSession();
        String username=(String)session.getAttribute("userName");
        String spid=request.getParameter("spid");
        PrintWriter out= response.getWriter();
        
        int id=Integer.valueOf(spid);
        if(username!=null){
            SpDaoImpl sdl= new SpDaoImpl();
            List<ShangPing> list= sdl.selectPsById(id);
            ShangPing sp=new ShangPing(list.get(0).getSpid(),list.get(0).getSpname(),list.get(0).getSpprice(),list.get(0).getSpdesc(),list.get(0).getSpimg(),list.get(0).getSpcss());
            
            if(map.containsKey(id)){
               sp.setNum(map.get(id).getNum()+1);
               map.put(id, sp);
   
               
            }else{
                map.put(id, sp);
            }
          
            session.setAttribute("map", map);
            
            response.sendRedirect("m04/d19/Qbaba/buy.jsp");
            
           
        }else{
            out.print("<script>");
            out.print("alert('您尚未登录,请先 登录！');");
            out.print("location.href='m04/d19/Qbaba/home.jsp';");
            out.print("</script>");
            out.flush();
            out.close();
        }
	}

}

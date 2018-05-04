package m04.d23.Qbaba.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m04.d23.Qbaba.entity.City_info;
import m04.d23.Qbaba.entity.Province_info;
import m04.d23.Qbaba.impl.CityImpl;
import m04.d23.Qbaba.impl.ProvinceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Servlet implementation class CityServlet
 */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityServlet() {
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
	    request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
	    JSONArray jsonArray=new JSONArray();
	    String province=request.getParameter("Province");
	    System.out.println(province);
            ProvinceImpl pl=new ProvinceImpl();
            CityImpl cl=new CityImpl();
            int id=pl.selectProvinByName(province);
            List<City_info> list=cl.selectCityById(id);
            System.out.println(list);
            jsonArray = JSONArray.fromObject(list);
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            //session.setAttribute("listc", list);
            System.out.println(jsonArray.toString());
            out.write(jsonArray.toString());
            out.close();
            out.flush();
   
	}

}

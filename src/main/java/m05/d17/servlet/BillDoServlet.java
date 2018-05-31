package m05.d17.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import m05.d17.mapper.SmbmsBillMapper;
import m05.d17.mapper.SmbmsProviderMapper;
import m05.d17.mapper.SmbmsUserMapper;
import m05.d17.opjo.SmbmsBill;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Servlet implementation class BillDoServlet
 */
public class BillDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillDoServlet() {
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
	    SqlSessionFactoryBuilder sfb= new SqlSessionFactoryBuilder();
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory ssf=sfb.build(ins);
            SqlSession session= ssf.openSession();
            SmbmsBillMapper sbm = session.getMapper(SmbmsBillMapper.class);
            SmbmsProviderMapper spm = session.getMapper(SmbmsProviderMapper.class);
            List<String> proName= spm.selectByPrimaryProName();
            List<SmbmsBill> listsb=sbm.selectByPrimaryAll();
            HttpSession se=request.getSession();
            se.setAttribute("listsb", listsb);
            se.setAttribute("proName", proName);
            response.sendRedirect("m05/d17/jsp/billlist.jsp");
	}

}

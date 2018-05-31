package m05.d17.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import m05.d17.mapper.SmbmsProviderMapper;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Servlet implementation class BilleDelServlet
 */
public class BilleDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BilleDelServlet() {
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
	    
	    SqlSessionFactoryBuilder sfb= new SqlSessionFactoryBuilder();
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory ssf=sfb.build(ins);
            SqlSession session= ssf.openSession();
            SmbmsProviderMapper spm = session.getMapper(SmbmsProviderMapper.class);
            String method=request.getParameter("method");
            JSONArray jy=JSONArray.fromObject(method);
            JSONObject jobj;
            Map<String,String> map=null;
            for(int i=0;i<jy.size();i++){
                map=new HashMap<String,String>();
                jobj =jy.getJSONObject(i);
                map.put("delbill", (String)jobj.get("delbill"));
            }
            System.out.println(map.get("delbill"));
            
            int flag=spm.deleteByPrimaryKey(Integer.parseInt(map.get("delbill")));
            if(flag!=0){
                System.out.println("删除成功");
            }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

package m04.d17.dusen.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class PinFilter
 */
public class PinFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PinFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	@Override
    public void destroy() {
		// TODO Auto-generated method stub
	    System.out.println("=============走了没");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
	    HttpServletRequest request=(HttpServletRequest)req;
	    HttpServletResponse response=(HttpServletResponse)res;
	    request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
	    chain.doFilter(req, res);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
    public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	    System.out.println("=============走了没");
	}

}

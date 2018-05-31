/**
 * Project Name:Qbaba
 * File Name:Encode.java
 * Package Name:m05.d25.com.dt59.filters
 * Date:2018年5月28日上午8:49:37
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d25.com.dt59.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * Description:   <br/>
 * Date:     2018年5月28日 上午8:49:37 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class EncodeFilter implements Filter{

    @Override
    public void destroy() {
        
        //  Auto-generated method stub
        
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException,
            ServletException {
        
        arg0.setCharacterEncoding("utf-8");
        arg1.setCharacterEncoding("utf-8");
        arg1.setCharacterEncoding("text/html;charset=utf-8");
        arg2.doFilter(arg0, arg1);
        
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        
        //  Auto-generated method stub
        
    }



}


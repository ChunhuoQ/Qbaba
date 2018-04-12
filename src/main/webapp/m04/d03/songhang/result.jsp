<%@page import="m04.d03.songhang.entity.NewsInfo"%>
<%@page import="m04.d03.songhang.dao.BizDao"%>
<%@page import="m04.d03.songhang.service.impl.BizServiceImpl"%>
<%@page import="m04.d03.songhang.dao.impl.BizDaoImpl"%>
<%@page import="m04.d03.songhang.entity.UesrInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'result.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!-- <link rel="stylesheet" type="text/css" href="styles.css"> -->
	

  </head>
  
  <body>
    <%
    	request.setCharacterEncoding("utf-8");
    	//获取用户名
    	String uname= request.getParameter("name");
    	//获取密码
    	String upwd= request.getParameter("pwd");
    	//装箱
    	UesrInfo user=new UesrInfo();
    	user.setUsername(uname);
    	user.setPassword(upwd);
    	BizDaoImpl bdi=new BizDaoImpl();
    	BizServiceImpl bsi=new BizServiceImpl();
    	bsi.setBizdao(bdi);//注入
    	boolean flag=bdi.vaildataUser(user);
    	if(flag){
    		session.setAttribute("uname", uname);
    		session.removeAttribute("error");//移除session
    		//session.setMaxInactiveInterval(60*60);//设置时间  以秒为单位
    		/* List<NewsInfo> listnews= bdi.all(); */
    		/* request.setAttribute("listnewws", listnews); */
    		//转发
    		request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
    	}else{
    		session.setAttribute("error", "用户名或密码输入错误！");
    		//session.invalidate();//让所有session失效
    		//重定向
    		response.sendRedirect("index.jsp");
    	}
     %>
  </body>
</html>

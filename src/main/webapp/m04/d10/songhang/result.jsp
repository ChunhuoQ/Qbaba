<%@page import="m04.d10.songhang.entity.NewsInfo"%>
<%@page import="m04.d10.songhang.entity.Page"%>
<%@page import="m04.d10.songhang.dao.impl.BizDaoImpl"%>
<%@page import="m04.d10.songhang.entity.UserInfo"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="cn.dt59.entity.Page"%>
<%@page import="cn.dt59.entity.NewsInfo"%>
<%@page import="cn.dt59.dao.BizDao"%>
<%@page import="cn.dt59.service.impl.BizServiceImpl"%>
<%@page import="cn.dt59.dao.impl.BizDaoImpl"%>
<%@page import="cn.dt59.entity.UserInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'result.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
    	request.setCharacterEncoding("utf-8");
    	//获取用户名
    	String uname= request.getParameter("uname");
    	//获取密码
    	String upwd= request.getParameter("upwd");
    	//装箱
    	UserInfo user=new UserInfo();
    	user.setUsername(uname);
    	user.setUserpwd(upwd);
    	BizDaoImpl bdi=new BizDaoImpl();
    	
    	Page page2=new Page();
    	boolean flag=bdi.validateUser(user);
    	if(flag){
    		session.setAttribute("uname", uname);
    		session.removeAttribute("error");//移除session
    		//session.setMaxInactiveInterval(60*60);//设置时间  以秒为单位
    		//List<NewsInfo> listnews= bsi.getNews();
    		page2.setCurrentpage(1);
    		List<NewsInfo> listnews= bdi.getNewsInfoPageById(page2);
    		request.setAttribute("page2", page2); 
    		request.setAttribute("listpage", listnews);
    		//转发
    		request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
    	}else{
    		session.setAttribute("error", "用户名或密码输入错误！");
    		//session.invalidate();//让所有session失效
    		//重定向
    		response.sendRedirect("index.jsp");
    	}
     %>
     <%
     SmartUpload su=new SmartUpload();
     su.initialize(super.getServletConfig(), request, response);
     String one="jpg,png";
     String two="exe,rar,jsp";
     
     %>
  </body>
</html>

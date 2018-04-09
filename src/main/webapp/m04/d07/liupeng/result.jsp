<%@page import="m04.d07.liupeng.entity.NewsInfo"%>
<%@page import="m04.d07.liupeng.service.impl.BizServiceImpl"%>
<%@page import="m04.d07.liupeng.dao.impl.BizDaoImpl"%>
<%@page import="m04.d07.liupeng.entity.UserInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		UserInfo user=new UserInfo();
		user.setUsername(uname);
		user.setPassword(upwd);
		BizDaoImpl bdi=new BizDaoImpl();
		bdi.validateUser(user);
		BizServiceImpl bsi=new BizServiceImpl();
		bsi.setBizdao(bdi);
		boolean flag=bsi.validateUser(user);
		if(flag){
		    session.setAttribute("uname", uname);
		    session.removeAttribute("error");
		    session.setMaxInactiveInterval(60*60);
		    List<NewsInfo> listnews=bsi.getNews();
		    request.setAttribute("listnews",listnews);
		    //转发
		    request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
		}else{
		    session.setAttribute("error", "用户名或密码输入错误");
		    response.sendRedirect("index.jsp");
		}
	%>
</body>
</html>
<%@page import="m04.d03.entity.UesrInfo"%>
<%@page import="m04.d03.dao.impl.BizDaoImpl" %>
<%@page import="m04.d03.service.impl.BizServiceImpl" %>
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
	String uname=request.getParameter("username");
	String pwd=request.getParameter("password");
	
	UesrInfo user=new UesrInfo();
	user.setUsername(uname);
	user.setPassword(pwd);
	
	BizDaoImpl bdi=new BizDaoImpl();
	bdi.vaildataUser(user);
	BizServiceImpl bsi=new BizServiceImpl();
	bsi.setBizdao(bdi);
	
	boolean flag=bsi.vaildataUser(user);
	if(true){
	    session.setAttribute("username", uname);
	    request.getRequestDispatcher("admin/admin.jsp");
	    
	}else{
	    response.sendRedirect("NewFile.jsp");
	}
	
	%>
</body>
</html>
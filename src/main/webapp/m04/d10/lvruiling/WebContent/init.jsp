

<%@page import="m04.d10.lvruiling.com.dt59.service.impl.BizServiceImpl"%>
<%@page import="m04.d10.lvruiling.com.dt59.dao.impl.BizDaoImpl"%>
<%@page import="com.dt59.entity.CommentInfo"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
    
    <title>My JSP 'init.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
</head>
<body>
<%
  		BizDaoImpl bdi=new BizDaoImpl();
    	BizServiceImpl bsi=new BizServiceImpl();
    	bsi.setBizDao(bdi);//注入
    	List<CommentInfo> listc= bsi.getAllCommentInfo();
    	request.setAttribute("listc", listc);
    	request.getRequestDispatcher("index.jsp").forward(request, response);
   %>
</body>
</html>
<%@page import="m04.d09.Qbaba.entity.NewsCommentInfo"%>
<%@page import="java.util.List"%>
<%@page import="m04.d09.Qbaba.Dao.impl.NewsDaoImpl"%>
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
NewsDaoImpl ndi=new NewsDaoImpl();
List<NewsCommentInfo> listc=ndi.getAllNewsComment();
session.setAttribute("listc", listc);
request.getRequestDispatcher("index.jsp").forward(request,response); 
%>
</body>
</html>
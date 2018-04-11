<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@ page language="java" contentType="text/html;charset=UTF-8" import="m04.d09.Qbaba.entity.UserInfoDaoImpl,m04.d09.Qbaba.Dao.impl.NewsDaoImpl,java.util.List,m04.d09.Qbaba.entity.NewsInfo"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
NewsDaoImpl ndi=new NewsDaoImpl();
request.setCharacterEncoding("utf-8");
String idl =request.getParameter("idl");
String author=request.getParameter("author");
String title=request.getParameter("title");
String nsummary=request.getParameter("nsummary");
String ncontent=request.getParameter("ncontent");
    session.setAttribute("idl1",idl);
    session.setAttribute("author",author);
    session.setAttribute("title",title);
    session.setAttribute("nsummary",nsummary);
    session.setAttribute("ncontent",ncontent);
	response.sendRedirect("admin/news_modify.jsp"); 
%>
</body>
</html>
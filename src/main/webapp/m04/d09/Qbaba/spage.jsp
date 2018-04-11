<%@page import="m04.d09.Qbaba.entity.NewsInfo"%>
<%@page import="java.util.List"%>
<%@page import="m04.d09.Qbaba.Dao.impl.NewsDaoImpl"%>
<%@page import="m04.d09.Qbaba.entity.Page"%>
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
String currentpage=request.getParameter("currentpage");
Page page2=new Page();
page2.setCurrentpage(Integer.parseInt(currentpage));
NewsDaoImpl ndi=new NewsDaoImpl();
List<NewsInfo> list=ndi.getNewsInfoByPage(page2);
int pageLast=ndi.getNewsInfoLastPage(page2);
request.setAttribute("page2", page2);
request.setAttribute("listpage", list);
request.setAttribute("pageLast", pageLast);
request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
%>
</body>
</html>
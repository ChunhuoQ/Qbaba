<%@ page language="java" contentType="text/html; charset=UTF-8"import="m04.d03.Qbaba.entity.UserInfoDaoImpl,m04.d03.Qbaba.Dao.impl.NewsDaoImpl,java.util.List,m04.d03.Qbaba.entity.NewsInfo"
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
String id=request.getParameter("idl");
response.sendRedirect("admin/news_modify.jsp");
%>
</body>
</html>
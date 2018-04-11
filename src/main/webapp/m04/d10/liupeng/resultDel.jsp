<%@page import="m04.d10.liupeng.service.impl.BizServiceImpl"%>
<%@page import="m04.d10.liupeng.dao.impl.BizDaoImpl"%>
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
		BizDaoImpl bdi=new BizDaoImpl();
		BizServiceImpl bsi=new BizServiceImpl();
		bsi.setBizdao(bdi);
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		int flag=bsi.delNewsInfoById(Integer.valueOf(id));
		if(flag>0){
		    response.sendRedirect("del.jsp");
		}else{
		    response.sendRedirect("del2.jsp");
		}
	%>
</body>
</html>
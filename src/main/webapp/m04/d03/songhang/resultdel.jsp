<%@page import="m04.d03.songhang.service.impl.BizServiceImpl"%>
<%@page import="m04.d03.songhang.dao.impl.BizDaoImpl"%>
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
	BizDaoImpl bdi=new BizDaoImpl();
	BizServiceImpl bsi=new BizServiceImpl();
	bsi.setBizdao(bdi);//注入
	String id=request.getParameter("id");

	/*int flag=bsi.delNewsInfoById(id);
	 if(flag>0){
		response.sendRedirect("delone.jsp");
	}else{
		response.sendRedirect("deltwo.jsp");
	} */
	%>
	<%=id %>

	int flag=bsi.delNewsInfoById(Integer.valueOf(id));
	if(flag>0){
		response.sendRedirect("delone.jsp");
	}else{
		response.sendRedirect("deltwo.jsp");
	}
	%>

</body>
</html>
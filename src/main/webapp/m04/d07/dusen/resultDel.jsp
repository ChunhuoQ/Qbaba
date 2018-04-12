<%@page import="m04.d10.dusen.xin.entity.CommentInfo"%>
<%@page import="m04.d10.dusen.xin.service.impl.BizServicerImpl"%>
<%@page import="m04.d10.dusen.xin.dao.impl.BizDaolmpl"%>
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
		String id=request.getParameter("id");
		BizDaolmpl bdi=new BizDaolmpl();
		BizServicerImpl bsi=new BizServicerImpl();
		bsi.setBizdao(bdi);
		int flag=bsi.re(Integer.valueOf(id));
		if(flag>0){
		    response.sendRedirect("delone.jsp");
		}else{
		    response.sendRedirect("deltwo.jsp");
		}
	%>
</body>
</html>

<%@page import="m04.d10.dusen.xin.entity.NewsInfo"%>
<%@page import="m04.d10.dusen.xin.service.impl.BizServicerImpl"%>
<%@page import="m04.d10.dusen.xin.dao.impl.BizDaolmpl"%>
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
		String nti=request.getParameter("ntitle");
		String nau=request.getParameter("nauthor");
	
	
		BizDaolmpl bdi=new BizDaolmpl();
		BizServicerImpl bsi=new BizServicerImpl();
		bsi.setBizdao(bdi);
		
		
		
		//Integer sid=(Integer)application.getAttribute("sid");
		Integer sid=(Integer)session.getAttribute("sid");

		 NewsInfo nf=new NewsInfo();
		nf.setNewsauthor(nau);
		nf.setNewstitle(nti);
		nf.setNewsid(sid);
		
	 	 int flag=bsi.add(nf);
		
		 if(flag>0){
		    request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
		}else{
		    response.sendRedirect("deltwo.jsp");
		} 
	%>
	
</body>
</html>
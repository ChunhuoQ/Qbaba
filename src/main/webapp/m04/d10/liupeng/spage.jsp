<%@page import="m04.d10.liupeng.entity.NewsInfo"%>
<%@page import="m04.d10.liupeng.service.impl.BizServiceImpl"%>
<%@page import="m04.d10.liupeng.dao.impl.BizDaoImpl"%>
<%@page import="m04.d10.liupeng.entity.Page"%>
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
		String currentpage=request.getParameter("currentpage");
		Page pagep=new Page();
		pagep.setCurrentpage(Integer.parseInt(currentpage));
		BizDaoImpl bdi=new BizDaoImpl();
		BizServiceImpl bsi=new BizServiceImpl();
		bsi.setBizdao(bdi);//注入	
		int last=bsi.getNewsInfoSize();
		pagep.setLastpage(last);
		List<NewsInfo> list=bsi.getNewsInfoByPage(pagep);
		request.setAttribute("pagep", pagep);
		request.setAttribute("listpage", list);
		request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
		
	%>
</body>
</html>
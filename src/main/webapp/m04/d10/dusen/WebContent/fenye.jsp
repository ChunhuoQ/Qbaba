
<%@page import="m04.d10.dusen.xin.entity.NewsInfo"%>
<%@page import="m04.d10.dusen.xin.entity.Page"%>
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
	<% 	request.setCharacterEncoding("utf-8");
		String currentpage=request.getParameter("currentpage");
		
		BizDaolmpl bd=new BizDaolmpl();
		BizServicerImpl bsi=new BizServicerImpl();
		bsi.setBizdao(bd);//注入服务层
		
		Page page1=new Page();
		page1.setCurrentpage(Integer.parseInt(currentpage));
		List<NewsInfo> list=bsi.getNewsInfoByPage(page1);
		
		int pg=bsi.jishu();
		page1.setLastpage(pg);
		
		
		request.setAttribute("page1", page1);
		request.setAttribute("listt", list);
		
		request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
	%>
</body>
</html>
<%@page import="cn.dt59.entity.NewsInfo"%>
<%@page import="java.util.List"%>
<%@page import="cn.dt59.entity.Page"%>
<%@page import="cn.dt59.service.impl.BizServiceImpl"%>
<%@page import="cn.dt59.dao.impl.BizDaoImpl"%>
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
    	String currentpage= request.getParameter("currentpage");
    	Page page2=new Page();
    	page2.setCurrentpage(Integer.parseInt(currentpage));
    	BizDaoImpl bdi=new BizDaoImpl();
    	BizServiceImpl bsi=new BizServiceImpl();
    	bsi.setBizdao(bdi);//注入
    	
    	int last=bsi.getsum();
    	page2.setLastpage(last);
    	
    	List<NewsInfo> list= bsi.getNewsInfoPageById(page2);
    	request.setAttribute("page2", page2);
    	request.setAttribute("listpage", list);
    	request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
     
		%>
</body>
</html>
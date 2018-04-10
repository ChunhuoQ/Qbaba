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
			String type_id=request.getParameter("type_id");
			String title=request.getParameter("ntitle");
			String author=request.getParameter("nauthor");
			String summary=request.getParameter("nsummary");
			String content=request.getParameter("ncontent");
			/* String id=request.getParameter("nid"); */
			String id=(String)session.getAttribute("nid");
			int flag=bsi.upDataNewsInfoById(Integer.valueOf(type_id),title, author, summary, content, Integer.valueOf(id));
			if(flag>0){
			    response.sendRedirect("result.jsp?uname=jack&upwd=123");
			}else{
			    response.sendRedirect("updata.jsp");
			}
		%>
</body>
</html>
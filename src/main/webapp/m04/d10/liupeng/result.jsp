<%@page import="m04.d10.liupeng.entity.Page"%>
<%@page import="m04.d10.liupeng.entity.NewsInfo"%>
<%@page import="m04.d10.liupeng.service.impl.BizServiceImpl"%>
<%@page import="m04.d10.liupeng.dao.impl.BizDaoImpl"%>
<%@page import="m04.d10.liupeng.entity.UserInfo"%>
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
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		UserInfo user=new UserInfo();
		user.setUsername(uname);
		user.setPassword(upwd);
		BizDaoImpl bdi=new BizDaoImpl();
		bdi.validateUser(user);
		BizServiceImpl bsi=new BizServiceImpl();
		bsi.setBizdao(bdi);
		Page pagep=new Page();
		boolean flag=bsi.validateUser(user);
		if(flag){
		    session.setAttribute("uname", uname);
		    session.removeAttribute("error");
		    session.setMaxInactiveInterval(60*60);
		    //List<NewsInfo> listnews=bsi.getNews();
		    pagep.setCurrentpage(1);
		    List<NewsInfo> listnews=bsi.getNewsInfoByPage(pagep);
		    int last=bsi.getNewsInfoSize();
			pagep.setLastpage(last);
		    request.setAttribute("pagep", pagep);
		    request.setAttribute("listpage",listnews);
		    //转发
		    request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
		}else{
		    session.setAttribute("error", "用户名或密码输入错误");
		    response.sendRedirect("index.jsp");
		}
	%>
</body>
</html>
<%@page import="com.xin.service.impl.BizServicerImpl"%>
<%@page import="com.xin.dao.impl.BizDaolmpl"%>
<%@page import="com.xin.entity.UserInfo"%>
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
	String uname=request.getParameter("uname");//获取用户名
	String pwd=request.getParameter("upwd");//获取密码
	//装箱
	UserInfo user=new UserInfo();
	user.setUsername(uname);
	user.setPassword(pwd);
	
	BizDaolmpl bdi=new BizDaolmpl();
	bdi.denglu(user);
	BizServicerImpl bsi=new BizServicerImpl();
	bsi.setBizdao(bdi);
	
	boolean flag=bsi.denglu(user);
	if(flag){
	    session.setAttribute("uname", uname);
	    request.getRequestDispatcher("admin/admin.jsp").forward(request,response);
	}else{
	    response.sendRedirect("index.jsp");
	}
	


%>
</body>
</html>
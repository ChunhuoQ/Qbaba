
<%@page import="m04.d10.dusen.xin.entity.NewsInfo"%>
<%@page import="m04.d10.dusen.xin.entity.Page"%>
<%@page import="m04.d10.dusen.xin.service.impl.BizServicerImpl"%>
<%@page import="m04.d10.dusen.xin.dao.impl.BizDaolmpl"%>
<%@page import="m04.d10.dusen.xin.entity.UserInfo"%>
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
	
	Page page1=new Page();
	int pg=bsi.jishu();
	page1.setLastpage(pg);
	
	boolean flag=bsi.denglu(user);
	if(flag){
	    
	    session.setAttribute("uname", uname);
	    
	    page1.setCurrentpage(1);
	    List<NewsInfo> listt=bsi.getNewsInfoByPage(page1);
	    request.setAttribute("page1", page1);
	    request.setAttribute("listt", listt);
	    
	    request.getRequestDispatcher("admin/admin.jsp").forward(request,response);
	}else{
	    response.sendRedirect("index.jsp");
	}
	


%>
</body>
</html>
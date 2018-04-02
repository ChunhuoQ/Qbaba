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
	request.setCharacterEncoding("UTF-8");
	String name=request.getParameter("myname");
	String pswd=request.getParameter("pswd");
	String sex=request.getParameter("gender");
	if(sex.equals("man")){
	    sex="小哥哥";
	}else if(sex.equals("girl")){
	    sex="小姐姐";
	}
	out.println("欢迎"+name+sex);%>
	<br>
	<%
	out.print("请开始您的程序之旅！");
	%>
</body>
</html>
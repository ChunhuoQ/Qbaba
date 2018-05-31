<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=basePath %>/reg.html" method="post">
		<p>用户名：<input type="text" name="username" />
		<p>密码：<input type="text" name="password" />
		<p>手机：<input type="text" name="phone" />
		<p>邮箱：<input type="text" name="emil" />
		<p>验证码：<input type="text" name="authcode" />
		<input type="submit" value="提交" />
	</form>
</body>
</html>
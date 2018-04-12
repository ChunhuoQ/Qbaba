<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="Shortcut Icon" href="img/logo.ico" type="image/x-icon">
<style>
*{
margin-left:auto;
text-align:center;
}
.div1{
margin-left:auto;

}
p{
float:right;
line-height:120px;

}
.mydiv{
margin-left:auto;
}
input{
clear:both;
margin-left:auto;
}
</style>
<body>
	<div class="div1"><img src="img/logo.png"/></div>
	<h1>用户注册</h1>
	<br />
	<div class="mydiv">
	<form name="from1" method="post" action="control.jsp">
	<font size="2" color="red">只能输入字母或者数字，4-16个字符</font>
	<br>
	用户名： &nbsp;<input type="text" name="myname">
	<br>
	<font size="2" color="red">密码长度6-12位</font>
	<br>
	密码： &nbsp;  &nbsp;  &nbsp;<input type="password" name="pswd">
	<br>
	<br>
	确认密码：<input type="password">
	<br>
	<br>
	性别：<input type="radio" name="gender" value="man" id="sex1" ><label for="sex1">男</label>
	<input type="radio"  name="gender"value="girl" id="sex1" ><label for="sex1">女</label>
	<br>
	<input type="submit">
	</form>
	</div>
</body>
</html>
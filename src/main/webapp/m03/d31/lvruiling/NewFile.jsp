<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center"><h2 align="center">会员注册中心</h2>
<form action="NewFile1.jsp" method="post">

请输入姓名：<input type="text"name="name"></br>
请选择性别：</br><input type="radio" name="sex" value="男">男</br>
          <input type="radio" name="sex" value="女 b">女</br>
请输入密码：<input type="password" name="pwd"></br>
获取信息的来源:</br>
<input type="checkbox" name="channel" value="报刊">报刊 
<input type="checkbox" name="channel" value="网络">网络 
<input type="checkbox" name="channel" value="朋友推荐">朋友推荐  
<input type="checkbox" name="channel" value="电视">电视
</br><input type="submit" value="提交" name="submit"> 
<input type="reset" value="取消" name="reset">     

</form>
</div>
</body>
</html>
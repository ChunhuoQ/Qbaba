<%@page import="java.nio.channels.Channels"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
request.setCharacterEncoding("utf-8");
String name=request.getParameter("name");
String[] sexs=request.getParameterValues("sex");
String pwd=request.getParameter("pwd");
String [] channels=request.getParameterValues("channel");
%>
</head>
<body>
<div align="center">
<h2 align="center">你输入的注册信息</h2></br>
用户名：<%=name %></br>
性别:<%
 if(sexs!=null){
     for(String sex:sexs){
         out.print(sex+"&nbsp;");
     }
 }
 %></br>
密码:<%=pwd %></br>
获得信息来源:<%
if(channels!=null){
    for(String channel : channels){
        out.print(channel+"&nbsp;");
        
    }
}

%>


</div>
</body>
</html>
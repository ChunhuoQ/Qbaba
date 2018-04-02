<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 	request.setCharacterEncoding("utf-8");
	String name=request.getParameter("name");
	String pwd=request.getParameter("pwd");
	String[] sexs=request.getParameterValues("sex");
	String[] channels=request.getParameterValues("chan");
	
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>注册信息</title>
	</head>

	<body>
		<div align="center">你输入的注册信息
			<table border="0" align="center">
				<tr>
					<td width="80" height="20">用户名：</td>
					<td><%=name%></td>
				</tr>
				<tr>
					<td height="20">密码：</td>
					<td><%=pwd%></td>
				</tr>
				<tr>
				<td height="20">性别：</td>
				<td>
				<%if(sexs!=null){
				    for(String sex:sexs){
				        out.print(sex+"&nbsp;");
				    }
				}
				    %></td>
				
				</tr>
				<tr>
					<td height="20">信息来源：</td>
					<td>
						<%
							if(channels!=null){
								for (String chan :channels ) {
								    out.print(chan+"&nbsp;");
								}
							}
						%>
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
table{
font-size:20px;
margin-left:200px; 
}
</style>
<body>
<h1>修改成功</h1>
<h1>原有数据：</h1>
	<table>
		<tr>
		<td>
		标题：
		</td>
		<td>
		<%=session.getAttribute("title")  %>
		</td>
		</tr>
		<tr>
		<td>
		作者：
		</td>
		<td>
		<%=session.getAttribute("author") %>
		</td>
		</tr>
		<tr>
		<td>
		摘要：
		</td>
		<td>
		<%=session.getAttribute("nsummary") %>
		</td>
		</tr>
		<tr>
		<td>
		内容：
		</td>
		<td>
		<%=session.getAttribute("ncontent") %>
		</td>
		</tr>
		<tr>
		<td>
		图片名：
		</td>
		<td>
		<%=request.getAttribute("filename") %>
		</td>
		</tr>
		<tr>
		<td>
		图片路径：
		</td>
		<td>
		<%=request.getAttribute("path2") %>
		</td>
		<td>
		图片：
		</td>
		<td>
		<!-- /Qbaba/src/main/webapp/m04/d09/Qbaba/resultShow.jsp -->
		<img src='../../../upload/<%=request.getAttribute("filename")%>'/>
		</td>
		</tr>
	</table>
	<font size="7"><a href="result.jsp?uname=admin&upwd=123">回去看看</a></font>
</html>
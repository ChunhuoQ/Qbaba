<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
       标题：<%=request.getAttribute("ntitle") %>
     <br/>
       作者：<%=request.getAttribute("nauthor") %>
     <br/>
	摘要：<%=request.getAttribute("nsummary") %>
	 <br/>
	内容：<%=request.getAttribute("ncontent") %>
	 <br/>
文件名：<%=request.getAttribute("filename") %>
<br/>

  路径：<%=request.getAttribute("path") %>
<br/>
<img src="upload/<%=request.getAttribute("filename") %>"/>

</body>
</html>
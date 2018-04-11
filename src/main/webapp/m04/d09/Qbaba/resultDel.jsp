<%@ page language="java"  import="m04.d09.Qbaba.entity.UserInfoDaoImpl,m04.d09.Qbaba.Dao.impl.NewsDaoImpl,java.util.List,m04.d09.Qbaba.entity.NewsInfo" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	NewsDaoImpl ndi=new NewsDaoImpl();
	request.setCharacterEncoding("utf-8");
	String id=request.getParameter("id");
	int flag=ndi.Deletenews(Integer.valueOf(id));
	if(flag>0){
	    response.sendRedirect("admin/admin.jsp");
	}else{
	    response.sendRedirect("admin/admin.jsp");
	}
	%>
</body>
</html>
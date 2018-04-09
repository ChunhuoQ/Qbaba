<%@ page language="java" contentType="text/html; charset=UTF-8"  import="m04.d03.Qbaba.entity.UserInfoDaoImpl,m04.d03.Qbaba.Dao.impl.NewsDaoImpl,java.util.List,m04.d03.Qbaba.entity.NewsInfo" contentType="text/html; charset=UTF-8"
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
String nTilet=request.getParameter("ntitle");
String Nauthor=request.getParameter("nauthor");

Object idl=session.getAttribute("idl1");

NewsDaoImpl ndi=new NewsDaoImpl();
int flag=ndi.UpdateNews(idl, Nauthor, nTilet);
 if(flag>0){
     response.sendRedirect("result.jsp?uname=admin&upwd=123");
}else{
    response.sendRedirect("news_modify.jsp");
}
  
%>
<%=nTilet %>
<%=Nauthor %>
<%=session.getAttribute("idl1") %>
</body>
</html>
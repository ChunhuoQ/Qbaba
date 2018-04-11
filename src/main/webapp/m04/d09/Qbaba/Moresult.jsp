<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  import="m04.d09.Qbaba.entity.UserInfoDaoImpl,m04.d09.Qbaba.Dao.impl.NewsDaoImpl,java.util.List,m04.d09.Qbaba.entity.NewsInfo" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
SmartUpload su=new SmartUpload();
request.setCharacterEncoding("utf-8");
String nTilet=su.getRequest().getParameter("ntitle");
String Nauthor=su.getRequest().getParameter("nauthor");
String nsummary=su.getRequest().getParameter("nsummary");
String ncontent=su.getRequest().getParameter("ncontent");
Object idl=session.getAttribute("idl1");

NewsDaoImpl ndi=new NewsDaoImpl();
int flag=ndi.UpdateNews(idl, Nauthor, nTilet,nsummary,ncontent);
 if(flag>0){
     response.sendRedirect("resultShow.jsp");
}else{
    response.sendRedirect("resultShow.jsp");
}
  
%>
<%=nTilet %>
<%=Nauthor %>
<%=session.getAttribute("idl1") %>
</body>
</html>
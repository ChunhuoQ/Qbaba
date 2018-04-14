


<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>

<%@page import="java.util.UUID"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
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
su.initialize(super.getServletConfig(), request, response);
String one="jpg,png,txt";
String two="exe,rar,jsp";
File upload;
try{
    su.setAllowedFilesList(one);
    su.setDeniedFilesList(two);
    su.setMaxFileSize(5*1024*1024);//5m
    su.setCharset("utf-8");
    su.upload();
    
   upload= su.getFiles().getFile(0);
    String path="upload\\";
    String filename="";
    if(!upload.isMissing()){
        filename=UUID.randomUUID().toString()+".jpg";
        path+=filename;
       
        upload.saveAs(path,su.SAVE_VIRTUAL);
        
    }
    String ntitle = su.getRequest().getParameter("ntitle");//获取标题
    request.setAttribute("ntitle", ntitle);
    String nauthor = su.getRequest().getParameter("nauthor");//作者
    request.setAttribute("nauthor", nauthor);
    
    String nsummary = su.getRequest().getParameter("nsummary");//摘要
    request.setAttribute("nsummary", nsummary);
    
    String ncontent = su.getRequest().getParameter("ncontent");//内容
    request.setAttribute("ncontent", ncontent);
    request.setAttribute("path", path);
    request.setAttribute("filename", filename);
    request.getRequestDispatcher("show.jsp").forward(request, response);
}catch(Exception e){
    e.printStackTrace();
    
}


%>
</body>
</html>
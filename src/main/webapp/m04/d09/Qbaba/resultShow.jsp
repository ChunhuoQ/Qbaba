<%@page import="m04.d09.Qbaba.Dao.impl.NewsDaoImpl"%>
<%@page import="java.util.UUID"%>
<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
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
su.initialize(super.getServletConfig(),request,response);
String one="jpg,png";
String two="exe,rar,jsp";
File upload;
try{
    //设置允许上传的文件;
    su.setAllowedFilesList(one);
    //设置不允许上传的文件;
    su.setDeniedFilesList(two);
    //设置文件大小
    su.setMaxFileSize(5*1024*1024);//5M;
	
    su.setCharset("utf-8");
    //执行上传
    su.upload();
    upload=su.getFiles().getFile(0);
    String path2="upload/";
   
    String filename="";
    if(!upload.isMissing()){
       /*  filename=upload.getFileName(); */
       filename=UUID.randomUUID().toString()+".jpg";
       path2+=filename;
        upload.saveAs(path2,su.SAVE_AUTO);
    }
    request.setAttribute("path2", path2);
    request.setAttribute("filename", filename);
    
    request.setCharacterEncoding("utf-8");
    String nTilet=su.getRequest().getParameter("ntitle");
    String Nauthor=su.getRequest().getParameter("nauthor");
    String nsummary=su.getRequest().getParameter("nsummary");
    String ncontent=su.getRequest().getParameter("ncontent");
    Object idl=session.getAttribute("idl1");

    NewsDaoImpl ndi=new NewsDaoImpl();
    int flag=ndi.UpdateNews(idl, Nauthor, nTilet,nsummary,ncontent);
    if(flag>0){
    request.getRequestDispatcher("Show.jsp").forward(request, response);
    }
}catch(Exception e){
    out.print(e);
}
%>
</body>
</html>
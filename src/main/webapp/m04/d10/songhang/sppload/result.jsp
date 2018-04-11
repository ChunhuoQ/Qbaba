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
   SmartUpload su=new SmartUpload();//实例化上传对象
    su.initialize(super.getServletConfig(), request, response);
	String one="jpg,png";
	String two="exe,rar,avi,mp4,jsp";
	File upload;
	try{
	   su.setAllowedFilesList(one) ;
	    su.setDeniedFilesList(two);
	    su.setMaxFileSize(5*1024*1024);
	    su.setCharset("utf-8");
	    
	    su.upload();
	    upload=su.getFiles().getFile(0);
	    String pathp="upload\\";
	    String filename="";
	    
	    //思想：用另存为的方式，上传图片
	    if(!upload.isMissing()){
	       //filename=UUID.randomUUID().toString()+".jpg" ;
	       filename=upload.getFileName();
	       pathp+=filename;
	       upload.saveAs(pathp, su.SAVE_VIRTUAL);
	    }
	    
	    String ntitle =su.getRequest().getParameter("ntitle");
	    String nauthor =su.getRequest().getParameter("nauthor");
	    String nsummary =su.getRequest().getParameter("nsummary");
	    String ncontent =su.getRequest().getParameter("ncontent");
	    session.setAttribute("ntitle", ntitle);
	    session.setAttribute("nauthor", nauthor);
	    session.setAttribute("nsummary", nsummary);
	    session.setAttribute("ncontent", ncontent);
	    
	    request.setAttribute("pathp", pathp);
	    request.setAttribute("filename", filename);
	    request.getRequestDispatcher("show.jsp").forward(request, response);
	    
	}catch(Exception e){
	    e.printStackTrace();
	}
  
  %>

</body>
</html>
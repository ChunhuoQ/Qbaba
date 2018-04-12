<%@page import="m04.d10.songhang.service.impl.BizServiceImpl"%>
<%@page import="m04.d10.songhang.dao.impl.BizDaoImpl"%>
<%@page import="m04.d10.songhang.entity.NewsInfo"%>
<%@page import="java.io.PrintWriter"%>

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
    	request.setCharacterEncoding("utf-8");
    	String nid= request.getParameter("nid");
    	String ntid= request.getParameter("ntid");
    	String ntitle= request.getParameter("ntitle");
    	String nauthor= request.getParameter("nauthor");
    	String nsummary= request.getParameter("nsummary");
    	String ncontent= request.getParameter("ncontent");
    	
    	NewsInfo info=new NewsInfo();
    	info.setNewsId(Integer.parseInt(nid));
    	info.setTypeId(Integer.parseInt(ntid));
    	info.setNewsTitle(ntitle);
    	info.setNewsAuthor(nauthor);
    	info.setNewsSummary(nsummary);
    	info.setNewsContent(ncontent);
    	
    	BizDaoImpl bdi=new BizDaoImpl();
    	BizServiceImpl bsi=new BizServiceImpl();
    	bsi.setBizdao(bdi);//注入
    	int flag=bsi.updateNewsInfo(info);
    	if(flag>0){
    		//弹个窗体出来
    		PrintWriter pw= response.getWriter();
    		//通过io流的方式输出
    		pw.write("<script>");
    		pw.write("alert('修改成功！');");
    		pw.write("window.location.href='result.jsp?name=admin&pwd=123';");
    		pw.write("</script>");
    		//response.sendRedirect("result.jsp?name=admin&pwd=123");
    	}else{
    		response.sendRedirect("index.jsp");
    	}
     %>
</body>
</html>
<%@page import="m04.d09.Qbaba.entity.Page"%>
<%@ page language="java" import="m04.d09.Qbaba.entity.UserInfoDaoImpl,m04.d09.Qbaba.Dao.impl.NewsDaoImpl,java.util.List,m04.d09.Qbaba.entity.NewsInfo" contentType="text/html; charset=UTF-8"
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
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		Cookie ck1=new Cookie("uname",uname);
		Cookie ck2=new Cookie("upwd",upwd);
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		Integer count=(Integer)application.getAttribute("count");
		if(count!=null){
		    count=count+1;
		}else{
		    count=1;
		}
		application.setAttribute("count", count);
		UserInfoDaoImpl user= new UserInfoDaoImpl();
		user.setUsername(uname);
		user.setPassword(upwd);
		NewsDaoImpl ndi=new NewsDaoImpl();
		boolean flag=ndi.validateUser(user);
		List<NewsInfo> list = ndi.getAllNewsInfo();
		Page page2=new Page();
		if(flag){
    		session.setAttribute("uname", uname);
    		session.removeAttribute("error");//移除session
    		//session.setMaxInactiveInterval(60*60);//设置时间  以秒为单位
    		//List<NewsInfo> listnews= bsi.getNews();
    		page2.setCurrentpage(1);
    		List<NewsInfo> listnews= ndi.getNewsInfoByPage(page2);
    		request.setAttribute("page2", page2);
    		request.setAttribute("listpage", listnews);
    		//转发
    		request.getRequestDispatcher("admin/admin.jsp").forward(request, response);
		}else{
		    session.setAttribute("error","用户名或密码输入错误");
		    response.sendRedirect("index.jsp");
		}
		
%>
</body>
</html>
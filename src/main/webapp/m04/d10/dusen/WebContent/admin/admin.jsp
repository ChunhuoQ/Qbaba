<%@page import="com.xin.entity.Page"%>
<%@page import="com.xin.entity.NewsInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.xin.service.impl.BizServicerImpl"%>
<%@page import="com.xin.dao.impl.BizDaolmpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加主题--管理后台</title>
<link href="CSS/admin.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function del(id) {
	}
</script>
</head>
<body>
	<div id="header">
		<div id="welcome">欢迎使用新闻管理系统！</div>
		<div id="nav">
			<div id="logo">
				<img src="Images/logo.jpg" alt="新闻中国" />
			</div>
			<div id="a_b01">
				<img src="Images/a_b01.gif" alt="" />
			</div>
		</div>
	</div>
	<div id="admin_bar">
		<div id="status">
			管理员：<span id="sp"><%=session.getAttribute("uname")%></span> 登录
			&#160;&#160;&#160;&#160; <a href="index.html">login out</a>
		</div>
		<div id="channel"></div>
	</div>
	<div id="main">
		<div id="opt_list">
			<ul>
				<li><a href="news_add.html">添加新闻</a></li>
				<li><a href="admin.html">编辑新闻</a></li>
				<li><a href="topic_add.html">添加主题</a></li>
				<li><a href="topic_list.html">编辑主题</a></li>
			</ul>
		</div>
		<div id="opt_area">
			<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
			<script language="javascript">
				/* 	function clickdel() {
						return confirm("删除请点击确认");
					} */

				function del(id) {
					window.location.href = "resultDel.jsp?id=" + id;
				}
			</script>
			<ul class="classlist">
				<%
				    List<NewsInfo> list=(List<NewsInfo>)request.getAttribute("listt");
				    for (int i = 0; i < list.size(); i++) {
				        NewsInfo nf = list.get(i);
				        out.print("<li>" + nf.getNewstitle() + "<span> 作者：" + nf.getNewsauthor()
				                + "&#160;&#160;&#160;&#160; <a href='xiu.jsp?author=" + nf.getNewsauthor() + "&title="
				                + nf.getNewstitle() + "&sid=" + nf.getNewsid() + "'>修改</a>&#160;&#160;&#160;&#160; "
				                + "<a href='javascript:;' onclick='del(" + nf.getNewsid() + ")'>删除</a></span></li>");
				    }
				    /* a href='admin/news_modify.jsp' */
				%>
				<% 
				Page pg=(Page)request.getAttribute("page1");
				    
				%>
				<p align="right">
					<a href="fenye.jsp?currentpage=1">首页</a> 
					<a href="fenye.jsp?currentpage=
					<%if(pg.getCurrentpage()-1<=1){
					    out.print(1); }
					else{
					    out.print(pg.getLastpage()-1);
					}
					%>">上一页</a>
					<a href="fenye.jsp?currentpage=<% if(pg.getCurrentpage()+1<=pg.getLastpage()){
					     out.print(pg.getCurrentpage()+1);
					    }else{
					        out.print(pg.getLastpage());
					    }
					    
					    %>">下一页</a>
  					<a href="fenye.jsp?currentpage=<%=pg.getLastpage() %>">末页</a>
				</p>
			</ul>
		</div>
	</div>
	<div id="site_link">
		<a href="#">关于我们</a><span>|</span> <a href="#">Aboue Us</a><span>|</span>
		<a href="#">联系我们</a><span>|</span> <a href="#">广告服务</a><span>|</span>
		<a href="#">供稿服务</a><span>|</span> <a href="#">法律声明</a><span>|</span>
		<a href="#">招聘信息</a><span>|</span> <a href="#">网站地图</a><span>|</span>
		<a href="#">留言反馈</a>
	</div>
	<div id="footer">
		<p class="">
			24小时客户服务热线：010-68988888 &#160;&#160;&#160;&#160; <a href="#">常见问题解答</a>
			&#160;&#160;&#160;&#160; 新闻热线：010-627488888<br />
			文明办网文明上网举报电话：010-627488888 &#160;&#160;&#160;&#160; 举报邮箱：<a href="#">jubao@jb-aptech.com.cn</a>
		</p>
		<p class="copyright">
			Copyright &copy; 1999-2009 News China gov, All Right Reserver<br />
			新闻中国 版权所有
		</p>
	</div>
</body>
</html>
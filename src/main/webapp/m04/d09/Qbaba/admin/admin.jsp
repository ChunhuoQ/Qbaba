<%@page import="m04.d09.Qbaba.entity.Page"%>
<%@ page language="java" import="m04.d09.Qbaba.entity.UserInfoDaoImpl,m04.d09.Qbaba.Dao.impl.NewsDaoImpl,java.util.List,m04.d09.Qbaba.entity.NewsInfo" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加主题--管理后台</title>
<link href="CSS/admin.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="header">
  <div id="welcome">欢迎使用新闻管理系统！</div>
  <div id="nav">
    <div id="logo"><img src="Images/logo.jpg" alt="新闻中国" /></div>
    <div id="a_b01"><img src="Images/a_b01.gif" alt="" /></div>
  </div>
</div>
<div id="admin_bar">
  <div id="status">管理员：<span id="sp"><%=session.getAttribute("uname")%></span> 登录  &#160;&#160;&#160;&#160; <a href="../index.html">login out</a>
   
    <%
    Integer i=(Integer)application.getAttribute("count");
    %>
  <span>尊敬的<%=session.getAttribute("uname")%>,您是第<span id="sp"><%=i %><c:out value="1"/></span>位访问本网站的用户！</span>
  
   
  </div>
  <div id="channel"> </div>
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
	function clickdel(){
		return confirm("删除请点击确认");
	}
	
	function del(id){
		//alert("del:"+id);
		window.location.href="resultDel.jsp?id="+id; 
		
	}
/* 	function clickUpdate(idl){
 window.location.href="Mresult.jsp?idl="+idl;
		
	} */
</script>
    <ul class="classlist">
    	<%
    	Page pg=(Page)request.getAttribute("page2");
    	NewsDaoImpl ndi=new NewsDaoImpl();
    	List<NewsInfo> list=ndi.getNewsInfoByPage(pg);
    	
    	for(int o=0;o<list.size();o++){
   			out.print("<li>"+list.get(o).getNews_title()+"<span>作者:"+
   			list.get(o).getNews_author()+"&#160;&#160;&#160;&#160; <a href='Mresult.jsp?idl="+list.get(o).getNews_id()+"&author="+list.get(o).getNews_author()+"&title="+list.get(o).getNews_title()+"&nsummary="+list.get(o).getNews_summary()+"&ncontent="+list.get(o).getNews_content()+"' onclick=''>修改</a> &#160;&#160;&#160;&#160; "+
   			"<a href='javascript:;' onclick='del("+list.get(o).getNews_id()+");'>删除</a> </span></li>");}%>
       <li class='space'></li>
     <!-- <li> 国内成品油价格上调几成定局 <span> 作者：
        news                                              
        &#160;&#160;&#160;&#160; <a href='news_modify.html'>修改</a> &#160;&#160;&#160;&#160; <a href='#' onclick='return clickdel()'>删除</a> </span> </li>
      <li> 俄数百所幼儿园和学校因流感停课 <span> 作者：
        news                                              
        &#160;&#160;&#160;&#160; <a href='news_modify.html'>修改</a> &#160;&#160;&#160;&#160; <a href='#' onclick='return clickdel()'>删除</a> </span> </li>
      <li> 喀布尔市中心传出爆炸和枪声 目前原因不明 <span> 作者：
        out                                               
        &#160;&#160;&#160;&#160; <a href='news_modify.html'>修改</a> &#160;&#160;&#160;&#160; <a href='#' onclick='return clickdel()'>删除</a> </span> </li>
      <li> 国台办介绍大陆高校加大对台招生力度情况 <span> 作者：
        news                                              
        &#160;&#160;&#160;&#160; <a href='news_modify.html'>修改</a> &#160;&#160;&#160;&#160; <a href='#' onclick='return clickdel()'>删除</a> </span> </li>
      <li> 国台办将授权福建等六省市部分赴台管理审批权 <span> 作者：
        news                                              
        &#160;&#160;&#160;&#160; <a href='news_modify.html'>修改</a> &#160;&#160;&#160;&#160; <a href='#' onclick='return clickdel()'>删除</a> </span> </li>
      --> 
     <%--  <%
    		for(int o=0;o<list.size();o++){
   			out.print("<li>"+list.get(o).getNews_title()+"<span>作者:"+
   			list.get(o).getNews_author()+"&#160;&#160;&#160;&#160; <a href='Mresult.jsp?idl="+list.get(o).getNews_id()+"&author="+list.get(o).getNews_author()+"&title="+list.get(o).getNews_title()+"&nsummary"+list.get(o).getNews_summary()+"&ncontent"+list.get(o).getNews_content()+"' onclick=''>修改</a> &#160;&#160;&#160;&#160; "+
   			"<a href='javascript:;' onclick='del("+list.get(o).getNews_id()+");'>删除</a> </span></li>");}%> --%>
      <c:if test="${pg.getCurrentpage()==1}">
      <!-- 算了不这样搞 三目简单粗暴 -->
      <li class='space'></li>
   
      <p align="right">
      <a href="spage.jsp?currentpage=1">首页</a> &nbsp; &nbsp;
      <a href="spage.jsp?currentpage=<%=pg.getCurrentpage()==1?pg.getCurrentpage():pg.getCurrentpage()-1%>">上一页</a> 
      <a href="spage.jsp?currentpage=<%=pg.getCurrentpage()==pg.getLastpage()?pg.getCurrentpage():pg.getCurrentpage()+1%>">下一页</a>  &nbsp; &nbsp;
      <a href="spage.jsp?currentpage=<%=pg.getLastpage() %>">末页</a> </p>
	</c:if>   
 </ul>
  </div>
</div>
<div id="site_link"> <a href="#">关于我们</a><span>|</span> <a href="#">Aboue Us</a><span>|</span> <a href="#">联系我们</a><span>|</span> <a href="#">广告服务</a><span>|</span> <a href="#">供稿服务</a><span>|</span> <a href="#">法律声明</a><span>|</span> <a href="#">招聘信息</a><span>|</span> <a href="#">网站地图</a><span>|</span> <a href="#">留言反馈</a> </div>
<div id="footer">
  <p class="">24小时客户服务热线：010-68988888  &#160;&#160;&#160;&#160; <a href="#">常见问题解答</a> &#160;&#160;&#160;&#160;  新闻热线：010-627488888<br />
    文明办网文明上网举报电话：010-627488888  &#160;&#160;&#160;&#160;  举报邮箱：<a href="#">jubao@jb-aptech.com.cn</a></p>
  <p class="copyright">Copyright &copy; 1999-2009 News China gov, All Right Reserver<br />
    新闻中国   版权所有</p>
</div>

</body>
</html>
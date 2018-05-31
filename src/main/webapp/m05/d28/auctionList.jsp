<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 5.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理员页面</title>
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<link href="css/easyui.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function goToPage(pageIndex){
		document.forms[0].action=document.forms[0].action+"?pageIndex="+pageIndex;
		document.forms[0].submit();
	}
</script>
<script type="text/javascript">
	function myformatter(date) {

		var y = date.getFullYear();

		var m = date.getMonth() + 1;

		var d = date.getDate();

		return y + '-' + (m < 10 ? ('0' + m) : m) + '-'

		+ (d < 10 ? ('0' + d) : d);

	}

	function myparser(s) {

		if (!s)

			return new Date();

		var ss = (s.split('-'));

		var y = parseInt(ss[0], 10);

		var m = parseInt(ss[1], 10);

		var d = parseInt(ss[2], 10);

		if (!isNaN(y) && !isNaN(m) && !isNaN(d)) {

			return new Date(y, m - 1, d);

		} else {

			return new Date();

		}

	}
</script>
</head>

<body>
<form method="post" action="/Qbaba/auctionList.shtml">
<div class="wrap">
<!-- main begin-->
  <div class="sale">
    <h1 class="lf">在线拍卖系统</h1>
  	<c:if test="$">
    	<div class="logout right"><a href="doLogout" title="注销">注销</a></div>
    </c:if>
    <c:if test="$">
    	<div class="logout right"><a href="login.jsp" title="登录">登录</a></div>
    </c:if>
  </div>
   
  <div class="forms">
    <label for="name">名称</label>
    <input name="auctionname" type="text" class="nwinput" id="name"/>
    <label for="names">描述</label>
    <input name="auctiondesc" type="text" id="names" class="nwinput"/>
    <label for="time">开始时间</label>
    <input class="easyui-datebox" name="auctionstarttime" id="begindate"
	data-options="formatter:myformatter,parser:myparser"></input>
  	<label for="end-time">结束时间</label>
    <input class="easyui-datebox" name="auctionendtime" id="enddate"
	data-options="formatter:myformatter,parser:myparser"></input> 
	<label for="price">起拍价</label>
    <input name="auctionstartprice" type="text" id="price" class="nwinput" />
    <input type="submit"  value="查询" class="spbg buttombg f14  sale-buttom"/>

    	<input type="button" onclick="location='addAuction.jsp'"  value="发布" class="spbg buttombg f14  sale-buttom buttomb"/>
  
    <br/>
  
      &nbsp;&nbsp;&nbsp;&nbsp;<a href="auctionResult"><b>查看竞拍结果</b></a>

  </div>
  <div class="items">
      <ul class="rows even strong">
        <li>名称</li>
        <li class="list-wd">描述</li>
        <li>开始时间</li>
        <li>结束时间</li>
        <li>起拍价</li>
        <li class="borderno">操作</li>
      </ul>
      <c:forEach items="${listau}" var="a">
      <ul class="rows">
        <li>${a.auctionname}</li>
        <li class="list-wd">${a.auctiondesc}</li>
        <li>${a.auctionstarttime}</li>
        <li>${a.auctionendtime}</li>
        <li>${a.auctionstartprice}</li>
        	<li class="borderno red">
           <a href="/Qbaba/auctionRevise.shtml?auctionid=${a.auctionid }" title="竞拍">修改</a>|
          <a href="#" title="竞拍" onclick="abc();">删除</a>
        </li>
      </ul>
      </c:forEach>
      <div class="page">
      </div>
  </div>
<!-- main end-->
</div>
</form>
</body>
</html>

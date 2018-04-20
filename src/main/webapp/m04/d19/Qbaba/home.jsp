<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link href="css/bootstrap-combined.min.css" rel="stylesheet">
<link href="css/layoutit.css" rel="stylesheet">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
		<script src="js/html5shiv.js"></script>
	<![endif]-->

	<!-- Fav and touch icons -->
	<link rel="shortcut icon" href="img/favicon.png">
	
	<script type="text/javascript" src="js/jquery-2.0.0.min.js"></script>
	<!--[if lt IE 9]>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<![endif]-->
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui.js"></script>
	<script type="text/javascript" src="js/jquery.ui.touch-punch.min.js"></script>
<script type="text/javascript" src="js/jquery.htmlClean.js"></script>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="ckeditor/config.js"></script>
<script type="text/javascript" src="js/scripts.js"></script>
</head>
<style>
.span4:nth-of-type(4){
margin-left:0px;
}
.span4:nth-of-type(7){
margin-left:0px;
}
h3{
text-align:center;
position:relative;
top:20px;
}
</style>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<div class="row-fluid">
				<div class="span6">
					<div class="page-header">
						<h1>
							QShopping <small>全球购物平台</small>
						</h1>
					</div>
				</div>
				<c:if test="${userName==null }">
				<div class="span6">
					<form class="form-horizontal" action="../../../S_login">
						<div class="control-group">
							
							 <label class="control-label"  for="inputEmail">用户名</label>
							<div class="controls">
								<input name="userName" id="inputEmail" type="text" />
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="inputPassword">密码</label>
							<div class="controls">
								<input name="password"  id="inputPassword" type="password" />
							</div>
						</div>
						<div class="control-group">
							<div class="controls">
								 <label class="checkbox"><input type="checkbox" /> Remember me</label> 
								 <button class="btn" type="submit">登陆</button>
							</div>
						</div>
					</form>
				</div>
				</c:if>
				<c:if test="${not empty userName}">
				<div class="span6">
				<h3>用户：${userName }</h3>
				</div>
				</c:if>
			</div>
			
			<ul class="thumbnails">
			<c:if test="${not empty listSp }">
				<c:forEach items="${listSp }" var="sp" >
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="img/${sp.spimg }" />
						<div class="caption">
							<h3>
								${sp.spname }
							</h3>
							<p>
								${sp.spdesc}
							</p>
							<p>
								
								￥：${sp.spprice }
							</p>
							
							<p>
								<a class="btn btn-primary" href="../../../buy?spid=${sp.spid }">加入购物车</a> 
							</p>
						</div>
					</div>
				</li>
				</c:forEach>
				</c:if>
			</ul>
			
			<div class="pagination">
				<ul>
					<li>
						<a href="#">上一页</a>
					</li>
					<li>
						<a href="#">1</a>
					</li>
					<li>
						<a href="#">2</a>
					</li>
					<li>
						<a href="#">3</a>
					</li>
					<li>
						<a href="#">4</a>
					</li>
					<li>
						<a href="#">5</a>
					</li>
					<li>
						<a href="#">下一页</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
</body>
</html>
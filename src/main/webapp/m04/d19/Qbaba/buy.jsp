<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
<script type="text/javascript">
$(function (){
	$("#add").click(function (){
		
		var n=$("#add span").html();
		n++;
		$("#add span").html(n);
	})
	
})
</script>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<blockquote class="pull-left">
				
					<h1>Qbaba’s Shopping</h1>
					<h3>用户：${userName }！</h3>
					<h2>这是您的你专属的购物车</h2>
			</blockquote>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>
							宝贝编号
						</th>
						<th>
							宝贝名称
						</th>
						<th>
							宝贝数量
						</th>
						<th>
							宝贝价格
						</th>
						<th>
							宝贝描述
						</th>
						<th>
							小计
						</th>
						<th>
							购买
						</th>
					</tr>
				</thead>
				<tbody>
				
				<c:if test="${not empty map }">
				
				<c:forEach items="${map}" var="mp" >
					<tr class="${mp.value.spcss }">
						<td>
							${mp.value.spid }
						</td>
						<td>
							${mp.value.spname }
						</td>
						<td>
							<input type="button" value="+" id="add">
							<input type="text" value="${mp.value.num }"/></span>
							<input type="button" value="-" id="delete">
						</td>
						<td>
							￥：${mp.value.spprice }
						</td>
						<td>
							${mp.value.spdesc }
						</td>
						<td>
						￥：${mp.value.num * mp.value.spprice}
						</td>
						<td>
						<a>购买</a>
						</td>
						
					</tr>
					</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>
	</div>
</div>
</body>
</html>
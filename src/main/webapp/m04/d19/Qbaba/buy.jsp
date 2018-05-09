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
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
</head>

<style>
.add_s{
position:relative;
top:-5px;
}
.delete_s{
position:relative;
top:-5px;
}
#td1{
text-align:center;
}
.txt{
width:40px;
text-align:center;
}
</style>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<blockquote class="pull-left">
				
					<h1>Qbaba’s Shopping</h1>
					<h3>用户：${userName }！</h3>
					<h2>这是你的专属的购物车</h2>
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
						<td id="td1">
							<input type="button" value="+" class="add_s">
							<input type="text" readonly="true" class="txt"   value="${mp.value.num }"/>
							<input type="button" value="-" class="delete_s">
						</td>
						<td>
							￥：<span class="price">${mp.value.spprice }</span>
						</td>
						<td>
							${mp.value.spdesc }
						</td>
						<td>
						￥：<span  class='lastprice'><%-- ${mp.value.num * mp.value.spprice} --%></span>
						</td>
						
						
					</tr>
					</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>
	</div>
</div>
<iframe src="../../d23/Qbaba/shoppingBuy.jsp" width="100%" marginheight="0" scrolling="no" frameborder="0" height="672px"></iframe>
<script type="text/javascript">
function sumprice(){
	$(".txt").each(function(index,domEle){
		
		var number=parseInt($(domEle).val());
		
		var price=parseFloat($(".price:eq("+index+")").text());
		
		var sum=number*price;
		$(".lastprice:eq("+index+")").text(sum);
		
	});
}
$(function(){
	sumprice()
 $(".add_s").click(function (even){
	 
		 var n=parseInt($(even.target).next().val())+1;
		 $(even.target).next().val(n);
		 sumprice();
		
		
	}) 
	 $(".delete_s").click(function (even){
		
		 var n=parseInt($(even.target).prev().val());
		 if(n>1){
			 n--;
		 }else{
			 alert("这是最小值奥");
		 }
		 
			 $(even.target).prev().val(n);
			sumprice();
	})  
})
</script>

</body>
</html>
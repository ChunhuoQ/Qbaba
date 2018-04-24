<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="js/jquery-1.8.3.js" type="text/javascript"></script>
<script src="js/json2.js" type="text/javascript"></script>
<link href="css/bootstrap-combined.min.css" rel="stylesheet">
<link href="css/layoutit.css" rel="stylesheet">
<script>
	$(function() {
		$("#pro").change(function() {
			var uname = $(this).val();
			
			 $.ajax({
				url:"../../../City",
				type:"POST",
				data:{"Province":uname},
				dataType:"json",
				success:function(date){
				$("#city option").remove();//移除子节点
					for(var i=0;i<date.length;i++){
						var option="<option>"+date[i].namecn+"</option>";
						$("#city").append(option);
				}
			}
			}) 
			/* xmlhttp = new XMLHttpRequest();
			var url = "../../../City";
			xmlhttp.open("POST", url, true);
			xmlhttp.send(JSON.stringify(pr));
			var i = xmlhttp.responseText;
			alert(i); */

		})
	})
</script>

<link href="css/jiesuan.css" rel="stylesheet">

<body>
	<div class="container-fluid">
		<div class="row-fluid">

				<div class="row-fluid">
					<div class="span4"></div>
						<div id="address">
						<h4>我的收货地址</h4>
							<div class="address-fk" id="jisong">
							
								<br>
								寄送至：
								<br>
								<br>
								省份： <select id="pro" name="porvince">
									<option>请选择省份</option>
									<c:if test="${not  empty listp}">
										<c:forEach items="${listp}" var="lp">
											<option>${lp.namecn}</option>
										</c:forEach>
									</c:if>
								</select> 
							
								<br>
								城市：<select id="city">
									<option>请先选择省份</option>
								</select>
								<br>
								街道：<input type="text"/>
								<br>
								收货人：
								<br>
								<br>
								姓名：<input type="text"/>
								<br>
								电话：<input type="text"/>
								<br>
							</div>
							<br>
							<br>
							<center><input type="submit"/></center>
						</div>
					
				</div>
			</div>
		</div>
	



</body>
</html>
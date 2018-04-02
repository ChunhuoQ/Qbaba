<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>学员注册</title>
    </head>
    <body>
    	<div align="center">请输入注册信息
		<form name="forml" method="post" action="reginfo.jsp">
			<table border="0" align="center">
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td height="19">密码：</td>
					<td height="19"><input type="password" name="pwd"/></td>
				</tr>
				<tr>
					<td >性别：</td>
					<td >	<input type="radio" name="sex" value="🚹"/>🚹
							<input type="radio" name="sex" value="🚺"/>🚺
							<input type="radio" name="sex" value="👽"/>👽
					</td>
				</tr>
				<tr>
					<td>信息来源：</td>
					<td><input type="checkbox" name="chan" value="报刊"/>报刊
						<input type="checkbox" name="chan" value="网络"/>网络
						<input type="checkbox" name="chan" value="朋友推荐"/>朋友推荐
						<input type="checkbox" name="chan" value="电视"/>电视
					</td>
				</tr>
				<!--以下是提交，取消按钮-->
				<tr>
					<td colspan="2" align="center">
						<input type="submit" name="sub" value="提交" />
						<input type="reset" name="ret" value="取消" />
					</td>
				</tr>
			</table>
		</form>
		</div>
 	</body>
</html>
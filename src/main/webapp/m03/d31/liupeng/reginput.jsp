<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>学员注册</title>
    </head>
    <body>
    	<div align="center">请输入注册信息
    		<form action="reginfo.jsp" method="post" name="forml">
    			<table border="0" align="center">
    				<tr>
    					<td>用户名：</td>
    					<td><input type="text" name="name" /></td>
    				</tr>
    				<tr>
    					<td>密码：</td>
    					<td><input type="password" name="pwd" /></td>
    				</tr>
    				<tr>
    					<td>信息来源：</td>
    					<td>
    						<input type="checkbox" name="channel" value="报刊" />报刊
    						<input type="checkbox" name="channel" value="网络" />网络
    						<input type="checkbox" name="channel" value="朋友推荐" />朋友推荐
    						<input type="checkbox" name="channel" value="电视" />电视
    					</td>
    				</tr>
    				<tr>
    					<td colspan="2" align="center">
    						<input type="submit" name="Submit" value="提交"/>
    						<input type="reset" name="Reset" value="取消"/>
    					</td>
    				</tr>
    			</table>
    			
    		</form>
    	</div>
 	</body>
</html>
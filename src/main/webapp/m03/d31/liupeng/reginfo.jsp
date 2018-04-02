<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name=request.getParameter("name");
	String pwd=request.getParameter("pwd");
	String[] channels=request.getParameterValues("channel");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>提交信息</title>
    </head>
    <body>
    	<div align="center">你输入的注册信息
    			<table border="0" cellspacing="" cellpadding="" align="center">
    				<tr>
    					<td>用户名：</td>
    					<td><%=name %></td>
    				</tr>
    				<tr>
    					<td>密码：</td>
    					<td><%=pwd %></td>
    				</tr>
    				<tr>
    					<td>信息来源：</td>
    					<td>
    						<%
    						if(channels!=null){
    						    for(String cha:channels){
    						        out.print(cha+" ");
    						    }
    						}
    						%>
    					</td>
    				</tr>
    				<tr>
    					<td colspan="2" align="center">
    					</td>
    				</tr>
    			</table>
    	</div>
 	</body>
</html>
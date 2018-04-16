<%@ page language="java" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
    String path = request.getContextPath();
			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";
%>

<html>
<head>
<style type="text/css">
.upload-awrp {
	overflow: hidden;
	margin: 120px 0;
}

table {
	margin: 0px auto;
	padding: 0px;
}

.code {
	font-family: Arial;
	font-style: italic;
	font-size: 12px;
	border: 0;
	padding: 2px 3px;
	letter-spacing: 3px;
	font-weight: bolder;
	float: left;
	cursor: pointer;
	width: 80px;
	height: 24px;
	line-height: 24px;
	text-align: center;
	vertical-align: middle;
	border: 1px solid #6D6D72;
}

.c1 {
	width: 200px;
	height: 30px;
}

.c2 {
	width: 110px;
	height: 30px;
	padding: 0px;
}

.c3 {
	
}
</style>
<script src="../jquery-1.8.3.js"></script>
<script type="text/javascript">
	/**
	 * 验证码
	 * @param {Object} o 验证码长度
	 */
	$.fn.code_Obj = function(o) {

		var _this = $(this);
		var options = {
			code_l : o.codeLength,//验证码长度
			codeChars : [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'a', 'b', 'c', 'd',
					'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
					'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B',
					'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
					'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' ],
			codeColors : [ '#f44336', '#009688', '#cddc39', '#03a9f4',
					'#9c27b0', '#5e4444', '#9ebf9f', '#ffc8c4', '#2b4754',
					'#b4ced9', '#835f53', '#aa677e' ],
			code_Init : function() {
				var code = "";
				var codeColor = "";
				var checkCode = _this.find("#data_code");
				for (var i = 0; i < this.code_l; i++) {
					var charNum = Math.floor(Math.random() * 52);
					code += this.codeChars[charNum];
				}
				for (var i = 0; i < this.codeColors.length; i++) {
					var charNum = Math.floor(Math.random() * 12);
					codeColor = this.codeColors[charNum];
				}
				console.log(code);

				if (checkCode) {
					checkCode.css('color', codeColor);
					checkCode.className = "code";
					checkCode.text(code);
					checkCode.attr('data-value', code);
				}
				/* 	var cod=document.getElementById("cc").value=code;
					alert(cod); */
				var ok = false;
				$("#cc").blur(function() {
					var cc = $("#cc");
					var ccc=cc.val().toUpperCase();
					if (cc.val() == "") {
						$("#d1").html("验证码不能为空");
						ok = false;
						
					}
					else{
						if(ccc!=code.toUpperCase()){
							ok = false;
						}else{
							$("#d1").html("	");
							ok=true;
						}
					}
				});
				$("#cca").click(function() {
					if (ok) {
						$("#d1").html("	");
						$("form").submit();
					} else {
						$("#d1").html("验证码错误");
						return false;
					}
				});
				/**              **/
			}

		};

		options.code_Init();//初始化验证码
		this.find("#data_code").bind('click', function() {
			options.code_Init();
		});

	};
</script>


<link href="css/right.css" rel="stylesheet" type="text/css" />
</head>
<BODY leftMargin=0 topMargin=0 marginheight="0" marginwidth="0">
	<form action="<%=path%>/uservlet" method="post" target="_parent">
		<table width="399" border="0" align="center" cellpadding="0"
			cellspacing="0" bordercolor="#EBEBEB">
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr align="left">
				<td height="35" colspan="3" bgcolor="#EAF0FB" class="p16">
					<div align="center">
						<span class="d6"><strong>管 理 员 登 录 </strong> </span>
					</div>
				</td>
			</tr>
			<tr>
				<td width="141" height="45" align="center" bgcolor="#EBEBEB"
					class="d5">您的帐号：</td>
				<td width="258" colspan="2" align="left" bgcolor="#EBEBEB"><input
					name="userName" type="text" class="c1" /></td>
			</tr>
			<tr>

			</tr>
			<tr>
				<td height="45" align="center" bgcolor="#EBEBEB" class="d5">您的密码：</td>
				<td align="left" colspan="2" bordercolor="#EBEBEB" bgcolor="#EBEBEB">
					<input name="password" type="password" size="21" class="c1" />
				</td>

			</tr>
			<tr>
				<td height="45" align="center" bgcolor="#EBEBEB" class="d5">验证码：</td>
				<td height="45" align="left" bgcolor="#EBEBEB" width="110px"><input
					type="text" class="c2" id="cc" value=""></td>
				<td id="check-code" style="overflow: hidden;" height="45"
					align="left" bgcolor="#EBEBEB" class="d5 c3">
					<div class="code" id="data_code"></div>
				</td>

			</tr>
			<tr>
				<td height="35" colspan="3" align="center" bgcolor="#EAF0FB"
					class="p16" id="d1"></td>
			</tr>
			<tr align="left">
				<td height="35" colspan="3" align="right" bgcolor="#EAF0FB"
					class="p16">
					<div align="right">
						<span class="d6"><strong>&nbsp;</strong> </span>
					</div>
				</td>
			</tr>
			<tr>
				<td height="60" colspan="3" valign="bottom">
					<div align="center">
						<input name="submit" type="submit" class="d6" value="登  录"
							id="cca" /> &nbsp;&nbsp;&nbsp;&nbsp; <input name="reset"
							type="reset" class="d6" value="重  置" />
					</div>
				</td>


			</tr>
			<tr>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		/** * 验证码 * codeLength:验证码长度 */
		$('#check-code').code_Obj({
			codeLength : 5
		});
	</script>

</BODY>
</HTML>



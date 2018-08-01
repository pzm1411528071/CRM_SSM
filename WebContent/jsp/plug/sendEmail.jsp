<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发件箱</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/customer/sendEmail" method="post">
	<table>
	    <tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					主题：
				</div>
			</td>
			<td colspan="6" bgcolor="#FFFFFF">
				<input type="text" style=" width: 500px"  maxlength="100" name="emailTitle"
					value="">
				&nbsp;
			</td>
		</tr>
		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					内容：
				</div>
			</td>
			<td colspan="6" bgcolor="#FFFFFF">
				<textarea rows="10" name="emailContent" id="emailContent"
					style="width: 100%; resize: none;">
				
				</textarea>
			</td>
		</tr>
		<tr>
			<td colspan="7" bgcolor="#FFFFFF">
				<span style="color: red">${info }</span>
			</td>
		</tr>
	</table>
	<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
		align=center border=0>
		<tr bgcolor="#ECF3FD">
			<td width="36%"></td>
			<td width="17%"><input type="submit" name="submit"  value="发送"></td>
			<td width="4%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
			<td width="43%"></td>
		</tr>
	</table>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分配角色</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/adminDistributeRole2" method="post" >
	<table cellSpacing="1" cellPadding="0" width="100%"
		align="center" border="0">
		<tr align="center">
			<td>
				<select name="userId">
					<c:forEach items="${us }" var="u">
						<option value="${u.userId }">
						${u.userName }
						</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>&nbsp;&nbsp;</td>
		</tr>
        <tr align="center">
			<td>
				<c:forEach items="${rs }" var="r">
					${r.roleName }<input type="checkbox" name="roleIds" value="${r.roleId }"/>
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td>&nbsp;&nbsp;</td>
		</tr>
	</table>
	<table cellSpacing="1" cellPadding="0" width="100%"
		align="center" border="0">
		<tr>
		    <td width="41%"></td>
			<td><input type="submit" name="submit"  value="提交"></td>
			<td><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
			<td width="29%"></td>
		</tr>
	</table>
</form>
</body>
</html>
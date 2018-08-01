<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<base href="${pageContext.request.contextPath }/">

		<title>修改员工信息</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<LINK href="${pageContext.request.contextPath }/resource/css/admin.css" type=text/css
			rel=stylesheet>
			<script type="text/javascript"
			src="${pageContext.request.contextPath }/resource/js/CheckForm.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath }/resource/js/My97DatePicker/WdatePicker.js"></script>
			

	</head>

	<body>
		<form>
			
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr class=editHeaderTr>
					<td class=editHeaderTd colSpan=7>
						用户的详细信息
						<input type="hidden" name="id" value="1"readonly="readonly">
					</td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0"><div align="center">姓名：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userName }</td>
					<td bgcolor="#FFFDF0"><div align="center">年龄：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userAge }</td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0" style="height: 21px"><div align="center">性别：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" style="height: 21px" align="center">${u.userSex }</td>
					<td bgcolor="#FFFDF0"><div align="center">民族：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userNation }</td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0"><div align="center">学历：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center"> ${u.userDiploma }</td>
					<td bgcolor="#FFFDF0"><div align="center">婚姻：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.isMarried }</td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0"><div align="center">部门：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">
						<c:choose>
					  		<c:when test="${u.departmentId==1 }">财务部</c:when>
					  		<c:when test="${u.departmentId==2 }">人事部</c:when>
					  		<c:when test="${u.departmentId==3 }">销售部</c:when>
						</c:choose>
					</td>
					<td bgcolor="#FFFDF0"><div align="center">角色：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">
						<c:choose>
					  		<c:when test="${u.roleId==1 }">管理员</c:when>
					  		<c:when test="${u.roleId==2 }">员工</c:when>
					  		<c:when test="${u.roleId==3 }">老板</c:when>
					  		<c:when test="${u.roleId==4 }">部门经理</c:when>
						</c:choose>
					</td>
	
				<tr>
					<td bgcolor="#FFFDF0"><div align="center">座机：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userTel }</td>
					<td bgcolor="#FFFDF0"><div align="center">爱好：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userIntest }</td>
				</tr>
			
				<tr>
					<td bgcolor="#FFFDF0"><div align="center">工资卡号：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userBankcard }</td>
					<td bgcolor="#FFFDF0"><div align="center">手机：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userMobile }</td>

				</tr>

				<tr>
					<td bgcolor="#FFFDF0"><div align="center">身份证：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userIdnum }</td>
					<td bgcolor="#FFFDF0"><div align="center">添加时间：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userAddtime }</td>
				</tr>
				<tr>
					<td bgcolor="#FFFDF0"><div align="center">添加人：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userAddman }</td>
					<td bgcolor="#FFFDF0"><div align="center">修改人：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userChangeman }</td>
				</tr>

				<tr>

					<td bgcolor="#FFFDF0"><div align="center">E_mail：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userEmail }</td>
					<td bgcolor="#FFFDF0"><div align="center">修改时间：</div></td>
					<td colspan="3" bgcolor="#FFFFFF" align="center">${u.userChangetime }</td>
				</tr>
				
				<tr>
					<td bgcolor="#FFFDF0"><div align="center">地址：</div></td>
					<td colspan="5" bgcolor="#FFFFFF" align="center">${u.userAddress }</td>
				</tr>

			</table>
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr bgcolor="#ECF3FD">
					<td width="36%"></td>
					
					<td width="4%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
					<td width="43%"></td>
				</tr>
			</table>

		</form>

	</body>
</html>
>
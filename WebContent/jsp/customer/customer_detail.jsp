<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>客户详情信息</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<LINK href="${pageContext.request.contextPath }/resource/css/admin.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/CheckForm.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<form action="${pageContext.request.contextPath }/customer/customerUpdate1"
		method="post" name="form2" onSubmit="return checkForm('form2');">
		<input type="hidden" id="customerId" name="customerId" value="${c.customerId }" />
		
		<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
			align=center border=0>
			<tr class=editHeaderTr>
				<td class=editHeaderTd colSpan=7>客户详细信息<input type="hidden" name="customerId"value="3" /></td>
			</tr>
			<tr>
				<td width="12%" bgcolor="#FFFDF0"><div align="center">负责员工：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${user.userName }</td>
			  <td width="14%" bgcolor="#FFFDF0"  ><div align="center">客户来源：</div></td>
				<td width="41%" colspan="3"   align="center" bgcolor="#FFFFFF">${source.sourceName }</td>
			</tr>
			<tr>
				<td bgcolor="#FFFDF0"><div align="center">客户姓名：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${c.customerName }</td>
				<td bgcolor="#FFFDF0"><div align="center">客户状态：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${condition.conditionName }</td>
			</tr>
			<tr>
				<td bgcolor="#FFFDF0"><div align="center">客户性别：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${c.customerSex }</td>
				<td bgcolor="#FFFDF0"><div align="center">客户类型：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${type.typeName }</td>
			</tr>

			<tr>
				<td bgcolor="#FFFDF0"><div align="center">出生日期：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"   align="center">${c.birthDay }</td>
				<td bgcolor="#FFFDF0"><div align="center">客户手机：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${c.customerMobile }</td>
			</tr>
			
			<tr>
				<td bgcolor="#FFFDF0"><div align="center">客户QQ：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${c.customerQq }</td>
				<td bgcolor="#FFFDF0"><div align="center">客户地址：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${c.customerAddress }</td>
			</tr>

			<tr>
				<td bgcolor="#FFFDF0"><div align="center">客户邮箱：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"   align="center">${c.customerEmail }</td>
				<td bgcolor="#FFFDF0"><div align="center">客户职位：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${c.customerJob }</td>
			</tr>

			<tr>
				<td bgcolor="#FFFDF0"><div align="center">客户微博：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"   align="center">${c.customerBlog }</td>
				<td bgcolor="#FFFDF0"><div align="center">客户座机：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${c.customerTel }</td>
			</tr>

			<tr>
				<td bgcolor="#FFFDF0"><div align="center">客户MSN：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"   align="center">${c.customerMsn }</td>
				<td bgcolor="#FFFDF0"><div align="center">客户公司：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"  align="center">${c.customerCompany }</td>
			</tr>
			<tr>
				<td bgcolor="#FFFDF0"><div align="center">创建人：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"   align="center">${c.customerAddman }</td>
				<td bgcolor="#FFFDF0"><div align="center">修改人：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"   align="center">${c.changeMan }</td>
			</tr>
			<tr>
				<td bgcolor="#FFFDF0"><div align="center">创建时间：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"   align="center">${c.customerAddtime }</td>
				<td bgcolor="#FFFDF0"><div align="center">修改时间：</div></td>
				<td colspan="3" bgcolor="#FFFFFF"   align="center">${c.customerChangtime }</td>
			</tr>
			<tr>
				<td bgcolor="#FFFDF0"><div align="center">备注：</div></td>
				<td colspan="6" bgcolor="#FFFFFF"   align="center">			${c.customerRemark }
	        </td>
			</tr>
		</table>
		<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
			align=center border=0>
			<tr bgcolor="#ECF3FD">
				<td width="36%"></td>
				<td width="17%"><input type="submit" name="submit"  value="编辑"></td>
				<td width="4%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
				<td width="43%"></td>
			</tr>
		</table>
	</form>
</body>
</html>
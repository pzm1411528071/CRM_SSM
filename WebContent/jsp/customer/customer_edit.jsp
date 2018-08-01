<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>修改客户信息</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${pageContext.request.contextPath }/resource/css/admin.css" type="text/css" rel="stylesheet">
<script src="${pageContext.request.contextPath }/resource/js/CheckForm.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/resource/js/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/resource/js/FormValid.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/kindeditor/kindeditor.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/resource/js/jquery-1.9.1.js" type="text/javascript" ></script>
<script type="text/javascript">
	KE.show({
	id:'customerRemark',
	items:['source', '|', 'fullscreen', 'undo', 'redo', 'print', 'cut', 'copy', 'paste',
			'plainpaste', 'wordpaste', '|', 'justifyleft', 'justifycenter', 'justifyright',
			'justifyfull', 'insertorderedlist', 'insertunorderedlist', 'indent', 'outdent', 'subscript',
			'superscript', '|', 'selectall', '-',
			'title', 'fontname', 'fontsize', '|', 'textcolor', 'bgcolor', 'bold',
			'italic', 'underline', 'strikethrough', 'removeformat', '|', 'image',
			'flash', 'media', 'advtable', 'hr', 'emoticons', 'link', 'unlink', '|', 'about'],
	width:'80%'
	});
</script>
</head>
<body>
<form action="${pageContext.request.contextPath }/customer/customerUpdate2" method="post" name="form2" onsubmit="return validator(this)" >
	<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
		align=center border=0>
		<tr class=editHeaderTr>
			<td class=editHeaderTd colSpan=7>
				请修改客户信息
				<input type="hidden" name="customerId"
					value="${c.customerId }" />
			</td>
		</tr>
		
		<tr>
			<td width="12%" bgcolor="#FFFDF0"><div align="center">负责员工：</div></td>
			<td colspan="3" bgcolor="#FFFFFF">
				<select  name="userId" style=" width: 145px">
					<!-- userInfo -->
					<c:forEach items="${userList }" var="user">
						<option  <c:if test="${user.userId==c.ui.userId }">selected</c:if>  value="${user.userId }" >${user.userName }</option>
					</c:forEach>	
					
				</select>		
			</td>
			<td width="12%" bgcolor="#FFFDF0">
				<div align="center">
					客户来源：
				</div>
			</td>
			<td width="37%" colspan="3" bgcolor="#FFFFFF">
				<select name="sourceId" style="width: 145px">
				    <!-- CustomerSource -->
				    <c:forEach items="${sourceList }" var="source">
						<option  <c:if test="${source.sourceId==c.cs.sourceId }">selected</c:if>  value="${source.sourceId }" >${source.sourceName }</option>
					</c:forEach>
					
				</select>
			</td>
		</tr>
		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户姓名：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px" readonly="readonly"   name="customerName"
					value="${c.customerName }">
			</td>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户状态：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<select name="conditionId" style="width: 145px">
					<!-- CustomerCondition -->
					<c:forEach items="${conditionList }" var="condition">
						<option  <c:if test="${condition.conditionId==c.cc.conditionId }">selected</c:if>  value="${condition.conditionId }" >${condition.conditionName }</option>
					</c:forEach>
					
				</select>
			</td>
		</tr>
		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户性别：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="radio" name="customerSex" value="男" checked="checked"  />
				男&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="radio" name="customerSex" value="女" />
				女
				<br />
			</td>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户类型：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<select name="typeId" style="width: 145px">
					<!-- CustomerType -->
					<c:forEach items="${typeList }" var="type">
						<option  <c:if test="${type.typeId==c.ct.typeId }">selected</c:if>  value="${type.typeId }" >${type.typeName }</option>
					</c:forEach>
					
				</select>
			</td>
		</tr>
		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					出生日期：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text"style=" width: 145px"  disabled="disabled" name="birthDay"
					value="${c.birthDay }"
					readonly="readonly" id="birthDay"
					onclick="WdatePicker({el:birthDay,dateFmt:'yyyy-MM-dd HH:mm:ss '})">
				&nbsp;
			</td>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户手机：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px"    valid="regexp"  regexp="^1[3|4|5|8][0-9]\d{8}$"   errmsg="请输入正确的手机号码!"   name="customerMobile"
					value="${c.customerMobile }">
				&nbsp;
			</td>
		</tr>

		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户QQ：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px"   valid="isQQ"   errmsg="请输入正确的QQ号码!"  name="customerQq"
					value="${c.customerQq }">
				&nbsp;
			</td>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户地址：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px"  maxlength="50" name="customerAddress"
					value="${c.customerAddress }">
				&nbsp;
			</td>
		</tr>

		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户邮箱：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px"  maxlength="50" name="customerEmail"  
				valid="required|isEmail"  errmsg="Email不能为空|Email格式不对!" value="${c.customerEmail }">
				&nbsp;
			</td>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户职位：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px"  maxlength="50" name="customerJob"
					value="${c.customerJob }">
				&nbsp;
			</td>
		</tr>

		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户微博：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px" maxlength="50"  name="customerBlog"
					value="${c.customerBlog }">
				&nbsp;
			</td>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户座机：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px" valid="isPhone"   errmsg="请输入正确的座机号码!" name="customerTel"
					value="${c.customerTel }">
				&nbsp;
			</td>
		</tr>

		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户MSN：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px" maxlength="50"  name="customerMsn"
					value="${c.customerMsn }">
				&nbsp;
			</td>
			<td bgcolor="#FFFDF0">
				<div align="center">
					客户公司：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px"  maxlength="50" name="customerCompany"
					value="${c.customerCompany }">
				&nbsp;
			</td>
		</tr>
		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					创建人：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px" disabled="disabled" name="customerAddman"
					value="${c.customerAddman }">
				<input type="hidden" name="customerChangtime" id="customerChangtime" 
				    value='<fmt:formatDate value="${c.customerChangtime }" pattern="yyyy-MM-dd HH:mm:ss"/>'
					onclick="WdatePicker({el:customerAddtime,dateFmt:'yyyy-MM-dd HH:mm:ss '})">
				<input type="hidden" name="customerAddtime" id="customerAddtime"
				    value='<fmt:formatDate value="${c.customerAddtime }" pattern="yyyy-MM-dd HH:mm:ss"/>'
					onclick="WdatePicker({el:customerAddtime,dateFmt:'yyyy-MM-dd HH:mm:ss '})">
			</td>
			<td bgcolor="#FFFDF0">
				<div align="center">
					修改人：
				</div>
			</td>
			<td colspan="3" bgcolor="#FFFFFF">
				<input type="text" style=" width: 145px"  maxlength="50" name="changeMan"
					value="${c.changeMan }">
				&nbsp;
			</td>
		</tr>
		<tr>
			<td bgcolor="#FFFDF0">
				<div align="center">
					备注：
				</div>
			</td>
			<td colspan="6" bgcolor="#FFFFFF">
				<textarea rows="10" name="customerRemark" id="customerRemark"
					style="width: 100%; resize: none;">
				${c.customerRemark }
				</textarea>
			</td>
		</tr>
	</table>
	<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
		align=center border=0>
		<tr bgcolor="#ECF3FD">
			<td width="36%"></td>
			<td width="17%"><input type="submit" name="submit"  value="提交"></td>
			<td width="4%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
			<td width="43%"></td>
		</tr>
	</table>
</form>
</body>
</html>

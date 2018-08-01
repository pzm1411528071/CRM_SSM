<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>客户关怀添加</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<LINK href="${pageContext.request.contextPath }/resource/css/admin.css" type="text/css" rel="stylesheet">
<script src="${pageContext.request.contextPath }/resource/js/CheckForm.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/resource/js/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/resource/js/FormValid.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/kindeditor/kindeditor.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/resource/js/jquery-1.9.1.js" type="text/javascript" ></script>
<script type="text/javascript">
	KE.show({
	id:'careRemark',
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
<style type="text/css">
	.auto-style1 {
		margin-left: 0px;
	}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath }/customer/customerCareAdd2"
		method="post" name="form1" onsubmit="return checkForm('form1');">
		<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
			align=center border=0>
			<tr class=editHeaderTr>
				<td class=editHeaderTd colSpan=7 style="height: 49px">
					请输入详细信息
				</td>
			</tr>
			<tr>
				<td width="21%" bgcolor="#FFFDF0" style="width: 9%">
					<div align="center">
						关怀主题：
					</div>
				</td>
				<td colspan="3" bgcolor="#FFFFFF">
					<input type="text" style="width: 145px"  maxlength="20" name="careTheme" check_str="关怀主题" />
					&nbsp;
				</td>
				<td bgcolor="#FFFDF0" style="width: 13%">
					<div align="center">
						关怀对象：
					</div>
				</td>
				<td colspan="3" bgcolor="#FFFFFF">
					<select name="customerId" style="width: 145px">
						<!-- CustomerInfo -->
						<c:forEach items="${cList }" var="c">
							<option  value="${c.customerId }" >${c.customerName }</option>
						</c:forEach>
					
					</select>
					<input type="hidden" value="2018-07-20 10:53:49" name="careTime">
				</td>
			</tr>
			<tr>
				
				<td bgcolor="#FFFDF0" style="width: 13%">
					<div align="center">
						下次关怀时间：
					</div>
				</td>
				<td colspan="3"  bgcolor="#FFFFFF">
					<input type="text"  style="width: 145px" name="careNexttime" check_str="下次关怀时间"
						readonly="readonly" id="careNexttime"
						onclick="WdatePicker({el:careNexttime,dateFmt:'yyyy-MM-dd HH:mm:ss '})">
					&nbsp;
				</td>
				
				<td bgcolor="#FFFDF0" style="width: 13%">
					<div align="center">
						关怀方式：
					</div>
				</td>
				<td colspan="3" bgcolor="#FFFFFF">
					<select name="careWay" style="width: 145px">
						<option value="发短信">
							发短信
						</option>
						<option value="送礼品">
							送礼品
						</option>
						<option value="电话问候">
							电话问候
						</option>
						<option value="上门拜访">
							上门拜访
						</option>
						<option value="其他">
							其他
						</option>
					</select>
					&nbsp;
				</td>
			</tr>

			<tr>
				<td bgcolor="#FFFDF0" style="width: 13%">
					<div align="center">
						是谁关怀的：
					</div>
				</td>
				<td colspan="5" bgcolor="#FFFFFF">
					<input type="text"  style="width: 145px"  maxlength="20" name="carePeople">
					&nbsp;
				</td>
				
			</tr>

			<tr>
				<td bgcolor="#FFFDF0" style="width: 13%">
					<div align="center">
						关怀备注：
					</div>
				</td>
				<td colspan="5" bgcolor="#FFFFFF">
					<textarea name="careRemark" rows="10" id="careRemark"
						style="width: 100%; resize: none;"></textarea>
				</td>
			</tr>
		</table>
		<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
			align=center border=0>
			<tr bgcolor="#ECF3FD">
				<td width="40%"></td>
				<td width="10%"><input type="submit" name="submit"  value="提交"></td>
				<td width="5%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
				<td width="40%"></td>
			</tr>
		</table>

	</form>
</body>
</html>
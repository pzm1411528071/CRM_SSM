<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
<!-- 		<base href="http://localhost:8087/CRM_SSM/"> -->

		<title>添加员工信息</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<LINK href="${pageContext.request.contextPath }/resource/css/admin.css" type=text/css
			rel=stylesheet>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/CheckForm.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-1.9.1.js"></script>
	
	
	</head>

	<body>
		<form name="form1" action="${pageContext.request.contextPath }/user/addnotice2"  method="post">
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr class=editHeaderTr>
					<td class=editHeaderTd colSpan=7>
						请输入新房屋的详细信息
					</td>
				</tr>
					<td bgcolor="#FFFDF0" style="height: 21px">
						<div align="center">
							公告人：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF" style="height: 21px">
						<select name="userId" style="width: 145px">
						<c:forEach items="${ul }" var="u"> 
							<option value="${u.userId }">
								${u.userName }
							</option>
						 </c:forEach>	 
						</select>
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							公告主题：   
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" style="width: 145px"  name="noticeItem" >
						&nbsp;
					</td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							公告内容：   
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" style="width: 145px"  name="noticeContent" >
						&nbsp;
					</td>
					
					<td bgcolor="#FFFDF0">
						<div align="center">
							公告时间：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" style="width: 300px"  name="noticeTime"  id="noticeTime"
						onclick="WdatePicker({el:noticeTime,dateFmt:'yyyy-MM-dd HH:mm:ss '})">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFDF0"><div align="center">公告截止时间：</div></td>
					<td colspan="5" bgcolor="#FFFFFF" align="left">
						<input type="text" style="width: 300px"     name="noticeEndtime" id="noticeEndtime"
						onclick="WdatePicker({el:noticeEndtime,dateFmt:'yyyy-MM-dd HH:mm:ss '})">
					</td>
				</tr>
			</table>
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr bgcolor="#ECF3FD">
					<td width="25%"></td>
					<td width="17%"><input type="submit"  value="添加"></td>
					<td width="17%"><input type="reset" name="reset"  value="重置"></td>
					<td width="4%"><input type="button" name="button2"  onClick="history.back() "  value="返回"></td>
					<td width="43%"></td>
				</tr>
				<tr><td><input type="hidden" name="isUsed" value="1"></td></tr>
			</table>

		</form>
	</body>
</html>
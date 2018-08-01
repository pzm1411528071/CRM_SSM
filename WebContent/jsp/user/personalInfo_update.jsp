<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<script language="JavaScript" type="text/javascript" src="${pageContext.request.contextPath }/resource/js/FormValid.js"></script>
		<script type="text/javascript">
		  function promot() {//提示修改成功		
			  var i=${i};
			  if(i==1){
				  alert("修改成功！");
				  return false;
			  }	
		  }
		</script>
		<script type="text/javascript">
		  function sureupdate() {
			confirm("确定修改吗");
		}
		</script>
	</head>

	<body onload="promot()">

		<form action="${pageContext.request.contextPath }/user/updatePersonalInformation" method="post" name="form2" onsubmit="return validator(this)" 
>
			
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr class=editHeaderTr>
					<td class=editHeaderTd colSpan=7>
						请修改用户的详细信息
						<input type="hidden" name="userId" value="${userInfo.userId }"
							readonly="readonly">
					</td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							姓名：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" style="width: 145px" name="userName" disabled="disabled" value="${userInfo.userName }"
							readonly="readonly">
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							年龄：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text"  style="width: 145px" name="userAge" maxlength="2"  valid="required|isNumber"  errmsg="员工年龄不能为空!|请输入正确的年龄!" value="${userInfo.userAge }">
						&nbsp;
					</td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0" style="height: 21px">
						<div align="center">
							性别：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF" style="height: 21px">
						<input type="radio" name="userSex"
							 <c:if test="${userInfo.userSex=='男'}">checked</c:if>
							 value="男" />
						男
						<input type="radio" name="userSex"
							<c:if test="${userInfo.userSex=='女'}">checked</c:if>
							 value="女" />
						女
						<br />
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							民族：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text"  style="width: 145px" name="userNation"
							value="${userInfo.userNation }">
						&nbsp;
					</td>
				</tr>

				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							学历：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<select name="userDiploma" style="width: 145px">
							<option <c:if test="${userInfo.userDiploma=='初中' }">selected</c:if> >
								初中
							</option>
							
							<option <c:if test="${userInfo.userDiploma=='高中' }">selected</c:if>>
								高中
							</option>
							<option <c:if test="${userInfo.userDiploma=='本科' }">selected</c:if>>
								本科
							</option>
							<option <c:if test="${userInfo.userDiploma=='博士' }">selected</c:if> >
								博士
							</option>
							<option <c:if test="${userInfo.userDiploma=='硕士' }">selected</c:if> >
								硕士
							</option>
						</select>
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							婚姻：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<select name="isMarried" style="width: 145px">
							<option value="已婚" <c:if test="${userInfo.isMarried=='已婚' }">selected</c:if> >							
								已婚
							</option>
							<option value="未婚" <c:if test="${userInfo.isMarried=='未婚' }">selected</c:if> >
								未婚
							</option>
							<option value="离异" <c:if test="${userInfo.isMarried=='离异' }">selected</c:if> >
								离异
							</option>
						</select>
						&nbsp;
					</td>
				</tr>


				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							部门：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<select name="departmentId" style="width: 145px">
							<c:forEach items="${deptinfo }" var="deptinfo" >
							<option value="${deptinfo.departmentId}" <c:if test="${deptinfo.departmentId==userInfo.departmentId}">selected</c:if>
								>${deptinfo.departmentName}</option>	
						    </c:forEach>
						</select>
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							角色：
						</div>
					</td>

					<td colspan="3" bgcolor="#FFFFFF">
						<select name="roleId"  disabled="disabled" style="width: 145px">
						<c:forEach items="${userrole }" var="ur">
						<option value="${ur.roleId }" <c:if test="${ur.roleId==userInfo.roleId }">selected</c:if>
								 >${ur.roleName }</option>
							
						
						</c:forEach>
	
						</select>
					</td>

	
				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							座机：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text"  style="width: 145px"     valid="isPhone"   errmsg="请输入正确的座机号码!" name="userTel" value="${userInfo.userTel }">
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							爱好：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text"  style="width: 145px"  maxlength="50"  name="userIntest"
							value="${userInfo.userIntest }">
						&nbsp;
					</td>
				</tr>
			
				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							工资卡号：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" style="width: 145px"  valid="isNumber"   errmsg="请输入正确的工资卡号!"  maxlength="20"   name="userBankcard"
							value="${userInfo.userBankcard }">
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							手机：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text"  style="width: 145px" valid="regexp"  regexp="^1[3|4|5|8][0-9]\d{8}$"   errmsg="请输入正确的手机号码!" name="userMobile"
							value="${userInfo.userMobile }">
						&nbsp;
					</td>

				</tr>

				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							身份证：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text"  style="width: 145px"  valid="isIdCard"   errmsg="请输入正确的身份证号码!" name="userIdnum" value="${userInfo.userIdnum }">
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							添加时间：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text"  style="width: 145px" name="userAddtime"
							disabled="disabled"  value=<fmt:formatDate value="${userInfo.userAddtime}" pattern="yyyy-MM-dd HH:mm:ss"/> >
					</td>
				</tr>
				<tr>
					<td bgcolor="#FFFDF0">
						<div align="center">
							添加人：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text"  style="width: 145px"  maxlength="10" name="userAddman"
							disabled="disabled" value="${userInfo.userAddman }">
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							修改人：
						</div>
					
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" name="userChangeman"
							style="width: 145px"    maxlength="20" value="${user.userName }">
						&nbsp;
					</td>
				</tr>

				<tr>

					<td bgcolor="#FFFDF0">
						<div align="center">
							E_mail：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" style="width: 145px"  maxlength="50" name="userEmail" value="${userInfo.userEmail }">
						&nbsp;
					</td>
					<td bgcolor="#FFFDF0">
						<div align="center">
							地址：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<input type="text" style="width: 145px"  maxlength="50"  name="userAddress"
							value="${userInfo.userAddress }">
						&nbsp;
					</td>
				</tr>

			</table>
			<table class=editTable cellSpacing=1 cellPadding=0 width="100%"
				align=center border=0>
				<tr bgcolor="#ECF3FD">
					<td width="36%"></td>
					<td width="17%"><input type="submit" name="submit"  value="修改" onclick="sureupdate()"></td>
					<td width="4%"><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
					<td width="43%"></td>
				</tr>
			</table>

		</form>

	</body>
</html>

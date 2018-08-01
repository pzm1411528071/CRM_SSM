<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>修改角色</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<LINK href="${pageContext.request.contextPath }/resource/css/admin.css" type=text/css	rel=stylesheet>
 <script type="text/javascript"
			src="${pageContext.request.contextPath }/resource/js/CheckForm.js"></script>
<script type="text/javascript"
			src="${pageContext.request.contextPath }/resource/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
   function update() {
	confirm("确定修改吗？");
}
</script>		
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath }/admin/updateUserRole" method="post"name="form2" onsubmit="return checkForm('form2');">
<table class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
<tr class=editHeaderTr>
<td class=editHeaderTd colSpan=7>  请修改角色的详细信息
</td>
</tr>  
  <tr>
    <td width="19%" bgcolor="#FFFDF0"><div align="center">角色名称：</div></td>
    <td colspan="3" bgcolor="#FFFFFF"><input type="text"  maxlength="20"  check_str="角色名称" style="width: 138px" name="roleName" value="${userrole.roleName}">
      &nbsp;</td>
    </tr>
  <tr>
    
      
      <td bgcolor="#FFFDF0">
						<div align="center">
							角色等级：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<select name="rolePower" style="width: 138px">
							<option  value="1" <c:if test="${userrole.rolePower==1}"></c:if>>	
	    						一星	
							</option>
							<option  value="2" <c:if test="${userrole.rolePower==2}"></c:if>>
								二星
							</option>
							<option  value="3" <c:if test="${userrole.rolePower==3}"></c:if>>
								三星
							</option>
					        <option  value="4" <c:if test="${userrole.rolePower==4}"></c:if>>
								四星
							</option>
						</select>
						&nbsp;
					</td>
    </tr>
  <tr>   
      <td bgcolor="#FFFDF0">
						<div align="center">
							角色状态：
						</div>
					</td>
					<td colspan="3" bgcolor="#FFFFFF">
						<select name="isUsed" style="width: 138px">
							<option  value="1" <c:if test="${userrole.isUsed==1}"></c:if>>					
							    已使用
							</option>
							<option  value="0" <c:if test="${userrole.isUsed==2}"></c:if>>
								未使用
							</option>
						</select>
						&nbsp;
					</td>
    </tr>
    <tr><td><input type="hidden" name="roleId" value="${userrole.roleId }"></td></tr>
</table>
<table class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
    <tr bgcolor="#ECF3FD">
	    <td width="30%" align="center"><input type="submit" name="Submit" value="修改"  onclick="update()" ></td>
	    <td width="40%"></td>
    </tr>

</table>   
</form>
</body>
</html>

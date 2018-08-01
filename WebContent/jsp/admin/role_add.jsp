<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 <!--    <base href="http://localhost:8087/CRM_SSM/"> -->
    
    <title>添加角色</title>
    
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
	function query(){  
			window.location="${pageContext.request.contextPath }/admin/RoleList";
		}

</script>
<script type="text/javascript">
    function del() {
		confirm("确定删除该角色吗？");
	}
</script>
<script type="text/javascript">
   function promot() {//提示添加成功		
	 var i=${i};
	  if(i==1){
		  alert("操作成功!");
		  return false;
	  }	
  }
</script>
  </head>
  
  <body onload="promot()">
    <form action="${pageContext.request.contextPath }/admin/addUserRole" method="post"name="form2" onsubmit="return checkForm('form2');">
<table class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
<tr class=editHeaderTr>
<td class=editHeaderTd colSpan=7>  请输入新角色的详细信息
</td>
</tr>  
  <tr>
    <td width="19%" bgcolor="#FFFDF0"><div align="center">角色名称：</div></td>
    <td colspan="3" bgcolor="#FFFFFF"><input type="text"  maxlength="20"  check_str="角色名称" style="width: 138px" name="roleName" >
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
							<option  value="1">
								一星
							</option>
							<option  value="2">
								二星
							</option>
							<option  value="3">
								三星
							</option>
					        <option  value="4">
								四星
							</option>
						</select>
						&nbsp;
					</td>
    </tr>
    <tr><td><input type="hidden" name="isUsed" value="1"></td></tr>
</table>
<table class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
    <tr bgcolor="#ECF3FD">
	    <td width="25%" align="center"><input type="submit" name="Submit" value="提交"  ></td>
	    <td width="25%"><input type="button" value="查看已有角色"    onclick="query()" ></td>
	    <td width="25%"></td>
	    <td width="25%"></td>
    </tr>
    <c:if test="${userrole!=null&&userrole.size()!=0 }">  
      <tr>
	      <td width="10" height="22" background="${pageContext.request.contextPath }/resource/images/bg2.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">角色名称</span></div></td>
	      <td width="10" height="22" background="${pageContext.request.contextPath }/resource/images/bg2.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">角色等级</span></div></td>
	      <td width="10" height="22" background="${pageContext.request.contextPath }/resource/images/bg2.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">角色状态</span></div></td>
	      <td width="10" height="22" background="${pageContext.request.contextPath }/resource/images/bg2.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">基本操作</span></div></td>
	  </tr>	          
     <c:forEach items="${userrole}" var="ur">
	  <tr>
		  <td height="20" background="${pageContext.request.contextPath }/resource/images/bg2.gif" bgcolor="#FFFFFF"style="width: 3%">
		     <div align="center"><span class="STYLE1" >${ur.roleName }</span>
		     </div>
		  </td>
		  <td height="20" background="${pageContext.request.contextPath }/resource/images/bg2.gif" bgcolor="#FFFFFF"style="width: 3%">
		     <div align="center"><span class="STYLE1">${ur.rolePower }</span>
		     </div>
		  </td>
		  <td height="20" background="${pageContext.request.contextPath }/resource/images/bg2.gif" bgcolor="#FFFFFF"style="width: 3%">
		     <div align="center"><span class="STYLE1"><c:if test="${ur.isUsed==1 }">已使用</c:if>
		                                              <c:if test="${ur.isUsed==0 }">未使用</c:if></span>
		     </div>
		  </td>
		  <td height="20" background="${pageContext.request.contextPath }/resource/images/bg2.gif" bgcolor="#FFFFFF"style="width: 3%">
		     <div align="center"><span class="STYLE1"><a href="${pageContext.request.contextPath }/admin/getUserRole?roleId=${ur.roleId}"  >修改</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                                              <a href="${pageContext.request.contextPath }/admin/deleteUserRole?roleId=${ur.roleId}" onclick="del()">删除</a></span>
		     </div>
		  </td>
	  </tr>	          	
     </c:forEach>     
   </c:if>    
</table>   
</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分配权限</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/ztree/css/demo.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/ztree/js/jquery.ztree.core.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/ztree/js/jquery.ztree.excheck.js"></script>
<script type="text/javascript">
	$(function(){
		//页面加载发送ajax请求后台处理器方法,返回json对象初始化树
		$.ajax({
			url:"${pageContext.request.contextPath }/admin/getTreeNodes",
			type:"post",
			dataType:"json",
			success:function(nodes){
			    //alert(JSON.stringify(nodes));返回json的字符串格式
				initTree(nodes);//从后台请求来数据后初始化
			}
		});
	});
	var setting = {
		check: {
			enable: true
		},
		data: {
			simpleData: {
				enable: true
			}
		}
	};
	function initTree(nodes){
		$.fn.zTree.init($("#treeDemo"), setting, nodes);//初始化树
	}
	function changeRole(){
		var roleId=$("#roleId").val();
		$.ajax({
			url:"${pageContext.request.contextPath }/admin/getPermissionByRoleID?roleId="+roleId,
			type:"get",
			dataType:"json",//预期服务器返回的数据类型
			success:function(ps){
				var ids=[];//后台查询的权限id集合
				for(var i=0;i<ps.length;i++){
					ids.push(ps[i].pId);
				}
				//拿树对象,遍历每一个节点
				var treeObj = $.fn.zTree.getZTreeObj("treeDemo");//获得树对象
				var nodes=treeObj.getNodes();//获得树对象上的节点
				//循环遍历出的顶级节点
				for(var i=0;i<nodes.length;i++){
					//alert(JSON.stringify(nodes[i]));查看顶级节点属性获得孩子节点
					var childrenNodes=nodes[i].children;
					//遍历每一个顶级节点的子节点
					for(var j=0;j<childrenNodes.length;j++){
						childId=childrenNodes[j].id;//节点的id就是权限的id
						if($.inArray(childId,ids)!=-1){//表示节点的id在权限id数组中
							childrenNodes[j].checked=true;//节点被选中
						}else{
							childrenNodes[j].checked=false;
						}
					}
				}
				$.fn.zTree.init($("#treeDemo"), setting, nodes);//再次初始化树
			}
		});
	}
	//设置表单中要提交的所有权限id
	function setCheckedPids(){
		var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
		var nodes = treeObj.getCheckedNodes(true);
		var ids=[];
		for(var i=0;i<nodes.length;i++){
			ids.push(nodes[i].id);
		}
		//alert(ids.join());数组的字符串形式
		$("#pIds").val(ids);
	}
	function tijiao(){
		setCheckedPids();
		$("form")[0].submit();
	}
</script>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/adminDistributePermission2" method="post" >
	<table cellSpacing="1" cellPadding="0" width="100%"
		align="center" border="0">
		<tr align="center">
			<td>
				<select name="roleId" onchange="changeRole()" id="roleId">
				    <option value="0">
						--请选择--
					</option>
					<c:forEach items="${rs }" var="r">
						<option value="${r.roleId }">
						${r.roleName }
						</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>&nbsp;&nbsp;
			    <input type="hidden" name="pIds" id="pIds">
			</td>
		</tr>
		 <tr align="center">
			<td>
				<div class="content_wrap">
					<div class="zTreeDemoBackground center">
						<ul id="treeDemo" class="ztree"></ul>
					</div>
				</div>
			</td>
		</tr>
		<tr>
			<td>&nbsp;&nbsp;</td>
		</tr> 
	</table>
	<table cellSpacing="1" cellPadding="0" width="100%"
		align="center" border="0">
		<tr>
		    <td width="42%"></td>
			<td><input type="button"  value="提交" onclick="tijiao()"></td>
			<td><input type="button" name="button"  onClick="history.back() "  value="返回"></td>
			<td width="35%"></td>
		</tr>
	</table>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<base href="${pageContext.request.contextPath }/">

		<title>My JSP 'house_query.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-1.9.1.js"></script>
		<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

.STYLE1 {
	font-size: 12px
}

.STYLE3 {
	font-size: 12px;
	font-weight: bold;
}

	a{
	text-decoration: none;
	color: #033d61;
	font-size: 12px;
}

A:hover {
	COLOR: #f60; TEXT-DECORATION: underline
}


.STYLE4 {
	color: #03515d;
	font-size: 12px;
}
-->
</style>

		<script>
var  highlightcolor='#c1ebff';
//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}


	
</script>
<script type="text/javascript">
	function add(){
		//只提交到doGet方法
		window.location = "${pageContext.request.contextPath }/user/addhouse1";
	}
	function query1(val) {
		var frm=$("form")[0];
		var t=${pb.totalPageCount };
		if(val.value==""){
			alert("请输入页数")
		};
		if(val.value>t){
			alert("不存在当前页数");
		}
		else{
			frm.action="${pageContext.request.contextPath }/user/houselist";
			frm.submit();
		}
	}

	function query2(nowPage) {
		var frm=$("form")[0];
		frm.action="${pageContext.request.contextPath }/user/houselist";
		$("#currentPage").val(nowPage);
		frm.submit();
	}
	function del(houseId){
		if(confirm("确认删除？")){
			window.location.href="delhouse?houseId=" + houseId;
		}
	}
</script>

	</head>

	<body>
		<form name="form1" action="${pageContext.request.contextPath }/user/houselist" method="post">
		<input type="hidden" id="currentPage" name="currentPage" value="1">
		
		
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="30"
						background="${pageContext.request.contextPath }/resource/images/tab_05.gif">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="12" height="30">
									<img src="${pageContext.request.contextPath }/resource/images/tab_03.gif" width="12"
										height="30" />
								</td>
								<td>
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td class="STYLE4" align="center">
												&nbsp;&nbsp;请输入查询信息：
												<input type="text" name="queryContent" value="${queryContent }" style="width: 290px" />
											</td>
											<td class="STYLE4">
												&nbsp;&nbsp;请选择查询方式：
												<select name="queryType" style="width: 100px">
													<option value="1" <c:if test="${queryType==1 }">selected</c:if> >
														房屋类型
													</option>
													<option value="2" <c:if test="${queryType==2 }">selected</c:if>>
														房屋地址
													</option>
												</select>
											</td>
											<td class="STYLE4">
												&nbsp;&nbsp;
												<input type="submit" value="查询" style="width: 50px" />
												<input   type="hidden"   name="userId"   value="1"  />
											</td>
											<td class="STYLE4">
												&nbsp;&nbsp;
												<input type="button" value="添加" onclick="add()"
													style="width: 50px" />
											</td>
										</tr>
									</table>
								</td>
								<td width="16">
									<img src="${pageContext.request.contextPath }/resource/images/tab_07.gif" width="16"
										height="30" />
								</td>
							</tr>
						</table>
					</td>
				</tr>


				<tr>
					<td>
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="8"
									background="${pageContext.request.contextPath }/resource/images/tab_12.gif">
									&nbsp;
								</td>
								<td>
									<table width="100%" border="0" cellpadding="0" cellspacing="1"
										bgcolor="b5d6e6" onmouseover="changeto()"
										onmouseout="changeback()">
										<tr>
											<td width="3%"
												background="${pageContext.request.contextPath }/resource/images/bg2.gif"
												bgcolor="#FFFFFF" style="width: 3%; height: 22px;">
												<div align="center">
													<span class="STYLE1">序号</span>
												</div>
											</td>
											<td background="${pageContext.request.contextPath }/resource/images/bg2.gif"
												bgcolor="#FFFFFF" style="width: 10%; height: 22px;">
												<div align="center">
													<span class="STYLE1">户型</span>
												</div>
											</td>
											<td background="${pageContext.request.contextPath }/resource/images/bg2.gif"
												bgcolor="#FFFFFF" style="width: 5%; height: 22px;">
												<div align="center">
													<span class="STYLE1">管理员工</span>
												</div>
											</td>
											<td background="${pageContext.request.contextPath }/resource/images/bg2.gif"
												bgcolor="#FFFFFF" style="width: 20%; height: 22px;">
												<div align="center">
													<span class="STYLE1">房屋地址</span>
												</div>
											</td>
											<td background="${pageContext.request.contextPath }/resource/images/bg2.gif"
												bgcolor="#FFFFFF" style="width: 10%; height: 22px;">
												<div align="center">
													<span class="STYLE1">房屋价格(平米)</span>
												</div>
											</td>
											<td background="${pageContext.request.contextPath }/resource/images/bg2.gif"
												bgcolor="#FFFFFF" style="width: 30%; height: 22px;">
												<div align="center">
													<span class="STYLE1">房屋环境</span>
												</div>
											</td>
											<td width="20%"
												background="${pageContext.request.contextPath }/resource/images/bg2.gif"
												bgcolor="#FFFFFF" class="STYLE1"
												style="width: 20%; height: 22px;">
												<div align="center">
													基本操作
												</div>
											</td>
										</tr>
										
										<c:forEach items="${pb.dataList }" var="h" varStatus="status">
											<tr>
												<td height="20" bgcolor="#FFFFFF" style="width: 3%">
													<div align="center" class="STYLE1">
														<div align="center">
															${(pb.pageNow-1)*3+status.count }
														</div>
													</div>
												</td>
												<td height="20" bgcolor="#FFFFFF" style="width: 10%">
													<div align="center">
														<span class="STYLE1">${h.ht.typeName }</span>
													</div>
												</td>
												<td height="20" bgcolor="#FFFFFF" style="width: 10%">
													<div align="center">
														<span class="STYLE1">${h.ui.userName }</span>
													</div>
												</td>
												<td height="20" bgcolor="#FFFFFF" style="width: 20%">
													<div align="center">
														<span class="STYLE1">${h.houseAddress }</span>
													</div>
												</td>
												<td height="20" bgcolor="#FFFFFF" style="width: 10%">
													<div align="center">
														<span class="STYLE1">${h.housePrice }</span>
													</div>
												</td>
												<td height="20" bgcolor="#FFFFFF" style="width: 20%">
													<div align="center">
														<span class="STYLE1">${h.houseAmbient }</span>
													</div>
												</td>
												<td height="20" bgcolor="#FFFFFF" style="width: 20%">
													<div align="center">
														<span class="STYLE4"> <img
																src="${pageContext.request.contextPath }/resource/images/edt.gif" width="16"
																height="16" /> <a
															href="${pageContext.request.contextPath }/edithouse1?houseId=${h.houseId}">编辑</a>&nbsp;
															&nbsp; <img src="${pageContext.request.contextPath }/resource/images/del.gif"
																width="16" height="16" /><a
															 href="javascript:;" onclick="del('${h.houseId }')">删除</a>
														</span>
													</div>
												</td>
											 </tr>
										</c:forEach>
									</table>
								</td>
								<td width="8"
									background="${pageContext.request.contextPath }/resource/images/tab_15.gif">
									&nbsp;
								</td>
							</tr>
						</table>
					</td>
				</tr>

				<tr>
					<td height="35"
						background="${pageContext.request.contextPath }/resource/images/tab_19.gif">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="12" height="35">
									<img src="${pageContext.request.contextPath }/resource/images/tab_18.gif" width="12"
										height="35" />
								</td>
								<td>
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td class="STYLE4">
												&nbsp;&nbsp;共有 ${pb.totalCount } 条记录，当前第 ${pb.pageNow }/${pb.totalPageCount } 页
											</td>
											<td>
												<table border="0" align="right" cellpadding="0"
													cellspacing="0">
													<tr>
														<td width="40">
															<img src="${pageContext.request.contextPath }/resource/images/first.gif"
																width="37" height="15"  onclick="query2(1)"/>
														</td>
														<td width="45">
															<img src="${pageContext.request.contextPath }/resource/images/back.gif"
																width="43" height="15" onclick="query2( ${pb.pageNow-1 })"/>
														</td>
														<td width="45">
															<img src="${pageContext.request.contextPath }/resource/images/next.gif"
																width="43" height="15" onclick="query2( ${pb.pageNow+1>pb.totalPageCount?pb.totalPageCount:pb.pageNow+1 })" />
														</td>
														<td width="40">
															<img src="${pageContext.request.contextPath }/resource/images/last.gif"
																width="37" height="15" onclick="query2(${pb.totalPageCount })" />
														</td>
														<td width="100">
															<div align="center">
																<span class="STYLE1">转到第 <input name="textfield"
																		type="text" size="4"
																		style="height: 12px; width: 20px; border: 1px solid #999999;" />
																	页 </span>
															</div>
														</td>
														<td width="40">
															<img src="${pageContext.request.contextPath }/resource/images/go.gif" width="37"
																height="15" onclick="query1(form1.textfield)"/>
														</td>
													</tr>
												</table>
											</td>
										</tr>
									</table>
								</td>
								<td width="16">
									<img src="${pageContext.request.contextPath }/resource/images/tab_20.gif" width="16"
										height="35" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>

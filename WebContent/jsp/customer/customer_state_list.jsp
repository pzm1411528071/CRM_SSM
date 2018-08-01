<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>My JSP 'customerCondition_list.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-1.9.1.js"></script>
<style type="text/css">
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
	
	.STYLE4 {
		color: #03515d;
		font-size: 12px;
	}
	
		a{
		text-decoration: none;
		color: #033d61;
		font-size: 12px;
	}
	A:hover {
		COLOR: #f60; TEXT-DECORATION: underline
	}
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
		window.location="${pageContext.request.contextPath }/jsp/customer/customer_state_add.jsp";
	}
</script>
<script type="text/javascript">
	function queryCustomer(){
		var form = $("form")[0];
		form.method="post";
		form.action="${pageContext.request.contextPath }/customer/customerStatelist2";
		form.submit();
	}
</script>
<script type="text/javascript">
	$(document).ready(function(){
	   //点击链接的时候调用
	  $("#linkToPage").click(function(){
	      //得到input的值
	      var page = $("#toPage").val();
	      if(page==null||page==""){
	    	  page=1;
	      }
	      //设置linkToPage的href的值
	      $("#linkToPage").attr("href","${pageContext.request.contextPath }/customer/customerStatelist1?page="+page+"&differ=1");
	  });
	});
</script>
<script type="text/javascript">
	function del(conditionId){
		if(confirm("确认删除？")){
			window.location.href="${pageContext.request.contextPath }/customer/customerStateDelete?conditionId=" + conditionId;
		}
	}
</script>
</head>
<body>
	<form>
		<!-- 当前页隐藏域,2进入查询页面 -->
		<input type="hidden" id="differ" name="differ" value="2">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="30" background="${pageContext.request.contextPath }/resource/images/tab_05.gif">
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
											&nbsp;&nbsp;请输入客户状态：
											<input type="text" name="queryState" style="width: 290px" />
										</td>
										<td class="STYLE4">
											&nbsp;&nbsp;
											<input type="button" onclick="queryCustomer()" value="查询" style="width: 50px" />
										</td>
										<td class="STYLE4">
											&nbsp;&nbsp;
											<input type="button" value="添加" onclick="add()" style="width: 50px" />
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
										<td width="5%"
											background="${pageContext.request.contextPath }/resource/images/bg2.gif"
											bgcolor="#FFFFFF" style="width: 5%; height: 22px;">
											<div align="center">
												<span class="STYLE1">序号</span>
											</div>
										</td>
										<td background="${pageContext.request.contextPath }/resource/images/bg2.gif"
											bgcolor="#FFFFFF" style="width: 30%; height: 22px;">
											<div align="center">
												<span class="STYLE1">客户状态</span>
											</div>
										</td>
										<td background="${pageContext.request.contextPath }/resource/images/bg2.gif"
											bgcolor="#FFFFFF" style="width: 55%; height: 22px;">
											<div align="center">
												<span class="STYLE1">状态描述</span>
											</div>
										</td>
										<td      width="10%"
											background="${pageContext.request.contextPath }/resource/images/bg2.gif"
											bgcolor="#FFFFFF" class="STYLE1"
											style="width: 10%; height: 22px;">
											<div align="center">
												基本操作
											</div>
										</td>
									</tr>
				
                                    <c:forEach items="${cList }" var="c" varStatus="i">
									<tr>
										<td height="20" bgcolor="#FFFFFF" style="width: 3%">
											<div align="center" class="STYLE1">
												<div align="center">
													${i.index+1 }
												</div>
											</div>
										</td>
										<td height="20" bgcolor="#FFFFFF" style="width: 4%">
											<div align="center">
												<span class="STYLE1">${c.conditionName }</span>
											</div>
										</td>
										<td height="20" bgcolor="#FFFFFF" style="width: 32%">
											<div align="center">
												<span class="STYLE1">${c.conditionExplain }</span>
											</div>
										</td>
										<td      height="20" bgcolor="#FFFFFF" style="width: 9%">
											<div align="center">
												<span class="STYLE4"><img src="${pageContext.request.contextPath }/resource/images/del.gif"
														width="16" height="16" /><a
													href="javascript:;" onclick="del('${c.conditionId }')">删除</a>
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
				<td height="35" background="${pageContext.request.contextPath }/resource/images/tab_19.gif">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="12" height="35">
								<img src="${pageContext.request.contextPath }/resource/images/tab_18.gif" width="12"
									height="35" />
							</td>
							<td>
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
								    
								    <c:choose>
										<c:when test="${differ == 1}">
											<!-- 直接进入客户信息页面 ,放于c:choose和c:when中无法解析注释-->
											<tr>
												<td class="STYLE4">&nbsp;&nbsp;共有${total }条记录,${pageTotal}页,当前第
													${page }页</td>
												<td><table border="0" align="right" cellpadding="0"
														cellspacing="0">
														<tr>
															<td width="40"><a
																href="${pageContext.request.contextPath }/customer/customerStatelist1?page=1&differ=1">
																	<img
																	src="${pageContext.request.contextPath }/resource/images/first.gif"
																	width="37" height="15" />
															</a></td>
															<td width="45"><a
																href="${pageContext.request.contextPath }/customer/customerStatelist1?page=${page-1}&differ=1">
																	<img
																	src="${pageContext.request.contextPath }/resource/images/back.gif"
																	width="43" height="15" />
															</a></td>
															<td width="45"><a
																href="${pageContext.request.contextPath }/customer/customerStatelist1?page=${page+1}&differ=1">
																	<img
																	src="${pageContext.request.contextPath }/resource/images/next.gif"
																	width="43" height="15" />
															</a></td>
															<td width="40"><a
																href="${pageContext.request.contextPath }/customer/customerStatelist1?page=${pageTotal}&differ=1">
																	<img
																	src="${pageContext.request.contextPath }/resource/images/last.gif"
																	width="37" height="15" />
															</a></td>
															<td width="100"><div align="center">
																	<span class="STYLE1">转到第 <input name="toPage"
																		id="toPage" type="text" size="4"
																		style="height: 12px; width: 20px; border: 1px solid #999999;" />
																		页
																	</span>
																</div></td>
															<td width="40"><a href="" id="linkToPage"> <img
																	src="${pageContext.request.contextPath }/resource/images/go.gif"
																	width="37" height="15" />
															</a></td>
														</tr>
													</table></td>
											</tr>
										</c:when>

										<c:otherwise>
											<c:if test="${differ == 2}">
												<!-- 通过查询进入客户信息页面 ,不带分页-->

											</c:if>
										</c:otherwise>
									</c:choose>
									
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>center</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${pageContext.request.contextPath }/resource/css/admin.css" type=text/css rel=stylesheet>
<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-1.9.1.js"></script>

</head> 
<body>

		<table class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
			<tr class=editHeaderTr>
				<td class=editHeaderTd >  关怀提醒</td>
				<td class=editHeaderTd >  联系提醒</td>
				<tr>
   					<td width="50%" bgcolor="#FFFDF0">
						<div align="center" id="div1">
						<form action="${pageContext.request.contextPath }/customer/findCustomerCare" method="post" >
					      <table  class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
							<tr>
								<td bgcolor="#FFFDF0"  colspan="2">
									<div align="center">查询方式：
										<select name="bettweenTime"  style=" width: 145px">
											<option  value="0" <c:if test="${bettweenTime1==0 }">selected</c:if>>当天</option>
											<option  value="7" <c:if test="${bettweenTime1==7 }">selected</c:if>>一周内</option>
											<option  value="15" <c:if test="${bettweenTime1==15 }">selected</c:if>>半月内</option>
											<option  value="30" <c:if test="${bettweenTime1==30 }">selected</c:if>>一月内</option>
										</select>				
									</div>
								</td>
								<td colspan="2" bgcolor="#FFFFFF">
									<div align="center"><input style=" width: 45px" type="submit"   value="查询"></div>
								</td>
   							</tr>
   							<tr><td><input type="hidden" name="turnPage" value="1"> </td></tr>
			   			 	<tr>
			 				 	<td bgcolor="#FFFDF0"><div align="center">关怀主题</div></td>
				 			 	<td bgcolor="#FFFDF0"><div align="center">关怀时间</div></td>
				 			  	<td bgcolor="#FFFDF0"><div align="center">关怀对象</div></td>
			  			 	</tr>
			  			 	<c:forEach items="${carePageBean.dataList}" var="ccareList">
							<tr>
								<td colspan="1" bgcolor="#FFFFFF"><div align="center">${ccareList.careTheme}</div></td>
								<td colspan="1" bgcolor="#FFFFFF"><div align="center"><fmt:formatDate value="${ccareList.careTime}" pattern="yyyy-MM-dd HH:mm:ss"/> </div></td>
 					            <td colspan="1" bgcolor="#FFFFFF"><div align="center">${ccareList.cs.customerName}</div></td>				
							</tr>
							</c:forEach>
                            <c:choose>
                             
                             <c:when test="${carePageBean.dataList==null||carePageBean.dataList.size()==0}">
                              <tr>
								<td height="20" bgcolor="#FFFFFF" colspan="22"  align="center" background="${pageContext.request.contextPath }/resource/images/tab_19.gif">
                                 <span class="STYLE1" >没有要关怀的对象！</span>     
                                </td> 
                              </tr>  
                             </c:when>
                             <c:otherwise>
                                       
							<tr>
								<td height="20" bgcolor="#FFFFFF" colspan="22"  align="center" background="${pageContext.request.contextPath }/resource/images/tab_19.gif">

									<div align="center">
									  <c:if test="${carePageBean.totalPageCount>0 }">
										<span class="STYLE1" >共有 ${carePageBean.totalCount } 条记录，当前第 ${carePageBean.pageNow }页，总共${carePageBean.totalPageCount } 页
								            
										               <c:if test="${carePageBean.pageNow>1}">
										                  <a href="${pageContext.request.contextPath }/customer/findCustomerCare?turnPage=1&bettweenTime=${bettweenTime1 }">第一页</a>
										                  <a href="${pageContext.request.contextPath }/customer/findCustomerCare?turnPage=${carePageBean.pageNow-1 }&bettweenTime=${bettweenTime1 }">上一页</a>
										               </c:if>
										               <c:if test="${carePageBean.pageNow!=carePageBean.totalPageCount}">
										                  <a href="${pageContext.request.contextPath }/customer/findCustomerCare?turnPage=${carePageBean.pageNow+1 }&bettweenTime=${bettweenTime1 }">下一页</a>
										                  <a href="${pageContext.request.contextPath }/customer/findCustomerCare?turnPage=${carePageBean.totalPageCount }&bettweenTime=${bettweenTime1}">最后一页</a>   
										               </c:if>
						
										</span>
									</c:if>
									</div>
								</td>
							</tr>
							</c:otherwise>
                          </c:choose>
  		 				</table>
  		 				</form>
						</div>
					</td>
   					<td bgcolor="#FFFDF0">
						<div align="center" id="div2">
						<form action="${pageContext.request.contextPath }/customer/findEmailInfo" method="post" >
							<table  class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
							    <tr><td><input type="hidden" name="turnPage" value="1"> </td></tr>
   								<tr><td><input type="hidden" name="userId" value="${user.userId }"> </td></tr>
								<tr>
									<td bgcolor="#FFFDF0"  colspan="3">
										<div align="center">查询方式：
											<select name="bettweenTime" style=" width: 145px">
												<option  value="0" <c:if test="${bettweenTime2==0 }">selected</c:if>>当天</option>
												<option  value="7" <c:if test="${bettweenTime2==7 }">selected</c:if>>一周内</option>
												<option  value="15" <c:if test="${bettweenTime2==15 }">selected</c:if>>半月内</option>
												<option  value="30" <c:if test="${bettweenTime2==30 }">selected</c:if>>一月内</option>
											</select>				
										</div>
									</td>
									<td colspan="3" bgcolor="#FFFFFF">
										<div align="center">
											<input style=" width: 45px" type="submit"   value="查询">
										</div>
									</td>
   								</tr>
   								
   			 					<tr>
					 				<td bgcolor="#FFFDF0"><div align="center">联系主题</div></td>
						 			<td bgcolor="#FFFDF0"><div align="center">联系方式</div></td>
						 		    <td bgcolor="#FFFDF0"><div align="center">应联系时间</div></td>
						 	   		<td bgcolor="#FFFDF0"><div align="center">联系对象</div></td>
					  			</tr>
					  		  <c:forEach items="${emailPageBean.dataList}" var="emailList">
						   		<tr>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center">${emailList.emailTheme }</div></td>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center">${emailList.ci.customerMobile }</div></td>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center"><fmt:formatDate value="${emailList.emailTime}" pattern="yyyy-MM-dd HH:mm:ss"/></div></td>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center">${emailList.ci.customerName }</div></td>
					  	 		</tr>
					  	 		</c:forEach>
					  	   <c:choose>
                             <c:when test="${emailPageBean.dataList==null||emailPageBean.dataList.size()==0}">
                              <tr>
								<td height="20" bgcolor="#FFFFFF" colspan="22"  align="center" background="${pageContext.request.contextPath }/resource/images/tab_19.gif">
                                 <span class="STYLE1">没有要联系的对象！</span>     
                                </td> 
                              </tr>  
                             </c:when>
                           <c:otherwise>
                                       
							<tr>
								<td height="20" bgcolor="#FFFFFF" colspan="22"  align="center" background="${pageContext.request.contextPath }/resource/images/tab_19.gif">

									<div align="center">
									  <c:if test="${emailPageBean.totalPageCount>0 }">
										<span class="STYLE1">共有 ${emailPageBean.totalCount } 条记录，当前第 ${emailPageBean.pageNow }页，总共${emailPageBean.totalPageCount } 页
								            
										               <c:if test="${emailPageBean.pageNow>1}">
										                  <a href="${pageContext.request.contextPath }/customer/findEmailInfo?turnPage=1&bettweenTime=${bettweenTime2 }&userId=${user.userId}">第一页</a>
										                  <a href="${pageContext.request.contextPath }/customer/findEmailInfo?turnPage=${emailPageBean.pageNow-1 }&bettweenTime=${bettweenTime2 }&userId=${user.userId}">上一页</a>
										               </c:if>
										               <c:if test="${emailPageBean.pageNow!=emailPageBean.totalPageCount}">
										                  <a href="${pageContext.request.contextPath }/customer/findEmailInfo?turnPage=${emailPageBean.pageNow+1 }&bettweenTime=${bettweenTime2 }&userId=${user.userId}">下一页</a>
										                  <a href="${pageContext.request.contextPath }/customer/findEmailInfo?turnPage=${emailPageBean.totalPageCount }&bettweenTime=${bettweenTime2}&userId=${user.userId}">最后一页</a>   
										               </c:if>
						
										</span>
									</c:if>
									</div>
								</td>
							</tr>
                              </c:otherwise>
                            
                            </c:choose>
  		 					</table>
  		 				  </form>
						</div>
					</td>
   				</tr>
   				<tr class=editHeaderTr>
					<td class=editHeaderTd >  有效公告</td>
					<td class=editHeaderTd >  生日提醒</td>
 					<tr>
   						<td width="50%" bgcolor="#FFFDF0">
							<div align="center" id="div3">
							<table  class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
   								<tr>
					 				<td bgcolor="#FFFDF0"><div align="center">公告主题</div></td>
						 			<td bgcolor="#FFFDF0"><div align="center">公告内容</div></td>
						 			<td bgcolor="#FFFDF0"><div align="center">截止时间</div></td>
						 			<td bgcolor="#FFFDF0"><div align="center">公告人</div></td>
  			 					</tr>
  			 				
                                       
  			 				  <c:forEach items="${noticeinfoPageBean.dataList }" var="noticeinfo">
								<tr>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center">${noticeinfo.noticeItem }</div></td>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center">${noticeinfo.noticeContent }</div></td>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center"><fmt:formatDate value="${noticeinfo.noticeEndtime}" pattern="yyyy-MM-dd HH:mm:ss"/></div></td>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center">${noticeinfo.ui.userName }</div></td>
								</tr>
							  </c:forEach>
                              <c:choose>
                             <c:when test="${noticeinfoPageBean.dataList==null||noticeinfoPageBean.dataList.size()==0}">
                              <tr>
								<td height="20" bgcolor="#FFFFFF" colspan="22"  align="center" background="${pageContext.request.contextPath }/resource/images/tab_19.gif">
                                 <span class="STYLE1">没有有效公告！</span>     
                                </td> 
                              </tr>  
                             </c:when>
                             <c:otherwise>
							  <tr>
								<td height="20" bgcolor="#FFFFFF" colspan="22"  align="center" background="${pageContext.request.contextPath }/resource/images/tab_19.gif">

									<div align="center">
									  <c:if test="${noticeinfoPageBean.totalPageCount>0 }">
										<span class="STYLE1">共有 ${noticeinfoPageBean.totalCount } 条记录，当前第 ${noticeinfoPageBean.pageNow }页，总共${noticeinfoPageBean.totalPageCount } 页
								            
										               <c:if test="${noticeinfoPageBean.pageNow>1}">
										                  <a href="${pageContext.request.contextPath }/user/findNoticeInfo?turnPage=1&bettweenTime=${bettweenTime }">第一页</a>
										                  <a href="${pageContext.request.contextPath }/user/findNoticeInfo?turnPage=${noticeinfoPageBean.pageNow-1 }">上一页</a>
										               </c:if>
										               <c:if test="${noticeinfoPageBean.pageNow!=noticeinfoPageBean.totalPageCount}">
										                  <a href="${pageContext.request.contextPath }/user/findNoticeInfo?turnPage=${noticeinfoPageBean.pageNow+1 }">下一页</a>
										                  <a href="${pageContext.request.contextPath }/user/findNoticeInfo?turnPage=${noticeinfoPageBean.totalPageCount }">最后一页</a>   
										               </c:if>
						
										</span>
									</c:if>
									</div>
								</td>
							</tr>
                              </c:otherwise>
                            
                            </c:choose>
  		 					</table>
							</div>
						</td>
   						<td bgcolor="#FFFDF0">
							<div align="center" id="div4">
							<form action="${pageContext.request.contextPath }/customer/findCustomerBirthday" method="post" >
							<table  class=editTable cellSpacing=1 cellPadding=0 width="100%" align=center border=0>
							    <tr><td><input type="hidden" name="turnPage" value="1"> </td></tr>
								<tr>
									<td bgcolor="#FFFDF0"  colspan="3">
										<div align="center">查询方式：
											<select name="bettweenTime" style=" width: 145px">
												<option  value="0" <c:if test="${bettweenTime3==0 }">selected</c:if>>当天</option>
												<option  value="7" <c:if test="${bettweenTime3==7 }">selected</c:if>>一周内</option>
												<option  value="15" <c:if test="${bettweenTime3==15 }">selected</c:if>>半月内</option>
												<option  value="30" <c:if test="${bettweenTime3==30 }">selected</c:if>>一月内</option>
											</select>				
										</div>
									</td>
									<td colspan="3" bgcolor="#FFFFFF">
										<div align="center">
											<input style=" width: 45px" type="submit" value="查询">
										</div>
									</td>
								</tr>
								
				    			<tr>
					 				<td bgcolor="#FFFDF0"><div align="center">过生的人</div></td>
						 			<td bgcolor="#FFFDF0"><div align="center">生日时间</div></td>
						 			<td bgcolor="#FFFDF0"><div align="center">手机号码</div></td>
						 	   		<td bgcolor="#FFFDF0"><div align="center">客户状态</div></td>
				   			    </tr>
				   			    <c:forEach items="${custinfoPageBean.dataList }" var="customerinfo">
					    		<tr>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center">${customerinfo.customerName }</div></td>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center"><fmt:formatDate value="${customerinfo.birthDay}" pattern="yyyy-MM-dd HH:mm:ss"/></div></td>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center">${customerinfo.customerMobile }</div></td>
									<td colspan="1" bgcolor="#FFFFFF"><div align="center">${customerinfo.cc.conditionName }</div></td>
					   	 		</tr>
					   	 		</c:forEach>
					   	 	<c:choose>
                             <c:when test="${custinfoPageBean.dataList==null||custinfoPageBean.dataList.size()==0}">
                              <tr>
								<td height="20" bgcolor="#FFFFFF" colspan="22"  align="center" background="${pageContext.request.contextPath }/resource/images/tab_19.gif">
                                 <span class="STYLE1">没有要过生日的人！</span>     
                                </td> 
                              </tr>  
                             </c:when>
                           <c:otherwise>
                                       
							<tr>
								<td height="20" bgcolor="#FFFFFF" colspan="22"  align="center" background="${pageContext.request.contextPath }/resource/images/tab_19.gif">

									<div align="center">
									  <c:if test="${custinfoPageBean.totalPageCount>0 }">
										<span class="STYLE1">共有 ${custinfoPageBean.totalCount } 条记录，当前第 ${custinfoPageBean.pageNow }页，总共${custinfoPageBean.totalPageCount } 页
								            
										               <c:if test="${custinfoPageBean.pageNow>1}">
										                  <a href="${pageContext.request.contextPath }/customer/findCustomerBirthday?turnPage=1&bettweenTime=${bettweenTime3 }">第一页</a>
										                  <a href="${pageContext.request.contextPath }/customer/findCustomerBirthday?turnPage=${custinfoPageBean.pageNow-1 }&bettweenTime=${bettweenTime3 }">上一页</a>
										               </c:if>
										               <c:if test="${custinfoPageBean.pageNow!=custinfoPageBean.totalPageCount}">
										                  <a href="${pageContext.request.contextPath }/customer/findCustomerBirthday?turnPage=${custinfoPageBean.pageNow+1 }&bettweenTime=${bettweenTime3 }">下一页</a>
										                  <a href="${pageContext.request.contextPath }/customer/findCustomerBirthday?turnPage=${custinfoPageBean.totalPageCount }&bettweenTime=${bettweenTime3}">最后一页</a>   
										               </c:if>
										</span>
									</c:if>
									</div>
								</td>
							</tr>
                              </c:otherwise>
                            
                            </c:choose>
   		                 	</table>
   		                 	</form>
							</div>
						</td>
    				</tr>
		</table>

</body>
</html>

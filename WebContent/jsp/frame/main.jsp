<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>客户关系管理系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
  
<frameset rows="98,*,8"  border="7" bordercolor="#1873aa"     scrolling="No" noresize="noresize"  framespacing="0">
	<frame src="${pageContext.request.contextPath }/jsp/frame/top.jsp" name="topFrame" scrolling="No"  noresize="noresize" id="topFrame" />
	<frameset cols="166,*">
		<frame src="${pageContext.request.contextPath }/jsp/frame/left.jsp"   noresize="noresize" />
		<!-- 在进入center.jsp之前先到后台取到数据库中公告的信息 -->
		<frame src="${pageContext.request.contextPath }/user/findNoticeInfo?turnPage=1"  name="mainFrame" />
	</frameset>
		<frame src="${pageContext.request.contextPath }/jsp/frame/down.jsp" name="bottomFrame" scrolling="No" noresize="noresize" id="bottomFrame" />
</frameset>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传Excel文件</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/customer/customerImportExcel" method="post" enctype="multipart/form-data">
    <input type="file" name="userExcelFile" />
    <input type="submit" value="导入" />
</form>
<!-- 
这个版本poi插件需要使用的excel版本,若格式不对,文件另存为选择:03版本的xls即可
 -->
<br/>
<a href="${pageContext.request.contextPath }/jsp/model/model.xls">下载模板</a>
</body>
</html>
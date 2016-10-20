<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>" />
<title>Spring Mvc 首页-文件上传</title>
</head>
<body>
	<form action="web/fileup.do" method="post" enctype="multipart/form-data">
		<ul>
			<li>文件名：<input type="text" name="filename"></li>
			<li><input type="file" name="file_param" value="选择文件"></li>
			<li><input type="submit" value="提交"></li>
		</ul>
	</form>
</body>
</html>
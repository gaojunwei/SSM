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
<title>Spring Mvc 用户登录</title>
</head>
<body>
	<form action="web/login">
		<ul>
			<li><label>登录账号：</label><input name="userName"/></li>
			<li><label>登录密码：</label><input name="userPwd"/></li>
			<li><input type="submit" value="立即登录"/></li>
		</ul>
	</form>
</body>
</html>
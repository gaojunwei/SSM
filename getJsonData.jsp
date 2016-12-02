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
<title>Spring Mvc 首页-获取JSON数据</title>
<script type="text/javascript" src="http://www.sszjr.com/web/plugin/jquery/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
	function getJsonData()
	{
		$.ajax({//与服务器校验时间
			url : "web/getjson.do",
			type : "post",
			data: "userName=dongcunrui89",
			dataType : 'json',
			success : function(data) {
				console.log("接口返回数据："+data);
				alert(data.T_NAME);
				console.log("toString()=>"+data.toString());
				console.log("valueOf()=>"+data.valueOf());
			}
		});
	}
</script>
</head>
<body>
	<input type="button" value="获取JSON数据" onclick="getJsonData()">
</body>
</html>
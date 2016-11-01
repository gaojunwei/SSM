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
<title>Spring Mvc 首页</title>
</head>
<body>
	<ul>
		<li>欢迎进入SSM整合框架默认首页</li>
		<li><a href="up_file.jsp">文件上传</a></li>
		<li><a href="getJsonData.jsp">获取JSON数据</a></li>
	</ul>
	
	
<!-- JiaThis Button BEGIN -->
<div class="jiathis_style_24x24">
	<a class="jiathis_button_qzone"></a>
	<a class="jiathis_button_tsina"></a>
	<a class="jiathis_button_tqq"></a>
	<a class="jiathis_button_weixin"></a>
	<a class="jiathis_button_renren"></a>
	<a href="http://www.jiathis.com/share" class="jiathis jiathis_txt jtico jtico_jiathis" target="_blank"></a>
	<a class="jiathis_counter_style"></a>
</div>
<script type="text/javascript" src="http://v3.jiathis.com/code/jia.js" charset="utf-8"></script>
<!-- JiaThis Button END -->
<script>
var jiathis_config = {
	    boldNum:0,
	    siteNum:7,
	    showClose:false,
	    sm:"t163,kaixin001,renren,douban,tsina,tqq,tsohu",
	    imageUrl:"http://v2.jiathis.com/code/images/r5.gif",
	    imageWidth:26,
	    marginTop:150,
	    url:"http://www.jiathis.com",
	    title:"#微博话题-顺时针金融#",
	    summary:"顺时针金融（www.sszjr.com）紧密结合“互联网+”的国家战略，定位互联网+典当，开启智能典当模式，通过“互联网+”连接全国典当联盟、典当行业协会等产业资源，聚合用户体验，优化传统典当展业方式，通过优质快捷的服务践行普惠金融。",
	    pic:"http://www.sszjr.com/web/sszjr/common/img/logo.png",
	    data_track_clickback:true,
	    "shortUrl":true,
	    evt:{
	        "share":"用户自定义函数" 
	    }
	}
</script>
</body>
</html>
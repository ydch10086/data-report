<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title></title>
<link rel="stylesheet" href="${ctx}/css/global.css">
<script src="${ctx }/js/echarts/echarts.min.js"></script>
<script src="${ctx }/js/jquery/jquery.min-1.11.3.js"></script>
<script src="${ctx }/js/operation/chartReport/groupPackCount.js"></script>
<script src="${ctx }/js/operation/chartReport/siteRankCount.js"></script>
<script src="${ctx }/js/operation/chartReport/siteActivityCount.js"></script>
<script src="${ctx }/js/operation/chartReport/receiveAndSignChart.js"></script>
<script src="${ctx }/js/operation/chartReport/groupPackChart.js"></script>
<script type="text/javascript">
	$ (window).resize (function () {
		$ (".hdl").hide();
	    location = location
    });
    $ (function () {
	    $ (".hdl").css ("left", $ ("#siteActivity").offset ().left + "px");
    });
</script>
<style type="text/css">
html, body {
	overflow: auto;
}

.main {
	width: 100%;
	height: 100%;
	overflow: auto;
	min-width: 900px;
	position: absolute;
}

.main>div {
	width: 38%;
	height: 64%;
	margin:1%;
	padding:8% 5%;
	float: left;
	border-radius: 10px;
	background-color: #eee !important;
}

.hdl {
	position: absolute;
	padding-top: 9%;
	padding-left:6%;
}

.hdl li {
	margin-bottom: 8px;
	margin-top: 2px;
	font-size: 13px;
}
</style>
</head>
<body>
	<div class="main">
		<div id="groupPackCount"></div>
		<div id="siteActivity"></div>
		<div id="siteRank"></div>
		<div id="arriveAndSignChart"></div>
		<div id="groupPackChart"></div>
		<ul class="hdl">
			<li style="padding-left: 86px; margin-top: 3px;">:<label id="siteActive"/></li>
			<li style="padding-left: 98px;">:<label id="siteNoActive" /></li>
			<li style="padding-left: 73px;">:<label id="siteCount" /></li>
		</ul>
	</div>
</body>
</html>
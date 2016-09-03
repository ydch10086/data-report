<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="basepathUrl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}${'/'}" />
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta content="${ctx }" name="pg-ctx">
<title>首页</title>
<link rel="stylesheet" href="${ctx}/css/global.css">
<link rel="stylesheet" href="${ctx}/css/index.css">
<script src="${ctx }/js/jquery/jquery.min-1.11.3.js"></script>
<script type="text/javascript">
	var basepathUrl = "${basepathUrl}";
</script>
<script src="${ctx }/js/index.js"></script>
</head>
<body>
	<div class="index">
		<div class="top">
			<img src="${ctx}/image/logo.png" />
			<div class="logoutdiv">
				<span data-username="${sessionScope.user.userName }">${sessionScope.user.userName }</span>
<%-- 				<img title="退出" onclick="window.location='${ctx}/logout'" src="${ctx}/image/logout-btn.png" /> --%>
<%-- 				<img title="退出" onclick="window.location='http://192.168.7.103:8080/cas/logout?service=http://192.168.7.103:8080/cas/login'" src="${ctx}/image/logout-btn.png"/> --%>
				<img title="退出" onclick="window.location='http://192.168.8.204:8081/cas/logout?service=http://192.168.8.204:8081/cas/login'" src="${ctx}/image/logout-btn.png"/>
			</div>
		</div>
		<div class="bottom">
			<div class="left">
				<div class="menuTitle">菜单栏</div>
				<div class="menudiv">
					<ul class="menu">
					<li>
						<div>
							<span>扫描记录管理</span><img src="${ctx}/image/arrowright.png">
						</div>
						<ul>
							<!-- <li url="stayScan.jsp">管理</li> -->
							<li url="scan/toWeighScanPage">称重扫描管理</li>
							<li url="scan/toGroupPackScanPage">集包扫描管理</li>
							<li url="scan/toLoadCarScanPage">装车扫描管理</li>
							<li url="toArriveScanPage">到件扫描管理</li>
							<li url="toStayScanPage">留仓扫描管理</li>
							<li url="toArrivePackScanPage">到包扫描管理</li>
							<li url="toReceiveScanPage">收件扫描管理</li>
							<li url="toSendScanPage">发件扫描管理</li>
							<li url="toSendPackScanPage">发包扫描管理</li>
							<li url="toDispatchScanPage">派件扫描管理</li>
							<li url="scan/toSiteScanCompMonitorPage">网点扫描对比监控</li>
							<li url="toSignScanPage">签收扫描管理</li>
							<li url="toCenterContrast">中心扫描对比监控</li>
							<li url="forecast/forecastData">中心货量预报</li>
							<li url="scan/toScanDataByPagePage">扫描记录查询</li>
							<li url="groupWrong/toCenterGroupWrongPage">中心错集查询</li>
						</ul>
					</li>
				</ul>
				</div>
			</div>
			<div class="right">
				<div class="right-top">
					<div class="tabDiv">
						<img style="border-left: none;" src="${ctx}/image/tabarrowleft.png"  title="左移动"/>
						<div>
							<ul class="tabTitle">
								<li class="seltabTitle" style="padding-right: 10px;">首页</li>
							</ul>
						</div>
						<img style="border-right: none;" src="${ctx}/image/tabarrowright.png" title="右移动"/>
					</div>
				</div>
				<div class="tabCount">
					<iframe frameborder="no" src="main.jsp"></iframe>
				</div>
				<div class="right-bottom">Copyright © 2015-2025 安能物流.</div>
			</div>
		</div>
	</div>
</body>
</html>
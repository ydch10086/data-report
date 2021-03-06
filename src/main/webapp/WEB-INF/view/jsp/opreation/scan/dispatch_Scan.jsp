<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<input type="hidden"  name="ctx" id="ctx" value="${ctx}">
<c:set var="basepathUrl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}${'/'}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>派件扫描管理</title>
<link rel="stylesheet" href="${ctx}/css/common.css">
<script src="${ctx }/js/jquery/jquery.min-1.11.3.js"></script>
<script type="text/javascript">
	var basepathUrl = "${basepathUrl}";
</script>
<script src="${ctx }/js/operation/scan/commonScan.js"></script>
<link rel="stylesheet" href="${ctx}/css/sweetalert.css">
<script src="${ctx }/js/fuzzyQuery.js"></script>
<script src="${ctx }/js/sweetalert.min.js"></script>
<link rel="stylesheet" href="${ctx}/css/common.css">
<script type="text/javascript" src="${ctx}/js/laydate/laydate.dev.js"></script>
<script src="${ctx }/js/operation/scan/dispatchScan.js"></script>
</head>
<body id="dataPage">
	<form id="subform" method="post">
		<div class="condition">
			<div style="min-width: 1130px;">
				<div class="subdiv">
					<input type="button" value="查询" class="subbtn" />
					<input type="button" value="清除" class="cleanbtn" />
					<img src="${ctx}/image/removeimg.png" class="disbtn" />
				</div>
				<div class="textdiv">
					<span>条件查询</span>
					<table>
						<tr>
							<td width="200px">
								<input type="checkbox" class="selType" />
								<span>按单号查询</span>
							</td>
							<td width="400px">
								<label class="label">查询天数</label>
								<input type="button" class="dayNum" value="一天" style="border-color: #000;" />
								<input type="button" class="dayNum" value="两天" />
								<input type="button" class="dayNum" value="三天" style="margin-right: 0px;" />
								<input type="hidden" class="selday" value="1" />
							</td>
							<td width="240px">
								<label class="label">扫描网点</label>
								<input type="text" class="text scanSiteName" name="scanSiteName" onkeyup="networkFuzzy(event,this,'siteId');" />
								<input type="hidden" name="siteId" class="siteId" />
							</td>
							<td>
								<label class="label">收件人</label>
								<input type="text" class="text deliveryMan" name="deliveryMan"/>
								<input type="hidden" name="deliveryManId" class="deliveryManId" />
							</td>
						</tr>
						<tr>
							<td>
								<label class="label" style="margin-left: 0px;">输入单号</label>
								<input type="text" name="ewbNo" class="text ewbNo" />
							</td>
							<td>
								<label class="label">扫描时间</label>
								<input type="text" id="scanStartTimeId" name="scanStartTime" class="text" style="width: 120px;"
									readonly="readonly" onclick="laydate()" />
								<span>--</span>
								<input type="text" id="scanEndTimeId" name="scanEndTime" class="text" style="width: 120px;" readonly="readonly"
									onclick="laydate()" />
							</td>
							<td>
								<label class="label">扫描人</label>
								<input type="text" class="text createdBy" value="${sessionScope.user.userName}" name="createdBy"
									onkeyup="employeeFuzzy(event,this,'createById');" />
								<input type="hidden" name="createById" class="createById" value="${sessionScope.user.userId}" />
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<div class="data">
			<div style="min-width: 1000px;">
				<table class="listTable">
					<tr>
						<th>序号</th>
						<th>运单号</th>
						<th>扫描网点</th>
						<th>扫描人</th>
						<th>扫描时间</th>
						<th>收件人</th>
						<th>数据来源</th>
						<th>设备编号</th>
					</tr>
				</table>
				<div class="list">
					<table id="tbody_dispatchScanDisplayId"></table>
				</div>
			</div>
		</div>
		<div class="page">
			<input type="hidden" class="pageCount" />
			<span>
				<a href=" javascript:void(0);" class="prePage">上一页</a>
				<select class="pageNum" name="pageNum">
					<option selected="selected" value="1">1</option>
				</select>
				<a href=" javascript:void(0);" class="nextPage">下一页</a>
			</span>
			<span>
				每页显示
				<select class="pageSize" name="pageSize">
					<option value="20" selected="selected">20</option>
					<option value="30">30</option>
					<option value="50">50</option>
				</select>
				条数据
			</span>
			<span class="pageinfo"></span>
		</div>
	</form>
	<div class="loadDiv" style="display:none;position:fixed;top:0px;right:0px; bottom:0.1px; left:0px; background-color:#000;opacity:0.5;text-align: center;z-index:3;">
		<img src="${ctx}/image/loading.gif" style="margin:auto;margin-top:350px;">
	</div>
</body>
</html>
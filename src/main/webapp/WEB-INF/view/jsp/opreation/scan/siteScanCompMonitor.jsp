<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="basepathUrl" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}${'/'}" />
<input type="hidden"  name="ctx" id="ctx" value="${ctx}">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>网点扫描对比监控</title>
<link rel="stylesheet" href="${ctx}/css/common.css">
<script src="${ctx }/js/jquery/jquery.min-1.11.3.js"></script>
<script type="text/javascript">var basepathUrl = "${basepathUrl}";</script>
<script src="${ctx }/js/operation/scan/commonScan.js"></script>
<script type="text/javascript" src="${ctx}/js/laydate/laydate.dev.js"></script>
<script src="${ctx }/js/operation/scan/siteScanCompMonitor.js"></script>
<script src="${ctx }/js/fuzzyQuery.js"></script>
</head>
<body id="dataPage">
	<form id="subform" method="post">
		<div class="condition">
			<div style="min-width: 1150px;">
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
							<input type="checkbox" class="selType"/> 
							<span>按单号查询</span>
						</td>
						<td width="400px">
							<label class="label">查询天数</label>
							<input type="button" class="dayNum"  value="一天"  style="border-color: #000;"/>
							<input type="button" class="dayNum"  value="两天"/>
							<input type="button" class="dayNum"  value="三天" style="margin-right: 0px;"/>
							<input type="hidden"  class="selday"  value="1"/>
						</td>
						<td>
							<label class="label" >扫描网点</label>
							<input type="text" class="text siteTextClass"  onkeyup="networkFuzzy(event,this,'siteHiddenTextClass');" style="width: 150px;"/>
							<input type="hidden" class="siteHiddenTextClass" name="siteId"/>
						</td>
					</tr>
					<tr>
						<td>
							<input type="text"  name="billNo" class="text"/>
						</td>
						<td>
							<label class="label">扫描时间</label>
							<input type="text"  name="scanStartTime" class="text" style="width: 120px;" readonly="readonly" onclick="laydate()"/>
							<span>--</span>
							<input type="text"  name="scanEndTime"  class="text" style="width: 120px;" readonly="readonly"  onclick="laydate()"/>
						</td>
						<td>
						   <label class="label">对比类型</label>
					        <select id="compTypeId" class="text" style="width: 150px;">
					          <option value="1">本站有收--本站未发</option>
					          <option value="2">本站有发--本站未收</option>
					          <option value="3">本站有到--本站未派</option>
					          <option value="4">本站有派--本站未签</option>
					          <option value="5">本站有签--本站未派</option>
					        </select>
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
						<th>扫描时间</th>
						<th>扫描类型</th>
						<th>扫描人</th>
					</tr>
				</table>
				<div class="list">
					<table id="tbody_siteScanCompMonitorDisplayId"></table>
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
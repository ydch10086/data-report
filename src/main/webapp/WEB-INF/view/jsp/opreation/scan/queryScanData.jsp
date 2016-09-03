<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<input type="hidden"  name="ctx" id="ctx" value="${ctx}">
<c:set var="basepathUrl" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}${'/'}" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
		<link rel="stylesheet" href="${ctx}/css/common.css">
		<script src="${ctx }/js/jquery/jquery.min-1.11.3.js"></script>
		<script type="text/javascript">var basepathUrl = "${basepathUrl}";</script>
		<script src="${ctx }/js/operation/scan/commonScan.js"></script>
		<script type="text/javascript" src="${ctx}/js/laydate/laydate.dev.js"></script>
		<script src="${ctx }/js/operation/scan/queryScanData.js"></script>
		<script src="${ctx }/js/fuzzyQuery.js"></script>
	</head>
	<body id="dataPage">
	<form id="subform" method="post">
		<div class="condition">
			<div style="min-width: 1400px;">
				<div class="subdiv">
					<input type="button" value="查询" class="subbtn" />
					<input type="button" value="清除" class="cleanbtn" />
					<img src="${ctx}/image/removeimg.png" class="disbtn" />
				</div>
				<div class="textdiv">
					<span>条件查询</span>
					<table>
					<tr>
						<td>
							<input type="checkbox" class="selType"/> 
							<span>按单号查询</span>
						</td>
						<td>
							<label class="label">查询天数</label>
							<input type="button" class="dayNum"  value="一天"  style="border-color: #000;"/>
							<input type="button" class="dayNum"  value="两天"/>
							<input type="button" class="dayNum"  value="三天" style="margin-right: 0px;"/>
							<input type="hidden"  class="selday"  value="1"/>
						</td>
						<td>
							<label class="label" >扫描网点</label>
							<input type="text" class="text scanSiteTxtClass" onkeyup="networkFuzzy(event,this,'scanSiteClass');"/>
							<input type="hidden" name="scanSite" class="scanSiteClass"/>
							<label class="label">扫描类型</label>
							<select class="queryType" name="queryType" id="queryTypeId" style="width: 120px">
						          <option selected value="0">全部</option>
								  <option value="1">到包扫描</option>
						          <option value="2">卸车</option>
						          <option value="3">装车</option>
						          <option value="4">集包</option>
						          <option value="5">拆包</option>
						          <option value="6">问题件</option>
						          <option value="7">留仓件</option>
						          <option value="8">收件</option>
						          <option value="9">发件</option>
						          <option value="10">称重</option>
						          <option value="11">到件</option>
						          <option value="12">派件</option>
						          <option value="13">签收</option>
							</select>
							<label class="label" style="margin-left: 98px;">扫描人</label>
							<input type="text" class="text scanPersonTxtClass" onkeyup="employeeFuzzy(event,this,'scanPersonClass');" name="scanPersonTxt"  value="${sessionScope.user.userName}"/>
							<input type="hidden" name="scanPerson" class="scanPersonClass"  value="${sessionScope.user.userId}"/>
						</td>
						
					</tr>
					<tr>
						<td>
							<input type="text"  name="ewbNo" class="text"/>
						</td>
						<td>
							<label class="label">扫描时间</label>
							<input type="text"  name="scanStartTime" class="text" style="width: 120px;" readonly="readonly" onclick="laydate()"/>
							<span>--</span>
							<input type="text"  name="scanEndTime"  class="text" style="width: 120px;" readonly="readonly"  onclick="laydate()"/>
						</td>
						
						<td>
							<label class="label" >上一网点</label>
							<input type="text" class="text preSiteTxtClass" onkeyup="networkFuzzy(event,this,'preSiteClass');"/>
							<input type="hidden" name="preSite" class="preSiteClass"/>
							<label class="label" >目的网点</label>
							<input type="text" class="text descSiteTxtClass" onkeyup="networkFuzzy(event,this,'descSiteClass');"/>
							<input type="hidden" name="descSite" class="descSiteClass"/>
							<label class="label" style="margin-left: 98px;">派件人</label>
							<input type="text" class="text deliveryTxtClass" onkeyup="employeeFuzzy(event,this,'deliveryClass');"/>
							<input type="hidden" name="delivery" class="deliveryClass"/>
						</td>
					</tr>
				</table>
				</div>
			</div>
		</div>
		<div class="data">
			<div style="min-width: 1400px;">
				<table class="listTable">
					<tr>
						<th>序号</th>
						<th>扫描类型</th>
			 			<th>集包号</th>
			 			<th>运单号码</th>
			 			<th>扫描网点</th>
			 			<th>扫描人</th>
			 			<th>扫描时间</th>
			 			<th>称重重量</th>
			 			<th>创建日期</th>
			 			<th>数据来源</th>
			 			<th>设备号</th>
					</tr>
				</table>
				<div class="list">
					<table id="tbodyScanDataList"></table>
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
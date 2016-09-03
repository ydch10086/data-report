<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<input type="hidden"  name="ctx" id="ctx" value="${ctx}">
<c:set var="basepathUrl"
	value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}${'/'}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title></title>
<link rel="stylesheet" href="${ctx}/css/common.css">
<script src="${ctx }/js/jquery/jquery.min-1.11.3.js"></script>
<script src="${ctx }/js/fuzzyQuery.js"></script>
<script type="text/javascript" src="${ctx}/js/laydate/laydate.dev.js"></script>
<script src="${ctx }/js/operation/scan/centerGroupWrong.js"></script>
<script type="text/javascript">
	var basepathUrl = "${basepathUrl}";
</script>
<style type="text/css">
.dayNum {
	margin-right: 69.5px;
}
</style>
</head>
<body id="dataPage">
	<form id="subform" method="post">
		<div class="condition">
			<div style="min-width: 1500px;">
				<div class="subdiv">
					<input type="button" class="subbtn wrongPack" value="错集包" data="1" style="" />
					<input type="button" class="subbtn wrongEwb" value="错录单" data="0" style="margin-right: 0px;" />
					<input type="hidden" class="wrongType" name="wrongType" value="20" />
					<img src="${ctx}/image/removeimg.png" class="disbtn" />
				</div>
				<div class="textdiv">
					<span>条件查询</span>
					<table>
						<tr>
							<td align="right">
								<label>查询天数</label>
							</td>
							<td>
								<input type="button" class="dayNum" value="一天" style="border-color: #000;" />
								<input type="button" class="dayNum" value="三天" />
								<input type="button" class="dayNum" value="七天" />
								<input type="button" class="dayNum" value="十五天" />
								<input type="button" class="dayNum" value="一个月" style="margin-right: 0px;" />
								<input type="hidden" class="selday" value="1" />

								<label class="label packNum" style="margin-left: 80px; width: 40px;">包规格</label>
								<select class="packSpec text" name="packSpec" id="packSpec">
									<option value="" selected="selected">全部</option>
									<option value="大">大</option>
									<option value="中">中</option>
									<option value="小">小</option>
								</select>
							</td>
						</tr>
						<tr>
							<td align="right">
								<label>查询时间</label>
							</td>
							<td>
								<input type="text" id="queryStartTime" name="scanStartTime" class="text"
									style="width: 120px;" readonly="readonly" onclick="laydate()" />
								<span>--</span>
								<input type="text" id="queryEndTime" name="scanEndTime" class="text" style="width: 120px;"
									readonly="readonly" onclick="laydate()" />
								<input type="hidden" name="siteId" class="siteId" value="${sessionScope.user.siteId}" />
								<label class="label" style="margin-left: 66.5px;">分拨名称</label>
								<input type="text" readonly="readonly" class="text" name="siteName"
									value="${sessionScope.user.siteName}" />
								<label class="label packTypes" style="margin-left: 93.2px; width: 40px;">包类型</label>
								<select class="packType text" name="packType" id="packType">
									<option value="" selected="selected">全部</option>
									<option value="绿">绿</option>
									<option value="黄">黄</option>
									<option value="红">红</option>
								</select>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<ul class="tabDiv">
			<li class="tabDivli1">数据列表</li>
			<li class="tabDivli2" style="margin-left: -26px;">详细信息</li>
		</ul>
		<div class="listDate">
			<div class="data">
				<div style="min-width: 1000px;" id="show1">
					<table class="listTable">
						<tr>
							<th>序号</th>
							<th>分拨名称</th>
							<th>单号</th>
							<th>应拆包分拨</th>
							<th>实拆包分拨</th>
							<th>操作人员</th>
							<th>集包日期</th>
							<th>包票数</th>
							<th>错误票数</th>
							<th>包规格</th>
							<th>类型</th>
						</tr>
					</table>
					<div class="list">
						<table id="tbodylist1"></table>
					</div>
				</div>
				<div style="min-width: 1000px; display: none;" id="show2">
					<table id="wrongId" class="listTable">
						<tr>
							<th>序号</th>
							<th>分拨名称</th>
							<th>单号</th>
							<th>应拆包分拨</th>
							<th>实拆包分拨</th>
							<th>操作人员</th>
							<th>集包日期</th>
						</tr>
					</table>
					<div class="list">
						<table id="tbodylist2"></table>
					</div>
				</div>
			</div>
			<div class="page page1">
				<input type="hidden" class="pageCount" />
				<span> <a href=" javascript:void(0);" class="prePage">上一页</a> <select class="pageNum"
						name="pageNum">
						<option selected="selected" value="1">1</option>
					</select> <a href=" javascript:void(0);" class="nextPage">下一页</a>
				</span> <span> 每页显示 <select class="pageSize" name="pageSize">
						<option value="20" selected="selected">20</option>
						<option value="30">30</option>
						<option value="50">50</option>
					</select> 条数据
				</span> <span class="pageinfo"></span>
			</div>
		</div>
		<div class="detailedInfo" style="display: none;">
			<input type="hidden" class="packBarCode" />
			<div class="data">
				<div style="min-width: 1000px;">
					<table class="listTable">
						<tr>
							<th>序号</th>
							<th>集包号</th>
							<th>运单号</th>
							<th>发件网点</th>
							<th>所属分拨</th>
							<th>录单目的分拨</th>
						</tr>
					</table>
					<div class="list">
						<table id="tbodylinfo"></table>
					</div>
				</div>
			</div>
			<div class="page page2">
				<input type="hidden" class="pageCount1" />
				<span> <a href="javascript:void(0);" class="prePage1">上一页</a> <select class="pageNum1">
						<option selected="selected" value="1">1</option>
					</select> <a href=" javascript:void(0);" class="nextPage1">下一页</a>
				</span> <span> 每页显示 <select class="pageSize1">
						<option value="20" selected="selected">20</option>
						<option value="30">30</option>
						<option value="50">50</option>
					</select> 条数据
				</span> <span class="pageinfo1"></span>
			</div>
		</div>
	</form>
	<div class="loadDiv" style="display:none;position:fixed;top:0px;right:0px; bottom:0px; left:0px; background-color:#000;opacity: 0.5;line-height: 100%;text-align: center;">
		<img src="${ctx}/image/loading.gif" style="width:50px; position: absolute; top:50%;margin-top: -25px;">
	</div>
</body>
</html>
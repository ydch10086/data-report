<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<input type="hidden" name="ctx" id="ctx" value="${ctx}">
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
<script type="text/javascript" src="${ctx}/js/laydate/laydate.dev.js"></script>
<script type="text/javascript">
	var basepathUrl = "${basepathUrl}";
</script>
<script src="${ctx }/js/fuzzyQuery.js"></script>
<script type="text/javascript">
	//日期比较方法	
    function dateCompare (date1, date2) {
	    data1 = date1.replace (/-/g, "/");
	    data2 = date2.replace (/-/g, "/");
	    var date1 = new Date (date1).getTime ();
	    var date2 = new Date (date2).getTime ();
	    return parseInt ((date2 - date1) / (1000 * 60 * 60 * 24));
    }
    function queryAll () {
	    if ($ ("input[name='scanStartTime']").val () != "" && $ ("input[name='scanEndTime']").val () != ""){
		    if (dateCompare ($ ("input[name='scanStartTime']").val (), $ ("input[name='scanEndTime']").val ()) < 0){
			    alert ("开始时间不能大于结束时间");
			    return false;
		    } else if (dateCompare ($ ("input[name='scanStartTime']").val (), $ ("input[name='scanEndTime']").val ()) != $ (".selday").val ()){
			    alert ("选择的扫描时间与查询天数不匹配");
			    return false;
		    }
	    }
	    var reqParams = "";
	    if ($ (".selType").is (':checked')){
		    reqParams = { 'billNo' : $ ("input[name='billNo']").val (), 'pageSize' : $ (".pageSize").val (), 'pageNum' : $ (".pageNum").val () };
	    } else{
		    var pageNum = $ ("input[name='billNo']").val ();
		    $ ("input[name='billNo']").val ("");
		    reqParams = $ ('#subform').serialize ();
		    $ ("input[name='billNo']").val (pageNum);
	    }
	    $.ajax ({ type : "POST", async : false, url : "queryStayScan", data : reqParams, dataType : "text", success : function (data) {
		    var pageEntity = JSON.parse (data);
		    var dataList = pageEntity["dataList"];
		    var htm = "";
		    for (var i = 0; i < dataList.length; i++){
			    htm += "<tr><td>" + dataList[i].stayId + "</td><td>" + dataList[i].billNo + "</td><td>" + dataList[i].siteName + "</td>";
			    htm += "<td>" + dataList[i].createBy + "</td><td>" + dataList[i].scanTime + "</td><td>" + dataList[i].scanSource + "</td>";
			    htm += "<td>" + dataList[i].deviceCode + "</td></tr>";
		    }
		    $ ("#tbodylist").html (htm);
		    $ (".listTable tr th").each (function (index) {
			    $ (this).width ($ ("#tbodylist tr td").eq (index).width ());
		    });
		    var pageNumCount = pageEntity.total;//当前记录总数
		    if (pageNumCount < 5){
			    $ (".page").hide ();
		    } else{
			    $ (".page").show ();
			    var pageNum = $ (".pageNum").val ();//当前页
			    var pageSize = $ (".pageSize").val ();//当前页显示个数
			    var startNum = (pageNum - 1) * pageSize + 1;//起始记录
			    var endNum = pageNum * pageSize;//结束记录
			    if (endNum > pageNumCount){
				    endNum = pageNumCount
			    }
			    $ (".pageinfo").html ("显示第" + startNum + "至" + endNum + "项记录，共" + pageEntity.total + "项");
			    // 得到总页数
			    var pageCount;
			    if (pageNumCount / pageSize == 0){
				    pageCount = pageNumCount / pageSize;
			    } else{
				    pageCount = Math.ceil (pageNumCount / pageSize);
			    }
			    $ (".pageCount").val (pageCount);
			    var pageNumhtml = "";
			    for (var i = 1; i <= pageCount; i++){
				    if (pageNum == i){
					    pageNumhtml += "<option selected='selected' value='"+i+"'>" + i + "</option>";
				    } else{
					    pageNumhtml += "<option value='"+i+"'>" + i + "</option>";
				    }
			    }
			    $ (".pageNum").html (pageNumhtml);
			    //翻页按钮颜色改变
			    if (pageCount == 1){
				    $ (".prePage").add (".nextPage").css ("color", "#AAA");
			    } else if (pageNum == 1){
				    $ (".prePage").css ("color", "#AAA");
				    $ (".nextPage").css ("color", "#00F");
			    } else if (pageNum == pageCount){
				    $ (".prePage").css ("color", "#00F");
				    $ (".nextPage").css ("color", "#AAA");
			    } else{
				    $ (".prePage").add (".nextPage").css ("color", "#00F");
			    }
		    }
	    } });
    }
    $ (window).resize (function () {
	    $ (".list").height ($ ("body").height () - $ (".condition").height () - $ (".page").height () - 103);// 数据高度自适应
    });
    $ (function () {
	    $ (".list").height ($ ("body").height () - $ (".condition").height () - $ (".page").height () - 103);//数据高度自适应
	    $ (".subbtn").click (function () {
		    queryAll ();
	    });//提交按钮
	    $ (".cleanbtn").click (function () {//清除按钮
		    var pageNum = $ (".pageNum").val ();
		    var pageSize = $ (".pageSize").val ();
		    $ ('#subform')[0].reset ();
		    $ (".pageNum").val (pageNum);
		    $ (".pageSize").val (pageSize);
		    $ (".dayNum").css ("border-color", "#fff");
		    $ (".dayNum").eq (0).css ("border-color", "#BABABA");
		    $ (".selday").val (1);
		    $ ("input[name='siteId']").val ("");
		    $ ("input[name='createById']").val ("");
	    });
	    $ (".dayNum").click (function () {//天数选择
		    $ (".dayNum").css ("border-color", "#fff");
		    $ (this).css ("border-color", "#BABABA");
		    $ (".selday").val ($ (this).index ());
	    });
	    $ (".prePage").click (function () {//上一页
		    if ($ (".pageNum").val () > 1){
			    $ (".pageNum").val (parseInt ($ (".pageNum").val ()) - 1);
			    queryAll ();
		    }
	    });
	    $ (".nextPage").click (function () {//下一页
		    if ($ (".pageNum").val () < parseInt ($ (".pageCount").val ())){
			    $ (".pageNum").val (parseInt ($ (".pageNum").val ()) + 1);
			    queryAll ();
		    }
	    });
	    $ (".pageNum").change (function () {//页数改变
		    queryAll ();
	    });
	    $ (".pageSize").change (function () {//条数改变
		    $ (".pageNum").val (1);
		    queryAll ();
	    });
	    
	    $ ("#dataPage .disbtn").click (function () {// 隐藏显示查询条件
		    if ($ (this).attr ("src") == $ ("#ctx").val () + "/image/addimg.png"){
			    $ (".condition").css ("overflow-x", "auto");
			    $ (".condition").animate ({ height : '171.5px' });
			    $ (this).attr ("src", $ ("#ctx").val () + "/image/removeimg.png");
			    $ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 275);// 数据高度自适应
		    } else{
			    $ (".condition").css ("overflow-x", "hidden");
			    $ (".condition").animate ({ height : '35px' });
			    $ (this).attr ("src", $ ("#ctx").val () + "/image/addimg.png");
			    $ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 138);// 数据高度自适应
		    }
	    });
    });
</script>
</head>
<body id="dataPage">
	<form id="subform" method="post">
		<div class="condition">
			<div style="min-width: 1500px;">
				<div class="subdiv">
					<input type="button" value="查询" class="subbtn" />
					<input type="button" value="清除" class="cleanbtn" />
					<img src="${ctx}/image/removeimg.png" class="disbtn" />
				</div>
				<div class="textdiv">
					<span>条件查询</span>
					<table>
						<tr>
							<td width="250px">
								<input type="checkbox" class="selType" />
								<span>按单号查询</span>
							</td>
							<td width="450px">
								<label class="label">查询天数</label>
								<input type="button" class="dayNum" value="一天" style="border-color: #BABABA;" />
								<input type="button" class="dayNum" value="两天" />
								<input type="button" class="dayNum" value="三天" style="margin-right: 0px;" />
								<input type="hidden" class="selday" value="1" />
							</td>
							<td>
								<label class="label">扫描网点</label>
								<input type="text" class="text" onkeyup="networkFuzzy(event,this,'siteId');" />
								<input type="hidden" name="siteId" />
							</td>
						</tr>
						<tr>
							<td>
								<label class="label" style="margin-left: 0px;">输入单号</label>
								<input type="text" name="billNo" class="text" />
							</td>
							<td>
								<label class="label">扫描时间</label>
								<input type="text" name="scanStartTime" class="text" readonly="readonly" onclick="laydate()" />
								<span>--</span>
								<input type="text" name="scanEndTime" class="text" readonly="readonly" onclick="laydate()" />
							</td>
							<td>
								<label class="label">扫描人</label>
								<input type="text" class="text" onkeyup="employeeFuzzy(event,this,'createById');" />
								<input type="hidden" name="createById" />
								<label class="label">扫描人11</label>
								<input type="text" class="text" onkeyup="employeeFuzzy(event,this,'createById');" />
								<input type="hidden" name="createById" />
								<label class="label">扫描人11</label>
								<input type="text" class="text" onkeyup="employeeFuzzy(event,this,'createById');" />
								<input type="hidden" name="createById" />
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
						<th>标题1</th>
						<th>标题2</th>
						<th>标题3</th>
						<th>标题4</th>
						<th>标题5</th>
						<th>标题6</th>
						<th>标题7</th>
					</tr>
				</table>
				<div class="list">
					<table id="tbodylist"></table>
				</div>
			</div>
		</div>
		<div class="page">
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
	</form>
</body>
</html>
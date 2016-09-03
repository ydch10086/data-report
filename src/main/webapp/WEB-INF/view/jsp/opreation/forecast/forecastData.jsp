<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<input type="hidden"  name="ctx" id="ctx" value="${ctx}">
<c:set var="basepathUrl" value="${pageContext.request.scheme}${'://'}${pageContext.request.serverName}${':'}${pageContext.request.serverPort}${pageContext.request.contextPath}${'/'}" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<title></title>
		<link rel="stylesheet" href="${ctx}/css/common.css">
		<link rel="stylesheet" href="${ctx}/css/sweetalert.css">
		<script src="${ctx }/js/jquery/jquery.min-1.11.3.js"></script>
		<script type="text/javascript">var basepathUrl = "${basepathUrl}";</script>
		<script src="${ctx }/js/fuzzyQuery.js"></script>
		<script src="${ctx }/js/sweetalert.min.js"></script>
		<script type="text/javascript" src="${ctx}/js/laydate/laydate.dev.js"></script>
		<script type="text/javascript">
			$(window).resize(function(){
				$("#list").height($("body").height() -$(".condition").height()-$(".page").height()-140);// 数据高度自适应
			});
			$(function(){
				$("#list").height($("body").height() -$(".condition").height()-$(".page").height()- 140);// 数据高度自适应
				$ ("#dataPage .disbtn").click (function () {// 隐藏显示查询条件
					if ($ (this).attr ("src") == $("#ctx").val()+"/image/addimg.png"){
						$(".condition").animate({height:'171.5px'});
						$ (this).attr ("src",  $("#ctx").val()+"/image/removeimg.png");
						$ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 240);// 数据高度自适应
					} else{
						$(".condition").animate({height:'35px'});
						$ (this).attr ("src",  $("#ctx").val()+"/image/addimg.png");
						$ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 123);// 数据高度自适应
					}
				});
				$(".prePage").click(function(){//上一页
					if($(".pageNum").val()>1){
						$(".pageNum").val(parseInt($(".pageNum").val())-1);
						searchData();
					}
				});
				$(".nextPage").click(function(){//下一页
					if($(".pageNum").val()<$(".pageCount").val()){
						$(".pageNum").val(parseInt($(".pageNum").val())+1);
						searchData();
					}
				});
				$(".pageNum").change(function(){//页数改变
					searchData();
				});
				$(".pageSize").change(function(){//条数改变
					$(".pageNum").val(1);
					searchData();
				});
			});
		</script>
	</head>
	<body id="dataPage">
		<form id="subform" method="post">
		<div class="condition">
			<div style="min-width: 1150px;">
				<div class="subdiv">
					<input type="button" value="查询" class="subbtn" id="searchBtn"/>
			        <input type="button" value="清除" class="cleanbtn" id="cleanBtn"/>
					<img src="${ctx}/image/removeimg.png" class="disbtn" />
				</div>
				<div class="textdiv">
					<span>条件查询</span>
					<table>
					<tr>
					    <td>
							<label class="label">目的分拨</label>
							<input type="text"  name="siteName" id="siteName" class="text txts" style="width:200px;" onkeyup="networkFuzzy(event,this,'obj');"/>
							<input type="hidden" class="obj"/>
						</td>
						<td>
						    <label class="label">车牌号</label>
							<input type="text"  name="plateNum" id="plateNum" class="text" style="width:200px;"/>
						</td>
						<td>
							<label class="label">车辆状态</label>
							<select id="carStatus" class="text" style="width:200px;">
							     <option selected="selected" value="-1">全部</option>
								 <option value="0">未发车</option>
								 <option value="1">已发车</option>
								 <option value="2">已到达</option>
							</select>
						</td>
					</tr>
				</table>
				</div>
			</div>
		</div>
		<ul class="tabDiv">
			<li class="tabDivli1 tabData">数据列表</li>
			<li class="tabDivli2 tabDetail" style="margin-left: -26px;">详细信息</li>
		</ul>
		<div class="listDate" >
			<div class="data" id="DataList">
				    <div id="foreCastData"  style="min-width: 1550px;">
					 	<table class="listTable"> 
					 		<tr>
					 		    <th width="4%">序号</th>
					 			<th width="10%">封车时间</th>
					 			<th width="8%">车牌号</th>
					 			<th width="8%">上一分拨</th>
					 			<th width="8%">包数</th>
					 			<th width="8%">容积</th>
					 			<th width="10%">计划出发时间</th>
					 			<th width="10%">计划到达时间</th>
					 			<th width="10%">实发时间</th>
					 			<th>实到时间</th>
					 			<th width="8%">车辆状态</th>
					 		</tr>
					 	</table>
					 	<div id="list" class="list">
					 	   <table id="tbodylist">
					 	   </table>
					 	</div>
					 </div>
					 <div id="detailData" style="min-width: 900px;" class="dataNoShow">
					 	 <table class="listTable">
							<tr>
								<th width="4%">序号</th>
								<th width="24%">集包号</th>
								<th width="24%">票数</th>
								<th width="24%">寄件分拨</th>
								<th width="24%">目的分拨</th>
							</tr>
					    </table>
						<div class="list">
						    <table id="tbodylistDetail">
							</table>
						</div>
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
					<option value="15" selected="selected">15</option>
					<option value="20">20</option>
					<option value="30">30</option>
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
	<script type="text/javascript">

	$(function() {
		//查询按钮单击事件
		$("#searchBtn").bind("click", function() {
			 $(".pageSize").val(15),
			 $(".pageNum").val(1);
		     var siteName = $("#siteName").val();
			 var plateNum = $("#plateNum").val();
			 if(siteName=="" && plateNum==""){
				 swal("查询条件不能为空!");
				 return false;
			 } 
			searchData();
		});
		//清楚按钮单击事件
		$("#cleanBtn").bind("click", function() {
			$(".text").val("");
			$("#carStatus").val("-1");
		});
		 $(".tabData").bind("click", function() {
			 showDataStyle();
			});
		 $(".tabDetail").bind("click", function() {
			 showDetailStyle();
			});
	});

	function searchData() {
	   $(".loadDiv").show();
	   showDataStyle();
	   var url = "queryForecastDataByParams";
	   var siteName =  $("#siteName").val();
	   var plateNum =  $("#plateNum").val();
	   var carStatus =  $("#carStatus").val();
	   var jsonData = {
  				"nextSite":siteName,
  				"vehicleNumber":plateNum,
  				"carStatus":carStatus,
  				'pageSize' : $(".pageSize").val(),
  				'pageNum' : $(".pageNum").val()
			};
	   $.ajax({
		   type: "POST",
		   url: url,
		   dataType:"text",
		   data : jsonData,
		   success: function(htm){
		     $("#tbodylist").html(htm);
		     $(".loadDiv").hide();
		   }
		});
	};
	
	function getdetail(params){
		     var url = "queryLoadCarDetailParams";
			 $.ajax({
			   type: "POST",
			   url: url,
			   dataType: "text",
			   data : params,
			   success: function(htm){
			   showDetailStyle();
			   $("#tbodylistDetail").html(htm);
			   }
			});
	};

	function showDetailStyle(){
		   $(".tabData").css("background-image","url('../image/tabDivli2.png')");
		   $(".tabData").css("color","#000");
		   $(".tabDetail").css("color","#FFF");
		   $(".tabDetail").css("background-image","url('../image/tabDivli1.png')");
		   $("#foreCastData").addClass("dataNoShow");
		   $("#detailData").removeClass("dataNoShow");	
		   $(".page").css("display","none");
	};
	function showDataStyle(){
		 $(".tabData").css("background-image","url('../image/tabDivli1.png')");
		 $(".tabData").css("color","#FFF");
		 $(".tabDetail").css("color","#000");
		 $(".tabDetail").css("background-image","url('../image/tabDivli2.png')");
		 $("#foreCastData").removeClass("dataNoShow");
		 $("#detailData").addClass("dataNoShow");
		 $(".page").css("display","block");
	};	
	function pagingMethod(pageEntity,pageCount){
	   $(".pageCount").val(pageCount);
		var pageNumCount = pageEntity;// 当前记录总数
		if (pageNumCount < 5) {
			$(".page").hide();
		} else {
			$(".page").show();
			var pageNum = $(".pageNum").val();// 当前页
			var pageSize = $(".pageSize").val();// 当前页显示个数
			var startNum = (pageNum - 1) * pageSize + 1;// 起始记录
			var endNum = pageNum * pageSize;// 结束记录
			if (endNum > pageNumCount) {
				endNum = pageNumCount
			}
			$(".pageinfo").html(
					"显示第" + startNum + "至" + endNum + "项记录，共"
							+ pageNumCount + "项");
			// 得到总页数
			var pageCount;
			if (pageNumCount / pageSize == 0) {
				pageCount = pageNumCount / pageSize;
			} else {
				pageCount = Math.ceil(pageNumCount / pageSize);
			}
			$(".pageCount").val(pageCount);
			var pageNumhtml = "";
			for (var i = 1; i <= pageCount; i++) {
				if (pageNum == i) {
					pageNumhtml += "<option selected='selected' value='"
							+ i + "'>" + i + "</option>";
				} else {
					pageNumhtml += "<option value='" + i + "'>" + i
							+ "</option>";
				}
			}
			$(".pageNum").html(pageNumhtml);
			// 翻页按钮颜色改变
			if (pageCount == 1) {
				$(".prePage").add(".nextPage").css("color", "#AAA");
			} else if (pageNum == 1) {
				$(".prePage").css("color", "#AAA");
				$(".nextPage").css("color", "#00F");
			} else if (pageNum == pageCount) {
				$(".prePage").css("color", "#00F");
				$(".nextPage").css("color", "#AAA");
			} else {
				$(".prePage").add(".nextPage").css("color", "#00F");
			}
		}
	};
</script>
</html>
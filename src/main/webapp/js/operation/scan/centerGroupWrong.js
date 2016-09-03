//日期比较方法	
function dateCompare(date1,date2,flag){
	data1=date1.replace(/-/g, "/");
	data2=date2.replace(/-/g, "/");
	var date1 = new Date(date1).getTime();
	var date2 = new Date(date2).getTime();
	if(flag == 1){
		return parseInt((date2 - date1)/ (1000 * 60 * 60 * 24));
	}else{
		return (parseInt((date2 - date1)/ (1000 * 60 * 60 * 24))) + 1;
	}
}
$(window).resize(function(){
	$(".list").height($("body").height() -$(".condition").height()-$(".page").height()- 135);// 数据高度自适应
});
$(function(){
	$(".list").height($("body").height() -$(".condition").height()-$(".page").height()- 135);// 数据高度自适应

	//选择查询类型
	$(".wrongPack").click(function() {
		var data = $(".wrongPack").attr("data");
		$(".wrongEwb").css("border-color", "#fff");
		$(this).css("border-color", "#BABABA");
		$(".wrongEwb").removeClass("btnSelected");
		$(this).addClass("btnSelected");
		$("input[name='wrongType']").val(20);
		$(".tabDivli2").show();
		$("#show2").hide();
		$("#show1").show();
		$(".packNum").show();
		$(".packTypes").show();
		$("#packSpec").show();
		$("#packType").show();
		$("#packType").attr("disabled",false);
		$("#packSpec").attr("disabled",false); 
		$(".pageNum").val(1);
		$(".loadDiv").show();
		queryAll(data);
	});
	$(".wrongEwb").click(function() {
		var data = $(".wrongEwb").attr("data");
		$(".wrongPack").css("border-color", "#fff");
		$(this).css("border-color", "#BABABA");
		$(".wrongPack").removeClass("btnSelected");
		$(this).addClass("btnSelected");
		$(".tabDiv li").removeClass().addClass("tabDivli2");
		$(".tabDiv li").eq(0).removeClass().addClass("tabDivli1");
		$(".tabDivli2").hide();
		$(".packNum").hide();
		$(".packTypes").hide();
		$("#packSpec").hide();
		$("#packType").hide();
		$("#show1").hide();
		$("#show2").show();
		$("input[name='wrongType']").val(10);
		$("#packType").attr("disabled",true);
		$("#packSpec").attr("disabled",true); 
		$(".loadDiv").show();
		queryAll(data);
	});
	//赋值当前时间
	$("input[name='scanStartTime']").val(getStartDate());
	$("input[name='scanEndTime']").val(getStartDate());
	//天数选择
	$(".dayNum").click(function(){
		$(".dayNum").css("border-color","#fff");
		$(this).css("border-color","#BABABA");
		$(".selday").val($(this).index());
		var dayValue=$(this).index();
		if(dayValue == 0){
			$("#queryStartTime").val(setDayVal(0).format('YYYY-MM-DD'));
			$("#queryEndTime").val(getStartDate());
		}
		if(dayValue == 1){
			$("#queryStartTime").val(setDayVal(2).format('YYYY-MM-DD'));
			$("#queryEndTime").val(getStartDate());
		}
		if(dayValue == 2){
			$("#queryStartTime").val(setDayVal(6).format('YYYY-MM-DD'));
			$("#queryEndTime").val(getStartDate());
		}
		if(dayValue == 3){
			$("#queryStartTime").val(setDayVal(14).format('YYYY-MM-DD'));
			$("#queryEndTime").val(getStartDate());
		}
		if(dayValue == 4){
			$("#queryStartTime").val(getLastMonthYestdy(new Date()));
//			$("#queryStartTime").val(getPreMonth(getStartDate()));
//			alert(getPreMonth("2014-03-31"));
			$("#queryEndTime").val(getStartDate());
		}
		$ ("#dataPage .disbtn").click (function () {// 隐藏显示查询条件
			if ($ (this).attr ("src") == $("#ctx").val()+"/image/addimg.png"){
				$(".condition").css("overflow-x","auto");
				$(".condition").animate({height:'171.5px'});
				$ (this).attr ("src",  $("#ctx").val()+"/image/removeimg.png");
				$ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 307);// 数据高度自适应
			} else{
				$(".condition").css("overflow-x","hidden");
				$(".condition").animate({height:'35px'});
				$ (this).attr ("src",  $("#ctx").val()+"/image/addimg.png");
				$ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 170);// 数据高度自适应
			}
		});
	});
	//选项卡切换
	$(".tabDiv li").click(function(){
		$(".tabDiv li").removeClass().addClass("tabDivli2");
		$(this).removeClass().addClass("tabDivli1");
		if($(this).index()>0){
			$(".listDate").hide();
			$(".detailedInfo").show();
		}else{
			$(".listDate").show();
			$(".detailedInfo").hide();
		}
	});
	listDatePage();
	detailedInfoPage();
});

//数据列表翻页
function listDatePage(){
	$(".prePage").click(function(){//上一页
		if($(".pageNum").val()>1){
			$(".pageNum").val(parseInt($(".pageNum").val())-1);
			queryAll();
		}
	});
	$(".nextPage").click(function(){//下一页
		if($(".pageNum").val()<parseInt($(".pageCount").val())){
			$(".pageNum").val(parseInt($(".pageNum").val())+1);
			queryAll();
		}
	});
	$(".pageNum").change(function(){//页数改变
		queryAll();
	});
	$(".pageSize").change(function(){//条数改变
		$(".pageNum").val(1);
		queryAll();
	});
}

//详细信息翻页
function detailedInfoPage(){
	$(".prePage1").click(function(){//上一页
		if($(".pageNum1").val()>1){
			$(".pageNum1").val(parseInt($(".pageNum1").val())-1);
			queryInfoAll();
		}
	});
	$(".nextPage1").click(function(){//下一页
		if($(".pageNum1").val()<$(".pageCount1").val()){
			$(".pageNum1").val(parseInt($(".pageNum1").val())+1);
			queryInfoAll();
		}
	});
	$(".pageNum1").change(function(){//页数改变
		queryInfoAll();
	});
	$(".pageSize1").change(function(){//条数改变
		$(".pageNum1").val(1);
		queryInfoAll();
	});
	$ ("#dataPage .disbtn").click (function () {// 隐藏显示查询条件
		if ($ (this).attr ("src") == $("#ctx").val()+"/image/addimg.png"){
			$(".condition").css("overflow-x","auto");
			$(".condition").animate({height:'171.5px'});
			$ (this).attr ("src",  $("#ctx").val()+"/image/removeimg.png");
			$ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 307);// 数据高度自适应
		} else{
			$(".condition").css("overflow-x","hidden");
			$(".condition").animate({height:'35px'});
			$ (this).attr ("src",  $("#ctx").val()+"/image/addimg.png");
			$ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 170);// 数据高度自适应
		}
	});
}

function queryAll(data) {
	$(".listDate").show();
	$(".detailedInfo").hide();
	$(".tabDiv li").removeClass().addClass("tabDivli2");
	$(".tabDiv li").eq(0).removeClass().addClass("tabDivli1");
	var dataValue = data;
	$(".page1").show();
	if ($("input[name='scanStartTime']").val() != ""
			&& $("input[name='scanEndTime']").val() != "") {
		if (dateCompare($("input[name='scanStartTime']").val(), $(
				"input[name='scanEndTime']").val()) < 0) {
			$(".loadDiv").hide();
			alert("开始时间不能大于结束时间");
			return false;
		}
		t = dateDiff($("input[name='scanEndTime']").val(),$("input[name='scanStartTime']").val());
		if(t>30){
			$(".loadDiv").hide();
			alert("只能查询一个月内的数据");
			return false;
		}
	}
	var wrongType = $("input[name='wrongType']").val();
	var groupSiteId = "";
	//获取分拨名称
	if ($("input[name='siteName']").val()!="总部"||$("input[name='siteId']").val()!=2001) {
		groupSiteId=$("input[name='siteId']").val();
	}
	var url = "";
	if (wrongType == 10) {
		url = "queryEwbByPage";
	} else {
		url = "queryPackByPage";
	}
	var reqParams = {
		'pageSize' : $(".pageSize").val(),
		'pageNum' : $(".pageNum").val(),
		'groupSiteId' : groupSiteId,
		'queryStartTime' : $("input[name='scanStartTime']").val(),
		'queryEndTime' : $("input[name='scanEndTime']").val(),
		'packSpec' : $("#packSpec").val(),
		'packType' : $("#packType").val(),
	};
	$
			.ajax({
				type : "POST",
				async : false,
				url : url,
				data : reqParams,
				dataType : "text",
				success : function(data) {
					var pageEntity = JSON.parse(data);
					var dataList = pageEntity["dataList"];
					if (dataList.length > 0) {
						showData(dataList,dataValue,wrongType);
						
					} else {
						$("#tbodylist1").html('<tr><td colspan ="11"><center style="color:red">查询无数据</center></td></tr>');
						$("#tbodylist2").html('<tr><td colspan ="11"><center style="color:red">查询无数据</center></td></tr>');
					}				
					$(document).unbind("click");
					$(document).unbind("dblclick");
					//数据列表单击
					$(document).unbind("click");
					$("#tbodylist1 tr").click(function(){
						$("#tbodylist1 tr").removeClass("selectedTr");
						$(this).addClass("selectedTr");
						$(".packBarCode").val($(this).find("td").eq(2).html());
						queryInfoAll();
					});
					//数据列表双击
					$("#tbodylist1 tr").dblclick(function(){
						$(".tabDiv li").removeClass().addClass("tabDivli2");
						$(".tabDiv li").eq(1).removeClass().addClass("tabDivli1");
						$(".listDate").hide();
						$(".detailedInfo").show();
						$(".detailedInfo .listTable tr th").each(function(index){
							$(this).width($("#tbodylinfo tr td").eq(index).width());
						});
					});
					var pageNumCount = pageEntity.total;// 当前记录总数
					var pageNumCount = pageEntity.total;//当前记录总数
					
					if(pageNumCount<1){
						$(".page1").hide();
					}else{

						$(".page1").show();
						var pageNum=$(".pageNum").val();//当前页
						var pageSize=$(".pageSize").val();//当前页显示个数
						var startNum=(pageNum-1)*pageSize+1;//起始记录
						var endNum=pageNum*pageSize;//结束记录
						if(endNum>pageNumCount){endNum=pageNumCount}
						$(".pageinfo").html("显示第"+startNum+"至"+endNum+"项记录，共"+pageEntity.total+"项");
						// 得到总页数
						var pageCount;
						if (pageNumCount / pageSize == 0) {
							pageCount = pageNumCount / pageSize;
						} else {
							pageCount = Math.ceil(pageNumCount / pageSize);
						}
						$(".pageCount").val(pageCount);
						var pageNumhtml="";
						for (var i = 1; i <=pageCount; i++) {
							if(pageNum==i){
								pageNumhtml+="<option selected='selected' value='"+i+"'>"+i+"</option>";
							}else{
								pageNumhtml+="<option value='"+i+"'>"+i+"</option>";
							}
						}
						$(".pageNum").html(pageNumhtml);
						//翻页按钮颜色改变
						if(pageCount==1){
							$(".prePage").add(".nextPage").css("color","#AAA");
						}else if(pageNum==1){
							$(".prePage").css("color","#AAA");
							$(".nextPage").css("color","#00F");
						}else if(pageNum==pageCount){
							$(".prePage").css("color","#00F");
							$(".nextPage").css("color","#AAA");
						}else{
							$(".prePage").add(".nextPage").css("color","#00F");
						}
					}
					$(".loadDiv").hide();
				}
			});
};

function showData(dataList,data,wrongType){
	var htm = "";
	for (var i = 0; i < dataList.length; i++) {
		var num = i + 1
		htm += "<tr><td>" + num + "</td><td>"
				+ dataList[i].groupSite + "</td>";
		if (wrongType == 10) {
			htm += "<td>" + dataList[i].ewbNo + "</td>"
		} else {
			htm += "<td>" + dataList[i].packBarCode
					+ "</td>"
		}
		if(data=="1"){
			htm += "<td>" + dataList[i].shouldSplitSite
			+ "</td><td>" + dataList[i].realSplitSite
			+ "</td><td>" + dataList[i].scanMan
			+ "</td><td>" + dataList[i].groupDate
			+ "</td><td>" + (dataList[i].ewbNum == 0 ? "" : dataList[i].ewbNum)
			+ "</td><td>" + (dataList[i].wrongNum == 0 ? "" : dataList[i].wrongNum)
			+ "</td><td>" + dataList[i].packSpec
			+ "</td>";
	     htm += "<td>" + dataList[i].packType + "</td></tr>";
	     $("#tbodylist1").html(htm);
	     $(".listDate .listTable tr th").each(function(index){
					$(this).width($("#tbodylist1 tr td").eq(index).width());
				});
		}else{
			htm += "<td>" + dataList[i].shouldSplitSite
			+ "</td><td>" + dataList[i].realSplitSite
			+ "</td><td>" + dataList[i].scanMan
			+ "</td><td>" + dataList[i].groupDate+"</td></tr>";
			$("#tbodylist2").html(htm);
			$(".listDate #wrongId tr th").each(function(index){
				$(this).width($("#tbodylist2 tr td").eq(index).width());
			});
		}
	}
	$("#tbodylinfo").html("");
}

//查询详细信息数据
function queryInfoAll(packBarCode){
	$(".page2").show();
	if($(".packBarCode").val()==""){
		return false;
	}
	var reqParams={
		'packBarCode':$(".packBarCode").val() ,
		'pageSize' : $(".pageSize1").val(),
		'pageNum' : $(".pageNum1").val()};
	$.ajax({
		type : "POST",
		async : false,
		url : "queryPackItemsByPage",
		data : reqParams ,
		dataType : "text",
		success : function(data) {
			var pageEntity = JSON.parse(data);
			var dataList = pageEntity["dataList"];
			var htm="";
			for (var i = 0; i < dataList.length; i++) {
				htm+="<tr><td>"+(i+1)+"</td><td>"+dataList[i].packBarCode+"</td><td>"+
				dataList[i].ewbNo+"</td><td>"+dataList[i].sendSite+"</td><td>"
				+dataList[i].sendCenterSite+"</td><td>"
				+dataList[i].shouldSplitSite+"</td></tr>"
			}
			$("#tbodylinfo").html(htm);
			var pageNumCount = pageEntity.total;//当前记录总数
			if(pageNumCount<5){
				$(".page2").hide();
			}else{
				$(".page2").show();
				var pageNum=$(".pageNum1").val();//当前页
				var pageSize=$(".pageSize1").val();//当前页显示个数
				var startNum=(pageNum-1)*pageSize+1;//起始记录
				var endNum=pageNum*pageSize;//结束记录
				if(endNum>pageNumCount){endNum=pageNumCount}
				$(".pageinfo1").html("显示第"+startNum+"至"+endNum+"项记录，共"+pageEntity.total+"项");
				// 得到总页数
				var pageCount;
				if (pageNumCount / pageSize == 0) {
					pageCount = pageNumCount / pageSize;
				} else {
					pageCount = Math.ceil(pageNumCount / pageSize);
				}
				$(".pageCount1").val(pageCount);
				var pageNumhtml="";
				for (var i = 1; i <=pageCount; i++) {
					if(pageNum==i){
						pageNumhtml+="<option selected='selected' value='"+i+"'>"+i+"</option>";
					}else{
						pageNumhtml+="<option value='"+i+"'>"+i+"</option>";
					}
				}
				$(".pageNum1").html(pageNumhtml);
				//翻页按钮颜色改变
				if(pageCount==1){
					$(".prePage1").add(".nextPage1").css("color","#AAA");
				}else if(pageNum==1){
					$(".prePage1").css("color","#AAA");
					$(".nextPage1").css("color","#00F");
				}else if(pageNum==pageCount){
					$(".prePage1").css("color","#00F");
					$(".nextPage1").css("color","#AAA");
				}else{
					$(".prePage1").add(".nextPage1").css("color","#00F");
				}
			}
		}
	});
}
//初始开始时间
function getStartDate() {
	var date = new Date();
	var seperator1 = "-";
	var seperator2 = ":";
	var month = date.getMonth() + 1;
	var strDate = date.getDate();
	if (month >= 1 && month <= 9) {
		month = "0" + month;
	}
	if (strDate >= 0 && strDate <= 9) {
		strDate = "0" + strDate;
	}
	var currentdate = date.getFullYear() + seperator1 + month + seperator1
			+ strDate;
	return currentdate;
}
function getLastMonthYestdy(date){  
  var daysInMonth = new Array([0],[31],[28],[31],[30],[31],[30],[31],[31],[30],[31],[30],[31]);  
  var strYear = date.getFullYear();    
  var strDay = date.getDate();    
  var strMonth = date.getMonth()+1;  
  if(strYear%4 == 0 && strYear%100 != 0){  
     daysInMonth[2] = 29;  
  }  
  if(strMonth - 1 == 0)  
  {  
     strYear -= 1;  
     strMonth = 12;  
  }  
  else  
  {  
     strMonth -= 1;  
  }  
  strDay = daysInMonth[strMonth] >= strDay ? strDay : daysInMonth[strMonth];  
  if(strMonth<10)    
  {    
     strMonth="0"+strMonth;    
  }  
  if(strDay<10)    
  {    
     strDay="0"+strDay;    
  }  
  datastr = strYear+"-"+strMonth+"-"+strDay;  
  return datastr;  
}  
extend = function (a, b) { //合并对象
  if (typeof a !== "object" || typeof b !== "object") {
      return;
  }
  for (key in b) {
      a[key] = b[key];
  }
  return a;
};
extend(Date.prototype, {
  /***********格式化日期[YYYY|YY]-MM-DD hh:mm:ss*************/
  format: function (format) {
      var self = this;
      return format.replace(/([a-z]+)/ig, function (a, b, c, d) {
          if (/Y{2,}/.test(b)) {
              return b.length === 4 ? self.getFullYear() : ('' + self.getFullYear()).substr(2);
          } else if (/M{2}/.test(b)) {
              return (self.getMonth() + 1) < 10 ? '0' + (self.getMonth() + 1) : self.getMonth() + 1;
          } else if (/D{2}/.test(b)) {
              return (self.getDate()) < 10 ? '0' + self.getDate() : self.getDate();
          } else if (/h{2}/.test(b)) {
              return self.getHours() < 10 ? '0' + self.getHours() : self.getHours();
          } else if (/m{2}/.test(b)) {
              return self.getMinutes() < 10 ? '0' + self.getMinutes() : self.getMinutes();
          } else if (/s{2}/.test(b)) {
              return self.getSeconds() < 10 ? '0' + self.getSeconds() : self.getSeconds();
          } else {
              return 0;
          }
      })
  }
});
function setDayVal(val) {
  var now = new Date();
  if (!/-?\d+/.test(val)) {
      return now;
  }
  now.setDate(now.getDate() - parseInt(val));
  return now;
}
//计算时间（相减）
function dateDiff(date1, date2) {
    var type1 = typeof date1, type2 = typeof date2;
    if (type1 == 'string')
        date1 = stringToTime(date1);
    else if (date1.getTime)
        date1 = date1.getTime();
    if (type2 == 'string')
        date2 = stringToTime(date2);
    else if (date2.getTime)
        date2 = date2.getTime();
    //alert((date1 - date2) / (1000*60*60)); 
    return (date1 - date2) / (1000 * 60 * 60 * 24); //结果是小时 
}
//字符串转成Time(dateDiff)所需方法 
function stringToTime(string) {
    var f = string.split(' ', 2);
    var d = (f[0] ? f[0] : '').split('-', 3);
    var t = (f[1] ? f[1] : '').split(':', 3);
    return (new Date(
   parseInt(d[0], 10) || null,
   (parseInt(d[1], 10) || 1) - 1,
    parseInt(d[2], 10) || null,
    parseInt(t[0], 10) || null,
    parseInt(t[1], 10) || null,
    parseInt(t[2], 10) || null
    )).getTime();
}
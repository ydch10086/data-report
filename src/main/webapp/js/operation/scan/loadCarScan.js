$(window).resize(function(){
	$(".list").height($("body").height() -$(".condition").height()-$(".page").height()- 150);// 数据高度自适应
});
$(function(){
	$(".list").height($("body").height()-$(".condition").height()-$(".page").height()- 150);//数据高度自适应
	$(".subbtn").click(function(){
		$(".loadDiv").show();
		$(".pageNum").val(1);
		queryAll();
	});//提交按钮
	//赋值当前时间
	$("input[name='scanStartTime']").val(getStartDate());
	$("input[name='scanEndTime']").val(getStartDate());
	//清除按钮
	$(".cleanbtn").click(function(){
		var pageNum=$(".pageNum").val();
		var pageSize=$(".pageSize").val();
		$('#subform')[0].reset();
		//赋值当前时间
		$("input[name='scanStartTime']").val(getStartDate());
		$("input[name='scanEndTime']").val(getStartDate());
		$(".pageNum").val(pageNum);
		$(".pageSize").val(pageSize);
		$(".dayNum").css("border-color","#fff");
		$(".dayNum").eq(0).css("border-color","#BABABA");
		$(".selday").val(1);
		$("input[name='scanSiteId']").val("");
		$("input[name='nextSiteId']").val("");
		$("input[name='createBy']").val("");
		$("input[name='createByName']").val("");
	});
	//天数选择
	$(".dayNum").click(function() {// 天数选择
		$(".dayNum").css("border-color", "#fff");
		$(this).css("border-color", "#BABABA");
		$(".selday").val($(this).index());
		var dayValue = $(this).index();
		if(dayValue==1 || dayValue==2 || dayValue==3 ){
			$("input[name='scanStartTime']").val(setDayVal(dayValue-1).format('YYYY-MM-DD'));
			$("input[name='scanEndTime']").val(getStartDate());
		}
	});
	
	$ ("#dataPage .disbtn").click (function () {// 隐藏显示查询条件
		if ($ (this).attr ("src") == $("#ctx").val()+"/image/addimg.png"){
			$(".condition").css("overflow-x","auto");
			$(".condition").animate({height:'171.5px'});
			$ (this).attr ("src",  $("#ctx").val()+"/image/removeimg.png");
			$ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 275);// 数据高度自适应
		} else{
			$(".condition").css("overflow-x","hidden");
			$(".condition").animate({height:'35px'});
			$ (this).attr ("src",  $("#ctx").val()+"/image/addimg.png");
			$ ("#dataPage .list").height ($ ("body").height () - $ (".page").height () - 138);// 数据高度自适应
		}
	});

	//选项卡切换
	$(".tabDiv li").click(function(){
		$(".tabDiv li").removeClass().addClass("tabDivli2");
		$(this).removeClass().addClass("tabDivli1");
		if($(this).index()>0){
			$(".listDate").hide();
			$(".detailedInfo").show();
			$(".detailedInfo .listTable tr th").each(function(index){
				$(this).width($("#tbodyLoadCarInfo tr td").eq(index).width());
			});
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
}
//查询数据列表数据
function queryAll(){
	
	$(".listDate").show();
	$(".detailedInfo").hide();
	$(".tabDiv li").removeClass().addClass("tabDivli1");
	$(".tabDiv li").eq(1).removeClass().addClass("tabDivli2");
	
	if($("input[name='scanStartTime']").val()!="" && $("input[name='scanEndTime']").val()!=""){
		if(dateCompare($("input[name='scanStartTime']").val(),$("input[name='scanEndTime']").val(),1)<0){
			$(".loadDiv").hide();
			alert("开始时间不能大于结束时间");
			return false;
		}/*else if(dateCompare($("input[name='scanStartTime']").val(),$("input[name='scanEndTime']").val(),2)!=$(".selday").val()){
			alert("选择的扫描时间与查询天数不匹配");
			return false;
		}*/
		t = dateDiff($("input[name='scanEndTime']").val(),$("input[name='scanStartTime']").val());
		if(t>2){
			$(".loadDiv").hide();
			alert("只能查询三天内的数据");
			return false;
		}
	}
	var reqParams="";
	//是否按单号查询
	if($(".selType").is(':checked')){
		var packBarCode = $.trim($("input[name='packBarCode']").val());
		if(!packBarCode){
			$(".loadDiv").hide();
			alert("请输入包号");
			return false;
		}
		reqParams={
			'packBarCode' : packBarCode,
			'pageSize' : $(".pageSize").val(),
			'pageNum' : $(".pageNum").val()};
	}else{
		var pageNum=$("input[name='packBarCode']").val();
		$("input[name='packBarCode']").val("");
		reqParams={
				'createBy' : $("input[name='createBy']").val(),
				'scanStartTime' : $("input[name='scanStartTime']").val(),
				'scanEndTime' : $("input[name='scanEndTime']").val(),
				'nextSite' : $("input[name='nextSiteId']").val(),
				'scanSite' : $("input[name='scanSiteId']").val(),
				'platenNum' : $.trim($("input[name='plateNum']").val()),
				'pageSize' : $(".pageSize").val(),
				'pageNum' : $(".pageNum").val()
		};
		$("input[name='packBarCode']").val(pageNum);
	}
	$.ajax({
		type : "POST",
		async : false,
		url : "queryLoadCarScan",
		data : reqParams ,
		dataType : "text",
		success : function(data) {
			var pageEntity = JSON.parse(data);
			var dataList = pageEntity["dataList"];
			if(dataList.length>0){
				var htm="";
				for (var i = 0; i < dataList.length; i++) {
					htm+="<tr><td>"+(i+1)+"</td><td>"+dataList[i].scanTime+"</td><td style='display:none'>"+dataList[i].taskNum+"</td><td>"+
					dataList[i].platenNum+"</td><td>"+dataList[i].packgeCount+"</td><td>"+dataList[i].scanSite+
					"</td><td>"+dataList[i].createBy+"</td><td>"+dataList[i].scanTime+"</td><td>"+dataList[i].nextSite+
					"</td><td>"+dataList[i].scanSourceName+"</td><td>"+dataList[i].deviceCode+"</td></tr>";
				}
				$("#tbodyLoadCarInfo").html("");
				$("#tbodyLoadCarList").html(htm);
				$(".listDate .listTable tr th").each(function(index){
					$(this).width($("#tbodyLoadCarList tr td").eq(index).width());
				});
			}else{
				$("#tbodyLoadCarInfo").html("");
				$("#tbodyLoadCarList").html('<tr><td colspan ="11"><center style="color:red">未查询到数据</center></td></tr>');
			}
			
			//数据列表单击
			$("#tbodyLoadCarList tr").click(function(){
				$("#tbodyLoadCarList tr").removeClass("selectedTr");
				$(this).addClass("selectedTr");
				$(".packBarCode").val($(this).find("td").eq(2).html());
				queryInfoAll();
			});
			//数据列表双击
			$("#tbodyLoadCarList tr").dblclick(function(){
				$(".tabDiv li").removeClass().addClass("tabDivli2");
				$(".tabDiv li").eq(1).removeClass().addClass("tabDivli1");
				$(".listDate").hide();
				$(".detailedInfo").show();
				$(".detailedInfo .listTable tr th").each(function(index){
					$(this).width($("#tbodyLoadCarInfo tr td").eq(index).width());
				});
			});
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
}

//查询详细信息数据
function queryInfoAll(packBarCode){
	if($(".packBarCode").val()==""){
		return false;
	}
	var reqParams={
		'taskNum':$(".packBarCode").val() ,
		'pageSize' : $(".pageSize1").val(),
		'pageNum' : $(".pageNum1").val()};
	$.ajax({
		type : "POST",
		async : false,
		url : "queryLoadCarScanByTastNum",
		data : reqParams ,
		dataType : "text",
		success : function(data) {
			var pageEntity = JSON.parse(data);
			var dataList = pageEntity["dataList"];
			var htm="";
			for (var i = 0; i < dataList.length; i++) {
				htm+="<tr><td>"+(i+1)+"</td><td>"+dataList[i].packNum+"</td><td>"+
				dataList[i].siteName+"</td><td>"+dataList[i].scanTime+"</td></tr>";
			}
			$("#tbodyLoadCarInfo").html(htm);
			
			var pageNumCount = pageEntity.total;//当前记录总数
			if(pageNumCount<1){
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

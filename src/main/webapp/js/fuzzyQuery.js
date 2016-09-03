
/**
 * 网点模糊查询
 * @param e  //按键值
 * @param thisEmt  //当前文本框
 * @param objVal  //id的赋值对象
 */
function networkFuzzy(e,thisEmt,objVal){
	var thisVal=$(thisEmt).val().replace(/(^\s+)|(\s+$)/g,"");
	if(e.keyCode==13 || e.keyCode==38 || e.keyCode==40){
		return false;
	}
	$(".vagueWin").remove();
	if(thisVal==""){
		$("."+objVal).val("");
		return false;
	}
	$.ajax({
		type : "POST",
		async : false,
		url : basepathUrl+"getBasicSiteByMatch",
		data : {'pNameCode' :thisVal} ,
		dataType : "text",
		success : function(data) {
			var dataList = JSON.parse(data);
			var htm="<div class='vagueWin'><input type='hidden' value='1' class='keySelected'/><img src='"+basepathUrl+"image/arrowTop.png'/>"
			+"<table cellspacing='0'><tr><th>网点编号</th><th>网点名称</th><th>网点拼音</th></tr>";
			for (var i = 0; i < dataList.length; i++) {
				htm+='<tr><input type="hidden" value="'+dataList[i].siteId+'"/><td>'+dataList[i].siteCode
				+'</td><td>'+dataList[i].siteName+'</td><td>'+dataList[i].sitePinyin+'</td></tr>';
			}
			drawTable(htm,thisEmt,objVal);
		}
	});
}

/**
 * 员工模糊查询
 * @param e //按键值
 * @param thisEmt  //当前文本框
 * @param objVal  //id的赋值对象
 */
function employeeFuzzy(e,thisEmt,objVal){
	var thisVal=$(thisEmt).val().replace(/(^\s+)|(\s+$)/g,"");
	if(e.keyCode==13 || e.keyCode==38 || e.keyCode==40){
		return false;
	}
	$(".vagueWin").remove();
	if(thisVal==""){
		$("."+objVal).val("");
		return false;
	}
	$.ajax({
		type : "POST",
		async : false,
		url : basepathUrl+"getBasicEmployeeByMatch",
		data : {'title' :thisVal} ,
		dataType : "text",
		success : function(data) {
			var dataList = JSON.parse(data);
			var htm="<div class='vagueWin'><input type='hidden' value='1' class='keySelected'/><img src='"+basepathUrl+"image/arrowTop.png'/>"
			+"<table cellspacing='0'><tr><th>员工编号</th><th>员工名称</th><th>员工拼音</th></tr>";
			for (var i = 0; i < dataList.length; i++) {
				htm+='<tr><input type="hidden" value="'+dataList[i].employeeId+'"/><td>'+dataList[i].employeeCode
				+'</td><td>'+dataList[i].employeeName+'</td><td>'+dataList[i].employeePinyin+'</td></tr>';
			}
			drawTable(htm,thisEmt,objVal);
		}
	});
}

/**
 * 绘制数据列表
 * @param htm  
 * @param thisEmt  //当前文本框
 * @param objVal  //id的赋值对象
 */
function drawTable(htm,thisEmt,objVal){
	$("body").append(htm+"</table><div>");
	$(".vagueWin tr").eq(1).addClass("selectedVagueTr");
	$(".vagueWin").css("top",$(thisEmt).offset().top+32);
	var thisRight=$(document).width()-$(thisEmt).offset().left;
	if(thisRight<$(".vagueWin").width()){
		var imgRight=$(".vagueWin").width()-$(".vagueWin img").width()-20;
		$(".vagueWin img").css("margin-left",imgRight+"px");
		$(".vagueWin").css("right",thisRight-$(thisEmt).width()-20);
	}else{
		$(".vagueWin img").css("margin-left","20px");
		$(".vagueWin").css("left",$(thisEmt).offset().left);
	}
	$(".vagueWin tr").unbind("click").click(function(){
		var trNum=$(this).index();
		if(trNum>0){
			trClick(trNum,thisEmt,objVal);
		}
	});
	$(document).unbind("click").click(function(e){//隐藏结果框
		var target = $(e.target);
		if(target.closest(".vagueWin").length == 0){
			$(thisEmt).val("");
			$("."+objVal).val("");
			$(".vagueWin").remove();
		}
	});
	keyClick(thisEmt,objVal);
}

/**
 * 表格行单击事件
 * @param i
 * @param thisEmt
 * @param objVal
 */
function trClick(i,thisEmt,objVal){
	$(document).unbind("click");
	$(thisEmt).val($(".vagueWin tr").eq(i).find("td").eq(1).html());
	$("."+objVal).val($(".vagueWin tr").eq(i).find("input").val());
	$(".vagueWin").remove();
}

/**
 * 键盘控制事件
 * @param thisEmt
 * @param objVal
 */
function keyClick(thisEmt,objVal){
	$(document).unbind("keydown").keydown(function(e){
		var keySelected=$(".keySelected").val();
		if($(".vagueWin").length>0){
			switch (e.keyCode) {
			case 13:
				trClick(keySelected,thisEmt,objVal);
				break;
			case 38:
				if(keySelected>1){
					$(".keySelected").val(parseInt(keySelected)-1);
					$(".vagueWin tr").removeClass("selectedVagueTr").eq($(".keySelected").val()).addClass("selectedVagueTr");
				}
				break;
			case 40:
				if(keySelected<$(".vagueWin tr").length-1){
					$(".keySelected").val(parseInt(keySelected)+1);
					$(".vagueWin tr").removeClass("selectedVagueTr").eq($(".keySelected").val()).addClass("selectedVagueTr");
				}
				break;
			default:
				break;
			}
		}
	});
}
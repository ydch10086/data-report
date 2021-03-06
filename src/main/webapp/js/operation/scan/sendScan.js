$(function() {
	// 设置当前时间
	$("input[name='scanStartTime']").val(getStartDate());
	$("input[name='scanEndTime']").val(getStartDate());
	$(".list").height(
					$("body").height() - $(".condition").height() - $(".page").height()- 110);// 数据高度自适应
	$(".subbtn").click(function() {
		$(".loadDiv").show();
		$(".pageNum").val(1);
		querySendScan();
	});// 提交按钮
	$(".cleanbtn").click(function() {// 清除按钮
		var pageNum = $(".pageNum").val();
		var pageSize = $(".pageSize").val();
		$('#subform')[0].reset();
		$("input[name='scanStartTime']").val(getStartDate());
		$("input[name='scanEndTime']").val(getStartDate());
		$(".ewbNo").val("");
		$(".employeeName").val("");
		$(".selType").attr("checked", false);
		$(".scanSiteId").val("");
		$(".nextSiteId").val("");
		$(".dispatchCenterSiteId").val("");
		$(".employeeNameId").val("");
		$(".pageNum").val(pageNum);
		$(".pageSize").val(pageSize);
		$(".dayNum").css("border-color", "#fff");
		$(".dayNum").eq(0).css("border-color", "#BABABA");
		$(".selday").val(1);
	});
	$(".prePage").click(function() {// 上一页
		if ($(".pageNum").val() > 1) {
			$(".pageNum").val(parseInt($(".pageNum").val()) - 1);
			querySendScan();
		}
	});
	$(".nextPage").click(function() {// 下一页
		if ($(".pageNum").val() < parseInt($(".pageCount").val())) {
			$(".pageNum").val(parseInt($(".pageNum").val()) + 1);
			querySendScan();
		}
	});
	$(".pageNum").change(function(){//页数改变
		querySendScan();
	});
	$(".pageSize").change(function(){//条数改变
		$(".pageNum").val(1);
		querySendScan();
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
});
function querySendScan() {
	$(".loadDiv").hide();
	if ($("input[name='scanStartTime']").val() != ""
			&& $("input[name='scanEndTime']").val() != "") {
		if (dateCompare($("input[name='scanStartTime']").val(), $(
				"input[name='scanEndTime']").val(), 1) < 0) {
			alert("开始时间不能大于结束时间");
			return false;
		}
		t = dateDiff($("input[name='scanEndTime']").val(), $(
				"input[name='scanStartTime']").val());
		if (t > 2) {
			alert("只能查询三天内的数据");
			return false;
		}
	}
	var reqParams = "";
	if ($(".selType").is(':checked')) {
		var ewbNo = $.trim($("input[name='ewbNo']").val());
		if (!ewbNo) {
			swal("请输入运单号");
			return false;
		}
		reqParams = {
			'ewbNo' : $("input[name='ewbNo']").val(),
			'pageSize' : $(".pageSize").val(),
			'pageNum' : $(".pageNum").val()
		};
	} else {
		var pageNum = $("input[name='ewbNo']").val();
		$("input[name='ewbNo']").val("");

		reqParams = {
			'employeeName' : $("input[name='createdBy']").val(),
			'scanStartTime' : $("input[name='scanStartTime']").val(),
			'scanEndTime' : $("input[name='scanEndTime']").val(),
			'nextSiteName' : $("input[name='nextSiteId']").val(),
			'siteName' : $("input[name='scanSiteId']").val(),
			'dispatchCenterSite' : $("input[name='dispatchCenterSiteId']").val(),
			'pageSize' : $(".pageSize").val(),
			'pageNum' : $(".pageNum").val()
		};
		$("input[name='ewbNo']").val(pageNum);
	}
	$.ajax({
				type : "POST",
				async : false,
				url : "querySendScan",
				data : reqParams,
				dataType : "text",
				success : function(data) {
					var pageEntity = JSON.parse(data);
					if (pageEntity.error == false) {
						var dataList = pageEntity["dataList"];
						var htm = "";
						if (dataList.length > 0) {
							for (var i = 0; i < dataList.length; i++) {
								var num = i + 1;
								htm += "<tr><td>" + num + "</td>" + "<td>" + dataList[i].ewbNo
										+ "</td>" + // 运单号
										"<td>" + dataList[i].siteName + "</td>";// 扫描网点
								htm += "<td>" + dataList[i].employeeName + "</td>" + // 扫描人
								"<td>" + dataList[i].scanTime + "</td>" + // 扫描时间
								"<td>" + dataList[i].nextSiteName + "</td>";// 下一站
								htm += "<td>" + dataList[i].latticeCode + "</td>" + // 格口号
								"<td>" + dataList[i].dispatchCenterSite + "</td>" + // 目的分拨
								"<td>" + dataList[i].dictName + "</td>"; // 数据来源
								if (dataList[i].deviceCode.length <= 16) {
									htm += "<td>" + dataList[i].deviceCode + "</td></tr>";
								} else {
									htm += "<td title='" + dataList[i].deviceCode + "'>"
											+ dataList[i].deviceCode.substring(0, 12)
											+ "...</td></tr>";
								}
							}
							$("#tbody_sendScanDisplayId").html(htm);
							$(".listTable tr th").each(
									function(index) {
										$(this).width(
												$("#tbody_sendScanDisplayId tr td").eq(index).width());
									});
						} else {
							$("#tbody_sendScanDisplayId")
									.html(
											'<tr><td colspan ="10"><center style="color:red">未查询到数据</center></td></tr>');
						}
						var pageNumCount = pageEntity.total;// 当前记录总数
						if (pageNumCount < 1) {
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
									"显示第" + startNum + "至" + endNum + "项记录，共" + pageEntity.total
											+ "项");
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
									pageNumhtml += "<option selected='selected' value='" + i
											+ "'>" + i + "</option>";
								} else {
									pageNumhtml += "<option value='" + i + "'>" + i + "</option>";
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
						$(".loadDiv").hide();
					} else {
						$(".loadDiv").hide();
						alert(pageEntity.errorMsg);
					}
				}
			});
}

	$(function() {
		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById('siteRank'));
		// 指定图表的配置项和数据
		// 使用刚指定的配置项和数据显示图表。
		var option = {
			title : {
				text : '网点收件排名',
				x : 'center'
			},
			tooltip : {
				trigger : 'item',
				formatter : 
					"{b}"
			},
			calculable : true,
			series : [ {
				name : '网点收件排名',
				type : 'funnel',
				left : '1%',
				top : 60,
				//x2: 80,
				bottom : 60,
				width : '80%',
				// height: {totalHeight} - y - y2,
				min : 0,
				max : 10,
				minSize : '0%',
				maxSize : '100%',
				label : {
					normal : {
						show : true,
					},
					emphasis : {
						textStyle : {
							fontSize : 20
						}
					}
				},
				labelLine : {
					normal : {
						length : 10,
						lineStyle : {
							width : 1,
							type : 'solid'
						}
					}
				},

				itemStyle : {
					normal : {
						borderColor : '#fff',
						borderWidth : 1
					}
				},
				data : (function() {
					var arr = [];
					$.ajax({
						type : "POST",
						async : false,
						url : "chartReport/querySiteRank",
						dataType : "text",
						success : function(result) {
							dataList = JSON.parse(result);
							for (var i = 0; i < dataList.length; i++) {
								arr.push({
									value : 10-i,
									name : dataList[i].siteName+":"+dataList[i].ewbNum
								});
							}

						}

					});
					return arr;
				})()
			} ]
		};
		myChart.setOption(option);
	});
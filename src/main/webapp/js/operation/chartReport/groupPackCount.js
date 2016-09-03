	$(function(){ 
		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById('groupPackCount'));
		// 指定图表的配置项和数据
		var option = {
			title : {
				text : '本站集包统计',
				x : 'center'
			},
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)"
			},
			color : [ '#008B00','#EEB422','red'],
			legend : {
				orient : 'vertical',
				left : 'left',
				data : [ '绿包', '黄包', '红包' ],
			},
			series : [ {
				name : '集包统计',
				type : 'pie',
				radius : '55%',
				center : [ '50%', '60%' ],
				data : ( function() {
					  var arr = [];
					// 通过ajax获取数据
					$.ajax({
						type : "POST",
						async : false,
						url : "chartReport/queryChartReport",
						dataType : "text",
						success : function(result) {
							var dataMap = JSON.parse(result);
							if (dataMap['GREEN'] != 0) {
								arr.push({value :dataMap['GREEN'],name : '绿包'
								});
							} else {
								arr.push({value : dataMap['GREEN'],name : '绿包',
									itemStyle : {normal : {label : {show : false},labelLine : {show : false}}}});
							}
							if (dataMap['YELLOW'] != 0) {
								arr.push({value :dataMap['YELLOW'],name : '黄包'
								});
							} else {
								arr.push({value : dataMap['YELLOW'],name : '黄包',
									itemStyle : {normal : {label : {show : false},labelLine : {show : false}}}});
							}
							if (dataMap['RED'] != 0) {
								arr.push({value :dataMap['RED'],name : '红包'
								});
							} else {
								arr.push({value : dataMap['RED'],name : '红包',
									itemStyle : {normal : {label : {show : false},labelLine : {show : false}}}});
							}
						}
					});
						return arr;
				} )(),
				itemStyle : {
					emphasis : {
						shadowBlur : 10,
						shadowOffsetX : 0,
						shadowColor : 'rgba(0, 0, 0, 0.5)'
					}
				}
			} ]
		};
		// 使用刚指定的配置项和数据显示图表。
		myChart.setOption(option);
	});
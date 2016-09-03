
$(function(){ 
		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById('siteActivity'));
		var option = {
	    title : {
	        text: '网点活动率',
	        x:'center'
	    },
	    tooltip : {
	        trigger: 'item',
	        formatter: "{a} <br/>{b} : {c} ({d}%)"
	    },
	    color : [ '#008B00','#BEBEBE','#EEB422'],
	    legend: {
	    	 orient: 'vertical',
	        left: 'left',
	        data: (function() {
  					var arr = [];
  					$.ajax({
  						type : "POST",
  						async : false,
  						url : "chartReport/siteActivityCount",
  						dataType : "text",
  						success : function(result) {
  							dataList = JSON.parse(result);
  							arr.push({value:dataList[0].siteCount,name:'网点活动率'}),
  							$("#siteActive").html(dataList[0].siteCount);
  							arr.push({value:dataList[1].siteCount-dataList[0].siteCount,name:'网点非活动率'}),
  							$("#siteNoActive").html(dataList[1].siteCount-dataList[0].siteCount);
  							arr.push({value:'',name:'总网点数'})
  							$("#siteCount").html(dataList[1].siteCount);
  						}
  					});
  					return arr;
  				})()
	    },
	    series : [
	        {
	            name: '活动率统计：',
	            type: 'pie',
	            radius : '55%',
	            center: ['50%', '60%'],
	            data:(function() {
	    					var arr = [];
	    					$.ajax({
	    						type : "POST",
	    						async : false,
	    						url : "chartReport/siteActivityCount",
	    						dataType : "text",
	    						success : function(result) {
	    							dataList = JSON.parse(result);
	    							arr.push({value:dataList[0].siteCount,name:'网点活动率'}),
	    							arr.push({value:dataList[1].siteCount-dataList[0].siteCount,name:'网点非活动率'}),
	    							arr.push({value:'',name:'总网点数'})
	    						}
	    					});
	    					return arr;
	    				})(),
	            itemStyle: {
	                emphasis: {
	                    shadowBlur: 10,
	                    shadowOffsetX: 0,
	                    shadowColor: 'rgba(0, 0, 0, 0.5)'
	                }
	            }
	        }
	    ]
	};
		myChart.setOption(option);
});
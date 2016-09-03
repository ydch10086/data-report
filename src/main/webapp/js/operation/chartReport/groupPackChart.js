$(function(){ 
		// 基于准备好的dom，初始化echarts实例
	var myChart = echarts.init(document.getElementById('groupPackChart'));
	option = {
		    title: {
		        text: '集包数量统计'
		    },
		    tooltip : {
		        trigger: 'axis'
		    },
		    legend: {
		        data:['集包个数']
		    },
		    grid: {
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis : [
		        {
		            type : 'category',
		            boundaryGap : false,
		            data : [setDayVal(6).format('MM/DD'), setDayVal(5).format('MM/DD'), setDayVal(4).format('MM/DD'),setDayVal(3).format('MM/DD'), setDayVal(2).format('MM/DD'), setDayVal(1).format('MM/DD'), setDayVal(0).format('MM/DD')]
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value'
		        }
		    ],
		    series : [
		        {
		            name:'集包个数',
		            type:'line',
		            stack: '总量',
		            areaStyle: {normal: {}},
		            data:(function() {
						var arr = [];
						$.ajax({
							type : "POST",
							async : false,
							url : "chartReport/groupPackCount",
							dataType : "text",
							success : function(result) {
								dataList = JSON.parse(result);
								for (var i = 0; i < dataList.length; i++) {
									arr.push({
										value : dataList[i].packBarCodeNum,
										name : dataList[i].scanTime
									});
								}
							}
						});
						return arr;
					})()
		        }
		    ]
		};
	// 使用刚指定的配置项和数据显示图表。
	myChart.setOption(option);
});

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
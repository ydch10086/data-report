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
//页面初始时间
/* function init(){
	$("#scanStartTimeId").val(getStartDate());//初始开始时间
	$("#scanEndTimeId").val(getEndDate());//初始结束时间
} */
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

//初始结束时间
function getEndDate() {
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
   var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
   return currentdate;
}
//获取当天时间减一天
function GetDateStr(AddDayCount) { 
	var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate()-AddDayCount;
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
    return currentdate;
}
//获取当天时间减一个月
function GetMonthStr(AddMonthCount,AddDayCount) { 
	var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var  month= (date.getMonth() + 1)-AddMonthCount;
    var strDate = date.getDate()+AddDayCount;
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
    return currentdate;
}
//获取当天时间加一天
function GetEndStr(AddDayCount) { 
	var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate()+AddDayCount;
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
    return currentdate;
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
$(window).resize(function(){
	$(".list").height($("body").height() -$(".condition").height()-$(".page").height()- 103);// 数据高度自适应
});
$(function(){
	$(".dayNum").click(function(){//天数选择
		$(".dayNum").css("border-color","#fff");
		$(this).css("border-color","#BABABA");
		$(".selday").val($(this).index());
		 var dayValue = $(this).index();
		if(dayValue==2 || dayValue==3 || dayValue==1){
			$("#scanStartTimeId").val(setDayVal(dayValue-1).format('YYYY-MM-DD'));
			$("#scanEndTimeId").val(getEndDate());
		} 
	});
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

/**
 * 获取上一个月
 *
 * @date 格式为yyyy-mm-dd的日期，如：2014-01-25
 */
function getPreMonth(date) {
    var arr = date.split('-');
    var year = arr[0]; //获取当前日期的年份
    var month = arr[1]; //获取当前日期的月份
    var day = arr[2]; //获取当前日期的日
    var days = new Date(year, month, 0);
    days = days.getDate(); //获取当前日期中月的天数
    var year2 = year;
    var month2 = parseInt(month) - 1;
    if (month2 == 0) {
        year2 = parseInt(year2) - 1;
        month2 = 12;
    }
    var day2 = day;
    var days2 = new Date(year2, month2, 0);
    days2 = days2.getDate();
    if (day2 > days2) {
        day2 = days2;
    }
    if (month2 < 10) {
        month2 = '0' + month2;
    }
    var t2 = year2 + '-' + month2 + '-' + day2;
    return t2;
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

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="dataSize" value="${pageResult.total}" />
<c:set var="pageCount" value="${pageResult.pages}" />
<c:choose>
   <c:when test="${pageResult.dataList != null && fn:length(pageResult.dataList)>0}">  
      <c:forEach var="dataList" items="${pageResult.dataList}"
		varStatus="status">
		<tr style='border: 1px solid #BABABA;cursor: pointer;' value='${dataList.jsonQueryData}'>
			<td width="4%">${status.index + 1}</td>
			<td width="10%"><fmt:formatDate value='${dataList.leaveTime}'
					pattern='yyyy-MM-dd HH:mm:ss' /></td>
			<td width="8%">${dataList.vehicleNumber}</td>
			<td width="8%">${dataList.leaveSite}</td>
			<td width="8%">${dataList.packNum}</td>
			<td width="8%">${dataList.sumVolume}</td>
			<td width="10%"><fmt:formatDate value='${dataList.planLeaveTime}'
					pattern='yyyy-MM-dd HH:mm:ss' /></td>
			<td width="10%"><fmt:formatDate value='${dataList.planArriveTime}'
					pattern='yyyy-MM-dd HH:mm:ss' /></td>
			<td width="10%"><fmt:formatDate value='${dataList.leaveTime}'
					pattern='yyyy-MM-dd HH:mm:ss' /></td>
			<td><fmt:formatDate value='${dataList.arriveTime}'
					pattern='yyyy-MM-dd HH:mm:ss' /></td>
			<td width="5%">${dataList.carStatus}</td>
		</tr>
	</c:forEach>   
   </c:when>
   <c:otherwise> 
   <th colspan ="11"><center style="color:red">未查询到数据</center></th>
   </c:otherwise>
</c:choose>
<script type="text/javascript">
	var dataSize = ${dataSize};
	var pageCount = ${pageCount};
	 if(dataSize!='' && dataSize>0){
		 pagingMethod(dataSize, pageCount);
	 }
	$(function() {
		$("#tbodylist tr").dblclick(function() {
			var params = $(this).attr("value");
			var obj = JSON.parse(params);
			$("#tbodylist tr").css("background-color", "");
			$(this).css("background-color", "#b5d5e5");
			getdetail(obj);
		});
		$("#tbodylist tr").bind("mouseover", function() {
			$("#tbodylist tr").css("background-color", "");
			$(this).css("background-color", "#b5d5e5");
		});
		
	});
</script>
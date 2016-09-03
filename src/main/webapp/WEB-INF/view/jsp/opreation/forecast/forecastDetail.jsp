<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:if test="${data != null}">
	<c:forEach var="dataList" items="${data}" varStatus="status">
		<tr style='border: 1px solid #BABABA'>
			<td width="4%">${status.index + 1}</td>
			<td width="24%">${dataList.packBarCode}</td>
			<td width="24%">
				 <c:choose>
					<c:when test="${not empty dataList.ewbNum}">
						${dataList.ewbNum}
					</c:when>
					<c:otherwise>
						0
					</c:otherwise>
				</c:choose>
			</td>
			<td width="24%">${dataList.leaveSite}</td>
			<td width="24%">${dataList.nextSite}</td>
		</tr>
	</c:forEach>
</c:if>
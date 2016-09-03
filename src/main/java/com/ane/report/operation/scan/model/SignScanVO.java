package com.ane.report.operation.scan.model;

import java.util.Date;

public class SignScanVO {
	private String ewbNo;
	private Long operationId;
	private Long siteId;
	private Date signTime;
	private Long dispatchEmployeeId;
	private String signMan;
	private Long scanSourceId;
	private String deviceCode;
	private String remark;
	private int signType;
	private String signReason;
	private Long signReasonId;
	private String signAttach;
	private String createBy;
	private String siteName;
	private String signReasonNote;
	private int rdStatus;
	private Date createdTime;
	private Long createdBy;
	private Long modifiedBy;
	private Date modifiedTime;
	private String employeeName;
	private String sendSiteName;
	private String deliveryEmployeeName;
	private Long sendSiteId;
	private Long createById;
	private Long employeeId;
	
	// 扫描开始时间
	private String scanStartTime;
	// 扫描结束时间
	private String scanEndTime;
	private String dictName;
	
	public String getEwbNo() {
		return ewbNo;
	}
	public void setEwbNo(String ewbNo) {
		this.ewbNo = ewbNo;
	}
	public Long getOperationId() {
		return operationId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getCreateById() {
		return createById;
	}
	public void setCreateById(Long createById) {
		this.createById = createById;
	}
	public Long getSendSiteId() {
		return sendSiteId;
	}
	public void setSendSiteId(Long sendSiteId) {
		this.sendSiteId = sendSiteId;
	}
	public void setOperationId(Long operationId) {
		this.operationId = operationId;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public Date getSignTime() {
		return signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}
	public Long getDispatchEmployeeId() {
		return dispatchEmployeeId;
	}
	public void setDispatchEmployeeId(Long dispatchEmployeeId) {
		this.dispatchEmployeeId = dispatchEmployeeId;
	}
	public String getSignMan() {
		return signMan;
	}
	public void setSignMan(String signMan) {
		this.signMan = signMan;
	}
	public Long getScanSourceId() {
		return scanSourceId;
	}
	public void setScanSourceId(Long scanSourceId) {
		this.scanSourceId = scanSourceId;
	}
	
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getSignType() {
		return signType;
	}
	public void setSignType(int signType) {
		this.signType = signType;
	}
	public String getSignReason() {
		return signReason;
	}
	public void setSignReason(String signReason) {
		this.signReason = signReason;
	}
	public Long getSignReasonId() {
		return signReasonId;
	}
	public void setSignReasonId(Long signReasonId) {
		this.signReasonId = signReasonId;
	}
	
	public String getSignAttach() {
		return signAttach;
	}
	public void setSignAttach(String signAttach) {
		this.signAttach = signAttach;
	}
	public String getCreateeBy() {
		return createBy;
	}
	public void setCreateeBy(String createeBy) {
		this.createBy = createeBy;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSignReasonNote() {
		return signReasonNote;
	}
	public void setSignReasonNote(String signReasonNote) {
		this.signReasonNote = signReasonNote;
	}
	public int getRdStatus() {
		return rdStatus;
	}
	public void setRdStatus(int rdStatus) {
		this.rdStatus = rdStatus;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	public Long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getSendSiteName() {
		return sendSiteName;
	}
	public void setSendSiteName(String sendSiteName) {
		this.sendSiteName = sendSiteName;
	}
	public String getDeliveryEmployeeName() {
		return deliveryEmployeeName;
	}
	public void setDeliveryEmployeeName(String deliveryEmployeeName) {
		this.deliveryEmployeeName = deliveryEmployeeName;
	}
	public String getScanStartTime() {
		return scanStartTime;
	}
	public void setScanStartTime(String scanStartTime) {
		this.scanStartTime = scanStartTime;
	}
	public String getScanEndTime() {
		return scanEndTime;
	}
	public void setScanEndTime(String scanEndTime) {
		this.scanEndTime = scanEndTime;
	}
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	
	
}

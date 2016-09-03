package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;

public class ProblemScanVO implements Serializable{

	private static final long serialVersionUID = 22067978239852144L;
	
	private String ewbNo;
	private int problemTypeId;
	private String problemTypeName;
	private String billType;
	// 扫描人
	private String createBy;
	// 扫描人ID
	private Integer createById;
	// 扫描网点
	private String siteName;
	// 扫描网点ID
	private Integer siteId;
	// 扫描时间
	private Date scanTime;
	// 数据来源
	private Integer scanSource;
	// 设备编号
	private String deviceCode;
	// 数据状态
	private String status;
	// 创建时间
	private Date createTime;
	// 扫描开始时间
	private String scanStartTime;
	// 扫描结束时间
	private String scanEndTime;
	public String getEwbNo() {
		return ewbNo;
	}
	public void setEwbNo(String ewbNo) {
		this.ewbNo = ewbNo;
	}
	public int getProblemTypeId() {
		return problemTypeId;
	}
	public void setProblemTypeId(int problemTypeId) {
		this.problemTypeId = problemTypeId;
	}
	public String getProblemTypeName() {
		return problemTypeName;
	}
	public void setProblemTypeName(String problemTypeName) {
		this.problemTypeName = problemTypeName;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Integer getCreateById() {
		return createById;
	}
	public void setCreateById(Integer createById) {
		this.createById = createById;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	public Date getScanTime() {
		return scanTime;
	}
	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}
	public Integer getScanSource() {
		return scanSource;
	}
	public void setScanSource(Integer scanSource) {
		this.scanSource = scanSource;
	}
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

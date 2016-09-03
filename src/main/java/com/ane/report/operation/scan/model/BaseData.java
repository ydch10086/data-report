package com.ane.report.operation.scan.model;

import java.util.Date;

public class BaseData {
	//扫描人
	private String createBy;
	//扫描人ID
	private Integer createById;
	//扫描网点
	private String siteName;
	//扫描网点ID
	private Integer siteId;
	//扫描时间
	private Date scanTime;
	//数据来源
	private Integer scanSource;
	//设备编号
	private String deviceCode;
	//数据状态
	private String status;
	//创建时间
	private Date createTime;
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
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	@Override
	public String toString() {
		return "BaseData [createBy=" + createBy + ", createById=" + createById
				+ ", siteName=" + siteName + ", siteId=" + siteId
				+ ", scanTime=" + scanTime + ", scanSource=" + scanSource
				+ ", deviceCode=" + deviceCode + ", status=" + status
				+ ", createTime=" + createTime + "]";
	}
	
}

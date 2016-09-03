package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;

public class Arrive implements Serializable {
	private static final long serialVersionUID = -9164700375560303264L;
	// ID
	private long reachId;
	// 上一站ID
	private Integer prevSiteId;
	// 上一站
	private String prevSite;
	// 运单号
	private String ewbNo;
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
	//来源
	private String sourceName;

	public long getReachId() {
		return reachId;
	}

	public void setReachId(long reachId) {
		this.reachId = reachId;
	}

	public Integer getPrevSiteId() {
		return prevSiteId;
	}

	public void setPrevSiteId(Integer prevSiteId) {
		this.prevSiteId = prevSiteId;
	}

	public String getPrevSite() {
		return prevSite;
	}

	public void setPrevSite(String prevSite) {
		this.prevSite = prevSite;
	}

	public String getEwbNo() {
		return ewbNo;
	}

	public void setEwbNo(String ewbNo) {
		this.ewbNo = ewbNo;
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
	
	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	@Override
	public String toString() {
		return "Arrive [reachId=" + reachId + ", prevSiteId=" + prevSiteId
				+ ", prevSite=" + prevSite + ", ewbNo=" + ewbNo + ", createBy="
				+ createBy + ", createById=" + createById + ", siteName="
				+ siteName + ", siteId=" + siteId + ", scanTime=" + scanTime
				+ ", scanSource=" + scanSource + ", deviceCode=" + deviceCode
				+ ", status=" + status + ", createTime=" + createTime
				+ ", scanStartTime=" + scanStartTime + ", scanEndTime="
				+ scanEndTime + "]";
	}
	
}

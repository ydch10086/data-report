package com.ane.report.operation.scan.model;

import java.util.Date;

public class CenterContrastVO {
	private String billNo;// 单号
	private String siteName;// 扫描网点
	private Integer siteId;// 扫描网点id
	private String createBy;// 扫描人
	private Integer createById;// 扫描人ID
	private String ScanType;// 扫描类型
	private Date ScanTime;// 扫描时间
	// 扫描开始时间
	private String scanStartTime;
	// 扫描结束时间
	private String scanEndTime;

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
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

	public String getScanType() {
		return ScanType;
	}

	public void setScanType(String scanType) {
		ScanType = scanType;
	}

	public Date getScanTime() {
		return ScanTime;
	}

	public void setScanTime(Date scanTime) {
		ScanTime = scanTime;
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

	@Override
	public String toString() {
		return "CenterContrastVO [billNo=" + billNo + ", siteName=" + siteName
				+ ", siteId=" + siteId + ", createBy=" + createBy
				+ ", createById=" + createById + ", ScanType=" + ScanType
				+ ", ScanTime=" + ScanTime + "]";
	}

}

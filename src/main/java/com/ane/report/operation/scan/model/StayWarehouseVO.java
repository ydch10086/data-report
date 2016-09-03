package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;

public class StayWarehouseVO implements Serializable {
	private static final long serialVersionUID = -3354349407423291964L;
	// 主键
	private int stayId;
	// 单号类型，区分包和单
	private Integer billType;
	// 单号
	private String billNo;
	// 包条码
	private String packBarCode;
	// 区分包色
	private int packType;
	// 留仓原因ID
	private int stayReasonId;
	// 留仓原因
	private String stayReason;
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
	// 查询开始时间
	private String scanStartTime;
	// 查询结束时间
	private String scanEndTime;
	// 来源
	private String sourceName;
	

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public int getStayId() {
		return stayId;
	}

	public void setStayId(int stayId) {
		this.stayId = stayId;
	}

	public Integer getBillType() {
		return billType;
	}

	public void setBillType(Integer billType) {
		this.billType = billType;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getPackBarCode() {
		return packBarCode;
	}

	public void setPackBarCode(String packBarCode) {
		this.packBarCode = packBarCode;
	}

	public int getPackType() {
		return packType;
	}

	public void setPackType(int packType) {
		this.packType = packType;
	}

	public int getStayReasonId() {
		return stayReasonId;
	}

	public void setStayReasonId(int stayReasonId) {
		this.stayReasonId = stayReasonId;
	}

	public String getStayReason() {
		return stayReason;
	}

	public void setStayReason(String stayReason) {
		this.stayReason = stayReason;
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

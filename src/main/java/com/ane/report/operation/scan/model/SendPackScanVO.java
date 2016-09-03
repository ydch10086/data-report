package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;


/**
 * 发件扫描
 * @author Administrator
 *
 */

public class SendPackScanVO implements Serializable {
	private static final long serialVersionUID = 1L;
	//发包主键
	private Long opreationId;
	//单号类型，区分做到包还是到件
	private Integer billType;
	//单号
	private String billNo;
	//包条码
	private String packBarCode;
	//包类型
	private Integer packType;
	//下一站id
	private Long nextSiteId;
	//下一站名称
	private String nextSiteName;
	//扫描人
	private String createBy;
	//扫描人id
	private Long createById;
	//派件网点id
	private Long siteId;
	//派件网点
	private String siteName;
	//扫描时间
	private Date scanTime;
	//数据来源
	private Long scanSource;
	//设备编号
	private String deviceCode;
	//数据状态
	private Integer status;
	//创建时间
	private Date createTime;
	// 扫描开始时间
	private String scanStartTime;
	// 扫描结束时间
	private String scanEndTime;
	
	private String dictName;
	
	
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public Long getOpreationId() {
		return opreationId;
	}
	public void setOpreationId(Long opreationId) {
		this.opreationId = opreationId;
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
	public Integer getPackType() {
		return packType;
	}
	public void setPackType(Integer packType) {
		this.packType = packType;
	}
	public Long getNextSiteId() {
		return nextSiteId;
	}
	public void setNextSiteId(Long nextSiteId) {
		this.nextSiteId = nextSiteId;
	}
	public String getNextSiteName() {
		return nextSiteName;
	}
	public void setNextSiteName(String nextSiteName) {
		this.nextSiteName = nextSiteName;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Long getCreateById() {
		return createById;
	}
	public void setCreateById(Long createById) {
		this.createById = createById;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Date getScanTime() {
		return scanTime;
	}
	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}
	public Long getScanSource() {
		return scanSource;
	}
	public void setScanSource(Long scanSource) {
		this.scanSource = scanSource;
	}
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
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
}

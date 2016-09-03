package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;


/**
 * 发件扫描
 * @author Administrator
 *
 */

public class SendScanVO implements Serializable {
	/** 运单编号 **/
	private String ewbNo;
	/** 业务数据流水号 **/
	private Long operationId;
	/** 扫描站点自动编号 **/
	private Long siteId;
	/** 扫描时间 **/
	private Date scanTime;
	/** 初始扫描时间 **/
	private Date scanTimeInit;
	/** 下一站点自动编号 **/
	private Long nextSiteId;
	/** 派件网点编号 **/
	private Long dispatchSiteId;
	/** 货物类型自动编号 **/
	private Long goosTypeId;	
	/** 分拨班次自动编号 **/
	private Long classId;
	/** 数据来源 **/
	private Long scanSourceId;
	/** 数据来源设备编号 **/
	private String deviceCode;
	/** 件数 **/
	private Integer price;
	/** 重量 **/
	private Double weight;	
	/** 长 **/
	private Double length;	
	/** 宽 **/
	private Double width;
	/** 高 **/
	private Double high;
	/** 体积重量 **/
	private Double volWeight;
	/** 备注 **/
	private String remark;
	/** 创建人 **/
	private Long createdBy;	
	/** 创建时间 **/
	private Date createdTime;
	/** 修改人 **/
	private Long modifiedBy;
	/** 修改时间 **/
	private Date modifiedTime;
	/** 数据状态(0：删除  1：正常) **/
	private Integer rdStatus;
	/**运单类型id**/
	private Long ewbTypeId;
	/** 包号 **/
	private String pEwbNo;
	/** 车号 */
	private Long nextSiteCode;
	/** 下一站*/
	private String nextSiteName;
	// 扫描开始时间
	private String scanStartTime;
	// 扫描结束时间
	private String scanEndTime;
	
	private String dictName;
	
	private String siteName;
	private String employeeName;
	private Long latticeCode;
	private String dispatchCenterSite;
	private Long dispatchCenterSiteId;
	private Long deliveryManId;

	public Long getDispatchCenterSiteId() {
		return dispatchCenterSiteId;
	}
	public void setDispatchCenterSiteId(Long dispatchCenterSiteId) {
		this.dispatchCenterSiteId = dispatchCenterSiteId;
	}
	public String getEwbNo() {
		return ewbNo;
	}
	public void setEwbNo(String ewbNo) {
		this.ewbNo = ewbNo;
	}
	public Long getDeliveryManId() {
		return deliveryManId;
	}
	public void setDeliveryManId(Long deliveryManId) {
		this.deliveryManId = deliveryManId;
	}
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public Long getOperationId() {
		return operationId;
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
	public Date getScanTime() {
		return scanTime;
	}
	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}
	public Date getScanTimeInit() {
		return scanTimeInit;
	}
	public void setScanTimeInit(Date scanTimeInit) {
		this.scanTimeInit = scanTimeInit;
	}
	public Long getNextSiteId() {
		return nextSiteId;
	}
	public void setNextSiteId(Long nextSiteId) {
		this.nextSiteId = nextSiteId;
	}
	public Long getDispatchSiteId() {
		return dispatchSiteId;
	}
	public void setDispatchSiteId(Long dispatchSiteId) {
		this.dispatchSiteId = dispatchSiteId;
	}
	public Long getGoosTypeId() {
		return goosTypeId;
	}
	public void setGoosTypeId(Long goosTypeId) {
		this.goosTypeId = goosTypeId;
	}
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHigh() {
		return high;
	}
	public void setHigh(Double high) {
		this.high = high;
	}
	public Double getVolWeight() {
		return volWeight;
	}
	public void setVolWeight(Double volWeight) {
		this.volWeight = volWeight;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
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
	public Integer getRdStatus() {
		return rdStatus;
	}
	public void setRdStatus(Integer rdStatus) {
		this.rdStatus = rdStatus;
	}
	public Long getEwbTypeId() {
		return ewbTypeId;
	}
	public void setEwbTypeId(Long ewbTypeId) {
		this.ewbTypeId = ewbTypeId;
	}
	public String getpEwbNo() {
		return pEwbNo;
	}
	public void setpEwbNo(String pEwbNo) {
		this.pEwbNo = pEwbNo;
	}
	public Long getNextSiteCode() {
		return nextSiteCode;
	}
	public void setNextSiteCode(Long nextSiteCode) {
		this.nextSiteCode = nextSiteCode;
	}
	public String getNextSiteName() {
		return nextSiteName;
	}
	public void setNextSiteName(String nextSiteName) {
		this.nextSiteName = nextSiteName;
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
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Long getLatticeCode() {
		return latticeCode;
	}
	public void setLatticeCode(Long latticeCode) {
		this.latticeCode = latticeCode;
	}
	public String getDispatchCenterSite() {
		return dispatchCenterSite;
	}
	public void setDispatchCenterSite(String dispatchCenterSite) {
		this.dispatchCenterSite = dispatchCenterSite;
	}
	
	
}

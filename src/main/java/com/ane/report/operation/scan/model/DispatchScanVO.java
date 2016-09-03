package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;


/**
 * 发件扫描
 * @author Administrator
 *
 */

public class DispatchScanVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//派送主键
		private Long deliveryId;
		//运单号
		private String ewbNo;
		//扫描时间
		private Date scanTime;
		//扫描人
		private String createdBy;
		//扫描人id
		private Long createById;
		//派件网点id
		private Long siteId;
		//派件网点
		private String siteName;
		//数据来源
		private Long scanSource;
		//设备编号
		private String deviceCode;
		//创建时间
		private Date createdTime;
		//数据状态
		private Integer status;
		//派件业务员
		private String deliveryMan;
		//派件业务员id
		private Long deliveryManId;
		//派件类型
		private Long deliveryType;
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
		public Long getDeliveryId() {
			return deliveryId;
		}
		public void setDeliveryId(Long deliveryId) {
			this.deliveryId = deliveryId;
		}
		public String getEwbNo() {
			return ewbNo;
		}
		public void setEwbNo(String ewbNo) {
			this.ewbNo = ewbNo;
		}
		public Date getScanTime() {
			return scanTime;
		}
		public void setScanTime(Date scanTime) {
			this.scanTime = scanTime;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
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
		public Date getCreatedTime() {
			return createdTime;
		}
		public void setCreatedTime(Date createdTime) {
			this.createdTime = createdTime;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public String getDeliveryMan() {
			return deliveryMan;
		}
		public void setDeliveryMan(String deliveryMan) {
			this.deliveryMan = deliveryMan;
		}
		public Long getDeliveryManId() {
			return deliveryManId;
		}
		public void setDeliveryManId(Long deliveryManId) {
			this.deliveryManId = deliveryManId;
		}
		public Long getDeliveryType() {
			return deliveryType;
		}
		public void setDeliveryType(Long deliveryType) {
			this.deliveryType = deliveryType;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
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

package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 称重扫描实体
 * @author Administrator
 *
 */
public class WeightScanVO  implements Serializable{
	
	private static final long serialVersionUID = 6183881020992191351L;
	private Long weighId;
	//运单号
	private String ewbNO;
	//物品类型
	private String goodsType;
	//重量
	private Double goodsWeigh;	
	//目的地址
	private String address;
	//回单编号
	private String receiptewbNO;
	//寄件客户ID
	private Long sendCustomerId;
	//寄件客户
	private String sendCustomerName;
	//收件业务员ID
	private Long receiveId;
	//收件业务员
	private String receiveName;
	//收件网点ID
	private Long receiveSiteId;
	//收件网点
	private String receiveSiteName;
	//上一站网点id
	private Long prevSiteId;
	//上一站网点
	private String prevSite;
	//目的分拨id
	private Long destSiteId;
	//目的分拨
	private String destSite;
	//称重网点ID
	private Long siteID;
	//称重网点
	private String siteName;
	//扫描时间
	private Date scanTime;
	//扫描人
	private String createdBy;
	//扫描人id
	private Long createdById;
	//数据来源
	private Long scanSource;
	
	//设备编号
	private String deviceCode;
	//常见时间
	private Date createdTime;
	//数据状态
	private Integer status;
	//扫描开始时间
	private Date scanStartTime;
	//扫描结束时间
	private Date scanEndTime;
	/**
	 * 中心称重
	 */
	private Double centerWeight;
	
	//数据来源name
	private String scanSourceName;
	
	/**    
	 * scanSourceName    
	 *    
	 * @return  the scanSourceName    
	 * @since
	 */
	
	public String getScanSourceName() {
		return scanSourceName;
	}
	/**    
	 * @param scanSourceName the scanSourceName to set    
	 */
	
	public void setScanSourceName(String scanSourceName) {
		this.scanSourceName = scanSourceName;
	}
	/**
	 * @return the centerWeight
	 */
	public Double getCenterWeight() {
		return centerWeight;
	}
	/**
	 * @param centerWeight the centerWeight to set
	 */
	public void setCenterWeight(Double centerWeight) {
		this.centerWeight = centerWeight;
	}
	public Long getWeighId() {
		return weighId;
	}
	public void setWeighId(Long weighId) {
		this.weighId = weighId;
	}
	public String getEwbNO() {
		return ewbNO;
	}
	public void setEwbNO(String ewbNO) {
		this.ewbNO = ewbNO;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public Double getGoodsWeigh() {
		return goodsWeigh;
	}
	public void setGoodsWeigh(Double goodsWeigh) {
		this.goodsWeigh = goodsWeigh;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Long getPrevSiteId() {
		return prevSiteId;
	}
	public void setPrevSiteId(Long prevSiteId) {
		this.prevSiteId = prevSiteId;
	}
	public String getPrevSite() {
		return prevSite;
	}
	public void setPrevSite(String prevSite) {
		this.prevSite = prevSite;
	}
	public Long getDestSiteId() {
		return destSiteId;
	}
	public void setDestSiteId(Long destSiteId) {
		this.destSiteId = destSiteId;
	}
	public String getDestSite() {
		return destSite;
	}
	public void setDestSite(String destSite) {
		this.destSite = destSite;
	}
	public String getReceiptewbNO() {
		return receiptewbNO;
	}
	public void setReceiptewbNO(String receiptewbNO) {
		this.receiptewbNO = receiptewbNO;
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
	public Long getSendCustomerId() {
		return sendCustomerId;
	}
	public void setSendCustomerId(Long sendCustomerId) {
		this.sendCustomerId = sendCustomerId;
	}
	public String getSendCustomerName() {
		return sendCustomerName;
	}
	public void setSendCustomerName(String sendCustomerName) {
		this.sendCustomerName = sendCustomerName;
	}
	public Long getReceiveId() {
		return receiveId;
	}
	public void setReceiveId(Long receiveId) {
		this.receiveId = receiveId;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public Long getReceiveSiteId() {
		return receiveSiteId;
	}
	public void setReceiveSiteId(Long receiveSiteId) {
		this.receiveSiteId = receiveSiteId;
	}
	public String getReceiveSiteName() {
		return receiveSiteName;
	}
	public void setReceiveSiteName(String receiveSiteName) {
		this.receiveSiteName = receiveSiteName;
	}
	public Long getSiteID() {
		return siteID;
	}
	public void setSiteID(Long siteID) {
		this.siteID = siteID;
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
	@JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss",timezone = "GMT+8")
	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Long getCreatedById() {
		return createdById;
	}
	public void setCreatedById(Long createdById) {
		this.createdById = createdById;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getScanStartTime() {
		return scanStartTime;
	}
	public void setScanStartTime(Date scanStartTime) {
		this.scanStartTime = scanStartTime;
	}
	public Date getScanEndTime() {
		return scanEndTime;
	}
	public void setScanEndTime(Date scanEndTime) {
		this.scanEndTime = scanEndTime;
	}
	
	
	
}

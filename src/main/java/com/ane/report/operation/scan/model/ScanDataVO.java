package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ScanDataVO implements Serializable{
	private static final long serialVersionUID = -576773561514049720L;
	//扫描类型
	private int scanType;
	//扫描类型名称
	private String scanTypeName;
	//集包号
	private String packBarCode;
	//运单号
	private String ewbNo;
	//称重重量
	private double weight;
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
	
	//扫描开始时间
	private Date scanStartTime;
	//扫描结束时间
	private Date scanEndTime;
	//上一网点ID
	private Integer preSiteId;
	//目的网点ID
	private Integer descSiteId;
	//派件人id
	private Integer deliverySiteId;
	
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
	 * scanType    
	 *    
	 * @return  the scanType    
	 * @since
	 */
	
	public int getScanType() {
		return scanType;
	}
	/**    
	 * @param scanType the scanType to set    
	 */
	
	public void setScanType(int scanType) {
		this.scanType = scanType;
	}
	/**    
	 * scanTypeName    
	 *    
	 * @return  the scanTypeName    
	 * @since
	 */
	
	public String getScanTypeName() {
		return scanTypeName;
	}
	/**    
	 * @param scanTypeName the scanTypeName to set    
	 */
	
	public void setScanTypeName(String scanTypeName) {
		this.scanTypeName = scanTypeName;
	}
	/**    
	 * packBarCode    
	 *    
	 * @return  the packBarCode    
	 * @since
	 */
	
	public String getPackBarCode() {
		return packBarCode;
	}
	/**    
	 * @param packBarCode the packBarCode to set    
	 */
	
	public void setPackBarCode(String packBarCode) {
		this.packBarCode = packBarCode;
	}
	/**    
	 * ewbNo    
	 *    
	 * @return  the ewbNo    
	 * @since
	 */
	
	public String getEwbNo() {
		return ewbNo;
	}
	/**    
	 * @param ewbNo the ewbNo to set    
	 */
	
	public void setEwbNo(String ewbNo) {
		this.ewbNo = ewbNo;
	}
	/**    
	 * weight    
	 *    
	 * @return  the weight    
	 * @since
	 */
	
	public double getWeight() {
		return weight;
	}
	/**    
	 * @param weight the weight to set    
	 */
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**    
	 * createBy    
	 *    
	 * @return  the createBy    
	 * @since
	 */
	
	public String getCreateBy() {
		return createBy;
	}
	/**    
	 * @param createBy the createBy to set    
	 */
	
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**    
	 * createById    
	 *    
	 * @return  the createById    
	 * @since
	 */
	
	public Integer getCreateById() {
		return createById;
	}
	/**    
	 * @param createById the createById to set    
	 */
	
	public void setCreateById(Integer createById) {
		this.createById = createById;
	}
	/**    
	 * siteName    
	 *    
	 * @return  the siteName    
	 * @since
	 */
	
	public String getSiteName() {
		return siteName;
	}
	/**    
	 * @param siteName the siteName to set    
	 */
	
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	/**    
	 * siteId    
	 *    
	 * @return  the siteId    
	 * @since
	 */
	
	public Integer getSiteId() {
		return siteId;
	}
	/**    
	 * @param siteId the siteId to set    
	 */
	
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	/**    
	 * scanTime    
	 *    
	 * @return  the scanTime    
	 * @since
	 */
	
	public Date getScanTime() {
		return scanTime;
	}
	/**    
	 * @param scanTime the scanTime to set    
	 */
	@JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss",timezone = "GMT+8")
	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}
	/**    
	 * scanSource    
	 *    
	 * @return  the scanSource    
	 * @since
	 */
	
	public Integer getScanSource() {
		return scanSource;
	}
	/**    
	 * @param scanSource the scanSource to set    
	 */
	
	public void setScanSource(Integer scanSource) {
		this.scanSource = scanSource;
	}
	/**    
	 * deviceCode    
	 *    
	 * @return  the deviceCode    
	 * @since
	 */
	
	public String getDeviceCode() {
		return deviceCode;
	}
	/**    
	 * @param deviceCode the deviceCode to set    
	 */
	
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	/**    
	 * status    
	 *    
	 * @return  the status    
	 * @since
	 */
	
	public String getStatus() {
		return status;
	}
	/**    
	 * @param status the status to set    
	 */
	
	public void setStatus(String status) {
		this.status = status;
	}
	/**    
	 * createTime    
	 *    
	 * @return  the createTime    
	 * @since
	 */
	
	public Date getCreateTime() {
		return createTime;
	}
	/**    
	 * @param createTime the createTime to set    
	 */
	@JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss",timezone = "GMT+8")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**    
	 * scanStartTime    
	 *    
	 * @return  the scanStartTime    
	 * @since
	 */
	
	public Date getScanStartTime() {
		return scanStartTime;
	}
	/**    
	 * @param scanStartTime the scanStartTime to set    
	 */
	
	public void setScanStartTime(Date scanStartTime) {
		this.scanStartTime = scanStartTime;
	}
	/**    
	 * scanEndTime    
	 *    
	 * @return  the scanEndTime    
	 * @since
	 */
	
	public Date getScanEndTime() {
		return scanEndTime;
	}
	/**    
	 * @param scanEndTime the scanEndTime to set    
	 */
	
	public void setScanEndTime(Date scanEndTime) {
		this.scanEndTime = scanEndTime;
	}
	/**    
	 * preSiteId    
	 *    
	 * @return  the preSiteId    
	 * @since
	 */
	
	public Integer getPreSiteId() {
		return preSiteId;
	}
	/**    
	 * @param preSiteId the preSiteId to set    
	 */
	
	public void setPreSiteId(Integer preSiteId) {
		this.preSiteId = preSiteId;
	}
	/**    
	 * descSiteId    
	 *    
	 * @return  the descSiteId    
	 * @since
	 */
	
	public Integer getDescSiteId() {
		return descSiteId;
	}
	/**    
	 * @param descSiteId the descSiteId to set    
	 */
	
	public void setDescSiteId(Integer descSiteId) {
		this.descSiteId = descSiteId;
	}
	/**    
	 * deliverySiteId    
	 *    
	 * @return  the deliverySiteId    
	 * @since
	 */
	
	public Integer getDeliverySiteId() {
		return deliverySiteId;
	}
	/**    
	 * @param deliverySiteId the deliverySiteId to set    
	 */
	
	public void setDeliverySiteId(Integer deliverySiteId) {
		this.deliverySiteId = deliverySiteId;
	}
	
	
	
	
	
	
}

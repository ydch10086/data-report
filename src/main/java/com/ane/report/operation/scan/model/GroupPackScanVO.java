package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 集包实体类
 * @version 1.0 2016-4-16
 */
public class GroupPackScanVO implements Serializable {

	private static final long serialVersionUID = 2084687397729770933L;
	
	/**集包主键 按规则生成**/
	private String groupPackId;
	/**包条码**/
	private String packBarCode;
	/**网点名称**/
	private String siteName;
	/**网点ID**/
	private Long siteId;
	/**扫描时间**/
	private Date scanTime;
	/**集包类型**/
	private Integer groupType;
	/**集包人员ID**/
	private Long createById;
	/**集包人员**/
	private String createBy;
	/**目的网点**/
	private String destSite;
	/**目的网点ID**/
	private Long destSiteId;
	/**创建时间**/
	private Date createTime;
	/**拆包时间**/
	private Date splitTime;
	/**拆包主键**/
	private Long splitPackId;
	/**拆包网点ID**/
	private Long splitSiteId;
	/**拆包网点**/
	private String splitSiteName;
	/**拆包人员id**/
	private Long splitById;
	/**拆包人员**/
	private String splitBy;
	/**集包件数**/
	private Integer ewbNum;
	/**数据状态 0 删除1 正常**/
	private Integer rdStatus;
	
	/**自定义包签状态 可新增**/
	private String addStatus;
	/**数据来源**/
	private Integer scanSource;
	/**设备编号**/
	private String deviceCode;
	
	//扫描开始时间
	private Date scanStartTime;
	//扫描结束时间
	private Date scanEndTime;
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
	 * @return the groupPackId
	 */
	public String getGroupPackId() {
		return groupPackId;
	}
	/**
	 * @param groupPackId the groupPackId to set
	 */
	public void setGroupPackId(String groupPackId) {
		this.groupPackId = groupPackId;
	}
	/**
	 * @return the packBarCode
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
	 * @return the siteName
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
	 * @return the siteId
	 */
	public Long getSiteId() {
		return siteId;
	}
	/**
	 * @param siteId the siteId to set
	 */
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	/**
	 * @return the scanTime
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
	 * @return the groupType
	 */
	public Integer getGroupType() {
		return groupType;
	}
	/**
	 * @param groupType the groupType to set
	 */
	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}
	/**
	 * @return the createById
	 */
	public Long getCreateById() {
		return createById;
	}
	/**
	 * @param createById the createById to set
	 */
	public void setCreateById(Long createById) {
		this.createById = createById;
	}
	/**
	 * @return the createBy
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
	 * @return the destSite
	 */
	public String getDestSite() {
		return destSite;
	}
	/**
	 * @param destSite the destSite to set
	 */
	public void setDestSite(String destSite) {
		this.destSite = destSite;
	}
	/**
	 * @return the destSiteId
	 */
	public Long getDestSiteId() {
		return destSiteId;
	}
	/**
	 * @param destSiteId the destSiteId to set
	 */
	public void setDestSiteId(Long destSiteId) {
		this.destSiteId = destSiteId;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the splitTime
	 */
	public Date getSplitTime() {
		return splitTime;
	}
	/**
	 * @param splitTime the splitTime to set
	 */
	public void setSplitTime(Date splitTime) {
		this.splitTime = splitTime;
	}
	/**
	 * @return the splitPackId
	 */
	public Long getSplitPackId() {
		return splitPackId;
	}
	/**
	 * @param splitPackId the splitPackId to set
	 */
	public void setSplitPackId(Long splitPackId) {
		this.splitPackId = splitPackId;
	}
	/**
	 * @return the splitSiteId
	 */
	public Long getSplitSiteId() {
		return splitSiteId;
	}
	/**
	 * @param splitSiteId the splitSiteId to set
	 */
	public void setSplitSiteId(Long splitSiteId) {
		this.splitSiteId = splitSiteId;
	}
	/**
	 * @return the splitSiteName
	 */
	public String getSplitSiteName() {
		return splitSiteName;
	}
	/**
	 * @param splitSiteName the splitSiteName to set
	 */
	public void setSplitSiteName(String splitSiteName) {
		this.splitSiteName = splitSiteName;
	}
	/**
	 * @return the splitById
	 */
	public Long getSplitById() {
		return splitById;
	}
	/**
	 * @param splitById the splitById to set
	 */
	public void setSplitById(Long splitById) {
		this.splitById = splitById;
	}
	/**
	 * @return the splitBy
	 */
	public String getSplitBy() {
		return splitBy;
	}
	/**
	 * @param splitBy the splitBy to set
	 */
	public void setSplitBy(String splitBy) {
		this.splitBy = splitBy;
	}
	/**
	 * @return the ewbNum
	 */
	public Integer getEwbNum() {
		return ewbNum;
	}
	/**
	 * @param ewbNum the ewbNum to set
	 */
	public void setEwbNum(Integer ewbNum) {
		this.ewbNum = ewbNum;
	}
	/**
	 * @return the rdStatus
	 */
	public Integer getRdStatus() {
		return rdStatus;
	}
	/**
	 * @param rdStatus the rdStatus to set
	 */
	public void setRdStatus(Integer rdStatus) {
		this.rdStatus = rdStatus;
	}
	/**
	 * @return the addStatus
	 */
	public String getAddStatus() {
		return addStatus;
	}
	/**
	 * @param addStatus the addStatus to set
	 */
	public void setAddStatus(String addStatus) {
		this.addStatus = addStatus;
	}
	/**
	 * @return the scanSource
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
	 * @return the deviceCode
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
	 * @return the scanStartTime
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
	 * @return the scanEndTime
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
	
}

package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 装车扫描实体类
 * @version 1.0 2016-4-16
 */
public class LoadCarScanVO implements Serializable {

	private static final long serialVersionUID = 2084687397729770933L;
	
	/**任务号**/
	private String taskNum;
	/**车辆码**/
	private String platenNum;
	/**包数**/
	private int packgeCount;
	/**扫描网点**/
	private String scanSite;
	/**扫描时间**/
	private Date scanTime;
	/**扫描人**/
	private String createBy;
	/**下一网点**/
	private String nextSite;
	/**数据来源**/
	private Integer scanSource;
	/**设备编号**/
	private String deviceCode;
	
	//扫描开始时间
	private Date scanStartTime;
	//扫描结束时间
	private Date scanEndTime;
	
	private String packBarCode;
	
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
	 * @return the taskNum
	 */
	public String getTaskNum() {
		return taskNum;
	}
	/**
	 * @param taskNum the taskNum to set
	 */
	public void setTaskNum(String taskNum) {
		this.taskNum = taskNum;
	}
	
	/**
	 * @return the platenNum
	 */
	public String getPlatenNum() {
		return platenNum;
	}
	/**
	 * @param platenNum the platenNum to set
	 */
	public void setPlatenNum(String platenNum) {
		this.platenNum = platenNum;
	}
	/**
	 * @return the packgeCount
	 */
	public int getPackgeCount() {
		return packgeCount;
	}
	/**
	 * @param packgeCount the packgeCount to set
	 */
	public void setPackgeCount(int packgeCount) {
		this.packgeCount = packgeCount;
	}
	/**
	 * @return the scanSite
	 */
	public String getScanSite() {
		return scanSite;
	}
	/**
	 * @param scanSite the scanSite to set
	 */
	public void setScanSite(String scanSite) {
		this.scanSite = scanSite;
	}
	/**
	 * @return the nextSite
	 */
	public String getNextSite() {
		return nextSite;
	}
	/**
	 * @param nextSite the nextSite to set
	 */
	public void setNextSite(String nextSite) {
		this.nextSite = nextSite;
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

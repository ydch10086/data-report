package com.ane.report.operation.scan.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 网点扫描对比监控
 * @author Administrator
 *
 */
public class SiteScanCompMonitorVO implements Serializable {

	private static final long serialVersionUID = 2084687397729770933L;
	/**
	 * 运单号
	 */
	private String ewbNo;
	/**
	 * 扫描网点
	 */
	private String scanSite;
	/**
	 * 扫描时间
	 */
	private Date scanTime;
	/**
	 * 扫描类型
	 */
	private String scanType;
	/**
	 * 扫描人
	 */
	private String createdBy;
	/**
	 * 对比类型
	 */
	private String compType;
	
	/**
	 * 扫描开始时间
	 */
	private Date scanStartTime;
	/**
	 * 扫描结束时间
	 */
	private Date scanEndTime;
	
	/**
	 * @return the compType
	 */
	public String getCompType() {
		return compType;
	}
	/**
	 * @param compType the compType to set
	 */
	public void setCompType(String compType) {
		this.compType = compType;
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
	/**
	 * @return the ewbNo
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
	 * @return the scanType
	 */
	public String getScanType() {
		return scanType;
	}
	/**
	 * @param scanType the scanType to set
	 */
	public void setScanType(String scanType) {
		this.scanType = scanType;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}

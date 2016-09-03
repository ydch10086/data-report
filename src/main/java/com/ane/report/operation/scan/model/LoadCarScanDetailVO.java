package com.ane.report.operation.scan.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 装车扫描实体类
 * @version 1.0 2016-4-16
 */
public class LoadCarScanDetailVO implements Serializable {

	private static final long serialVersionUID = 2084687397729770933L;
	
	/**
	 * 集包号
	 */
	private String packNum;
	/**
	 * 集包网点
	 */
	private String siteName;
	/**
	 * 集包日期
	 */
	private String scanTime;
	/**
	 * TaskNum
	 */
	private String taskNum;
	/**扫描时间**/
	/**
	 * @return the packNum
	 */
	public String getPackNum() {
		return packNum;
	}
	/**
	 * @param packNum the packNum to set
	 */
	public void setPackNum(String packNum) {
		this.packNum = packNum;
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
	 * @return the scanTime
	 */
	public String getScanTime() {
		return scanTime;
	}
	/**
	 * @param scanTime the scanTime to set
	 */
	@JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss",timezone = "GMT+8")
	public void setScanTime(String scanTime) {
		this.scanTime = scanTime;
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
	
	
}

package com.ane.report.operation.scan.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 集包详情	
 * @version 1.0 2016-4-16
 */
public class GroupPackScanDetailVO implements Serializable {

	private static final long serialVersionUID = 2084687397729770933L;
	/**
	 * 运单号
	 */
	private String ewbNo;
	/**
	 * 寄件日期
	 */
	private String ewbDate;
	/**网点名称**/
	private String siteName;
	/**
	 * 集包号
	 */
	private String packBarCode;
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
	 * @return the ewbDate
	 */
	public String getEwbDate() {
		return ewbDate;
	}
	/**
	 * @param ewbDate the ewbDate to set
	 */
	@JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss",timezone = "GMT+8")
	public void setEwbDate(String ewbDate) {
		this.ewbDate = ewbDate;
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
	
	
}

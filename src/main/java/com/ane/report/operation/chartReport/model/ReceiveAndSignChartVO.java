package com.ane.report.operation.chartReport.model;

import java.io.Serializable;

public class ReceiveAndSignChartVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	/*收件个数*/
	private Integer receiveNum;
	/*签收个数*/
	private String signNumCount;
	/*时间*/
	private String scanTime;
	/*结束时间*/
	private String scanEndTime;
	/*开始时间*/
	private String scanStartTime;
	
	public Integer getReceiveNum() {
		return receiveNum;
	}
	public void setReceiveNum(Integer receiveNum) {
		this.receiveNum = receiveNum;
	}
	public String getSignNumCount() {
		return signNumCount;
	}
	public void setSignNumCount(String signNumCount) {
		this.signNumCount = signNumCount;
	}
	public String getScanTime() {
		return scanTime;
	}
	public void setScanTime(String scanTime) {
		this.scanTime = scanTime;
	}
	public String getScanEndTime() {
		return scanEndTime;
	}
	public void setScanEndTime(String scanEndTime) {
		this.scanEndTime = scanEndTime;
	}
	public String getScanStartTime() {
		return scanStartTime;
	}
	public void setScanStartTime(String scanStartTime) {
		this.scanStartTime = scanStartTime;
	}
}

package com.ane.report.operation.chartReport.model;

public class ChartReportVO {
	private Long siteId;
	private String siteName;
	private String scanTime;
	private String ewbNum;
	private int siteCount;
	private String packBarCodeNum;
	public String getPackBarCodeNum() {
		return packBarCodeNum;
	}
	public void setPackBarCodeNum(String packBarCodeNum) {
		this.packBarCodeNum = packBarCodeNum;
	}
	public int getSiteCount() {
		return siteCount;
	}
	public void setSiteCount(int siteCount) {
		this.siteCount = siteCount;
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
	public String getScanTime() {
		return scanTime;
	}
	public void setScanTime(String scanTime) {
		this.scanTime = scanTime;
	}
	public String getEwbNum() {
		return ewbNum;
	}
	public void setEwbNum(String ewbNum) {
		this.ewbNum = ewbNum;
	}
	
}

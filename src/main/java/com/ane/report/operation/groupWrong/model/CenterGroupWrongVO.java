package com.ane.report.operation.groupWrong.model;

import java.io.Serializable;
import java.util.Date;

public class CenterGroupWrongVO implements Serializable{
	private static final long serialVersionUID = -2206160029270996906L;
	private String ewbNo;//运单号
	private String packBarCode;//集包号
	private Integer groupSiteId;//集包分拨ID
	private String groupSite;//集包分拨
	private Integer shouldSplitSiteId;//应拆包分拨ID
	private String shouldSplitSite;//应拆包分拨
	private Integer realSplitSiteId;//实拆包分拨ID
	private String realSplitSite;//实拆包分拨
	private Integer scanManId;//操作人ID
	private String scanMan;//操作人
	private Date groupDate;//集包日期
	private String packSpec;//包规格(大中小)
	private String packType;//包类型(红黄绿)
	private Integer ewbNum;//包票数
	private Integer wrongNum;//错票数
	private Integer wrongType;//错集类型(10:错录单20:错集包)
	private Integer status;//数据状态
	private Date createTime;//创建时间
	private String queryStartTime;//查询开始时间
	private String queryEndTime;//查询结束时间
	private Integer sendSiteId;//发件网点ID
	private String sendSite;//发件网点
	private Integer sendCenterSiteId;//发件网点所属分拨ID
	private String sendCenterSite;//发件网点所属分拨
	
	
	public Integer getSendSiteId() {
		return sendSiteId;
	}
	public void setSendSiteId(Integer sendSiteId) {
		this.sendSiteId = sendSiteId;
	}
	public String getSendSite() {
		return sendSite;
	}
	public void setSendSite(String sendSite) {
		this.sendSite = sendSite;
	}
	public Integer getSendCenterSiteId() {
		return sendCenterSiteId;
	}
	public void setSendCenterSiteId(Integer sendCenterSiteId) {
		this.sendCenterSiteId = sendCenterSiteId;
	}
	public String getSendCenterSite() {
		return sendCenterSite;
	}
	public void setSendCenterSite(String sendCenterSite) {
		this.sendCenterSite = sendCenterSite;
	}
	public String getQueryStartTime() {
		return queryStartTime;
	}
	public void setQueryStartTime(String queryStartTime) {
		this.queryStartTime = queryStartTime;
	}
	public String getQueryEndTime() {
		return queryEndTime;
	}
	public void setQueryEndTime(String queryEndTime) {
		this.queryEndTime = queryEndTime;
	}
	public String getEwbNo() {
		return ewbNo;
	}
	public void setEwbNo(String ewbNo) {
		this.ewbNo = ewbNo;
	}
	public String getPackBarCode() {
		return packBarCode;
	}
	public void setPackBarCode(String packBarCode) {
		this.packBarCode = packBarCode;
	}
	public Integer getGroupSiteId() {
		return groupSiteId;
	}
	public void setGroupSiteId(Integer groupSiteId) {
		this.groupSiteId = groupSiteId;
	}
	public String getGroupSite() {
		return groupSite;
	}
	public void setGroupSite(String groupSite) {
		this.groupSite = groupSite;
	}
	public Integer getShouldSplitSiteId() {
		return shouldSplitSiteId;
	}
	public void setShouldSplitSiteId(Integer shouldSplitSiteId) {
		this.shouldSplitSiteId = shouldSplitSiteId;
	}
	public String getShouldSplitSite() {
		return shouldSplitSite;
	}
	public void setShouldSplitSite(String shouldSplitSite) {
		this.shouldSplitSite = shouldSplitSite;
	}
	public Integer getRealSplitSiteId() {
		return realSplitSiteId;
	}
	public void setRealSplitSiteId(Integer realSplitSiteId) {
		this.realSplitSiteId = realSplitSiteId;
	}
	public String getRealSplitSite() {
		return realSplitSite;
	}
	public void setRealSplitSite(String realSplitSite) {
		this.realSplitSite = realSplitSite;
	}
	public Integer getScanManId() {
		return scanManId;
	}
	public void setScanManId(Integer scanManId) {
		this.scanManId = scanManId;
	}
	public String getScanMan() {
		return scanMan;
	}
	public void setScanMan(String scanMan) {
		this.scanMan = scanMan;
	}
	public Date getGroupDate() {
		return groupDate;
	}
	public void setGroupDate(Date groupDate) {
		this.groupDate = groupDate;
	}
	public String getPackSpec() {
		return packSpec;
	}
	public void setPackSpec(String packSpec) {
		this.packSpec = packSpec;
	}
	public String getPackType() {
		return packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	public Integer getEwbNum() {
		return ewbNum;
	}
	public void setEwbNum(Integer ewbNum) {
		this.ewbNum = ewbNum;
	}
	
	public Integer getWrongNum() {
		return wrongNum;
	}
	public void setWrongNum(Integer wrongNum) {
		this.wrongNum = wrongNum;
	}
	public Integer getWrongType() {
		return wrongType;
	}
	public void setWrongType(Integer wrongType) {
		this.wrongType = wrongType;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}

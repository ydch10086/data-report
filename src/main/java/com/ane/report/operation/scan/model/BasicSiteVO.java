package com.ane.report.operation.scan.model;

import java.util.Date;

public class BasicSiteVO {
	private Long siteId;				//站点自动编号
	private String siteCode;			//站点编号
	private String siteName;			//站点名称
	private String sitePinyin;			//站点名称拼音
	private Long siteOrder;				//站点排列顺序
	private Long parentSiteId;			//所属站点自动编号
	private Long scanCenterSiteId;		//扫描结算中心自动编号
	private Long billCenterSiteId;		//运单财务中心自动编号
	private Long firstCenterSiteId; 	//首分拨中心
	private Long siteTypeId;			//站点类型自动编号
	private Integer blFinance;			//开通站点财务功能
	private Double podLimitAmount;		//货到付款金额上限
	private Double codLimitAmount;		//代收货款金额上限
	private Double airplaneLimitAmount;	//航空件金额上限
	private Integer siteState;			//站点状态（1：正常、0：暂停、-1：失效）
	private Long moneyTypeId;			//货币类型ID
	private Integer starLevel;			//网点星级
	private Long sameSiteId;			//相同站点自动编号
	private String remark;				//备注
	private Long createdBy;				//创建人
	private Date createdTime;			//创建时间
	private Long modifiedBy;			//修改人	
	private Date modifiedTime;			//修改时间
	private Integer rdStatus;			//记录数据状态（0：删除  1：正常）
	private Integer serviceType;		//网点服务类型
	private Integer siteMode;			
	private Long parentSiteBankId;		//所属网点编号
	private Long dispSiteId;			//所属目的网点添加
	private Long mtlSiteId; 			//物料申请网点添加
	private String transferPwd;//2016-3-31zmj转账密码添加
	private String deliveryTime;//网点交件时间 HH:mm:ss
	private String receviedTime;//接件时间
	private String signExtendTime; //签收允许延长时间
	private String signNormTime; //签收标准时间
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public String getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSitePinyin() {
		return sitePinyin;
	}
	public void setSitePinyin(String sitePinyin) {
		this.sitePinyin = sitePinyin;
	}
	public Long getSiteOrder() {
		return siteOrder;
	}
	public void setSiteOrder(Long siteOrder) {
		this.siteOrder = siteOrder;
	}
	public Long getParentSiteId() {
		return parentSiteId;
	}
	public void setParentSiteId(Long parentSiteId) {
		this.parentSiteId = parentSiteId;
	}
	public Long getScanCenterSiteId() {
		return scanCenterSiteId;
	}
	public void setScanCenterSiteId(Long scanCenterSiteId) {
		this.scanCenterSiteId = scanCenterSiteId;
	}
	public Long getBillCenterSiteId() {
		return billCenterSiteId;
	}
	public void setBillCenterSiteId(Long billCenterSiteId) {
		this.billCenterSiteId = billCenterSiteId;
	}
	public Long getFirstCenterSiteId() {
		return firstCenterSiteId;
	}
	public void setFirstCenterSiteId(Long firstCenterSiteId) {
		this.firstCenterSiteId = firstCenterSiteId;
	}
	public Long getSiteTypeId() {
		return siteTypeId;
	}
	public void setSiteTypeId(Long siteTypeId) {
		this.siteTypeId = siteTypeId;
	}
	public Integer getBlFinance() {
		return blFinance;
	}
	public void setBlFinance(Integer blFinance) {
		this.blFinance = blFinance;
	}
	public Double getPodLimitAmount() {
		return podLimitAmount;
	}
	public void setPodLimitAmount(Double podLimitAmount) {
		this.podLimitAmount = podLimitAmount;
	}
	public Double getCodLimitAmount() {
		return codLimitAmount;
	}
	public void setCodLimitAmount(Double codLimitAmount) {
		this.codLimitAmount = codLimitAmount;
	}
	public Double getAirplaneLimitAmount() {
		return airplaneLimitAmount;
	}
	public void setAirplaneLimitAmount(Double airplaneLimitAmount) {
		this.airplaneLimitAmount = airplaneLimitAmount;
	}
	public Integer getSiteState() {
		return siteState;
	}
	public void setSiteState(Integer siteState) {
		this.siteState = siteState;
	}
	public Long getMoneyTypeId() {
		return moneyTypeId;
	}
	public void setMoneyTypeId(Long moneyTypeId) {
		this.moneyTypeId = moneyTypeId;
	}
	public Integer getStarLevel() {
		return starLevel;
	}
	public void setStarLevel(Integer starLevel) {
		this.starLevel = starLevel;
	}
	public Long getSameSiteId() {
		return sameSiteId;
	}
	public void setSameSiteId(Long sameSiteId) {
		this.sameSiteId = sameSiteId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public Integer getRdStatus() {
		return rdStatus;
	}
	public void setRdStatus(Integer rdStatus) {
		this.rdStatus = rdStatus;
	}
	public Integer getServiceType() {
		return serviceType;
	}
	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}
	public Integer getSiteMode() {
		return siteMode;
	}
	public void setSiteMode(Integer siteMode) {
		this.siteMode = siteMode;
	}
	public Long getParentSiteBankId() {
		return parentSiteBankId;
	}
	public void setParentSiteBankId(Long parentSiteBankId) {
		this.parentSiteBankId = parentSiteBankId;
	}
	public Long getDispSiteId() {
		return dispSiteId;
	}
	public void setDispSiteId(Long dispSiteId) {
		this.dispSiteId = dispSiteId;
	}
	public Long getMtlSiteId() {
		return mtlSiteId;
	}
	public void setMtlSiteId(Long mtlSiteId) {
		this.mtlSiteId = mtlSiteId;
	}
	public String getTransferPwd() {
		return transferPwd;
	}
	public void setTransferPwd(String transferPwd) {
		this.transferPwd = transferPwd;
	}
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getReceviedTime() {
		return receviedTime;
	}
	public void setReceviedTime(String receviedTime) {
		this.receviedTime = receviedTime;
	}
	public String getSignExtendTime() {
		return signExtendTime;
	}
	public void setSignExtendTime(String signExtendTime) {
		this.signExtendTime = signExtendTime;
	}
	public String getSignNormTime() {
		return signNormTime;
	}
	public void setSignNormTime(String signNormTime) {
		this.signNormTime = signNormTime;
	}

}

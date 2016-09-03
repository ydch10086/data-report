package com.ane.report.operation.scan.model;

import java.util.Date;

public class CustomerVO {
	private Long customerId; // 数据自动编号
	private String customerCode; // 数据编号
	private String customerName; // 数据名称
	private String customerNameAll; // 数据全称
	private String customerPinyin; // 数据名称拼音
	private Long customerOrder; // 数据排列顺序
	private Long siteId; // 所属站点自动编号
	private Integer customerState; // 客户状态（1：正常0：暂停-1：失效）
	private Long customerTypeId; // 客户类型自动编号
	private Integer starLevel; // 客户星级（从1到7，7星最好建议只有总公司为7星）
	private String linkMan; // 联系人
	private String phone; // 联系电话
	private Integer blSms; // 短信通知
	private String phoneSms; // 短信通知号码
	private String email; // 邮箱地址
	private String fax; // 传真号码
	private String postcode; // 邮编
	private Long salesEmployeeId; // 业务员员工自动编号
	private Long recEmployeeId; // 收件人员工自动编号
	private Long dispEmployeeId; // 派件人员工自动编号
	private String remark; // 备注
	private Long balanceModeId; // 结算方式
	private Date balanceDate; // 结算日期
	private String contractCode; // 合同编号
	private String balanceLinkMan; // 财务联系人
	private String balancePhone; // 财务电话
	private Long bankId; // 银行自动编号
	private String bankAccount; // 银行帐号
	private Date startDate; // 合同开始日期
	private Date endDate; // 合同结束日期
	private String pwd; // 客户密码
	private Long createdBy; // 创建人
	private Date createdTime; // 创建时间
	private Long modifiedBy; // 修改人
	private Date modifiedTime; // 修改时间
	private Integer rdStatus; // 记录数据状态（0：删除 1：正常）
	private String customerCountryId; // 企业统编
	private Integer customerClass; // 客户类型（1、寄件 2、收件)
	
	private Long customerAddressId; //地址顺序编号
	private String address; // 客户详细地址
	// Constructors
	
	private String createSiteName;	//创建客户网点
	private String modifiedSiteName;//最后修改客户网点
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNameAll() {
		return customerNameAll;
	}
	public void setCustomerNameAll(String customerNameAll) {
		this.customerNameAll = customerNameAll;
	}
	public String getCustomerPinyin() {
		return customerPinyin;
	}
	public void setCustomerPinyin(String customerPinyin) {
		this.customerPinyin = customerPinyin;
	}
	public Long getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(Long customerOrder) {
		this.customerOrder = customerOrder;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public Integer getCustomerState() {
		return customerState;
	}
	public void setCustomerState(Integer customerState) {
		this.customerState = customerState;
	}
	public Long getCustomerTypeId() {
		return customerTypeId;
	}
	public void setCustomerTypeId(Long customerTypeId) {
		this.customerTypeId = customerTypeId;
	}
	public Integer getStarLevel() {
		return starLevel;
	}
	public void setStarLevel(Integer starLevel) {
		this.starLevel = starLevel;
	}
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getBlSms() {
		return blSms;
	}
	public void setBlSms(Integer blSms) {
		this.blSms = blSms;
	}
	public String getPhoneSms() {
		return phoneSms;
	}
	public void setPhoneSms(String phoneSms) {
		this.phoneSms = phoneSms;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public Long getSalesEmployeeId() {
		return salesEmployeeId;
	}
	public void setSalesEmployeeId(Long salesEmployeeId) {
		this.salesEmployeeId = salesEmployeeId;
	}
	public Long getRecEmployeeId() {
		return recEmployeeId;
	}
	public void setRecEmployeeId(Long recEmployeeId) {
		this.recEmployeeId = recEmployeeId;
	}
	public Long getDispEmployeeId() {
		return dispEmployeeId;
	}
	public void setDispEmployeeId(Long dispEmployeeId) {
		this.dispEmployeeId = dispEmployeeId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getBalanceModeId() {
		return balanceModeId;
	}
	public void setBalanceModeId(Long balanceModeId) {
		this.balanceModeId = balanceModeId;
	}
	public Date getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}
	public String getContractCode() {
		return contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getBalanceLinkMan() {
		return balanceLinkMan;
	}
	public void setBalanceLinkMan(String balanceLinkMan) {
		this.balanceLinkMan = balanceLinkMan;
	}
	public String getBalancePhone() {
		return balancePhone;
	}
	public void setBalancePhone(String balancePhone) {
		this.balancePhone = balancePhone;
	}
	public Long getBankId() {
		return bankId;
	}
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public String getCustomerCountryId() {
		return customerCountryId;
	}
	public void setCustomerCountryId(String customerCountryId) {
		this.customerCountryId = customerCountryId;
	}
	public Integer getCustomerClass() {
		return customerClass;
	}
	public void setCustomerClass(Integer customerClass) {
		this.customerClass = customerClass;
	}
	public Long getCustomerAddressId() {
		return customerAddressId;
	}
	public void setCustomerAddressId(Long customerAddressId) {
		this.customerAddressId = customerAddressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreateSiteName() {
		return createSiteName;
	}
	public void setCreateSiteName(String createSiteName) {
		this.createSiteName = createSiteName;
	}
	public String getModifiedSiteName() {
		return modifiedSiteName;
	}
	public void setModifiedSiteName(String modifiedSiteName) {
		this.modifiedSiteName = modifiedSiteName;
	}
	
	
}

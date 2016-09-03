package com.ane.report.operation.scan.model;

import java.util.Date;



public class BasicEmployeeVO {
	/** 员工自动编号 **/
	private Long employeeId;
	/** 员工编号 **/
	private String employeeCode;
	/** 员工名称 **/
	private String employeeName;
	/** 员工名称拼音 **/
	private String employeePinyin;
	/** 员工排列顺序 **/
	private Long employeeOrder;	
	/** 所属站点自动编号 **/
	private Long siteId;
	/** 部门岗位ID **/
	private Long deptJobId;
	/** 身份证号 **/
	private String idCard;
	/** 性别 **/
	private String sex;	
	/** 联系电话 **/
	private String phone;
	/** 短信通知号码 **/
	private String phoneSms;
	/** 邮箱 **/
	private String e_mail;
	/** 生日 **/
	private Date birthday;
	/** 住址 **/
	private String address;
	/** 个人备注 **/
	private String selfRemark;
	/** 在职 **/
	private Integer blUse;
	/** 入职日期 **/
	private Date startDate;	
	/** 离职日期 **/
	private Date endDate;
	/** 基本工资 **/
	private Double basicSalar;
	/** 补助 **/
	private Double addSalar;;
	/** 收派货物最高风险总额 **/
	private Double limitSumAmount;
	/** 收派货物单件最高风险金额 **/
	private Double limitOneAmount;
	/** 运输工具自动编号 **/
	private Long transportToolId;
	/** 所属承包区自动编号 **/
	private Long partId;
	/** 工作备注 **/
	private String jobRemark;
	/** 驾照类型 **/
	private String driverLicenseType;
	/** 结算开户银行ID **/
	private Long bankId;
	/** 创建人 **/
	private Long createdBy;	
	/** 创建时间 **/
	private Date createdTime;
	/** 修改人 **/
	private Long modifiedBy;
	/** 修改时间 **/
	private Date modifiedTime;
	/** 数据状态(0：删除  1：正常) **/
	private Integer rdStatus;
	/** 银行开户行ID **/
	private Long BankAccountId;
	/** 银行开户户名 **/
	private String BankAccountName;
	/** 银行开户帐号 **/
	private String BankAccountNo;
	/** 员工工号 **/
	private String employeeNo;
	
	/** 所属部门自动编号 **/
	private Long deptId;
	/** 工作岗位自动编号 **/
	private Long jobId;	
	/** 用户ID **/
	private Long userId;
	/** 巴枪密码 **/
	private String pdaPwd;
	/** 支付宝账户 **/
	private String alipayNo;
	/** 微信账号 **/
	private String weChatNo;
	/** 实名制状态 **/
	private Integer realNameStatus;
	/** 承包区标识 **/
	private Long partFlag = 0L;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePinyin() {
		return employeePinyin;
	}
	public void setEmployeePinyin(String employeePinyin) {
		this.employeePinyin = employeePinyin;
	}
	public Long getEmployeeOrder() {
		return employeeOrder;
	}
	public void setEmployeeOrder(Long employeeOrder) {
		this.employeeOrder = employeeOrder;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public Long getDeptJobId() {
		return deptJobId;
	}
	public void setDeptJobId(Long deptJobId) {
		this.deptJobId = deptJobId;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhoneSms() {
		return phoneSms;
	}
	public void setPhoneSms(String phoneSms) {
		this.phoneSms = phoneSms;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSelfRemark() {
		return selfRemark;
	}
	public void setSelfRemark(String selfRemark) {
		this.selfRemark = selfRemark;
	}
	public Integer getBlUse() {
		return blUse;
	}
	public void setBlUse(Integer blUse) {
		this.blUse = blUse;
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
	public Double getBasicSalar() {
		return basicSalar;
	}
	public void setBasicSalar(Double basicSalar) {
		this.basicSalar = basicSalar;
	}
	public Double getAddSalar() {
		return addSalar;
	}
	public void setAddSalar(Double addSalar) {
		this.addSalar = addSalar;
	}
	public Double getLimitSumAmount() {
		return limitSumAmount;
	}
	public void setLimitSumAmount(Double limitSumAmount) {
		this.limitSumAmount = limitSumAmount;
	}
	public Double getLimitOneAmount() {
		return limitOneAmount;
	}
	public void setLimitOneAmount(Double limitOneAmount) {
		this.limitOneAmount = limitOneAmount;
	}
	public Long getTransportToolId() {
		return transportToolId;
	}
	public void setTransportToolId(Long transportToolId) {
		this.transportToolId = transportToolId;
	}
	public Long getPartId() {
		return partId;
	}
	public void setPartId(Long partId) {
		this.partId = partId;
	}
	public String getJobRemark() {
		return jobRemark;
	}
	public void setJobRemark(String jobRemark) {
		this.jobRemark = jobRemark;
	}
	public String getDriverLicenseType() {
		return driverLicenseType;
	}
	public void setDriverLicenseType(String driverLicenseType) {
		this.driverLicenseType = driverLicenseType;
	}
	public Long getBankId() {
		return bankId;
	}
	public void setBankId(Long bankId) {
		this.bankId = bankId;
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
	public Long getBankAccountId() {
		return BankAccountId;
	}
	public void setBankAccountId(Long bankAccountId) {
		BankAccountId = bankAccountId;
	}
	public String getBankAccountName() {
		return BankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		BankAccountName = bankAccountName;
	}
	public String getBankAccountNo() {
		return BankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		BankAccountNo = bankAccountNo;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPdaPwd() {
		return pdaPwd;
	}
	public void setPdaPwd(String pdaPwd) {
		this.pdaPwd = pdaPwd;
	}
	public String getAlipayNo() {
		return alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}
	public String getWeChatNo() {
		return weChatNo;
	}
	public void setWeChatNo(String weChatNo) {
		this.weChatNo = weChatNo;
	}
	public Integer getRealNameStatus() {
		return realNameStatus;
	}
	public void setRealNameStatus(Integer realNameStatus) {
		this.realNameStatus = realNameStatus;
	}
	public Long getPartFlag() {
		return partFlag;
	}
	public void setPartFlag(Long partFlag) {
		this.partFlag = partFlag;
	}
}

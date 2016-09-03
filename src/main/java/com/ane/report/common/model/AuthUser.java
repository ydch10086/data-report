/**
 * @Title: AuthUser.java
 * @Package com.ane.report.common.model
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:*****信息技术有限责任公司
 * 
 * @author Comsys-xuanning
 * @date 2016年6月3日 上午11:21:58
 * @version V1.0
 */

package com.ane.report.common.model;

import java.util.Date;

/**
 * @ClassName: AuthUser
 * @Description: 登录用户
 * @author Comsys-xuanning
 * @date 2016年6月3日 上午11:21:58
 */
public class AuthUser {

	private long userId;
	private String userName;
	private String userPwd;
	private int userType;
	private long employeeId;
	private Date expireDate;
	private int userStatus;
	private Long siteId;
	private String siteName;
	
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return String
				.format("AuthUser [userId=%s, userName=%s, userPwd=%s, userType=%s, employeeId=%s, expireDate=%s, userStatus=%s]",
						userId, userName, userPwd, userType, employeeId,
						expireDate, userStatus);
	}
	
	
}

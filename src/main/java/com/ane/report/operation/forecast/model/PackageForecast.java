package com.ane.report.operation.forecast.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class PackageForecast implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -733714527092889142L;
	private String loadCarId;
	private String groupPackId;
	private Date scanTime;
	private String createBy;
	private Integer createById;
	private String packBarCode;
	private Integer scanSource;
	private String deviceCode;
	private Date createTime;
	private Integer status;
	private Date leaveTime;
	private String carNum;
	private String vehicleNumber;
	private String taskNum;
	/**包数总和**/
	private Integer packNum;
	private Integer leaveSiteId;
	private String leaveSite;
	private Integer nextSiteId;
	private String nextSite;
	/**容积总和*/
	private Long sumVolume;
	/**票数*/
	private Integer ewbNum;
	/**车辆状态*/
	private String carStatus;
	/**计划出发时间*/
	private Date planLeaveTime;
	/**计划到达时间*/
	private Date planArriveTime;
	
	/**实到时间*/
	private Date arriveTime;
	/**货量预报详情*/
	private String jsonQueryData;
	/**装车taskNUM*/
	private String loadCarTaskNum;
	/**发车taskNUm*/
	private String carDepartTaskNum;
	/**卸车taskNUm*/
	private String carUnloadTaskNum;
	
	public String getLoadCarId() {
		return loadCarId;
	}
	public void setLoadCarId(String loadCarId) {
		this.loadCarId = loadCarId;
	}
	public String getGroupPackId() {
		return groupPackId;
	}
	public void setGroupPackId(String groupPackId) {
		this.groupPackId = groupPackId;
	}
	public Date getScanTime() {
		return scanTime;
	}
	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Integer getCreateById() {
		return createById;
	}
	public void setCreateById(Integer createById) {
		this.createById = createById;
	}
	public String getPackBarCode() {
		return packBarCode;
	}
	public void setPackBarCode(String packBarCode) {
		this.packBarCode = packBarCode;
	}
	public Integer getScanSource() {
		return scanSource;
	}
	public void setScanSource(Integer scanSource) {
		this.scanSource = scanSource;
	}
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getTaskNum() {
		return taskNum;
	}
	public void setTaskNum(String taskNum) {
		this.taskNum = taskNum;
	}
	public Integer getPackNum() {
		return packNum;
	}
	public void setPackNum(Integer packNum) {
		this.packNum = packNum;
	}
	public Integer getLeaveSiteId() {
		return leaveSiteId;
	}
	public void setLeaveSiteId(Integer leaveSiteId) {
		this.leaveSiteId = leaveSiteId;
	}
	public String getLeaveSite() {
		return leaveSite;
	}
	public void setLeaveSite(String leaveSite) {
		this.leaveSite = leaveSite;
	}
	public Integer getNextSiteId() {
		return nextSiteId;
	}
	public void setNextSiteId(Integer nextSiteId) {
		this.nextSiteId = nextSiteId;
	}
	public String getNextSite() {
		return nextSite;
	}
	public void setNextSite(String nextSite) {
		this.nextSite = nextSite;
	}
	public Long getSumVolume() {
		return sumVolume;
	}
	public void setSumVolume(Long sumVolume) {
		this.sumVolume = sumVolume;
	}
	public Integer getEwbNum() {
		return ewbNum;
	}
	public void setEwbNum(Integer ewbNum) {
		this.ewbNum = ewbNum;
	}
	public String getCarStatus() {
		return carStatus;
	}
	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	public Date getPlanLeaveTime() {
		return planLeaveTime;
	}
	public void setPlanLeaveTime(Date planLeaveTime) {
		this.planLeaveTime = planLeaveTime;
	}
	public Date getPlanArriveTime() {
		return planArriveTime;
	}
	public void setPlanArriveTime(Date planArriveTime) {
		this.planArriveTime = planArriveTime;
	}
	public Date getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}
	public String getJsonQueryData() {
		return jsonQueryData;
	}
	public void setJsonQueryData(String jsonQueryData) {
		this.jsonQueryData = jsonQueryData;
	}
	public String getCarDepartTaskNum() {
		return carDepartTaskNum;
	}
	public void setCarDepartTaskNum(String carDepartTaskNum) {
		this.carDepartTaskNum = carDepartTaskNum;
	}
	public String getCarUnloadTaskNum() {
		return carUnloadTaskNum;
	}
	public void setCarUnloadTaskNum(String carUnloadTaskNum) {
		this.carUnloadTaskNum = carUnloadTaskNum;
	}
	public String getLoadCarTaskNum() {
		return loadCarTaskNum;
	}
	public void setLoadCarTaskNum(String loadCarTaskNum) {
		this.loadCarTaskNum = loadCarTaskNum;
	}

	
}

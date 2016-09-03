package com.ane.report.operation.forecast.model;

import java.io.Serializable;
import java.util.Date;

public class BasicPackage implements Serializable {

	private static final long serialVersionUID = -5006966484467231586L;
	private Integer packId;
	private Integer packType;
	private Long packSize;
	private Long minVol;
	private Long maxVol;
	private Long minWeight;
	private Long maxWeight;
	private Integer minTicket;
	private Integer maxTicket;
	private Integer firstCenterId;
	private Integer createdBy;
	private Integer modifyBy;
	private Integer rdStatus;
	private Date createdTime;
	private Date modifyTime;

	public Integer getPackId() {
		return packId;
	}

	public void setPackId(Integer packId) {
		this.packId = packId;
	}

	public Integer getPackType() {
		return packType;
	}

	public void setPackType(Integer packType) {
		this.packType = packType;
	}

	public Long getPackSize() {
		return packSize;
	}

	public void setPackSize(Long packSize) {
		this.packSize = packSize;
	}

	public Long getMinVol() {
		return minVol;
	}

	public void setMinVol(Long minVol) {
		this.minVol = minVol;
	}

	public Long getMaxVol() {
		return maxVol;
	}

	public void setMaxVol(Long maxVol) {
		this.maxVol = maxVol;
	}

	public Long getMinWeight() {
		return minWeight;
	}

	public void setMinWeight(Long minWeight) {
		this.minWeight = minWeight;
	}

	public Long getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(Long maxWeight) {
		this.maxWeight = maxWeight;
	}

	public Integer getMinTicket() {
		return minTicket;
	}

	public void setMinTicket(Integer minTicket) {
		this.minTicket = minTicket;
	}

	public Integer getMaxTicket() {
		return maxTicket;
	}

	public void setMaxTicket(Integer maxTicket) {
		this.maxTicket = maxTicket;
	}

	public Integer getFirstCenterId() {
		return firstCenterId;
	}

	public void setFirstCenterId(Integer firstCenterId) {
		this.firstCenterId = firstCenterId;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Integer getRdStatus() {
		return rdStatus;
	}

	public void setRdStatus(Integer rdStatus) {
		this.rdStatus = rdStatus;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}

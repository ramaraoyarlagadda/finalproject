package com.cg.resourcedeploy.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BENCH_MASTER")
public class BenchMasterBean {

	@Override
	public String toString() {
		return "BenchMasterBean [benchAvailabilityId=" + benchAvailabilityId + ", activeFlag=" + activeFlag
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", availabilityName=" + availabilityName + ", benchMasterBean="
				+ benchMasterBean + "]";
	}

	@Id
	@Column(name = "BENCH_AVAILABILITY_ID")
	private String benchAvailabilityId;

	@Column(name = "ACTIVE_FLAG")
	private int activeFlag;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	@Column(name = "AVAILABILITY_NAME")
	private String availabilityName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "benchMasterBean")
	private List<BenchMasterBean> benchMasterBean = new ArrayList<BenchMasterBean>();

	public String getBenchAvailabilityId() {
		return benchAvailabilityId;
	}

	public void setBenchAvailabilityId(String benchAvailabilityId) {
		this.benchAvailabilityId = benchAvailabilityId;
	}

	public int isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getAvailabilityName() {
		return availabilityName;
	}

	public void setAvailabilityName(String availabilityName) {
		this.availabilityName = availabilityName;
	}

	

}

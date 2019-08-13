package com.cg.resourcedeploy.dto;

import java.io.Serializable;
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
@Table(name = "GRADE_MASTER")
public class GradeMasterEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "GRADE_ID")
	private String gradeId;

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

	@Column(name = "CEIL")
	private int ceil;

	@Column(name = "EXP_BUFFER")
	private String expBuffer;

	@Column(name = "FLOOR")
	private int floor;

	@Column(name = "GRADE_NAME")
	private String gradeName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gradeMaster")
	private List<GradeMasterEntity> gradeMaster = new ArrayList<GradeMasterEntity>();

	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
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

	public int getCeil() {
		return ceil;
	}

	public void setCeil(int ceil) {
		this.ceil = ceil;
	}

	public String getExpBuffer() {
		return expBuffer;
	}

	public void setExpBuffer(String expBuffer) {
		this.expBuffer = expBuffer;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	@Override
	public String toString() {
		return "GradeMasterBean [gradeId=" + gradeId + ", activeFlag=" + activeFlag + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", ceil=" + ceil + ", expBuffer=" + expBuffer + ", floor=" + floor + ", gradeName=" + gradeName
				+ ", gradeMaster=" + gradeMaster + "]";
	}

	

	

}

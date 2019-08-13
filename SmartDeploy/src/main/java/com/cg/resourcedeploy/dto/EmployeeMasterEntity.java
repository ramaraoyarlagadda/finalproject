package com.cg.resourcedeploy.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_MASTER")
public class EmployeeMasterEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMP_ID")
	private String empId;

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

	@Column(name = "BENCH_AGE")
	private int benchAge;

	@Column(name = "BU")
	private String bu;

	@Column(name = "DATE_OF_JOINING")
	private Date dateOfJoining;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "GLOBAL_ID")
	private String globalId;

	@Column(name = "IS_RESUME")
	private int isResume;

	@Column(name = "IS_TRAINING_ASSIGNED")
	private int isTrainingAssigned;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "MOBILE")
	private int mobile;

	@Column(name = "RESUME")
	private String resume;

	@Column(name = "SPOC_ID")
	private String spocId;

	@Column(name = "TCG_EMPLOYEE")
	private String tcgEmployee;

	@Column(name = "ETAP_TAGS_ID")
	private String etapTagsId;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "IS_NEW_USER")
	private int isNewUser;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BENCH_AVAILABILITY_ID", referencedColumnName = "BENCH_AVAILABILITY_ID")
	private BenchMasterEntity benchMaster;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GRADE_ID", referencedColumnName = "GRADE_ID")
	private GradeMasterEntity gradeMaster;

	
	public BenchMasterEntity getBenchMaster() {
		return benchMaster;
	}

	public void setBenchMaster(BenchMasterEntity benchMaster) {
		this.benchMaster = benchMaster;
	}

	public GradeMasterEntity getGradeMaster() {
		return gradeMaster;
	}

	public void setGradeMaster(GradeMasterEntity gradeMaster) {
		this.gradeMaster = gradeMaster;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getActiveFlag() {
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

	public int getBenchAge() {
		return benchAge;
	}

	public void setBenchAge(int benchAge) {
		this.benchAge = benchAge;
	}

	public String getBu() {
		return bu;
	}

	public void setBu(String bu) {
		this.bu = bu;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public int getIsResume() {
		return isResume;
	}

	public void setIsResume(int isResume) {
		this.isResume = isResume;
	}

	public int getIsTrainingAssigned() {
		return isTrainingAssigned;
	}

	public void setIsTrainingAssigned(int isTrainingAssigned) {
		this.isTrainingAssigned = isTrainingAssigned;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getSpocId() {
		return spocId;
	}

	public void setSpocId(String spocId) {
		this.spocId = spocId;
	}

	public String getTcgEmployee() {
		return tcgEmployee;
	}

	public void setTcgEmployee(String tcgEmployee) {
		this.tcgEmployee = tcgEmployee;
	}

	public String getEtapTagsId() {
		return etapTagsId;
	}

	public void setEtapTagsId(String etapTagsId) {
		this.etapTagsId = etapTagsId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsNewUser() {
		return isNewUser;
	}

	public void setIsNewUser(int isNewUser) {
		this.isNewUser = isNewUser;
	}

	@Override
	public String toString() {
		return "EmployeeMasterBean [empId=" + empId + ", activeFlag=" + activeFlag + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", benchAge=" + benchAge + ", bu=" + bu + ", dateOfJoining=" + dateOfJoining + ", emailId=" + emailId
				+ ", empName=" + empName + ", gender=" + gender + ", globalId=" + globalId + ", isResume=" + isResume
				+ ", isTrainingAssigned=" + isTrainingAssigned + ", location=" + location + ", mobile=" + mobile
				+ ", resume=" + resume + ", spocId=" + spocId + ", tcgEmployee=" + tcgEmployee + ", etapTagsId="
				+ etapTagsId + ", password=" + password + ", isNewUser=" + isNewUser + ", benchMaster="
				+ benchMaster + ", gradeMaster=" + gradeMaster + "]";
	}

}

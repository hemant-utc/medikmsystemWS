package com.medikm.input.request;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Monika
 *
 */
@ApiModel(value = "Physician Request", description = "Physician Request.")
@XmlRootElement(name = "physicianRequest")
public class PhysicianRequest {

	private Integer physicianId;
	private String fname;
	private String minit;
	private String lname;
	private String phyGroup;
	private String eMailId;
	private String phoneNo;
	private String profileImage;
	private Integer facilityTypeId;
	private Integer specialtyTypeId;
	private Integer diseaseType;
	private Integer cancerType;
	private String userName;
	private String password;
	private String authToken;
	private String createUserAccountCheck;
	private String roleCode;
	private Boolean isActive;

	@ApiModelProperty(value = "Is Active", notes = "Is Active", dataType = "Boolean")
	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@ApiModelProperty(value = "Auth Token", notes = "Auth Token", dataType = "String")
	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	@ApiModelProperty(value = "Create User Account Check", notes = "Create User Account Check", dataType = "String")
	public String getCreateUserAccountCheck() {
		return createUserAccountCheck;
	}

	public void setCreateUserAccountCheck(String createUserAccountCheck) {
		this.createUserAccountCheck = createUserAccountCheck;
	}

	@ApiModelProperty(value = "Role Code", notes = "Role Code", dataType = "String")
	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@ApiModelProperty(value = "User Name", notes = "User Name", dataType = "String")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@ApiModelProperty(value = "Password", notes = "Password", dataType = "String")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ApiModelProperty(value = "Physician Id", notes = "Physician Id", dataType = "Integer")
	public Integer getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(Integer physicianId) {
		this.physicianId = physicianId;
	}

	@ApiModelProperty(value = "First Name", notes = "First Name", dataType = "String")
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@ApiModelProperty(value = "Minit", notes = "Minit", dataType = "String")
	public String getMinit() {
		return minit;
	}

	public void setMinit(String minit) {
		this.minit = minit;
	}

	@ApiModelProperty(value = "Last Name", notes = "Last Name", dataType = "String")
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@ApiModelProperty(value = "Phy Group", notes = "Phy Group", dataType = "String")
	public String getPhyGroup() {
		return phyGroup;
	}

	public void setPhyGroup(String phyGroup) {
		this.phyGroup = phyGroup;
	}

	@ApiModelProperty(value = "Phone No", notes = "Phone No", dataType = "String")
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@ApiModelProperty(value = "Profile Image", notes = "Profile Image", dataType = "String")
	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	@ApiModelProperty(value = "Facility Type Id", notes = "Facility Type Id", dataType = "Integer")
	public Integer getFacilityTypeId() {
		return facilityTypeId;
	}

	public void setFacilityTypeId(Integer facilityTypeId) {
		this.facilityTypeId = facilityTypeId;
	}

	@ApiModelProperty(value = "Specialty Type Id", notes = "Specialty Type Id", dataType = "Integer")
	public Integer getSpecialtyTypeId() {
		return specialtyTypeId;
	}

	public void setSpecialtyTypeId(Integer specialtyTypeId) {
		this.specialtyTypeId = specialtyTypeId;
	}

	@ApiModelProperty(value = "Disease Type", notes = "Disease Type", dataType = "Integer")
	public Integer getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(Integer diseaseType) {
		this.diseaseType = diseaseType;
	}

	@ApiModelProperty(value = "Cancer Type", notes = "Cancer Type", dataType = "Integer")
	public Integer getCancerType() {
		return cancerType;
	}

	public void setCancerType(Integer cancerType) {
		this.cancerType = cancerType;
	}

	@ApiModelProperty(value = "Email Id", notes = "Email Id", dataType = "String")
	public String geteMailId() {
		return eMailId;
	}

	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}

}

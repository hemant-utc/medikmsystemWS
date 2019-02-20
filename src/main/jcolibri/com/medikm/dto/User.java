package com.medikm.dto;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class User implements java.io.Serializable {

	// Fields

	private Integer loginId;
	private UserPropertiesInfo userPropertiesInfo;
	private DiseaseType diseaseType;
	private Customer customer;
	private Integer physicianId;
	private String userName;
	private String password;
	private Short priority;
	private Boolean isActive;
	private String roleCode;
	private String authToken;
	private Date createUserDate;
	private String deviceId;
	private String platformCode;
	private Timestamp modificationTime;
	private Integer loginAttempt;
	private Timestamp lastLoginAttemptDate;
	private String sessionId;
	private String registerCode;
	private Integer setPasswordRequest;
	private Set userPropertiesInfos = new HashSet(0);
	private Set userMachineInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String authToken, Date createUserDate) {
		this.authToken = authToken;
		this.createUserDate = createUserDate;
	}

	/** full constructor */
	public User(UserPropertiesInfo userPropertiesInfo, DiseaseType diseaseType, Customer customer, Integer physicianId,
			String userName, String password, Short priority, Boolean isActive, String roleCode, String authToken,
			Date createUserDate, String deviceId, String platformCode, Timestamp modificationTime, Integer loginAttempt,
			Timestamp lastLoginAttemptDate, String sessionId, String registerCode, Integer setPasswordRequest,
			Set userPropertiesInfos, Set userMachineInfos) {
		this.userPropertiesInfo = userPropertiesInfo;
		this.diseaseType = diseaseType;
		this.customer = customer;
		this.physicianId = physicianId;
		this.userName = userName;
		this.password = password;
		this.priority = priority;
		this.isActive = isActive;
		this.roleCode = roleCode;
		this.authToken = authToken;
		this.createUserDate = createUserDate;
		this.deviceId = deviceId;
		this.platformCode = platformCode;
		this.modificationTime = modificationTime;
		this.loginAttempt = loginAttempt;
		this.lastLoginAttemptDate = lastLoginAttemptDate;
		this.sessionId = sessionId;
		this.registerCode = registerCode;
		this.setPasswordRequest = setPasswordRequest;
		this.userPropertiesInfos = userPropertiesInfos;
		this.userMachineInfos = userMachineInfos;
	}

	// Property accessors

	public Integer getLoginId() {
		return this.loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public UserPropertiesInfo getUserPropertiesInfo() {
		return this.userPropertiesInfo;
	}

	public void setUserPropertiesInfo(UserPropertiesInfo userPropertiesInfo) {
		this.userPropertiesInfo = userPropertiesInfo;
	}

	public DiseaseType getDiseaseType() {
		return this.diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getPhysicianId() {
		return this.physicianId;
	}

	public void setPhysicianId(Integer physicianId) {
		this.physicianId = physicianId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Short getPriority() {
		return this.priority;
	}

	public void setPriority(Short priority) {
		this.priority = priority;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getAuthToken() {
		return this.authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public Date getCreateUserDate() {
		return this.createUserDate;
	}

	public void setCreateUserDate(Date createUserDate) {
		this.createUserDate = createUserDate;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}

	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public Timestamp getModificationTime() {
		return this.modificationTime;
	}

	public void setModificationTime(Timestamp modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Integer getLoginAttempt() {
		return this.loginAttempt;
	}

	public void setLoginAttempt(Integer loginAttempt) {
		this.loginAttempt = loginAttempt;
	}

	public Timestamp getLastLoginAttemptDate() {
		return this.lastLoginAttemptDate;
	}

	public void setLastLoginAttemptDate(Timestamp lastLoginAttemptDate) {
		this.lastLoginAttemptDate = lastLoginAttemptDate;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getRegisterCode() {
		return this.registerCode;
	}

	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}

	public Integer getSetPasswordRequest() {
		return this.setPasswordRequest;
	}

	public void setSetPasswordRequest(Integer setPasswordRequest) {
		this.setPasswordRequest = setPasswordRequest;
	}

	public Set getUserPropertiesInfos() {
		return this.userPropertiesInfos;
	}

	public void setUserPropertiesInfos(Set userPropertiesInfos) {
		this.userPropertiesInfos = userPropertiesInfos;
	}

	public Set getUserMachineInfos() {
		return this.userMachineInfos;
	}

	public void setUserMachineInfos(Set userMachineInfos) {
		this.userMachineInfos = userMachineInfos;
	}

}
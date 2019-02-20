/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u") })
@NamedQuery(name = "User.findByAuthToken", query = "SELECT u FROM User u WHERE u.authToken = :authToken")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "LoginId")
	private Integer loginId;
	@Column(name = "PhysicianId")
	private Integer physicianId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "Priority")
	private Short priority;
	@Column(name = "isActive")
	private Boolean isActive;
	@Column(name = "roleCode")
	private String roleCode;
	@Column(name = "authToken")
	private String authToken;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
	private Collection<UserPropertiesInfo> userPropertiesInfoCollection;
	@JoinColumn(name = "user_property_info_Id", referencedColumnName = "user_property_info_Id")
	@ManyToOne
	private UserPropertiesInfo userpropertyinfoId;
	@JoinColumn(name = "Disease_Type_Id", referencedColumnName = "Disease_Type_Id")
	@ManyToOne
	private DiseaseType diseaseTypeId;
	@JoinColumn(name = "Customer_Id", referencedColumnName = "Customer_Id")
	@ManyToOne
	private Customer customerId;
	@Column(name = "create_user_date")
	private Date create_user_date;
	@Column(name = "modification_time")
	private Date modificationTime;
	@Column(name = "login_attempt")
	private Integer loginAttempt;
	@Column(name = "last_login_attempt_date")
	private Date lastLoginAttemptTime;
	@Column(name = "sessionId")
	private String sessionId;
	@Column(name = "register_code")
	private String registerCode;
	@Column(name = "set_password_request")
	private Integer setPasswordRequest;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Collection<UserMachineInfo> userMachineInfoCollection;

	/**
	 * @return the create_user_date
	 */
	public Date getCreate_user_date() {
		return create_user_date;
	}

	/**
	 * @param create_user_date
	 *            the create_user_date to set
	 */
	public void setCreate_user_date(Date create_user_date) {
		this.create_user_date = create_user_date;
	}

	public User() {
	}

	public User(Integer loginId) {
		this.loginId = loginId;
	}

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getRegisterCode() {
		return registerCode;
	}

	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}

	public Integer getSetPasswordRequest() {
		return setPasswordRequest;
	}

	public void setSetPasswordRequest(Integer setPasswordRequest) {
		this.setPasswordRequest = setPasswordRequest;
	}

	public Integer getPhysicianId() {
		return physicianId;
	}

	public Date getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(Date modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Integer getLoginAttempt() {
		return loginAttempt;
	}

	public void setLoginAttempt(Integer loginAttempt) {
		this.loginAttempt = loginAttempt;
	}

	public Date getLastLoginAttemptTime() {
		return lastLoginAttemptTime;
	}

	public void setLastLoginAttemptTime(Date lastLoginAttemptTime) {
		this.lastLoginAttemptTime = lastLoginAttemptTime;
	}

	public void setPhysicianId(Integer physicianId) {
		this.physicianId = physicianId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Short getPriority() {
		return priority;
	}

	public void setPriority(Short priority) {
		this.priority = priority;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@XmlTransient
	public Collection<UserPropertiesInfo> getUserPropertiesInfoCollection() {
		return userPropertiesInfoCollection;
	}

	public void setUserPropertiesInfoCollection(Collection<UserPropertiesInfo> userPropertiesInfoCollection) {
		this.userPropertiesInfoCollection = userPropertiesInfoCollection;
	}

	public UserPropertiesInfo getUserpropertyinfoId() {
		return userpropertyinfoId;
	}

	public void setUserpropertyinfoId(UserPropertiesInfo userpropertyinfoId) {
		this.userpropertyinfoId = userpropertyinfoId;
	}

	public Collection<UserMachineInfo> getUserMachineInfoCollection() {
		return userMachineInfoCollection;
	}

	public void setUserMachineInfoCollection(Collection<UserMachineInfo> userMachineInfoCollection) {
		this.userMachineInfoCollection = userMachineInfoCollection;
	}

	public DiseaseType getDiseaseTypeId() {
		return diseaseTypeId;
	}

	public void setDiseaseTypeId(DiseaseType diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the authToken
	 */
	public String getAuthToken() {
		return authToken;
	}

	/**
	 * @param authToken
	 *            the authToken to set
	 */
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (loginId != null ? loginId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof User)) {
			return false;
		}
		User other = (User) object;
		if ((this.loginId == null && other.loginId != null)
				|| (this.loginId != null && !this.loginId.equals(other.loginId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.User[ loginId=" + loginId + " ]";
	}

}

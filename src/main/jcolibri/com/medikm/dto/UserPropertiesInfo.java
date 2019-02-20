package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * UserPropertiesInfo entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class UserPropertiesInfo implements java.io.Serializable {

	// Fields

	private Integer userPropertyInfoId;
	private PropertiesType propertiesType;
	private User user;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserPropertiesInfo() {
	}

	/** minimal constructor */
	public UserPropertiesInfo(PropertiesType propertiesType, User user) {
		this.propertiesType = propertiesType;
		this.user = user;
	}

	/** full constructor */
	public UserPropertiesInfo(PropertiesType propertiesType, User user, Set users) {
		this.propertiesType = propertiesType;
		this.user = user;
		this.users = users;
	}

	// Property accessors

	public Integer getUserPropertyInfoId() {
		return this.userPropertyInfoId;
	}

	public void setUserPropertyInfoId(Integer userPropertyInfoId) {
		this.userPropertyInfoId = userPropertyInfoId;
	}

	public PropertiesType getPropertiesType() {
		return this.propertiesType;
	}

	public void setPropertiesType(PropertiesType propertiesType) {
		this.propertiesType = propertiesType;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}
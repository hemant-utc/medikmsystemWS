package com.medikm.dto;

/**
 * MedikmUserRole entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class MedikmUserRole implements java.io.Serializable {

	// Fields

	private Integer id;
	private String loginname;
	private String rolename;

	// Constructors

	/** default constructor */
	public MedikmUserRole() {
	}

	/** full constructor */
	public MedikmUserRole(String loginname, String rolename) {
		this.loginname = loginname;
		this.rolename = rolename;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

}
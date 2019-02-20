package com.medikm.dto;

/**
 * Roles entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Roles implements java.io.Serializable {

	// Fields

	private Long roleId;
	private String roleCode;
	private String comment;

	// Constructors

	/** default constructor */
	public Roles() {
	}

	/** full constructor */
	public Roles(String roleCode, String comment) {
		this.roleCode = roleCode;
		this.comment = comment;
	}

	// Property accessors

	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
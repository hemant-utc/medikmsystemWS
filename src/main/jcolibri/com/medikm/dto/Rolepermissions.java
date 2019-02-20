package com.medikm.dto;

/**
 * Rolepermissions entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Rolepermissions implements java.io.Serializable {

	// Fields

	private Long rolePermissionId;
	private Long urlId;
	private String roleCode;

	// Constructors

	/** default constructor */
	public Rolepermissions() {
	}

	/** minimal constructor */
	public Rolepermissions(Long rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}

	/** full constructor */
	public Rolepermissions(Long rolePermissionId, Long urlId, String roleCode) {
		this.rolePermissionId = rolePermissionId;
		this.urlId = urlId;
		this.roleCode = roleCode;
	}

	// Property accessors

	public Long getRolePermissionId() {
		return this.rolePermissionId;
	}

	public void setRolePermissionId(Long rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}

	public Long getUrlId() {
		return this.urlId;
	}

	public void setUrlId(Long urlId) {
		this.urlId = urlId;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

}
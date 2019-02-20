package com.medikm.dto;

import java.sql.Timestamp;

/**
 * UserMachineInfo entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class UserMachineInfo implements java.io.Serializable {

	// Fields

	private UserMachineInfoId id;
	private Timestamp modificationTime;
	private Timestamp creationTime;

	// Constructors

	/** default constructor */
	public UserMachineInfo() {
	}

	/** minimal constructor */
	public UserMachineInfo(UserMachineInfoId id) {
		this.id = id;
	}

	/** full constructor */
	public UserMachineInfo(UserMachineInfoId id, Timestamp modificationTime, Timestamp creationTime) {
		this.id = id;
		this.modificationTime = modificationTime;
		this.creationTime = creationTime;
	}

	// Property accessors

	public UserMachineInfoId getId() {
		return this.id;
	}

	public void setId(UserMachineInfoId id) {
		this.id = id;
	}

	public Timestamp getModificationTime() {
		return this.modificationTime;
	}

	public void setModificationTime(Timestamp modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

}
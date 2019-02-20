package com.medikm.dto;

import java.sql.Timestamp;

/**
 * Userlog entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Userlog implements java.io.Serializable {

	// Fields

	private Long logid;
	private Physician physician;
	private String activityName;
	private String activityId;
	private Timestamp creationTime;
	private Timestamp modificationTime;
	private String ipAddress;

	// Constructors

	/** default constructor */
	public Userlog() {
	}

	/** minimal constructor */
	public Userlog(Timestamp creationTime, Timestamp modificationTime) {
		this.creationTime = creationTime;
		this.modificationTime = modificationTime;
	}

	/** full constructor */
	public Userlog(Physician physician, String activityName, String activityId, Timestamp creationTime,
			Timestamp modificationTime, String ipAddress) {
		this.physician = physician;
		this.activityName = activityName;
		this.activityId = activityId;
		this.creationTime = creationTime;
		this.modificationTime = modificationTime;
		this.ipAddress = ipAddress;
	}

	// Property accessors

	public Long getLogid() {
		return this.logid;
	}

	public void setLogid(Long logid) {
		this.logid = logid;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public Timestamp getModificationTime() {
		return this.modificationTime;
	}

	public void setModificationTime(Timestamp modificationTime) {
		this.modificationTime = modificationTime;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}
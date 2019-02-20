package com.medikm.dto;

import java.sql.Timestamp;

/**
 * ResourceTemp entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class ResourceTemp implements java.io.Serializable {

	// Fields

	private Integer resourseId;
	private Timestamp date;

	// Constructors

	/** default constructor */
	public ResourceTemp() {
	}

	/** full constructor */
	public ResourceTemp(Timestamp date) {
		this.date = date;
	}

	// Property accessors

	public Integer getResourseId() {
		return this.resourseId;
	}

	public void setResourseId(Integer resourseId) {
		this.resourseId = resourseId;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}
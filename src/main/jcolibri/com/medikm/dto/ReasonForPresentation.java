package com.medikm.dto;

/**
 * ReasonForPresentation entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class ReasonForPresentation implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String reason;

	// Constructors

	/** default constructor */
	public ReasonForPresentation() {
	}

	/** full constructor */
	public ReasonForPresentation(String reason) {
		this.reason = reason;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
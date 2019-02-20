package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * BreastCancerCenterType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class BreastCancerCenterType implements java.io.Serializable {

	// Fields

	private Integer centerTypeId;
	private String centerTypeDescription;
	private Set careFacilities = new HashSet(0);

	// Constructors

	/** default constructor */
	public BreastCancerCenterType() {
	}

	/** minimal constructor */
	public BreastCancerCenterType(Integer centerTypeId, String centerTypeDescription) {
		this.centerTypeId = centerTypeId;
		this.centerTypeDescription = centerTypeDescription;
	}

	/** full constructor */
	public BreastCancerCenterType(Integer centerTypeId, String centerTypeDescription, Set careFacilities) {
		this.centerTypeId = centerTypeId;
		this.centerTypeDescription = centerTypeDescription;
		this.careFacilities = careFacilities;
	}

	// Property accessors

	public Integer getCenterTypeId() {
		return this.centerTypeId;
	}

	public void setCenterTypeId(Integer centerTypeId) {
		this.centerTypeId = centerTypeId;
	}

	public String getCenterTypeDescription() {
		return this.centerTypeDescription;
	}

	public void setCenterTypeDescription(String centerTypeDescription) {
		this.centerTypeDescription = centerTypeDescription;
	}

	public Set getCareFacilities() {
		return this.careFacilities;
	}

	public void setCareFacilities(Set careFacilities) {
		this.careFacilities = careFacilities;
	}

}
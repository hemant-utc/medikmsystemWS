package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * FacilityType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class FacilityType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String fname;
	private Set careFacilities = new HashSet(0);

	// Constructors

	/** default constructor */
	public FacilityType() {
	}

	/** minimal constructor */
	public FacilityType(String fname) {
		this.fname = fname;
	}

	/** full constructor */
	public FacilityType(String fname, Set careFacilities) {
		this.fname = fname;
		this.careFacilities = careFacilities;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Set getCareFacilities() {
		return this.careFacilities;
	}

	public void setCareFacilities(Set careFacilities) {
		this.careFacilities = careFacilities;
	}

}
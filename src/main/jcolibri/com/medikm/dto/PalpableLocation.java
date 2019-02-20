package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * PalpableLocation entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class PalpableLocation implements java.io.Serializable {

	// Fields

	private Integer locationId;
	private String name;
	private Set physicalExams = new HashSet(0);

	// Constructors

	/** default constructor */
	public PalpableLocation() {
	}

	/** minimal constructor */
	public PalpableLocation(Integer locationId, String name) {
		this.locationId = locationId;
		this.name = name;
	}

	/** full constructor */
	public PalpableLocation(Integer locationId, String name, Set physicalExams) {
		this.locationId = locationId;
		this.name = name;
		this.physicalExams = physicalExams;
	}

	// Property accessors

	public Integer getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getPhysicalExams() {
		return this.physicalExams;
	}

	public void setPhysicalExams(Set physicalExams) {
		this.physicalExams = physicalExams;
	}

}
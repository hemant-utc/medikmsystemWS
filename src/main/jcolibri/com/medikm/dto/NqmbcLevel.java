package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * NqmbcLevel entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class NqmbcLevel implements java.io.Serializable {

	// Fields

	private Integer levelId;
	private String lname;
	private Set careFacilities = new HashSet(0);

	// Constructors

	/** default constructor */
	public NqmbcLevel() {
	}

	/** minimal constructor */
	public NqmbcLevel(String lname) {
		this.lname = lname;
	}

	/** full constructor */
	public NqmbcLevel(String lname, Set careFacilities) {
		this.lname = lname;
		this.careFacilities = careFacilities;
	}

	// Property accessors

	public Integer getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Set getCareFacilities() {
		return this.careFacilities;
	}

	public void setCareFacilities(Set careFacilities) {
		this.careFacilities = careFacilities;
	}

}
package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * LesionType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class LesionType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String lname;
	private Set biopsies = new HashSet(0);

	// Constructors

	/** default constructor */
	public LesionType() {
	}

	/** minimal constructor */
	public LesionType(Integer typeId, String lname) {
		this.typeId = typeId;
		this.lname = lname;
	}

	/** full constructor */
	public LesionType(Integer typeId, String lname, Set biopsies) {
		this.typeId = typeId;
		this.lname = lname;
		this.biopsies = biopsies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Set getBiopsies() {
		return this.biopsies;
	}

	public void setBiopsies(Set biopsies) {
		this.biopsies = biopsies;
	}

}
package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * RtModality entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class RtModality implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String mname;
	private Set radiationTherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public RtModality() {
	}

	/** minimal constructor */
	public RtModality(Integer typeId, String mname) {
		this.typeId = typeId;
		this.mname = mname;
	}

	/** full constructor */
	public RtModality(Integer typeId, String mname, Set radiationTherapies) {
		this.typeId = typeId;
		this.mname = mname;
		this.radiationTherapies = radiationTherapies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Set getRadiationTherapies() {
		return this.radiationTherapies;
	}

	public void setRadiationTherapies(Set radiationTherapies) {
		this.radiationTherapies = radiationTherapies;
	}

}
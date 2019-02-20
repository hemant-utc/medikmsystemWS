package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * RadiationType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class RadiationType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String rname;
	private Set radiationTherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public RadiationType() {
	}

	/** minimal constructor */
	public RadiationType(Integer typeId, String rname) {
		this.typeId = typeId;
		this.rname = rname;
	}

	/** full constructor */
	public RadiationType(Integer typeId, String rname, Set radiationTherapies) {
		this.typeId = typeId;
		this.rname = rname;
		this.radiationTherapies = radiationTherapies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Set getRadiationTherapies() {
		return this.radiationTherapies;
	}

	public void setRadiationTherapies(Set radiationTherapies) {
		this.radiationTherapies = radiationTherapies;
	}

}
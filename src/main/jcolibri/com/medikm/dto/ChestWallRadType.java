package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * ChestWallRadType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class ChestWallRadType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String cwName;
	private Set radiationTherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public ChestWallRadType() {
	}

	/** minimal constructor */
	public ChestWallRadType(Integer typeId, String cwName) {
		this.typeId = typeId;
		this.cwName = cwName;
	}

	/** full constructor */
	public ChestWallRadType(Integer typeId, String cwName, Set radiationTherapies) {
		this.typeId = typeId;
		this.cwName = cwName;
		this.radiationTherapies = radiationTherapies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getCwName() {
		return this.cwName;
	}

	public void setCwName(String cwName) {
		this.cwName = cwName;
	}

	public Set getRadiationTherapies() {
		return this.radiationTherapies;
	}

	public void setRadiationTherapies(Set radiationTherapies) {
		this.radiationTherapies = radiationTherapies;
	}

}
package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * EncounterType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class EncounterType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String ename;
	private Set encounters = new HashSet(0);

	// Constructors

	/** default constructor */
	public EncounterType() {
	}

	/** minimal constructor */
	public EncounterType(Integer typeId, String ename) {
		this.typeId = typeId;
		this.ename = ename;
	}

	/** full constructor */
	public EncounterType(Integer typeId, String ename, Set encounters) {
		this.typeId = typeId;
		this.ename = ename;
		this.encounters = encounters;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Set getEncounters() {
		return this.encounters;
	}

	public void setEncounters(Set encounters) {
		this.encounters = encounters;
	}

}
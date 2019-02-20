package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * ChemoType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class ChemoType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String chName;
	private Set chemotherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public ChemoType() {
	}

	/** minimal constructor */
	public ChemoType(Integer typeId, String chName) {
		this.typeId = typeId;
		this.chName = chName;
	}

	/** full constructor */
	public ChemoType(Integer typeId, String chName, Set chemotherapies) {
		this.typeId = typeId;
		this.chName = chName;
		this.chemotherapies = chemotherapies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getChName() {
		return this.chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public Set getChemotherapies() {
		return this.chemotherapies;
	}

	public void setChemotherapies(Set chemotherapies) {
		this.chemotherapies = chemotherapies;
	}

}
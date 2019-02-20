package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * TargetedType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class TargetedType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String ttname;
	private Set targetedTherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public TargetedType() {
	}

	/** minimal constructor */
	public TargetedType(Integer typeId, String ttname) {
		this.typeId = typeId;
		this.ttname = ttname;
	}

	/** full constructor */
	public TargetedType(Integer typeId, String ttname, Set targetedTherapies) {
		this.typeId = typeId;
		this.ttname = ttname;
		this.targetedTherapies = targetedTherapies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTtname() {
		return this.ttname;
	}

	public void setTtname(String ttname) {
		this.ttname = ttname;
	}

	public Set getTargetedTherapies() {
		return this.targetedTherapies;
	}

	public void setTargetedTherapies(Set targetedTherapies) {
		this.targetedTherapies = targetedTherapies;
	}

}
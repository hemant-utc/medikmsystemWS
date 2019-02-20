package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * TtAgent entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class TtAgent implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String aname;
	private Set targetedTherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public TtAgent() {
	}

	/** minimal constructor */
	public TtAgent(Integer typeId, String aname) {
		this.typeId = typeId;
		this.aname = aname;
	}

	/** full constructor */
	public TtAgent(Integer typeId, String aname, Set targetedTherapies) {
		this.typeId = typeId;
		this.aname = aname;
		this.targetedTherapies = targetedTherapies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Set getTargetedTherapies() {
		return this.targetedTherapies;
	}

	public void setTargetedTherapies(Set targetedTherapies) {
		this.targetedTherapies = targetedTherapies;
	}

}
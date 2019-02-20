package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * TrialType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class TrialType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String tname;
	private Set clinicalTrials = new HashSet(0);

	// Constructors

	/** default constructor */
	public TrialType() {
	}

	/** minimal constructor */
	public TrialType(Integer typeId, String tname) {
		this.typeId = typeId;
		this.tname = tname;
	}

	/** full constructor */
	public TrialType(Integer typeId, String tname, Set clinicalTrials) {
		this.typeId = typeId;
		this.tname = tname;
		this.clinicalTrials = clinicalTrials;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Set getClinicalTrials() {
		return this.clinicalTrials;
	}

	public void setClinicalTrials(Set clinicalTrials) {
		this.clinicalTrials = clinicalTrials;
	}

}
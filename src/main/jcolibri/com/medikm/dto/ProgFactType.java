package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * ProgFactType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class ProgFactType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String pfname;
	private Set prognosticFactors = new HashSet(0);

	// Constructors

	/** default constructor */
	public ProgFactType() {
	}

	/** minimal constructor */
	public ProgFactType(Integer typeId, String pfname) {
		this.typeId = typeId;
		this.pfname = pfname;
	}

	/** full constructor */
	public ProgFactType(Integer typeId, String pfname, Set prognosticFactors) {
		this.typeId = typeId;
		this.pfname = pfname;
		this.prognosticFactors = prognosticFactors;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getPfname() {
		return this.pfname;
	}

	public void setPfname(String pfname) {
		this.pfname = pfname;
	}

	public Set getPrognosticFactors() {
		return this.prognosticFactors;
	}

	public void setPrognosticFactors(Set prognosticFactors) {
		this.prognosticFactors = prognosticFactors;
	}

}
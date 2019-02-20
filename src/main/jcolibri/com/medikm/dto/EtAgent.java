package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * EtAgent entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class EtAgent implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String aname;
	private Set endocrineTherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public EtAgent() {
	}

	/** minimal constructor */
	public EtAgent(Integer typeId, String aname) {
		this.typeId = typeId;
		this.aname = aname;
	}

	/** full constructor */
	public EtAgent(Integer typeId, String aname, Set endocrineTherapies) {
		this.typeId = typeId;
		this.aname = aname;
		this.endocrineTherapies = endocrineTherapies;
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

	public Set getEndocrineTherapies() {
		return this.endocrineTherapies;
	}

	public void setEndocrineTherapies(Set endocrineTherapies) {
		this.endocrineTherapies = endocrineTherapies;
	}

}
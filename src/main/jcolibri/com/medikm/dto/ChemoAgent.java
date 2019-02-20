package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * ChemoAgent entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class ChemoAgent implements java.io.Serializable {

	// Fields

	private Integer agentId;
	private String aname;
	private Set chemotherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public ChemoAgent() {
	}

	/** minimal constructor */
	public ChemoAgent(String aname) {
		this.aname = aname;
	}

	/** full constructor */
	public ChemoAgent(String aname, Set chemotherapies) {
		this.aname = aname;
		this.chemotherapies = chemotherapies;
	}

	// Property accessors

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Set getChemotherapies() {
		return this.chemotherapies;
	}

	public void setChemotherapies(Set chemotherapies) {
		this.chemotherapies = chemotherapies;
	}

}
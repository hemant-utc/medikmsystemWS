package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * RrAgent entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class RrAgent implements java.io.Serializable {

	// Fields

	private Integer agentId;
	private String aname;
	private Set riskReductions = new HashSet(0);

	// Constructors

	/** default constructor */
	public RrAgent() {
	}

	/** minimal constructor */
	public RrAgent(Integer agentId, String aname) {
		this.agentId = agentId;
		this.aname = aname;
	}

	/** full constructor */
	public RrAgent(Integer agentId, String aname, Set riskReductions) {
		this.agentId = agentId;
		this.aname = aname;
		this.riskReductions = riskReductions;
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

	public Set getRiskReductions() {
		return this.riskReductions;
	}

	public void setRiskReductions(Set riskReductions) {
		this.riskReductions = riskReductions;
	}

}
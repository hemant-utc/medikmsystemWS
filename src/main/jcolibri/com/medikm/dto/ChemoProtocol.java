package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * ChemoProtocol entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class ChemoProtocol implements java.io.Serializable {

	// Fields

	private Integer protocolId;
	private String pname;
	private Set chemotherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public ChemoProtocol() {
	}

	/** minimal constructor */
	public ChemoProtocol(Integer protocolId, String pname) {
		this.protocolId = protocolId;
		this.pname = pname;
	}

	/** full constructor */
	public ChemoProtocol(Integer protocolId, String pname, Set chemotherapies) {
		this.protocolId = protocolId;
		this.pname = pname;
		this.chemotherapies = chemotherapies;
	}

	// Property accessors

	public Integer getProtocolId() {
		return this.protocolId;
	}

	public void setProtocolId(Integer protocolId) {
		this.protocolId = protocolId;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Set getChemotherapies() {
		return this.chemotherapies;
	}

	public void setChemotherapies(Set chemotherapies) {
		this.chemotherapies = chemotherapies;
	}

}
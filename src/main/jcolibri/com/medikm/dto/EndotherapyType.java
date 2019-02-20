package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * EndotherapyType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class EndotherapyType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String etname;
	private Set endocrineTherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public EndotherapyType() {
	}

	/** minimal constructor */
	public EndotherapyType(Integer typeId, String etname) {
		this.typeId = typeId;
		this.etname = etname;
	}

	/** full constructor */
	public EndotherapyType(Integer typeId, String etname, Set endocrineTherapies) {
		this.typeId = typeId;
		this.etname = etname;
		this.endocrineTherapies = endocrineTherapies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getEtname() {
		return this.etname;
	}

	public void setEtname(String etname) {
		this.etname = etname;
	}

	public Set getEndocrineTherapies() {
		return this.endocrineTherapies;
	}

	public void setEndocrineTherapies(Set endocrineTherapies) {
		this.endocrineTherapies = endocrineTherapies;
	}

}
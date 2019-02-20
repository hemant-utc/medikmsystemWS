package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * BiopsyType entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings({ "rawtypes", "serial" })
public class BiopsyType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String bname;
	private Set biopsies = new HashSet(0);

	// Constructors

	/** default constructor */
	public BiopsyType() {
	}

	/** minimal constructor */
	public BiopsyType(String bname) {
		this.bname = bname;
	}

	/** full constructor */
	public BiopsyType(String bname, Set biopsies) {
		this.bname = bname;
		this.biopsies = biopsies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getBname() {
		return this.bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Set getBiopsies() {
		return this.biopsies;
	}

	public void setBiopsies(Set biopsies) {
		this.biopsies = biopsies;
	}

}
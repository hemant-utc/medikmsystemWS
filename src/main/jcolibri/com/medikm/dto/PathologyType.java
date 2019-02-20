package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * PathologyType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class PathologyType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String pname;
	private Set pathologies = new HashSet(0);

	// Constructors

	/** default constructor */
	public PathologyType() {
	}

	/** minimal constructor */
	public PathologyType(Integer typeId, String pname) {
		this.typeId = typeId;
		this.pname = pname;
	}

	/** full constructor */
	public PathologyType(Integer typeId, String pname, Set pathologies) {
		this.typeId = typeId;
		this.pname = pname;
		this.pathologies = pathologies;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Set getPathologies() {
		return this.pathologies;
	}

	public void setPathologies(Set pathologies) {
		this.pathologies = pathologies;
	}

}
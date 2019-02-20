package com.medikm.dto;

/**
 * DiseaseStatus entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class DiseaseStatus implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String dname;

	// Constructors

	/** default constructor */
	public DiseaseStatus() {
	}

	/** full constructor */
	public DiseaseStatus(Integer typeId, String dname) {
		this.typeId = typeId;
		this.dname = dname;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}
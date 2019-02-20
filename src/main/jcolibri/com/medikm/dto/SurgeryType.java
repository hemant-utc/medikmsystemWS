package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * SurgeryType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class SurgeryType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private DiseaseSubType diseaseSubType;
	private String sname;
	private Set surgeries = new HashSet(0);

	// Constructors

	/** default constructor */
	public SurgeryType() {
	}

	/** minimal constructor */
	public SurgeryType(DiseaseSubType diseaseSubType, String sname) {
		this.diseaseSubType = diseaseSubType;
		this.sname = sname;
	}

	/** full constructor */
	public SurgeryType(DiseaseSubType diseaseSubType, String sname, Set surgeries) {
		this.diseaseSubType = diseaseSubType;
		this.sname = sname;
		this.surgeries = surgeries;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public DiseaseSubType getDiseaseSubType() {
		return this.diseaseSubType;
	}

	public void setDiseaseSubType(DiseaseSubType diseaseSubType) {
		this.diseaseSubType = diseaseSubType;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set getSurgeries() {
		return this.surgeries;
	}

	public void setSurgeries(Set surgeries) {
		this.surgeries = surgeries;
	}

}
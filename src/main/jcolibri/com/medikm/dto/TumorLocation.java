package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * TumorLocation entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class TumorLocation implements java.io.Serializable {

	// Fields

	private Integer tumorLocationId;
	private DiseaseSubType diseaseSubType;
	private DiseaseType diseaseType;
	private String tumorLocationName;
	private Set case1s = new HashSet(0);

	// Constructors

	/** default constructor */
	public TumorLocation() {
	}

	/** full constructor */
	public TumorLocation(DiseaseSubType diseaseSubType, DiseaseType diseaseType, String tumorLocationName, Set case1s) {
		this.diseaseSubType = diseaseSubType;
		this.diseaseType = diseaseType;
		this.tumorLocationName = tumorLocationName;
		this.case1s = case1s;
	}

	// Property accessors

	public Integer getTumorLocationId() {
		return this.tumorLocationId;
	}

	public void setTumorLocationId(Integer tumorLocationId) {
		this.tumorLocationId = tumorLocationId;
	}

	public DiseaseSubType getDiseaseSubType() {
		return this.diseaseSubType;
	}

	public void setDiseaseSubType(DiseaseSubType diseaseSubType) {
		this.diseaseSubType = diseaseSubType;
	}

	public DiseaseType getDiseaseType() {
		return this.diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	public String getTumorLocationName() {
		return this.tumorLocationName;
	}

	public void setTumorLocationName(String tumorLocationName) {
		this.tumorLocationName = tumorLocationName;
	}

	public Set getCase1s() {
		return this.case1s;
	}

	public void setCase1s(Set case1s) {
		this.case1s = case1s;
	}

}
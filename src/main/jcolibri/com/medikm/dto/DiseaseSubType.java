package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * DiseaseSubType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class DiseaseSubType implements java.io.Serializable {

	// Fields

	private Integer diseaseSubTypeId;
	private DiseaseType diseaseType;
	private String diseaseSubName;
	private Timestamp creationTime;
	private Timestamp modifcationTime;
	private Set case1s = new HashSet(0);
	private Set surgeryTypes = new HashSet(0);
	private Set symptomses = new HashSet(0);
	private Set tumorLocations = new HashSet(0);
	private Set cancerTypes = new HashSet(0);

	// Constructors

	/** default constructor */
	public DiseaseSubType() {
	}

	/** full constructor */
	public DiseaseSubType(DiseaseType diseaseType, String diseaseSubName, Timestamp creationTime,
			Timestamp modifcationTime, Set case1s, Set surgeryTypes, Set symptomses, Set tumorLocations,
			Set cancerTypes) {
		this.diseaseType = diseaseType;
		this.diseaseSubName = diseaseSubName;
		this.creationTime = creationTime;
		this.modifcationTime = modifcationTime;
		this.case1s = case1s;
		this.surgeryTypes = surgeryTypes;
		this.symptomses = symptomses;
		this.tumorLocations = tumorLocations;
		this.cancerTypes = cancerTypes;
	}

	// Property accessors

	public Integer getDiseaseSubTypeId() {
		return this.diseaseSubTypeId;
	}

	public void setDiseaseSubTypeId(Integer diseaseSubTypeId) {
		this.diseaseSubTypeId = diseaseSubTypeId;
	}

	public DiseaseType getDiseaseType() {
		return this.diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	public String getDiseaseSubName() {
		return this.diseaseSubName;
	}

	public void setDiseaseSubName(String diseaseSubName) {
		this.diseaseSubName = diseaseSubName;
	}

	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public Timestamp getModifcationTime() {
		return this.modifcationTime;
	}

	public void setModifcationTime(Timestamp modifcationTime) {
		this.modifcationTime = modifcationTime;
	}

	public Set getCase1s() {
		return this.case1s;
	}

	public void setCase1s(Set case1s) {
		this.case1s = case1s;
	}

	public Set getSurgeryTypes() {
		return this.surgeryTypes;
	}

	public void setSurgeryTypes(Set surgeryTypes) {
		this.surgeryTypes = surgeryTypes;
	}

	public Set getSymptomses() {
		return this.symptomses;
	}

	public void setSymptomses(Set symptomses) {
		this.symptomses = symptomses;
	}

	public Set getTumorLocations() {
		return this.tumorLocations;
	}

	public void setTumorLocations(Set tumorLocations) {
		this.tumorLocations = tumorLocations;
	}

	public Set getCancerTypes() {
		return this.cancerTypes;
	}

	public void setCancerTypes(Set cancerTypes) {
		this.cancerTypes = cancerTypes;
	}

}
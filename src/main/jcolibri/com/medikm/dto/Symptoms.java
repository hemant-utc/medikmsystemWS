package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Symptoms entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Symptoms implements java.io.Serializable {

	// Fields

	private Integer symptomsId;
	private DiseaseSubType diseaseSubType;
	private DiseaseType diseaseType;
	private String symptomsName;
	private Set diseaseSymptomses = new HashSet(0);
	private Set personalMedicalHistories = new HashSet(0);

	// Constructors

	/** default constructor */
	public Symptoms() {
	}

	/** full constructor */
	public Symptoms(DiseaseSubType diseaseSubType, DiseaseType diseaseType, String symptomsName, Set diseaseSymptomses,
			Set personalMedicalHistories) {
		this.diseaseSubType = diseaseSubType;
		this.diseaseType = diseaseType;
		this.symptomsName = symptomsName;
		this.diseaseSymptomses = diseaseSymptomses;
		this.personalMedicalHistories = personalMedicalHistories;
	}

	// Property accessors

	public Integer getSymptomsId() {
		return this.symptomsId;
	}

	public void setSymptomsId(Integer symptomsId) {
		this.symptomsId = symptomsId;
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

	public String getSymptomsName() {
		return this.symptomsName;
	}

	public void setSymptomsName(String symptomsName) {
		this.symptomsName = symptomsName;
	}

	public Set getDiseaseSymptomses() {
		return this.diseaseSymptomses;
	}

	public void setDiseaseSymptomses(Set diseaseSymptomses) {
		this.diseaseSymptomses = diseaseSymptomses;
	}

	public Set getPersonalMedicalHistories() {
		return this.personalMedicalHistories;
	}

	public void setPersonalMedicalHistories(Set personalMedicalHistories) {
		this.personalMedicalHistories = personalMedicalHistories;
	}

}
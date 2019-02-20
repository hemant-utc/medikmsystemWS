package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * CancerType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class CancerType implements java.io.Serializable {

	// Fields

	private Integer canTypeId;
	private DiseaseSubType diseaseSubType;
	private DiseaseType diseaseType;
	private String cname;
	private String comments;
	private Set case1s = new HashSet(0);
	private Set relativeDetailses = new HashSet(0);
	private Set pathologies = new HashSet(0);
	private Set cancerSubTypes = new HashSet(0);
	private Set physicians = new HashSet(0);
	private Set personalMedicalHistories = new HashSet(0);

	// Constructors

	/** default constructor */
	public CancerType() {
	}

	/** minimal constructor */
	public CancerType(DiseaseSubType diseaseSubType, String cname) {
		this.diseaseSubType = diseaseSubType;
		this.cname = cname;
	}

	/** full constructor */
	public CancerType(DiseaseSubType diseaseSubType, DiseaseType diseaseType, String cname, String comments, Set case1s,
			Set relativeDetailses, Set pathologies, Set cancerSubTypes, Set physicians, Set personalMedicalHistories) {
		this.diseaseSubType = diseaseSubType;
		this.diseaseType = diseaseType;
		this.cname = cname;
		this.comments = comments;
		this.case1s = case1s;
		this.relativeDetailses = relativeDetailses;
		this.pathologies = pathologies;
		this.cancerSubTypes = cancerSubTypes;
		this.physicians = physicians;
		this.personalMedicalHistories = personalMedicalHistories;
	}

	// Property accessors

	public Integer getCanTypeId() {
		return this.canTypeId;
	}

	public void setCanTypeId(Integer canTypeId) {
		this.canTypeId = canTypeId;
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

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Set getCase1s() {
		return this.case1s;
	}

	public void setCase1s(Set case1s) {
		this.case1s = case1s;
	}

	public Set getRelativeDetailses() {
		return this.relativeDetailses;
	}

	public void setRelativeDetailses(Set relativeDetailses) {
		this.relativeDetailses = relativeDetailses;
	}

	public Set getPathologies() {
		return this.pathologies;
	}

	public void setPathologies(Set pathologies) {
		this.pathologies = pathologies;
	}

	public Set getCancerSubTypes() {
		return this.cancerSubTypes;
	}

	public void setCancerSubTypes(Set cancerSubTypes) {
		this.cancerSubTypes = cancerSubTypes;
	}

	public Set getPhysicians() {
		return this.physicians;
	}

	public void setPhysicians(Set physicians) {
		this.physicians = physicians;
	}

	public Set getPersonalMedicalHistories() {
		return this.personalMedicalHistories;
	}

	public void setPersonalMedicalHistories(Set personalMedicalHistories) {
		this.personalMedicalHistories = personalMedicalHistories;
	}

}
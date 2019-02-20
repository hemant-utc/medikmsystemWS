package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * CancerSubType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class CancerSubType implements java.io.Serializable {

	// Fields

	private Integer canSubTypeId;
	private CancerType cancerType;
	private String name;
	private Set personalMedicalHistories = new HashSet(0);
	private Set relativeDetailses = new HashSet(0);
	private Set pathologies = new HashSet(0);
	private Set case1s = new HashSet(0);

	// Constructors

	/** default constructor */
	public CancerSubType() {
	}

	/** minimal constructor */
	public CancerSubType(CancerType cancerType, String name) {
		this.cancerType = cancerType;
		this.name = name;
	}

	/** full constructor */
	public CancerSubType(CancerType cancerType, String name, Set personalMedicalHistories, Set relativeDetailses,
			Set pathologies, Set case1s) {
		this.cancerType = cancerType;
		this.name = name;
		this.personalMedicalHistories = personalMedicalHistories;
		this.relativeDetailses = relativeDetailses;
		this.pathologies = pathologies;
		this.case1s = case1s;
	}

	// Property accessors

	public Integer getCanSubTypeId() {
		return this.canSubTypeId;
	}

	public void setCanSubTypeId(Integer canSubTypeId) {
		this.canSubTypeId = canSubTypeId;
	}

	public CancerType getCancerType() {
		return this.cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getPersonalMedicalHistories() {
		return this.personalMedicalHistories;
	}

	public void setPersonalMedicalHistories(Set personalMedicalHistories) {
		this.personalMedicalHistories = personalMedicalHistories;
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

	public Set getCase1s() {
		return this.case1s;
	}

	public void setCase1s(Set case1s) {
		this.case1s = case1s;
	}

}
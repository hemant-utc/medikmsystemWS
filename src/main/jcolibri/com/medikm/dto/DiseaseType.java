package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * DiseaseType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class DiseaseType implements java.io.Serializable {

	// Fields

	private Integer diseaseTypeId;
	private String diseaseName;
	private Set testResultResources = new HashSet(0);
	private Set tumorLocations = new HashSet(0);
	private Set medikmResourceses = new HashSet(0);
	private Set case1s = new HashSet(0);
	private Set workupKindTypes = new HashSet(0);
	private Set users = new HashSet(0);
	private Set physicians = new HashSet(0);
	private Set serviceProviders = new HashSet(0);
	private Set cancerTypes = new HashSet(0);
	private Set symptomses = new HashSet(0);
	private Set diseaseSubTypes = new HashSet(0);

	// Constructors

	/** default constructor */
	public DiseaseType() {
	}

	/** minimal constructor */
	public DiseaseType(Integer diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	/** full constructor */
	public DiseaseType(Integer diseaseTypeId, String diseaseName, Set testResultResources, Set tumorLocations,
			Set medikmResourceses, Set case1s, Set workupKindTypes, Set users, Set physicians, Set serviceProviders,
			Set cancerTypes, Set symptomses, Set diseaseSubTypes) {
		this.diseaseTypeId = diseaseTypeId;
		this.diseaseName = diseaseName;
		this.testResultResources = testResultResources;
		this.tumorLocations = tumorLocations;
		this.medikmResourceses = medikmResourceses;
		this.case1s = case1s;
		this.workupKindTypes = workupKindTypes;
		this.users = users;
		this.physicians = physicians;
		this.serviceProviders = serviceProviders;
		this.cancerTypes = cancerTypes;
		this.symptomses = symptomses;
		this.diseaseSubTypes = diseaseSubTypes;
	}

	// Property accessors

	public Integer getDiseaseTypeId() {
		return this.diseaseTypeId;
	}

	public void setDiseaseTypeId(Integer diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	public String getDiseaseName() {
		return this.diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public Set getTestResultResources() {
		return this.testResultResources;
	}

	public void setTestResultResources(Set testResultResources) {
		this.testResultResources = testResultResources;
	}

	public Set getTumorLocations() {
		return this.tumorLocations;
	}

	public void setTumorLocations(Set tumorLocations) {
		this.tumorLocations = tumorLocations;
	}

	public Set getMedikmResourceses() {
		return this.medikmResourceses;
	}

	public void setMedikmResourceses(Set medikmResourceses) {
		this.medikmResourceses = medikmResourceses;
	}

	public Set getCase1s() {
		return this.case1s;
	}

	public void setCase1s(Set case1s) {
		this.case1s = case1s;
	}

	public Set getWorkupKindTypes() {
		return this.workupKindTypes;
	}

	public void setWorkupKindTypes(Set workupKindTypes) {
		this.workupKindTypes = workupKindTypes;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getPhysicians() {
		return this.physicians;
	}

	public void setPhysicians(Set physicians) {
		this.physicians = physicians;
	}

	public Set getServiceProviders() {
		return this.serviceProviders;
	}

	public void setServiceProviders(Set serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

	public Set getCancerTypes() {
		return this.cancerTypes;
	}

	public void setCancerTypes(Set cancerTypes) {
		this.cancerTypes = cancerTypes;
	}

	public Set getSymptomses() {
		return this.symptomses;
	}

	public void setSymptomses(Set symptomses) {
		this.symptomses = symptomses;
	}

	public Set getDiseaseSubTypes() {
		return this.diseaseSubTypes;
	}

	public void setDiseaseSubTypes(Set diseaseSubTypes) {
		this.diseaseSubTypes = diseaseSubTypes;
	}

}
package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * ServiceProvider entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class ServiceProvider implements java.io.Serializable {

	// Fields

	private Integer serviceProviderId;
	private DiseaseType diseaseType;
	private CareFacility careFacility;
	private ServiceProviderSpeciality serviceProviderSpeciality;
	private String fname;
	private String minit;
	private String lname;
	private Set encounterServiceProviders = new HashSet(0);

	// Constructors

	/** default constructor */
	public ServiceProvider() {
	}

	/** minimal constructor */
	public ServiceProvider(Integer serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	/** full constructor */
	public ServiceProvider(Integer serviceProviderId, DiseaseType diseaseType, CareFacility careFacility,
			ServiceProviderSpeciality serviceProviderSpeciality, String fname, String minit, String lname,
			Set encounterServiceProviders) {
		this.serviceProviderId = serviceProviderId;
		this.diseaseType = diseaseType;
		this.careFacility = careFacility;
		this.serviceProviderSpeciality = serviceProviderSpeciality;
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.encounterServiceProviders = encounterServiceProviders;
	}

	// Property accessors

	public Integer getServiceProviderId() {
		return this.serviceProviderId;
	}

	public void setServiceProviderId(Integer serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	public DiseaseType getDiseaseType() {
		return this.diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	public CareFacility getCareFacility() {
		return this.careFacility;
	}

	public void setCareFacility(CareFacility careFacility) {
		this.careFacility = careFacility;
	}

	public ServiceProviderSpeciality getServiceProviderSpeciality() {
		return this.serviceProviderSpeciality;
	}

	public void setServiceProviderSpeciality(ServiceProviderSpeciality serviceProviderSpeciality) {
		this.serviceProviderSpeciality = serviceProviderSpeciality;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMinit() {
		return this.minit;
	}

	public void setMinit(String minit) {
		this.minit = minit;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Set getEncounterServiceProviders() {
		return this.encounterServiceProviders;
	}

	public void setEncounterServiceProviders(Set encounterServiceProviders) {
		this.encounterServiceProviders = encounterServiceProviders;
	}

}
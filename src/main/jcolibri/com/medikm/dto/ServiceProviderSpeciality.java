package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * ServiceProviderSpeciality entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class ServiceProviderSpeciality implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String name;
	private Set serviceProviders = new HashSet(0);

	// Constructors

	/** default constructor */
	public ServiceProviderSpeciality() {
	}

	/** minimal constructor */
	public ServiceProviderSpeciality(Integer typeId, String name) {
		this.typeId = typeId;
		this.name = name;
	}

	/** full constructor */
	public ServiceProviderSpeciality(Integer typeId, String name, Set serviceProviders) {
		this.typeId = typeId;
		this.name = name;
		this.serviceProviders = serviceProviders;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getServiceProviders() {
		return this.serviceProviders;
	}

	public void setServiceProviders(Set serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

}
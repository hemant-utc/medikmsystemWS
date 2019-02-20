package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * CareFacility entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class CareFacility implements java.io.Serializable {

	// Fields

	private Integer facilityId;
	private NqmbcLevel nqmbcLevel;
	private FacilityType facilityType;
	private BreastCancerCenterType breastCancerCenterType;
	private String facilityName;
	private String facilityAddress;
	private String facilityCity;
	private String facilityState;
	private String facilityZip;
	private Set case1s = new HashSet(0);
	private Set physicians = new HashSet(0);
	private Set serviceProviders = new HashSet(0);

	// Constructors

	/** default constructor */
	public CareFacility() {
	}

	/** minimal constructor */
	public CareFacility(NqmbcLevel nqmbcLevel, FacilityType facilityType,
			BreastCancerCenterType breastCancerCenterType) {
		this.nqmbcLevel = nqmbcLevel;
		this.facilityType = facilityType;
		this.breastCancerCenterType = breastCancerCenterType;
	}

	/** full constructor */
	public CareFacility(NqmbcLevel nqmbcLevel, FacilityType facilityType, BreastCancerCenterType breastCancerCenterType,
			String facilityName, String facilityAddress, String facilityCity, String facilityState, String facilityZip,
			Set case1s, Set physicians, Set serviceProviders) {
		this.nqmbcLevel = nqmbcLevel;
		this.facilityType = facilityType;
		this.breastCancerCenterType = breastCancerCenterType;
		this.facilityName = facilityName;
		this.facilityAddress = facilityAddress;
		this.facilityCity = facilityCity;
		this.facilityState = facilityState;
		this.facilityZip = facilityZip;
		this.case1s = case1s;
		this.physicians = physicians;
		this.serviceProviders = serviceProviders;
	}

	// Property accessors

	public Integer getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public NqmbcLevel getNqmbcLevel() {
		return this.nqmbcLevel;
	}

	public void setNqmbcLevel(NqmbcLevel nqmbcLevel) {
		this.nqmbcLevel = nqmbcLevel;
	}

	public FacilityType getFacilityType() {
		return this.facilityType;
	}

	public void setFacilityType(FacilityType facilityType) {
		this.facilityType = facilityType;
	}

	public BreastCancerCenterType getBreastCancerCenterType() {
		return this.breastCancerCenterType;
	}

	public void setBreastCancerCenterType(BreastCancerCenterType breastCancerCenterType) {
		this.breastCancerCenterType = breastCancerCenterType;
	}

	public String getFacilityName() {
		return this.facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getFacilityAddress() {
		return this.facilityAddress;
	}

	public void setFacilityAddress(String facilityAddress) {
		this.facilityAddress = facilityAddress;
	}

	public String getFacilityCity() {
		return this.facilityCity;
	}

	public void setFacilityCity(String facilityCity) {
		this.facilityCity = facilityCity;
	}

	public String getFacilityState() {
		return this.facilityState;
	}

	public void setFacilityState(String facilityState) {
		this.facilityState = facilityState;
	}

	public String getFacilityZip() {
		return this.facilityZip;
	}

	public void setFacilityZip(String facilityZip) {
		this.facilityZip = facilityZip;
	}

	public Set getCase1s() {
		return this.case1s;
	}

	public void setCase1s(Set case1s) {
		this.case1s = case1s;
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

}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "care_facility")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CareFacility.findAll", query = "SELECT c FROM CareFacility c") })
public class CareFacility implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Facility_Id")
	private Integer facilityId;
	@Column(name = "Facility_Name")
	private String facilityName;
	@Column(name = "Facility_Address")
	private String facilityAddress;
	@Column(name = "Facility_City")
	private String facilityCity;
	@Column(name = "Facility_State")
	private String facilityState;
	@Column(name = "Facility_Zip")
	private String facilityZip;
	@OneToMany(mappedBy = "facilityId")
	private Collection<Physician> physicianCollection;
	@JoinColumn(name = "Center_Type_Id", referencedColumnName = "Center_type_Id")
	@ManyToOne(optional = false)
	private BreastCancerCenterType centerTypeId;
	@JoinColumn(name = "NQMBC_Certiification_Level_Id", referencedColumnName = "Level_Id")
	@ManyToOne(optional = false)
	private NqmbcLevel nQMBCCertiificationLevelId;
	@JoinColumn(name = "Facility_Type_Type", referencedColumnName = "Type_Id")
	@ManyToOne(optional = false)
	private FacilityType facilityTypeType;
	@OneToMany(mappedBy = "facilityId")
	private Collection<ServiceProvider> serviceProviderCollection;
	@OneToMany(mappedBy = "careFacility")
	private Collection<Case1> caseCollection;

	public CareFacility() {
	}

	public CareFacility(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public Integer getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getFacilityAddress() {
		return facilityAddress;
	}

	public void setFacilityAddress(String facilityAddress) {
		this.facilityAddress = facilityAddress;
	}

	public String getFacilityCity() {
		return facilityCity;
	}

	public void setFacilityCity(String facilityCity) {
		this.facilityCity = facilityCity;
	}

	public String getFacilityState() {
		return facilityState;
	}

	public void setFacilityState(String facilityState) {
		this.facilityState = facilityState;
	}

	public String getFacilityZip() {
		return facilityZip;
	}

	public void setFacilityZip(String facilityZip) {
		this.facilityZip = facilityZip;
	}

	@XmlTransient
	public Collection<Physician> getPhysicianCollection() {
		return physicianCollection;
	}

	public void setPhysicianCollection(Collection<Physician> physicianCollection) {
		this.physicianCollection = physicianCollection;
	}

	public BreastCancerCenterType getCenterTypeId() {
		return centerTypeId;
	}

	public void setCenterTypeId(BreastCancerCenterType centerTypeId) {
		this.centerTypeId = centerTypeId;
	}

	public NqmbcLevel getNQMBCCertiificationLevelId() {
		return nQMBCCertiificationLevelId;
	}

	public void setNQMBCCertiificationLevelId(NqmbcLevel nQMBCCertiificationLevelId) {
		this.nQMBCCertiificationLevelId = nQMBCCertiificationLevelId;
	}

	public FacilityType getFacilityTypeType() {
		return facilityTypeType;
	}

	public void setFacilityTypeType(FacilityType facilityTypeType) {
		this.facilityTypeType = facilityTypeType;
	}

	@XmlTransient
	public Collection<ServiceProvider> getServiceProviderCollection() {
		return serviceProviderCollection;
	}

	public void setServiceProviderCollection(Collection<ServiceProvider> serviceProviderCollection) {
		this.serviceProviderCollection = serviceProviderCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (facilityId != null ? facilityId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CareFacility)) {
			return false;
		}
		CareFacility other = (CareFacility) object;
		if ((this.facilityId == null && other.facilityId != null)
				|| (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CareFacility[ facilityId=" + facilityId + " ]";
	}

}

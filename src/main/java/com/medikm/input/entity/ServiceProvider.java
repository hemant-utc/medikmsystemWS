/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "service_provider")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ServiceProvider.findAll", query = "SELECT s FROM ServiceProvider s") })
public class ServiceProvider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Service_provider_Id")
	private Integer serviceproviderId;
	@Column(name = "FNAME")
	private String fname;
	@Column(name = "MINIT")
	private String minit;
	@Column(name = "LNAME")
	private String lname;
	@JoinColumn(name = "Facility_Id", referencedColumnName = "Facility_Id")
	@ManyToOne
	private CareFacility facilityId;
	@JoinColumn(name = "Specialty", referencedColumnName = "Type_Id")
	@ManyToOne
	private ServiceProviderSpeciality specialty;
	@JoinColumn(name = "Disease_Type_Id", referencedColumnName = "Disease_Type_Id")
	@ManyToOne
	private DiseaseType diseaseTypeId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceProvider")
	private Collection<EncounterServiceProvider> encounterServiceProviderCollection;

	public ServiceProvider() {
	}

	public ServiceProvider(Integer serviceproviderId) {
		this.serviceproviderId = serviceproviderId;
	}

	public Integer getServiceproviderId() {
		return serviceproviderId;
	}

	public void setServiceproviderId(Integer serviceproviderId) {
		this.serviceproviderId = serviceproviderId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMinit() {
		return minit;
	}

	public void setMinit(String minit) {
		this.minit = minit;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public CareFacility getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(CareFacility facilityId) {
		this.facilityId = facilityId;
	}

	public ServiceProviderSpeciality getSpecialty() {
		return specialty;
	}

	public void setSpecialty(ServiceProviderSpeciality specialty) {
		this.specialty = specialty;
	}

	public DiseaseType getDiseaseTypeId() {
		return diseaseTypeId;
	}

	public void setDiseaseTypeId(DiseaseType diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	@XmlTransient
	public Collection<EncounterServiceProvider> getEncounterServiceProviderCollection() {
		return encounterServiceProviderCollection;
	}

	public void setEncounterServiceProviderCollection(
			Collection<EncounterServiceProvider> encounterServiceProviderCollection) {
		this.encounterServiceProviderCollection = encounterServiceProviderCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (serviceproviderId != null ? serviceproviderId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ServiceProvider)) {
			return false;
		}
		ServiceProvider other = (ServiceProvider) object;
		if ((this.serviceproviderId == null && other.serviceproviderId != null)
				|| (this.serviceproviderId != null && !this.serviceproviderId.equals(other.serviceproviderId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ServiceProvider[ serviceproviderId=" + serviceproviderId + " ]";
	}

}

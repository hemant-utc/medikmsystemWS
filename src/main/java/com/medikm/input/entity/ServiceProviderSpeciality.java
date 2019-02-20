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
import javax.persistence.Id;
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
@Table(name = "service_provider_speciality")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "ServiceProviderSpeciality.findAll", query = "SELECT s FROM ServiceProviderSpeciality s") })
public class ServiceProviderSpeciality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "Name")
	private String name;
	@OneToMany(mappedBy = "specialty")
	private Collection<ServiceProvider> serviceProviderCollection;

	public ServiceProviderSpeciality() {
	}

	public ServiceProviderSpeciality(Integer typeId) {
		this.typeId = typeId;
	}

	public ServiceProviderSpeciality(Integer typeId, String name) {
		this.typeId = typeId;
		this.name = name;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ServiceProviderSpeciality)) {
			return false;
		}
		ServiceProviderSpeciality other = (ServiceProviderSpeciality) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ServiceProviderSpeciality[ typeId=" + typeId + " ]";
	}

}

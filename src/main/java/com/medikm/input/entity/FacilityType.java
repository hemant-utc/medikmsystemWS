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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "facility_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "FacilityType.findAll", query = "SELECT f FROM FacilityType f") })
public class FacilityType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "FName")
	private String fName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityTypeType")
	private Collection<CareFacility> careFacilityCollection;

	public FacilityType() {
	}

	public FacilityType(Integer typeId) {
		this.typeId = typeId;
	}

	public FacilityType(Integer typeId, String fName) {
		this.typeId = typeId;
		this.fName = fName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getFName() {
		return fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	@XmlTransient
	public Collection<CareFacility> getCareFacilityCollection() {
		return careFacilityCollection;
	}

	public void setCareFacilityCollection(Collection<CareFacility> careFacilityCollection) {
		this.careFacilityCollection = careFacilityCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof FacilityType)) {
			return false;
		}
		FacilityType other = (FacilityType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.FacilityType[ typeId=" + typeId + " ]";
	}

}

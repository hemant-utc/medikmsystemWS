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
@Table(name = "breast_cancer_center_type")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "BreastCancerCenterType.findAll", query = "SELECT b FROM BreastCancerCenterType b") })
public class BreastCancerCenterType implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "Center_type_Id")
	private Integer centertypeId;
	@Basic(optional = false)
	@Column(name = "Center_Type_Description")
	private String centerTypeDescription;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "centerTypeId")
	private Collection<CareFacility> careFacilityCollection;

	public BreastCancerCenterType() {
	}

	public BreastCancerCenterType(Integer centertypeId) {
		this.centertypeId = centertypeId;
	}

	public BreastCancerCenterType(Integer centertypeId, String centerTypeDescription) {
		this.centertypeId = centertypeId;
		this.centerTypeDescription = centerTypeDescription;
	}

	public Integer getCentertypeId() {
		return centertypeId;
	}

	public void setCentertypeId(Integer centertypeId) {
		this.centertypeId = centertypeId;
	}

	public String getCenterTypeDescription() {
		return centerTypeDescription;
	}

	public void setCenterTypeDescription(String centerTypeDescription) {
		this.centerTypeDescription = centerTypeDescription;
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
		hash += (centertypeId != null ? centertypeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof BreastCancerCenterType)) {
			return false;
		}
		BreastCancerCenterType other = (BreastCancerCenterType) object;
		if ((this.centertypeId == null && other.centertypeId != null)
				|| (this.centertypeId != null && !this.centertypeId.equals(other.centertypeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.BreastCancerCenterType[ centertypeId=" + centertypeId + " ]";
	}

}

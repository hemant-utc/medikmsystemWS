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
@Table(name = "radiation_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "RadiationType.findAll", query = "SELECT r FROM RadiationType r") })
public class RadiationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "RName")
	private String rName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "radiationType")
	private Collection<RadiationTherapy> radiationTherapyCollection;

	public RadiationType() {
	}

	public RadiationType(Integer typeId) {
		this.typeId = typeId;
	}

	public RadiationType(Integer typeId, String rName) {
		this.typeId = typeId;
		this.rName = rName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getRName() {
		return rName;
	}

	public void setRName(String rName) {
		this.rName = rName;
	}

	@XmlTransient
	public Collection<RadiationTherapy> getRadiationTherapyCollection() {
		return radiationTherapyCollection;
	}

	public void setRadiationTherapyCollection(Collection<RadiationTherapy> radiationTherapyCollection) {
		this.radiationTherapyCollection = radiationTherapyCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RadiationType)) {
			return false;
		}
		RadiationType other = (RadiationType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.RadiationType[ typeId=" + typeId + " ]";
	}

}

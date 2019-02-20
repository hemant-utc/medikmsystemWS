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
@Table(name = "rt_modality")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "RtModality.findAll", query = "SELECT r FROM RtModality r") })
public class RtModality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "MName")
	private String mName;
	@OneToMany(mappedBy = "rTModalityID")
	private Collection<RadiationTherapy> radiationTherapyCollection;

	public RtModality() {
	}

	public RtModality(Integer typeId) {
		this.typeId = typeId;
	}

	public RtModality(Integer typeId, String mName) {
		this.typeId = typeId;
		this.mName = mName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getMName() {
		return mName;
	}

	public void setMName(String mName) {
		this.mName = mName;
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
		if (!(object instanceof RtModality)) {
			return false;
		}
		RtModality other = (RtModality) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.RtModality[ typeId=" + typeId + " ]";
	}

}

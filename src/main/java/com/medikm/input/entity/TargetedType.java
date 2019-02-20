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
@Table(name = "targeted_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TargetedType.findAll", query = "SELECT t FROM TargetedType t") })
public class TargetedType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "TTName")
	private String tTName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "targetedType")
	private Collection<TargetedTherapy> targetedTherapyCollection;

	public TargetedType() {
	}

	public TargetedType(Integer typeId) {
		this.typeId = typeId;
	}

	public TargetedType(Integer typeId, String tTName) {
		this.typeId = typeId;
		this.tTName = tTName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTTName() {
		return tTName;
	}

	public void setTTName(String tTName) {
		this.tTName = tTName;
	}

	@XmlTransient
	public Collection<TargetedTherapy> getTargetedTherapyCollection() {
		return targetedTherapyCollection;
	}

	public void setTargetedTherapyCollection(Collection<TargetedTherapy> targetedTherapyCollection) {
		this.targetedTherapyCollection = targetedTherapyCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TargetedType)) {
			return false;
		}
		TargetedType other = (TargetedType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TargetedType[ typeId=" + typeId + " ]";
	}

}

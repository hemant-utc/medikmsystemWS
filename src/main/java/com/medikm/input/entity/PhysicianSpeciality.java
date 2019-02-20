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
@Table(name = "physician_speciality")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "PhysicianSpeciality.findAll", query = "SELECT p FROM PhysicianSpeciality p") })
public class PhysicianSpeciality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "Name")
	private String name;
	@OneToMany(mappedBy = "specialty")
	private Collection<Physician> physicianCollection;

	public PhysicianSpeciality() {
	}

	public PhysicianSpeciality(Integer typeId) {
		this.typeId = typeId;
	}

	public PhysicianSpeciality(Integer typeId, String name) {
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
	public Collection<Physician> getPhysicianCollection() {
		return physicianCollection;
	}

	public void setPhysicianCollection(Collection<Physician> physicianCollection) {
		this.physicianCollection = physicianCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PhysicianSpeciality)) {
			return false;
		}
		PhysicianSpeciality other = (PhysicianSpeciality) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PhysicianSpeciality[ typeId=" + typeId + " ]";
	}

}

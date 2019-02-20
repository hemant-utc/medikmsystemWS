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
@Table(name = "race")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Race.findAll", query = "SELECT r FROM Race r") })
public class Race implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "Race")
	private String race;
	@OneToMany(mappedBy = "race")
	private Collection<Patient> patientCollection;

	public Race() {
	}

	public Race(Integer typeId) {
		this.typeId = typeId;
	}

	public Race(Integer typeId, String race) {
		this.typeId = typeId;
		this.race = race;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@XmlTransient
	public Collection<Patient> getPatientCollection() {
		return patientCollection;
	}

	public void setPatientCollection(Collection<Patient> patientCollection) {
		this.patientCollection = patientCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Race)) {
			return false;
		}
		Race other = (Race) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Race[ typeId=" + typeId + " ]";
	}

}

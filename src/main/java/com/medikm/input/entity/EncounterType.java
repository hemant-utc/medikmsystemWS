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
@Table(name = "encounter_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EncounterType.findAll", query = "SELECT e FROM EncounterType e") })
public class EncounterType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "EName")
	private String eName;
	@OneToMany(mappedBy = "encounterTypeId")
	private Collection<Encounter> encounterCollection;

	public EncounterType() {
	}

	public EncounterType(Integer typeId) {
		this.typeId = typeId;
	}

	public EncounterType(Integer typeId, String eName) {
		this.typeId = typeId;
		this.eName = eName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getEName() {
		return eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	@XmlTransient
	public Collection<Encounter> getEncounterCollection() {
		return encounterCollection;
	}

	public void setEncounterCollection(Collection<Encounter> encounterCollection) {
		this.encounterCollection = encounterCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EncounterType)) {
			return false;
		}
		EncounterType other = (EncounterType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EncounterType[ typeId=" + typeId + " ]";
	}

}

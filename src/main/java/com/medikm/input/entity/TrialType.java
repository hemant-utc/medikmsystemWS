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
@Table(name = "trial_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TrialType.findAll", query = "SELECT t FROM TrialType t") })
public class TrialType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "TName")
	private String tName;
	@OneToMany(mappedBy = "trialTypeId")
	private Collection<ClinicalTrial> clinicalTrialCollection;

	public TrialType() {
	}

	public TrialType(Integer typeId) {
		this.typeId = typeId;
	}

	public TrialType(Integer typeId, String tName) {
		this.typeId = typeId;
		this.tName = tName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTName() {
		return tName;
	}

	public void setTName(String tName) {
		this.tName = tName;
	}

	@XmlTransient
	public Collection<ClinicalTrial> getClinicalTrialCollection() {
		return clinicalTrialCollection;
	}

	public void setClinicalTrialCollection(Collection<ClinicalTrial> clinicalTrialCollection) {
		this.clinicalTrialCollection = clinicalTrialCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TrialType)) {
			return false;
		}
		TrialType other = (TrialType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TrialType[ typeId=" + typeId + " ]";
	}

}

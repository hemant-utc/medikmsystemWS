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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cancer_sub_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CancerSubType.findAll", query = "SELECT c FROM CancerSubType c") })
public class CancerSubType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Can_Sub_Type_Id")
	private Integer canSubTypeId;
	@Basic(optional = false)
	@Column(name = "Name")
	private String name;
	@JoinColumn(name = "Cancer_Type_Id", referencedColumnName = "Can_Type_Id")
	@ManyToOne(optional = false)
	private CancerType cancerTypeId;
	@OneToMany(mappedBy = "cancerSubTypeId")
	private Collection<Case1> case1Collection;
	@OneToMany(mappedBy = "cancerSubType")
	private Collection<PersonalMedicalHistory> personalMedicalHistoryCollection;
	@OneToMany(mappedBy = "cancerSubType")
	private Collection<Pathology> pathologyCollection;
	@OneToMany(mappedBy = "cancerSubType")
	private Collection<RelativeDetails> relativeDetailsCollection;

	public CancerSubType() {
	}

	public CancerSubType(Integer canSubTypeId) {
		this.canSubTypeId = canSubTypeId;
	}

	public CancerSubType(Integer canSubTypeId, String name) {
		this.canSubTypeId = canSubTypeId;
		this.name = name;
	}

	public Integer getCanSubTypeId() {
		return canSubTypeId;
	}

	public void setCanSubTypeId(Integer canSubTypeId) {
		this.canSubTypeId = canSubTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CancerType getCancerTypeId() {
		return cancerTypeId;
	}

	public void setCancerTypeId(CancerType cancerTypeId) {
		this.cancerTypeId = cancerTypeId;
	}

	@XmlTransient
	public Collection<Case1> getCase1Collection() {
		return case1Collection;
	}

	public void setCase1Collection(Collection<Case1> case1Collection) {
		this.case1Collection = case1Collection;
	}

	@XmlTransient
	public Collection<PersonalMedicalHistory> getPersonalMedicalHistoryCollection() {
		return personalMedicalHistoryCollection;
	}

	public void setPersonalMedicalHistoryCollection(
			Collection<PersonalMedicalHistory> personalMedicalHistoryCollection) {
		this.personalMedicalHistoryCollection = personalMedicalHistoryCollection;
	}

	@XmlTransient
	public Collection<Pathology> getPathologyCollection() {
		return pathologyCollection;
	}

	public void setPathologyCollection(Collection<Pathology> pathologyCollection) {
		this.pathologyCollection = pathologyCollection;
	}

	@XmlTransient
	public Collection<RelativeDetails> getRelativeDetailsCollection() {
		return relativeDetailsCollection;
	}

	public void setRelativeDetailsCollection(Collection<RelativeDetails> relativeDetailsCollection) {
		this.relativeDetailsCollection = relativeDetailsCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (canSubTypeId != null ? canSubTypeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CancerSubType)) {
			return false;
		}
		CancerSubType other = (CancerSubType) object;
		if ((this.canSubTypeId == null && other.canSubTypeId != null)
				|| (this.canSubTypeId != null && !this.canSubTypeId.equals(other.canSubTypeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CancerSubType[ canSubTypeId=" + canSubTypeId + " ]";
	}

}

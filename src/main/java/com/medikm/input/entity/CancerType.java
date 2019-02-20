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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "cancer_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CancerType.findAll", query = "SELECT c FROM CancerType c") })
public class CancerType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Can_Type_Id")
	private Integer canTypeId;
	@Basic(optional = false)
	@Column(name = "CName")
	private String cName;
	@Lob
	@Column(name = "Comments")
	private String comments;
	@OneToMany(mappedBy = "cancerTypeId")
	private Collection<Physician> physicianCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cancerTypeId")
	private Collection<CancerSubType> cancerSubTypeCollection;
	@OneToMany(mappedBy = "cancerTypeId")
	private Collection<Case1> case1Collection;
	@JoinColumn(name = "disease_type_Id", referencedColumnName = "Disease_Type_Id")
	@ManyToOne
	private DiseaseType diseasetypeId;
	@OneToMany(mappedBy = "cancerType")
	private Collection<PersonalMedicalHistory> personalMedicalHistoryCollection;
	@OneToMany(mappedBy = "cancerType")
	private Collection<Pathology> pathologyCollection;
	@OneToMany(mappedBy = "cancerType")
	private Collection<RelativeDetails> relativeDetailsCollection;

	@JoinColumn(name = "disease_sub_type_id", referencedColumnName = "Disease_Sub_Type_Id")
	@ManyToOne
	private DiseaseSubType diseaseSubType;

	/**
	 * @return the diseaseSubType
	 */
	public DiseaseSubType getDiseaseSubType() {
		return diseaseSubType;
	}

	/**
	 * @param diseaseSubType
	 *            the diseaseSubType to set
	 */
	public void setDiseaseSubType(DiseaseSubType diseaseSubType) {
		this.diseaseSubType = diseaseSubType;
	}

	public CancerType() {
	}

	public CancerType(Integer canTypeId) {
		this.canTypeId = canTypeId;
	}

	public CancerType(Integer canTypeId, String cName) {
		this.canTypeId = canTypeId;
		this.cName = cName;
	}

	public Integer getCanTypeId() {
		return canTypeId;
	}

	public void setCanTypeId(Integer canTypeId) {
		this.canTypeId = canTypeId;
	}

	public String getCName() {
		return cName;
	}

	public void setCName(String cName) {
		this.cName = cName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@XmlTransient
	public Collection<Physician> getPhysicianCollection() {
		return physicianCollection;
	}

	public void setPhysicianCollection(Collection<Physician> physicianCollection) {
		this.physicianCollection = physicianCollection;
	}

	@XmlTransient
	public Collection<CancerSubType> getCancerSubTypeCollection() {
		return cancerSubTypeCollection;
	}

	public void setCancerSubTypeCollection(Collection<CancerSubType> cancerSubTypeCollection) {
		this.cancerSubTypeCollection = cancerSubTypeCollection;
	}

	@XmlTransient
	public Collection<Case1> getCase1Collection() {
		return case1Collection;
	}

	public void setCase1Collection(Collection<Case1> case1Collection) {
		this.case1Collection = case1Collection;
	}

	public DiseaseType getDiseasetypeId() {
		return diseasetypeId;
	}

	public void setDiseasetypeId(DiseaseType diseasetypeId) {
		this.diseasetypeId = diseasetypeId;
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
		hash += (canTypeId != null ? canTypeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CancerType)) {
			return false;
		}
		CancerType other = (CancerType) object;
		if ((this.canTypeId == null && other.canTypeId != null)
				|| (this.canTypeId != null && !this.canTypeId.equals(other.canTypeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CancerType[ canTypeId=" + canTypeId + " ]";
	}

}

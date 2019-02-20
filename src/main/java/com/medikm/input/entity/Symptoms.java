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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author Rohit Patel
 */
@Entity
@Table(name = "symptoms")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Symptoms.findAll", query = "SELECT s FROM Symptoms s"),
		@NamedQuery(name = "Symptoms.findBySymptomsId", query = "SELECT s FROM Symptoms s WHERE s.symptomsId = :symptomsId"),
		@NamedQuery(name = "Symptoms.findBySymptomsName", query = "SELECT s FROM Symptoms s WHERE s.symptomsName = :symptomsName") })
public class Symptoms implements Serializable, Comparable<Symptoms> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Symptoms_Id")
	private Integer symptomsId;
	@Column(name = "Symptoms_Name")
	private String symptomsName;
	@OneToMany(mappedBy = "symptoms", fetch = FetchType.EAGER)
	private Collection<PersonalMedicalHistory> personalMedicalHistoryCollection;
	@JoinColumn(name = "Disease_Type_Id", referencedColumnName = "Disease_Type_Id")
	@ManyToOne(fetch = FetchType.EAGER)
	private DiseaseType diseaseTypeId;
	@JoinColumn(name = "Disease_Sub_Type_Id", referencedColumnName = "Disease_Sub_Type_Id")
	@ManyToOne(fetch = FetchType.EAGER)
	private DiseaseSubType diseaseSubTypeId;

	public Symptoms() {
	}

	public Symptoms(Integer symptomsId) {
		this.symptomsId = symptomsId;
	}

	public Integer getSymptomsId() {
		return symptomsId;
	}

	public void setSymptomsId(Integer symptomsId) {
		this.symptomsId = symptomsId;
	}

	public String getSymptomsName() {
		return symptomsName;
	}

	public void setSymptomsName(String symptomsName) {
		this.symptomsName = symptomsName;
	}

	@XmlTransient
	public Collection<PersonalMedicalHistory> getPersonalMedicalHistoryCollection() {
		return personalMedicalHistoryCollection;
	}

	public void setPersonalMedicalHistoryCollection(
			Collection<PersonalMedicalHistory> personalMedicalHistoryCollection) {
		this.personalMedicalHistoryCollection = personalMedicalHistoryCollection;
	}

	public DiseaseType getDiseaseTypeId() {
		return diseaseTypeId;
	}

	public void setDiseaseTypeId(DiseaseType diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	public DiseaseSubType getDiseaseSubTypeId() {
		return diseaseSubTypeId;
	}

	public void setDiseaseSubTypeId(DiseaseSubType diseaseSubTypeId) {
		this.diseaseSubTypeId = diseaseSubTypeId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (symptomsId != null ? symptomsId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Symptoms)) {
			return false;
		}
		Symptoms other = (Symptoms) object;
		if ((this.symptomsId == null && other.symptomsId != null)
				|| (this.symptomsId != null && !this.symptomsId.equals(other.symptomsId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.Symptoms[ symptomsId=" + symptomsId + " ]";
	}

	@Override
	public int compareTo(Symptoms o) {
		return 0;
	}

}

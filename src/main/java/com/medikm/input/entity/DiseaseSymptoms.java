package com.medikm.input.entity;

import java.io.Serializable;

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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "disease_symptoms")
@XmlRootElement
@NamedQueries({
		@javax.persistence.NamedQuery(name = "DiseaseSymptoms.findAll", query = "SELECT d FROM DiseaseSymptoms d"),
		@javax.persistence.NamedQuery(name = "DiseaseSymptoms.findById", query = "SELECT d FROM DiseaseSymptoms d WHERE d.id = :id") })
public class DiseaseSymptoms implements Serializable, Comparable<DiseaseSymptoms> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

	@JoinColumn(name = "symptoms_id", referencedColumnName = "Symptoms_Id")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Symptoms symptomsId;

	@JoinColumn(name = "case_id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Case1 caseId;

	public DiseaseSymptoms() {
	}

	public DiseaseSymptoms(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Symptoms getSymptomsId() {
		return this.symptomsId;
	}

	public void setSymptomsId(Symptoms symptomsId) {
		this.symptomsId = symptomsId;
	}

	public Case1 getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public int hashCode() {
		int hash = 0;
		hash += (this.id != null ? this.id.hashCode() : 0);
		return hash;
	}

	public boolean equals(Object object) {
		if (!(object instanceof DiseaseSymptoms)) {
			return false;
		}
		DiseaseSymptoms other = (DiseaseSymptoms) object;
		if (((this.id == null) && (other.id != null)) || ((this.id != null) && (!this.id.equals(other.id)))) {
			return false;
		}
		return true;
	}

	public String toString() {
		return "com.medikm.entity.DiseaseSymptoms[ id=" + this.id + " ]";
	}

	public int compareTo(DiseaseSymptoms arg0) {
		return 0;
	}
}
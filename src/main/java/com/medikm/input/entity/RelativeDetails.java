/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "relative_details")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "RelativeDetails.findAll", query = "SELECT r FROM RelativeDetails r") })
public class RelativeDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected RelativeDetailsPK relativeDetailsPK;
	@Column(name = "Age_at_Diagnosis")
	private Integer ageatDiagnosis;
	@Column(name = "Age_at_Death")
	private Integer ageatDeath;
	@JoinColumn(name = "Patient_Id", referencedColumnName = "Patient_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Patient patient;
	@JoinColumn(name = "Relationship", referencedColumnName = "Type_Id")
	@ManyToOne
	private Relationship relationship;
	@JoinColumn(name = "Genetics", referencedColumnName = "Id")
	@ManyToOne
	private Genetics genetics;
	@JoinColumn(name = "Gemonics", referencedColumnName = "Id")
	@ManyToOne
	private Gemonics gemonics;
	@JoinColumn(name = "Cancer_Sub_Type", referencedColumnName = "Can_Sub_Type_Id")
	@ManyToOne
	private CancerSubType cancerSubType;
	@JoinColumn(name = "Cancer_Type", referencedColumnName = "Can_Type_Id")
	@ManyToOne
	private CancerType cancerType;

	public RelativeDetails() {
	}

	public RelativeDetails(RelativeDetailsPK relativeDetailsPK) {
		this.relativeDetailsPK = relativeDetailsPK;
	}

	public RelativeDetails(int patientId, Date fHDate, int relativeId) {
		this.relativeDetailsPK = new RelativeDetailsPK(patientId, fHDate, relativeId);
	}

	public RelativeDetailsPK getRelativeDetailsPK() {
		return relativeDetailsPK;
	}

	public void setRelativeDetailsPK(RelativeDetailsPK relativeDetailsPK) {
		this.relativeDetailsPK = relativeDetailsPK;
	}

	public Integer getAgeatDiagnosis() {
		return ageatDiagnosis;
	}

	public void setAgeatDiagnosis(Integer ageatDiagnosis) {
		this.ageatDiagnosis = ageatDiagnosis;
	}

	public Integer getAgeatDeath() {
		return ageatDeath;
	}

	public void setAgeatDeath(Integer ageatDeath) {
		this.ageatDeath = ageatDeath;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Relationship getRelationship() {
		return relationship;
	}

	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}

	public Genetics getGenetics() {
		return genetics;
	}

	public void setGenetics(Genetics genetics) {
		this.genetics = genetics;
	}

	public Gemonics getGemonics() {
		return gemonics;
	}

	public void setGemonics(Gemonics gemonics) {
		this.gemonics = gemonics;
	}

	public CancerSubType getCancerSubType() {
		return cancerSubType;
	}

	public void setCancerSubType(CancerSubType cancerSubType) {
		this.cancerSubType = cancerSubType;
	}

	public CancerType getCancerType() {
		return cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (relativeDetailsPK != null ? relativeDetailsPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RelativeDetails)) {
			return false;
		}
		RelativeDetails other = (RelativeDetails) object;
		if ((this.relativeDetailsPK == null && other.relativeDetailsPK != null)
				|| (this.relativeDetailsPK != null && !this.relativeDetailsPK.equals(other.relativeDetailsPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.RelativeDetails[ relativeDetailsPK=" + relativeDetailsPK + " ]";
	}

}

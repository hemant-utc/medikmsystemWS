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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "encounter_clinical_trial")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "EncounterClinicalTrial.findAll", query = "SELECT e FROM EncounterClinicalTrial e") })
public class EncounterClinicalTrial implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected EncounterClinicalTrialPK encounterClinicalTrialPK;
	@Column(name = "Enrolled_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date enrolledDate;

	@JoinColumn(name = "Clinical_Trial_Id", referencedColumnName = "Clinical_Trial_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private ClinicalTrial clinicalTrial;

	public EncounterClinicalTrial() {
	}

	public EncounterClinicalTrial(EncounterClinicalTrialPK encounterClinicalTrialPK) {
		this.encounterClinicalTrialPK = encounterClinicalTrialPK;
	}

	public EncounterClinicalTrial(int encounterId, int clinicalTrialId) {
		this.encounterClinicalTrialPK = new EncounterClinicalTrialPK(encounterId, clinicalTrialId);
	}

	public EncounterClinicalTrialPK getEncounterClinicalTrialPK() {
		return encounterClinicalTrialPK;
	}

	public void setEncounterClinicalTrialPK(EncounterClinicalTrialPK encounterClinicalTrialPK) {
		this.encounterClinicalTrialPK = encounterClinicalTrialPK;
	}

	public Date getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

	public ClinicalTrial getClinicalTrial() {
		return clinicalTrial;
	}

	public void setClinicalTrial(ClinicalTrial clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterClinicalTrialPK != null ? encounterClinicalTrialPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EncounterClinicalTrial)) {
			return false;
		}
		EncounterClinicalTrial other = (EncounterClinicalTrial) object;
		if ((this.encounterClinicalTrialPK == null && other.encounterClinicalTrialPK != null)
				|| (this.encounterClinicalTrialPK != null
						&& !this.encounterClinicalTrialPK.equals(other.encounterClinicalTrialPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EncounterClinicalTrial[ encounterClinicalTrialPK=" + encounterClinicalTrialPK
				+ " ]";
	}

}

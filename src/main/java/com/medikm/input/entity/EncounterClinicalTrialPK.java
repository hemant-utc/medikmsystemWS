/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Saikat
 */
@SuppressWarnings("serial")
@Embeddable
public class EncounterClinicalTrialPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private int encounterId;
	@Basic(optional = false)
	@Column(name = "Clinical_Trial_Id")
	private int clinicalTrialId;

	public EncounterClinicalTrialPK() {
	}

	public EncounterClinicalTrialPK(int encounterId, int clinicalTrialId) {
		this.encounterId = encounterId;
		this.clinicalTrialId = clinicalTrialId;
	}

	public int getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}

	public int getClinicalTrialId() {
		return clinicalTrialId;
	}

	public void setClinicalTrialId(int clinicalTrialId) {
		this.clinicalTrialId = clinicalTrialId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) encounterId;
		hash += (int) clinicalTrialId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EncounterClinicalTrialPK)) {
			return false;
		}
		EncounterClinicalTrialPK other = (EncounterClinicalTrialPK) object;
		if (this.encounterId != other.encounterId) {
			return false;
		}
		if (this.clinicalTrialId != other.clinicalTrialId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EncounterClinicalTrialPK[ encounterId=" + encounterId + ", clinicalTrialId="
				+ clinicalTrialId + " ]";
	}

}

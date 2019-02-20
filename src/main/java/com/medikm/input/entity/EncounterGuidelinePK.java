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
public class EncounterGuidelinePK implements Serializable {

	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private int encounterId;
	@Basic(optional = false)
	@Column(name = "Guideline_Id")
	private int guidelineId;
	@Basic(optional = false)
	@Column(name = "Guideline_Step_Id")
	private int guidelineStepId;

	public EncounterGuidelinePK() {
	}

	public EncounterGuidelinePK(int encounterId, int guidelineId, int guidelineStepId) {
		this.encounterId = encounterId;
		this.guidelineId = guidelineId;
		this.guidelineStepId = guidelineStepId;
	}

	public int getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}

	public int getGuidelineId() {
		return guidelineId;
	}

	public void setGuidelineId(int guidelineId) {
		this.guidelineId = guidelineId;
	}

	public int getGuidelineStepId() {
		return guidelineStepId;
	}

	public void setGuidelineStepId(int guidelineStepId) {
		this.guidelineStepId = guidelineStepId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) encounterId;
		hash += (int) guidelineId;
		hash += (int) guidelineStepId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EncounterGuidelinePK)) {
			return false;
		}
		EncounterGuidelinePK other = (EncounterGuidelinePK) object;
		if (this.encounterId != other.encounterId) {
			return false;
		}
		if (this.guidelineId != other.guidelineId) {
			return false;
		}
		if (this.guidelineStepId != other.guidelineStepId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EncounterGuidelinePK[ encounterId=" + encounterId + ", guidelineId="
				+ guidelineId + ", guidelineStepId=" + guidelineStepId + " ]";
	}

}

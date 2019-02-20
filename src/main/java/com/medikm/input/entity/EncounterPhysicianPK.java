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
public class EncounterPhysicianPK implements Serializable {
	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private int encounterId;
	@Basic(optional = false)
	@Column(name = "Physician_Id")
	private int physicianId;

	public EncounterPhysicianPK() {
	}

	public EncounterPhysicianPK(int encounterId, int physicianId) {
		this.encounterId = encounterId;
		this.physicianId = physicianId;
	}

	public int getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}

	public int getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(int physicianId) {
		this.physicianId = physicianId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) encounterId;
		hash += (int) physicianId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EncounterPhysicianPK)) {
			return false;
		}
		EncounterPhysicianPK other = (EncounterPhysicianPK) object;
		if (this.encounterId != other.encounterId) {
			return false;
		}
		if (this.physicianId != other.physicianId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EncounterPhysicianPK[ encounterId=" + encounterId + ", physicianId="
				+ physicianId + " ]";
	}

}

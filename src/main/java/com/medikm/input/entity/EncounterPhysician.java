/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "encounter_physician")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EncounterPhysician.findAll", query = "SELECT e FROM EncounterPhysician e") })
public class EncounterPhysician implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected EncounterPhysicianPK encounterPhysicianPK;
	@Lob
	@Column(name = "Physican_Encounter_Note")
	private String physicanEncounterNote;
	@JoinColumn(name = "Physician_Id", referencedColumnName = "Physician_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Physician physician;
	@JoinColumn(name = "Encounter_Id", referencedColumnName = "Encounter_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Encounter encounter;

	public EncounterPhysician() {
	}

	public EncounterPhysician(EncounterPhysicianPK encounterPhysicianPK) {
		this.encounterPhysicianPK = encounterPhysicianPK;
	}

	public EncounterPhysician(int encounterId, int physicianId) {
		this.encounterPhysicianPK = new EncounterPhysicianPK(encounterId, physicianId);
	}

	public EncounterPhysicianPK getEncounterPhysicianPK() {
		return encounterPhysicianPK;
	}

	public void setEncounterPhysicianPK(EncounterPhysicianPK encounterPhysicianPK) {
		this.encounterPhysicianPK = encounterPhysicianPK;
	}

	public String getPhysicanEncounterNote() {
		return physicanEncounterNote;
	}

	public void setPhysicanEncounterNote(String physicanEncounterNote) {
		this.physicanEncounterNote = physicanEncounterNote;
	}

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterPhysicianPK != null ? encounterPhysicianPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EncounterPhysician)) {
			return false;
		}
		EncounterPhysician other = (EncounterPhysician) object;
		if ((this.encounterPhysicianPK == null && other.encounterPhysicianPK != null)
				|| (this.encounterPhysicianPK != null
						&& !this.encounterPhysicianPK.equals(other.encounterPhysicianPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EncounterPhysician[ encounterPhysicianPK=" + encounterPhysicianPK + " ]";
	}

}

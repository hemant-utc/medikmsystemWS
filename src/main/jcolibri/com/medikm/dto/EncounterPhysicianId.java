package com.medikm.dto;

/**
 * EncounterPhysicianId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EncounterPhysicianId implements java.io.Serializable {

	// Fields

	private Encounter encounter;
	private Physician physician;

	// Constructors

	/** default constructor */
	public EncounterPhysicianId() {
	}

	/** full constructor */
	public EncounterPhysicianId(Encounter encounter, Physician physician) {
		this.encounter = encounter;
		this.physician = physician;
	}

	// Property accessors

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EncounterPhysicianId))
			return false;
		EncounterPhysicianId castOther = (EncounterPhysicianId) other;

		return ((this.getEncounter() == castOther.getEncounter()) || (this.getEncounter() != null
				&& castOther.getEncounter() != null && this.getEncounter().equals(castOther.getEncounter())))
				&& ((this.getPhysician() == castOther.getPhysician()) || (this.getPhysician() != null
						&& castOther.getPhysician() != null && this.getPhysician().equals(castOther.getPhysician())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEncounter() == null ? 0 : this.getEncounter().hashCode());
		result = 37 * result + (getPhysician() == null ? 0 : this.getPhysician().hashCode());
		return result;
	}

}
package com.medikm.dto;

/**
 * EncounterClinicalTrialId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EncounterClinicalTrialId implements java.io.Serializable {

	// Fields

	private Encounter encounter;
	private ClinicalTrial clinicalTrial;

	// Constructors

	/** default constructor */
	public EncounterClinicalTrialId() {
	}

	/** full constructor */
	public EncounterClinicalTrialId(Encounter encounter, ClinicalTrial clinicalTrial) {
		this.encounter = encounter;
		this.clinicalTrial = clinicalTrial;
	}

	// Property accessors

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public ClinicalTrial getClinicalTrial() {
		return this.clinicalTrial;
	}

	public void setClinicalTrial(ClinicalTrial clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EncounterClinicalTrialId))
			return false;
		EncounterClinicalTrialId castOther = (EncounterClinicalTrialId) other;

		return ((this.getEncounter() == castOther.getEncounter()) || (this.getEncounter() != null
				&& castOther.getEncounter() != null && this.getEncounter().equals(castOther.getEncounter())))
				&& ((this.getClinicalTrial() == castOther.getClinicalTrial())
						|| (this.getClinicalTrial() != null && castOther.getClinicalTrial() != null
								&& this.getClinicalTrial().equals(castOther.getClinicalTrial())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEncounter() == null ? 0 : this.getEncounter().hashCode());
		result = 37 * result + (getClinicalTrial() == null ? 0 : this.getClinicalTrial().hashCode());
		return result;
	}

}
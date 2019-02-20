package com.medikm.dto;

import java.sql.Timestamp;

/**
 * FamilyHistoryId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class FamilyHistoryId implements java.io.Serializable {

	// Fields

	private Patient patient;
	private Timestamp FHDate;

	// Constructors

	/** default constructor */
	public FamilyHistoryId() {
	}

	/** full constructor */
	public FamilyHistoryId(Patient patient, Timestamp FHDate) {
		this.patient = patient;
		this.FHDate = FHDate;
	}

	// Property accessors

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Timestamp getFHDate() {
		return this.FHDate;
	}

	public void setFHDate(Timestamp FHDate) {
		this.FHDate = FHDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FamilyHistoryId))
			return false;
		FamilyHistoryId castOther = (FamilyHistoryId) other;

		return ((this.getPatient() == castOther.getPatient()) || (this.getPatient() != null
				&& castOther.getPatient() != null && this.getPatient().equals(castOther.getPatient())))
				&& ((this.getFHDate() == castOther.getFHDate()) || (this.getFHDate() != null
						&& castOther.getFHDate() != null && this.getFHDate().equals(castOther.getFHDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPatient() == null ? 0 : this.getPatient().hashCode());
		result = 37 * result + (getFHDate() == null ? 0 : this.getFHDate().hashCode());
		return result;
	}

}
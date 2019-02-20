package com.medikm.dto;

import java.sql.Timestamp;

/**
 * PersonalMedicalHistoryId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class PersonalMedicalHistoryId implements java.io.Serializable {

	// Fields

	private Patient patient;
	private Timestamp medHistDate;

	// Constructors

	/** default constructor */
	public PersonalMedicalHistoryId() {
	}

	/** full constructor */
	public PersonalMedicalHistoryId(Patient patient, Timestamp medHistDate) {
		this.patient = patient;
		this.medHistDate = medHistDate;
	}

	// Property accessors

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Timestamp getMedHistDate() {
		return this.medHistDate;
	}

	public void setMedHistDate(Timestamp medHistDate) {
		this.medHistDate = medHistDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PersonalMedicalHistoryId))
			return false;
		PersonalMedicalHistoryId castOther = (PersonalMedicalHistoryId) other;

		return ((this.getPatient() == castOther.getPatient()) || (this.getPatient() != null
				&& castOther.getPatient() != null && this.getPatient().equals(castOther.getPatient())))
				&& ((this.getMedHistDate() == castOther.getMedHistDate())
						|| (this.getMedHistDate() != null && castOther.getMedHistDate() != null
								&& this.getMedHistDate().equals(castOther.getMedHistDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPatient() == null ? 0 : this.getPatient().hashCode());
		result = 37 * result + (getMedHistDate() == null ? 0 : this.getMedHistDate().hashCode());
		return result;
	}

}
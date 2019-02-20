package com.medikm.dto;

import java.sql.Timestamp;

/**
 * RelativeDetailsId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class RelativeDetailsId implements java.io.Serializable {

	// Fields

	private Patient patient;
	private Timestamp FHDate;
	private Integer relativeId;

	// Constructors

	/** default constructor */
	public RelativeDetailsId() {
	}

	/** full constructor */
	public RelativeDetailsId(Patient patient, Timestamp FHDate, Integer relativeId) {
		this.patient = patient;
		this.FHDate = FHDate;
		this.relativeId = relativeId;
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

	public Integer getRelativeId() {
		return this.relativeId;
	}

	public void setRelativeId(Integer relativeId) {
		this.relativeId = relativeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RelativeDetailsId))
			return false;
		RelativeDetailsId castOther = (RelativeDetailsId) other;

		return ((this.getPatient() == castOther.getPatient()) || (this.getPatient() != null
				&& castOther.getPatient() != null && this.getPatient().equals(castOther.getPatient())))
				&& ((this.getFHDate() == castOther.getFHDate()) || (this.getFHDate() != null
						&& castOther.getFHDate() != null && this.getFHDate().equals(castOther.getFHDate())))
				&& ((this.getRelativeId() == castOther.getRelativeId())
						|| (this.getRelativeId() != null && castOther.getRelativeId() != null
								&& this.getRelativeId().equals(castOther.getRelativeId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPatient() == null ? 0 : this.getPatient().hashCode());
		result = 37 * result + (getFHDate() == null ? 0 : this.getFHDate().hashCode());
		result = 37 * result + (getRelativeId() == null ? 0 : this.getRelativeId().hashCode());
		return result;
	}

}
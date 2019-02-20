package com.medikm.dto;

import java.sql.Timestamp;

/**
 * ReproductiveHistoryId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class ReproductiveHistoryId implements java.io.Serializable {

	// Fields

	private Patient patient;
	private Timestamp RHDt;

	// Constructors

	/** default constructor */
	public ReproductiveHistoryId() {
	}

	/** full constructor */
	public ReproductiveHistoryId(Patient patient, Timestamp RHDt) {
		this.patient = patient;
		this.RHDt = RHDt;
	}

	// Property accessors

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Timestamp getRHDt() {
		return this.RHDt;
	}

	public void setRHDt(Timestamp RHDt) {
		this.RHDt = RHDt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReproductiveHistoryId))
			return false;
		ReproductiveHistoryId castOther = (ReproductiveHistoryId) other;

		return ((this.getPatient() == castOther.getPatient()) || (this.getPatient() != null
				&& castOther.getPatient() != null && this.getPatient().equals(castOther.getPatient())))
				&& ((this.getRHDt() == castOther.getRHDt()) || (this.getRHDt() != null && castOther.getRHDt() != null
						&& this.getRHDt().equals(castOther.getRHDt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPatient() == null ? 0 : this.getPatient().hashCode());
		result = 37 * result + (getRHDt() == null ? 0 : this.getRHDt().hashCode());
		return result;
	}

}
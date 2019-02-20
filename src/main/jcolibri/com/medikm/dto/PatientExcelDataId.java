package com.medikm.dto;

/**
 * PatientExcelDataId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class PatientExcelDataId implements java.io.Serializable {

	// Fields

	private String patientName;
	private String dob;

	// Constructors

	/** default constructor */
	public PatientExcelDataId() {
	}

	/** full constructor */
	public PatientExcelDataId(String patientName, String dob) {
		this.patientName = patientName;
		this.dob = dob;
	}

	// Property accessors

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PatientExcelDataId))
			return false;
		PatientExcelDataId castOther = (PatientExcelDataId) other;

		return ((this.getPatientName() == castOther.getPatientName()) || (this.getPatientName() != null
				&& castOther.getPatientName() != null && this.getPatientName().equals(castOther.getPatientName())))
				&& ((this.getDob() == castOther.getDob()) || (this.getDob() != null && castOther.getDob() != null
						&& this.getDob().equals(castOther.getDob())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPatientName() == null ? 0 : this.getPatientName().hashCode());
		result = 37 * result + (getDob() == null ? 0 : this.getDob().hashCode());
		return result;
	}

}
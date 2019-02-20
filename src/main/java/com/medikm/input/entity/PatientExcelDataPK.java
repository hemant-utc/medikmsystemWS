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
public class PatientExcelDataPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "patient_name")
	private String patientName;
	@Basic(optional = false)
	@Column(name = "dob")
	private String dob;

	public PatientExcelDataPK() {
	}

	public PatientExcelDataPK(String patientName, String dob) {
		this.patientName = patientName;
		this.dob = dob;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (patientName != null ? patientName.hashCode() : 0);
		hash += (dob != null ? dob.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PatientExcelDataPK)) {
			return false;
		}
		PatientExcelDataPK other = (PatientExcelDataPK) object;
		if ((this.patientName == null && other.patientName != null)
				|| (this.patientName != null && !this.patientName.equals(other.patientName))) {
			return false;
		}
		if ((this.dob == null && other.dob != null) || (this.dob != null && !this.dob.equals(other.dob))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PatientExcelDataPK[ patientName=" + patientName + ", dob=" + dob + " ]";
	}

}

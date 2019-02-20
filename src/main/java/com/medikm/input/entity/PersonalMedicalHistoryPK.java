/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Saikat
 */
@SuppressWarnings("serial")
@Embeddable
public class PersonalMedicalHistoryPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "Patient_Id")
	private int patientId;
	@Basic(optional = false)
	@Column(name = "Med_Hist_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date medHistDate;

	public PersonalMedicalHistoryPK() {
	}

	public PersonalMedicalHistoryPK(int patientId, Date medHistDate) {
		this.patientId = patientId;
		this.medHistDate = medHistDate;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public Date getMedHistDate() {
		return medHistDate;
	}

	public void setMedHistDate(Date medHistDate) {
		this.medHistDate = medHistDate;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) patientId;
		hash += (medHistDate != null ? medHistDate.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PersonalMedicalHistoryPK)) {
			return false;
		}
		PersonalMedicalHistoryPK other = (PersonalMedicalHistoryPK) object;
		if (this.patientId != other.patientId) {
			return false;
		}
		if ((this.medHistDate == null && other.medHistDate != null)
				|| (this.medHistDate != null && !this.medHistDate.equals(other.medHistDate))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PersonalMedicalHistoryPK[ patientId=" + patientId + ", medHistDate="
				+ medHistDate + " ]";
	}

}

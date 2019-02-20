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
public class FamilyHistoryPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "Patient_Id")
	private int patientId;
	@Basic(optional = false)
	@Column(name = "F_H_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fHDate;

	public FamilyHistoryPK() {
	}

	public FamilyHistoryPK(int patientId, Date fHDate) {
		this.patientId = patientId;
		this.fHDate = fHDate;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public Date getFHDate() {
		return fHDate;
	}

	public void setFHDate(Date fHDate) {
		this.fHDate = fHDate;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) patientId;
		hash += (fHDate != null ? fHDate.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof FamilyHistoryPK)) {
			return false;
		}
		FamilyHistoryPK other = (FamilyHistoryPK) object;
		if (this.patientId != other.patientId) {
			return false;
		}
		if ((this.fHDate == null && other.fHDate != null)
				|| (this.fHDate != null && !this.fHDate.equals(other.fHDate))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.FamilyHistoryPK[ patientId=" + patientId + ", fHDate=" + fHDate + " ]";
	}

}

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
public class RelativeDetailsPK implements Serializable {
	@Basic(optional = false)
	@Column(name = "Patient_Id")
	private int patientId;
	@Basic(optional = false)
	@Column(name = "F_H_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fHDate;
	@Basic(optional = false)
	@Column(name = "Relative_Id")
	private int relativeId;

	public RelativeDetailsPK() {
	}

	public RelativeDetailsPK(int patientId, Date fHDate, int relativeId) {
		this.patientId = patientId;
		this.fHDate = fHDate;
		this.relativeId = relativeId;
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

	public int getRelativeId() {
		return relativeId;
	}

	public void setRelativeId(int relativeId) {
		this.relativeId = relativeId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) patientId;
		hash += (fHDate != null ? fHDate.hashCode() : 0);
		hash += (int) relativeId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RelativeDetailsPK)) {
			return false;
		}
		RelativeDetailsPK other = (RelativeDetailsPK) object;
		if (this.patientId != other.patientId) {
			return false;
		}
		if ((this.fHDate == null && other.fHDate != null)
				|| (this.fHDate != null && !this.fHDate.equals(other.fHDate))) {
			return false;
		}
		if (this.relativeId != other.relativeId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.RelativeDetailsPK[ patientId=" + patientId + ", fHDate=" + fHDate
				+ ", relativeId=" + relativeId + " ]";
	}

}

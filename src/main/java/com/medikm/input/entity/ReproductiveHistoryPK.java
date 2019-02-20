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
public class ReproductiveHistoryPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "Patient_Id")
	private int patientId;
	@Basic(optional = false)
	@Column(name = "R_H_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date rHDt;

	public ReproductiveHistoryPK() {
	}

	public ReproductiveHistoryPK(int patientId, Date rHDt) {
		this.patientId = patientId;
		this.rHDt = rHDt;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public Date getRHDt() {
		return rHDt;
	}

	public void setRHDt(Date rHDt) {
		this.rHDt = rHDt;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) patientId;
		hash += (rHDt != null ? rHDt.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ReproductiveHistoryPK)) {
			return false;
		}
		ReproductiveHistoryPK other = (ReproductiveHistoryPK) object;
		if (this.patientId != other.patientId) {
			return false;
		}
		if ((this.rHDt == null && other.rHDt != null) || (this.rHDt != null && !this.rHDt.equals(other.rHDt))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ReproductiveHistoryPK[ patientId=" + patientId + ", rHDt=" + rHDt + " ]";
	}

}

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
@Embeddable
public class CasePhysicianPK implements Serializable {
	private static final long serialVersionUID = -4190113178154367130L;

	@Basic(optional = false)
	@Column(name = "Case_Id")
	private int caseId;
	@Basic(optional = false)
	@Column(name = "Physician_Id")
	private int physicianId;

	public CasePhysicianPK() {
	}

	public CasePhysicianPK(int caseId, int physicianId) {
		this.caseId = caseId;
		this.physicianId = physicianId;
	}

	public int getCaseId() {
		return caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}

	public int getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(int physicianId) {
		this.physicianId = physicianId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) caseId;
		hash += (int) physicianId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CasePhysicianPK)) {
			return false;
		}
		CasePhysicianPK other = (CasePhysicianPK) object;
		if (this.caseId != other.caseId) {
			return false;
		}
		if (this.physicianId != other.physicianId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CasePhysicianPK[ caseId=" + caseId + ", physicianId=" + physicianId + " ]";
	}

}

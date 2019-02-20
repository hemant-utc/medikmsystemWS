/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "case_physician")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CasePhysician.findAll", query = "SELECT c FROM CasePhysician c") })
public class CasePhysician implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	protected CasePhysicianPK casePhysicianPK;
	@Lob
	@Column(name = "Physican_Notes")
	private String physicanNotes;
	@Column(name = "Dt_First_P_Encounter")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtFirstPEncounter;
	@JoinColumn(name = "Physician_Id", referencedColumnName = "Physician_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Physician physician;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Case1 case1;

	public CasePhysician() {
	}

	public CasePhysician(CasePhysicianPK casePhysicianPK) {
		this.casePhysicianPK = casePhysicianPK;
	}

	public CasePhysician(int caseId, int physicianId) {
		this.casePhysicianPK = new CasePhysicianPK(caseId, physicianId);
	}

	public CasePhysicianPK getCasePhysicianPK() {
		return casePhysicianPK;
	}

	public void setCasePhysicianPK(CasePhysicianPK casePhysicianPK) {
		this.casePhysicianPK = casePhysicianPK;
	}

	public String getPhysicanNotes() {
		return physicanNotes;
	}

	public void setPhysicanNotes(String physicanNotes) {
		this.physicanNotes = physicanNotes;
	}

	public Date getDtFirstPEncounter() {
		return dtFirstPEncounter;
	}

	public void setDtFirstPEncounter(Date dtFirstPEncounter) {
		this.dtFirstPEncounter = dtFirstPEncounter;
	}

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public Case1 getCase1() {
		return case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (casePhysicianPK != null ? casePhysicianPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CasePhysician)) {
			return false;
		}
		CasePhysician other = (CasePhysician) object;
		if ((this.casePhysicianPK == null && other.casePhysicianPK != null)
				|| (this.casePhysicianPK != null && !this.casePhysicianPK.equals(other.casePhysicianPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CasePhysician[ casePhysicianPK=" + casePhysicianPK + " ]";
	}

}

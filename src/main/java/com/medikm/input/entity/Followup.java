/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "followup")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Followup.findAll", query = "SELECT f FROM Followup f") })
public class Followup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private Integer encounterId;
	@Column(name = "Years_Past_Treatment")
	private Short yearsPastTreatment;
	@Column(name = "History_Physical_Months")
	private Short historyPhysicalMonths;
	@Column(name = "Mammogram_months")
	private Short mammogrammonths;
	@Column(name = "Ann_Gynec_Assess_Women_Tamo")
	private Short annGynecAssessWomenTamo;
	@Column(name = "Bone_Mineral_Density")
	private Short boneMineralDensity;
	@Lob
	@Column(name = "Bone_Mineral_Density_Comm")
	private String boneMineralDensityComm;
	@Column(name = "Adherence_Adjuvant_Endocrine_Therapy")
	private Short adherenceAdjuvantEndocrineTherapy;
	@Column(name = "Chest_Wall_Pain")
	private Integer chestWallPain;
	@Column(name = "Dis_Status")
	private Integer disStatus;
	@Column(name = "Clinical_Response")
	private String clinicalResponse;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne
	private Case1 caseId;

	public Followup() {
	}

	public Followup(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Integer getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Short getYearsPastTreatment() {
		return yearsPastTreatment;
	}

	public void setYearsPastTreatment(Short yearsPastTreatment) {
		this.yearsPastTreatment = yearsPastTreatment;
	}

	public Short getHistoryPhysicalMonths() {
		return historyPhysicalMonths;
	}

	public void setHistoryPhysicalMonths(Short historyPhysicalMonths) {
		this.historyPhysicalMonths = historyPhysicalMonths;
	}

	public Short getMammogrammonths() {
		return mammogrammonths;
	}

	public void setMammogrammonths(Short mammogrammonths) {
		this.mammogrammonths = mammogrammonths;
	}

	public Short getAnnGynecAssessWomenTamo() {
		return annGynecAssessWomenTamo;
	}

	public void setAnnGynecAssessWomenTamo(Short annGynecAssessWomenTamo) {
		this.annGynecAssessWomenTamo = annGynecAssessWomenTamo;
	}

	public Short getBoneMineralDensity() {
		return boneMineralDensity;
	}

	public void setBoneMineralDensity(Short boneMineralDensity) {
		this.boneMineralDensity = boneMineralDensity;
	}

	public String getBoneMineralDensityComm() {
		return boneMineralDensityComm;
	}

	public void setBoneMineralDensityComm(String boneMineralDensityComm) {
		this.boneMineralDensityComm = boneMineralDensityComm;
	}

	public Short getAdherenceAdjuvantEndocrineTherapy() {
		return adherenceAdjuvantEndocrineTherapy;
	}

	public void setAdherenceAdjuvantEndocrineTherapy(Short adherenceAdjuvantEndocrineTherapy) {
		this.adherenceAdjuvantEndocrineTherapy = adherenceAdjuvantEndocrineTherapy;
	}

	public Integer getChestWallPain() {
		return chestWallPain;
	}

	public void setChestWallPain(Integer chestWallPain) {
		this.chestWallPain = chestWallPain;
	}

	public Integer getDisStatus() {
		return disStatus;
	}

	public void setDisStatus(Integer disStatus) {
		this.disStatus = disStatus;
	}

	public String getClinicalResponse() {
		return clinicalResponse;
	}

	public void setClinicalResponse(String clinicalResponse) {
		this.clinicalResponse = clinicalResponse;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterId != null ? encounterId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Followup)) {
			return false;
		}
		Followup other = (Followup) object;
		if ((this.encounterId == null && other.encounterId != null)
				|| (this.encounterId != null && !this.encounterId.equals(other.encounterId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Followup[ encounterId=" + encounterId + " ]";
	}

}

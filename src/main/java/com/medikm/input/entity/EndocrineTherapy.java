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
@Table(name = "endocrine_therapy")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EndocrineTherapy.findAll", query = "SELECT e FROM EndocrineTherapy e") })
public class EndocrineTherapy implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected EndocrineTherapyPK endocrineTherapyPK;
	@Column(name = "Endo_Therapy_Start_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endoTherapyStartDt;
	@Column(name = "Endo_Therapy_End_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endoTherapyEndDt;
	@Column(name = "Contraindication_to_Armts_Inhbt_Comm")
	private Short contraindicationtoArmtsInhbtComm;
	@Lob
	@Column(name = "Anastrozole_Safety_Profile")
	private String anastrozoleSafetyProfile;
	@Column(name = "Patient_Declined_Armts_Inhbt")
	private Short patientDeclinedArmtsInhbt;
	@Column(name = "Patietn_Intollerant_to_Armts_Inhbt")
	private Short patietnIntolleranttoArmtsInhbt;
	@Column(name = "Resumption")
	private Short resumption;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "Estradiol_Levels")
	private Double estradiolLevels;
	@Column(name = "FSH_Levels")
	private Double fSHLevels;
	@Column(name = "Enrolled_Clinical_Trial")
	private Short enrolledClinicalTrial;
	@Column(name = "Eligible_Clinical_Trial")
	private Short eligibleClinicalTrial;
	@JoinColumn(name = "Eligible_Clinical_Trial_ID", referencedColumnName = "Clinical_Trial_Id")
	@ManyToOne
	private ClinicalTrial eligibleClinicalTrialID;
	@JoinColumn(name = "Agent_Id", referencedColumnName = "Type_Id")
	@ManyToOne
	private EtAgent agentId;
	@JoinColumn(name = "Episode_Endo_Therapy_Id", referencedColumnName = "Type_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private EndotherapyType endotherapyType;

	@JoinColumn(name = "Enrolled_Clinical_Trial_ID", referencedColumnName = "Clinical_Trial_Id")
	@ManyToOne
	private ClinicalTrial enrolledClinicalTrialID;

	public EndocrineTherapy() {
	}

	public EndocrineTherapy(EndocrineTherapyPK endocrineTherapyPK) {
		this.endocrineTherapyPK = endocrineTherapyPK;
	}

	public EndocrineTherapy(int episodeId, int episodeEndoTherapyId) {
		this.endocrineTherapyPK = new EndocrineTherapyPK(episodeId, episodeEndoTherapyId);
	}

	public EndocrineTherapyPK getEndocrineTherapyPK() {
		return endocrineTherapyPK;
	}

	public void setEndocrineTherapyPK(EndocrineTherapyPK endocrineTherapyPK) {
		this.endocrineTherapyPK = endocrineTherapyPK;
	}

	public Date getEndoTherapyStartDt() {
		return endoTherapyStartDt;
	}

	public void setEndoTherapyStartDt(Date endoTherapyStartDt) {
		this.endoTherapyStartDt = endoTherapyStartDt;
	}

	public Date getEndoTherapyEndDt() {
		return endoTherapyEndDt;
	}

	public void setEndoTherapyEndDt(Date endoTherapyEndDt) {
		this.endoTherapyEndDt = endoTherapyEndDt;
	}

	public Short getContraindicationtoArmtsInhbtComm() {
		return contraindicationtoArmtsInhbtComm;
	}

	public void setContraindicationtoArmtsInhbtComm(Short contraindicationtoArmtsInhbtComm) {
		this.contraindicationtoArmtsInhbtComm = contraindicationtoArmtsInhbtComm;
	}

	public String getAnastrozoleSafetyProfile() {
		return anastrozoleSafetyProfile;
	}

	public void setAnastrozoleSafetyProfile(String anastrozoleSafetyProfile) {
		this.anastrozoleSafetyProfile = anastrozoleSafetyProfile;
	}

	public Short getPatientDeclinedArmtsInhbt() {
		return patientDeclinedArmtsInhbt;
	}

	public void setPatientDeclinedArmtsInhbt(Short patientDeclinedArmtsInhbt) {
		this.patientDeclinedArmtsInhbt = patientDeclinedArmtsInhbt;
	}

	public Short getPatietnIntolleranttoArmtsInhbt() {
		return patietnIntolleranttoArmtsInhbt;
	}

	public void setPatietnIntolleranttoArmtsInhbt(Short patietnIntolleranttoArmtsInhbt) {
		this.patietnIntolleranttoArmtsInhbt = patietnIntolleranttoArmtsInhbt;
	}

	public Short getResumption() {
		return resumption;
	}

	public void setResumption(Short resumption) {
		this.resumption = resumption;
	}

	public Double getEstradiolLevels() {
		return estradiolLevels;
	}

	public void setEstradiolLevels(Double estradiolLevels) {
		this.estradiolLevels = estradiolLevels;
	}

	public Double getFSHLevels() {
		return fSHLevels;
	}

	public void setFSHLevels(Double fSHLevels) {
		this.fSHLevels = fSHLevels;
	}

	public Short getEnrolledClinicalTrial() {
		return enrolledClinicalTrial;
	}

	public void setEnrolledClinicalTrial(Short enrolledClinicalTrial) {
		this.enrolledClinicalTrial = enrolledClinicalTrial;
	}

	public Short getEligibleClinicalTrial() {
		return eligibleClinicalTrial;
	}

	public void setEligibleClinicalTrial(Short eligibleClinicalTrial) {
		this.eligibleClinicalTrial = eligibleClinicalTrial;
	}

	public ClinicalTrial getEligibleClinicalTrialID() {
		return eligibleClinicalTrialID;
	}

	public void setEligibleClinicalTrialID(ClinicalTrial eligibleClinicalTrialID) {
		this.eligibleClinicalTrialID = eligibleClinicalTrialID;
	}

	public EtAgent getAgentId() {
		return agentId;
	}

	public void setAgentId(EtAgent agentId) {
		this.agentId = agentId;
	}

	public EndotherapyType getEndotherapyType() {
		return endotherapyType;
	}

	public void setEndotherapyType(EndotherapyType endotherapyType) {
		this.endotherapyType = endotherapyType;
	}

	public ClinicalTrial getEnrolledClinicalTrialID() {
		return enrolledClinicalTrialID;
	}

	public void setEnrolledClinicalTrialID(ClinicalTrial enrolledClinicalTrialID) {
		this.enrolledClinicalTrialID = enrolledClinicalTrialID;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (endocrineTherapyPK != null ? endocrineTherapyPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EndocrineTherapy)) {
			return false;
		}
		EndocrineTherapy other = (EndocrineTherapy) object;
		if ((this.endocrineTherapyPK == null && other.endocrineTherapyPK != null)
				|| (this.endocrineTherapyPK != null && !this.endocrineTherapyPK.equals(other.endocrineTherapyPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EndocrineTherapy[ endocrineTherapyPK=" + endocrineTherapyPK + " ]";
	}

}

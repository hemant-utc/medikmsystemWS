package com.medikm.dto;

import java.sql.Timestamp;

/**
 * EndocrineTherapy entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EndocrineTherapy implements java.io.Serializable {

	// Fields

	private EndocrineTherapyId id;
	private ClinicalTrial clinicalTrialByEligibleClinicalTrialId;
	private Case1 case1;
	private ClinicalTrial clinicalTrialByEnrolledClinicalTrialId;
	private EtAgent etAgent;
	private Timestamp endoTherapyStartDt;
	private Timestamp endoTherapyEndDt;
	private Short contraindicationToArmtsInhbtComm;
	private String anastrozoleSafetyProfile;
	private Short patientDeclinedArmtsInhbt;
	private Short patietnIntollerantToArmtsInhbt;
	private Short resumption;
	private Double estradiolLevels;
	private Double fshLevels;
	private Short enrolledClinicalTrial;
	private Short eligibleClinicalTrial;

	// Constructors

	/** default constructor */
	public EndocrineTherapy() {
	}

	/** minimal constructor */
	public EndocrineTherapy(EndocrineTherapyId id, Case1 case1) {
		this.id = id;
		this.case1 = case1;
	}

	/** full constructor */
	public EndocrineTherapy(EndocrineTherapyId id, ClinicalTrial clinicalTrialByEligibleClinicalTrialId, Case1 case1,
			ClinicalTrial clinicalTrialByEnrolledClinicalTrialId, EtAgent etAgent, Timestamp endoTherapyStartDt,
			Timestamp endoTherapyEndDt, Short contraindicationToArmtsInhbtComm, String anastrozoleSafetyProfile,
			Short patientDeclinedArmtsInhbt, Short patietnIntollerantToArmtsInhbt, Short resumption,
			Double estradiolLevels, Double fshLevels, Short enrolledClinicalTrial, Short eligibleClinicalTrial) {
		this.id = id;
		this.clinicalTrialByEligibleClinicalTrialId = clinicalTrialByEligibleClinicalTrialId;
		this.case1 = case1;
		this.clinicalTrialByEnrolledClinicalTrialId = clinicalTrialByEnrolledClinicalTrialId;
		this.etAgent = etAgent;
		this.endoTherapyStartDt = endoTherapyStartDt;
		this.endoTherapyEndDt = endoTherapyEndDt;
		this.contraindicationToArmtsInhbtComm = contraindicationToArmtsInhbtComm;
		this.anastrozoleSafetyProfile = anastrozoleSafetyProfile;
		this.patientDeclinedArmtsInhbt = patientDeclinedArmtsInhbt;
		this.patietnIntollerantToArmtsInhbt = patietnIntollerantToArmtsInhbt;
		this.resumption = resumption;
		this.estradiolLevels = estradiolLevels;
		this.fshLevels = fshLevels;
		this.enrolledClinicalTrial = enrolledClinicalTrial;
		this.eligibleClinicalTrial = eligibleClinicalTrial;
	}

	// Property accessors

	public EndocrineTherapyId getId() {
		return this.id;
	}

	public void setId(EndocrineTherapyId id) {
		this.id = id;
	}

	public ClinicalTrial getClinicalTrialByEligibleClinicalTrialId() {
		return this.clinicalTrialByEligibleClinicalTrialId;
	}

	public void setClinicalTrialByEligibleClinicalTrialId(ClinicalTrial clinicalTrialByEligibleClinicalTrialId) {
		this.clinicalTrialByEligibleClinicalTrialId = clinicalTrialByEligibleClinicalTrialId;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public ClinicalTrial getClinicalTrialByEnrolledClinicalTrialId() {
		return this.clinicalTrialByEnrolledClinicalTrialId;
	}

	public void setClinicalTrialByEnrolledClinicalTrialId(ClinicalTrial clinicalTrialByEnrolledClinicalTrialId) {
		this.clinicalTrialByEnrolledClinicalTrialId = clinicalTrialByEnrolledClinicalTrialId;
	}

	public EtAgent getEtAgent() {
		return this.etAgent;
	}

	public void setEtAgent(EtAgent etAgent) {
		this.etAgent = etAgent;
	}

	public Timestamp getEndoTherapyStartDt() {
		return this.endoTherapyStartDt;
	}

	public void setEndoTherapyStartDt(Timestamp endoTherapyStartDt) {
		this.endoTherapyStartDt = endoTherapyStartDt;
	}

	public Timestamp getEndoTherapyEndDt() {
		return this.endoTherapyEndDt;
	}

	public void setEndoTherapyEndDt(Timestamp endoTherapyEndDt) {
		this.endoTherapyEndDt = endoTherapyEndDt;
	}

	public Short getContraindicationToArmtsInhbtComm() {
		return this.contraindicationToArmtsInhbtComm;
	}

	public void setContraindicationToArmtsInhbtComm(Short contraindicationToArmtsInhbtComm) {
		this.contraindicationToArmtsInhbtComm = contraindicationToArmtsInhbtComm;
	}

	public String getAnastrozoleSafetyProfile() {
		return this.anastrozoleSafetyProfile;
	}

	public void setAnastrozoleSafetyProfile(String anastrozoleSafetyProfile) {
		this.anastrozoleSafetyProfile = anastrozoleSafetyProfile;
	}

	public Short getPatientDeclinedArmtsInhbt() {
		return this.patientDeclinedArmtsInhbt;
	}

	public void setPatientDeclinedArmtsInhbt(Short patientDeclinedArmtsInhbt) {
		this.patientDeclinedArmtsInhbt = patientDeclinedArmtsInhbt;
	}

	public Short getPatietnIntollerantToArmtsInhbt() {
		return this.patietnIntollerantToArmtsInhbt;
	}

	public void setPatietnIntollerantToArmtsInhbt(Short patietnIntollerantToArmtsInhbt) {
		this.patietnIntollerantToArmtsInhbt = patietnIntollerantToArmtsInhbt;
	}

	public Short getResumption() {
		return this.resumption;
	}

	public void setResumption(Short resumption) {
		this.resumption = resumption;
	}

	public Double getEstradiolLevels() {
		return this.estradiolLevels;
	}

	public void setEstradiolLevels(Double estradiolLevels) {
		this.estradiolLevels = estradiolLevels;
	}

	public Double getFshLevels() {
		return this.fshLevels;
	}

	public void setFshLevels(Double fshLevels) {
		this.fshLevels = fshLevels;
	}

	public Short getEnrolledClinicalTrial() {
		return this.enrolledClinicalTrial;
	}

	public void setEnrolledClinicalTrial(Short enrolledClinicalTrial) {
		this.enrolledClinicalTrial = enrolledClinicalTrial;
	}

	public Short getEligibleClinicalTrial() {
		return this.eligibleClinicalTrial;
	}

	public void setEligibleClinicalTrial(Short eligibleClinicalTrial) {
		this.eligibleClinicalTrial = eligibleClinicalTrial;
	}

}
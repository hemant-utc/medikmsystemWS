package com.medikm.dto;

import java.sql.Timestamp;

/**
 * RiskReduction entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class RiskReduction implements java.io.Serializable {

	// Fields

	private RiskReductionId id;
	private Case1 case1;
	private RrAgent rrAgent;
	private Short riskReductionConc;
	private String riskReductionCounseling;
	private Timestamp riskReductionCounselingDt;
	private Double lifetimeRiskOfBc;
	private Double modifiedGailModelWomen35YAge;
	private Double bcRisk5yr;
	private Double lifeExpectancy;
	private Short contraToTamoOrRolo;
	private Short patientDesiresRiskRedTherapy;
	private Short riskReductionMastectomyDesired;
	private Short riskRedBilatSalOophDesired;
	private Double benefitRatioTamoxifene;
	private Short baselineGynecologicaAssessment;
	private String baselineGynecologicaAssessmentComm;
	private String clinicalTrial;
	private Short rouFollowUpAsClinicallyIndicated;
	private Short annualGynecologicAssessment;
	private Short visionProblems;
	private Short ophtalmologyExam;
	private Short raloxifeneRelatedSymtoms;
	private Short abnormalVaginalBleeding;
	private Short endometrialCancer;
	private Short endometrialPathologyFound;
	private Short histerectomyEndoPathRelRrTherepy;
	private Short reinRrTherapyFollowHisterectomy;
	private Short rrTherapyDiscontinued;
	private Short rrTherapyResumed;
	private Short rrTherapyComplications;
	private String rrTherapyComplicationsComm;
	private Short prolongedImmobilization;
	private Short rrTherapyDiscontinuedTherapy;

	// Constructors

	/** default constructor */
	public RiskReduction() {
	}

	/** minimal constructor */
	public RiskReduction(RiskReductionId id, Case1 case1) {
		this.id = id;
		this.case1 = case1;
	}

	/** full constructor */
	public RiskReduction(RiskReductionId id, Case1 case1, RrAgent rrAgent, Short riskReductionConc,
			String riskReductionCounseling, Timestamp riskReductionCounselingDt, Double lifetimeRiskOfBc,
			Double modifiedGailModelWomen35YAge, Double bcRisk5yr, Double lifeExpectancy, Short contraToTamoOrRolo,
			Short patientDesiresRiskRedTherapy, Short riskReductionMastectomyDesired, Short riskRedBilatSalOophDesired,
			Double benefitRatioTamoxifene, Short baselineGynecologicaAssessment,
			String baselineGynecologicaAssessmentComm, String clinicalTrial, Short rouFollowUpAsClinicallyIndicated,
			Short annualGynecologicAssessment, Short visionProblems, Short ophtalmologyExam,
			Short raloxifeneRelatedSymtoms, Short abnormalVaginalBleeding, Short endometrialCancer,
			Short endometrialPathologyFound, Short histerectomyEndoPathRelRrTherepy,
			Short reinRrTherapyFollowHisterectomy, Short rrTherapyDiscontinued, Short rrTherapyResumed,
			Short rrTherapyComplications, String rrTherapyComplicationsComm, Short prolongedImmobilization,
			Short rrTherapyDiscontinuedTherapy) {
		this.id = id;
		this.case1 = case1;
		this.rrAgent = rrAgent;
		this.riskReductionConc = riskReductionConc;
		this.riskReductionCounseling = riskReductionCounseling;
		this.riskReductionCounselingDt = riskReductionCounselingDt;
		this.lifetimeRiskOfBc = lifetimeRiskOfBc;
		this.modifiedGailModelWomen35YAge = modifiedGailModelWomen35YAge;
		this.bcRisk5yr = bcRisk5yr;
		this.lifeExpectancy = lifeExpectancy;
		this.contraToTamoOrRolo = contraToTamoOrRolo;
		this.patientDesiresRiskRedTherapy = patientDesiresRiskRedTherapy;
		this.riskReductionMastectomyDesired = riskReductionMastectomyDesired;
		this.riskRedBilatSalOophDesired = riskRedBilatSalOophDesired;
		this.benefitRatioTamoxifene = benefitRatioTamoxifene;
		this.baselineGynecologicaAssessment = baselineGynecologicaAssessment;
		this.baselineGynecologicaAssessmentComm = baselineGynecologicaAssessmentComm;
		this.clinicalTrial = clinicalTrial;
		this.rouFollowUpAsClinicallyIndicated = rouFollowUpAsClinicallyIndicated;
		this.annualGynecologicAssessment = annualGynecologicAssessment;
		this.visionProblems = visionProblems;
		this.ophtalmologyExam = ophtalmologyExam;
		this.raloxifeneRelatedSymtoms = raloxifeneRelatedSymtoms;
		this.abnormalVaginalBleeding = abnormalVaginalBleeding;
		this.endometrialCancer = endometrialCancer;
		this.endometrialPathologyFound = endometrialPathologyFound;
		this.histerectomyEndoPathRelRrTherepy = histerectomyEndoPathRelRrTherepy;
		this.reinRrTherapyFollowHisterectomy = reinRrTherapyFollowHisterectomy;
		this.rrTherapyDiscontinued = rrTherapyDiscontinued;
		this.rrTherapyResumed = rrTherapyResumed;
		this.rrTherapyComplications = rrTherapyComplications;
		this.rrTherapyComplicationsComm = rrTherapyComplicationsComm;
		this.prolongedImmobilization = prolongedImmobilization;
		this.rrTherapyDiscontinuedTherapy = rrTherapyDiscontinuedTherapy;
	}

	// Property accessors

	public RiskReductionId getId() {
		return this.id;
	}

	public void setId(RiskReductionId id) {
		this.id = id;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public RrAgent getRrAgent() {
		return this.rrAgent;
	}

	public void setRrAgent(RrAgent rrAgent) {
		this.rrAgent = rrAgent;
	}

	public Short getRiskReductionConc() {
		return this.riskReductionConc;
	}

	public void setRiskReductionConc(Short riskReductionConc) {
		this.riskReductionConc = riskReductionConc;
	}

	public String getRiskReductionCounseling() {
		return this.riskReductionCounseling;
	}

	public void setRiskReductionCounseling(String riskReductionCounseling) {
		this.riskReductionCounseling = riskReductionCounseling;
	}

	public Timestamp getRiskReductionCounselingDt() {
		return this.riskReductionCounselingDt;
	}

	public void setRiskReductionCounselingDt(Timestamp riskReductionCounselingDt) {
		this.riskReductionCounselingDt = riskReductionCounselingDt;
	}

	public Double getLifetimeRiskOfBc() {
		return this.lifetimeRiskOfBc;
	}

	public void setLifetimeRiskOfBc(Double lifetimeRiskOfBc) {
		this.lifetimeRiskOfBc = lifetimeRiskOfBc;
	}

	public Double getModifiedGailModelWomen35YAge() {
		return this.modifiedGailModelWomen35YAge;
	}

	public void setModifiedGailModelWomen35YAge(Double modifiedGailModelWomen35YAge) {
		this.modifiedGailModelWomen35YAge = modifiedGailModelWomen35YAge;
	}

	public Double getBcRisk5yr() {
		return this.bcRisk5yr;
	}

	public void setBcRisk5yr(Double bcRisk5yr) {
		this.bcRisk5yr = bcRisk5yr;
	}

	public Double getLifeExpectancy() {
		return this.lifeExpectancy;
	}

	public void setLifeExpectancy(Double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Short getContraToTamoOrRolo() {
		return this.contraToTamoOrRolo;
	}

	public void setContraToTamoOrRolo(Short contraToTamoOrRolo) {
		this.contraToTamoOrRolo = contraToTamoOrRolo;
	}

	public Short getPatientDesiresRiskRedTherapy() {
		return this.patientDesiresRiskRedTherapy;
	}

	public void setPatientDesiresRiskRedTherapy(Short patientDesiresRiskRedTherapy) {
		this.patientDesiresRiskRedTherapy = patientDesiresRiskRedTherapy;
	}

	public Short getRiskReductionMastectomyDesired() {
		return this.riskReductionMastectomyDesired;
	}

	public void setRiskReductionMastectomyDesired(Short riskReductionMastectomyDesired) {
		this.riskReductionMastectomyDesired = riskReductionMastectomyDesired;
	}

	public Short getRiskRedBilatSalOophDesired() {
		return this.riskRedBilatSalOophDesired;
	}

	public void setRiskRedBilatSalOophDesired(Short riskRedBilatSalOophDesired) {
		this.riskRedBilatSalOophDesired = riskRedBilatSalOophDesired;
	}

	public Double getBenefitRatioTamoxifene() {
		return this.benefitRatioTamoxifene;
	}

	public void setBenefitRatioTamoxifene(Double benefitRatioTamoxifene) {
		this.benefitRatioTamoxifene = benefitRatioTamoxifene;
	}

	public Short getBaselineGynecologicaAssessment() {
		return this.baselineGynecologicaAssessment;
	}

	public void setBaselineGynecologicaAssessment(Short baselineGynecologicaAssessment) {
		this.baselineGynecologicaAssessment = baselineGynecologicaAssessment;
	}

	public String getBaselineGynecologicaAssessmentComm() {
		return this.baselineGynecologicaAssessmentComm;
	}

	public void setBaselineGynecologicaAssessmentComm(String baselineGynecologicaAssessmentComm) {
		this.baselineGynecologicaAssessmentComm = baselineGynecologicaAssessmentComm;
	}

	public String getClinicalTrial() {
		return this.clinicalTrial;
	}

	public void setClinicalTrial(String clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}

	public Short getRouFollowUpAsClinicallyIndicated() {
		return this.rouFollowUpAsClinicallyIndicated;
	}

	public void setRouFollowUpAsClinicallyIndicated(Short rouFollowUpAsClinicallyIndicated) {
		this.rouFollowUpAsClinicallyIndicated = rouFollowUpAsClinicallyIndicated;
	}

	public Short getAnnualGynecologicAssessment() {
		return this.annualGynecologicAssessment;
	}

	public void setAnnualGynecologicAssessment(Short annualGynecologicAssessment) {
		this.annualGynecologicAssessment = annualGynecologicAssessment;
	}

	public Short getVisionProblems() {
		return this.visionProblems;
	}

	public void setVisionProblems(Short visionProblems) {
		this.visionProblems = visionProblems;
	}

	public Short getOphtalmologyExam() {
		return this.ophtalmologyExam;
	}

	public void setOphtalmologyExam(Short ophtalmologyExam) {
		this.ophtalmologyExam = ophtalmologyExam;
	}

	public Short getRaloxifeneRelatedSymtoms() {
		return this.raloxifeneRelatedSymtoms;
	}

	public void setRaloxifeneRelatedSymtoms(Short raloxifeneRelatedSymtoms) {
		this.raloxifeneRelatedSymtoms = raloxifeneRelatedSymtoms;
	}

	public Short getAbnormalVaginalBleeding() {
		return this.abnormalVaginalBleeding;
	}

	public void setAbnormalVaginalBleeding(Short abnormalVaginalBleeding) {
		this.abnormalVaginalBleeding = abnormalVaginalBleeding;
	}

	public Short getEndometrialCancer() {
		return this.endometrialCancer;
	}

	public void setEndometrialCancer(Short endometrialCancer) {
		this.endometrialCancer = endometrialCancer;
	}

	public Short getEndometrialPathologyFound() {
		return this.endometrialPathologyFound;
	}

	public void setEndometrialPathologyFound(Short endometrialPathologyFound) {
		this.endometrialPathologyFound = endometrialPathologyFound;
	}

	public Short getHisterectomyEndoPathRelRrTherepy() {
		return this.histerectomyEndoPathRelRrTherepy;
	}

	public void setHisterectomyEndoPathRelRrTherepy(Short histerectomyEndoPathRelRrTherepy) {
		this.histerectomyEndoPathRelRrTherepy = histerectomyEndoPathRelRrTherepy;
	}

	public Short getReinRrTherapyFollowHisterectomy() {
		return this.reinRrTherapyFollowHisterectomy;
	}

	public void setReinRrTherapyFollowHisterectomy(Short reinRrTherapyFollowHisterectomy) {
		this.reinRrTherapyFollowHisterectomy = reinRrTherapyFollowHisterectomy;
	}

	public Short getRrTherapyDiscontinued() {
		return this.rrTherapyDiscontinued;
	}

	public void setRrTherapyDiscontinued(Short rrTherapyDiscontinued) {
		this.rrTherapyDiscontinued = rrTherapyDiscontinued;
	}

	public Short getRrTherapyResumed() {
		return this.rrTherapyResumed;
	}

	public void setRrTherapyResumed(Short rrTherapyResumed) {
		this.rrTherapyResumed = rrTherapyResumed;
	}

	public Short getRrTherapyComplications() {
		return this.rrTherapyComplications;
	}

	public void setRrTherapyComplications(Short rrTherapyComplications) {
		this.rrTherapyComplications = rrTherapyComplications;
	}

	public String getRrTherapyComplicationsComm() {
		return this.rrTherapyComplicationsComm;
	}

	public void setRrTherapyComplicationsComm(String rrTherapyComplicationsComm) {
		this.rrTherapyComplicationsComm = rrTherapyComplicationsComm;
	}

	public Short getProlongedImmobilization() {
		return this.prolongedImmobilization;
	}

	public void setProlongedImmobilization(Short prolongedImmobilization) {
		this.prolongedImmobilization = prolongedImmobilization;
	}

	public Short getRrTherapyDiscontinuedTherapy() {
		return this.rrTherapyDiscontinuedTherapy;
	}

	public void setRrTherapyDiscontinuedTherapy(Short rrTherapyDiscontinuedTherapy) {
		this.rrTherapyDiscontinuedTherapy = rrTherapyDiscontinuedTherapy;
	}

}
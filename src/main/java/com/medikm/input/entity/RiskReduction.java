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
@Table(name = "risk_reduction")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "RiskReduction.findAll", query = "SELECT r FROM RiskReduction r") })
public class RiskReduction implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected RiskReductionPK riskReductionPK;
	@Column(name = "Risk_Reduction_Conc")
	private Short riskReductionConc;
	@Lob
	@Column(name = "Risk_Reduction_Counseling")
	private String riskReductionCounseling;
	@Column(name = "Risk_Reduction_Counseling_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date riskReductionCounselingDt;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "Lifetime_Risk_of_BC")
	private Double lifetimeRiskofBC;
	@Column(name = "Modified_Gail_Model_Women_35_y_Age")
	private Double modifiedGailModelWomen35yAge;
	@Column(name = "BC_Risk_5yr")
	private Double bCRisk5yr;
	@Column(name = "Life_Expectancy")
	private Double lifeExpectancy;
	@Column(name = "Contra_To_Tamo_Or_Rolo")
	private Short contraToTamoOrRolo;
	@Column(name = "Patient_Desires_Risk_Red_Therapy")
	private Short patientDesiresRiskRedTherapy;
	@Column(name = "Risk_Reduction_Mastectomy_Desired")
	private Short riskReductionMastectomyDesired;
	@Column(name = "Risk_Red_Bilat_Sal_Ooph_Desired")
	private Short riskRedBilatSalOophDesired;
	@Column(name = "Benefit_Ratio_Tamoxifene")
	private Double benefitRatioTamoxifene;
	@Column(name = "Baseline_Gynecologica_Assessment")
	private Short baselineGynecologicaAssessment;
	@Lob
	@Column(name = "Baseline_Gynecologica_Assessment_Comm")
	private String baselineGynecologicaAssessmentComm;
	@Column(name = "Clinical_Trial")
	private String clinicalTrial;
	@Column(name = "Rou_FollowUp_As_Clinically_Indicated")
	private Short rouFollowUpAsClinicallyIndicated;
	@Column(name = "Annual_Gynecologic_Assessment")
	private Short annualGynecologicAssessment;
	@Column(name = "Vision_Problems")
	private Short visionProblems;
	@Column(name = "Ophtalmology_Exam")
	private Short ophtalmologyExam;
	@Column(name = "Raloxifene_Related_Symtoms")
	private Short raloxifeneRelatedSymtoms;
	@Column(name = "Abnormal_Vaginal_Bleeding")
	private Short abnormalVaginalBleeding;
	@Column(name = "Endometrial_Cancer")
	private Short endometrialCancer;
	@Column(name = "Endometrial_Pathology_Found")
	private Short endometrialPathologyFound;
	@Column(name = "Histerectomy_Endo_Path_Rel_RR_Therepy")
	private Short histerectomyEndoPathRelRRTherepy;
	@Column(name = "Rein_RR_Therapy_Follow_Histerectomy")
	private Short reinRRTherapyFollowHisterectomy;
	@Column(name = "RR_Therapy_Discontinued")
	private Short rRTherapyDiscontinued;
	@Column(name = "RR_Therapy_Resumed")
	private Short rRTherapyResumed;
	@Column(name = "RR_Therapy_Complications")
	private Short rRTherapyComplications;
	@Lob
	@Column(name = "RR_Therapy_Complications_Comm")
	private String rRTherapyComplicationsComm;
	@Column(name = "Prolonged_Immobilization")
	private Short prolongedImmobilization;
	@Column(name = "RR_Therapy_Discontinued_Therapy")
	private Short rRTherapyDiscontinuedTherapy;
	@JoinColumn(name = "Risk_Reduction_Agent_Id", referencedColumnName = "Agent_Id")
	@ManyToOne
	private RrAgent riskReductionAgentId;

	public RiskReduction() {
	}

	public RiskReduction(RiskReductionPK riskReductionPK) {
		this.riskReductionPK = riskReductionPK;
	}

	public RiskReduction(int rRStrategyId, int episodeId) {
		this.riskReductionPK = new RiskReductionPK(rRStrategyId, episodeId);
	}

	public RiskReductionPK getRiskReductionPK() {
		return riskReductionPK;
	}

	public void setRiskReductionPK(RiskReductionPK riskReductionPK) {
		this.riskReductionPK = riskReductionPK;
	}

	public Short getRiskReductionConc() {
		return riskReductionConc;
	}

	public void setRiskReductionConc(Short riskReductionConc) {
		this.riskReductionConc = riskReductionConc;
	}

	public String getRiskReductionCounseling() {
		return riskReductionCounseling;
	}

	public void setRiskReductionCounseling(String riskReductionCounseling) {
		this.riskReductionCounseling = riskReductionCounseling;
	}

	public Date getRiskReductionCounselingDt() {
		return riskReductionCounselingDt;
	}

	public void setRiskReductionCounselingDt(Date riskReductionCounselingDt) {
		this.riskReductionCounselingDt = riskReductionCounselingDt;
	}

	public Double getLifetimeRiskofBC() {
		return lifetimeRiskofBC;
	}

	public void setLifetimeRiskofBC(Double lifetimeRiskofBC) {
		this.lifetimeRiskofBC = lifetimeRiskofBC;
	}

	public Double getModifiedGailModelWomen35yAge() {
		return modifiedGailModelWomen35yAge;
	}

	public void setModifiedGailModelWomen35yAge(Double modifiedGailModelWomen35yAge) {
		this.modifiedGailModelWomen35yAge = modifiedGailModelWomen35yAge;
	}

	public Double getBCRisk5yr() {
		return bCRisk5yr;
	}

	public void setBCRisk5yr(Double bCRisk5yr) {
		this.bCRisk5yr = bCRisk5yr;
	}

	public Double getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(Double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Short getContraToTamoOrRolo() {
		return contraToTamoOrRolo;
	}

	public void setContraToTamoOrRolo(Short contraToTamoOrRolo) {
		this.contraToTamoOrRolo = contraToTamoOrRolo;
	}

	public Short getPatientDesiresRiskRedTherapy() {
		return patientDesiresRiskRedTherapy;
	}

	public void setPatientDesiresRiskRedTherapy(Short patientDesiresRiskRedTherapy) {
		this.patientDesiresRiskRedTherapy = patientDesiresRiskRedTherapy;
	}

	public Short getRiskReductionMastectomyDesired() {
		return riskReductionMastectomyDesired;
	}

	public void setRiskReductionMastectomyDesired(Short riskReductionMastectomyDesired) {
		this.riskReductionMastectomyDesired = riskReductionMastectomyDesired;
	}

	public Short getRiskRedBilatSalOophDesired() {
		return riskRedBilatSalOophDesired;
	}

	public void setRiskRedBilatSalOophDesired(Short riskRedBilatSalOophDesired) {
		this.riskRedBilatSalOophDesired = riskRedBilatSalOophDesired;
	}

	public Double getBenefitRatioTamoxifene() {
		return benefitRatioTamoxifene;
	}

	public void setBenefitRatioTamoxifene(Double benefitRatioTamoxifene) {
		this.benefitRatioTamoxifene = benefitRatioTamoxifene;
	}

	public Short getBaselineGynecologicaAssessment() {
		return baselineGynecologicaAssessment;
	}

	public void setBaselineGynecologicaAssessment(Short baselineGynecologicaAssessment) {
		this.baselineGynecologicaAssessment = baselineGynecologicaAssessment;
	}

	public String getBaselineGynecologicaAssessmentComm() {
		return baselineGynecologicaAssessmentComm;
	}

	public void setBaselineGynecologicaAssessmentComm(String baselineGynecologicaAssessmentComm) {
		this.baselineGynecologicaAssessmentComm = baselineGynecologicaAssessmentComm;
	}

	public String getClinicalTrial() {
		return clinicalTrial;
	}

	public void setClinicalTrial(String clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}

	public Short getRouFollowUpAsClinicallyIndicated() {
		return rouFollowUpAsClinicallyIndicated;
	}

	public void setRouFollowUpAsClinicallyIndicated(Short rouFollowUpAsClinicallyIndicated) {
		this.rouFollowUpAsClinicallyIndicated = rouFollowUpAsClinicallyIndicated;
	}

	public Short getAnnualGynecologicAssessment() {
		return annualGynecologicAssessment;
	}

	public void setAnnualGynecologicAssessment(Short annualGynecologicAssessment) {
		this.annualGynecologicAssessment = annualGynecologicAssessment;
	}

	public Short getVisionProblems() {
		return visionProblems;
	}

	public void setVisionProblems(Short visionProblems) {
		this.visionProblems = visionProblems;
	}

	public Short getOphtalmologyExam() {
		return ophtalmologyExam;
	}

	public void setOphtalmologyExam(Short ophtalmologyExam) {
		this.ophtalmologyExam = ophtalmologyExam;
	}

	public Short getRaloxifeneRelatedSymtoms() {
		return raloxifeneRelatedSymtoms;
	}

	public void setRaloxifeneRelatedSymtoms(Short raloxifeneRelatedSymtoms) {
		this.raloxifeneRelatedSymtoms = raloxifeneRelatedSymtoms;
	}

	public Short getAbnormalVaginalBleeding() {
		return abnormalVaginalBleeding;
	}

	public void setAbnormalVaginalBleeding(Short abnormalVaginalBleeding) {
		this.abnormalVaginalBleeding = abnormalVaginalBleeding;
	}

	public Short getEndometrialCancer() {
		return endometrialCancer;
	}

	public void setEndometrialCancer(Short endometrialCancer) {
		this.endometrialCancer = endometrialCancer;
	}

	public Short getEndometrialPathologyFound() {
		return endometrialPathologyFound;
	}

	public void setEndometrialPathologyFound(Short endometrialPathologyFound) {
		this.endometrialPathologyFound = endometrialPathologyFound;
	}

	public Short getHisterectomyEndoPathRelRRTherepy() {
		return histerectomyEndoPathRelRRTherepy;
	}

	public void setHisterectomyEndoPathRelRRTherepy(Short histerectomyEndoPathRelRRTherepy) {
		this.histerectomyEndoPathRelRRTherepy = histerectomyEndoPathRelRRTherepy;
	}

	public Short getReinRRTherapyFollowHisterectomy() {
		return reinRRTherapyFollowHisterectomy;
	}

	public void setReinRRTherapyFollowHisterectomy(Short reinRRTherapyFollowHisterectomy) {
		this.reinRRTherapyFollowHisterectomy = reinRRTherapyFollowHisterectomy;
	}

	public Short getRRTherapyDiscontinued() {
		return rRTherapyDiscontinued;
	}

	public void setRRTherapyDiscontinued(Short rRTherapyDiscontinued) {
		this.rRTherapyDiscontinued = rRTherapyDiscontinued;
	}

	public Short getRRTherapyResumed() {
		return rRTherapyResumed;
	}

	public void setRRTherapyResumed(Short rRTherapyResumed) {
		this.rRTherapyResumed = rRTherapyResumed;
	}

	public Short getRRTherapyComplications() {
		return rRTherapyComplications;
	}

	public void setRRTherapyComplications(Short rRTherapyComplications) {
		this.rRTherapyComplications = rRTherapyComplications;
	}

	public String getRRTherapyComplicationsComm() {
		return rRTherapyComplicationsComm;
	}

	public void setRRTherapyComplicationsComm(String rRTherapyComplicationsComm) {
		this.rRTherapyComplicationsComm = rRTherapyComplicationsComm;
	}

	public Short getProlongedImmobilization() {
		return prolongedImmobilization;
	}

	public void setProlongedImmobilization(Short prolongedImmobilization) {
		this.prolongedImmobilization = prolongedImmobilization;
	}

	public Short getRRTherapyDiscontinuedTherapy() {
		return rRTherapyDiscontinuedTherapy;
	}

	public void setRRTherapyDiscontinuedTherapy(Short rRTherapyDiscontinuedTherapy) {
		this.rRTherapyDiscontinuedTherapy = rRTherapyDiscontinuedTherapy;
	}

	public RrAgent getRiskReductionAgentId() {
		return riskReductionAgentId;
	}

	public void setRiskReductionAgentId(RrAgent riskReductionAgentId) {
		this.riskReductionAgentId = riskReductionAgentId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (riskReductionPK != null ? riskReductionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RiskReduction)) {
			return false;
		}
		RiskReduction other = (RiskReduction) object;
		if ((this.riskReductionPK == null && other.riskReductionPK != null)
				|| (this.riskReductionPK != null && !this.riskReductionPK.equals(other.riskReductionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.RiskReduction[ riskReductionPK=" + riskReductionPK + " ]";
	}

}

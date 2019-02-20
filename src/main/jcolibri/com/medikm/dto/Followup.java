package com.medikm.dto;

/**
 * Followup entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Followup implements java.io.Serializable {

	// Fields

	private Integer encounterId;
	private Case1 case1;
	private Encounter encounter;
	private Short yearsPastTreatment;
	private Short historyPhysicalMonths;
	private Short mammogramMonths;
	private Short annGynecAssessWomenTamo;
	private Short boneMineralDensity;
	private String boneMineralDensityComm;
	private Short adherenceAdjuvantEndocrineTherapy;
	private Integer chestWallPain;
	private Integer disStatus;
	private String clinicalResponse;

	// Constructors

	/** default constructor */
	public Followup() {
	}

	/** minimal constructor */
	public Followup(Integer encounterId, Encounter encounter) {
		this.encounterId = encounterId;
		this.encounter = encounter;
	}

	/** full constructor */
	public Followup(Integer encounterId, Case1 case1, Encounter encounter, Short yearsPastTreatment,
			Short historyPhysicalMonths, Short mammogramMonths, Short annGynecAssessWomenTamo, Short boneMineralDensity,
			String boneMineralDensityComm, Short adherenceAdjuvantEndocrineTherapy, Integer chestWallPain,
			Integer disStatus, String clinicalResponse) {
		this.encounterId = encounterId;
		this.case1 = case1;
		this.encounter = encounter;
		this.yearsPastTreatment = yearsPastTreatment;
		this.historyPhysicalMonths = historyPhysicalMonths;
		this.mammogramMonths = mammogramMonths;
		this.annGynecAssessWomenTamo = annGynecAssessWomenTamo;
		this.boneMineralDensity = boneMineralDensity;
		this.boneMineralDensityComm = boneMineralDensityComm;
		this.adherenceAdjuvantEndocrineTherapy = adherenceAdjuvantEndocrineTherapy;
		this.chestWallPain = chestWallPain;
		this.disStatus = disStatus;
		this.clinicalResponse = clinicalResponse;
	}

	// Property accessors

	public Integer getEncounterId() {
		return this.encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public Short getYearsPastTreatment() {
		return this.yearsPastTreatment;
	}

	public void setYearsPastTreatment(Short yearsPastTreatment) {
		this.yearsPastTreatment = yearsPastTreatment;
	}

	public Short getHistoryPhysicalMonths() {
		return this.historyPhysicalMonths;
	}

	public void setHistoryPhysicalMonths(Short historyPhysicalMonths) {
		this.historyPhysicalMonths = historyPhysicalMonths;
	}

	public Short getMammogramMonths() {
		return this.mammogramMonths;
	}

	public void setMammogramMonths(Short mammogramMonths) {
		this.mammogramMonths = mammogramMonths;
	}

	public Short getAnnGynecAssessWomenTamo() {
		return this.annGynecAssessWomenTamo;
	}

	public void setAnnGynecAssessWomenTamo(Short annGynecAssessWomenTamo) {
		this.annGynecAssessWomenTamo = annGynecAssessWomenTamo;
	}

	public Short getBoneMineralDensity() {
		return this.boneMineralDensity;
	}

	public void setBoneMineralDensity(Short boneMineralDensity) {
		this.boneMineralDensity = boneMineralDensity;
	}

	public String getBoneMineralDensityComm() {
		return this.boneMineralDensityComm;
	}

	public void setBoneMineralDensityComm(String boneMineralDensityComm) {
		this.boneMineralDensityComm = boneMineralDensityComm;
	}

	public Short getAdherenceAdjuvantEndocrineTherapy() {
		return this.adherenceAdjuvantEndocrineTherapy;
	}

	public void setAdherenceAdjuvantEndocrineTherapy(Short adherenceAdjuvantEndocrineTherapy) {
		this.adherenceAdjuvantEndocrineTherapy = adherenceAdjuvantEndocrineTherapy;
	}

	public Integer getChestWallPain() {
		return this.chestWallPain;
	}

	public void setChestWallPain(Integer chestWallPain) {
		this.chestWallPain = chestWallPain;
	}

	public Integer getDisStatus() {
		return this.disStatus;
	}

	public void setDisStatus(Integer disStatus) {
		this.disStatus = disStatus;
	}

	public String getClinicalResponse() {
		return this.clinicalResponse;
	}

	public void setClinicalResponse(String clinicalResponse) {
		this.clinicalResponse = clinicalResponse;
	}

}
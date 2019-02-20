package com.medikm.dto;

import java.sql.Timestamp;

/**
 * RadiationTherapy entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class RadiationTherapy implements java.io.Serializable {

	// Fields

	private RadiationTherapyId id;
	private Case1 case1;
	private ChestWallRadType chestWallRadType;
	private RtModality rtModality;
	private Timestamp radOncConsultDt;
	private Short clinicalAssessment;
	private Short ctBaseTreatmentPlanning;
	private String doseDistribution;
	private String beamArramgement;
	private String rtArea;
	private Double fractionDose;
	private Double totalBreastDose;
	private Short boostTumorBed;
	private String boostTumorBedType;
	private Double boostTumorBedDose;
	private Short chestWallRad;
	private Short ctBasedChestWallRadPlan;
	private Short regionalNodalRad;
	private Short ctBasedRegNodalRadPlan;
	private Double regNodalRadTotalDose;
	private Integer regNodalRadNoFraction;
	private Timestamp rtStartDt;
	private Timestamp rtEndDt;
	private Integer noRtVisits;
	private Integer elapsedDays;
	private String lymphedema;
	private Timestamp lymphedemaAppearanceDate;
	private Short candidateMammosite;
	private Short tissueExpansion;
	private Short complImmedReconstFollowRt;
	private String intendedBenefitRthera;
	private String rtReasonStop;

	// Constructors

	/** default constructor */
	public RadiationTherapy() {
	}

	/** minimal constructor */
	public RadiationTherapy(RadiationTherapyId id, Case1 case1) {
		this.id = id;
		this.case1 = case1;
	}

	/** full constructor */
	public RadiationTherapy(RadiationTherapyId id, Case1 case1, ChestWallRadType chestWallRadType,
			RtModality rtModality, Timestamp radOncConsultDt, Short clinicalAssessment, Short ctBaseTreatmentPlanning,
			String doseDistribution, String beamArramgement, String rtArea, Double fractionDose, Double totalBreastDose,
			Short boostTumorBed, String boostTumorBedType, Double boostTumorBedDose, Short chestWallRad,
			Short ctBasedChestWallRadPlan, Short regionalNodalRad, Short ctBasedRegNodalRadPlan,
			Double regNodalRadTotalDose, Integer regNodalRadNoFraction, Timestamp rtStartDt, Timestamp rtEndDt,
			Integer noRtVisits, Integer elapsedDays, String lymphedema, Timestamp lymphedemaAppearanceDate,
			Short candidateMammosite, Short tissueExpansion, Short complImmedReconstFollowRt,
			String intendedBenefitRthera, String rtReasonStop) {
		this.id = id;
		this.case1 = case1;
		this.chestWallRadType = chestWallRadType;
		this.rtModality = rtModality;
		this.radOncConsultDt = radOncConsultDt;
		this.clinicalAssessment = clinicalAssessment;
		this.ctBaseTreatmentPlanning = ctBaseTreatmentPlanning;
		this.doseDistribution = doseDistribution;
		this.beamArramgement = beamArramgement;
		this.rtArea = rtArea;
		this.fractionDose = fractionDose;
		this.totalBreastDose = totalBreastDose;
		this.boostTumorBed = boostTumorBed;
		this.boostTumorBedType = boostTumorBedType;
		this.boostTumorBedDose = boostTumorBedDose;
		this.chestWallRad = chestWallRad;
		this.ctBasedChestWallRadPlan = ctBasedChestWallRadPlan;
		this.regionalNodalRad = regionalNodalRad;
		this.ctBasedRegNodalRadPlan = ctBasedRegNodalRadPlan;
		this.regNodalRadTotalDose = regNodalRadTotalDose;
		this.regNodalRadNoFraction = regNodalRadNoFraction;
		this.rtStartDt = rtStartDt;
		this.rtEndDt = rtEndDt;
		this.noRtVisits = noRtVisits;
		this.elapsedDays = elapsedDays;
		this.lymphedema = lymphedema;
		this.lymphedemaAppearanceDate = lymphedemaAppearanceDate;
		this.candidateMammosite = candidateMammosite;
		this.tissueExpansion = tissueExpansion;
		this.complImmedReconstFollowRt = complImmedReconstFollowRt;
		this.intendedBenefitRthera = intendedBenefitRthera;
		this.rtReasonStop = rtReasonStop;
	}

	// Property accessors

	public RadiationTherapyId getId() {
		return this.id;
	}

	public void setId(RadiationTherapyId id) {
		this.id = id;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public ChestWallRadType getChestWallRadType() {
		return this.chestWallRadType;
	}

	public void setChestWallRadType(ChestWallRadType chestWallRadType) {
		this.chestWallRadType = chestWallRadType;
	}

	public RtModality getRtModality() {
		return this.rtModality;
	}

	public void setRtModality(RtModality rtModality) {
		this.rtModality = rtModality;
	}

	public Timestamp getRadOncConsultDt() {
		return this.radOncConsultDt;
	}

	public void setRadOncConsultDt(Timestamp radOncConsultDt) {
		this.radOncConsultDt = radOncConsultDt;
	}

	public Short getClinicalAssessment() {
		return this.clinicalAssessment;
	}

	public void setClinicalAssessment(Short clinicalAssessment) {
		this.clinicalAssessment = clinicalAssessment;
	}

	public Short getCtBaseTreatmentPlanning() {
		return this.ctBaseTreatmentPlanning;
	}

	public void setCtBaseTreatmentPlanning(Short ctBaseTreatmentPlanning) {
		this.ctBaseTreatmentPlanning = ctBaseTreatmentPlanning;
	}

	public String getDoseDistribution() {
		return this.doseDistribution;
	}

	public void setDoseDistribution(String doseDistribution) {
		this.doseDistribution = doseDistribution;
	}

	public String getBeamArramgement() {
		return this.beamArramgement;
	}

	public void setBeamArramgement(String beamArramgement) {
		this.beamArramgement = beamArramgement;
	}

	public String getRtArea() {
		return this.rtArea;
	}

	public void setRtArea(String rtArea) {
		this.rtArea = rtArea;
	}

	public Double getFractionDose() {
		return this.fractionDose;
	}

	public void setFractionDose(Double fractionDose) {
		this.fractionDose = fractionDose;
	}

	public Double getTotalBreastDose() {
		return this.totalBreastDose;
	}

	public void setTotalBreastDose(Double totalBreastDose) {
		this.totalBreastDose = totalBreastDose;
	}

	public Short getBoostTumorBed() {
		return this.boostTumorBed;
	}

	public void setBoostTumorBed(Short boostTumorBed) {
		this.boostTumorBed = boostTumorBed;
	}

	public String getBoostTumorBedType() {
		return this.boostTumorBedType;
	}

	public void setBoostTumorBedType(String boostTumorBedType) {
		this.boostTumorBedType = boostTumorBedType;
	}

	public Double getBoostTumorBedDose() {
		return this.boostTumorBedDose;
	}

	public void setBoostTumorBedDose(Double boostTumorBedDose) {
		this.boostTumorBedDose = boostTumorBedDose;
	}

	public Short getChestWallRad() {
		return this.chestWallRad;
	}

	public void setChestWallRad(Short chestWallRad) {
		this.chestWallRad = chestWallRad;
	}

	public Short getCtBasedChestWallRadPlan() {
		return this.ctBasedChestWallRadPlan;
	}

	public void setCtBasedChestWallRadPlan(Short ctBasedChestWallRadPlan) {
		this.ctBasedChestWallRadPlan = ctBasedChestWallRadPlan;
	}

	public Short getRegionalNodalRad() {
		return this.regionalNodalRad;
	}

	public void setRegionalNodalRad(Short regionalNodalRad) {
		this.regionalNodalRad = regionalNodalRad;
	}

	public Short getCtBasedRegNodalRadPlan() {
		return this.ctBasedRegNodalRadPlan;
	}

	public void setCtBasedRegNodalRadPlan(Short ctBasedRegNodalRadPlan) {
		this.ctBasedRegNodalRadPlan = ctBasedRegNodalRadPlan;
	}

	public Double getRegNodalRadTotalDose() {
		return this.regNodalRadTotalDose;
	}

	public void setRegNodalRadTotalDose(Double regNodalRadTotalDose) {
		this.regNodalRadTotalDose = regNodalRadTotalDose;
	}

	public Integer getRegNodalRadNoFraction() {
		return this.regNodalRadNoFraction;
	}

	public void setRegNodalRadNoFraction(Integer regNodalRadNoFraction) {
		this.regNodalRadNoFraction = regNodalRadNoFraction;
	}

	public Timestamp getRtStartDt() {
		return this.rtStartDt;
	}

	public void setRtStartDt(Timestamp rtStartDt) {
		this.rtStartDt = rtStartDt;
	}

	public Timestamp getRtEndDt() {
		return this.rtEndDt;
	}

	public void setRtEndDt(Timestamp rtEndDt) {
		this.rtEndDt = rtEndDt;
	}

	public Integer getNoRtVisits() {
		return this.noRtVisits;
	}

	public void setNoRtVisits(Integer noRtVisits) {
		this.noRtVisits = noRtVisits;
	}

	public Integer getElapsedDays() {
		return this.elapsedDays;
	}

	public void setElapsedDays(Integer elapsedDays) {
		this.elapsedDays = elapsedDays;
	}

	public String getLymphedema() {
		return this.lymphedema;
	}

	public void setLymphedema(String lymphedema) {
		this.lymphedema = lymphedema;
	}

	public Timestamp getLymphedemaAppearanceDate() {
		return this.lymphedemaAppearanceDate;
	}

	public void setLymphedemaAppearanceDate(Timestamp lymphedemaAppearanceDate) {
		this.lymphedemaAppearanceDate = lymphedemaAppearanceDate;
	}

	public Short getCandidateMammosite() {
		return this.candidateMammosite;
	}

	public void setCandidateMammosite(Short candidateMammosite) {
		this.candidateMammosite = candidateMammosite;
	}

	public Short getTissueExpansion() {
		return this.tissueExpansion;
	}

	public void setTissueExpansion(Short tissueExpansion) {
		this.tissueExpansion = tissueExpansion;
	}

	public Short getComplImmedReconstFollowRt() {
		return this.complImmedReconstFollowRt;
	}

	public void setComplImmedReconstFollowRt(Short complImmedReconstFollowRt) {
		this.complImmedReconstFollowRt = complImmedReconstFollowRt;
	}

	public String getIntendedBenefitRthera() {
		return this.intendedBenefitRthera;
	}

	public void setIntendedBenefitRthera(String intendedBenefitRthera) {
		this.intendedBenefitRthera = intendedBenefitRthera;
	}

	public String getRtReasonStop() {
		return this.rtReasonStop;
	}

	public void setRtReasonStop(String rtReasonStop) {
		this.rtReasonStop = rtReasonStop;
	}

}
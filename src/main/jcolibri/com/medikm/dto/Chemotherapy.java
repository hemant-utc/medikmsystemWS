package com.medikm.dto;

import java.sql.Timestamp;

/**
 * Chemotherapy entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Chemotherapy implements java.io.Serializable {

	// Fields

	private ChemotherapyId id;
	private ClinicalTrial clinicalTrialByEligibleClinicalTrialId;
	private Case1 case1;
	private ChemoAgent chemoAgent;
	private ChemoProtocol chemoProtocol;
	private ClinicalTrial clinicalTrialByEnrolledClinicalTrialId;
	private Short baseLineMegaScan;
	private String baseLineMegaScanComm;
	private Double pretreatmentWeight;
	private Double postTreatmentWeight;
	private Timestamp startDtCtpy;
	private Timestamp endDtCtpy;
	private Double ctpyRoute;
	private Double ctpDose;
	private Short doseReductionNeeded;
	private Short noCyclesAdministered;
	private Short enrolledClinicalTrial;
	private Short eligibleClinicalTrial;
	private Short sideEffectsExperienced;
	private String sideEffectsExperiencedComm;
	private Short allergicEvents;
	private String allergicEventsComm;
	private Short antracyclinesAdministered;
	private Double antracyclinesAdministeredDose;
	private Short hospitalizationToxicityDuringTreatment;
	private Short neurotoxicityImpairsActivitiesDailyLiving;
	private Short cardiotoxicity;
	private String cardiotoxicityComm;
	private Short postChemoMagaScan;
	private String postChemoMagaScanComm;
	private String reasonStoppingCtpy;
	private Short pretreatmentPlateletCount;
	private String pretreatmentPlateletCountComm;
	private Short treatmentRelatedAnemia;
	private Short treatmentRelatedNeutropenia;
	private Short treatmentRelatedTrombocytopenia;
	private Short treatmentRelatedLymphocytopenia;
	private Integer palliativeLine;
	private String chemoResponse;
	private Integer radiosensitising;
	private String chemoStopReason;
	private String chemoIntension;
	private Integer chemoCompid;

	// Constructors

	/** default constructor */
	public Chemotherapy() {
	}

	/** minimal constructor */
	public Chemotherapy(ChemotherapyId id) {
		this.id = id;
	}

	/** full constructor */
	public Chemotherapy(ChemotherapyId id,
			ClinicalTrial clinicalTrialByEligibleClinicalTrialId, Case1 case1,
			ChemoAgent chemoAgent, ChemoProtocol chemoProtocol,
			ClinicalTrial clinicalTrialByEnrolledClinicalTrialId,
			Short baseLineMegaScan, String baseLineMegaScanComm,
			Double pretreatmentWeight, Double postTreatmentWeight,
			Timestamp startDtCtpy, Timestamp endDtCtpy, Double ctpyRoute,
			Double ctpDose, Short doseReductionNeeded,
			Short noCyclesAdministered, Short enrolledClinicalTrial,
			Short eligibleClinicalTrial, Short sideEffectsExperienced,
			String sideEffectsExperiencedComm, Short allergicEvents,
			String allergicEventsComm, Short antracyclinesAdministered,
			Double antracyclinesAdministeredDose,
			Short hospitalizationToxicityDuringTreatment,
			Short neurotoxicityImpairsActivitiesDailyLiving,
			Short cardiotoxicity, String cardiotoxicityComm,
			Short postChemoMagaScan, String postChemoMagaScanComm,
			String reasonStoppingCtpy, Short pretreatmentPlateletCount,
			String pretreatmentPlateletCountComm, Short treatmentRelatedAnemia,
			Short treatmentRelatedNeutropenia,
			Short treatmentRelatedTrombocytopenia,
			Short treatmentRelatedLymphocytopenia, Integer palliativeLine,
			String chemoResponse, Integer radiosensitising,
			String chemoStopReason, String chemoIntension, Integer chemoCompid) {
		this.id = id;
		this.clinicalTrialByEligibleClinicalTrialId = clinicalTrialByEligibleClinicalTrialId;
		this.case1 = case1;
		this.chemoAgent = chemoAgent;
		this.chemoProtocol = chemoProtocol;
		this.clinicalTrialByEnrolledClinicalTrialId = clinicalTrialByEnrolledClinicalTrialId;
		this.baseLineMegaScan = baseLineMegaScan;
		this.baseLineMegaScanComm = baseLineMegaScanComm;
		this.pretreatmentWeight = pretreatmentWeight;
		this.postTreatmentWeight = postTreatmentWeight;
		this.startDtCtpy = startDtCtpy;
		this.endDtCtpy = endDtCtpy;
		this.ctpyRoute = ctpyRoute;
		this.ctpDose = ctpDose;
		this.doseReductionNeeded = doseReductionNeeded;
		this.noCyclesAdministered = noCyclesAdministered;
		this.enrolledClinicalTrial = enrolledClinicalTrial;
		this.eligibleClinicalTrial = eligibleClinicalTrial;
		this.sideEffectsExperienced = sideEffectsExperienced;
		this.sideEffectsExperiencedComm = sideEffectsExperiencedComm;
		this.allergicEvents = allergicEvents;
		this.allergicEventsComm = allergicEventsComm;
		this.antracyclinesAdministered = antracyclinesAdministered;
		this.antracyclinesAdministeredDose = antracyclinesAdministeredDose;
		this.hospitalizationToxicityDuringTreatment = hospitalizationToxicityDuringTreatment;
		this.neurotoxicityImpairsActivitiesDailyLiving = neurotoxicityImpairsActivitiesDailyLiving;
		this.cardiotoxicity = cardiotoxicity;
		this.cardiotoxicityComm = cardiotoxicityComm;
		this.postChemoMagaScan = postChemoMagaScan;
		this.postChemoMagaScanComm = postChemoMagaScanComm;
		this.reasonStoppingCtpy = reasonStoppingCtpy;
		this.pretreatmentPlateletCount = pretreatmentPlateletCount;
		this.pretreatmentPlateletCountComm = pretreatmentPlateletCountComm;
		this.treatmentRelatedAnemia = treatmentRelatedAnemia;
		this.treatmentRelatedNeutropenia = treatmentRelatedNeutropenia;
		this.treatmentRelatedTrombocytopenia = treatmentRelatedTrombocytopenia;
		this.treatmentRelatedLymphocytopenia = treatmentRelatedLymphocytopenia;
		this.palliativeLine = palliativeLine;
		this.chemoResponse = chemoResponse;
		this.radiosensitising = radiosensitising;
		this.chemoStopReason = chemoStopReason;
		this.chemoIntension = chemoIntension;
		this.chemoCompid = chemoCompid;
	}

	// Property accessors

	public ChemotherapyId getId() {
		return this.id;
	}

	public void setId(ChemotherapyId id) {
		this.id = id;
	}

	public ClinicalTrial getClinicalTrialByEligibleClinicalTrialId() {
		return this.clinicalTrialByEligibleClinicalTrialId;
	}

	public void setClinicalTrialByEligibleClinicalTrialId(
			ClinicalTrial clinicalTrialByEligibleClinicalTrialId) {
		this.clinicalTrialByEligibleClinicalTrialId = clinicalTrialByEligibleClinicalTrialId;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public ChemoAgent getChemoAgent() {
		return this.chemoAgent;
	}

	public void setChemoAgent(ChemoAgent chemoAgent) {
		this.chemoAgent = chemoAgent;
	}

	public ChemoProtocol getChemoProtocol() {
		return this.chemoProtocol;
	}

	public void setChemoProtocol(ChemoProtocol chemoProtocol) {
		this.chemoProtocol = chemoProtocol;
	}

	public ClinicalTrial getClinicalTrialByEnrolledClinicalTrialId() {
		return this.clinicalTrialByEnrolledClinicalTrialId;
	}

	public void setClinicalTrialByEnrolledClinicalTrialId(
			ClinicalTrial clinicalTrialByEnrolledClinicalTrialId) {
		this.clinicalTrialByEnrolledClinicalTrialId = clinicalTrialByEnrolledClinicalTrialId;
	}

	public Short getBaseLineMegaScan() {
		return this.baseLineMegaScan;
	}

	public void setBaseLineMegaScan(Short baseLineMegaScan) {
		this.baseLineMegaScan = baseLineMegaScan;
	}

	public String getBaseLineMegaScanComm() {
		return this.baseLineMegaScanComm;
	}

	public void setBaseLineMegaScanComm(String baseLineMegaScanComm) {
		this.baseLineMegaScanComm = baseLineMegaScanComm;
	}

	public Double getPretreatmentWeight() {
		return this.pretreatmentWeight;
	}

	public void setPretreatmentWeight(Double pretreatmentWeight) {
		this.pretreatmentWeight = pretreatmentWeight;
	}

	public Double getPostTreatmentWeight() {
		return this.postTreatmentWeight;
	}

	public void setPostTreatmentWeight(Double postTreatmentWeight) {
		this.postTreatmentWeight = postTreatmentWeight;
	}

	public Timestamp getStartDtCtpy() {
		return this.startDtCtpy;
	}

	public void setStartDtCtpy(Timestamp startDtCtpy) {
		this.startDtCtpy = startDtCtpy;
	}

	public Timestamp getEndDtCtpy() {
		return this.endDtCtpy;
	}

	public void setEndDtCtpy(Timestamp endDtCtpy) {
		this.endDtCtpy = endDtCtpy;
	}

	public Double getCtpyRoute() {
		return this.ctpyRoute;
	}

	public void setCtpyRoute(Double ctpyRoute) {
		this.ctpyRoute = ctpyRoute;
	}

	public Double getCtpDose() {
		return this.ctpDose;
	}

	public void setCtpDose(Double ctpDose) {
		this.ctpDose = ctpDose;
	}

	public Short getDoseReductionNeeded() {
		return this.doseReductionNeeded;
	}

	public void setDoseReductionNeeded(Short doseReductionNeeded) {
		this.doseReductionNeeded = doseReductionNeeded;
	}

	public Short getNoCyclesAdministered() {
		return this.noCyclesAdministered;
	}

	public void setNoCyclesAdministered(Short noCyclesAdministered) {
		this.noCyclesAdministered = noCyclesAdministered;
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

	public Short getSideEffectsExperienced() {
		return this.sideEffectsExperienced;
	}

	public void setSideEffectsExperienced(Short sideEffectsExperienced) {
		this.sideEffectsExperienced = sideEffectsExperienced;
	}

	public String getSideEffectsExperiencedComm() {
		return this.sideEffectsExperiencedComm;
	}

	public void setSideEffectsExperiencedComm(String sideEffectsExperiencedComm) {
		this.sideEffectsExperiencedComm = sideEffectsExperiencedComm;
	}

	public Short getAllergicEvents() {
		return this.allergicEvents;
	}

	public void setAllergicEvents(Short allergicEvents) {
		this.allergicEvents = allergicEvents;
	}

	public String getAllergicEventsComm() {
		return this.allergicEventsComm;
	}

	public void setAllergicEventsComm(String allergicEventsComm) {
		this.allergicEventsComm = allergicEventsComm;
	}

	public Short getAntracyclinesAdministered() {
		return this.antracyclinesAdministered;
	}

	public void setAntracyclinesAdministered(Short antracyclinesAdministered) {
		this.antracyclinesAdministered = antracyclinesAdministered;
	}

	public Double getAntracyclinesAdministeredDose() {
		return this.antracyclinesAdministeredDose;
	}

	public void setAntracyclinesAdministeredDose(
			Double antracyclinesAdministeredDose) {
		this.antracyclinesAdministeredDose = antracyclinesAdministeredDose;
	}

	public Short getHospitalizationToxicityDuringTreatment() {
		return this.hospitalizationToxicityDuringTreatment;
	}

	public void setHospitalizationToxicityDuringTreatment(
			Short hospitalizationToxicityDuringTreatment) {
		this.hospitalizationToxicityDuringTreatment = hospitalizationToxicityDuringTreatment;
	}

	public Short getNeurotoxicityImpairsActivitiesDailyLiving() {
		return this.neurotoxicityImpairsActivitiesDailyLiving;
	}

	public void setNeurotoxicityImpairsActivitiesDailyLiving(
			Short neurotoxicityImpairsActivitiesDailyLiving) {
		this.neurotoxicityImpairsActivitiesDailyLiving = neurotoxicityImpairsActivitiesDailyLiving;
	}

	public Short getCardiotoxicity() {
		return this.cardiotoxicity;
	}

	public void setCardiotoxicity(Short cardiotoxicity) {
		this.cardiotoxicity = cardiotoxicity;
	}

	public String getCardiotoxicityComm() {
		return this.cardiotoxicityComm;
	}

	public void setCardiotoxicityComm(String cardiotoxicityComm) {
		this.cardiotoxicityComm = cardiotoxicityComm;
	}

	public Short getPostChemoMagaScan() {
		return this.postChemoMagaScan;
	}

	public void setPostChemoMagaScan(Short postChemoMagaScan) {
		this.postChemoMagaScan = postChemoMagaScan;
	}

	public String getPostChemoMagaScanComm() {
		return this.postChemoMagaScanComm;
	}

	public void setPostChemoMagaScanComm(String postChemoMagaScanComm) {
		this.postChemoMagaScanComm = postChemoMagaScanComm;
	}

	public String getReasonStoppingCtpy() {
		return this.reasonStoppingCtpy;
	}

	public void setReasonStoppingCtpy(String reasonStoppingCtpy) {
		this.reasonStoppingCtpy = reasonStoppingCtpy;
	}

	public Short getPretreatmentPlateletCount() {
		return this.pretreatmentPlateletCount;
	}

	public void setPretreatmentPlateletCount(Short pretreatmentPlateletCount) {
		this.pretreatmentPlateletCount = pretreatmentPlateletCount;
	}

	public String getPretreatmentPlateletCountComm() {
		return this.pretreatmentPlateletCountComm;
	}

	public void setPretreatmentPlateletCountComm(
			String pretreatmentPlateletCountComm) {
		this.pretreatmentPlateletCountComm = pretreatmentPlateletCountComm;
	}

	public Short getTreatmentRelatedAnemia() {
		return this.treatmentRelatedAnemia;
	}

	public void setTreatmentRelatedAnemia(Short treatmentRelatedAnemia) {
		this.treatmentRelatedAnemia = treatmentRelatedAnemia;
	}

	public Short getTreatmentRelatedNeutropenia() {
		return this.treatmentRelatedNeutropenia;
	}

	public void setTreatmentRelatedNeutropenia(Short treatmentRelatedNeutropenia) {
		this.treatmentRelatedNeutropenia = treatmentRelatedNeutropenia;
	}

	public Short getTreatmentRelatedTrombocytopenia() {
		return this.treatmentRelatedTrombocytopenia;
	}

	public void setTreatmentRelatedTrombocytopenia(
			Short treatmentRelatedTrombocytopenia) {
		this.treatmentRelatedTrombocytopenia = treatmentRelatedTrombocytopenia;
	}

	public Short getTreatmentRelatedLymphocytopenia() {
		return this.treatmentRelatedLymphocytopenia;
	}

	public void setTreatmentRelatedLymphocytopenia(
			Short treatmentRelatedLymphocytopenia) {
		this.treatmentRelatedLymphocytopenia = treatmentRelatedLymphocytopenia;
	}

	public Integer getPalliativeLine() {
		return this.palliativeLine;
	}

	public void setPalliativeLine(Integer palliativeLine) {
		this.palliativeLine = palliativeLine;
	}

	public String getChemoResponse() {
		return this.chemoResponse;
	}

	public void setChemoResponse(String chemoResponse) {
		this.chemoResponse = chemoResponse;
	}

	public Integer getRadiosensitising() {
		return this.radiosensitising;
	}

	public void setRadiosensitising(Integer radiosensitising) {
		this.radiosensitising = radiosensitising;
	}

	public String getChemoStopReason() {
		return this.chemoStopReason;
	}

	public void setChemoStopReason(String chemoStopReason) {
		this.chemoStopReason = chemoStopReason;
	}

	public String getChemoIntension() {
		return this.chemoIntension;
	}

	public void setChemoIntension(String chemoIntension) {
		this.chemoIntension = chemoIntension;
	}

	public Integer getChemoCompid() {
		return this.chemoCompid;
	}

	public void setChemoCompid(Integer chemoCompid) {
		this.chemoCompid = chemoCompid;
	}

}
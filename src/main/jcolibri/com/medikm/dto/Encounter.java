package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Encounter entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Encounter implements java.io.Serializable {

	// Fields

	private Integer encounterId;
	private Case1 case1;
	private EncounterType encounterType;
	private Episode episode;
	private Timestamp encounterDt;
	private Integer facilityId;
	private String providerNote;
	private Double enHeight;
	private Double enWeight;
	private Short pregnancyStatus;
	private Short monthPregnancy;
	private Short clinicalTrialOffered;
	private Short clinicalTrialDeclined;
	private Integer enBmi;
	private String relativeIntraoperativeFindings;
	private String imagingFindings;
	private Set biopsies = new HashSet(0);
	private Set followups = new HashSet(0);
	private Set encounterServiceProviders = new HashSet(0);
	private Set physicalExams = new HashSet(0);
	private Set encounterGuidelines = new HashSet(0);
	private Set encounterPhysicians = new HashSet(0);
	private Set encounterClinicalTrials = new HashSet(0);
	private Set pathologies = new HashSet(0);
	private Set diagnosticWorkups = new HashSet(0);

	// Constructors

	/** default constructor */
	public Encounter() {
	}

	/** minimal constructor */
	public Encounter(Case1 case1, Episode episode) {
		this.case1 = case1;
		this.episode = episode;
	}

	/** full constructor */
	public Encounter(Case1 case1, EncounterType encounterType, Episode episode, Timestamp encounterDt,
			Integer facilityId, String providerNote, Double enHeight, Double enWeight, Short pregnancyStatus,
			Short monthPregnancy, Short clinicalTrialOffered, Short clinicalTrialDeclined, Integer enBmi,
			String relativeIntraoperativeFindings, String imagingFindings, Set biopsies, Set followups,
			Set encounterServiceProviders, Set physicalExams, Set encounterGuidelines, Set encounterPhysicians,
			Set encounterClinicalTrials, Set pathologies, Set diagnosticWorkups) {
		this.case1 = case1;
		this.encounterType = encounterType;
		this.episode = episode;
		this.encounterDt = encounterDt;
		this.facilityId = facilityId;
		this.providerNote = providerNote;
		this.enHeight = enHeight;
		this.enWeight = enWeight;
		this.pregnancyStatus = pregnancyStatus;
		this.monthPregnancy = monthPregnancy;
		this.clinicalTrialOffered = clinicalTrialOffered;
		this.clinicalTrialDeclined = clinicalTrialDeclined;
		this.enBmi = enBmi;
		this.relativeIntraoperativeFindings = relativeIntraoperativeFindings;
		this.imagingFindings = imagingFindings;
		this.biopsies = biopsies;
		this.followups = followups;
		this.encounterServiceProviders = encounterServiceProviders;
		this.physicalExams = physicalExams;
		this.encounterGuidelines = encounterGuidelines;
		this.encounterPhysicians = encounterPhysicians;
		this.encounterClinicalTrials = encounterClinicalTrials;
		this.pathologies = pathologies;
		this.diagnosticWorkups = diagnosticWorkups;
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

	public EncounterType getEncounterType() {
		return this.encounterType;
	}

	public void setEncounterType(EncounterType encounterType) {
		this.encounterType = encounterType;
	}

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public Timestamp getEncounterDt() {
		return this.encounterDt;
	}

	public void setEncounterDt(Timestamp encounterDt) {
		this.encounterDt = encounterDt;
	}

	public Integer getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public String getProviderNote() {
		return this.providerNote;
	}

	public void setProviderNote(String providerNote) {
		this.providerNote = providerNote;
	}

	public Double getEnHeight() {
		return this.enHeight;
	}

	public void setEnHeight(Double enHeight) {
		this.enHeight = enHeight;
	}

	public Double getEnWeight() {
		return this.enWeight;
	}

	public void setEnWeight(Double enWeight) {
		this.enWeight = enWeight;
	}

	public Short getPregnancyStatus() {
		return this.pregnancyStatus;
	}

	public void setPregnancyStatus(Short pregnancyStatus) {
		this.pregnancyStatus = pregnancyStatus;
	}

	public Short getMonthPregnancy() {
		return this.monthPregnancy;
	}

	public void setMonthPregnancy(Short monthPregnancy) {
		this.monthPregnancy = monthPregnancy;
	}

	public Short getClinicalTrialOffered() {
		return this.clinicalTrialOffered;
	}

	public void setClinicalTrialOffered(Short clinicalTrialOffered) {
		this.clinicalTrialOffered = clinicalTrialOffered;
	}

	public Short getClinicalTrialDeclined() {
		return this.clinicalTrialDeclined;
	}

	public void setClinicalTrialDeclined(Short clinicalTrialDeclined) {
		this.clinicalTrialDeclined = clinicalTrialDeclined;
	}

	public Integer getEnBmi() {
		return this.enBmi;
	}

	public void setEnBmi(Integer enBmi) {
		this.enBmi = enBmi;
	}

	public String getRelativeIntraoperativeFindings() {
		return this.relativeIntraoperativeFindings;
	}

	public void setRelativeIntraoperativeFindings(String relativeIntraoperativeFindings) {
		this.relativeIntraoperativeFindings = relativeIntraoperativeFindings;
	}

	public String getImagingFindings() {
		return this.imagingFindings;
	}

	public void setImagingFindings(String imagingFindings) {
		this.imagingFindings = imagingFindings;
	}

	public Set getBiopsies() {
		return this.biopsies;
	}

	public void setBiopsies(Set biopsies) {
		this.biopsies = biopsies;
	}

	public Set getFollowups() {
		return this.followups;
	}

	public void setFollowups(Set followups) {
		this.followups = followups;
	}

	public Set getEncounterServiceProviders() {
		return this.encounterServiceProviders;
	}

	public void setEncounterServiceProviders(Set encounterServiceProviders) {
		this.encounterServiceProviders = encounterServiceProviders;
	}

	public Set getPhysicalExams() {
		return this.physicalExams;
	}

	public void setPhysicalExams(Set physicalExams) {
		this.physicalExams = physicalExams;
	}

	public Set getEncounterGuidelines() {
		return this.encounterGuidelines;
	}

	public void setEncounterGuidelines(Set encounterGuidelines) {
		this.encounterGuidelines = encounterGuidelines;
	}

	public Set getEncounterPhysicians() {
		return this.encounterPhysicians;
	}

	public void setEncounterPhysicians(Set encounterPhysicians) {
		this.encounterPhysicians = encounterPhysicians;
	}

	public Set getEncounterClinicalTrials() {
		return this.encounterClinicalTrials;
	}

	public void setEncounterClinicalTrials(Set encounterClinicalTrials) {
		this.encounterClinicalTrials = encounterClinicalTrials;
	}

	public Set getPathologies() {
		return this.pathologies;
	}

	public void setPathologies(Set pathologies) {
		this.pathologies = pathologies;
	}

	public Set getDiagnosticWorkups() {
		return this.diagnosticWorkups;
	}

	public void setDiagnosticWorkups(Set diagnosticWorkups) {
		this.diagnosticWorkups = diagnosticWorkups;
	}

}
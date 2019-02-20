package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Episode entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Episode implements java.io.Serializable {

	// Fields

	private Integer episodeId;
	private Case1 case1;
	private Timestamp firstEncounterDt;
	private Timestamp lastEncounterDt;
	private Timestamp dtRemission;
	private Timestamp dtInitialComplaint;
	private Timestamp dtResolutionComplaints;
	private String healthProblemType;
	private Timestamp problemUnsetDt;
	private Integer diseaseType;
	private String symptomsComplaintsExperienced;
	private Double epHeight;
	private Double epWeight;
	private String sideOfCancer;
	private String cancerLocation;
	private Short hrt;
	private String relativeIntraoperativeFindings;
	private String imagingFindings;
	private String biopsyFindings;
	private String pathologyFindings;
	private String frozenSectionFindings;
	private String recommendedPlan;
	private Timestamp nextVisitDate;
	private Set radiationTherapies = new HashSet(0);
	private Set encounters = new HashSet(0);
	private Set tbDiscussionForums = new HashSet(0);
	private Set prognosticFactors = new HashSet(0);
	private Set cancerStages = new HashSet(0);
	private Set targetedTherapies = new HashSet(0);
	private Set riskReductions = new HashSet(0);
	private Set endocrineTherapies = new HashSet(0);
	private Set tumorBoardDiscussions = new HashSet(0);
	private Set episodePhysicians = new HashSet(0);
	private Set tumorBoardDiscussionQuestions = new HashSet(0);
	private Set chemotherapies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Episode() {
	}

	/** minimal constructor */
	public Episode(Case1 case1) {
		this.case1 = case1;
	}

	/** full constructor */
	public Episode(Case1 case1, Timestamp firstEncounterDt, Timestamp lastEncounterDt, Timestamp dtRemission,
			Timestamp dtInitialComplaint, Timestamp dtResolutionComplaints, String healthProblemType,
			Timestamp problemUnsetDt, Integer diseaseType, String symptomsComplaintsExperienced, Double epHeight,
			Double epWeight, String sideOfCancer, String cancerLocation, Short hrt,
			String relativeIntraoperativeFindings, String imagingFindings, String biopsyFindings,
			String pathologyFindings, String frozenSectionFindings, String recommendedPlan, Timestamp nextVisitDate,
			Set radiationTherapies, Set encounters, Set tbDiscussionForums, Set prognosticFactors, Set cancerStages,
			Set targetedTherapies, Set riskReductions, Set endocrineTherapies, Set tumorBoardDiscussions,
			Set episodePhysicians, Set tumorBoardDiscussionQuestions, Set chemotherapies) {
		this.case1 = case1;
		this.firstEncounterDt = firstEncounterDt;
		this.lastEncounterDt = lastEncounterDt;
		this.dtRemission = dtRemission;
		this.dtInitialComplaint = dtInitialComplaint;
		this.dtResolutionComplaints = dtResolutionComplaints;
		this.healthProblemType = healthProblemType;
		this.problemUnsetDt = problemUnsetDt;
		this.diseaseType = diseaseType;
		this.symptomsComplaintsExperienced = symptomsComplaintsExperienced;
		this.epHeight = epHeight;
		this.epWeight = epWeight;
		this.sideOfCancer = sideOfCancer;
		this.cancerLocation = cancerLocation;
		this.hrt = hrt;
		this.relativeIntraoperativeFindings = relativeIntraoperativeFindings;
		this.imagingFindings = imagingFindings;
		this.biopsyFindings = biopsyFindings;
		this.pathologyFindings = pathologyFindings;
		this.frozenSectionFindings = frozenSectionFindings;
		this.recommendedPlan = recommendedPlan;
		this.nextVisitDate = nextVisitDate;
		this.radiationTherapies = radiationTherapies;
		this.encounters = encounters;
		this.tbDiscussionForums = tbDiscussionForums;
		this.prognosticFactors = prognosticFactors;
		this.cancerStages = cancerStages;
		this.targetedTherapies = targetedTherapies;
		this.riskReductions = riskReductions;
		this.endocrineTherapies = endocrineTherapies;
		this.tumorBoardDiscussions = tumorBoardDiscussions;
		this.episodePhysicians = episodePhysicians;
		this.tumorBoardDiscussionQuestions = tumorBoardDiscussionQuestions;
		this.chemotherapies = chemotherapies;
	}

	// Property accessors

	public Integer getEpisodeId() {
		return this.episodeId;
	}

	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public Timestamp getFirstEncounterDt() {
		return this.firstEncounterDt;
	}

	public void setFirstEncounterDt(Timestamp firstEncounterDt) {
		this.firstEncounterDt = firstEncounterDt;
	}

	public Timestamp getLastEncounterDt() {
		return this.lastEncounterDt;
	}

	public void setLastEncounterDt(Timestamp lastEncounterDt) {
		this.lastEncounterDt = lastEncounterDt;
	}

	public Timestamp getDtRemission() {
		return this.dtRemission;
	}

	public void setDtRemission(Timestamp dtRemission) {
		this.dtRemission = dtRemission;
	}

	public Timestamp getDtInitialComplaint() {
		return this.dtInitialComplaint;
	}

	public void setDtInitialComplaint(Timestamp dtInitialComplaint) {
		this.dtInitialComplaint = dtInitialComplaint;
	}

	public Timestamp getDtResolutionComplaints() {
		return this.dtResolutionComplaints;
	}

	public void setDtResolutionComplaints(Timestamp dtResolutionComplaints) {
		this.dtResolutionComplaints = dtResolutionComplaints;
	}

	public String getHealthProblemType() {
		return this.healthProblemType;
	}

	public void setHealthProblemType(String healthProblemType) {
		this.healthProblemType = healthProblemType;
	}

	public Timestamp getProblemUnsetDt() {
		return this.problemUnsetDt;
	}

	public void setProblemUnsetDt(Timestamp problemUnsetDt) {
		this.problemUnsetDt = problemUnsetDt;
	}

	public Integer getDiseaseType() {
		return this.diseaseType;
	}

	public void setDiseaseType(Integer diseaseType) {
		this.diseaseType = diseaseType;
	}

	public String getSymptomsComplaintsExperienced() {
		return this.symptomsComplaintsExperienced;
	}

	public void setSymptomsComplaintsExperienced(String symptomsComplaintsExperienced) {
		this.symptomsComplaintsExperienced = symptomsComplaintsExperienced;
	}

	public Double getEpHeight() {
		return this.epHeight;
	}

	public void setEpHeight(Double epHeight) {
		this.epHeight = epHeight;
	}

	public Double getEpWeight() {
		return this.epWeight;
	}

	public void setEpWeight(Double epWeight) {
		this.epWeight = epWeight;
	}

	public String getSideOfCancer() {
		return this.sideOfCancer;
	}

	public void setSideOfCancer(String sideOfCancer) {
		this.sideOfCancer = sideOfCancer;
	}

	public String getCancerLocation() {
		return this.cancerLocation;
	}

	public void setCancerLocation(String cancerLocation) {
		this.cancerLocation = cancerLocation;
	}

	public Short getHrt() {
		return this.hrt;
	}

	public void setHrt(Short hrt) {
		this.hrt = hrt;
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

	public String getBiopsyFindings() {
		return this.biopsyFindings;
	}

	public void setBiopsyFindings(String biopsyFindings) {
		this.biopsyFindings = biopsyFindings;
	}

	public String getPathologyFindings() {
		return this.pathologyFindings;
	}

	public void setPathologyFindings(String pathologyFindings) {
		this.pathologyFindings = pathologyFindings;
	}

	public String getFrozenSectionFindings() {
		return this.frozenSectionFindings;
	}

	public void setFrozenSectionFindings(String frozenSectionFindings) {
		this.frozenSectionFindings = frozenSectionFindings;
	}

	public String getRecommendedPlan() {
		return this.recommendedPlan;
	}

	public void setRecommendedPlan(String recommendedPlan) {
		this.recommendedPlan = recommendedPlan;
	}

	public Timestamp getNextVisitDate() {
		return this.nextVisitDate;
	}

	public void setNextVisitDate(Timestamp nextVisitDate) {
		this.nextVisitDate = nextVisitDate;
	}

	public Set getRadiationTherapies() {
		return this.radiationTherapies;
	}

	public void setRadiationTherapies(Set radiationTherapies) {
		this.radiationTherapies = radiationTherapies;
	}

	public Set getEncounters() {
		return this.encounters;
	}

	public void setEncounters(Set encounters) {
		this.encounters = encounters;
	}

	public Set getTbDiscussionForums() {
		return this.tbDiscussionForums;
	}

	public void setTbDiscussionForums(Set tbDiscussionForums) {
		this.tbDiscussionForums = tbDiscussionForums;
	}

	public Set getPrognosticFactors() {
		return this.prognosticFactors;
	}

	public void setPrognosticFactors(Set prognosticFactors) {
		this.prognosticFactors = prognosticFactors;
	}

	public Set getCancerStages() {
		return this.cancerStages;
	}

	public void setCancerStages(Set cancerStages) {
		this.cancerStages = cancerStages;
	}

	public Set getTargetedTherapies() {
		return this.targetedTherapies;
	}

	public void setTargetedTherapies(Set targetedTherapies) {
		this.targetedTherapies = targetedTherapies;
	}

	public Set getRiskReductions() {
		return this.riskReductions;
	}

	public void setRiskReductions(Set riskReductions) {
		this.riskReductions = riskReductions;
	}

	public Set getEndocrineTherapies() {
		return this.endocrineTherapies;
	}

	public void setEndocrineTherapies(Set endocrineTherapies) {
		this.endocrineTherapies = endocrineTherapies;
	}

	public Set getTumorBoardDiscussions() {
		return this.tumorBoardDiscussions;
	}

	public void setTumorBoardDiscussions(Set tumorBoardDiscussions) {
		this.tumorBoardDiscussions = tumorBoardDiscussions;
	}

	public Set getEpisodePhysicians() {
		return this.episodePhysicians;
	}

	public void setEpisodePhysicians(Set episodePhysicians) {
		this.episodePhysicians = episodePhysicians;
	}

	public Set getTumorBoardDiscussionQuestions() {
		return this.tumorBoardDiscussionQuestions;
	}

	public void setTumorBoardDiscussionQuestions(Set tumorBoardDiscussionQuestions) {
		this.tumorBoardDiscussionQuestions = tumorBoardDiscussionQuestions;
	}

	public Set getChemotherapies() {
		return this.chemotherapies;
	}

	public void setChemotherapies(Set chemotherapies) {
		this.chemotherapies = chemotherapies;
	}

}
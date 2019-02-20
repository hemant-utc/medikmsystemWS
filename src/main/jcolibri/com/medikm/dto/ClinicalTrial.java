package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * ClinicalTrial entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class ClinicalTrial implements java.io.Serializable {

	// Fields

	private Integer clinicalTrialId;
	private Physician physician;
	private TrialType trialType;
	private String trialName;
	private String trialDescription;
	private Timestamp trialStartDt;
	private Timestamp trialCompletionDt;
	private Short trialPhase;
	private String trialPrimaryObjective;
	private String trialStatus;
	private String inclusionCriteria;
	private String exclusionCriteria;
	private String sponsor;
	private String trialParticipatingSites;
	private Set endocrineTherapiesForEligibleClinicalTrialId = new HashSet(0);
	private Set endocrineTherapiesForEnrolledClinicalTrialId = new HashSet(0);
	private Set targetedTherapiesForEnrolledClinicalTrialId = new HashSet(0);
	private Set chemotherapiesForEnrolledClinicalTrialId = new HashSet(0);
	private Set chemotherapiesForEligibleClinicalTrialId = new HashSet(0);
	private Set targetedTherapiesForEligibleClinicalTrialId = new HashSet(0);
	private Set encounterClinicalTrials = new HashSet(0);

	// Constructors

	/** default constructor */
	public ClinicalTrial() {
	}

	/** minimal constructor */
	public ClinicalTrial(Integer clinicalTrialId) {
		this.clinicalTrialId = clinicalTrialId;
	}

	/** full constructor */
	public ClinicalTrial(Integer clinicalTrialId, Physician physician, TrialType trialType, String trialName,
			String trialDescription, Timestamp trialStartDt, Timestamp trialCompletionDt, Short trialPhase,
			String trialPrimaryObjective, String trialStatus, String inclusionCriteria, String exclusionCriteria,
			String sponsor, String trialParticipatingSites, Set endocrineTherapiesForEligibleClinicalTrialId,
			Set endocrineTherapiesForEnrolledClinicalTrialId, Set targetedTherapiesForEnrolledClinicalTrialId,
			Set chemotherapiesForEnrolledClinicalTrialId, Set chemotherapiesForEligibleClinicalTrialId,
			Set targetedTherapiesForEligibleClinicalTrialId, Set encounterClinicalTrials) {
		this.clinicalTrialId = clinicalTrialId;
		this.physician = physician;
		this.trialType = trialType;
		this.trialName = trialName;
		this.trialDescription = trialDescription;
		this.trialStartDt = trialStartDt;
		this.trialCompletionDt = trialCompletionDt;
		this.trialPhase = trialPhase;
		this.trialPrimaryObjective = trialPrimaryObjective;
		this.trialStatus = trialStatus;
		this.inclusionCriteria = inclusionCriteria;
		this.exclusionCriteria = exclusionCriteria;
		this.sponsor = sponsor;
		this.trialParticipatingSites = trialParticipatingSites;
		this.endocrineTherapiesForEligibleClinicalTrialId = endocrineTherapiesForEligibleClinicalTrialId;
		this.endocrineTherapiesForEnrolledClinicalTrialId = endocrineTherapiesForEnrolledClinicalTrialId;
		this.targetedTherapiesForEnrolledClinicalTrialId = targetedTherapiesForEnrolledClinicalTrialId;
		this.chemotherapiesForEnrolledClinicalTrialId = chemotherapiesForEnrolledClinicalTrialId;
		this.chemotherapiesForEligibleClinicalTrialId = chemotherapiesForEligibleClinicalTrialId;
		this.targetedTherapiesForEligibleClinicalTrialId = targetedTherapiesForEligibleClinicalTrialId;
		this.encounterClinicalTrials = encounterClinicalTrials;
	}

	// Property accessors

	public Integer getClinicalTrialId() {
		return this.clinicalTrialId;
	}

	public void setClinicalTrialId(Integer clinicalTrialId) {
		this.clinicalTrialId = clinicalTrialId;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public TrialType getTrialType() {
		return this.trialType;
	}

	public void setTrialType(TrialType trialType) {
		this.trialType = trialType;
	}

	public String getTrialName() {
		return this.trialName;
	}

	public void setTrialName(String trialName) {
		this.trialName = trialName;
	}

	public String getTrialDescription() {
		return this.trialDescription;
	}

	public void setTrialDescription(String trialDescription) {
		this.trialDescription = trialDescription;
	}

	public Timestamp getTrialStartDt() {
		return this.trialStartDt;
	}

	public void setTrialStartDt(Timestamp trialStartDt) {
		this.trialStartDt = trialStartDt;
	}

	public Timestamp getTrialCompletionDt() {
		return this.trialCompletionDt;
	}

	public void setTrialCompletionDt(Timestamp trialCompletionDt) {
		this.trialCompletionDt = trialCompletionDt;
	}

	public Short getTrialPhase() {
		return this.trialPhase;
	}

	public void setTrialPhase(Short trialPhase) {
		this.trialPhase = trialPhase;
	}

	public String getTrialPrimaryObjective() {
		return this.trialPrimaryObjective;
	}

	public void setTrialPrimaryObjective(String trialPrimaryObjective) {
		this.trialPrimaryObjective = trialPrimaryObjective;
	}

	public String getTrialStatus() {
		return this.trialStatus;
	}

	public void setTrialStatus(String trialStatus) {
		this.trialStatus = trialStatus;
	}

	public String getInclusionCriteria() {
		return this.inclusionCriteria;
	}

	public void setInclusionCriteria(String inclusionCriteria) {
		this.inclusionCriteria = inclusionCriteria;
	}

	public String getExclusionCriteria() {
		return this.exclusionCriteria;
	}

	public void setExclusionCriteria(String exclusionCriteria) {
		this.exclusionCriteria = exclusionCriteria;
	}

	public String getSponsor() {
		return this.sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public String getTrialParticipatingSites() {
		return this.trialParticipatingSites;
	}

	public void setTrialParticipatingSites(String trialParticipatingSites) {
		this.trialParticipatingSites = trialParticipatingSites;
	}

	public Set getEndocrineTherapiesForEligibleClinicalTrialId() {
		return this.endocrineTherapiesForEligibleClinicalTrialId;
	}

	public void setEndocrineTherapiesForEligibleClinicalTrialId(Set endocrineTherapiesForEligibleClinicalTrialId) {
		this.endocrineTherapiesForEligibleClinicalTrialId = endocrineTherapiesForEligibleClinicalTrialId;
	}

	public Set getEndocrineTherapiesForEnrolledClinicalTrialId() {
		return this.endocrineTherapiesForEnrolledClinicalTrialId;
	}

	public void setEndocrineTherapiesForEnrolledClinicalTrialId(Set endocrineTherapiesForEnrolledClinicalTrialId) {
		this.endocrineTherapiesForEnrolledClinicalTrialId = endocrineTherapiesForEnrolledClinicalTrialId;
	}

	public Set getTargetedTherapiesForEnrolledClinicalTrialId() {
		return this.targetedTherapiesForEnrolledClinicalTrialId;
	}

	public void setTargetedTherapiesForEnrolledClinicalTrialId(Set targetedTherapiesForEnrolledClinicalTrialId) {
		this.targetedTherapiesForEnrolledClinicalTrialId = targetedTherapiesForEnrolledClinicalTrialId;
	}

	public Set getChemotherapiesForEnrolledClinicalTrialId() {
		return this.chemotherapiesForEnrolledClinicalTrialId;
	}

	public void setChemotherapiesForEnrolledClinicalTrialId(Set chemotherapiesForEnrolledClinicalTrialId) {
		this.chemotherapiesForEnrolledClinicalTrialId = chemotherapiesForEnrolledClinicalTrialId;
	}

	public Set getChemotherapiesForEligibleClinicalTrialId() {
		return this.chemotherapiesForEligibleClinicalTrialId;
	}

	public void setChemotherapiesForEligibleClinicalTrialId(Set chemotherapiesForEligibleClinicalTrialId) {
		this.chemotherapiesForEligibleClinicalTrialId = chemotherapiesForEligibleClinicalTrialId;
	}

	public Set getTargetedTherapiesForEligibleClinicalTrialId() {
		return this.targetedTherapiesForEligibleClinicalTrialId;
	}

	public void setTargetedTherapiesForEligibleClinicalTrialId(Set targetedTherapiesForEligibleClinicalTrialId) {
		this.targetedTherapiesForEligibleClinicalTrialId = targetedTherapiesForEligibleClinicalTrialId;
	}

	public Set getEncounterClinicalTrials() {
		return this.encounterClinicalTrials;
	}

	public void setEncounterClinicalTrials(Set encounterClinicalTrials) {
		this.encounterClinicalTrials = encounterClinicalTrials;
	}

}
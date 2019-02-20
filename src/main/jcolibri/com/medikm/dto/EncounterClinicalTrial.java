package com.medikm.dto;

import java.sql.Timestamp;

/**
 * EncounterClinicalTrial entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EncounterClinicalTrial implements java.io.Serializable {

	// Fields

	private EncounterClinicalTrialId id;
	private Case1 case1;
	private Timestamp enrolledDate;

	// Constructors

	/** default constructor */
	public EncounterClinicalTrial() {
	}

	/** minimal constructor */
	public EncounterClinicalTrial(EncounterClinicalTrialId id) {
		this.id = id;
	}

	/** full constructor */
	public EncounterClinicalTrial(EncounterClinicalTrialId id, Case1 case1, Timestamp enrolledDate) {
		this.id = id;
		this.case1 = case1;
		this.enrolledDate = enrolledDate;
	}

	// Property accessors

	public EncounterClinicalTrialId getId() {
		return this.id;
	}

	public void setId(EncounterClinicalTrialId id) {
		this.id = id;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public Timestamp getEnrolledDate() {
		return this.enrolledDate;
	}

	public void setEnrolledDate(Timestamp enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

}
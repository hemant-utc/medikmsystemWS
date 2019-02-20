package com.medikm.dto;

import java.sql.Timestamp;
import java.util.Date;

/**
 * TargetedTherapy entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class TargetedTherapy implements java.io.Serializable {

	// Fields

	private TargetedTherapyId id;
	private ClinicalTrial clinicalTrialByEligibleClinicalTrialId;
	private Case1 case1;
	private ClinicalTrial clinicalTrialByEnrolledClinicalTrialId;
	private TtAgent ttAgent;
	private Double preTranstuzumabEjectionFraction;
	private Timestamp mostRecentEjectionFractionDt;
	private String antiHer2RealtedComplications;
	private String bevacizumabAvastinRealtedComplications;
	private Short enrolledClinicalTrial;
	private Short eligibleClinicalTrial;
	private Timestamp startDt;
	private Date endDt;

	// Constructors

	/** default constructor */
	public TargetedTherapy() {
	}

	/** minimal constructor */
	public TargetedTherapy(TargetedTherapyId id, Case1 case1) {
		this.id = id;
		this.case1 = case1;
	}

	/** full constructor */
	public TargetedTherapy(TargetedTherapyId id, ClinicalTrial clinicalTrialByEligibleClinicalTrialId, Case1 case1,
			ClinicalTrial clinicalTrialByEnrolledClinicalTrialId, TtAgent ttAgent,
			Double preTranstuzumabEjectionFraction, Timestamp mostRecentEjectionFractionDt,
			String antiHer2RealtedComplications, String bevacizumabAvastinRealtedComplications,
			Short enrolledClinicalTrial, Short eligibleClinicalTrial, Timestamp startDt, Date endDt) {
		this.id = id;
		this.clinicalTrialByEligibleClinicalTrialId = clinicalTrialByEligibleClinicalTrialId;
		this.case1 = case1;
		this.clinicalTrialByEnrolledClinicalTrialId = clinicalTrialByEnrolledClinicalTrialId;
		this.ttAgent = ttAgent;
		this.preTranstuzumabEjectionFraction = preTranstuzumabEjectionFraction;
		this.mostRecentEjectionFractionDt = mostRecentEjectionFractionDt;
		this.antiHer2RealtedComplications = antiHer2RealtedComplications;
		this.bevacizumabAvastinRealtedComplications = bevacizumabAvastinRealtedComplications;
		this.enrolledClinicalTrial = enrolledClinicalTrial;
		this.eligibleClinicalTrial = eligibleClinicalTrial;
		this.startDt = startDt;
		this.endDt = endDt;
	}

	// Property accessors

	public TargetedTherapyId getId() {
		return this.id;
	}

	public void setId(TargetedTherapyId id) {
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

	public TtAgent getTtAgent() {
		return this.ttAgent;
	}

	public void setTtAgent(TtAgent ttAgent) {
		this.ttAgent = ttAgent;
	}

	public Double getPreTranstuzumabEjectionFraction() {
		return this.preTranstuzumabEjectionFraction;
	}

	public void setPreTranstuzumabEjectionFraction(Double preTranstuzumabEjectionFraction) {
		this.preTranstuzumabEjectionFraction = preTranstuzumabEjectionFraction;
	}

	public Timestamp getMostRecentEjectionFractionDt() {
		return this.mostRecentEjectionFractionDt;
	}

	public void setMostRecentEjectionFractionDt(Timestamp mostRecentEjectionFractionDt) {
		this.mostRecentEjectionFractionDt = mostRecentEjectionFractionDt;
	}

	public String getAntiHer2RealtedComplications() {
		return this.antiHer2RealtedComplications;
	}

	public void setAntiHer2RealtedComplications(String antiHer2RealtedComplications) {
		this.antiHer2RealtedComplications = antiHer2RealtedComplications;
	}

	public String getBevacizumabAvastinRealtedComplications() {
		return this.bevacizumabAvastinRealtedComplications;
	}

	public void setBevacizumabAvastinRealtedComplications(String bevacizumabAvastinRealtedComplications) {
		this.bevacizumabAvastinRealtedComplications = bevacizumabAvastinRealtedComplications;
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

	public Timestamp getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Timestamp startDt) {
		this.startDt = startDt;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

}
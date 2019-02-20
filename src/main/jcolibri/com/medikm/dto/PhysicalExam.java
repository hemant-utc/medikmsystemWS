package com.medikm.dto;

import java.sql.Timestamp;

/**
 * PhysicalExam entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class PhysicalExam implements java.io.Serializable {

	// Fields

	private Integer encounterId;
	private BreastSize breastSize;
	private Case1 case1;
	private Encounter encounter;
	private Physician physician;
	private PalpableLocation palpableLocation;
	private Timestamp cbeDt;
	private String cbeReport;
	private Double performanceScore;
	private Short cbeNormal;
	private Short palpableNodes;
	private Short skinChanges;
	private Short nippleChanges;

	// Constructors

	/** default constructor */
	public PhysicalExam() {
	}

	/** minimal constructor */
	public PhysicalExam(Integer encounterId, Encounter encounter) {
		this.encounterId = encounterId;
		this.encounter = encounter;
	}

	/** full constructor */
	public PhysicalExam(Integer encounterId, BreastSize breastSize, Case1 case1, Encounter encounter,
			Physician physician, PalpableLocation palpableLocation, Timestamp cbeDt, String cbeReport,
			Double performanceScore, Short cbeNormal, Short palpableNodes, Short skinChanges, Short nippleChanges) {
		this.encounterId = encounterId;
		this.breastSize = breastSize;
		this.case1 = case1;
		this.encounter = encounter;
		this.physician = physician;
		this.palpableLocation = palpableLocation;
		this.cbeDt = cbeDt;
		this.cbeReport = cbeReport;
		this.performanceScore = performanceScore;
		this.cbeNormal = cbeNormal;
		this.palpableNodes = palpableNodes;
		this.skinChanges = skinChanges;
		this.nippleChanges = nippleChanges;
	}

	// Property accessors

	public Integer getEncounterId() {
		return this.encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public BreastSize getBreastSize() {
		return this.breastSize;
	}

	public void setBreastSize(BreastSize breastSize) {
		this.breastSize = breastSize;
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

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public PalpableLocation getPalpableLocation() {
		return this.palpableLocation;
	}

	public void setPalpableLocation(PalpableLocation palpableLocation) {
		this.palpableLocation = palpableLocation;
	}

	public Timestamp getCbeDt() {
		return this.cbeDt;
	}

	public void setCbeDt(Timestamp cbeDt) {
		this.cbeDt = cbeDt;
	}

	public String getCbeReport() {
		return this.cbeReport;
	}

	public void setCbeReport(String cbeReport) {
		this.cbeReport = cbeReport;
	}

	public Double getPerformanceScore() {
		return this.performanceScore;
	}

	public void setPerformanceScore(Double performanceScore) {
		this.performanceScore = performanceScore;
	}

	public Short getCbeNormal() {
		return this.cbeNormal;
	}

	public void setCbeNormal(Short cbeNormal) {
		this.cbeNormal = cbeNormal;
	}

	public Short getPalpableNodes() {
		return this.palpableNodes;
	}

	public void setPalpableNodes(Short palpableNodes) {
		this.palpableNodes = palpableNodes;
	}

	public Short getSkinChanges() {
		return this.skinChanges;
	}

	public void setSkinChanges(Short skinChanges) {
		this.skinChanges = skinChanges;
	}

	public Short getNippleChanges() {
		return this.nippleChanges;
	}

	public void setNippleChanges(Short nippleChanges) {
		this.nippleChanges = nippleChanges;
	}

}
package com.medikm.dto;

/**
 * EncounterGuideline entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EncounterGuideline implements java.io.Serializable {

	// Fields

	private EncounterGuidelineId id;
	private Case1 case1;
	private Short guidelineMet;
	private String guidelineMetComm;

	// Constructors

	/** default constructor */
	public EncounterGuideline() {
	}

	/** minimal constructor */
	public EncounterGuideline(EncounterGuidelineId id) {
		this.id = id;
	}

	/** full constructor */
	public EncounterGuideline(EncounterGuidelineId id, Case1 case1, Short guidelineMet, String guidelineMetComm) {
		this.id = id;
		this.case1 = case1;
		this.guidelineMet = guidelineMet;
		this.guidelineMetComm = guidelineMetComm;
	}

	// Property accessors

	public EncounterGuidelineId getId() {
		return this.id;
	}

	public void setId(EncounterGuidelineId id) {
		this.id = id;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public Short getGuidelineMet() {
		return this.guidelineMet;
	}

	public void setGuidelineMet(Short guidelineMet) {
		this.guidelineMet = guidelineMet;
	}

	public String getGuidelineMetComm() {
		return this.guidelineMetComm;
	}

	public void setGuidelineMetComm(String guidelineMetComm) {
		this.guidelineMetComm = guidelineMetComm;
	}

}
package com.medikm.dto;

/**
 * CaseQualityIndicator entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class CaseQualityIndicator implements java.io.Serializable {

	// Fields

	private CaseQualityIndicatorId id;
	private String answer;

	// Constructors

	/** default constructor */
	public CaseQualityIndicator() {
	}

	/** minimal constructor */
	public CaseQualityIndicator(CaseQualityIndicatorId id) {
		this.id = id;
	}

	/** full constructor */
	public CaseQualityIndicator(CaseQualityIndicatorId id, String answer) {
		this.id = id;
		this.answer = answer;
	}

	// Property accessors

	public CaseQualityIndicatorId getId() {
		return this.id;
	}

	public void setId(CaseQualityIndicatorId id) {
		this.id = id;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
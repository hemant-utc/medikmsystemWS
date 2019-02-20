package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * QualityIndicator entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class QualityIndicator implements java.io.Serializable {

	// Fields

	private Integer id;
	private QualityIndicatorType qualityIndicatorType;
	private String description;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private Timestamp creationTime;
	private Timestamp modificationTime;
	private Set caseQualityIndicators = new HashSet(0);

	// Constructors

	/** default constructor */
	public QualityIndicator() {
	}

	/** minimal constructor */
	public QualityIndicator(Integer id, QualityIndicatorType qualityIndicatorType, Timestamp creationTime,
			Timestamp modificationTime) {
		this.id = id;
		this.qualityIndicatorType = qualityIndicatorType;
		this.creationTime = creationTime;
		this.modificationTime = modificationTime;
	}

	/** full constructor */
	public QualityIndicator(Integer id, QualityIndicatorType qualityIndicatorType, String description, String option1,
			String option2, String option3, String option4, Timestamp creationTime, Timestamp modificationTime,
			Set caseQualityIndicators) {
		this.id = id;
		this.qualityIndicatorType = qualityIndicatorType;
		this.description = description;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.creationTime = creationTime;
		this.modificationTime = modificationTime;
		this.caseQualityIndicators = caseQualityIndicators;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public QualityIndicatorType getQualityIndicatorType() {
		return this.qualityIndicatorType;
	}

	public void setQualityIndicatorType(QualityIndicatorType qualityIndicatorType) {
		this.qualityIndicatorType = qualityIndicatorType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOption1() {
		return this.option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return this.option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return this.option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return this.option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public Timestamp getModificationTime() {
		return this.modificationTime;
	}

	public void setModificationTime(Timestamp modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Set getCaseQualityIndicators() {
		return this.caseQualityIndicators;
	}

	public void setCaseQualityIndicators(Set caseQualityIndicators) {
		this.caseQualityIndicators = caseQualityIndicators;
	}

}
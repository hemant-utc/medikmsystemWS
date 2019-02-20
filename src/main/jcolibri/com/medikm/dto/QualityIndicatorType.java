package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * QualityIndicatorType entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class QualityIndicatorType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String indicatorName;
	private Set qualityIndicators = new HashSet(0);

	// Constructors

	/** default constructor */
	public QualityIndicatorType() {
	}

	/** minimal constructor */
	public QualityIndicatorType(Integer typeId, String indicatorName) {
		this.typeId = typeId;
		this.indicatorName = indicatorName;
	}

	/** full constructor */
	public QualityIndicatorType(Integer typeId, String indicatorName, Set qualityIndicators) {
		this.typeId = typeId;
		this.indicatorName = indicatorName;
		this.qualityIndicators = qualityIndicators;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getIndicatorName() {
		return this.indicatorName;
	}

	public void setIndicatorName(String indicatorName) {
		this.indicatorName = indicatorName;
	}

	public Set getQualityIndicators() {
		return this.qualityIndicators;
	}

	public void setQualityIndicators(Set qualityIndicators) {
		this.qualityIndicators = qualityIndicators;
	}

}
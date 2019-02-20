package com.medikm.dto;

/**
 * CaseQualityIndicatorId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class CaseQualityIndicatorId implements java.io.Serializable {

	// Fields

	private QualityIndicator qualityIndicator;
	private Case1 case1;

	// Constructors

	/** default constructor */
	public CaseQualityIndicatorId() {
	}

	/** full constructor */
	public CaseQualityIndicatorId(QualityIndicator qualityIndicator, Case1 case1) {
		this.qualityIndicator = qualityIndicator;
		this.case1 = case1;
	}

	// Property accessors

	public QualityIndicator getQualityIndicator() {
		return this.qualityIndicator;
	}

	public void setQualityIndicator(QualityIndicator qualityIndicator) {
		this.qualityIndicator = qualityIndicator;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CaseQualityIndicatorId))
			return false;
		CaseQualityIndicatorId castOther = (CaseQualityIndicatorId) other;

		return ((this.getQualityIndicator() == castOther.getQualityIndicator())
				|| (this.getQualityIndicator() != null && castOther.getQualityIndicator() != null
						&& this.getQualityIndicator().equals(castOther.getQualityIndicator())))
				&& ((this.getCase1() == castOther.getCase1()) || (this.getCase1() != null
						&& castOther.getCase1() != null && this.getCase1().equals(castOther.getCase1())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getQualityIndicator() == null ? 0 : this.getQualityIndicator().hashCode());
		result = 37 * result + (getCase1() == null ? 0 : this.getCase1().hashCode());
		return result;
	}

}
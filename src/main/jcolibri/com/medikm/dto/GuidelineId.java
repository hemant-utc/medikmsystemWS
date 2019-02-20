package com.medikm.dto;

/**
 * GuidelineId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class GuidelineId implements java.io.Serializable {

	// Fields

	private Integer guidelineId;
	private Integer stepId;

	// Constructors

	/** default constructor */
	public GuidelineId() {
	}

	/** full constructor */
	public GuidelineId(Integer guidelineId, Integer stepId) {
		this.guidelineId = guidelineId;
		this.stepId = stepId;
	}

	// Property accessors

	public Integer getGuidelineId() {
		return this.guidelineId;
	}

	public void setGuidelineId(Integer guidelineId) {
		this.guidelineId = guidelineId;
	}

	public Integer getStepId() {
		return this.stepId;
	}

	public void setStepId(Integer stepId) {
		this.stepId = stepId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GuidelineId))
			return false;
		GuidelineId castOther = (GuidelineId) other;

		return ((this.getGuidelineId() == castOther.getGuidelineId()) || (this.getGuidelineId() != null
				&& castOther.getGuidelineId() != null && this.getGuidelineId().equals(castOther.getGuidelineId())))
				&& ((this.getStepId() == castOther.getStepId()) || (this.getStepId() != null
						&& castOther.getStepId() != null && this.getStepId().equals(castOther.getStepId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGuidelineId() == null ? 0 : this.getGuidelineId().hashCode());
		result = 37 * result + (getStepId() == null ? 0 : this.getStepId().hashCode());
		return result;
	}

}
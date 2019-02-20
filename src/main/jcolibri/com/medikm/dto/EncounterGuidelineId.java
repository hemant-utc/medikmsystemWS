package com.medikm.dto;

/**
 * EncounterGuidelineId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EncounterGuidelineId implements java.io.Serializable {

	// Fields

	private Encounter encounter;
	private Integer guidelineId;
	private Integer guidelineStepId;

	// Constructors

	/** default constructor */
	public EncounterGuidelineId() {
	}

	/** full constructor */
	public EncounterGuidelineId(Encounter encounter, Integer guidelineId, Integer guidelineStepId) {
		this.encounter = encounter;
		this.guidelineId = guidelineId;
		this.guidelineStepId = guidelineStepId;
	}

	// Property accessors

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public Integer getGuidelineId() {
		return this.guidelineId;
	}

	public void setGuidelineId(Integer guidelineId) {
		this.guidelineId = guidelineId;
	}

	public Integer getGuidelineStepId() {
		return this.guidelineStepId;
	}

	public void setGuidelineStepId(Integer guidelineStepId) {
		this.guidelineStepId = guidelineStepId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EncounterGuidelineId))
			return false;
		EncounterGuidelineId castOther = (EncounterGuidelineId) other;

		return ((this.getEncounter() == castOther.getEncounter()) || (this.getEncounter() != null
				&& castOther.getEncounter() != null && this.getEncounter().equals(castOther.getEncounter())))
				&& ((this.getGuidelineId() == castOther.getGuidelineId())
						|| (this.getGuidelineId() != null && castOther.getGuidelineId() != null
								&& this.getGuidelineId().equals(castOther.getGuidelineId())))
				&& ((this.getGuidelineStepId() == castOther.getGuidelineStepId())
						|| (this.getGuidelineStepId() != null && castOther.getGuidelineStepId() != null
								&& this.getGuidelineStepId().equals(castOther.getGuidelineStepId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEncounter() == null ? 0 : this.getEncounter().hashCode());
		result = 37 * result + (getGuidelineId() == null ? 0 : this.getGuidelineId().hashCode());
		result = 37 * result + (getGuidelineStepId() == null ? 0 : this.getGuidelineStepId().hashCode());
		return result;
	}

}
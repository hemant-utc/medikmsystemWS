package com.medikm.dto;

/**
 * TargetedTherapyId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class TargetedTherapyId implements java.io.Serializable {

	// Fields

	private Episode episode;
	private TargetedType targetedType;

	// Constructors

	/** default constructor */
	public TargetedTherapyId() {
	}

	/** full constructor */
	public TargetedTherapyId(Episode episode, TargetedType targetedType) {
		this.episode = episode;
		this.targetedType = targetedType;
	}

	// Property accessors

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public TargetedType getTargetedType() {
		return this.targetedType;
	}

	public void setTargetedType(TargetedType targetedType) {
		this.targetedType = targetedType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TargetedTherapyId))
			return false;
		TargetedTherapyId castOther = (TargetedTherapyId) other;

		return ((this.getEpisode() == castOther.getEpisode()) || (this.getEpisode() != null
				&& castOther.getEpisode() != null && this.getEpisode().equals(castOther.getEpisode())))
				&& ((this.getTargetedType() == castOther.getTargetedType())
						|| (this.getTargetedType() != null && castOther.getTargetedType() != null
								&& this.getTargetedType().equals(castOther.getTargetedType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEpisode() == null ? 0 : this.getEpisode().hashCode());
		result = 37 * result + (getTargetedType() == null ? 0 : this.getTargetedType().hashCode());
		return result;
	}

}
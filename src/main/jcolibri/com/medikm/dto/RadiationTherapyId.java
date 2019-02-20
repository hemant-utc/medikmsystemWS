package com.medikm.dto;

/**
 * RadiationTherapyId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class RadiationTherapyId implements java.io.Serializable {

	// Fields

	private Episode episode;
	private RadiationType radiationType;

	// Constructors

	/** default constructor */
	public RadiationTherapyId() {
	}

	/** full constructor */
	public RadiationTherapyId(Episode episode, RadiationType radiationType) {
		this.episode = episode;
		this.radiationType = radiationType;
	}

	// Property accessors

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public RadiationType getRadiationType() {
		return this.radiationType;
	}

	public void setRadiationType(RadiationType radiationType) {
		this.radiationType = radiationType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RadiationTherapyId))
			return false;
		RadiationTherapyId castOther = (RadiationTherapyId) other;

		return ((this.getEpisode() == castOther.getEpisode()) || (this.getEpisode() != null
				&& castOther.getEpisode() != null && this.getEpisode().equals(castOther.getEpisode())))
				&& ((this.getRadiationType() == castOther.getRadiationType())
						|| (this.getRadiationType() != null && castOther.getRadiationType() != null
								&& this.getRadiationType().equals(castOther.getRadiationType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEpisode() == null ? 0 : this.getEpisode().hashCode());
		result = 37 * result + (getRadiationType() == null ? 0 : this.getRadiationType().hashCode());
		return result;
	}

}
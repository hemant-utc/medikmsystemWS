package com.medikm.dto;

/**
 * EpisodePhysicianId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EpisodePhysicianId implements java.io.Serializable {

	// Fields

	private Episode episode;
	private Physician physician;

	// Constructors

	/** default constructor */
	public EpisodePhysicianId() {
	}

	/** full constructor */
	public EpisodePhysicianId(Episode episode, Physician physician) {
		this.episode = episode;
		this.physician = physician;
	}

	// Property accessors

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EpisodePhysicianId))
			return false;
		EpisodePhysicianId castOther = (EpisodePhysicianId) other;

		return ((this.getEpisode() == castOther.getEpisode()) || (this.getEpisode() != null
				&& castOther.getEpisode() != null && this.getEpisode().equals(castOther.getEpisode())))
				&& ((this.getPhysician() == castOther.getPhysician()) || (this.getPhysician() != null
						&& castOther.getPhysician() != null && this.getPhysician().equals(castOther.getPhysician())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEpisode() == null ? 0 : this.getEpisode().hashCode());
		result = 37 * result + (getPhysician() == null ? 0 : this.getPhysician().hashCode());
		return result;
	}

}
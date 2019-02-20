package com.medikm.dto;

/**
 * ChemotherapyId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class ChemotherapyId implements java.io.Serializable {

	// Fields

	private Episode episode;
	private ChemoType chemoType;

	// Constructors

	/** default constructor */
	public ChemotherapyId() {
	}

	/** full constructor */
	public ChemotherapyId(Episode episode, ChemoType chemoType) {
		this.episode = episode;
		this.chemoType = chemoType;
	}

	// Property accessors

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public ChemoType getChemoType() {
		return this.chemoType;
	}

	public void setChemoType(ChemoType chemoType) {
		this.chemoType = chemoType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChemotherapyId))
			return false;
		ChemotherapyId castOther = (ChemotherapyId) other;

		return ((this.getEpisode() == castOther.getEpisode()) || (this.getEpisode() != null
				&& castOther.getEpisode() != null && this.getEpisode().equals(castOther.getEpisode())))
				&& ((this.getChemoType() == castOther.getChemoType()) || (this.getChemoType() != null
						&& castOther.getChemoType() != null && this.getChemoType().equals(castOther.getChemoType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEpisode() == null ? 0 : this.getEpisode().hashCode());
		result = 37 * result + (getChemoType() == null ? 0 : this.getChemoType().hashCode());
		return result;
	}

}
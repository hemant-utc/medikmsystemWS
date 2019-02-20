package com.medikm.dto;

/**
 * PrognosticFactorId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class PrognosticFactorId implements java.io.Serializable {

	// Fields

	private Episode episode;
	private ProgFactType progFactType;

	// Constructors

	/** default constructor */
	public PrognosticFactorId() {
	}

	/** full constructor */
	public PrognosticFactorId(Episode episode, ProgFactType progFactType) {
		this.episode = episode;
		this.progFactType = progFactType;
	}

	// Property accessors

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public ProgFactType getProgFactType() {
		return this.progFactType;
	}

	public void setProgFactType(ProgFactType progFactType) {
		this.progFactType = progFactType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrognosticFactorId))
			return false;
		PrognosticFactorId castOther = (PrognosticFactorId) other;

		return ((this.getEpisode() == castOther.getEpisode()) || (this.getEpisode() != null
				&& castOther.getEpisode() != null && this.getEpisode().equals(castOther.getEpisode())))
				&& ((this.getProgFactType() == castOther.getProgFactType())
						|| (this.getProgFactType() != null && castOther.getProgFactType() != null
								&& this.getProgFactType().equals(castOther.getProgFactType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEpisode() == null ? 0 : this.getEpisode().hashCode());
		result = 37 * result + (getProgFactType() == null ? 0 : this.getProgFactType().hashCode());
		return result;
	}

}
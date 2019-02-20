package com.medikm.dto;

/**
 * EndocrineTherapyId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EndocrineTherapyId implements java.io.Serializable {

	// Fields

	private Episode episode;
	private EndotherapyType endotherapyType;

	// Constructors

	/** default constructor */
	public EndocrineTherapyId() {
	}

	/** full constructor */
	public EndocrineTherapyId(Episode episode, EndotherapyType endotherapyType) {
		this.episode = episode;
		this.endotherapyType = endotherapyType;
	}

	// Property accessors

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public EndotherapyType getEndotherapyType() {
		return this.endotherapyType;
	}

	public void setEndotherapyType(EndotherapyType endotherapyType) {
		this.endotherapyType = endotherapyType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EndocrineTherapyId))
			return false;
		EndocrineTherapyId castOther = (EndocrineTherapyId) other;

		return ((this.getEpisode() == castOther.getEpisode()) || (this.getEpisode() != null
				&& castOther.getEpisode() != null && this.getEpisode().equals(castOther.getEpisode())))
				&& ((this.getEndotherapyType() == castOther.getEndotherapyType())
						|| (this.getEndotherapyType() != null && castOther.getEndotherapyType() != null
								&& this.getEndotherapyType().equals(castOther.getEndotherapyType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEpisode() == null ? 0 : this.getEpisode().hashCode());
		result = 37 * result + (getEndotherapyType() == null ? 0 : this.getEndotherapyType().hashCode());
		return result;
	}

}
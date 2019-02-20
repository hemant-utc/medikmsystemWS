package com.medikm.dto;

import java.sql.Timestamp;

/**
 * CancerStageId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class CancerStageId implements java.io.Serializable {

	// Fields

	private Episode episode;
	private Timestamp stageDt;

	// Constructors

	/** default constructor */
	public CancerStageId() {
	}

	/** full constructor */
	public CancerStageId(Episode episode, Timestamp stageDt) {
		this.episode = episode;
		this.stageDt = stageDt;
	}

	// Property accessors

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public Timestamp getStageDt() {
		return this.stageDt;
	}

	public void setStageDt(Timestamp stageDt) {
		this.stageDt = stageDt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CancerStageId))
			return false;
		CancerStageId castOther = (CancerStageId) other;

		return ((this.getEpisode() == castOther.getEpisode()) || (this.getEpisode() != null
				&& castOther.getEpisode() != null && this.getEpisode().equals(castOther.getEpisode())))
				&& ((this.getStageDt() == castOther.getStageDt()) || (this.getStageDt() != null
						&& castOther.getStageDt() != null && this.getStageDt().equals(castOther.getStageDt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEpisode() == null ? 0 : this.getEpisode().hashCode());
		result = 37 * result + (getStageDt() == null ? 0 : this.getStageDt().hashCode());
		return result;
	}

}
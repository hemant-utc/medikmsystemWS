package com.medikm.dto;

/**
 * RiskReductionId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class RiskReductionId implements java.io.Serializable {

	// Fields

	private Integer rrStrategyId;
	private Episode episode;

	// Constructors

	/** default constructor */
	public RiskReductionId() {
	}

	/** full constructor */
	public RiskReductionId(Integer rrStrategyId, Episode episode) {
		this.rrStrategyId = rrStrategyId;
		this.episode = episode;
	}

	// Property accessors

	public Integer getRrStrategyId() {
		return this.rrStrategyId;
	}

	public void setRrStrategyId(Integer rrStrategyId) {
		this.rrStrategyId = rrStrategyId;
	}

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RiskReductionId))
			return false;
		RiskReductionId castOther = (RiskReductionId) other;

		return ((this.getRrStrategyId() == castOther.getRrStrategyId()) || (this.getRrStrategyId() != null
				&& castOther.getRrStrategyId() != null && this.getRrStrategyId().equals(castOther.getRrStrategyId())))
				&& ((this.getEpisode() == castOther.getEpisode()) || (this.getEpisode() != null
						&& castOther.getEpisode() != null && this.getEpisode().equals(castOther.getEpisode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRrStrategyId() == null ? 0 : this.getRrStrategyId().hashCode());
		result = 37 * result + (getEpisode() == null ? 0 : this.getEpisode().hashCode());
		return result;
	}

}
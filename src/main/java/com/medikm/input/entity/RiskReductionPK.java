/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Saikat
 */
@SuppressWarnings("serial")
@Embeddable
public class RiskReductionPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "RR_Strategy_Id")
	private int rRStrategyId;
	@Basic(optional = false)
	@Column(name = "Episode_Id")
	private int episodeId;

	public RiskReductionPK() {
	}

	public RiskReductionPK(int rRStrategyId, int episodeId) {
		this.rRStrategyId = rRStrategyId;
		this.episodeId = episodeId;
	}

	public int getRRStrategyId() {
		return rRStrategyId;
	}

	public void setRRStrategyId(int rRStrategyId) {
		this.rRStrategyId = rRStrategyId;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) rRStrategyId;
		hash += (int) episodeId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RiskReductionPK)) {
			return false;
		}
		RiskReductionPK other = (RiskReductionPK) object;
		if (this.rRStrategyId != other.rRStrategyId) {
			return false;
		}
		if (this.episodeId != other.episodeId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.RiskReductionPK[ rRStrategyId=" + rRStrategyId + ", episodeId=" + episodeId
				+ " ]";
	}

}

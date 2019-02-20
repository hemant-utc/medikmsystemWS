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
public class PrognosticFactorPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "Episode_Id")
	private int episodeId;
	@Basic(optional = false)
	@Column(name = "Prog_Fact_Id")
	private int progFactId;

	public PrognosticFactorPK() {
	}

	public PrognosticFactorPK(int episodeId, int progFactId) {
		this.episodeId = episodeId;
		this.progFactId = progFactId;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
	}

	public int getProgFactId() {
		return progFactId;
	}

	public void setProgFactId(int progFactId) {
		this.progFactId = progFactId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) episodeId;
		hash += (int) progFactId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrognosticFactorPK)) {
			return false;
		}
		PrognosticFactorPK other = (PrognosticFactorPK) object;
		if (this.episodeId != other.episodeId) {
			return false;
		}
		if (this.progFactId != other.progFactId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PrognosticFactorPK[ episodeId=" + episodeId + ", progFactId=" + progFactId
				+ " ]";
	}

}

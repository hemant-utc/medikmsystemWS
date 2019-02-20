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
public class EndocrineTherapyPK implements Serializable {
	@Basic(optional = false)
	@Column(name = "Episode_Id")
	private int episodeId;
	@Basic(optional = false)
	@Column(name = "Episode_Endo_Therapy_Id")
	private int episodeEndoTherapyId;

	public EndocrineTherapyPK() {
	}

	public EndocrineTherapyPK(int episodeId, int episodeEndoTherapyId) {
		this.episodeId = episodeId;
		this.episodeEndoTherapyId = episodeEndoTherapyId;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
	}

	public int getEpisodeEndoTherapyId() {
		return episodeEndoTherapyId;
	}

	public void setEpisodeEndoTherapyId(int episodeEndoTherapyId) {
		this.episodeEndoTherapyId = episodeEndoTherapyId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) episodeId;
		hash += (int) episodeEndoTherapyId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EndocrineTherapyPK)) {
			return false;
		}
		EndocrineTherapyPK other = (EndocrineTherapyPK) object;
		if (this.episodeId != other.episodeId) {
			return false;
		}
		if (this.episodeEndoTherapyId != other.episodeEndoTherapyId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EndocrineTherapyPK[ episodeId=" + episodeId + ", episodeEndoTherapyId="
				+ episodeEndoTherapyId + " ]";
	}

}

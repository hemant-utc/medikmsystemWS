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
public class TargetedTherapyPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "Episode_Id")
	private int episodeId;
	@Basic(optional = false)
	@Column(name = "Episode_Targ_Therapy_Id")
	private int episodeTargTherapyId;

	public TargetedTherapyPK() {
	}

	public TargetedTherapyPK(int episodeId, int episodeTargTherapyId) {
		this.episodeId = episodeId;
		this.episodeTargTherapyId = episodeTargTherapyId;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
	}

	public int getEpisodeTargTherapyId() {
		return episodeTargTherapyId;
	}

	public void setEpisodeTargTherapyId(int episodeTargTherapyId) {
		this.episodeTargTherapyId = episodeTargTherapyId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) episodeId;
		hash += (int) episodeTargTherapyId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TargetedTherapyPK)) {
			return false;
		}
		TargetedTherapyPK other = (TargetedTherapyPK) object;
		if (this.episodeId != other.episodeId) {
			return false;
		}
		if (this.episodeTargTherapyId != other.episodeTargTherapyId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TargetedTherapyPK[ episodeId=" + episodeId + ", episodeTargTherapyId="
				+ episodeTargTherapyId + " ]";
	}

}

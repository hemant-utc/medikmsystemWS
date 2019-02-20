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
public class EpisodePhysicianPK implements Serializable {

	@Basic(optional = false)
	@Column(name = "Episode_Id")
	private int episodeId;
	@Basic(optional = false)
	@Column(name = "Physician_Id")
	private int physicianId;

	public EpisodePhysicianPK() {
	}

	public EpisodePhysicianPK(int episodeId, int physicianId) {
		this.episodeId = episodeId;
		this.physicianId = physicianId;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
	}

	public int getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(int physicianId) {
		this.physicianId = physicianId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) episodeId;
		hash += (int) physicianId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EpisodePhysicianPK)) {
			return false;
		}
		EpisodePhysicianPK other = (EpisodePhysicianPK) object;
		if (this.episodeId != other.episodeId) {
			return false;
		}
		if (this.physicianId != other.physicianId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EpisodePhysicianPK[ episodeId=" + episodeId + ", physicianId=" + physicianId
				+ " ]";
	}

}

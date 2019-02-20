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
public class RadiationTherapyPK implements Serializable {
	@Basic(optional = false)
	@Column(name = "Episode_Id")
	private int episodeId;
	@Basic(optional = false)
	@Column(name = "Rad_Type_Id")
	private int radTypeId;

	public RadiationTherapyPK() {
	}

	public RadiationTherapyPK(int episodeId, int radTypeId) {
		this.episodeId = episodeId;
		this.radTypeId = radTypeId;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
	}

	public int getRadTypeId() {
		return radTypeId;
	}

	public void setRadTypeId(int radTypeId) {
		this.radTypeId = radTypeId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) episodeId;
		hash += (int) radTypeId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RadiationTherapyPK)) {
			return false;
		}
		RadiationTherapyPK other = (RadiationTherapyPK) object;
		if (this.episodeId != other.episodeId) {
			return false;
		}
		if (this.radTypeId != other.radTypeId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.RadiationTherapyPK[ episodeId=" + episodeId + ", radTypeId=" + radTypeId + " ]";
	}

}

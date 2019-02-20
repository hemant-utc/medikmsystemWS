/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Saikat
 */
@Embeddable
public class CancerStagePK implements Serializable {
	private static final long serialVersionUID = 1450467188989205899L;

	@Basic(optional = false)
	@Column(name = "Episode_Id")
	private int episodeId;
	@Basic(optional = false)
	@Column(name = "Stage_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date stageDt;

	public CancerStagePK() {
	}

	public CancerStagePK(int episodeId, Date stageDt) {
		this.episodeId = episodeId;
		this.stageDt = stageDt;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
	}

	public Date getStageDt() {
		return stageDt;
	}

	public void setStageDt(Date stageDt) {
		this.stageDt = stageDt;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) episodeId;
		hash += (stageDt != null ? stageDt.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CancerStagePK)) {
			return false;
		}
		CancerStagePK other = (CancerStagePK) object;
		if (this.episodeId != other.episodeId) {
			return false;
		}
		if ((this.stageDt == null && other.stageDt != null)
				|| (this.stageDt != null && !this.stageDt.equals(other.stageDt))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CancerStagePK[ episodeId=" + episodeId + ", stageDt=" + stageDt + " ]";
	}

}

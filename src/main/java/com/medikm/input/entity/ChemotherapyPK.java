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
@Embeddable
public class ChemotherapyPK implements Serializable {
	private static final long serialVersionUID = 1018787539936768220L;

	@Basic(optional = false)
	@Column(name = "Episode_Id")
	private int episodeId;
	@Basic(optional = false)
	@Column(name = "Ctpy_Type_Id")
	private int ctpyTypeId;

	public ChemotherapyPK() {
	}

	public ChemotherapyPK(int episodeId, int ctpyTypeId) {
		this.episodeId = episodeId;
		this.ctpyTypeId = ctpyTypeId;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
	}

	public int getCtpyTypeId() {
		return ctpyTypeId;
	}

	public void setCtpyTypeId(int ctpyTypeId) {
		this.ctpyTypeId = ctpyTypeId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) episodeId;
		hash += (int) ctpyTypeId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ChemotherapyPK)) {
			return false;
		}
		ChemotherapyPK other = (ChemotherapyPK) object;
		if (this.episodeId != other.episodeId) {
			return false;
		}
		if (this.ctpyTypeId != other.ctpyTypeId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ChemotherapyPK[ episodeId=" + episodeId + ", ctpyTypeId=" + ctpyTypeId + " ]";
	}

}

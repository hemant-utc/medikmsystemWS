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
public class BiopsyPK implements Serializable {
	private static final long serialVersionUID = -2946949380399627608L;

	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private int encounterId;
	@Basic(optional = false)
	@Column(name = "Biopsy_Id")
	private int biopsyId;

	public BiopsyPK() {
	}

	public BiopsyPK(int encounterId, int biopsyId) {
		this.encounterId = encounterId;
		this.biopsyId = biopsyId;
	}

	public int getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}

	public int getBiopsyId() {
		return biopsyId;
	}

	public void setBiopsyId(int biopsyId) {
		this.biopsyId = biopsyId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) encounterId;
		hash += (int) biopsyId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof BiopsyPK)) {
			return false;
		}
		BiopsyPK other = (BiopsyPK) object;
		if (this.encounterId != other.encounterId) {
			return false;
		}
		if (this.biopsyId != other.biopsyId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.BiopsyPK[ encounterId=" + encounterId + ", biopsyId=" + biopsyId + " ]";
	}

}

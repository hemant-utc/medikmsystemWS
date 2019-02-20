/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "encounter_guideline")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EncounterGuideline.findAll", query = "SELECT e FROM EncounterGuideline e") })
public class EncounterGuideline implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected EncounterGuidelinePK encounterGuidelinePK;
	@Column(name = "Guideline_Met")
	private Short guidelineMet;
	@Lob
	@Column(name = "Guideline_Met_Comm")
	private String guidelineMetComm;

	public EncounterGuideline() {
	}

	public EncounterGuideline(EncounterGuidelinePK encounterGuidelinePK) {
		this.encounterGuidelinePK = encounterGuidelinePK;
	}

	public EncounterGuideline(int encounterId, int guidelineId, int guidelineStepId) {
		this.encounterGuidelinePK = new EncounterGuidelinePK(encounterId, guidelineId, guidelineStepId);
	}

	public EncounterGuidelinePK getEncounterGuidelinePK() {
		return encounterGuidelinePK;
	}

	public void setEncounterGuidelinePK(EncounterGuidelinePK encounterGuidelinePK) {
		this.encounterGuidelinePK = encounterGuidelinePK;
	}

	public Short getGuidelineMet() {
		return guidelineMet;
	}

	public void setGuidelineMet(Short guidelineMet) {
		this.guidelineMet = guidelineMet;
	}

	public String getGuidelineMetComm() {
		return guidelineMetComm;
	}

	public void setGuidelineMetComm(String guidelineMetComm) {
		this.guidelineMetComm = guidelineMetComm;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterGuidelinePK != null ? encounterGuidelinePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EncounterGuideline)) {
			return false;
		}
		EncounterGuideline other = (EncounterGuideline) object;
		if ((this.encounterGuidelinePK == null && other.encounterGuidelinePK != null)
				|| (this.encounterGuidelinePK != null
						&& !this.encounterGuidelinePK.equals(other.encounterGuidelinePK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EncounterGuideline[ encounterGuidelinePK=" + encounterGuidelinePK + " ]";
	}

}

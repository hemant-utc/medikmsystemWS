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
public class GuidelinePK implements Serializable {
	
	@Basic(optional = false)
	@Column(name = "Guideline_Id")
	private int guidelineId;
	@Basic(optional = false)
	@Column(name = "Step_Id")
	private int stepId;

	public GuidelinePK() {
	}

	public GuidelinePK(int guidelineId, int stepId) {
		this.guidelineId = guidelineId;
		this.stepId = stepId;
	}

	public int getGuidelineId() {
		return guidelineId;
	}

	public void setGuidelineId(int guidelineId) {
		this.guidelineId = guidelineId;
	}

	public int getStepId() {
		return stepId;
	}

	public void setStepId(int stepId) {
		this.stepId = stepId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) guidelineId;
		hash += (int) stepId;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof GuidelinePK)) {
			return false;
		}
		GuidelinePK other = (GuidelinePK) object;
		if (this.guidelineId != other.guidelineId) {
			return false;
		}
		if (this.stepId != other.stepId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.GuidelinePK[ guidelineId=" + guidelineId + ", stepId=" + stepId + " ]";
	}

}

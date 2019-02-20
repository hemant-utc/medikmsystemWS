package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class CaseQualityIndicatorPK implements Serializable{
	
	@Basic(optional = false)
	@Column(name = "case_Id")
    private int caseId;
	@Basic(optional = false)
	@Column(name = "quality_indicator")
    private int qualityIndicator;
	public int getCaseId() {
		return caseId;
	}
	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}
	public int getQualityIndicator() {
		return qualityIndicator;
	}
	public void setQualityIndicator(int qualityIndicator) {
		this.qualityIndicator = qualityIndicator;
	}
	
	public CaseQualityIndicatorPK() {
	}
	public CaseQualityIndicatorPK(int caseId,int qualityIndicator) {
		this.caseId = caseId;
		this.qualityIndicator = qualityIndicator;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caseId;
		result = prime * result + qualityIndicator;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CaseQualityIndicatorPK other = (CaseQualityIndicatorPK) obj;
		if (caseId != other.caseId)
			return false;
		if (qualityIndicator != other.qualityIndicator)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CaseQualityIndicatorPK [caseId=" + caseId
				+ ", qualityIndicator=" + qualityIndicator + "]";
	}
	
}

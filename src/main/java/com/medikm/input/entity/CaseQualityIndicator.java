/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ROHITPATEL
 */
@Entity
@Table(name = "case_quality_indicator")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CaseQualityIndicator.findAll", query = "SELECT c FROM CaseQualityIndicator c"),
		@NamedQuery(name = "CaseQualityIndicator.findByAnswer", query = "SELECT c FROM CaseQualityIndicator c WHERE c.answer = :answer") })
public class CaseQualityIndicator implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected CaseQualityIndicatorPK caseQualityIndicatorPK;
	@Column(name = "answer")
	private String answer;
	@JoinColumn(name = "case_Id", referencedColumnName = "Case_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Case1 caseId;
	@JoinColumn(name = "quality_indicator", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private QualityIndicator qualityIndicator;

	public CaseQualityIndicator() {
	}

	public CaseQualityIndicator(CaseQualityIndicatorPK caseQualityIndicatorPK) {
		this.caseQualityIndicatorPK = caseQualityIndicatorPK;
	}

	public CaseQualityIndicator(int caseId, int qualityIndicator) {
		this.caseQualityIndicatorPK = new CaseQualityIndicatorPK(caseId, qualityIndicator);
	}

	public CaseQualityIndicatorPK getCaseQualityIndicatorPK() {
		return caseQualityIndicatorPK;
	}

	public void setCaseQualityIndicatorPK(CaseQualityIndicatorPK caseQualityIndicatorPK) {
		this.caseQualityIndicatorPK = caseQualityIndicatorPK;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public QualityIndicator getQualityIndicator() {
		return qualityIndicator;
	}

	public void setQualityIndicator(QualityIndicator qualityIndicator) {
		this.qualityIndicator = qualityIndicator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caseQualityIndicatorPK == null) ? 0 : caseQualityIndicatorPK.hashCode());
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
		CaseQualityIndicator other = (CaseQualityIndicator) obj;
		if (caseQualityIndicatorPK == null) {
			if (other.caseQualityIndicatorPK != null)
				return false;
		} else if (!caseQualityIndicatorPK.equals(other.caseQualityIndicatorPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CaseQualityIndicator [caseQualityIndicatorPK=" + caseQualityIndicatorPK + "]";
	}

}

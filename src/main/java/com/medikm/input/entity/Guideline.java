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
@Table(name = "guideline")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Guideline.findAll", query = "SELECT g FROM Guideline g") })
public class Guideline implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected GuidelinePK guidelinePK;
	@Lob
	@Column(name = "Guideline_Name")
	private String guidelineName;
	@Column(name = "Flowchart")
	private String flowchart;
	@Lob
	@Column(name = "Details")
	private String details;
	@Column(name = "Guideline_FileName")
	private String guidelineFileName;

	public Guideline() {
	}

	public Guideline(GuidelinePK guidelinePK) {
		this.guidelinePK = guidelinePK;
	}

	public Guideline(int guidelineId, int stepId) {
		this.guidelinePK = new GuidelinePK(guidelineId, stepId);
	}

	public GuidelinePK getGuidelinePK() {
		return guidelinePK;
	}

	public void setGuidelinePK(GuidelinePK guidelinePK) {
		this.guidelinePK = guidelinePK;
	}

	public String getGuidelineName() {
		return guidelineName;
	}

	public void setGuidelineName(String guidelineName) {
		this.guidelineName = guidelineName;
	}

	public String getFlowchart() {
		return flowchart;
	}

	public void setFlowchart(String flowchart) {
		this.flowchart = flowchart;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getGuidelineFileName() {
		return guidelineFileName;
	}

	public void setGuidelineFileName(String guidelineFileName) {
		this.guidelineFileName = guidelineFileName;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (guidelinePK != null ? guidelinePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Guideline)) {
			return false;
		}
		Guideline other = (Guideline) object;
		if ((this.guidelinePK == null && other.guidelinePK != null)
				|| (this.guidelinePK != null && !this.guidelinePK.equals(other.guidelinePK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Guideline[ guidelinePK=" + guidelinePK + " ]";
	}

}

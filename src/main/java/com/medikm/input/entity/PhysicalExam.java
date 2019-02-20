/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "physical_exam")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "PhysicalExam.findAll", query = "SELECT p FROM PhysicalExam p") })
public class PhysicalExam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "foreign")
	@GenericGenerator(name = "foreign", strategy = "foreign", parameters = {
			@Parameter(name = "property", value = "encounter") })
	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private Integer encounterId;
	@Column(name = "CBE_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date cBEDt;
	@Lob
	@Column(name = "CBE_Report")
	private String cBEReport;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "Performance_Score")
	private Double performanceScore;
	@Column(name = "CBE_Normal")
	private Short cBENormal;
	@Column(name = "Palpable_Nodes")
	private Short palpableNodes;
	@Column(name = "Skin_Changes")
	private Short skinChanges;
	@Column(name = "Nipple_Changes")
	private Short nippleChanges;

	@PrimaryKeyJoinColumn(name = "Encounter_Id", referencedColumnName = "Encounter_Id")
	@OneToOne(optional = false)
	private Encounter encounter;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne
	private Case1 caseId;

	public PhysicalExam() {
	}

	public PhysicalExam(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Integer getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Date getCBEDt() {
		return cBEDt;
	}

	public void setCBEDt(Date cBEDt) {
		this.cBEDt = cBEDt;
	}

	public String getCBEReport() {
		return cBEReport;
	}

	public void setCBEReport(String cBEReport) {
		this.cBEReport = cBEReport;
	}

	public Double getPerformanceScore() {
		return performanceScore;
	}

	public void setPerformanceScore(Double performanceScore) {
		this.performanceScore = performanceScore;
	}

	public Short getCBENormal() {
		return cBENormal;
	}

	public void setCBENormal(Short cBENormal) {
		this.cBENormal = cBENormal;
	}

	public Short getPalpableNodes() {
		return palpableNodes;
	}

	public void setPalpableNodes(Short palpableNodes) {
		this.palpableNodes = palpableNodes;
	}

	public Short getSkinChanges() {
		return skinChanges;
	}

	public void setSkinChanges(Short skinChanges) {
		this.skinChanges = skinChanges;
	}

	public Short getNippleChanges() {
		return nippleChanges;
	}

	public void setNippleChanges(Short nippleChanges) {
		this.nippleChanges = nippleChanges;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterId != null ? encounterId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PhysicalExam)) {
			return false;
		}
		PhysicalExam other = (PhysicalExam) object;
		if ((this.encounterId == null && other.encounterId != null)
				|| (this.encounterId != null && !this.encounterId.equals(other.encounterId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PhysicalExam[ encounterId=" + encounterId + " ]";
	}

}

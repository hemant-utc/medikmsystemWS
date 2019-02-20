/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "targeted_therapy")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TargetedTherapy.findAll", query = "SELECT t FROM TargetedTherapy t") })
public class TargetedTherapy implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected TargetedTherapyPK targetedTherapyPK;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "Pre_Transtuzumab_Ejection_Fraction")
	private Double preTranstuzumabEjectionFraction;
	@Column(name = "Most_Recent_Ejection_Fraction_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date mostRecentEjectionFractionDt;
	@Lob
	@Column(name = "Anti_HER2_Realted_Complications")
	private String antiHER2RealtedComplications;
	@Lob
	@Column(name = "Bevacizumab_Avastin_realted_Complications")
	private String bevacizumabAvastinrealtedComplications;
	@Column(name = "Enrolled_Clinical_Trial")
	private Short enrolledClinicalTrial;
	@Column(name = "Eligible_Clinical_Trial")
	private Short eligibleClinicalTrial;
	@Column(name = "StartDt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDt;
	@Column(name = "End_Dt")
	@Temporal(TemporalType.DATE)
	private Date endDt;
	@JoinColumn(name = "Agent_Type_ID", referencedColumnName = "Type_Id")
	@ManyToOne
	private TtAgent agentTypeID;
	@JoinColumn(name = "Eligible_Clinical_Trial_ID", referencedColumnName = "Clinical_Trial_Id")
	@ManyToOne
	private ClinicalTrial eligibleClinicalTrialID;
	@JoinColumn(name = "Enrolled_Clinical_Trial_ID", referencedColumnName = "Clinical_Trial_Id")
	@ManyToOne
	private ClinicalTrial enrolledClinicalTrialID;

	@JoinColumn(name = "Episode_Targ_Therapy_Id", referencedColumnName = "Type_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private TargetedType targetedType;

	public TargetedTherapy() {
	}

	public TargetedTherapy(TargetedTherapyPK targetedTherapyPK) {
		this.targetedTherapyPK = targetedTherapyPK;
	}

	public TargetedTherapy(int episodeId, int episodeTargTherapyId) {
		this.targetedTherapyPK = new TargetedTherapyPK(episodeId, episodeTargTherapyId);
	}

	public TargetedTherapyPK getTargetedTherapyPK() {
		return targetedTherapyPK;
	}

	public void setTargetedTherapyPK(TargetedTherapyPK targetedTherapyPK) {
		this.targetedTherapyPK = targetedTherapyPK;
	}

	public Double getPreTranstuzumabEjectionFraction() {
		return preTranstuzumabEjectionFraction;
	}

	public void setPreTranstuzumabEjectionFraction(Double preTranstuzumabEjectionFraction) {
		this.preTranstuzumabEjectionFraction = preTranstuzumabEjectionFraction;
	}

	public Date getMostRecentEjectionFractionDt() {
		return mostRecentEjectionFractionDt;
	}

	public void setMostRecentEjectionFractionDt(Date mostRecentEjectionFractionDt) {
		this.mostRecentEjectionFractionDt = mostRecentEjectionFractionDt;
	}

	public String getAntiHER2RealtedComplications() {
		return antiHER2RealtedComplications;
	}

	public void setAntiHER2RealtedComplications(String antiHER2RealtedComplications) {
		this.antiHER2RealtedComplications = antiHER2RealtedComplications;
	}

	public String getBevacizumabAvastinrealtedComplications() {
		return bevacizumabAvastinrealtedComplications;
	}

	public void setBevacizumabAvastinrealtedComplications(String bevacizumabAvastinrealtedComplications) {
		this.bevacizumabAvastinrealtedComplications = bevacizumabAvastinrealtedComplications;
	}

	public Short getEnrolledClinicalTrial() {
		return enrolledClinicalTrial;
	}

	public void setEnrolledClinicalTrial(Short enrolledClinicalTrial) {
		this.enrolledClinicalTrial = enrolledClinicalTrial;
	}

	public Short getEligibleClinicalTrial() {
		return eligibleClinicalTrial;
	}

	public void setEligibleClinicalTrial(Short eligibleClinicalTrial) {
		this.eligibleClinicalTrial = eligibleClinicalTrial;
	}

	public Date getStartDt() {
		return startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public Date getEndDt() {
		return endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public TtAgent getAgentTypeID() {
		return agentTypeID;
	}

	public void setAgentTypeID(TtAgent agentTypeID) {
		this.agentTypeID = agentTypeID;
	}

	public ClinicalTrial getEligibleClinicalTrialID() {
		return eligibleClinicalTrialID;
	}

	public void setEligibleClinicalTrialID(ClinicalTrial eligibleClinicalTrialID) {
		this.eligibleClinicalTrialID = eligibleClinicalTrialID;
	}

	public ClinicalTrial getEnrolledClinicalTrialID() {
		return enrolledClinicalTrialID;
	}

	public void setEnrolledClinicalTrialID(ClinicalTrial enrolledClinicalTrialID) {
		this.enrolledClinicalTrialID = enrolledClinicalTrialID;
	}

	public TargetedType getTargetedType() {
		return targetedType;
	}

	public void setTargetedType(TargetedType targetedType) {
		this.targetedType = targetedType;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (targetedTherapyPK != null ? targetedTherapyPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TargetedTherapy)) {
			return false;
		}
		TargetedTherapy other = (TargetedTherapy) object;
		if ((this.targetedTherapyPK == null && other.targetedTherapyPK != null)
				|| (this.targetedTherapyPK != null && !this.targetedTherapyPK.equals(other.targetedTherapyPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TargetedTherapy[ targetedTherapyPK=" + targetedTherapyPK + " ]";
	}

}

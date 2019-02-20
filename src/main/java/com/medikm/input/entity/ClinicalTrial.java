/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "clinical_trial")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ClinicalTrial.findAll", query = "SELECT c FROM ClinicalTrial c") })
public class ClinicalTrial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Clinical_Trial_Id")
	private Integer clinicalTrialId;
	@Column(name = "Trial_Name")
	private String trialName;
	@Lob
	@Column(name = "Trial_Description")
	private String trialDescription;
	@Column(name = "Trial_Start_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date trialStartDt;
	@Column(name = "Trial_Completion_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date trialCompletionDt;
	@Column(name = "Trial_Phase")
	private Short trialPhase;
	@Column(name = "Trial_Primary_Objective")
	private String trialPrimaryObjective;
	@Column(name = "Trial_Status")
	private String trialStatus;
	@Lob
	@Column(name = "Inclusion_Criteria")
	private String inclusionCriteria;
	@Lob
	@Column(name = "Exclusion_Criteria")
	private String exclusionCriteria;
	@Column(name = "Sponsor")
	private String sponsor;
	@Column(name = "Trial_Participating_Sites")
	private String trialParticipatingSites;
	@OneToMany(mappedBy = "eligibleClinicalTrialID")
	private Collection<TargetedTherapy> targetedTherapyCollection;
	@OneToMany(mappedBy = "enrolledClinicalTrialID")
	private Collection<TargetedTherapy> targetedTherapyCollection1;
	@JoinColumn(name = "Trial_Type_Id", referencedColumnName = "Type_Id")
	@ManyToOne
	private TrialType trialTypeId;
	@JoinColumn(name = "Trial_Physician_Id", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician trialPhysicianId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clinicalTrial")
	private Collection<EncounterClinicalTrial> encounterClinicalTrialCollection;
	@OneToMany(mappedBy = "eligibleClinicalTrialID")
	private Collection<Chemotherapy> chemotherapyCollection;
	@OneToMany(mappedBy = "enrolledClinicalTrialID")
	private Collection<Chemotherapy> chemotherapyCollection1;
	@OneToMany(mappedBy = "eligibleClinicalTrialID")
	private Collection<EndocrineTherapy> endocrineTherapyCollection;
	@OneToMany(mappedBy = "enrolledClinicalTrialID")
	private Collection<EndocrineTherapy> endocrineTherapyCollection1;

	public ClinicalTrial() {
	}

	public ClinicalTrial(Integer clinicalTrialId) {
		this.clinicalTrialId = clinicalTrialId;
	}

	public Integer getClinicalTrialId() {
		return clinicalTrialId;
	}

	public void setClinicalTrialId(Integer clinicalTrialId) {
		this.clinicalTrialId = clinicalTrialId;
	}

	public String getTrialName() {
		return trialName;
	}

	public void setTrialName(String trialName) {
		this.trialName = trialName;
	}

	public String getTrialDescription() {
		return trialDescription;
	}

	public void setTrialDescription(String trialDescription) {
		this.trialDescription = trialDescription;
	}

	public Date getTrialStartDt() {
		return trialStartDt;
	}

	public void setTrialStartDt(Date trialStartDt) {
		this.trialStartDt = trialStartDt;
	}

	public Date getTrialCompletionDt() {
		return trialCompletionDt;
	}

	public void setTrialCompletionDt(Date trialCompletionDt) {
		this.trialCompletionDt = trialCompletionDt;
	}

	public Short getTrialPhase() {
		return trialPhase;
	}

	public void setTrialPhase(Short trialPhase) {
		this.trialPhase = trialPhase;
	}

	public String getTrialPrimaryObjective() {
		return trialPrimaryObjective;
	}

	public void setTrialPrimaryObjective(String trialPrimaryObjective) {
		this.trialPrimaryObjective = trialPrimaryObjective;
	}

	public String getTrialStatus() {
		return trialStatus;
	}

	public void setTrialStatus(String trialStatus) {
		this.trialStatus = trialStatus;
	}

	public String getInclusionCriteria() {
		return inclusionCriteria;
	}

	public void setInclusionCriteria(String inclusionCriteria) {
		this.inclusionCriteria = inclusionCriteria;
	}

	public String getExclusionCriteria() {
		return exclusionCriteria;
	}

	public void setExclusionCriteria(String exclusionCriteria) {
		this.exclusionCriteria = exclusionCriteria;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public String getTrialParticipatingSites() {
		return trialParticipatingSites;
	}

	public void setTrialParticipatingSites(String trialParticipatingSites) {
		this.trialParticipatingSites = trialParticipatingSites;
	}

	@XmlTransient
	public Collection<TargetedTherapy> getTargetedTherapyCollection() {
		return targetedTherapyCollection;
	}

	public void setTargetedTherapyCollection(Collection<TargetedTherapy> targetedTherapyCollection) {
		this.targetedTherapyCollection = targetedTherapyCollection;
	}

	@XmlTransient
	public Collection<TargetedTherapy> getTargetedTherapyCollection1() {
		return targetedTherapyCollection1;
	}

	public void setTargetedTherapyCollection1(Collection<TargetedTherapy> targetedTherapyCollection1) {
		this.targetedTherapyCollection1 = targetedTherapyCollection1;
	}

	public TrialType getTrialTypeId() {
		return trialTypeId;
	}

	public void setTrialTypeId(TrialType trialTypeId) {
		this.trialTypeId = trialTypeId;
	}

	public Physician getTrialPhysicianId() {
		return trialPhysicianId;
	}

	public void setTrialPhysicianId(Physician trialPhysicianId) {
		this.trialPhysicianId = trialPhysicianId;
	}

	@XmlTransient
	public Collection<EncounterClinicalTrial> getEncounterClinicalTrialCollection() {
		return encounterClinicalTrialCollection;
	}

	public void setEncounterClinicalTrialCollection(
			Collection<EncounterClinicalTrial> encounterClinicalTrialCollection) {
		this.encounterClinicalTrialCollection = encounterClinicalTrialCollection;
	}

	@XmlTransient
	public Collection<Chemotherapy> getChemotherapyCollection() {
		return chemotherapyCollection;
	}

	public void setChemotherapyCollection(Collection<Chemotherapy> chemotherapyCollection) {
		this.chemotherapyCollection = chemotherapyCollection;
	}

	@XmlTransient
	public Collection<Chemotherapy> getChemotherapyCollection1() {
		return chemotherapyCollection1;
	}

	public void setChemotherapyCollection1(Collection<Chemotherapy> chemotherapyCollection1) {
		this.chemotherapyCollection1 = chemotherapyCollection1;
	}

	@XmlTransient
	public Collection<EndocrineTherapy> getEndocrineTherapyCollection() {
		return endocrineTherapyCollection;
	}

	public void setEndocrineTherapyCollection(Collection<EndocrineTherapy> endocrineTherapyCollection) {
		this.endocrineTherapyCollection = endocrineTherapyCollection;
	}

	@XmlTransient
	public Collection<EndocrineTherapy> getEndocrineTherapyCollection1() {
		return endocrineTherapyCollection1;
	}

	public void setEndocrineTherapyCollection1(Collection<EndocrineTherapy> endocrineTherapyCollection1) {
		this.endocrineTherapyCollection1 = endocrineTherapyCollection1;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (clinicalTrialId != null ? clinicalTrialId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ClinicalTrial)) {
			return false;
		}
		ClinicalTrial other = (ClinicalTrial) object;
		if ((this.clinicalTrialId == null && other.clinicalTrialId != null)
				|| (this.clinicalTrialId != null && !this.clinicalTrialId.equals(other.clinicalTrialId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ClinicalTrial[ clinicalTrialId=" + clinicalTrialId + " ]";
	}

}

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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "encounter")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Encounter.findAll", query = "SELECT e FROM Encounter e") })
public class Encounter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private Integer encounterId;
	@Column(name = "Encounter_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date encounterDt;
	@Column(name = "Facility_Id")
	private Integer facilityId;
	@Lob
	@Column(name = "Provider_Note")
	private String providerNote;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "EN_Height")
	private Double eNHeight;
	@Column(name = "EN_Weight")
	private Double eNWeight;
	@Column(name = "Pregnancy_Status")
	private Short pregnancyStatus;
	@Column(name = "Month_Pregnancy")
	private Short monthPregnancy;
	@Column(name = "Clinical_Trial_Offered")
	private Short clinicalTrialOffered;
	@Column(name = "Clinical_Trial_Declined")
	private Short clinicalTrialDeclined;
	@Column(name = "EN_BMI")
	private Integer enBmi;
	@JoinColumn(name = "Encounter_Type_Id", referencedColumnName = "Type_Id")
	@ManyToOne(fetch = FetchType.LAZY)
	private EncounterType encounterTypeId;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Case1 caseId;
	@JoinColumn(name = "Episode_Id", referencedColumnName = "Episode_Id")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Episode episodeId;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "encounter", fetch = FetchType.LAZY)
	private Surgery surgery;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "encounter", fetch = FetchType.LAZY)
	private DiagnosticWorkup diagnosticWorkup;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "encounter", fetch = FetchType.LAZY)
	private Collection<EncounterPhysician> encounterPhysicianCollection;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "encounter", fetch = FetchType.LAZY)
	private Biopsy biopsy;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "encounter", fetch = FetchType.LAZY)
	private Pathology pathology;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "encounter", fetch = FetchType.LAZY)
	private PhysicalExam physicalExam;

	public Encounter() {
	}

	public Encounter(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Integer getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Date getEncounterDt() {
		return encounterDt;
	}

	public void setEncounterDt(Date encounterDt) {
		this.encounterDt = encounterDt;
	}

	public Integer getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public String getProviderNote() {
		return providerNote;
	}

	public void setProviderNote(String providerNote) {
		this.providerNote = providerNote;
	}

	public Double getENHeight() {
		return eNHeight;
	}

	public void setENHeight(Double eNHeight) {
		this.eNHeight = eNHeight;
	}

	public Double getENWeight() {
		return eNWeight;
	}

	public void setENWeight(Double eNWeight) {
		this.eNWeight = eNWeight;
	}

	public Short getPregnancyStatus() {
		return pregnancyStatus;
	}

	public void setPregnancyStatus(Short pregnancyStatus) {
		this.pregnancyStatus = pregnancyStatus;
	}

	public Short getMonthPregnancy() {
		return monthPregnancy;
	}

	public void setMonthPregnancy(Short monthPregnancy) {
		this.monthPregnancy = monthPregnancy;
	}

	public Short getClinicalTrialOffered() {
		return clinicalTrialOffered;
	}

	public void setClinicalTrialOffered(Short clinicalTrialOffered) {
		this.clinicalTrialOffered = clinicalTrialOffered;
	}

	public Short getClinicalTrialDeclined() {
		return clinicalTrialDeclined;
	}

	public void setClinicalTrialDeclined(Short clinicalTrialDeclined) {
		this.clinicalTrialDeclined = clinicalTrialDeclined;
	}

	public Integer getEnBmi() {
		return enBmi;
	}

	public void setEnBmi(Integer enBmi) {
		this.enBmi = enBmi;
	}

	public EncounterType getEncounterTypeId() {
		return encounterTypeId;
	}

	public void setEncounterTypeId(EncounterType encounterTypeId) {
		this.encounterTypeId = encounterTypeId;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public Episode getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(Episode episodeId) {
		this.episodeId = episodeId;
	}

	public Surgery getSurgery() {
		return surgery;
	}

	public void setSurgery(Surgery surgery) {
		this.surgery = surgery;
	}

	public DiagnosticWorkup getDiagnosticWorkup() {
		return diagnosticWorkup;
	}

	public void setDiagnosticWorkup(DiagnosticWorkup diagnosticWorkup) {
		this.diagnosticWorkup = diagnosticWorkup;
	}

	@XmlTransient
	public Collection<EncounterPhysician> getEncounterPhysicianCollection() {
		return encounterPhysicianCollection;
	}

	public void setEncounterPhysicianCollection(Collection<EncounterPhysician> encounterPhysicianCollection) {
		this.encounterPhysicianCollection = encounterPhysicianCollection;
	}

	@XmlTransient
	public Biopsy getBiopsy() {
		return biopsy;
	}

	public void setBiopsy(Biopsy biopsy) {
		this.biopsy = biopsy;
	}

	public Pathology getPathology() {
		return pathology;
	}

	public void setPathology(Pathology pathology) {
		this.pathology = pathology;
	}

	public PhysicalExam getPhysicalExam() {
		return physicalExam;
	}

	public void setPhysicalExam(PhysicalExam physicalExam) {
		this.physicalExam = physicalExam;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterId != null ? encounterId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Encounter)) {
			return false;
		}
		Encounter other = (Encounter) object;
		if ((this.encounterId == null && other.encounterId != null)
				|| (this.encounterId != null && !this.encounterId.equals(other.encounterId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Encounter[ encounterId=" + encounterId + " ]";
	}

}

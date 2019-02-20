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
@Table(name = "biopsy")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Biopsy.findAll", query = "SELECT b FROM Biopsy b") })
public class Biopsy implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "foreign")
	@GenericGenerator(name = "foreign", strategy = "foreign", parameters = {
			@Parameter(name = "property", value = "encounter") })
	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private Integer encounterId;
	@Column(name = "Lesion_Location")
	private String lesionLocation;
	@Column(name = "Needle_Gauge")
	private Integer needleGauge;
	@Column(name = "Post_Biopsy_Recommended_MRI")
	private Short postBiopsyRecommendedMRI;
	@Column(name = "Post_Biopsy_Related_MRI_Controlateral_Breast")
	private Short postBiopsyRelatedMRIControlateralBreast;
	@Column(name = "Lesion_Completely_Removed")
	private Short lesionCompletelyRemoved;
	@Lob
	@Column(name = "Complications")
	private String complications;
	@Column(name = "Time_Biopsy_Sample_Taken")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeBiopsySampleTaken;
	@Column(name = "Time_Biopsy_Sample_Sent")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeBiopsySampleSent;
	@Column(name = "Biopsy_Margins")
	private Short biopsyMargins;
	@Lob
	@Column(name = "Biopsy_Margins_Comm")
	private String biopsyMarginsComm;
	@Column(name = "SN_Inj_Method")
	private String sNInjMethod;
	@JoinColumn(name = "Lesion_Type", referencedColumnName = "Type_Id")
	@ManyToOne
	private LesionType lesionType;
	@JoinColumn(name = "Biopsy_Type_Id", referencedColumnName = "Type_Id")
	@ManyToOne
	private BiopsyType biopsyTypeId;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne
	private Case1 caseId;
	@PrimaryKeyJoinColumn(name = "Encounter_Id", referencedColumnName = "Encounter_Id")
	@OneToOne(optional = false)
	private Encounter encounter;

	public Biopsy() {
	}

	public String getLesionLocation() {
		return lesionLocation;
	}

	public void setLesionLocation(String lesionLocation) {
		this.lesionLocation = lesionLocation;
	}

	public Integer getNeedleGauge() {
		return needleGauge;
	}

	public void setNeedleGauge(Integer needleGauge) {
		this.needleGauge = needleGauge;
	}

	public Short getPostBiopsyRecommendedMRI() {
		return postBiopsyRecommendedMRI;
	}

	public void setPostBiopsyRecommendedMRI(Short postBiopsyRecommendedMRI) {
		this.postBiopsyRecommendedMRI = postBiopsyRecommendedMRI;
	}

	public Short getPostBiopsyRelatedMRIControlateralBreast() {
		return postBiopsyRelatedMRIControlateralBreast;
	}

	public void setPostBiopsyRelatedMRIControlateralBreast(Short postBiopsyRelatedMRIControlateralBreast) {
		this.postBiopsyRelatedMRIControlateralBreast = postBiopsyRelatedMRIControlateralBreast;
	}

	public Short getLesionCompletelyRemoved() {
		return lesionCompletelyRemoved;
	}

	public void setLesionCompletelyRemoved(Short lesionCompletelyRemoved) {
		this.lesionCompletelyRemoved = lesionCompletelyRemoved;
	}

	public String getComplications() {
		return complications;
	}

	public void setComplications(String complications) {
		this.complications = complications;
	}

	public Date getTimeBiopsySampleTaken() {
		return timeBiopsySampleTaken;
	}

	public void setTimeBiopsySampleTaken(Date timeBiopsySampleTaken) {
		this.timeBiopsySampleTaken = timeBiopsySampleTaken;
	}

	public Date getTimeBiopsySampleSent() {
		return timeBiopsySampleSent;
	}

	public void setTimeBiopsySampleSent(Date timeBiopsySampleSent) {
		this.timeBiopsySampleSent = timeBiopsySampleSent;
	}

	public Short getBiopsyMargins() {
		return biopsyMargins;
	}

	public void setBiopsyMargins(Short biopsyMargins) {
		this.biopsyMargins = biopsyMargins;
	}

	public String getBiopsyMarginsComm() {
		return biopsyMarginsComm;
	}

	public void setBiopsyMarginsComm(String biopsyMarginsComm) {
		this.biopsyMarginsComm = biopsyMarginsComm;
	}

	public String getSNInjMethod() {
		return sNInjMethod;
	}

	public void setSNInjMethod(String sNInjMethod) {
		this.sNInjMethod = sNInjMethod;
	}

	public LesionType getLesionType() {
		return lesionType;
	}

	public void setLesionType(LesionType lesionType) {
		this.lesionType = lesionType;
	}

	public BiopsyType getBiopsyTypeId() {
		return biopsyTypeId;
	}

	public void setBiopsyTypeId(BiopsyType biopsyTypeId) {
		this.biopsyTypeId = biopsyTypeId;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

}

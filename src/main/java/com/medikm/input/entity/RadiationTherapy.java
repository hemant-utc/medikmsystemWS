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
@Table(name = "radiation_therapy")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "RadiationTherapy.findAll", query = "SELECT r FROM RadiationTherapy r") })
public class RadiationTherapy implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected RadiationTherapyPK radiationTherapyPK;
	@Column(name = "Rad_Onc_Consult_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date radOncConsultDt;
	@Column(name = "Clinical_Assessment")
	private Short clinicalAssessment;
	@Column(name = "CT_Base_Treatment_Planning")
	private Short cTBaseTreatmentPlanning;
	@Lob
	@Column(name = "Dose_Distribution")
	private String doseDistribution;
	@Lob
	@Column(name = "Beam_Arramgement")
	private String beamArramgement;
	@Column(name = "RT_Area")
	private String rTArea;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "Fraction_Dose")
	private Double fractionDose;
	@Column(name = "Total_Breast_Dose")
	private Double totalBreastDose;
	@Column(name = "Boost_Tumor_Bed")
	private Short boostTumorBed;
	@Column(name = "Boost_Tumor_Bed_Type")
	private String boostTumorBedType;
	@Column(name = "Boost_Tumor_Bed_Dose")
	private Double boostTumorBedDose;
	@Column(name = "Chest_Wall_Rad")
	private Short chestWallRad;
	@Column(name = "CT_Based_Chest_Wall_Rad_Plan")
	private Short cTBasedChestWallRadPlan;
	@Column(name = "Regional_Nodal_Rad")
	private Short regionalNodalRad;
	@Column(name = "CT_Based_Reg_Nodal_Rad_Plan")
	private Short cTBasedRegNodalRadPlan;
	@Column(name = "Reg_Nodal_Rad_Total_Dose")
	private Double regNodalRadTotalDose;
	@Column(name = "Reg_Nodal_Rad_No_Fraction")
	private Integer regNodalRadNoFraction;
	@Column(name = "RT_Start_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date rTStartDt;
	@Column(name = "RT_End_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date rTEndDt;
	@Column(name = "No_RT_Visits")
	private Integer noRTVisits;
	@Column(name = "Elapsed_Days")
	private Integer elapsedDays;
	@Lob
	@Column(name = "Lymphedema")
	private String lymphedema;
	@Column(name = "Lymphedema_Appearance_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lymphedemaAppearanceDate;
	@Column(name = "Candidate_Mammosite")
	private Short candidateMammosite;
	@Column(name = "Tissue_Expansion")
	private Short tissueExpansion;
	@Column(name = "Compl_Immed_Reconst_Follow_RT")
	private Short complImmedReconstFollowRT;
	@Column(name = "Intended_benefit_Rthera")
	private String intendedbenefitRthera;
	@Column(name = "RT_Reason_Stop")
	private String rTReasonStop;
	@JoinColumn(name = "Chest_Wall_Rad_Type_Id", referencedColumnName = "Type_Id")
	@ManyToOne
	private ChestWallRadType chestWallRadTypeId;
	@JoinColumn(name = "RT_Modality_ID", referencedColumnName = "Type_Id")
	@ManyToOne
	private RtModality rTModalityID;
	@JoinColumn(name = "Rad_Type_Id", referencedColumnName = "Type_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private RadiationType radiationType;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false)
	private Case1 caseId;

	public RadiationTherapy() {
	}

	public RadiationTherapy(RadiationTherapyPK radiationTherapyPK) {
		this.radiationTherapyPK = radiationTherapyPK;
	}

	public RadiationTherapy(int episodeId, int radTypeId) {
		this.radiationTherapyPK = new RadiationTherapyPK(episodeId, radTypeId);
	}

	public RadiationTherapyPK getRadiationTherapyPK() {
		return radiationTherapyPK;
	}

	public void setRadiationTherapyPK(RadiationTherapyPK radiationTherapyPK) {
		this.radiationTherapyPK = radiationTherapyPK;
	}

	public Date getRadOncConsultDt() {
		return radOncConsultDt;
	}

	public void setRadOncConsultDt(Date radOncConsultDt) {
		this.radOncConsultDt = radOncConsultDt;
	}

	public Short getClinicalAssessment() {
		return clinicalAssessment;
	}

	public void setClinicalAssessment(Short clinicalAssessment) {
		this.clinicalAssessment = clinicalAssessment;
	}

	public Short getCTBaseTreatmentPlanning() {
		return cTBaseTreatmentPlanning;
	}

	public void setCTBaseTreatmentPlanning(Short cTBaseTreatmentPlanning) {
		this.cTBaseTreatmentPlanning = cTBaseTreatmentPlanning;
	}

	public String getDoseDistribution() {
		return doseDistribution;
	}

	public void setDoseDistribution(String doseDistribution) {
		this.doseDistribution = doseDistribution;
	}

	public String getBeamArramgement() {
		return beamArramgement;
	}

	public void setBeamArramgement(String beamArramgement) {
		this.beamArramgement = beamArramgement;
	}

	public String getRTArea() {
		return rTArea;
	}

	public void setRTArea(String rTArea) {
		this.rTArea = rTArea;
	}

	public Double getFractionDose() {
		return fractionDose;
	}

	public void setFractionDose(Double fractionDose) {
		this.fractionDose = fractionDose;
	}

	public Double getTotalBreastDose() {
		return totalBreastDose;
	}

	public void setTotalBreastDose(Double totalBreastDose) {
		this.totalBreastDose = totalBreastDose;
	}

	public Short getBoostTumorBed() {
		return boostTumorBed;
	}

	public void setBoostTumorBed(Short boostTumorBed) {
		this.boostTumorBed = boostTumorBed;
	}

	public String getBoostTumorBedType() {
		return boostTumorBedType;
	}

	public void setBoostTumorBedType(String boostTumorBedType) {
		this.boostTumorBedType = boostTumorBedType;
	}

	public Double getBoostTumorBedDose() {
		return boostTumorBedDose;
	}

	public void setBoostTumorBedDose(Double boostTumorBedDose) {
		this.boostTumorBedDose = boostTumorBedDose;
	}

	public Short getChestWallRad() {
		return chestWallRad;
	}

	public void setChestWallRad(Short chestWallRad) {
		this.chestWallRad = chestWallRad;
	}

	public Short getCTBasedChestWallRadPlan() {
		return cTBasedChestWallRadPlan;
	}

	public void setCTBasedChestWallRadPlan(Short cTBasedChestWallRadPlan) {
		this.cTBasedChestWallRadPlan = cTBasedChestWallRadPlan;
	}

	public Short getRegionalNodalRad() {
		return regionalNodalRad;
	}

	public void setRegionalNodalRad(Short regionalNodalRad) {
		this.regionalNodalRad = regionalNodalRad;
	}

	public Short getCTBasedRegNodalRadPlan() {
		return cTBasedRegNodalRadPlan;
	}

	public void setCTBasedRegNodalRadPlan(Short cTBasedRegNodalRadPlan) {
		this.cTBasedRegNodalRadPlan = cTBasedRegNodalRadPlan;
	}

	public Double getRegNodalRadTotalDose() {
		return regNodalRadTotalDose;
	}

	public void setRegNodalRadTotalDose(Double regNodalRadTotalDose) {
		this.regNodalRadTotalDose = regNodalRadTotalDose;
	}

	public Integer getRegNodalRadNoFraction() {
		return regNodalRadNoFraction;
	}

	public void setRegNodalRadNoFraction(Integer regNodalRadNoFraction) {
		this.regNodalRadNoFraction = regNodalRadNoFraction;
	}

	public Date getRTStartDt() {
		return rTStartDt;
	}

	public void setRTStartDt(Date rTStartDt) {
		this.rTStartDt = rTStartDt;
	}

	public Date getRTEndDt() {
		return rTEndDt;
	}

	public void setRTEndDt(Date rTEndDt) {
		this.rTEndDt = rTEndDt;
	}

	public Integer getNoRTVisits() {
		return noRTVisits;
	}

	public void setNoRTVisits(Integer noRTVisits) {
		this.noRTVisits = noRTVisits;
	}

	public Integer getElapsedDays() {
		return elapsedDays;
	}

	public void setElapsedDays(Integer elapsedDays) {
		this.elapsedDays = elapsedDays;
	}

	public String getLymphedema() {
		return lymphedema;
	}

	public void setLymphedema(String lymphedema) {
		this.lymphedema = lymphedema;
	}

	public Date getLymphedemaAppearanceDate() {
		return lymphedemaAppearanceDate;
	}

	public void setLymphedemaAppearanceDate(Date lymphedemaAppearanceDate) {
		this.lymphedemaAppearanceDate = lymphedemaAppearanceDate;
	}

	public Short getCandidateMammosite() {
		return candidateMammosite;
	}

	public void setCandidateMammosite(Short candidateMammosite) {
		this.candidateMammosite = candidateMammosite;
	}

	public Short getTissueExpansion() {
		return tissueExpansion;
	}

	public void setTissueExpansion(Short tissueExpansion) {
		this.tissueExpansion = tissueExpansion;
	}

	public Short getComplImmedReconstFollowRT() {
		return complImmedReconstFollowRT;
	}

	public void setComplImmedReconstFollowRT(Short complImmedReconstFollowRT) {
		this.complImmedReconstFollowRT = complImmedReconstFollowRT;
	}

	public String getIntendedbenefitRthera() {
		return intendedbenefitRthera;
	}

	public void setIntendedbenefitRthera(String intendedbenefitRthera) {
		this.intendedbenefitRthera = intendedbenefitRthera;
	}

	public String getRTReasonStop() {
		return rTReasonStop;
	}

	public void setRTReasonStop(String rTReasonStop) {
		this.rTReasonStop = rTReasonStop;
	}

	public ChestWallRadType getChestWallRadTypeId() {
		return chestWallRadTypeId;
	}

	public void setChestWallRadTypeId(ChestWallRadType chestWallRadTypeId) {
		this.chestWallRadTypeId = chestWallRadTypeId;
	}

	public RtModality getRTModalityID() {
		return rTModalityID;
	}

	public void setRTModalityID(RtModality rTModalityID) {
		this.rTModalityID = rTModalityID;
	}

	public RadiationType getRadiationType() {
		return radiationType;
	}

	public void setRadiationType(RadiationType radiationType) {
		this.radiationType = radiationType;
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
		hash += (radiationTherapyPK != null ? radiationTherapyPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RadiationTherapy)) {
			return false;
		}
		RadiationTherapy other = (RadiationTherapy) object;
		if ((this.radiationTherapyPK == null && other.radiationTherapyPK != null)
				|| (this.radiationTherapyPK != null && !this.radiationTherapyPK.equals(other.radiationTherapyPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.RadiationTherapy[ radiationTherapyPK=" + radiationTherapyPK + " ]";
	}

}

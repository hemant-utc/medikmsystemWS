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
@Table(name = "surgery")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Surgery.findAll", query = "SELECT s FROM Surgery s") })
public class Surgery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "foreign")
	@GenericGenerator(name = "foreign", strategy = "foreign", parameters = {
			@Parameter(name = "property", value = "encounter") })
	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private Integer encounterId;
	@Column(name = "Patient_Eligible_Bc_Surg")
	private Short patientEligibleBcSurg;
	@Column(name = "Surgical_Consultation_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date surgicalConsultationDt;
	@Column(name = "Breast_Conservation_Surgery_Margins")
	private Short breastConservationSurgeryMargins;
	@Column(name = "Resection_involved_Margin")
	private Short resectioninvolvedMargin;
	@Lob
	@Column(name = "Resection_involved_Margin_Comm")
	private String resectioninvolvedMarginComm;
	@Column(name = "Resection_Eexcision_Cavity")
	private Short resectionEexcisionCavity;
	@Column(name = "Orientation_Resection_Sn")
	private Short orientationResectionSn;
	@Lob
	@Column(name = "Orientation_Resection_Sn_Comm")
	private String orientationResectionSnComm;
	@Column(name = "Rad_Therapist_Consultation_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date radTherapistConsultationDt;
	@Column(name = "Skin_Spearing_Mastectomy_RT_Consult")
	private Short skinSpearingMastectomyRTConsult;
	@Column(name = "Skin_Spearing_Mastectomy_RT_Consult_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date skinSpearingMastectomyRTConsultDate;
	@Column(name = "Sentinel_Node_Biopsy")
	private Short sentinelNodeBiopsy;
	@Column(name = "Sentinel_Node_Identified_Dye")
	private Short sentinelNodeIdentifiedDye;
	@Column(name = "No_Sentine_Nodes_Removed")
	private Short noSentineNodesRemoved;
	@Column(name = "Axillary_Node_Dissection")
	private Short axillaryNodeDissection;
	@Column(name = "Axillary_Disection_Number_Node")
	private Short axillaryDisectionNumberNode;
	@Column(name = "Ambu_BC_Surg_Unplan_O_Night_Stay")
	private Short ambuBCSurgUnplanONightStay;
	@Column(name = "Ambulatory_BC_Surgery")
	private Short ambulatoryBCSurgery;
	@Column(name = "Plastic_Surgeon_Consult")
	private Short plasticSurgeonConsult;
	@Column(name = "Plastic_Surgeon_Consult_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date plasticSurgeonConsultDate;
	@Column(name = "Reconstructive_BS_Implant")
	private Short reconstructiveBSImplant;
	@Column(name = "Reconstructive_BS_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date reconstructiveBSDate;
	@Column(name = "Immediate_Breast_Reconstruction")
	private Short immediateBreastReconstruction;
	@Column(name = "Delayed_Breast_Reconstruction")
	private Short delayedBreastReconstruction;
	@Column(name = "Reconstructive_BS_Complications")
	private Short reconstructiveBSComplications;
	@Lob
	@Column(name = "Reconstructive_BS_Complications_Comm")
	private String reconstructiveBSComplicationsComm;
	@Column(name = "Contraindication_BC")
	private Short contraindicationBC;
	@Lob
	@Column(name = "Contraindication_BC_Comm")
	private String contraindicationBCComm;
	@Column(name = "Med_Consult_PreSurgery")
	private Short medConsultPreSurgery;
	@Column(name = "Med_Consult_PreSurgery_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date medConsultPreSurgeryDt;
	@Column(name = "Margin_Measurement")
	private Short marginMeasurement;
	@Column(name = "Tumor_Ink")
	private Short tumorInk;
	@Column(name = "Date_Of_Surgery")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfSurgery;
	@Basic(optional = false)
	@Column(name = "OR_Entry_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date oREntryTime;
	@Basic(optional = false)
	@Column(name = "OR_Exit_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date oRExitTime;
	@Column(name = "Primary_Proc_Ind")
	private Integer primaryProcInd;
	@Column(name = "Reason_For_Ret_To_Or")
	private Integer reasonForRetToOr;
	@Column(name = "Unexpected_Ret_To_Or")
	private Integer unexpectedRetToOr;
	@Column(name = "Post_Op_Event_30day")
	private Integer postOpEvent30day;
	@Column(name = "Disposition_After_Surg")
	private Integer dispositionAfterSurg;
	@Column(name = "Sur_Margin_Assessment")
	private Integer surMarginAssessment;
	@Column(name = "Breast_Side")
	private Character breastSide;
	@Column(name = "Br_Surg_Location")
	private Integer brSurgLocation;
	@Column(name = "Anesthesia_Type")
	private Character anesthesiaType;
	@Column(name = "Sur_Time_Status")
	private Integer surTimeStatus;
	@Column(name = "Re_Operation")
	private Integer reOperation;
	@Column(name = "IntraopPRBC")
	private Integer intraopPRBC;
	@Column(name = "ASA_Classification")
	private Integer aSAClassification;
	@Column(name = "Tumour_Spill")
	private Integer tumourSpill;
	@JoinColumn(name = "Plastic_Surgery_Type", referencedColumnName = "Type_Id")
	@ManyToOne
	private PlasticSurgeryType plasticSurgeryType;
	@JoinColumn(name = "Surgery_Type_Id", referencedColumnName = "Type_Id")
	@ManyToOne
	private SurgeryType surgeryTypeId;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne
	private Case1 caseId;
	@PrimaryKeyJoinColumn(name = "Encounter_Id", referencedColumnName = "Encounter_Id")
	@OneToOne(optional = false)
	private Encounter encounter;

	public Surgery() {
	}

	public Surgery(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Surgery(Integer encounterId, Date oREntryTime, Date oRExitTime) {
		this.encounterId = encounterId;
		this.oREntryTime = oREntryTime;
		this.oRExitTime = oRExitTime;
	}

	public Integer getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Short getPatientEligibleBcSurg() {
		return patientEligibleBcSurg;
	}

	public void setPatientEligibleBcSurg(Short patientEligibleBcSurg) {
		this.patientEligibleBcSurg = patientEligibleBcSurg;
	}

	public Date getSurgicalConsultationDt() {
		return surgicalConsultationDt;
	}

	public void setSurgicalConsultationDt(Date surgicalConsultationDt) {
		this.surgicalConsultationDt = surgicalConsultationDt;
	}

	public Short getBreastConservationSurgeryMargins() {
		return breastConservationSurgeryMargins;
	}

	public void setBreastConservationSurgeryMargins(Short breastConservationSurgeryMargins) {
		this.breastConservationSurgeryMargins = breastConservationSurgeryMargins;
	}

	public Short getResectioninvolvedMargin() {
		return resectioninvolvedMargin;
	}

	public void setResectioninvolvedMargin(Short resectioninvolvedMargin) {
		this.resectioninvolvedMargin = resectioninvolvedMargin;
	}

	public String getResectioninvolvedMarginComm() {
		return resectioninvolvedMarginComm;
	}

	public void setResectioninvolvedMarginComm(String resectioninvolvedMarginComm) {
		this.resectioninvolvedMarginComm = resectioninvolvedMarginComm;
	}

	public Short getResectionEexcisionCavity() {
		return resectionEexcisionCavity;
	}

	public void setResectionEexcisionCavity(Short resectionEexcisionCavity) {
		this.resectionEexcisionCavity = resectionEexcisionCavity;
	}

	public Short getOrientationResectionSn() {
		return orientationResectionSn;
	}

	public void setOrientationResectionSn(Short orientationResectionSn) {
		this.orientationResectionSn = orientationResectionSn;
	}

	public String getOrientationResectionSnComm() {
		return orientationResectionSnComm;
	}

	public void setOrientationResectionSnComm(String orientationResectionSnComm) {
		this.orientationResectionSnComm = orientationResectionSnComm;
	}

	public Date getRadTherapistConsultationDt() {
		return radTherapistConsultationDt;
	}

	public void setRadTherapistConsultationDt(Date radTherapistConsultationDt) {
		this.radTherapistConsultationDt = radTherapistConsultationDt;
	}

	public Short getSkinSpearingMastectomyRTConsult() {
		return skinSpearingMastectomyRTConsult;
	}

	public void setSkinSpearingMastectomyRTConsult(Short skinSpearingMastectomyRTConsult) {
		this.skinSpearingMastectomyRTConsult = skinSpearingMastectomyRTConsult;
	}

	public Date getSkinSpearingMastectomyRTConsultDate() {
		return skinSpearingMastectomyRTConsultDate;
	}

	public void setSkinSpearingMastectomyRTConsultDate(Date skinSpearingMastectomyRTConsultDate) {
		this.skinSpearingMastectomyRTConsultDate = skinSpearingMastectomyRTConsultDate;
	}

	public Short getSentinelNodeBiopsy() {
		return sentinelNodeBiopsy;
	}

	public void setSentinelNodeBiopsy(Short sentinelNodeBiopsy) {
		this.sentinelNodeBiopsy = sentinelNodeBiopsy;
	}

	public Short getSentinelNodeIdentifiedDye() {
		return sentinelNodeIdentifiedDye;
	}

	public void setSentinelNodeIdentifiedDye(Short sentinelNodeIdentifiedDye) {
		this.sentinelNodeIdentifiedDye = sentinelNodeIdentifiedDye;
	}

	public Short getNoSentineNodesRemoved() {
		return noSentineNodesRemoved;
	}

	public void setNoSentineNodesRemoved(Short noSentineNodesRemoved) {
		this.noSentineNodesRemoved = noSentineNodesRemoved;
	}

	public Short getAxillaryNodeDissection() {
		return axillaryNodeDissection;
	}

	public void setAxillaryNodeDissection(Short axillaryNodeDissection) {
		this.axillaryNodeDissection = axillaryNodeDissection;
	}

	public Short getAxillaryDisectionNumberNode() {
		return axillaryDisectionNumberNode;
	}

	public void setAxillaryDisectionNumberNode(Short axillaryDisectionNumberNode) {
		this.axillaryDisectionNumberNode = axillaryDisectionNumberNode;
	}

	public Short getAmbuBCSurgUnplanONightStay() {
		return ambuBCSurgUnplanONightStay;
	}

	public void setAmbuBCSurgUnplanONightStay(Short ambuBCSurgUnplanONightStay) {
		this.ambuBCSurgUnplanONightStay = ambuBCSurgUnplanONightStay;
	}

	public Short getAmbulatoryBCSurgery() {
		return ambulatoryBCSurgery;
	}

	public void setAmbulatoryBCSurgery(Short ambulatoryBCSurgery) {
		this.ambulatoryBCSurgery = ambulatoryBCSurgery;
	}

	public Short getPlasticSurgeonConsult() {
		return plasticSurgeonConsult;
	}

	public void setPlasticSurgeonConsult(Short plasticSurgeonConsult) {
		this.plasticSurgeonConsult = plasticSurgeonConsult;
	}

	public Date getPlasticSurgeonConsultDate() {
		return plasticSurgeonConsultDate;
	}

	public void setPlasticSurgeonConsultDate(Date plasticSurgeonConsultDate) {
		this.plasticSurgeonConsultDate = plasticSurgeonConsultDate;
	}

	public Short getReconstructiveBSImplant() {
		return reconstructiveBSImplant;
	}

	public void setReconstructiveBSImplant(Short reconstructiveBSImplant) {
		this.reconstructiveBSImplant = reconstructiveBSImplant;
	}

	public Date getReconstructiveBSDate() {
		return reconstructiveBSDate;
	}

	public void setReconstructiveBSDate(Date reconstructiveBSDate) {
		this.reconstructiveBSDate = reconstructiveBSDate;
	}

	public Short getImmediateBreastReconstruction() {
		return immediateBreastReconstruction;
	}

	public void setImmediateBreastReconstruction(Short immediateBreastReconstruction) {
		this.immediateBreastReconstruction = immediateBreastReconstruction;
	}

	public Short getDelayedBreastReconstruction() {
		return delayedBreastReconstruction;
	}

	public void setDelayedBreastReconstruction(Short delayedBreastReconstruction) {
		this.delayedBreastReconstruction = delayedBreastReconstruction;
	}

	public Short getReconstructiveBSComplications() {
		return reconstructiveBSComplications;
	}

	public void setReconstructiveBSComplications(Short reconstructiveBSComplications) {
		this.reconstructiveBSComplications = reconstructiveBSComplications;
	}

	public String getReconstructiveBSComplicationsComm() {
		return reconstructiveBSComplicationsComm;
	}

	public void setReconstructiveBSComplicationsComm(String reconstructiveBSComplicationsComm) {
		this.reconstructiveBSComplicationsComm = reconstructiveBSComplicationsComm;
	}

	public Short getContraindicationBC() {
		return contraindicationBC;
	}

	public void setContraindicationBC(Short contraindicationBC) {
		this.contraindicationBC = contraindicationBC;
	}

	public String getContraindicationBCComm() {
		return contraindicationBCComm;
	}

	public void setContraindicationBCComm(String contraindicationBCComm) {
		this.contraindicationBCComm = contraindicationBCComm;
	}

	public Short getMedConsultPreSurgery() {
		return medConsultPreSurgery;
	}

	public void setMedConsultPreSurgery(Short medConsultPreSurgery) {
		this.medConsultPreSurgery = medConsultPreSurgery;
	}

	public Date getMedConsultPreSurgeryDt() {
		return medConsultPreSurgeryDt;
	}

	public void setMedConsultPreSurgeryDt(Date medConsultPreSurgeryDt) {
		this.medConsultPreSurgeryDt = medConsultPreSurgeryDt;
	}

	public Short getMarginMeasurement() {
		return marginMeasurement;
	}

	public void setMarginMeasurement(Short marginMeasurement) {
		this.marginMeasurement = marginMeasurement;
	}

	public Short getTumorInk() {
		return tumorInk;
	}

	public void setTumorInk(Short tumorInk) {
		this.tumorInk = tumorInk;
	}

	public Date getDateOfSurgery() {
		return dateOfSurgery;
	}

	public void setDateOfSurgery(Date dateOfSurgery) {
		this.dateOfSurgery = dateOfSurgery;
	}

	public Date getOREntryTime() {
		return oREntryTime;
	}

	public void setOREntryTime(Date oREntryTime) {
		this.oREntryTime = oREntryTime;
	}

	public Date getORExitTime() {
		return oRExitTime;
	}

	public void setORExitTime(Date oRExitTime) {
		this.oRExitTime = oRExitTime;
	}

	public Integer getPrimaryProcInd() {
		return primaryProcInd;
	}

	public void setPrimaryProcInd(Integer primaryProcInd) {
		this.primaryProcInd = primaryProcInd;
	}

	public Integer getReasonForRetToOr() {
		return reasonForRetToOr;
	}

	public void setReasonForRetToOr(Integer reasonForRetToOr) {
		this.reasonForRetToOr = reasonForRetToOr;
	}

	public Integer getUnexpectedRetToOr() {
		return unexpectedRetToOr;
	}

	public void setUnexpectedRetToOr(Integer unexpectedRetToOr) {
		this.unexpectedRetToOr = unexpectedRetToOr;
	}

	public Integer getPostOpEvent30day() {
		return postOpEvent30day;
	}

	public void setPostOpEvent30day(Integer postOpEvent30day) {
		this.postOpEvent30day = postOpEvent30day;
	}

	public Integer getDispositionAfterSurg() {
		return dispositionAfterSurg;
	}

	public void setDispositionAfterSurg(Integer dispositionAfterSurg) {
		this.dispositionAfterSurg = dispositionAfterSurg;
	}

	public Integer getSurMarginAssessment() {
		return surMarginAssessment;
	}

	public void setSurMarginAssessment(Integer surMarginAssessment) {
		this.surMarginAssessment = surMarginAssessment;
	}

	public Character getBreastSide() {
		return breastSide;
	}

	public void setBreastSide(Character breastSide) {
		this.breastSide = breastSide;
	}

	public Integer getBrSurgLocation() {
		return brSurgLocation;
	}

	public void setBrSurgLocation(Integer brSurgLocation) {
		this.brSurgLocation = brSurgLocation;
	}

	public Character getAnesthesiaType() {
		return anesthesiaType;
	}

	public void setAnesthesiaType(Character anesthesiaType) {
		this.anesthesiaType = anesthesiaType;
	}

	public Integer getSurTimeStatus() {
		return surTimeStatus;
	}

	public void setSurTimeStatus(Integer surTimeStatus) {
		this.surTimeStatus = surTimeStatus;
	}

	public Integer getReOperation() {
		return reOperation;
	}

	public void setReOperation(Integer reOperation) {
		this.reOperation = reOperation;
	}

	public Integer getIntraopPRBC() {
		return intraopPRBC;
	}

	public void setIntraopPRBC(Integer intraopPRBC) {
		this.intraopPRBC = intraopPRBC;
	}

	public Integer getASAClassification() {
		return aSAClassification;
	}

	public void setASAClassification(Integer aSAClassification) {
		this.aSAClassification = aSAClassification;
	}

	public Integer getTumourSpill() {
		return tumourSpill;
	}

	public void setTumourSpill(Integer tumourSpill) {
		this.tumourSpill = tumourSpill;
	}

	public PlasticSurgeryType getPlasticSurgeryType() {
		return plasticSurgeryType;
	}

	public void setPlasticSurgeryType(PlasticSurgeryType plasticSurgeryType) {
		this.plasticSurgeryType = plasticSurgeryType;
	}

	public SurgeryType getSurgeryTypeId() {
		return surgeryTypeId;
	}

	public void setSurgeryTypeId(SurgeryType surgeryTypeId) {
		this.surgeryTypeId = surgeryTypeId;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterId != null ? encounterId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Surgery)) {
			return false;
		}
		Surgery other = (Surgery) object;
		if ((this.encounterId == null && other.encounterId != null)
				|| (this.encounterId != null && !this.encounterId.equals(other.encounterId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Surgery[ encounterId=" + encounterId + " ]";
	}

}

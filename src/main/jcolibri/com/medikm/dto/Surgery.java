package com.medikm.dto;

import java.sql.Timestamp;

/**
 * Surgery entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Surgery implements java.io.Serializable {

	// Fields

	private Integer encounterId;
	private SurgeryType surgeryType;
	private Case1 case1;
	private PlasticSurgeryType plasticSurgeryType;
	private Short patientEligibleBcSurg;
	private Timestamp surgicalConsultationDt;
	private Short breastConservationSurgeryMargins;
	private Short resectionInvolvedMargin;
	private String resectionInvolvedMarginComm;
	private Short resectionEexcisionCavity;
	private Short orientationResectionSn;
	private String orientationResectionSnComm;
	private Timestamp radTherapistConsultationDt;
	private Short skinSpearingMastectomyRtConsult;
	private Timestamp skinSpearingMastectomyRtConsultDate;
	private Short sentinelNodeBiopsy;
	private Short sentinelNodeIdentifiedDye;
	private Short noSentineNodesRemoved;
	private Short axillaryNodeDissection;
	private Short axillaryDisectionNumberNode;
	private Short ambuBcSurgUnplanONightStay;
	private Short ambulatoryBcSurgery;
	private Short plasticSurgeonConsult;
	private Timestamp plasticSurgeonConsultDate;
	private Short reconstructiveBsImplant;
	private Timestamp reconstructiveBsDate;
	private Short immediateBreastReconstruction;
	private Short delayedBreastReconstruction;
	private Short reconstructiveBsComplications;
	private String reconstructiveBsComplicationsComm;
	private Short contraindicationBc;
	private String contraindicationBcComm;
	private Short medConsultPreSurgery;
	private Timestamp medConsultPreSurgeryDt;
	private Short marginMeasurement;
	private Short tumorInk;
	private Timestamp dateOfSurgery;
	private Timestamp orEntryTime;
	private Timestamp orExitTime;
	private Integer primaryProcInd;
	private Integer reasonForRetToOr;
	private Integer unexpectedRetToOr;
	private Integer postOpEvent30day;
	private Integer dispositionAfterSurg;
	private Integer surMarginAssessment;
	private String breastSide;
	private Integer brSurgLocation;
	private String anesthesiaType;
	private Integer surTimeStatus;
	private Integer reOperation;
	private Integer intraopPrbc;
	private Integer asaClassification;
	private Integer tumourSpill;

	// Constructors

	/** default constructor */
	public Surgery() {
	}

	/** minimal constructor */
	public Surgery(Integer encounterId, Timestamp orEntryTime, Timestamp orExitTime) {
		this.encounterId = encounterId;
		this.orEntryTime = orEntryTime;
		this.orExitTime = orExitTime;
	}

	/** full constructor */
	public Surgery(Integer encounterId, SurgeryType surgeryType, Case1 case1, PlasticSurgeryType plasticSurgeryType,
			Short patientEligibleBcSurg, Timestamp surgicalConsultationDt, Short breastConservationSurgeryMargins,
			Short resectionInvolvedMargin, String resectionInvolvedMarginComm, Short resectionEexcisionCavity,
			Short orientationResectionSn, String orientationResectionSnComm, Timestamp radTherapistConsultationDt,
			Short skinSpearingMastectomyRtConsult, Timestamp skinSpearingMastectomyRtConsultDate,
			Short sentinelNodeBiopsy, Short sentinelNodeIdentifiedDye, Short noSentineNodesRemoved,
			Short axillaryNodeDissection, Short axillaryDisectionNumberNode, Short ambuBcSurgUnplanONightStay,
			Short ambulatoryBcSurgery, Short plasticSurgeonConsult, Timestamp plasticSurgeonConsultDate,
			Short reconstructiveBsImplant, Timestamp reconstructiveBsDate, Short immediateBreastReconstruction,
			Short delayedBreastReconstruction, Short reconstructiveBsComplications,
			String reconstructiveBsComplicationsComm, Short contraindicationBc, String contraindicationBcComm,
			Short medConsultPreSurgery, Timestamp medConsultPreSurgeryDt, Short marginMeasurement, Short tumorInk,
			Timestamp dateOfSurgery, Timestamp orEntryTime, Timestamp orExitTime, Integer primaryProcInd,
			Integer reasonForRetToOr, Integer unexpectedRetToOr, Integer postOpEvent30day, Integer dispositionAfterSurg,
			Integer surMarginAssessment, String breastSide, Integer brSurgLocation, String anesthesiaType,
			Integer surTimeStatus, Integer reOperation, Integer intraopPrbc, Integer asaClassification,
			Integer tumourSpill) {
		this.encounterId = encounterId;
		this.surgeryType = surgeryType;
		this.case1 = case1;
		this.plasticSurgeryType = plasticSurgeryType;
		this.patientEligibleBcSurg = patientEligibleBcSurg;
		this.surgicalConsultationDt = surgicalConsultationDt;
		this.breastConservationSurgeryMargins = breastConservationSurgeryMargins;
		this.resectionInvolvedMargin = resectionInvolvedMargin;
		this.resectionInvolvedMarginComm = resectionInvolvedMarginComm;
		this.resectionEexcisionCavity = resectionEexcisionCavity;
		this.orientationResectionSn = orientationResectionSn;
		this.orientationResectionSnComm = orientationResectionSnComm;
		this.radTherapistConsultationDt = radTherapistConsultationDt;
		this.skinSpearingMastectomyRtConsult = skinSpearingMastectomyRtConsult;
		this.skinSpearingMastectomyRtConsultDate = skinSpearingMastectomyRtConsultDate;
		this.sentinelNodeBiopsy = sentinelNodeBiopsy;
		this.sentinelNodeIdentifiedDye = sentinelNodeIdentifiedDye;
		this.noSentineNodesRemoved = noSentineNodesRemoved;
		this.axillaryNodeDissection = axillaryNodeDissection;
		this.axillaryDisectionNumberNode = axillaryDisectionNumberNode;
		this.ambuBcSurgUnplanONightStay = ambuBcSurgUnplanONightStay;
		this.ambulatoryBcSurgery = ambulatoryBcSurgery;
		this.plasticSurgeonConsult = plasticSurgeonConsult;
		this.plasticSurgeonConsultDate = plasticSurgeonConsultDate;
		this.reconstructiveBsImplant = reconstructiveBsImplant;
		this.reconstructiveBsDate = reconstructiveBsDate;
		this.immediateBreastReconstruction = immediateBreastReconstruction;
		this.delayedBreastReconstruction = delayedBreastReconstruction;
		this.reconstructiveBsComplications = reconstructiveBsComplications;
		this.reconstructiveBsComplicationsComm = reconstructiveBsComplicationsComm;
		this.contraindicationBc = contraindicationBc;
		this.contraindicationBcComm = contraindicationBcComm;
		this.medConsultPreSurgery = medConsultPreSurgery;
		this.medConsultPreSurgeryDt = medConsultPreSurgeryDt;
		this.marginMeasurement = marginMeasurement;
		this.tumorInk = tumorInk;
		this.dateOfSurgery = dateOfSurgery;
		this.orEntryTime = orEntryTime;
		this.orExitTime = orExitTime;
		this.primaryProcInd = primaryProcInd;
		this.reasonForRetToOr = reasonForRetToOr;
		this.unexpectedRetToOr = unexpectedRetToOr;
		this.postOpEvent30day = postOpEvent30day;
		this.dispositionAfterSurg = dispositionAfterSurg;
		this.surMarginAssessment = surMarginAssessment;
		this.breastSide = breastSide;
		this.brSurgLocation = brSurgLocation;
		this.anesthesiaType = anesthesiaType;
		this.surTimeStatus = surTimeStatus;
		this.reOperation = reOperation;
		this.intraopPrbc = intraopPrbc;
		this.asaClassification = asaClassification;
		this.tumourSpill = tumourSpill;
	}

	// Property accessors

	public Integer getEncounterId() {
		return this.encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public SurgeryType getSurgeryType() {
		return this.surgeryType;
	}

	public void setSurgeryType(SurgeryType surgeryType) {
		this.surgeryType = surgeryType;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public PlasticSurgeryType getPlasticSurgeryType() {
		return this.plasticSurgeryType;
	}

	public void setPlasticSurgeryType(PlasticSurgeryType plasticSurgeryType) {
		this.plasticSurgeryType = plasticSurgeryType;
	}

	public Short getPatientEligibleBcSurg() {
		return this.patientEligibleBcSurg;
	}

	public void setPatientEligibleBcSurg(Short patientEligibleBcSurg) {
		this.patientEligibleBcSurg = patientEligibleBcSurg;
	}

	public Timestamp getSurgicalConsultationDt() {
		return this.surgicalConsultationDt;
	}

	public void setSurgicalConsultationDt(Timestamp surgicalConsultationDt) {
		this.surgicalConsultationDt = surgicalConsultationDt;
	}

	public Short getBreastConservationSurgeryMargins() {
		return this.breastConservationSurgeryMargins;
	}

	public void setBreastConservationSurgeryMargins(Short breastConservationSurgeryMargins) {
		this.breastConservationSurgeryMargins = breastConservationSurgeryMargins;
	}

	public Short getResectionInvolvedMargin() {
		return this.resectionInvolvedMargin;
	}

	public void setResectionInvolvedMargin(Short resectionInvolvedMargin) {
		this.resectionInvolvedMargin = resectionInvolvedMargin;
	}

	public String getResectionInvolvedMarginComm() {
		return this.resectionInvolvedMarginComm;
	}

	public void setResectionInvolvedMarginComm(String resectionInvolvedMarginComm) {
		this.resectionInvolvedMarginComm = resectionInvolvedMarginComm;
	}

	public Short getResectionEexcisionCavity() {
		return this.resectionEexcisionCavity;
	}

	public void setResectionEexcisionCavity(Short resectionEexcisionCavity) {
		this.resectionEexcisionCavity = resectionEexcisionCavity;
	}

	public Short getOrientationResectionSn() {
		return this.orientationResectionSn;
	}

	public void setOrientationResectionSn(Short orientationResectionSn) {
		this.orientationResectionSn = orientationResectionSn;
	}

	public String getOrientationResectionSnComm() {
		return this.orientationResectionSnComm;
	}

	public void setOrientationResectionSnComm(String orientationResectionSnComm) {
		this.orientationResectionSnComm = orientationResectionSnComm;
	}

	public Timestamp getRadTherapistConsultationDt() {
		return this.radTherapistConsultationDt;
	}

	public void setRadTherapistConsultationDt(Timestamp radTherapistConsultationDt) {
		this.radTherapistConsultationDt = radTherapistConsultationDt;
	}

	public Short getSkinSpearingMastectomyRtConsult() {
		return this.skinSpearingMastectomyRtConsult;
	}

	public void setSkinSpearingMastectomyRtConsult(Short skinSpearingMastectomyRtConsult) {
		this.skinSpearingMastectomyRtConsult = skinSpearingMastectomyRtConsult;
	}

	public Timestamp getSkinSpearingMastectomyRtConsultDate() {
		return this.skinSpearingMastectomyRtConsultDate;
	}

	public void setSkinSpearingMastectomyRtConsultDate(Timestamp skinSpearingMastectomyRtConsultDate) {
		this.skinSpearingMastectomyRtConsultDate = skinSpearingMastectomyRtConsultDate;
	}

	public Short getSentinelNodeBiopsy() {
		return this.sentinelNodeBiopsy;
	}

	public void setSentinelNodeBiopsy(Short sentinelNodeBiopsy) {
		this.sentinelNodeBiopsy = sentinelNodeBiopsy;
	}

	public Short getSentinelNodeIdentifiedDye() {
		return this.sentinelNodeIdentifiedDye;
	}

	public void setSentinelNodeIdentifiedDye(Short sentinelNodeIdentifiedDye) {
		this.sentinelNodeIdentifiedDye = sentinelNodeIdentifiedDye;
	}

	public Short getNoSentineNodesRemoved() {
		return this.noSentineNodesRemoved;
	}

	public void setNoSentineNodesRemoved(Short noSentineNodesRemoved) {
		this.noSentineNodesRemoved = noSentineNodesRemoved;
	}

	public Short getAxillaryNodeDissection() {
		return this.axillaryNodeDissection;
	}

	public void setAxillaryNodeDissection(Short axillaryNodeDissection) {
		this.axillaryNodeDissection = axillaryNodeDissection;
	}

	public Short getAxillaryDisectionNumberNode() {
		return this.axillaryDisectionNumberNode;
	}

	public void setAxillaryDisectionNumberNode(Short axillaryDisectionNumberNode) {
		this.axillaryDisectionNumberNode = axillaryDisectionNumberNode;
	}

	public Short getAmbuBcSurgUnplanONightStay() {
		return this.ambuBcSurgUnplanONightStay;
	}

	public void setAmbuBcSurgUnplanONightStay(Short ambuBcSurgUnplanONightStay) {
		this.ambuBcSurgUnplanONightStay = ambuBcSurgUnplanONightStay;
	}

	public Short getAmbulatoryBcSurgery() {
		return this.ambulatoryBcSurgery;
	}

	public void setAmbulatoryBcSurgery(Short ambulatoryBcSurgery) {
		this.ambulatoryBcSurgery = ambulatoryBcSurgery;
	}

	public Short getPlasticSurgeonConsult() {
		return this.plasticSurgeonConsult;
	}

	public void setPlasticSurgeonConsult(Short plasticSurgeonConsult) {
		this.plasticSurgeonConsult = plasticSurgeonConsult;
	}

	public Timestamp getPlasticSurgeonConsultDate() {
		return this.plasticSurgeonConsultDate;
	}

	public void setPlasticSurgeonConsultDate(Timestamp plasticSurgeonConsultDate) {
		this.plasticSurgeonConsultDate = plasticSurgeonConsultDate;
	}

	public Short getReconstructiveBsImplant() {
		return this.reconstructiveBsImplant;
	}

	public void setReconstructiveBsImplant(Short reconstructiveBsImplant) {
		this.reconstructiveBsImplant = reconstructiveBsImplant;
	}

	public Timestamp getReconstructiveBsDate() {
		return this.reconstructiveBsDate;
	}

	public void setReconstructiveBsDate(Timestamp reconstructiveBsDate) {
		this.reconstructiveBsDate = reconstructiveBsDate;
	}

	public Short getImmediateBreastReconstruction() {
		return this.immediateBreastReconstruction;
	}

	public void setImmediateBreastReconstruction(Short immediateBreastReconstruction) {
		this.immediateBreastReconstruction = immediateBreastReconstruction;
	}

	public Short getDelayedBreastReconstruction() {
		return this.delayedBreastReconstruction;
	}

	public void setDelayedBreastReconstruction(Short delayedBreastReconstruction) {
		this.delayedBreastReconstruction = delayedBreastReconstruction;
	}

	public Short getReconstructiveBsComplications() {
		return this.reconstructiveBsComplications;
	}

	public void setReconstructiveBsComplications(Short reconstructiveBsComplications) {
		this.reconstructiveBsComplications = reconstructiveBsComplications;
	}

	public String getReconstructiveBsComplicationsComm() {
		return this.reconstructiveBsComplicationsComm;
	}

	public void setReconstructiveBsComplicationsComm(String reconstructiveBsComplicationsComm) {
		this.reconstructiveBsComplicationsComm = reconstructiveBsComplicationsComm;
	}

	public Short getContraindicationBc() {
		return this.contraindicationBc;
	}

	public void setContraindicationBc(Short contraindicationBc) {
		this.contraindicationBc = contraindicationBc;
	}

	public String getContraindicationBcComm() {
		return this.contraindicationBcComm;
	}

	public void setContraindicationBcComm(String contraindicationBcComm) {
		this.contraindicationBcComm = contraindicationBcComm;
	}

	public Short getMedConsultPreSurgery() {
		return this.medConsultPreSurgery;
	}

	public void setMedConsultPreSurgery(Short medConsultPreSurgery) {
		this.medConsultPreSurgery = medConsultPreSurgery;
	}

	public Timestamp getMedConsultPreSurgeryDt() {
		return this.medConsultPreSurgeryDt;
	}

	public void setMedConsultPreSurgeryDt(Timestamp medConsultPreSurgeryDt) {
		this.medConsultPreSurgeryDt = medConsultPreSurgeryDt;
	}

	public Short getMarginMeasurement() {
		return this.marginMeasurement;
	}

	public void setMarginMeasurement(Short marginMeasurement) {
		this.marginMeasurement = marginMeasurement;
	}

	public Short getTumorInk() {
		return this.tumorInk;
	}

	public void setTumorInk(Short tumorInk) {
		this.tumorInk = tumorInk;
	}

	public Timestamp getDateOfSurgery() {
		return this.dateOfSurgery;
	}

	public void setDateOfSurgery(Timestamp dateOfSurgery) {
		this.dateOfSurgery = dateOfSurgery;
	}

	public Timestamp getOrEntryTime() {
		return this.orEntryTime;
	}

	public void setOrEntryTime(Timestamp orEntryTime) {
		this.orEntryTime = orEntryTime;
	}

	public Timestamp getOrExitTime() {
		return this.orExitTime;
	}

	public void setOrExitTime(Timestamp orExitTime) {
		this.orExitTime = orExitTime;
	}

	public Integer getPrimaryProcInd() {
		return this.primaryProcInd;
	}

	public void setPrimaryProcInd(Integer primaryProcInd) {
		this.primaryProcInd = primaryProcInd;
	}

	public Integer getReasonForRetToOr() {
		return this.reasonForRetToOr;
	}

	public void setReasonForRetToOr(Integer reasonForRetToOr) {
		this.reasonForRetToOr = reasonForRetToOr;
	}

	public Integer getUnexpectedRetToOr() {
		return this.unexpectedRetToOr;
	}

	public void setUnexpectedRetToOr(Integer unexpectedRetToOr) {
		this.unexpectedRetToOr = unexpectedRetToOr;
	}

	public Integer getPostOpEvent30day() {
		return this.postOpEvent30day;
	}

	public void setPostOpEvent30day(Integer postOpEvent30day) {
		this.postOpEvent30day = postOpEvent30day;
	}

	public Integer getDispositionAfterSurg() {
		return this.dispositionAfterSurg;
	}

	public void setDispositionAfterSurg(Integer dispositionAfterSurg) {
		this.dispositionAfterSurg = dispositionAfterSurg;
	}

	public Integer getSurMarginAssessment() {
		return this.surMarginAssessment;
	}

	public void setSurMarginAssessment(Integer surMarginAssessment) {
		this.surMarginAssessment = surMarginAssessment;
	}

	public String getBreastSide() {
		return this.breastSide;
	}

	public void setBreastSide(String breastSide) {
		this.breastSide = breastSide;
	}

	public Integer getBrSurgLocation() {
		return this.brSurgLocation;
	}

	public void setBrSurgLocation(Integer brSurgLocation) {
		this.brSurgLocation = brSurgLocation;
	}

	public String getAnesthesiaType() {
		return this.anesthesiaType;
	}

	public void setAnesthesiaType(String anesthesiaType) {
		this.anesthesiaType = anesthesiaType;
	}

	public Integer getSurTimeStatus() {
		return this.surTimeStatus;
	}

	public void setSurTimeStatus(Integer surTimeStatus) {
		this.surTimeStatus = surTimeStatus;
	}

	public Integer getReOperation() {
		return this.reOperation;
	}

	public void setReOperation(Integer reOperation) {
		this.reOperation = reOperation;
	}

	public Integer getIntraopPrbc() {
		return this.intraopPrbc;
	}

	public void setIntraopPrbc(Integer intraopPrbc) {
		this.intraopPrbc = intraopPrbc;
	}

	public Integer getAsaClassification() {
		return this.asaClassification;
	}

	public void setAsaClassification(Integer asaClassification) {
		this.asaClassification = asaClassification;
	}

	public Integer getTumourSpill() {
		return this.tumourSpill;
	}

	public void setTumourSpill(Integer tumourSpill) {
		this.tumourSpill = tumourSpill;
	}

}
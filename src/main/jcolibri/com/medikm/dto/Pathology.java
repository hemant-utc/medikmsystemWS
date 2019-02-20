package com.medikm.dto;

import java.sql.Timestamp;

/**
 * Pathology entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Pathology implements java.io.Serializable {

	// Fields

	private Integer encounterId;
	private Case1 case1;
	private CancerType cancerType;
	private Encounter encounter;
	private PathologyType pathologyType;
	private CancerSubType cancerSubType;
	private Physician physician;
	private Integer PRptId;
	private Timestamp dtSmReceived;
	private Timestamp timeSmReceived;
	private Timestamp timeSmProcessed;
	private Timestamp timeProcessedSmReviewed;
	private String grossSmDescription;
	private Double tumorSize;
	private Short sizeInvasiveComponent;
	private Short sizeDcisComponent;
	private Short marginsStatus;
	private Double marginsValue;
	private String heSerialSections;
	private Short specialSteins;
	private String specialSteinsComm;
	private String tumorLocation;
	private Short multifocal;
	private String multifocalComm;
	private Short multicentric;
	private String multicentricComm;
	private Short disseminatedDcis;
	private String disseminatedDcisComm;
	private String erStatus;
	private Integer erPercent;
	private String prStatus;
	private Integer prPercent;
	private String her2neuStatus;
	private String her2neuSish;
	private Short histologicalGrade;
	private Short lymphNodeIdentified;
	private Short sizeLargestLymphNode;
	private Short extraNodalFatextension;
	private Integer negtiveNode;
	private Integer positiveNode;
	private String lymphNodeAnalysis;
	private Timestamp pathReportDt;
	private Boolean lymphovascularInvasion;
	private String lymphovascularInvasionComm;
	private Integer noNodeResected;
	private Integer noNodeWithMetastaticCancer;
	private Integer anyMattedNodes;
	private Integer fishRating;
	private Long fishValue;
	private String nuclearGrade;
	private Integer dermLymphInv;
	private Integer vascLymphInv;
	private Integer dcisextIdcomp;
	private Integer tumNecrosis;
	private String siteOfDistantMets;
	private Integer oncotypeDx;
	private Integer allredEr;
	private Integer allredPr;
	private String sbrGrade;

	// Constructors

	/** default constructor */
	public Pathology() {
	}

	/** minimal constructor */
	public Pathology(Integer encounterId, Encounter encounter, String lymphovascularInvasionComm) {
		this.encounterId = encounterId;
		this.encounter = encounter;
		this.lymphovascularInvasionComm = lymphovascularInvasionComm;
	}

	/** full constructor */
	public Pathology(Integer encounterId, Case1 case1, CancerType cancerType, Encounter encounter,
			PathologyType pathologyType, CancerSubType cancerSubType, Physician physician, Integer PRptId,
			Timestamp dtSmReceived, Timestamp timeSmReceived, Timestamp timeSmProcessed,
			Timestamp timeProcessedSmReviewed, String grossSmDescription, Double tumorSize, Short sizeInvasiveComponent,
			Short sizeDcisComponent, Short marginsStatus, Double marginsValue, String heSerialSections,
			Short specialSteins, String specialSteinsComm, String tumorLocation, Short multifocal,
			String multifocalComm, Short multicentric, String multicentricComm, Short disseminatedDcis,
			String disseminatedDcisComm, String erStatus, Integer erPercent, String prStatus, Integer prPercent,
			String her2neuStatus, String her2neuSish, Short histologicalGrade, Short lymphNodeIdentified,
			Short sizeLargestLymphNode, Short extraNodalFatextension, Integer negtiveNode, Integer positiveNode,
			String lymphNodeAnalysis, Timestamp pathReportDt, Boolean lymphovascularInvasion,
			String lymphovascularInvasionComm, Integer noNodeResected, Integer noNodeWithMetastaticCancer,
			Integer anyMattedNodes, Integer fishRating, Long fishValue, String nuclearGrade, Integer dermLymphInv,
			Integer vascLymphInv, Integer dcisextIdcomp, Integer tumNecrosis, String siteOfDistantMets,
			Integer oncotypeDx, Integer allredEr, Integer allredPr, String sbrGrade) {
		this.encounterId = encounterId;
		this.case1 = case1;
		this.cancerType = cancerType;
		this.encounter = encounter;
		this.pathologyType = pathologyType;
		this.cancerSubType = cancerSubType;
		this.physician = physician;
		this.PRptId = PRptId;
		this.dtSmReceived = dtSmReceived;
		this.timeSmReceived = timeSmReceived;
		this.timeSmProcessed = timeSmProcessed;
		this.timeProcessedSmReviewed = timeProcessedSmReviewed;
		this.grossSmDescription = grossSmDescription;
		this.tumorSize = tumorSize;
		this.sizeInvasiveComponent = sizeInvasiveComponent;
		this.sizeDcisComponent = sizeDcisComponent;
		this.marginsStatus = marginsStatus;
		this.marginsValue = marginsValue;
		this.heSerialSections = heSerialSections;
		this.specialSteins = specialSteins;
		this.specialSteinsComm = specialSteinsComm;
		this.tumorLocation = tumorLocation;
		this.multifocal = multifocal;
		this.multifocalComm = multifocalComm;
		this.multicentric = multicentric;
		this.multicentricComm = multicentricComm;
		this.disseminatedDcis = disseminatedDcis;
		this.disseminatedDcisComm = disseminatedDcisComm;
		this.erStatus = erStatus;
		this.erPercent = erPercent;
		this.prStatus = prStatus;
		this.prPercent = prPercent;
		this.her2neuStatus = her2neuStatus;
		this.her2neuSish = her2neuSish;
		this.histologicalGrade = histologicalGrade;
		this.lymphNodeIdentified = lymphNodeIdentified;
		this.sizeLargestLymphNode = sizeLargestLymphNode;
		this.extraNodalFatextension = extraNodalFatextension;
		this.negtiveNode = negtiveNode;
		this.positiveNode = positiveNode;
		this.lymphNodeAnalysis = lymphNodeAnalysis;
		this.pathReportDt = pathReportDt;
		this.lymphovascularInvasion = lymphovascularInvasion;
		this.lymphovascularInvasionComm = lymphovascularInvasionComm;
		this.noNodeResected = noNodeResected;
		this.noNodeWithMetastaticCancer = noNodeWithMetastaticCancer;
		this.anyMattedNodes = anyMattedNodes;
		this.fishRating = fishRating;
		this.fishValue = fishValue;
		this.nuclearGrade = nuclearGrade;
		this.dermLymphInv = dermLymphInv;
		this.vascLymphInv = vascLymphInv;
		this.dcisextIdcomp = dcisextIdcomp;
		this.tumNecrosis = tumNecrosis;
		this.siteOfDistantMets = siteOfDistantMets;
		this.oncotypeDx = oncotypeDx;
		this.allredEr = allredEr;
		this.allredPr = allredPr;
		this.sbrGrade = sbrGrade;
	}

	// Property accessors

	public Integer getEncounterId() {
		return this.encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public CancerType getCancerType() {
		return this.cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public PathologyType getPathologyType() {
		return this.pathologyType;
	}

	public void setPathologyType(PathologyType pathologyType) {
		this.pathologyType = pathologyType;
	}

	public CancerSubType getCancerSubType() {
		return this.cancerSubType;
	}

	public void setCancerSubType(CancerSubType cancerSubType) {
		this.cancerSubType = cancerSubType;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public Integer getPRptId() {
		return this.PRptId;
	}

	public void setPRptId(Integer PRptId) {
		this.PRptId = PRptId;
	}

	public Timestamp getDtSmReceived() {
		return this.dtSmReceived;
	}

	public void setDtSmReceived(Timestamp dtSmReceived) {
		this.dtSmReceived = dtSmReceived;
	}

	public Timestamp getTimeSmReceived() {
		return this.timeSmReceived;
	}

	public void setTimeSmReceived(Timestamp timeSmReceived) {
		this.timeSmReceived = timeSmReceived;
	}

	public Timestamp getTimeSmProcessed() {
		return this.timeSmProcessed;
	}

	public void setTimeSmProcessed(Timestamp timeSmProcessed) {
		this.timeSmProcessed = timeSmProcessed;
	}

	public Timestamp getTimeProcessedSmReviewed() {
		return this.timeProcessedSmReviewed;
	}

	public void setTimeProcessedSmReviewed(Timestamp timeProcessedSmReviewed) {
		this.timeProcessedSmReviewed = timeProcessedSmReviewed;
	}

	public String getGrossSmDescription() {
		return this.grossSmDescription;
	}

	public void setGrossSmDescription(String grossSmDescription) {
		this.grossSmDescription = grossSmDescription;
	}

	public Double getTumorSize() {
		return this.tumorSize;
	}

	public void setTumorSize(Double tumorSize) {
		this.tumorSize = tumorSize;
	}

	public Short getSizeInvasiveComponent() {
		return this.sizeInvasiveComponent;
	}

	public void setSizeInvasiveComponent(Short sizeInvasiveComponent) {
		this.sizeInvasiveComponent = sizeInvasiveComponent;
	}

	public Short getSizeDcisComponent() {
		return this.sizeDcisComponent;
	}

	public void setSizeDcisComponent(Short sizeDcisComponent) {
		this.sizeDcisComponent = sizeDcisComponent;
	}

	public Short getMarginsStatus() {
		return this.marginsStatus;
	}

	public void setMarginsStatus(Short marginsStatus) {
		this.marginsStatus = marginsStatus;
	}

	public Double getMarginsValue() {
		return this.marginsValue;
	}

	public void setMarginsValue(Double marginsValue) {
		this.marginsValue = marginsValue;
	}

	public String getHeSerialSections() {
		return this.heSerialSections;
	}

	public void setHeSerialSections(String heSerialSections) {
		this.heSerialSections = heSerialSections;
	}

	public Short getSpecialSteins() {
		return this.specialSteins;
	}

	public void setSpecialSteins(Short specialSteins) {
		this.specialSteins = specialSteins;
	}

	public String getSpecialSteinsComm() {
		return this.specialSteinsComm;
	}

	public void setSpecialSteinsComm(String specialSteinsComm) {
		this.specialSteinsComm = specialSteinsComm;
	}

	public String getTumorLocation() {
		return this.tumorLocation;
	}

	public void setTumorLocation(String tumorLocation) {
		this.tumorLocation = tumorLocation;
	}

	public Short getMultifocal() {
		return this.multifocal;
	}

	public void setMultifocal(Short multifocal) {
		this.multifocal = multifocal;
	}

	public String getMultifocalComm() {
		return this.multifocalComm;
	}

	public void setMultifocalComm(String multifocalComm) {
		this.multifocalComm = multifocalComm;
	}

	public Short getMulticentric() {
		return this.multicentric;
	}

	public void setMulticentric(Short multicentric) {
		this.multicentric = multicentric;
	}

	public String getMulticentricComm() {
		return this.multicentricComm;
	}

	public void setMulticentricComm(String multicentricComm) {
		this.multicentricComm = multicentricComm;
	}

	public Short getDisseminatedDcis() {
		return this.disseminatedDcis;
	}

	public void setDisseminatedDcis(Short disseminatedDcis) {
		this.disseminatedDcis = disseminatedDcis;
	}

	public String getDisseminatedDcisComm() {
		return this.disseminatedDcisComm;
	}

	public void setDisseminatedDcisComm(String disseminatedDcisComm) {
		this.disseminatedDcisComm = disseminatedDcisComm;
	}

	public String getErStatus() {
		return this.erStatus;
	}

	public void setErStatus(String erStatus) {
		this.erStatus = erStatus;
	}

	public Integer getErPercent() {
		return this.erPercent;
	}

	public void setErPercent(Integer erPercent) {
		this.erPercent = erPercent;
	}

	public String getPrStatus() {
		return this.prStatus;
	}

	public void setPrStatus(String prStatus) {
		this.prStatus = prStatus;
	}

	public Integer getPrPercent() {
		return this.prPercent;
	}

	public void setPrPercent(Integer prPercent) {
		this.prPercent = prPercent;
	}

	public String getHer2neuStatus() {
		return this.her2neuStatus;
	}

	public void setHer2neuStatus(String her2neuStatus) {
		this.her2neuStatus = her2neuStatus;
	}

	public String getHer2neuSish() {
		return this.her2neuSish;
	}

	public void setHer2neuSish(String her2neuSish) {
		this.her2neuSish = her2neuSish;
	}

	public Short getHistologicalGrade() {
		return this.histologicalGrade;
	}

	public void setHistologicalGrade(Short histologicalGrade) {
		this.histologicalGrade = histologicalGrade;
	}

	public Short getLymphNodeIdentified() {
		return this.lymphNodeIdentified;
	}

	public void setLymphNodeIdentified(Short lymphNodeIdentified) {
		this.lymphNodeIdentified = lymphNodeIdentified;
	}

	public Short getSizeLargestLymphNode() {
		return this.sizeLargestLymphNode;
	}

	public void setSizeLargestLymphNode(Short sizeLargestLymphNode) {
		this.sizeLargestLymphNode = sizeLargestLymphNode;
	}

	public Short getExtraNodalFatextension() {
		return this.extraNodalFatextension;
	}

	public void setExtraNodalFatextension(Short extraNodalFatextension) {
		this.extraNodalFatextension = extraNodalFatextension;
	}

	public Integer getNegtiveNode() {
		return this.negtiveNode;
	}

	public void setNegtiveNode(Integer negtiveNode) {
		this.negtiveNode = negtiveNode;
	}

	public Integer getPositiveNode() {
		return this.positiveNode;
	}

	public void setPositiveNode(Integer positiveNode) {
		this.positiveNode = positiveNode;
	}

	public String getLymphNodeAnalysis() {
		return this.lymphNodeAnalysis;
	}

	public void setLymphNodeAnalysis(String lymphNodeAnalysis) {
		this.lymphNodeAnalysis = lymphNodeAnalysis;
	}

	public Timestamp getPathReportDt() {
		return this.pathReportDt;
	}

	public void setPathReportDt(Timestamp pathReportDt) {
		this.pathReportDt = pathReportDt;
	}

	public Boolean getLymphovascularInvasion() {
		return this.lymphovascularInvasion;
	}

	public void setLymphovascularInvasion(Boolean lymphovascularInvasion) {
		this.lymphovascularInvasion = lymphovascularInvasion;
	}

	public String getLymphovascularInvasionComm() {
		return this.lymphovascularInvasionComm;
	}

	public void setLymphovascularInvasionComm(String lymphovascularInvasionComm) {
		this.lymphovascularInvasionComm = lymphovascularInvasionComm;
	}

	public Integer getNoNodeResected() {
		return this.noNodeResected;
	}

	public void setNoNodeResected(Integer noNodeResected) {
		this.noNodeResected = noNodeResected;
	}

	public Integer getNoNodeWithMetastaticCancer() {
		return this.noNodeWithMetastaticCancer;
	}

	public void setNoNodeWithMetastaticCancer(Integer noNodeWithMetastaticCancer) {
		this.noNodeWithMetastaticCancer = noNodeWithMetastaticCancer;
	}

	public Integer getAnyMattedNodes() {
		return this.anyMattedNodes;
	}

	public void setAnyMattedNodes(Integer anyMattedNodes) {
		this.anyMattedNodes = anyMattedNodes;
	}

	public Integer getFishRating() {
		return this.fishRating;
	}

	public void setFishRating(Integer fishRating) {
		this.fishRating = fishRating;
	}

	public Long getFishValue() {
		return this.fishValue;
	}

	public void setFishValue(Long fishValue) {
		this.fishValue = fishValue;
	}

	public String getNuclearGrade() {
		return this.nuclearGrade;
	}

	public void setNuclearGrade(String nuclearGrade) {
		this.nuclearGrade = nuclearGrade;
	}

	public Integer getDermLymphInv() {
		return this.dermLymphInv;
	}

	public void setDermLymphInv(Integer dermLymphInv) {
		this.dermLymphInv = dermLymphInv;
	}

	public Integer getVascLymphInv() {
		return this.vascLymphInv;
	}

	public void setVascLymphInv(Integer vascLymphInv) {
		this.vascLymphInv = vascLymphInv;
	}

	public Integer getDcisextIdcomp() {
		return this.dcisextIdcomp;
	}

	public void setDcisextIdcomp(Integer dcisextIdcomp) {
		this.dcisextIdcomp = dcisextIdcomp;
	}

	public Integer getTumNecrosis() {
		return this.tumNecrosis;
	}

	public void setTumNecrosis(Integer tumNecrosis) {
		this.tumNecrosis = tumNecrosis;
	}

	public String getSiteOfDistantMets() {
		return this.siteOfDistantMets;
	}

	public void setSiteOfDistantMets(String siteOfDistantMets) {
		this.siteOfDistantMets = siteOfDistantMets;
	}

	public Integer getOncotypeDx() {
		return this.oncotypeDx;
	}

	public void setOncotypeDx(Integer oncotypeDx) {
		this.oncotypeDx = oncotypeDx;
	}

	public Integer getAllredEr() {
		return this.allredEr;
	}

	public void setAllredEr(Integer allredEr) {
		this.allredEr = allredEr;
	}

	public Integer getAllredPr() {
		return this.allredPr;
	}

	public void setAllredPr(Integer allredPr) {
		this.allredPr = allredPr;
	}

	public String getSbrGrade() {
		return this.sbrGrade;
	}

	public void setSbrGrade(String sbrGrade) {
		this.sbrGrade = sbrGrade;
	}

}
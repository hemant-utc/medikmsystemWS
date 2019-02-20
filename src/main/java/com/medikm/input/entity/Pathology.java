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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "pathology")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Pathology.findAll", query = "SELECT p FROM Pathology p") })
public class Pathology implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Encounter_Id")
	private Integer encounterId;
	@Column(name = "P_Rpt_Id")
	private Integer pRptId;
	@Column(name = "Dt_Sm_Received")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtSmReceived;
	@Column(name = "Time_Sm_Received")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeSmReceived;
	@Column(name = "Time_Sm_Processed")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeSmProcessed;
	@Column(name = "Time_Processed_Sm_Reviewed")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeProcessedSmReviewed;
	@Lob
	@Column(name = "Gross_Sm_Description")
	private String grossSmDescription;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "Tumor_Size")
	private Double tumorSize;
	@Column(name = "Size_Invasive_Component")
	private Short sizeInvasiveComponent;
	@Column(name = "Size_DCIS_Component")
	private Short sizeDCISComponent;
	@Column(name = "Margins_Status")
	private Short marginsStatus;
	@Column(name = "Margins_Value")
	private Double marginsValue;
	@Column(name = "HE_Serial_Sections")
	private String hESerialSections;
	@Column(name = "Special_Steins")
	private Short specialSteins;
	@Lob
	@Column(name = "Special_Steins_Comm")
	private String specialSteinsComm;
	@Column(name = "Tumor_Location")
	private String tumorLocation;
	@Column(name = "Multifocal")
	private Short multifocal;
	@Lob
	@Column(name = "Multifocal_Comm")
	private String multifocalComm;
	@Column(name = "Multicentric")
	private Short multicentric;
	@Lob
	@Column(name = "Multicentric_Comm")
	private String multicentricComm;
	@Column(name = "Disseminated_DCIS")
	private Short disseminatedDCIS;
	@Lob
	@Column(name = "Disseminated_DCIS_Comm")
	private String disseminatedDCISComm;
	@Column(name = "ER_Status")
	private String eRStatus;
	@Column(name = "ER_Percent")
	private Integer eRPercent;
	@Column(name = "PR_Status")
	private String pRStatus;
	@Column(name = "PR_Percent")
	private Integer pRPercent;
	@Column(name = "HER2neu_Status")
	private String hER2neuStatus;
	@Column(name = "HER2neu_SISH")
	private String hER2neuSISH;
	@Column(name = "Histological_Grade")
	private Short histologicalGrade;
	@Column(name = "Lymph_Node_Identified")
	private Short lymphNodeIdentified;
	@Column(name = "Size_Largest_Lymph_Node")
	private Short sizeLargestLymphNode;
	@Column(name = "Extra_Nodal_Fatextension")
	private Short extraNodalFatextension;
	@Column(name = "Negtive_Node")
	private Integer negtiveNode;
	@Column(name = "Positive_Node")
	private Integer positiveNode;
	@Lob
	@Column(name = "Lymph_Node_Analysis")
	private String lymphNodeAnalysis;
	@Column(name = "Path_Report_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date pathReportDt;
	@Column(name = "Lymphovascular_Invasion")
	private Boolean lymphovascularInvasion;
	@Basic(optional = false)
	@Lob
	@Column(name = "Lymphovascular_Invasion_Comm")
	private String lymphovascularInvasionComm;
	@Column(name = "No_Node_Resected")
	private Integer noNodeResected;
	@Column(name = "No_Node_With_MetastaticCancer")
	private Integer noNodeWithMetastaticCancer;
	@Column(name = "Any_Matted_Nodes")
	private Integer anyMattedNodes;
	@Column(name = "FISH_Rating")
	private Integer fISHRating;
	@Column(name = "FISH_Value")
	private Long fISHValue;
	@Column(name = "Nuclear_Grade")
	private Character nuclearGrade;
	@Column(name = "Derm_Lymph_Inv")
	private Integer dermLymphInv;
	@Column(name = "Vasc_Lymph_Inv")
	private Integer vascLymphInv;
	@Column(name = "DCISExtIDComp")
	private Integer dCISExtIDComp;
	@Column(name = "Tum_Necrosis")
	private Integer tumNecrosis;
	@Column(name = "SiteOfDistantMets")
	private Character siteOfDistantMets;
	@Column(name = "OncotypeDx")
	private Integer oncotypeDx;
	@Column(name = "ALLRED_ER")
	private Integer allredEr;
	@Column(name = "ALLRED_PR")
	private Integer allredPr;
	@Column(name = "SBR_Grade")
	private Character sBRGrade;
	@JoinColumn(name = "Cancer_Type", referencedColumnName = "Can_Type_Id")
	@ManyToOne
	private CancerType cancerType;
	@JoinColumn(name = "Pathology_Type", referencedColumnName = "Type_Id")
	@ManyToOne
	private PathologyType pathologyType;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne
	private Case1 caseId;
	@JoinColumn(name = "Physician_Id", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician physicianId;
	@JoinColumn(name = "Encounter_Id", referencedColumnName = "Encounter_Id", insertable = false, updatable = false)
	@OneToOne(optional = false)
	private Encounter encounter;
	@JoinColumn(name = "Cancer_Sub_Type", referencedColumnName = "Can_Sub_Type_Id")
	@ManyToOne
	private CancerSubType cancerSubType;

	public Pathology() {
	}

	public Pathology(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Pathology(Integer encounterId, String lymphovascularInvasionComm) {
		this.encounterId = encounterId;
		this.lymphovascularInvasionComm = lymphovascularInvasionComm;
	}

	public Integer getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Integer getPRptId() {
		return pRptId;
	}

	public void setPRptId(Integer pRptId) {
		this.pRptId = pRptId;
	}

	public Date getDtSmReceived() {
		return dtSmReceived;
	}

	public void setDtSmReceived(Date dtSmReceived) {
		this.dtSmReceived = dtSmReceived;
	}

	public Date getTimeSmReceived() {
		return timeSmReceived;
	}

	public void setTimeSmReceived(Date timeSmReceived) {
		this.timeSmReceived = timeSmReceived;
	}

	public Date getTimeSmProcessed() {
		return timeSmProcessed;
	}

	public void setTimeSmProcessed(Date timeSmProcessed) {
		this.timeSmProcessed = timeSmProcessed;
	}

	public Date getTimeProcessedSmReviewed() {
		return timeProcessedSmReviewed;
	}

	public void setTimeProcessedSmReviewed(Date timeProcessedSmReviewed) {
		this.timeProcessedSmReviewed = timeProcessedSmReviewed;
	}

	public String getGrossSmDescription() {
		return grossSmDescription;
	}

	public void setGrossSmDescription(String grossSmDescription) {
		this.grossSmDescription = grossSmDescription;
	}

	public Double getTumorSize() {
		return tumorSize;
	}

	public void setTumorSize(Double tumorSize) {
		this.tumorSize = tumorSize;
	}

	public Short getSizeInvasiveComponent() {
		return sizeInvasiveComponent;
	}

	public void setSizeInvasiveComponent(Short sizeInvasiveComponent) {
		this.sizeInvasiveComponent = sizeInvasiveComponent;
	}

	public Short getSizeDCISComponent() {
		return sizeDCISComponent;
	}

	public void setSizeDCISComponent(Short sizeDCISComponent) {
		this.sizeDCISComponent = sizeDCISComponent;
	}

	public Short getMarginsStatus() {
		return marginsStatus;
	}

	public void setMarginsStatus(Short marginsStatus) {
		this.marginsStatus = marginsStatus;
	}

	public Double getMarginsValue() {
		return marginsValue;
	}

	public void setMarginsValue(Double marginsValue) {
		this.marginsValue = marginsValue;
	}

	public String getHESerialSections() {
		return hESerialSections;
	}

	public void setHESerialSections(String hESerialSections) {
		this.hESerialSections = hESerialSections;
	}

	public Short getSpecialSteins() {
		return specialSteins;
	}

	public void setSpecialSteins(Short specialSteins) {
		this.specialSteins = specialSteins;
	}

	public String getSpecialSteinsComm() {
		return specialSteinsComm;
	}

	public void setSpecialSteinsComm(String specialSteinsComm) {
		this.specialSteinsComm = specialSteinsComm;
	}

	public String getTumorLocation() {
		return tumorLocation;
	}

	public void setTumorLocation(String tumorLocation) {
		this.tumorLocation = tumorLocation;
	}

	public Short getMultifocal() {
		return multifocal;
	}

	public void setMultifocal(Short multifocal) {
		this.multifocal = multifocal;
	}

	public String getMultifocalComm() {
		return multifocalComm;
	}

	public void setMultifocalComm(String multifocalComm) {
		this.multifocalComm = multifocalComm;
	}

	public Short getMulticentric() {
		return multicentric;
	}

	public void setMulticentric(Short multicentric) {
		this.multicentric = multicentric;
	}

	public String getMulticentricComm() {
		return multicentricComm;
	}

	public void setMulticentricComm(String multicentricComm) {
		this.multicentricComm = multicentricComm;
	}

	public Short getDisseminatedDCIS() {
		return disseminatedDCIS;
	}

	public void setDisseminatedDCIS(Short disseminatedDCIS) {
		this.disseminatedDCIS = disseminatedDCIS;
	}

	public String getDisseminatedDCISComm() {
		return disseminatedDCISComm;
	}

	public void setDisseminatedDCISComm(String disseminatedDCISComm) {
		this.disseminatedDCISComm = disseminatedDCISComm;
	}

	public String getERStatus() {
		return eRStatus;
	}

	public void setERStatus(String eRStatus) {
		this.eRStatus = eRStatus;
	}

	public Integer getERPercent() {
		return eRPercent;
	}

	public void setERPercent(Integer eRPercent) {
		this.eRPercent = eRPercent;
	}

	public String getPRStatus() {
		return pRStatus;
	}

	public void setPRStatus(String pRStatus) {
		this.pRStatus = pRStatus;
	}

	public Integer getPRPercent() {
		return pRPercent;
	}

	public void setPRPercent(Integer pRPercent) {
		this.pRPercent = pRPercent;
	}

	public String getHER2neuStatus() {
		return hER2neuStatus;
	}

	public void setHER2neuStatus(String hER2neuStatus) {
		this.hER2neuStatus = hER2neuStatus;
	}

	public String getHER2neuSISH() {
		return hER2neuSISH;
	}

	public void setHER2neuSISH(String hER2neuSISH) {
		this.hER2neuSISH = hER2neuSISH;
	}

	public Short getHistologicalGrade() {
		return histologicalGrade;
	}

	public void setHistologicalGrade(Short histologicalGrade) {
		this.histologicalGrade = histologicalGrade;
	}

	public Short getLymphNodeIdentified() {
		return lymphNodeIdentified;
	}

	public void setLymphNodeIdentified(Short lymphNodeIdentified) {
		this.lymphNodeIdentified = lymphNodeIdentified;
	}

	public Short getSizeLargestLymphNode() {
		return sizeLargestLymphNode;
	}

	public void setSizeLargestLymphNode(Short sizeLargestLymphNode) {
		this.sizeLargestLymphNode = sizeLargestLymphNode;
	}

	public Short getExtraNodalFatextension() {
		return extraNodalFatextension;
	}

	public void setExtraNodalFatextension(Short extraNodalFatextension) {
		this.extraNodalFatextension = extraNodalFatextension;
	}

	public Integer getNegtiveNode() {
		return negtiveNode;
	}

	public void setNegtiveNode(Integer negtiveNode) {
		this.negtiveNode = negtiveNode;
	}

	public Integer getPositiveNode() {
		return positiveNode;
	}

	public void setPositiveNode(Integer positiveNode) {
		this.positiveNode = positiveNode;
	}

	public String getLymphNodeAnalysis() {
		return lymphNodeAnalysis;
	}

	public void setLymphNodeAnalysis(String lymphNodeAnalysis) {
		this.lymphNodeAnalysis = lymphNodeAnalysis;
	}

	public Date getPathReportDt() {
		return pathReportDt;
	}

	public void setPathReportDt(Date pathReportDt) {
		this.pathReportDt = pathReportDt;
	}

	public Boolean getLymphovascularInvasion() {
		return lymphovascularInvasion;
	}

	public void setLymphovascularInvasion(Boolean lymphovascularInvasion) {
		this.lymphovascularInvasion = lymphovascularInvasion;
	}

	public String getLymphovascularInvasionComm() {
		return lymphovascularInvasionComm;
	}

	public void setLymphovascularInvasionComm(String lymphovascularInvasionComm) {
		this.lymphovascularInvasionComm = lymphovascularInvasionComm;
	}

	public Integer getNoNodeResected() {
		return noNodeResected;
	}

	public void setNoNodeResected(Integer noNodeResected) {
		this.noNodeResected = noNodeResected;
	}

	public Integer getNoNodeWithMetastaticCancer() {
		return noNodeWithMetastaticCancer;
	}

	public void setNoNodeWithMetastaticCancer(Integer noNodeWithMetastaticCancer) {
		this.noNodeWithMetastaticCancer = noNodeWithMetastaticCancer;
	}

	public Integer getAnyMattedNodes() {
		return anyMattedNodes;
	}

	public void setAnyMattedNodes(Integer anyMattedNodes) {
		this.anyMattedNodes = anyMattedNodes;
	}

	public Integer getFISHRating() {
		return fISHRating;
	}

	public void setFISHRating(Integer fISHRating) {
		this.fISHRating = fISHRating;
	}

	public Long getFISHValue() {
		return fISHValue;
	}

	public void setFISHValue(Long fISHValue) {
		this.fISHValue = fISHValue;
	}

	public Character getNuclearGrade() {
		return nuclearGrade;
	}

	public void setNuclearGrade(Character nuclearGrade) {
		this.nuclearGrade = nuclearGrade;
	}

	public Integer getDermLymphInv() {
		return dermLymphInv;
	}

	public void setDermLymphInv(Integer dermLymphInv) {
		this.dermLymphInv = dermLymphInv;
	}

	public Integer getVascLymphInv() {
		return vascLymphInv;
	}

	public void setVascLymphInv(Integer vascLymphInv) {
		this.vascLymphInv = vascLymphInv;
	}

	public Integer getDCISExtIDComp() {
		return dCISExtIDComp;
	}

	public void setDCISExtIDComp(Integer dCISExtIDComp) {
		this.dCISExtIDComp = dCISExtIDComp;
	}

	public Integer getTumNecrosis() {
		return tumNecrosis;
	}

	public void setTumNecrosis(Integer tumNecrosis) {
		this.tumNecrosis = tumNecrosis;
	}

	public Character getSiteOfDistantMets() {
		return siteOfDistantMets;
	}

	public void setSiteOfDistantMets(Character siteOfDistantMets) {
		this.siteOfDistantMets = siteOfDistantMets;
	}

	public Integer getOncotypeDx() {
		return oncotypeDx;
	}

	public void setOncotypeDx(Integer oncotypeDx) {
		this.oncotypeDx = oncotypeDx;
	}

	public Integer getAllredEr() {
		return allredEr;
	}

	public void setAllredEr(Integer allredEr) {
		this.allredEr = allredEr;
	}

	public Integer getAllredPr() {
		return allredPr;
	}

	public void setAllredPr(Integer allredPr) {
		this.allredPr = allredPr;
	}

	public Character getSBRGrade() {
		return sBRGrade;
	}

	public void setSBRGrade(Character sBRGrade) {
		this.sBRGrade = sBRGrade;
	}

	public CancerType getCancerType() {
		return cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	public PathologyType getPathologyType() {
		return pathologyType;
	}

	public void setPathologyType(PathologyType pathologyType) {
		this.pathologyType = pathologyType;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public Physician getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(Physician physicianId) {
		this.physicianId = physicianId;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public CancerSubType getCancerSubType() {
		return cancerSubType;
	}

	public void setCancerSubType(CancerSubType cancerSubType) {
		this.cancerSubType = cancerSubType;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (encounterId != null ? encounterId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Pathology)) {
			return false;
		}
		Pathology other = (Pathology) object;
		if ((this.encounterId == null && other.encounterId != null)
				|| (this.encounterId != null && !this.encounterId.equals(other.encounterId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Pathology[ encounterId=" + encounterId + " ]";
	}

}

/**
 * 
 */
package com.medikm.input.request;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Saikat
 * 
 */
@ApiModel(value = "Episode Response", description = "Episode Response", subTypes = { Serializable.class })
public class EpisodeRequest implements Serializable {
	private static final long serialVersionUID = -2322053398388161994L;

	private Integer episodeId;
	private String reasonForPresentation;
	private String casehistory;
	private Short noOfPregnancy;
	private Short noOfDelivery;
	private Boolean bcp;
	private Boolean hrt;
	private String familyHistory;
	private Integer functionalStatus;
	private Integer diseaseType;
	private Integer caseId;
	private Integer patientId;
	private String menopauseStatus;
	private List<BiopsyRequest> biopsyList;
	private List<SurgicalProcedureRequest> surgicalProcedureList;
	private List<PhysicalExamRequest> physicalExamList;
	private List<ImagingRequest> imagingList;
	private String comorbidities;
	private String relativeIntraoperativeFindings;
	private String imagingFindings;
	private Integer customerId;
	private int tumorBoardId;
	private String biopsyFindings;
	private String otherHistory;
	private String pathologyFindings;
	private String frozenSectionFindings;
	private Short traumaHx;
	private Short rtHx;
	private Short toxicChemicals;
	private String discussionDt;
	private String discussionStartDt;
	private String discussionEndDt;
	private String recommendedPlan;
	private String optionConsideredComment;
	private Short adequatePreviousSurgery;
	private Short clinicalPresentation;
	private Short incidentalFinding;
	private String bmi;
	private List<Integer> symptomsId;
	private String nextVisitDate;
	private Integer calciumLevel;
	private Integer cadmiumLevel;
	private Boolean prostatitis;
	private String status;
	private String caseStatus;
	private Integer physicianId;
	private String authToken;

	@ApiModelProperty(value = "Status", notes = "Status", dataType = "String")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@ApiModelProperty(value = "Recommended Plan", notes = "Recommended Plan", dataType = "String")
	public String getRecommendedPlan() {
		return recommendedPlan;
	}

	public void setRecommendedPlan(String recommendedPlan) {
		this.recommendedPlan = recommendedPlan;
	}

	@ApiModelProperty(value = "Option Considered Comment", notes = "Option Considered Comment", dataType = "String")
	public String getOptionConsideredComment() {
		return optionConsideredComment;
	}

	public void setOptionConsideredComment(String optionConsideredComment) {
		this.optionConsideredComment = optionConsideredComment;
	}

	/**
	 * @return the reasonForPresentation
	 */
	@ApiModelProperty(value = "Reason For Presentation", notes = "Reason For Presentation", dataType = "String")
	public String getReasonForPresentation() {
		return reasonForPresentation;
	}

	/**
	 * @param reasonForPresentation
	 *            the reasonForPresentation to set
	 */
	public void setReasonForPresentation(String reasonForPresentation) {
		this.reasonForPresentation = reasonForPresentation;
	}

	/**
	 * @return the casehistory
	 */
	@ApiModelProperty(value = "Casehistory", notes = "Casehistory", dataType = "String")
	public String getCasehistory() {
		return casehistory;
	}

	/**
	 * @param casehistory
	 *            the casehistory to set
	 */
	public void setCasehistory(String casehistory) {
		this.casehistory = casehistory;
	}

	/**
	 * @return the noOfPregnancy
	 */
	@ApiModelProperty(value = "No Of Pregnancy", notes = "No Of Pregnancy")
	public Short getNoOfPregnancy() {
		return noOfPregnancy;
	}

	/**
	 * @param noOfPregnancy
	 *            the noOfPregnancy to set
	 */
	public void setNoOfPregnancy(Short noOfPregnancy) {
		this.noOfPregnancy = noOfPregnancy;
	}

	/**
	 * @return the noOfDelivery
	 */
	@ApiModelProperty(value = "No Of Delivery", notes = "No Of Delivery")
	public Short getNoOfDelivery() {
		return noOfDelivery;
	}

	/**
	 * @param noOfDelivery
	 *            the noOfDelivery to set
	 */
	public void setNoOfDelivery(Short noOfDelivery) {
		this.noOfDelivery = noOfDelivery;
	}

	/**
	 * @return the bCP
	 */
	@ApiModelProperty(value = "Bcp", notes = "Bcp", dataType = "Boolean")
	public Boolean getBcp() {
		return bcp;
	}

	/**
	 * @param bCP
	 *            the bCP to set
	 */
	public void setBcp(Boolean bcp) {
		this.bcp = bcp;
	}

	/**
	 * @return the hRT
	 */
	@ApiModelProperty(value = "Hrt", notes = "Hrt", dataType = "Boolean")
	public Boolean getHrt() {
		return hrt;
	}

	/**
	 * @param hRT
	 *            the hRT to set
	 */
	public void setHrt(Boolean hrt) {
		this.hrt = hrt;
	}

	/**
	 * @return the familyHistory
	 */
	@ApiModelProperty(value = "Family History", notes = "Family History", dataType = "String")
	public String getFamilyHistory() {
		return familyHistory;
	}

	/**
	 * @param familyHistory
	 *            the familyHistory to set
	 */
	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}

	/**
	 * @return the functionalStatus
	 */
	@ApiModelProperty(value = "Functional Status", notes = "Functional Status", dataType = "Integer")
	public Integer getFunctionalStatus() {
		return functionalStatus;
	}

	/**
	 * @param functionalStatus
	 *            the functionalStatus to set
	 */
	public void setFunctionalStatus(Integer functionalStatus) {
		this.functionalStatus = functionalStatus;
	}

	/**
	 * @return the diseaseType
	 */
	@ApiModelProperty(value = "Disease Type", notes = "Disease Type", dataType = "Integer")
	public Integer getDiseaseType() {
		return diseaseType;
	}

	/**
	 * @param diseaseType
	 *            the diseaseType to set
	 */
	public void setDiseaseType(Integer diseaseType) {
		this.diseaseType = diseaseType;
	}

	/**
	 * @return the caseId
	 */
	@ApiModelProperty(value = "Case Id", notes = "Case Id", dataType = "Integer")
	public Integer getCaseId() {
		return caseId;
	}

	/**
	 * @param caseId
	 *            the caseId to set
	 */
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	/**
	 * @return the patientId
	 */
	@ApiModelProperty(value = "Patient Id", notes = "Patient Id", dataType = "Integer")
	public Integer getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the menopauseStatus
	 */
	@ApiModelProperty(value = "Menopause Status", notes = "Menopause Status", dataType = "String")
	public String getMenopauseStatus() {
		return menopauseStatus;
	}

	/**
	 * @param menopauseStatus
	 *            the menopauseStatus to set
	 */
	public void setMenopauseStatus(String menopauseStatus) {
		this.menopauseStatus = menopauseStatus;
	}

	/**
	 * @return the biopsyList
	 */
	@ApiModelProperty(value = "Biopsy List", notes = "Biopsy List")
	public List<BiopsyRequest> getBiopsyList() {
		return biopsyList;
	}

	/**
	 * @param biopsyList
	 *            the biopsyList to set
	 */
	public void setBiopsyList(List<BiopsyRequest> biopsyList) {
		this.biopsyList = biopsyList;
	}

	/**
	 * @return the surgicalProcedureList
	 */
	@ApiModelProperty(value = "Surgical Procedure List", notes = "Surgical Procedure List")
	public List<SurgicalProcedureRequest> getSurgicalProcedureList() {
		return surgicalProcedureList;
	}

	/**
	 * @param surgicalProcedureList
	 *            the surgicalProcedureList to set
	 */
	public void setSurgicalProcedureList(List<SurgicalProcedureRequest> surgicalProcedureList) {
		this.surgicalProcedureList = surgicalProcedureList;
	}

	/**
	 * @return the physicalExamList
	 */
	@ApiModelProperty(value = "Physical Exam Request", notes = "Physical Exam Request")
	public List<PhysicalExamRequest> getPhysicalExamList() {
		return physicalExamList;
	}

	/**
	 * @param physicalExamList
	 *            the physicalExamList to set
	 */
	public void setPhysicalExamList(List<PhysicalExamRequest> physicalExamList) {
		this.physicalExamList = physicalExamList;
	}

	/**
	 * @return the imagingList
	 */
	@ApiModelProperty(value = "Imaging Request", notes = "Imaging Request")
	public List<ImagingRequest> getImagingList() {
		return imagingList;
	}

	/**
	 * @param imagingList
	 *            the imagingList to set
	 */
	public void setImagingList(List<ImagingRequest> imagingList) {
		this.imagingList = imagingList;
	}

	/**
	 * @return the comorbidities
	 */
	@ApiModelProperty(value = "Comorbidities", notes = "Comorbidities", dataType = "String")
	public String getComorbidities() {
		return comorbidities;
	}

	/**
	 * @param comorbidities
	 *            the comorbidities to set
	 */
	public void setComorbidities(String comorbidities) {
		this.comorbidities = comorbidities;
	}

	/**
	 * @return the imagingFindings
	 */
	@ApiModelProperty(value = "Imaging Findings", notes = "Imaging Findings", dataType = "String")
	public String getImagingFindings() {
		return imagingFindings;
	}

	/**
	 * @param imagingFindings
	 *            the imagingFindings to set
	 */
	public void setImagingFindings(String imagingFindings) {
		this.imagingFindings = imagingFindings;
	}

	/**
	 * @return the relativeIntraoperativeFindings
	 */
	@ApiModelProperty(value = "Relative Intraoperative Findings", notes = "Relative Intraoperative Findings", dataType = "String")
	public String getRelativeIntraoperativeFindings() {
		return relativeIntraoperativeFindings;
	}

	/**
	 * @param relativeIntraoperativeFindings
	 *            the relativeIntraoperativeFindings to set
	 */
	public void setRelativeIntraoperativeFindings(String relativeIntraoperativeFindings) {
		this.relativeIntraoperativeFindings = relativeIntraoperativeFindings;
	}

	/**
	 * @return the episodeId
	 */
	@ApiModelProperty(value = "Episode Id", notes = "Episode Id", dataType = "Integer")
	public Integer getEpisodeId() {
		return episodeId;
	}

	/**
	 * @param episodeId
	 *            the episodeId to set
	 */
	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}

	/**
	 * @return the customerId
	 */
	@ApiModelProperty(value = "Customer Id", notes = "Customer Id", dataType = "Integer")
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the tumorBoardId
	 */
	@ApiModelProperty(value = "Tumor Board Id", notes = "Tumor Board Id", dataType = "int")
	public int getTumorBoardId() {
		return tumorBoardId;
	}

	/**
	 * @param tumorBoardId
	 *            the tumorBoardId to set
	 */
	public void setTumorBoardId(int tumorBoardId) {
		this.tumorBoardId = tumorBoardId;
	}

	/**
	 * @return the biopsyFindings
	 */
	@ApiModelProperty(value = "Biopsy Findings", notes = "Biopsy Findings", dataType = "String")
	public String getBiopsyFindings() {
		return biopsyFindings;
	}

	/**
	 * @param biopsyFindings
	 *            the biopsyFindings to set
	 */
	public void setBiopsyFindings(String biopsyFindings) {
		this.biopsyFindings = biopsyFindings;
	}

	/**
	 * @return the otherHistory
	 */
	@ApiModelProperty(value = "Other History", notes = "Other History", dataType = "String")
	public String getOtherHistory() {
		return otherHistory;
	}

	/**
	 * @param otherHistory
	 *            the otherHistory to set
	 */
	public void setOtherHistory(String otherHistory) {
		this.otherHistory = otherHistory;
	}

	/**
	 * @return the pathologyFindings
	 */
	@ApiModelProperty(value = "Pathology Findings", notes = "Pathology Findings", dataType = "String")
	public String getPathologyFindings() {
		return pathologyFindings;
	}

	/**
	 * @param pathologyFindings
	 *            the pathologyFindings to set
	 */
	public void setPathologyFindings(String pathologyFindings) {
		this.pathologyFindings = pathologyFindings;
	}

	/**
	 * @return the frozenSectionFindings
	 */
	@ApiModelProperty(value = "Frozen Section Findings", notes = "Frozen Section Findings", dataType = "String")
	public String getFrozenSectionFindings() {
		return frozenSectionFindings;
	}

	/**
	 * @param frozenSectionFindings
	 *            the frozenSectionFindings to set
	 */
	public void setFrozenSectionFindings(String frozenSectionFindings) {
		this.frozenSectionFindings = frozenSectionFindings;
	}

	/**
	 * @return the traumaHx
	 */
	@ApiModelProperty(value = "Trauma Hx", notes = "Trauma Hx")
	public Short getTraumaHx() {
		return traumaHx;
	}

	/**
	 * @param traumaHx
	 *            the traumaHx to set
	 */
	public void setTraumaHx(Short traumaHx) {
		this.traumaHx = traumaHx;
	}

	/**
	 * @return the rtHx
	 */
	@ApiModelProperty(value = "Rt Hx", notes = "Rt Hx")
	public Short getRtHx() {
		return rtHx;
	}

	/**
	 * @param rtHx
	 *            the rtHx to set
	 */
	public void setRtHx(Short rtHx) {
		this.rtHx = rtHx;
	}

	/**
	 * @return the toxicChemicals
	 */
	@ApiModelProperty(value = "Toxic Chemicals", notes = "Toxic Chemicals")
	public Short getToxicChemicals() {
		return toxicChemicals;
	}

	/**
	 * @param toxicChemicals
	 *            the toxicChemicals to set
	 */
	public void setToxicChemicals(Short toxicChemicals) {
		this.toxicChemicals = toxicChemicals;
	}

	/**
	 * @return the discussionDt
	 */
	@ApiModelProperty(value = "Discussion Dt", notes = "Discussion Dt", dataType = "String")
	public String getDiscussionDt() {
		return discussionDt;
	}

	/**
	 * @return the discussionStartDt
	 */
	@ApiModelProperty(value = "Discussion Start Dt", notes = "Discussion Start Dt", dataType = "String")
	public String getDiscussionStartDt() {
		return discussionStartDt;
	}

	/**
	 * @return the discussionEndDt
	 */
	@ApiModelProperty(value = "Discussion End Dt", notes = "Discussion End Dt", dataType = "String")
	public String getDiscussionEndDt() {
		return discussionEndDt;
	}

	/**
	 * @param discussionDt
	 *            the discussionDt to set
	 */
	public void setNextVisitDate(String nextVisitDate) {
		this.nextVisitDate = nextVisitDate;
	}

	@ApiModelProperty(value = "Next Visit Date", notes = "Next Visit Date", dataType = "String")
	public String getNextVisitDate() {
		return nextVisitDate;
	}

	/**
	 * @param discussionDt
	 *            the discussionDt to set
	 */
	public void setDiscussionDt(String discussionDt) {
		this.discussionDt = discussionDt;
	}

	/**
	 * @param discussionStartDt
	 *            the discussionStartDt to set
	 */
	public void setDiscussionStartDt(String discussionStartDt) {
		this.discussionStartDt = discussionStartDt;
	}

	/**
	 * @param discussionEndDt
	 *            the discussionDt to set
	 */
	public void setDiscussionEndDt(String discussionEndDt) {
		this.discussionEndDt = discussionEndDt;
	}

	@ApiModelProperty(value = "Adequate Previous Surgery", notes = "Adequate Previous Surgery")
	public Short getAdequatePreviousSurgery() {
		return adequatePreviousSurgery;
	}

	public void setAdequatePreviousSurgery(Short adequatePreviousSurgery) {
		this.adequatePreviousSurgery = adequatePreviousSurgery;
	}

	@ApiModelProperty(value = "Clinical Presentation", notes = "Clinical Presentation")
	public Short getClinicalPresentation() {
		return clinicalPresentation;
	}

	public void setClinicalPresentation(Short clinicalPresentation) {
		this.clinicalPresentation = clinicalPresentation;
	}

	@ApiModelProperty(value = "Incidental Finding", notes = "Incidental Finding")
	public Short getIncidentalFinding() {
		return incidentalFinding;
	}

	public void setIncidentalFinding(Short incidentalFinding) {
		this.incidentalFinding = incidentalFinding;
	}

	@ApiModelProperty(value = "Bmi", notes = "Bmi", dataType = "String")
	public String getBmi() {
		return bmi;
	}

	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	public void setSymptomsId(List<Integer> symptomsId) {
		this.symptomsId = symptomsId;
	}

	/**
	 * @return the surgicalProcedureList
	 */
	@ApiModelProperty(value = "Symptoms Id", notes = "Symptoms Id")
	public List<Integer> getSymptomsId() {
		return symptomsId;
	}

	@ApiModelProperty(value = "Calcium Level", notes = "Calcium Level", dataType = "Integer")
	public Integer getCalciumLevel() {
		return calciumLevel;
	}

	public void setCalciumLevel(Integer calciumLevel) {
		this.calciumLevel = calciumLevel;
	}

	@ApiModelProperty(value = "Cadmium Level", notes = "Cadmium Level", dataType = "Integer")
	public Integer getCadmiumLevel() {
		return cadmiumLevel;
	}

	public void setCadmiumLevel(Integer cadmiumLevel) {
		this.cadmiumLevel = cadmiumLevel;
	}

	@ApiModelProperty(value = "Prostatitis", notes = "Prostatitis", dataType = "Boolean")
	public Boolean getProstatitis() {
		return prostatitis;
	}

	public void setProstatitis(Boolean prostatitis) {
		this.prostatitis = prostatitis;
	}

	@ApiModelProperty(value = "Physician Id", notes = "Physician Id", dataType = "Integer")
	public Integer getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(Integer physicianId) {
		this.physicianId = physicianId;
	}

	@ApiModelProperty(value = "Case Status", notes = "CaseS tatus", dataType = "String")
	public String getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	/**
	 * @return the authToken
	 */
	@ApiModelProperty(value = "Auth Token", notes = "Auth Token", dataType = "String")
	public String getAuthToken() {
		return authToken;
	}

	/**
	 * @param authToken
	 *            the authToken to set
	 */
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

}

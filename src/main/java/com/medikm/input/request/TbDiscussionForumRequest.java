
package com.medikm.input.request;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.medikm.input.util.CustomJsonDateDeserializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author Dhiraj Singh
 */
@ApiModel(value = "Tumor Board Discussion Response", description = "Tumor Board Discussion Response", subTypes = {
		Serializable.class })
public class TbDiscussionForumRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer tbDiscussionId;
	private Date discussiondt;
	private Date discussionEndDate;
	private String primaryQuestionAskedtoTB;
	private String pubResearchUsed;
	private Short nCCNGuidelineMet;
	private String nCCNGuidelineMetComment;
	private Short patientInputConsidered;
	private String patientInputConsideredComment;
	private String patientPreferences;
	private Short consensusReached;
	private String consensusReachedComment;
	private String finalTBrecommendation;
	private Short rescheduledFUTBDiscussion;
	private String rescheduledFUTBDiscussionComm;
	private String optionsGenerated;
	private Short convergingopinions;
	private String convergingopinionsComment;
	private Short divergingOpinios;
	private String divergingOpiniosComment;
	private String additionalEvidence;
	private String literatureConsulted;
	private Short isAlgorithmUsed;
	private String isAlgorithmUsedComment;
	private Integer caseId;
	private Integer episodeId;
	// private Integer questionId;
	private String optionsConsidered;
	private Short comparativeEffectivenessAnalysis;
	// private Collection<TbDiscussionForumAnswere>
	// tbDiscussionForumAnswereCollection;
	// private Collection<TbDiscussionParticipants>
	// tbDiscussionParticipantsCollection;
	// private Collection<TbDiscussionForumQuestion>
	// tbDiscussionForumQuestionCollection;
	private Short clinicalTrailsEligible;
	private Short clinicalTrailsDiscussed;
	private String clinicalTrailsComment;
	private String status;
	// private List<TbDiscussionQuestionRequest> questionList;
	private String authToken;

	@ApiModelProperty(value = "Status", notes = "Status", dataType = "String")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TbDiscussionForumRequest() {
	}

	@ApiModelProperty(value = "Discussion End Date", notes = "Discussion En dDate", dataType = "Date")
	public Date getDiscussionEndDate() {
		return discussionEndDate;
	}

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setDiscussionEndDate(Date discussionEndDate) {
		this.discussionEndDate = discussionEndDate;
	}

	public TbDiscussionForumRequest(Integer tbDiscussionId) {
		this.tbDiscussionId = tbDiscussionId;
	}

	@ApiModelProperty(value = "nCCN Guideline Met", notes = "nCCN Guideline Met")
	public Short getnCCNGuidelineMet() {
		return nCCNGuidelineMet;
	}

	public void setnCCNGuidelineMet(Short nCCNGuidelineMet) {
		this.nCCNGuidelineMet = nCCNGuidelineMet;
	}

	@ApiModelProperty(value = "nCCN Guideline Met Comment", notes = "nCCN Guideline Met Comment", dataType = "String")
	public String getnCCNGuidelineMetComment() {
		return nCCNGuidelineMetComment;
	}

	public void setnCCNGuidelineMetComment(String nCCNGuidelineMetComment) {
		this.nCCNGuidelineMetComment = nCCNGuidelineMetComment;
	}

	@ApiModelProperty(value = "Clinical Trails Eligible", notes = "Clinical Trails Eligible")
	public Short getClinicalTrailsEligible() {
		return clinicalTrailsEligible;
	}

	public void setClinicalTrailsEligible(Short clinicalTrailsEligible) {
		this.clinicalTrailsEligible = clinicalTrailsEligible;
	}

	@ApiModelProperty(value = "Clinical Trails Discussed", notes = "Clinical Trails Discussed")
	public Short getClinicalTrailsDiscussed() {
		return clinicalTrailsDiscussed;
	}

	public void setClinicalTrailsDiscussed(Short clinicalTrailsDiscussed) {
		this.clinicalTrailsDiscussed = clinicalTrailsDiscussed;
	}

	@ApiModelProperty(value = "Clinical Trails Comment", notes = "Clinical Trails Comment", dataType = "String")
	public String getClinicalTrailsComment() {
		return clinicalTrailsComment;
	}

	public void setClinicalTrailsComment(String clinicalTrailsComment) {
		this.clinicalTrailsComment = clinicalTrailsComment;
	}

	@ApiModelProperty(value = "Tb Discussion Id", notes = "Tb Discussion Id", dataType = "Integer")
	public Integer getTbDiscussionId() {
		return tbDiscussionId;
	}

	public void setTbDiscussionId(Integer tbDiscussionId) {
		this.tbDiscussionId = tbDiscussionId;
	}

	@ApiModelProperty(value = "Discussion Date", notes = "Discussion Date", dataType = "Date")
	public Date getDiscussiondt() {
		return discussiondt;
	}

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setDiscussiondt(Date discussiondt) {
		this.discussiondt = discussiondt;
	}

	@ApiModelProperty(value = "Primary Question Asked to TB", notes = "Primary Question Asked to TB", dataType = "String")
	public String getPrimaryQuestionAskedtoTB() {
		return primaryQuestionAskedtoTB;
	}

	public void setPrimaryQuestionAskedtoTB(String primaryQuestionAskedtoTB) {
		this.primaryQuestionAskedtoTB = primaryQuestionAskedtoTB;
	}

	@ApiModelProperty(value = "Pub Research Used", notes = "Pub Research Used", dataType = "String")
	public String getPubResearchUsed() {
		return pubResearchUsed;
	}

	public void setPubResearchUsed(String pubResearchUsed) {
		this.pubResearchUsed = pubResearchUsed;
	}

	@ApiModelProperty(value = "NCCN Guideline Met", notes = "NCCN Guideline Met")
	public Short getNCCNGuidelineMet() {
		return nCCNGuidelineMet;
	}

	public void setNCCNGuidelineMet(Short nCCNGuidelineMet) {
		this.nCCNGuidelineMet = nCCNGuidelineMet;
	}

	@ApiModelProperty(value = "NCCN Guideline Met Comment", notes = "NCCN Guideline Met Comment", dataType = "String")
	public String getNCCNGuidelineMetComment() {
		return nCCNGuidelineMetComment;
	}

	public void setNCCNGuidelineMetComment(String nCCNGuidelineMetComment) {
		this.nCCNGuidelineMetComment = nCCNGuidelineMetComment;
	}

	@ApiModelProperty(value = "Patient Input Considered", notes = "Patient Input Considered")
	public Short getPatientInputConsidered() {
		return patientInputConsidered;
	}

	public void setPatientInputConsidered(Short patientInputConsidered) {
		this.patientInputConsidered = patientInputConsidered;
	}

	@ApiModelProperty(value = "Patient Input Considered Comment", notes = "Patient Input Considered Comment", dataType = "String")
	public String getPatientInputConsideredComment() {
		return patientInputConsideredComment;
	}

	public void setPatientInputConsideredComment(String patientInputConsideredComment) {
		this.patientInputConsideredComment = patientInputConsideredComment;
	}

	@ApiModelProperty(value = "Patient Preferences", notes = "Patient Preferences", dataType = "String")
	public String getPatientPreferences() {
		return patientPreferences;
	}

	public void setPatientPreferences(String patientPreferences) {
		this.patientPreferences = patientPreferences;
	}

	@ApiModelProperty(value = "Consensus Reached", notes = "Consensus Reached")
	public Short getConsensusReached() {
		return consensusReached;
	}

	public void setConsensusReached(Short consensusReached) {
		this.consensusReached = consensusReached;
	}

	@ApiModelProperty(value = "Consensus Reached Comment", notes = "Consensus Reached Comment", dataType = "String")
	public String getConsensusReachedComment() {
		return consensusReachedComment;
	}

	public void setConsensusReachedComment(String consensusReachedComment) {
		this.consensusReachedComment = consensusReachedComment;
	}

	@ApiModelProperty(value = "Final TB recommendation", notes = "Final TB recommendation", dataType = "String")
	public String getFinalTBrecommendation() {
		return finalTBrecommendation;
	}

	public void setFinalTBrecommendation(String finalTBrecommendation) {
		this.finalTBrecommendation = finalTBrecommendation;
	}

	@ApiModelProperty(value = "Rescheduled FUTB Discussion", notes = "Rescheduled FUTB Discussion")
	public Short getRescheduledFUTBDiscussion() {
		return rescheduledFUTBDiscussion;
	}

	public void setRescheduledFUTBDiscussion(Short rescheduledFUTBDiscussion) {
		this.rescheduledFUTBDiscussion = rescheduledFUTBDiscussion;
	}

	@ApiModelProperty(value = "Rescheduled FUTB Discussion Comm", notes = "Rescheduled FUTB Discussion Comm", dataType = "String")
	public String getRescheduledFUTBDiscussionComm() {
		return rescheduledFUTBDiscussionComm;
	}

	public void setRescheduledFUTBDiscussionComm(String rescheduledFUTBDiscussionComm) {
		this.rescheduledFUTBDiscussionComm = rescheduledFUTBDiscussionComm;
	}

	@ApiModelProperty(value = "Options Generated", notes = "Options Generated", dataType = "String")
	public String getOptionsGenerated() {
		return optionsGenerated;
	}

	public void setOptionsGenerated(String optionsGenerated) {
		this.optionsGenerated = optionsGenerated;
	}

	@ApiModelProperty(value = "Converging Opinions", notes = "Converging Opinions")
	public Short getConvergingopinions() {
		return convergingopinions;
	}

	public void setConvergingopinions(Short convergingopinions) {
		this.convergingopinions = convergingopinions;
	}

	@ApiModelProperty(value = "Converging Opinions Comment", notes = "Converging Opinions Comment", dataType = "String")
	public String getConvergingopinionsComment() {
		return convergingopinionsComment;
	}

	public void setConvergingopinionsComment(String convergingopinionsComment) {
		this.convergingopinionsComment = convergingopinionsComment;
	}

	@ApiModelProperty(value = "Diverging Opinios", notes = "Diverging Opinios")
	public Short getDivergingOpinios() {
		return divergingOpinios;
	}

	public void setDivergingOpinios(Short divergingOpinios) {
		this.divergingOpinios = divergingOpinios;
	}

	@ApiModelProperty(value = "Diverging Opinios Comment", notes = "Diverging Opinios Comment", dataType = "String")
	public String getDivergingOpiniosComment() {
		return divergingOpiniosComment;
	}

	public void setDivergingOpiniosComment(String divergingOpiniosComment) {
		this.divergingOpiniosComment = divergingOpiniosComment;
	}

	@ApiModelProperty(value = "Additional Evidence", notes = "Additional Evidence", dataType = "String")
	public String getAdditionalEvidence() {
		return additionalEvidence;
	}

	public void setAdditionalEvidence(String additionalEvidence) {
		this.additionalEvidence = additionalEvidence;
	}

	@ApiModelProperty(value = "Literature Consulted", notes = "Literature Consulted", dataType = "String")
	public String getLiteratureConsulted() {
		return literatureConsulted;
	}

	public void setLiteratureConsulted(String literatureConsulted) {
		this.literatureConsulted = literatureConsulted;
	}

	@ApiModelProperty(value = "Is Algorithm Used", notes = "Is Algorithm Used")
	public Short getIsAlgorithmUsed() {
		return isAlgorithmUsed;
	}

	public void setIsAlgorithmUsed(Short isAlgorithmUsed) {
		this.isAlgorithmUsed = isAlgorithmUsed;
	}

	@ApiModelProperty(value = "Is Algorithm Used Comment", notes = "Is Algorithm Used Comment", dataType = "String")
	public String getIsAlgorithmUsedComment() {
		return isAlgorithmUsedComment;
	}

	public void setIsAlgorithmUsedComment(String isAlgorithmUsedComment) {
		this.isAlgorithmUsedComment = isAlgorithmUsedComment;
	}

	/*
	 * public Integer getQuestionId() { return questionId; }
	 * 
	 * public void setQuestionId(Integer questionId) { this.questionId =
	 * questionId; }
	 */

	@ApiModelProperty(value = "Case Id", notes = "Case Id", dataType = "Integer")
	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	@ApiModelProperty(value = "Episode Id", notes = "Episode Id", dataType = "String")
	public Integer getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}

	/*
	 * @XmlTransient public Collection<TbDiscussionForumAnswere>
	 * getTbDiscussionForumAnswereCollection() { return
	 * tbDiscussionForumAnswereCollection; }
	 * 
	 * public void setTbDiscussionForumAnswereCollection(Collection<
	 * TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection) {
	 * this.tbDiscussionForumAnswereCollection =
	 * tbDiscussionForumAnswereCollection; }
	 * 
	 * @XmlTransient public Collection<TbDiscussionParticipants>
	 * getTbDiscussionParticipantsCollection() { return
	 * tbDiscussionParticipantsCollection; }
	 * 
	 * public void setTbDiscussionParticipantsCollection(Collection<
	 * TbDiscussionParticipants> tbDiscussionParticipantsCollection) {
	 * this.tbDiscussionParticipantsCollection =
	 * tbDiscussionParticipantsCollection; }
	 * 
	 * @XmlTransient public Collection<TbDiscussionForumQuestion>
	 * getTbDiscussionForumQuestionCollection() { return
	 * tbDiscussionForumQuestionCollection; }
	 * 
	 * public void setTbDiscussionForumQuestionCollection(Collection<
	 * TbDiscussionForumQuestion> tbDiscussionForumQuestionCollection) {
	 * this.tbDiscussionForumQuestionCollection =
	 * tbDiscussionForumQuestionCollection; }
	 */

	/**
	 * @return the questionList
	 */
	/*
	 * public List<TbDiscussionQuestionRequest> getQuestionList() { return
	 * questionList; }
	 * 
	 *//**
		 * @param questionList
		 *            the questionList to set
		 *//*
		 * public void setQuestionList(List<TbDiscussionQuestionRequest>
		 * questionList) { this.questionList = questionList; }
		 */

	/**
	 * @return the optionsConsidered
	 */
	@ApiModelProperty(value = "Options Considered", notes = "Options Considered", dataType = "String")
	public String getOptionsConsidered() {
		return optionsConsidered;
	}

	/**
	 * @param optionsConsidered
	 *            the optionsConsidered to set
	 */
	public void setOptionsConsidered(String optionsConsidered) {
		this.optionsConsidered = optionsConsidered;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tbDiscussionId != null ? tbDiscussionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TbDiscussionForumRequest)) {
			return false;
		}
		TbDiscussionForumRequest other = (TbDiscussionForumRequest) object;
		if ((this.tbDiscussionId == null && other.tbDiscussionId != null)
				|| (this.tbDiscussionId != null && !this.tbDiscussionId.equals(other.tbDiscussionId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TbDiscussionForum[ tbDiscussionId=" + tbDiscussionId + " ]";
	}

	/**
	 * @return the comparativeEffectivenessAnalysis
	 */
	@ApiModelProperty(value = "Comparative Effectiveness Analysis", notes = "Comparative Effectiveness Analysis")
	public Short getComparativeEffectivenessAnalysis() {
		return comparativeEffectivenessAnalysis;
	}

	/**
	 * @param comparativeEffectivenessAnalysis
	 *            the comparativeEffectivenessAnalysis to set
	 */
	public void setComparativeEffectivenessAnalysis(Short comparativeEffectivenessAnalysis) {
		this.comparativeEffectivenessAnalysis = comparativeEffectivenessAnalysis;
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


package com.medikm.input.response;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.xml.bind.annotation.XmlTransient;

import com.medikm.input.entity.Case1;
import com.medikm.input.entity.CcbrQuestion;
import com.medikm.input.entity.Episode;
import com.medikm.input.entity.TbDiscussionForumAnswere;
import com.medikm.input.entity.TbDiscussionForumQuestion;
import com.medikm.input.entity.TbDiscussionParticipants;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author Dhiraj Singh
 */
@ApiModel(value = "Tumor Board Discussion Response", description = "Tumor Board Discussion Response", subTypes = {
		MedikmResponse.class })
public class TumorBoardDiscussionResponse extends MedikmResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer tBDiscussionId;
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
	private Case1 caseId;
	private Episode episodeId;
	private CcbrQuestion questionId;
	private Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection;
	private Collection<TbDiscussionParticipants> tbDiscussionParticipantsCollection;
	private Collection<TbDiscussionForumQuestion> tbDiscussionForumQuestionCollection;

	public TumorBoardDiscussionResponse() {
	}

	@ApiModelProperty(value = "Discussion End Date", notes = "Discussion End Date", dataType = "Date")
	public Date getDiscussionEndDate() {
		return discussionEndDate;
	}

	public void setDiscussionEndDate(Date discussionEndDate) {
		this.discussionEndDate = discussionEndDate;
	}

	public TumorBoardDiscussionResponse(Integer tBDiscussionId) {
		this.tBDiscussionId = tBDiscussionId;
	}

	@ApiModelProperty(value = "Tumor Board Discussion Id", notes = "Tumor Board Discussion Id", dataType = "Integer")
	public Integer getTBDiscussionId() {
		return tBDiscussionId;
	}

	public void setTBDiscussionId(Integer tBDiscussionId) {
		this.tBDiscussionId = tBDiscussionId;
	}

	@ApiModelProperty(value = "Discussion Date", notes = "Discussion Date", dataType = "Date")
	public Date getDiscussiondt() {
		return discussiondt;
	}

	public void setDiscussiondt(Date discussiondt) {
		this.discussiondt = discussiondt;
	}

	@ApiModelProperty(value = "Primary Question Asked to Tumor Board", notes = "Primary Question Asked to Tumor Board", dataType = "String")
	public String getPrimaryQuestionAskedtoTB() {
		return primaryQuestionAskedtoTB;
	}

	public void setPrimaryQuestionAskedtoTB(String primaryQuestionAskedtoTB) {
		this.primaryQuestionAskedtoTB = primaryQuestionAskedtoTB;
	}

	@ApiModelProperty(value = "PubResearch Used", notes = "PubResearch Used", dataType = "String")
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

	@ApiModelProperty(value = "Rescheduled FUTB Discussion", notes = "Rescheduled FUTB Discussion", dataType = "String")
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

	@ApiModelProperty(value = "Convergingopinions", notes = "Convergingopinions")
	public Short getConvergingopinions() {
		return convergingopinions;
	}

	public void setConvergingopinions(Short convergingopinions) {
		this.convergingopinions = convergingopinions;
	}

	@ApiModelProperty(value = "Convergingopinions Comment", notes = "Convergingopinions Comment", dataType = "String")
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

	@ApiModelProperty(value = "Is Algorithm Used", notes = "Is Algorithm Used", dataType = "String")
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

	@ApiModelProperty(value = "Question Id", notes = "Question Id")
	public CcbrQuestion getQuestionId() {
		return questionId;
	}

	public void setQuestionId(CcbrQuestion questionId) {
		this.questionId = questionId;
	}

	@ApiModelProperty(value = "Case Id", notes = "Case Id")
	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	@ApiModelProperty(value = "Episode Id", notes = "Episode Id")
	public Episode getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(Episode episodeId) {
		this.episodeId = episodeId;
	}

	@XmlTransient
	public Collection<TbDiscussionForumAnswere> getTbDiscussionForumAnswereCollection() {
		return tbDiscussionForumAnswereCollection;
	}

	public void setTbDiscussionForumAnswereCollection(
			Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection) {
		this.tbDiscussionForumAnswereCollection = tbDiscussionForumAnswereCollection;
	}

	@XmlTransient
	public Collection<TbDiscussionParticipants> getTbDiscussionParticipantsCollection() {
		return tbDiscussionParticipantsCollection;
	}

	public void setTbDiscussionParticipantsCollection(
			Collection<TbDiscussionParticipants> tbDiscussionParticipantsCollection) {
		this.tbDiscussionParticipantsCollection = tbDiscussionParticipantsCollection;
	}

	@XmlTransient
	public Collection<TbDiscussionForumQuestion> getTbDiscussionForumQuestionCollection() {
		return tbDiscussionForumQuestionCollection;
	}

	public void setTbDiscussionForumQuestionCollection(
			Collection<TbDiscussionForumQuestion> tbDiscussionForumQuestionCollection) {
		this.tbDiscussionForumQuestionCollection = tbDiscussionForumQuestionCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tBDiscussionId != null ? tBDiscussionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TumorBoardDiscussionResponse)) {
			return false;
		}
		TumorBoardDiscussionResponse other = (TumorBoardDiscussionResponse) object;
		if ((this.tBDiscussionId == null && other.tBDiscussionId != null)
				|| (this.tBDiscussionId != null && !this.tBDiscussionId.equals(other.tBDiscussionId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TumorBoardDiscussion[ tBDiscussionId=" + tBDiscussionId + " ]";
	}

}

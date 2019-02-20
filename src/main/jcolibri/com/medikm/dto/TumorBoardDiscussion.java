package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TumorBoardDiscussion entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class TumorBoardDiscussion implements java.io.Serializable {

	// Fields

	private Integer tbDiscussionId;
	private CcbrQuestion ccbrQuestion;
	private Case1 case1;
	private Episode episode;
	private Timestamp discussionDt;
	private String primaryQuestionAskedToTb;
	private String pubResearchUsed;
	private Short nccnGuidelineMet;
	private String nccnGuidelineMetComment;
	private Short patientInputConsidered;
	private String patientInputConsideredComment;
	private String patientPreferences;
	private Short consensusReached;
	private String consensusReachedComment;
	private String finalTbRecommendation;
	private Short rescheduledFuTbDiscussion;
	private String rescheduledFuTbDiscussionComm;
	private String optionsGenerated;
	private Short convergingOpinions;
	private String convergingOpinionsComment;
	private Short divergingOpinios;
	private String divergingOpiniosComment;
	private String additionalEvidence;
	private String literatureConsulted;
	private Short isAlgorithmUsed;
	private String isAlgorithmUsedComment;
	private Short clinicalTrailsEligible;
	private Short clinicalTrailsDiscussed;
	private String clinicalTrailsComment;
	private String comparativeEffectivenessAnalysis;
	private String optionsConsidered;
	private Timestamp discussionEndTime;
	private String status;
	private Set tumorBoardDiscussionQuestions = new HashSet(0);
	private Set tbDiscussionParticipantses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TumorBoardDiscussion() {
	}

	/** minimal constructor */
	public TumorBoardDiscussion(Case1 case1, Episode episode) {
		this.case1 = case1;
		this.episode = episode;
	}

	/** full constructor */
	public TumorBoardDiscussion(CcbrQuestion ccbrQuestion, Case1 case1, Episode episode, Timestamp discussionDt,
			String primaryQuestionAskedToTb, String pubResearchUsed, Short nccnGuidelineMet,
			String nccnGuidelineMetComment, Short patientInputConsidered, String patientInputConsideredComment,
			String patientPreferences, Short consensusReached, String consensusReachedComment,
			String finalTbRecommendation, Short rescheduledFuTbDiscussion, String rescheduledFuTbDiscussionComm,
			String optionsGenerated, Short convergingOpinions, String convergingOpinionsComment, Short divergingOpinios,
			String divergingOpiniosComment, String additionalEvidence, String literatureConsulted,
			Short isAlgorithmUsed, String isAlgorithmUsedComment, Short clinicalTrailsEligible,
			Short clinicalTrailsDiscussed, String clinicalTrailsComment, String comparativeEffectivenessAnalysis,
			String optionsConsidered, Timestamp discussionEndTime, String status, Set tumorBoardDiscussionQuestions,
			Set tbDiscussionParticipantses) {
		this.ccbrQuestion = ccbrQuestion;
		this.case1 = case1;
		this.episode = episode;
		this.discussionDt = discussionDt;
		this.primaryQuestionAskedToTb = primaryQuestionAskedToTb;
		this.pubResearchUsed = pubResearchUsed;
		this.nccnGuidelineMet = nccnGuidelineMet;
		this.nccnGuidelineMetComment = nccnGuidelineMetComment;
		this.patientInputConsidered = patientInputConsidered;
		this.patientInputConsideredComment = patientInputConsideredComment;
		this.patientPreferences = patientPreferences;
		this.consensusReached = consensusReached;
		this.consensusReachedComment = consensusReachedComment;
		this.finalTbRecommendation = finalTbRecommendation;
		this.rescheduledFuTbDiscussion = rescheduledFuTbDiscussion;
		this.rescheduledFuTbDiscussionComm = rescheduledFuTbDiscussionComm;
		this.optionsGenerated = optionsGenerated;
		this.convergingOpinions = convergingOpinions;
		this.convergingOpinionsComment = convergingOpinionsComment;
		this.divergingOpinios = divergingOpinios;
		this.divergingOpiniosComment = divergingOpiniosComment;
		this.additionalEvidence = additionalEvidence;
		this.literatureConsulted = literatureConsulted;
		this.isAlgorithmUsed = isAlgorithmUsed;
		this.isAlgorithmUsedComment = isAlgorithmUsedComment;
		this.clinicalTrailsEligible = clinicalTrailsEligible;
		this.clinicalTrailsDiscussed = clinicalTrailsDiscussed;
		this.clinicalTrailsComment = clinicalTrailsComment;
		this.comparativeEffectivenessAnalysis = comparativeEffectivenessAnalysis;
		this.optionsConsidered = optionsConsidered;
		this.discussionEndTime = discussionEndTime;
		this.status = status;
		this.tumorBoardDiscussionQuestions = tumorBoardDiscussionQuestions;
		this.tbDiscussionParticipantses = tbDiscussionParticipantses;
	}

	// Property accessors

	public Integer getTbDiscussionId() {
		return this.tbDiscussionId;
	}

	public void setTbDiscussionId(Integer tbDiscussionId) {
		this.tbDiscussionId = tbDiscussionId;
	}

	public CcbrQuestion getCcbrQuestion() {
		return this.ccbrQuestion;
	}

	public void setCcbrQuestion(CcbrQuestion ccbrQuestion) {
		this.ccbrQuestion = ccbrQuestion;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public Episode getEpisode() {
		return this.episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public Timestamp getDiscussionDt() {
		return this.discussionDt;
	}

	public void setDiscussionDt(Timestamp discussionDt) {
		this.discussionDt = discussionDt;
	}

	public String getPrimaryQuestionAskedToTb() {
		return this.primaryQuestionAskedToTb;
	}

	public void setPrimaryQuestionAskedToTb(String primaryQuestionAskedToTb) {
		this.primaryQuestionAskedToTb = primaryQuestionAskedToTb;
	}

	public String getPubResearchUsed() {
		return this.pubResearchUsed;
	}

	public void setPubResearchUsed(String pubResearchUsed) {
		this.pubResearchUsed = pubResearchUsed;
	}

	public Short getNccnGuidelineMet() {
		return this.nccnGuidelineMet;
	}

	public void setNccnGuidelineMet(Short nccnGuidelineMet) {
		this.nccnGuidelineMet = nccnGuidelineMet;
	}

	public String getNccnGuidelineMetComment() {
		return this.nccnGuidelineMetComment;
	}

	public void setNccnGuidelineMetComment(String nccnGuidelineMetComment) {
		this.nccnGuidelineMetComment = nccnGuidelineMetComment;
	}

	public Short getPatientInputConsidered() {
		return this.patientInputConsidered;
	}

	public void setPatientInputConsidered(Short patientInputConsidered) {
		this.patientInputConsidered = patientInputConsidered;
	}

	public String getPatientInputConsideredComment() {
		return this.patientInputConsideredComment;
	}

	public void setPatientInputConsideredComment(String patientInputConsideredComment) {
		this.patientInputConsideredComment = patientInputConsideredComment;
	}

	public String getPatientPreferences() {
		return this.patientPreferences;
	}

	public void setPatientPreferences(String patientPreferences) {
		this.patientPreferences = patientPreferences;
	}

	public Short getConsensusReached() {
		return this.consensusReached;
	}

	public void setConsensusReached(Short consensusReached) {
		this.consensusReached = consensusReached;
	}

	public String getConsensusReachedComment() {
		return this.consensusReachedComment;
	}

	public void setConsensusReachedComment(String consensusReachedComment) {
		this.consensusReachedComment = consensusReachedComment;
	}

	public String getFinalTbRecommendation() {
		return this.finalTbRecommendation;
	}

	public void setFinalTbRecommendation(String finalTbRecommendation) {
		this.finalTbRecommendation = finalTbRecommendation;
	}

	public Short getRescheduledFuTbDiscussion() {
		return this.rescheduledFuTbDiscussion;
	}

	public void setRescheduledFuTbDiscussion(Short rescheduledFuTbDiscussion) {
		this.rescheduledFuTbDiscussion = rescheduledFuTbDiscussion;
	}

	public String getRescheduledFuTbDiscussionComm() {
		return this.rescheduledFuTbDiscussionComm;
	}

	public void setRescheduledFuTbDiscussionComm(String rescheduledFuTbDiscussionComm) {
		this.rescheduledFuTbDiscussionComm = rescheduledFuTbDiscussionComm;
	}

	public String getOptionsGenerated() {
		return this.optionsGenerated;
	}

	public void setOptionsGenerated(String optionsGenerated) {
		this.optionsGenerated = optionsGenerated;
	}

	public Short getConvergingOpinions() {
		return this.convergingOpinions;
	}

	public void setConvergingOpinions(Short convergingOpinions) {
		this.convergingOpinions = convergingOpinions;
	}

	public String getConvergingOpinionsComment() {
		return this.convergingOpinionsComment;
	}

	public void setConvergingOpinionsComment(String convergingOpinionsComment) {
		this.convergingOpinionsComment = convergingOpinionsComment;
	}

	public Short getDivergingOpinios() {
		return this.divergingOpinios;
	}

	public void setDivergingOpinios(Short divergingOpinios) {
		this.divergingOpinios = divergingOpinios;
	}

	public String getDivergingOpiniosComment() {
		return this.divergingOpiniosComment;
	}

	public void setDivergingOpiniosComment(String divergingOpiniosComment) {
		this.divergingOpiniosComment = divergingOpiniosComment;
	}

	public String getAdditionalEvidence() {
		return this.additionalEvidence;
	}

	public void setAdditionalEvidence(String additionalEvidence) {
		this.additionalEvidence = additionalEvidence;
	}

	public String getLiteratureConsulted() {
		return this.literatureConsulted;
	}

	public void setLiteratureConsulted(String literatureConsulted) {
		this.literatureConsulted = literatureConsulted;
	}

	public Short getIsAlgorithmUsed() {
		return this.isAlgorithmUsed;
	}

	public void setIsAlgorithmUsed(Short isAlgorithmUsed) {
		this.isAlgorithmUsed = isAlgorithmUsed;
	}

	public String getIsAlgorithmUsedComment() {
		return this.isAlgorithmUsedComment;
	}

	public void setIsAlgorithmUsedComment(String isAlgorithmUsedComment) {
		this.isAlgorithmUsedComment = isAlgorithmUsedComment;
	}

	public Short getClinicalTrailsEligible() {
		return this.clinicalTrailsEligible;
	}

	public void setClinicalTrailsEligible(Short clinicalTrailsEligible) {
		this.clinicalTrailsEligible = clinicalTrailsEligible;
	}

	public Short getClinicalTrailsDiscussed() {
		return this.clinicalTrailsDiscussed;
	}

	public void setClinicalTrailsDiscussed(Short clinicalTrailsDiscussed) {
		this.clinicalTrailsDiscussed = clinicalTrailsDiscussed;
	}

	public String getClinicalTrailsComment() {
		return this.clinicalTrailsComment;
	}

	public void setClinicalTrailsComment(String clinicalTrailsComment) {
		this.clinicalTrailsComment = clinicalTrailsComment;
	}

	public String getComparativeEffectivenessAnalysis() {
		return this.comparativeEffectivenessAnalysis;
	}

	public void setComparativeEffectivenessAnalysis(String comparativeEffectivenessAnalysis) {
		this.comparativeEffectivenessAnalysis = comparativeEffectivenessAnalysis;
	}

	public String getOptionsConsidered() {
		return this.optionsConsidered;
	}

	public void setOptionsConsidered(String optionsConsidered) {
		this.optionsConsidered = optionsConsidered;
	}

	public Timestamp getDiscussionEndTime() {
		return this.discussionEndTime;
	}

	public void setDiscussionEndTime(Timestamp discussionEndTime) {
		this.discussionEndTime = discussionEndTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getTumorBoardDiscussionQuestions() {
		return this.tumorBoardDiscussionQuestions;
	}

	public void setTumorBoardDiscussionQuestions(Set tumorBoardDiscussionQuestions) {
		this.tumorBoardDiscussionQuestions = tumorBoardDiscussionQuestions;
	}

	public Set getTbDiscussionParticipantses() {
		return this.tbDiscussionParticipantses;
	}

	public void setTbDiscussionParticipantses(Set tbDiscussionParticipantses) {
		this.tbDiscussionParticipantses = tbDiscussionParticipantses;
	}

}
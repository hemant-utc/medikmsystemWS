/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vinod 1
 */
@Entity
@Table(name = "tb_discussion_forum")
@NamedQueries({ @NamedQuery(name = "TbDiscussionForum.findAll", query = "SELECT t FROM TbDiscussionForum t"),
		@NamedQuery(name = "TbDiscussionForum.findByTBDiscussionId", query = "SELECT t FROM TbDiscussionForum t WHERE t.tBDiscussionId = :tBDiscussionId"),
		@NamedQuery(name = "TbDiscussionForum.findByDiscussiondt", query = "SELECT t FROM TbDiscussionForum t WHERE t.discussiondt = :discussiondt"),
		@NamedQuery(name = "TbDiscussionForum.findByNCCNGuidelineMet", query = "SELECT t FROM TbDiscussionForum t WHERE t.nCCNGuidelineMet = :nCCNGuidelineMet"),
		@NamedQuery(name = "TbDiscussionForum.findByNCCNGuidelineMetComment", query = "SELECT t FROM TbDiscussionForum t WHERE t.nCCNGuidelineMetComment = :nCCNGuidelineMetComment"),
		@NamedQuery(name = "TbDiscussionForum.findByPatientInputConsidered", query = "SELECT t FROM TbDiscussionForum t WHERE t.patientInputConsidered = :patientInputConsidered"),
		@NamedQuery(name = "TbDiscussionForum.findByPatientInputConsideredComment", query = "SELECT t FROM TbDiscussionForum t WHERE t.patientInputConsideredComment = :patientInputConsideredComment"),
		@NamedQuery(name = "TbDiscussionForum.findByPatientPreferences", query = "SELECT t FROM TbDiscussionForum t WHERE t.patientPreferences = :patientPreferences"),
		@NamedQuery(name = "TbDiscussionForum.findByConsensusReached", query = "SELECT t FROM TbDiscussionForum t WHERE t.consensusReached = :consensusReached"),
		@NamedQuery(name = "TbDiscussionForum.findByConsensusReachedComment", query = "SELECT t FROM TbDiscussionForum t WHERE t.consensusReachedComment = :consensusReachedComment"),
		@NamedQuery(name = "TbDiscussionForum.findByRescheduledFUTBDiscussion", query = "SELECT t FROM TbDiscussionForum t WHERE t.rescheduledFUTBDiscussion = :rescheduledFUTBDiscussion"),
		@NamedQuery(name = "TbDiscussionForum.findByConvergingopinions", query = "SELECT t FROM TbDiscussionForum t WHERE t.convergingopinions = :convergingopinions"),
		@NamedQuery(name = "TbDiscussionForum.findByConvergingopinionsComment", query = "SELECT t FROM TbDiscussionForum t WHERE t.convergingopinionsComment = :convergingopinionsComment"),
		@NamedQuery(name = "TbDiscussionForum.findByDivergingOpinios", query = "SELECT t FROM TbDiscussionForum t WHERE t.divergingOpinios = :divergingOpinios"),
		@NamedQuery(name = "TbDiscussionForum.findByDivergingOpiniosComment", query = "SELECT t FROM TbDiscussionForum t WHERE t.divergingOpiniosComment = :divergingOpiniosComment"),
		@NamedQuery(name = "TbDiscussionForum.findByAdditionalEvidence", query = "SELECT t FROM TbDiscussionForum t WHERE t.additionalEvidence = :additionalEvidence"),
		@NamedQuery(name = "TbDiscussionForum.findByLiteratureConsulted", query = "SELECT t FROM TbDiscussionForum t WHERE t.literatureConsulted = :literatureConsulted"),
		@NamedQuery(name = "TbDiscussionForum.findByIsAlgorithmUsed", query = "SELECT t FROM TbDiscussionForum t WHERE t.isAlgorithmUsed = :isAlgorithmUsed"),
		@NamedQuery(name = "TbDiscussionForum.findByIsAlgorithmUsedComment", query = "SELECT t FROM TbDiscussionForum t WHERE t.isAlgorithmUsedComment = :isAlgorithmUsedComment"),
		@NamedQuery(name = "TbDiscussionForum.findByClinicalTrailsEligible", query = "SELECT t FROM TbDiscussionForum t WHERE t.clinicalTrailsEligible = :clinicalTrailsEligible"),
		@NamedQuery(name = "TbDiscussionForum.findByClinicalTrailsDiscussed", query = "SELECT t FROM TbDiscussionForum t WHERE t.clinicalTrailsDiscussed = :clinicalTrailsDiscussed"),
		@NamedQuery(name = "TbDiscussionForum.findByClinicalTrailsComment", query = "SELECT t FROM TbDiscussionForum t WHERE t.clinicalTrailsComment = :clinicalTrailsComment"),
		@NamedQuery(name = "TbDiscussionForum.findByComparativeEffectivenessAnalysis", query = "SELECT t FROM TbDiscussionForum t WHERE t.comparativeEffectivenessAnalysis = :comparativeEffectivenessAnalysis"),
		@NamedQuery(name = "TbDiscussionForum.findByOptionsConsidered", query = "SELECT t FROM TbDiscussionForum t WHERE t.optionsConsidered = :optionsConsidered") })
public class TbDiscussionForum implements Serializable, Comparable<TbDiscussionForum> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "TB_Discussion_Id")
	private Integer tBDiscussionId;
	@Column(name = "Discussion_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date discussiondt;
	@Lob
	@Column(name = "Primary_Question_Asked_to_TB")
	private String primaryQuestionAskedtoTB;
	@Lob
	@Column(name = "Pub_Research_Used")
	private String pubResearchUsed;
	@Column(name = "NCCN_Guideline_Met")
	private Short nCCNGuidelineMet;
	@Column(name = "NCCN_Guideline_Met_Comment")
	private String nCCNGuidelineMetComment;
	@Column(name = "Patient_Input_Considered")
	private Short patientInputConsidered;
	@Column(name = "Patient_Input_Considered_Comment")
	private String patientInputConsideredComment;
	@Column(name = "Patient_Preferences")
	private String patientPreferences;
	@Column(name = "Consensus_Reached")
	private Short consensusReached;
	@Column(name = "Consensus_Reached_Comment")
	private String consensusReachedComment;
	@Lob
	@Column(name = "Final_TB_recommendation")
	private String finalTBrecommendation;
	@Column(name = "Rescheduled_FU_TB_Discussion")
	private Short rescheduledFUTBDiscussion;
	@Lob
	@Column(name = "Rescheduled_FU_TB_Discussion_Comm")
	private String rescheduledFUTBDiscussionComm;
	@Lob
	@Column(name = "Options_Generated")
	private String optionsGenerated;
	@Column(name = "Converging_opinions")
	private Short convergingopinions;
	@Column(name = "Converging_opinions_Comment")
	private String convergingopinionsComment;
	@Column(name = "Diverging_Opinios")
	private Short divergingOpinios;
	@Column(name = "Diverging_Opinios_Comment")
	private String divergingOpiniosComment;
	@Column(name = "Additional_Evidence")
	private String additionalEvidence;
	@Column(name = "Literature_Consulted")
	private String literatureConsulted;
	@Column(name = "Is_Algorithm_Used")
	private Short isAlgorithmUsed;
	@Column(name = "Is_Algorithm_Used_Comment")
	private String isAlgorithmUsedComment;
	@Column(name = "clinical_trails_eligible")
	private Short clinicalTrailsEligible;
	@Column(name = "clinical_trails_discussed")
	private Short clinicalTrailsDiscussed;
	@Column(name = "clinical_trails_comment")
	private String clinicalTrailsComment;
	@Column(name = "comparative_effectiveness_analysis")
	private Short comparativeEffectivenessAnalysis;
	@Column(name = "options_considered")
	private String optionsConsidered;
	@JoinColumn(name = "QuestionId", referencedColumnName = "Question_Id")
	@ManyToOne(cascade = CascadeType.ALL)
	private CcbrQuestion ccbrQuestion;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false)
	private Case1 case1;
	@JoinColumn(name = "Episode_Id", referencedColumnName = "Episode_Id")
	@ManyToOne(optional = false)
	private Episode episode;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tbDiscussionForum")
	private Collection<RecommendedPlanLike> recommendedPlanLikeCollection;
	@Column(name = "discussionEndTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date discussionEndTime;
	@Column(name = "status")
	private String status;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tBDiscussionId", fetch = FetchType.LAZY)
	private List<TbDiscussionForumQuestion> tbDiscussionForumQuestionList;

	public Date getDiscussionEndTime() {
		return discussionEndTime;
	}

	public void setDiscussionEndTime(Date discussionEndTime) {
		this.discussionEndTime = discussionEndTime;
	}

	public Collection<RecommendedPlanLike> getRecommendedPlanLikeCollection() {
		return recommendedPlanLikeCollection;
	}

	public void setRecommendedPlanLikeCollection(Collection<RecommendedPlanLike> recommendedPlanLikeCollection) {
		this.recommendedPlanLikeCollection = recommendedPlanLikeCollection;
	}

	public TbDiscussionForum() {
	}

	public TbDiscussionForum(Integer tBDiscussionId) {
		this.tBDiscussionId = tBDiscussionId;
	}

	public Integer getTBDiscussionId() {
		return tBDiscussionId;
	}

	public void setTBDiscussionId(Integer tBDiscussionId) {
		this.tBDiscussionId = tBDiscussionId;
	}

	public Date getDiscussiondt() {
		return discussiondt;
	}

	public void setDiscussiondt(Date discussiondt) {
		this.discussiondt = discussiondt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrimaryQuestionAskedtoTB() {
		return primaryQuestionAskedtoTB;
	}

	public void setPrimaryQuestionAskedtoTB(String primaryQuestionAskedtoTB) {
		this.primaryQuestionAskedtoTB = primaryQuestionAskedtoTB;
	}

	public String getPubResearchUsed() {
		return pubResearchUsed;
	}

	public void setPubResearchUsed(String pubResearchUsed) {
		this.pubResearchUsed = pubResearchUsed;
	}

	public Short getNCCNGuidelineMet() {
		return nCCNGuidelineMet;
	}

	public void setNCCNGuidelineMet(Short nCCNGuidelineMet) {
		this.nCCNGuidelineMet = nCCNGuidelineMet;
	}

	public String getNCCNGuidelineMetComment() {
		return nCCNGuidelineMetComment;
	}

	public void setNCCNGuidelineMetComment(String nCCNGuidelineMetComment) {
		this.nCCNGuidelineMetComment = nCCNGuidelineMetComment;
	}

	public Short getPatientInputConsidered() {
		return patientInputConsidered;
	}

	public void setPatientInputConsidered(Short patientInputConsidered) {
		this.patientInputConsidered = patientInputConsidered;
	}

	public String getPatientInputConsideredComment() {
		return patientInputConsideredComment;
	}

	public void setPatientInputConsideredComment(String patientInputConsideredComment) {
		this.patientInputConsideredComment = patientInputConsideredComment;
	}

	public String getPatientPreferences() {
		return patientPreferences;
	}

	public void setPatientPreferences(String patientPreferences) {
		this.patientPreferences = patientPreferences;
	}

	public Short getConsensusReached() {
		return consensusReached;
	}

	public void setConsensusReached(Short consensusReached) {
		this.consensusReached = consensusReached;
	}

	public String getConsensusReachedComment() {
		return consensusReachedComment;
	}

	public void setConsensusReachedComment(String consensusReachedComment) {
		this.consensusReachedComment = consensusReachedComment;
	}

	public String getFinalTBrecommendation() {
		return finalTBrecommendation;
	}

	public void setFinalTBrecommendation(String finalTBrecommendation) {
		this.finalTBrecommendation = finalTBrecommendation;
	}

	public Short getRescheduledFUTBDiscussion() {
		return rescheduledFUTBDiscussion;
	}

	public void setRescheduledFUTBDiscussion(Short rescheduledFUTBDiscussion) {
		this.rescheduledFUTBDiscussion = rescheduledFUTBDiscussion;
	}

	public String getRescheduledFUTBDiscussionComm() {
		return rescheduledFUTBDiscussionComm;
	}

	public void setRescheduledFUTBDiscussionComm(String rescheduledFUTBDiscussionComm) {
		this.rescheduledFUTBDiscussionComm = rescheduledFUTBDiscussionComm;
	}

	public String getOptionsGenerated() {
		return optionsGenerated;
	}

	public void setOptionsGenerated(String optionsGenerated) {
		this.optionsGenerated = optionsGenerated;
	}

	public Short getConvergingopinions() {
		return convergingopinions;
	}

	public void setConvergingopinions(Short convergingopinions) {
		this.convergingopinions = convergingopinions;
	}

	public String getConvergingopinionsComment() {
		return convergingopinionsComment;
	}

	public void setConvergingopinionsComment(String convergingopinionsComment) {
		this.convergingopinionsComment = convergingopinionsComment;
	}

	public Short getDivergingOpinios() {
		return divergingOpinios;
	}

	public void setDivergingOpinios(Short divergingOpinios) {
		this.divergingOpinios = divergingOpinios;
	}

	public String getDivergingOpiniosComment() {
		return divergingOpiniosComment;
	}

	public void setDivergingOpiniosComment(String divergingOpiniosComment) {
		this.divergingOpiniosComment = divergingOpiniosComment;
	}

	public String getAdditionalEvidence() {
		return additionalEvidence;
	}

	public void setAdditionalEvidence(String additionalEvidence) {
		this.additionalEvidence = additionalEvidence;
	}

	public String getLiteratureConsulted() {
		return literatureConsulted;
	}

	public void setLiteratureConsulted(String literatureConsulted) {
		this.literatureConsulted = literatureConsulted;
	}

	public Short getIsAlgorithmUsed() {
		return isAlgorithmUsed;
	}

	public void setIsAlgorithmUsed(Short isAlgorithmUsed) {
		this.isAlgorithmUsed = isAlgorithmUsed;
	}

	public String getIsAlgorithmUsedComment() {
		return isAlgorithmUsedComment;
	}

	public void setIsAlgorithmUsedComment(String isAlgorithmUsedComment) {
		this.isAlgorithmUsedComment = isAlgorithmUsedComment;
	}

	public Short getClinicalTrailsEligible() {
		return clinicalTrailsEligible;
	}

	public void setClinicalTrailsEligible(Short clinicalTrailsEligible) {
		this.clinicalTrailsEligible = clinicalTrailsEligible;
	}

	public Short getClinicalTrailsDiscussed() {
		return clinicalTrailsDiscussed;
	}

	public void setClinicalTrailsDiscussed(Short clinicalTrailsDiscussed) {
		this.clinicalTrailsDiscussed = clinicalTrailsDiscussed;
	}

	public String getClinicalTrailsComment() {
		return clinicalTrailsComment;
	}

	public void setClinicalTrailsComment(String clinicalTrailsComment) {
		this.clinicalTrailsComment = clinicalTrailsComment;
	}

	public Short getComparativeEffectivenessAnalysis() {
		return comparativeEffectivenessAnalysis;
	}

	public void setComparativeEffectivenessAnalysis(Short comparativeEffectivenessAnalysis) {
		this.comparativeEffectivenessAnalysis = comparativeEffectivenessAnalysis;
	}

	public String getOptionsConsidered() {
		return optionsConsidered;
	}

	public void setOptionsConsidered(String optionsConsidered) {
		this.optionsConsidered = optionsConsidered;
	}

	public CcbrQuestion getCcbrQuestion() {
		return ccbrQuestion;
	}

	public void setCcbrQuestion(CcbrQuestion ccbrQuestion) {
		this.ccbrQuestion = ccbrQuestion;
	}

	public Case1 getCase1() {
		return case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public List<TbDiscussionForumQuestion> getTbDiscussionForumQuestionList() {
		return tbDiscussionForumQuestionList;
	}

	public void setTbDiscussionForumQuestionList(List<TbDiscussionForumQuestion> tbDiscussionForumQuestionList) {
		this.tbDiscussionForumQuestionList = tbDiscussionForumQuestionList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tBDiscussionId != null ? tBDiscussionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TbDiscussionForum)) {
			return false;
		}
		TbDiscussionForum other = (TbDiscussionForum) object;
		if ((this.tBDiscussionId == null && other.tBDiscussionId != null)
				|| (this.tBDiscussionId != null && !this.tBDiscussionId.equals(other.tBDiscussionId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.TbDiscussionForum[tBDiscussionId=" + tBDiscussionId + "]";
	}

	@Override
	public int compareTo(TbDiscussionForum o) {
		return this.getDiscussiondt().compareTo(o.getDiscussiondt());
	}

}

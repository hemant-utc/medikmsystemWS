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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "tumor_board_discussion")
@XmlRootElement
public class TumorBoardDiscussion implements Serializable, Comparable<TumorBoardDiscussion> {
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
	@ManyToOne
	private CcbrQuestion questionId;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Case1 caseId;
	@JoinColumn(name = "Episode_Id", referencedColumnName = "Episode_Id")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Episode episodeId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tBDiscussionId", fetch = FetchType.LAZY)
	private Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tumorBoardDiscussion", fetch = FetchType.LAZY)
	private Collection<TbDiscussionParticipants> tbDiscussionParticipantsCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tBDiscussionId", fetch = FetchType.LAZY)
	private Collection<TbDiscussionForumQuestion> tbDiscussionForumQuestionCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tbDiscussionId", fetch = FetchType.LAZY)
	private List<TumorBoardDiscussionQuestion> tumorBoardDiscussionQuestionList;
	@Column(name = "discussionEndTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date discussionEndTime;
	@Column(name = "comment")
	private String comment;
	@Column(name = "pathway")
	private String pathway;
	@Column(name = "subPathway")
	private String subPathway;

	public Date getDiscussionEndTime() {
		return discussionEndTime;
	}

	public void setDiscussionEndTime(Date discussionEndTime) {
		this.discussionEndTime = discussionEndTime;
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

	public TumorBoardDiscussion() {
	}

	public TumorBoardDiscussion(Integer tBDiscussionId) {
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

	public Integer gettBDiscussionId() {
		return tBDiscussionId;
	}

	public void settBDiscussionId(Integer tBDiscussionId) {
		this.tBDiscussionId = tBDiscussionId;
	}

	public Short getnCCNGuidelineMet() {
		return nCCNGuidelineMet;
	}

	public void setnCCNGuidelineMet(Short nCCNGuidelineMet) {
		this.nCCNGuidelineMet = nCCNGuidelineMet;
	}

	public String getnCCNGuidelineMetComment() {
		return nCCNGuidelineMetComment;
	}

	public void setnCCNGuidelineMetComment(String nCCNGuidelineMetComment) {
		this.nCCNGuidelineMetComment = nCCNGuidelineMetComment;
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

	public CcbrQuestion getQuestionId() {
		return questionId;
	}

	public void setQuestionId(CcbrQuestion questionId) {
		this.questionId = questionId;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public Episode getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(Episode episodeId) {
		this.episodeId = episodeId;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the pathway
	 */
	public String getPathway() {
		return pathway;
	}

	/**
	 * @param pathway
	 *            the pathway to set
	 */
	public void setPathway(String pathway) {
		this.pathway = pathway;
	}

	/**
	 * @return the subPathway
	 */
	public String getSubPathway() {
		return subPathway;
	}

	/**
	 * @param subPathway
	 *            the subPathway to set
	 */
	public void setSubPathway(String subPathway) {
		this.subPathway = subPathway;
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

	/**
	 * @return the tumorBoardDiscussionQuestionList
	 */
	public List<TumorBoardDiscussionQuestion> getTumorBoardDiscussionQuestionList() {
		return tumorBoardDiscussionQuestionList;
	}

	/**
	 * @param tumorBoardDiscussionQuestionList
	 *            the tumorBoardDiscussionQuestionList to set
	 */
	public void setTumorBoardDiscussionQuestionList(
			List<TumorBoardDiscussionQuestion> tumorBoardDiscussionQuestionList) {
		this.tumorBoardDiscussionQuestionList = tumorBoardDiscussionQuestionList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tBDiscussionId != null ? tBDiscussionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TumorBoardDiscussion)) {
			return false;
		}
		TumorBoardDiscussion other = (TumorBoardDiscussion) object;
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

	@Override
	public int compareTo(TumorBoardDiscussion o) {
		return this.getDiscussiondt().compareTo(o.getDiscussiondt());
	}

}

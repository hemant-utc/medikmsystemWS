package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TumorBoardDiscussionQuestion entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class TumorBoardDiscussionQuestion implements java.io.Serializable {

	// Fields

	private Integer questionId;
	private TumorBoardDiscussion tumorBoardDiscussion;
	private Case1 case1;
	private Episode episode;
	private String questionText;
	private Timestamp dateAsked;
	private Set tumorBoardDiscussionAnswerses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TumorBoardDiscussionQuestion() {
	}

	/** minimal constructor */
	public TumorBoardDiscussionQuestion(TumorBoardDiscussion tumorBoardDiscussion, Case1 case1, Episode episode) {
		this.tumorBoardDiscussion = tumorBoardDiscussion;
		this.case1 = case1;
		this.episode = episode;
	}

	/** full constructor */
	public TumorBoardDiscussionQuestion(TumorBoardDiscussion tumorBoardDiscussion, Case1 case1, Episode episode,
			String questionText, Timestamp dateAsked, Set tumorBoardDiscussionAnswerses) {
		this.tumorBoardDiscussion = tumorBoardDiscussion;
		this.case1 = case1;
		this.episode = episode;
		this.questionText = questionText;
		this.dateAsked = dateAsked;
		this.tumorBoardDiscussionAnswerses = tumorBoardDiscussionAnswerses;
	}

	// Property accessors

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public TumorBoardDiscussion getTumorBoardDiscussion() {
		return this.tumorBoardDiscussion;
	}

	public void setTumorBoardDiscussion(TumorBoardDiscussion tumorBoardDiscussion) {
		this.tumorBoardDiscussion = tumorBoardDiscussion;
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

	public String getQuestionText() {
		return this.questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public Timestamp getDateAsked() {
		return this.dateAsked;
	}

	public void setDateAsked(Timestamp dateAsked) {
		this.dateAsked = dateAsked;
	}

	public Set getTumorBoardDiscussionAnswerses() {
		return this.tumorBoardDiscussionAnswerses;
	}

	public void setTumorBoardDiscussionAnswerses(Set tumorBoardDiscussionAnswerses) {
		this.tumorBoardDiscussionAnswerses = tumorBoardDiscussionAnswerses;
	}

}
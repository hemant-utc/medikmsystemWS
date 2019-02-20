package com.medikm.dto;

import java.sql.Timestamp;

/**
 * TumorBoardDiscussionAnswers entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class TumorBoardDiscussionAnswers implements java.io.Serializable {

	// Fields

	private Integer answerId;
	private TumorBoardDiscussionQuestion tumorBoardDiscussionQuestion;
	private String answerText;
	private Timestamp dateAnswered;
	private Short concurrence;
	private Short discurrence;

	// Constructors

	/** default constructor */
	public TumorBoardDiscussionAnswers() {
	}

	/** minimal constructor */
	public TumorBoardDiscussionAnswers(TumorBoardDiscussionQuestion tumorBoardDiscussionQuestion) {
		this.tumorBoardDiscussionQuestion = tumorBoardDiscussionQuestion;
	}

	/** full constructor */
	public TumorBoardDiscussionAnswers(TumorBoardDiscussionQuestion tumorBoardDiscussionQuestion, String answerText,
			Timestamp dateAnswered, Short concurrence, Short discurrence) {
		this.tumorBoardDiscussionQuestion = tumorBoardDiscussionQuestion;
		this.answerText = answerText;
		this.dateAnswered = dateAnswered;
		this.concurrence = concurrence;
		this.discurrence = discurrence;
	}

	// Property accessors

	public Integer getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public TumorBoardDiscussionQuestion getTumorBoardDiscussionQuestion() {
		return this.tumorBoardDiscussionQuestion;
	}

	public void setTumorBoardDiscussionQuestion(TumorBoardDiscussionQuestion tumorBoardDiscussionQuestion) {
		this.tumorBoardDiscussionQuestion = tumorBoardDiscussionQuestion;
	}

	public String getAnswerText() {
		return this.answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public Timestamp getDateAnswered() {
		return this.dateAnswered;
	}

	public void setDateAnswered(Timestamp dateAnswered) {
		this.dateAnswered = dateAnswered;
	}

	public Short getConcurrence() {
		return this.concurrence;
	}

	public void setConcurrence(Short concurrence) {
		this.concurrence = concurrence;
	}

	public Short getDiscurrence() {
		return this.discurrence;
	}

	public void setDiscurrence(Short discurrence) {
		this.discurrence = discurrence;
	}

}
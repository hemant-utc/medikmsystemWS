package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TbDiscussionForumQuestion entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class TbDiscussionForumQuestion implements java.io.Serializable {

	// Fields

	private Integer forumQuestionId;
	private TbDiscussionForum tbDiscussionForum;
	private Physician physician;
	private CcbrQuestion ccbrQuestion;
	private String question;
	private Timestamp questionDate;
	private Set tbDiscussionForumAnsweres = new HashSet(0);
	private Set questionLikes = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbDiscussionForumQuestion() {
	}

	/** minimal constructor */
	public TbDiscussionForumQuestion(TbDiscussionForum tbDiscussionForum) {
		this.tbDiscussionForum = tbDiscussionForum;
	}

	/** full constructor */
	public TbDiscussionForumQuestion(TbDiscussionForum tbDiscussionForum, Physician physician,
			CcbrQuestion ccbrQuestion, String question, Timestamp questionDate, Set tbDiscussionForumAnsweres,
			Set questionLikes) {
		this.tbDiscussionForum = tbDiscussionForum;
		this.physician = physician;
		this.ccbrQuestion = ccbrQuestion;
		this.question = question;
		this.questionDate = questionDate;
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
		this.questionLikes = questionLikes;
	}

	// Property accessors

	public Integer getForumQuestionId() {
		return this.forumQuestionId;
	}

	public void setForumQuestionId(Integer forumQuestionId) {
		this.forumQuestionId = forumQuestionId;
	}

	public TbDiscussionForum getTbDiscussionForum() {
		return this.tbDiscussionForum;
	}

	public void setTbDiscussionForum(TbDiscussionForum tbDiscussionForum) {
		this.tbDiscussionForum = tbDiscussionForum;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public CcbrQuestion getCcbrQuestion() {
		return this.ccbrQuestion;
	}

	public void setCcbrQuestion(CcbrQuestion ccbrQuestion) {
		this.ccbrQuestion = ccbrQuestion;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Timestamp getQuestionDate() {
		return this.questionDate;
	}

	public void setQuestionDate(Timestamp questionDate) {
		this.questionDate = questionDate;
	}

	public Set getTbDiscussionForumAnsweres() {
		return this.tbDiscussionForumAnsweres;
	}

	public void setTbDiscussionForumAnsweres(Set tbDiscussionForumAnsweres) {
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
	}

	public Set getQuestionLikes() {
		return this.questionLikes;
	}

	public void setQuestionLikes(Set questionLikes) {
		this.questionLikes = questionLikes;
	}

}
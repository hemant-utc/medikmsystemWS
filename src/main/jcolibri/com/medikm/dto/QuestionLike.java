package com.medikm.dto;

/**
 * QuestionLike entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class QuestionLike implements java.io.Serializable {

	// Fields

	private Integer likeId;
	private Physician physician;
	private TbDiscussionForumQuestion tbDiscussionForumQuestion;
	private Short likeValue;

	// Constructors

	/** default constructor */
	public QuestionLike() {
	}

	/** full constructor */
	public QuestionLike(Physician physician, TbDiscussionForumQuestion tbDiscussionForumQuestion, Short likeValue) {
		this.physician = physician;
		this.tbDiscussionForumQuestion = tbDiscussionForumQuestion;
		this.likeValue = likeValue;
	}

	// Property accessors

	public Integer getLikeId() {
		return this.likeId;
	}

	public void setLikeId(Integer likeId) {
		this.likeId = likeId;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public TbDiscussionForumQuestion getTbDiscussionForumQuestion() {
		return this.tbDiscussionForumQuestion;
	}

	public void setTbDiscussionForumQuestion(TbDiscussionForumQuestion tbDiscussionForumQuestion) {
		this.tbDiscussionForumQuestion = tbDiscussionForumQuestion;
	}

	public Short getLikeValue() {
		return this.likeValue;
	}

	public void setLikeValue(Short likeValue) {
		this.likeValue = likeValue;
	}

}
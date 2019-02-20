package com.medikm.dto;

/**
 * CommentsLike entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class CommentsLike implements java.io.Serializable {

	// Fields

	private Integer likeId;
	private Physician physician;
	private TbDiscussionForumAnswere tbDiscussionForumAnswere;
	private Short commentLikeValue;

	// Constructors

	/** default constructor */
	public CommentsLike() {
	}

	/** full constructor */
	public CommentsLike(Physician physician, TbDiscussionForumAnswere tbDiscussionForumAnswere,
			Short commentLikeValue) {
		this.physician = physician;
		this.tbDiscussionForumAnswere = tbDiscussionForumAnswere;
		this.commentLikeValue = commentLikeValue;
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

	public TbDiscussionForumAnswere getTbDiscussionForumAnswere() {
		return this.tbDiscussionForumAnswere;
	}

	public void setTbDiscussionForumAnswere(TbDiscussionForumAnswere tbDiscussionForumAnswere) {
		this.tbDiscussionForumAnswere = tbDiscussionForumAnswere;
	}

	public Short getCommentLikeValue() {
		return this.commentLikeValue;
	}

	public void setCommentLikeValue(Short commentLikeValue) {
		this.commentLikeValue = commentLikeValue;
	}

}
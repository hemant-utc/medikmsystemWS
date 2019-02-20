package com.medikm.dto;

import java.sql.Timestamp;

/**
 * RecommendedPlanLike entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class RecommendedPlanLike implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbDiscussionForum tbDiscussionForum;
	private Physician physician;
	private Short likeValue;
	private Timestamp creationDate;
	private Timestamp modificationDate;

	// Constructors

	/** default constructor */
	public RecommendedPlanLike() {
	}

	/** minimal constructor */
	public RecommendedPlanLike(TbDiscussionForum tbDiscussionForum, Physician physician, Short likeValue) {
		this.tbDiscussionForum = tbDiscussionForum;
		this.physician = physician;
		this.likeValue = likeValue;
	}

	/** full constructor */
	public RecommendedPlanLike(TbDiscussionForum tbDiscussionForum, Physician physician, Short likeValue,
			Timestamp creationDate, Timestamp modificationDate) {
		this.tbDiscussionForum = tbDiscussionForum;
		this.physician = physician;
		this.likeValue = likeValue;
		this.creationDate = creationDate;
		this.modificationDate = modificationDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Short getLikeValue() {
		return this.likeValue;
	}

	public void setLikeValue(Short likeValue) {
		this.likeValue = likeValue;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Timestamp modificationDate) {
		this.modificationDate = modificationDate;
	}

}
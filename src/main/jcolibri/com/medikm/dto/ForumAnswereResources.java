package com.medikm.dto;

/**
 * ForumAnswereResources entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class ForumAnswereResources implements java.io.Serializable {

	// Fields

	private Integer id;
	private Case1 case1;
	private MedikmResources medikmResources;
	private TbDiscussionForumAnswere tbDiscussionForumAnswere;

	// Constructors

	/** default constructor */
	public ForumAnswereResources() {
	}

	/** full constructor */
	public ForumAnswereResources(Case1 case1, MedikmResources medikmResources,
			TbDiscussionForumAnswere tbDiscussionForumAnswere) {
		this.case1 = case1;
		this.medikmResources = medikmResources;
		this.tbDiscussionForumAnswere = tbDiscussionForumAnswere;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public MedikmResources getMedikmResources() {
		return this.medikmResources;
	}

	public void setMedikmResources(MedikmResources medikmResources) {
		this.medikmResources = medikmResources;
	}

	public TbDiscussionForumAnswere getTbDiscussionForumAnswere() {
		return this.tbDiscussionForumAnswere;
	}

	public void setTbDiscussionForumAnswere(TbDiscussionForumAnswere tbDiscussionForumAnswere) {
		this.tbDiscussionForumAnswere = tbDiscussionForumAnswere;
	}

}
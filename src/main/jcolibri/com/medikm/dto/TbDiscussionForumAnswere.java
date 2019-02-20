package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TbDiscussionForumAnswere entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class TbDiscussionForumAnswere implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbDiscussionForumAnswere tbDiscussionForumAnswere;
	private TbDiscussionForum tbDiscussionForum;
	private CcbrSolution ccbrSolution;
	private TbDiscussionForumQuestion tbDiscussionForumQuestion;
	private MedikmResources medikmResources;
	private Physician physician;
	private String answere;
	private Timestamp answereDate;
	private String rationalText;
	private Set forumAnswereResourceses = new HashSet(0);
	private Set commentsLikes = new HashSet(0);
	private Set tbDiscussionForumAnsweres = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbDiscussionForumAnswere() {
	}

	/** minimal constructor */
	public TbDiscussionForumAnswere(TbDiscussionForum tbDiscussionForum, Physician physician, Timestamp answereDate) {
		this.tbDiscussionForum = tbDiscussionForum;
		this.physician = physician;
		this.answereDate = answereDate;
	}

	/** full constructor */
	public TbDiscussionForumAnswere(TbDiscussionForumAnswere tbDiscussionForumAnswere,
			TbDiscussionForum tbDiscussionForum, CcbrSolution ccbrSolution,
			TbDiscussionForumQuestion tbDiscussionForumQuestion, MedikmResources medikmResources, Physician physician,
			String answere, Timestamp answereDate, String rationalText, Set forumAnswereResourceses, Set commentsLikes,
			Set tbDiscussionForumAnsweres) {
		this.tbDiscussionForumAnswere = tbDiscussionForumAnswere;
		this.tbDiscussionForum = tbDiscussionForum;
		this.ccbrSolution = ccbrSolution;
		this.tbDiscussionForumQuestion = tbDiscussionForumQuestion;
		this.medikmResources = medikmResources;
		this.physician = physician;
		this.answere = answere;
		this.answereDate = answereDate;
		this.rationalText = rationalText;
		this.forumAnswereResourceses = forumAnswereResourceses;
		this.commentsLikes = commentsLikes;
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TbDiscussionForumAnswere getTbDiscussionForumAnswere() {
		return this.tbDiscussionForumAnswere;
	}

	public void setTbDiscussionForumAnswere(TbDiscussionForumAnswere tbDiscussionForumAnswere) {
		this.tbDiscussionForumAnswere = tbDiscussionForumAnswere;
	}

	public TbDiscussionForum getTbDiscussionForum() {
		return this.tbDiscussionForum;
	}

	public void setTbDiscussionForum(TbDiscussionForum tbDiscussionForum) {
		this.tbDiscussionForum = tbDiscussionForum;
	}

	public CcbrSolution getCcbrSolution() {
		return this.ccbrSolution;
	}

	public void setCcbrSolution(CcbrSolution ccbrSolution) {
		this.ccbrSolution = ccbrSolution;
	}

	public TbDiscussionForumQuestion getTbDiscussionForumQuestion() {
		return this.tbDiscussionForumQuestion;
	}

	public void setTbDiscussionForumQuestion(TbDiscussionForumQuestion tbDiscussionForumQuestion) {
		this.tbDiscussionForumQuestion = tbDiscussionForumQuestion;
	}

	public MedikmResources getMedikmResources() {
		return this.medikmResources;
	}

	public void setMedikmResources(MedikmResources medikmResources) {
		this.medikmResources = medikmResources;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public String getAnswere() {
		return this.answere;
	}

	public void setAnswere(String answere) {
		this.answere = answere;
	}

	public Timestamp getAnswereDate() {
		return this.answereDate;
	}

	public void setAnswereDate(Timestamp answereDate) {
		this.answereDate = answereDate;
	}

	public String getRationalText() {
		return this.rationalText;
	}

	public void setRationalText(String rationalText) {
		this.rationalText = rationalText;
	}

	public Set getForumAnswereResourceses() {
		return this.forumAnswereResourceses;
	}

	public void setForumAnswereResourceses(Set forumAnswereResourceses) {
		this.forumAnswereResourceses = forumAnswereResourceses;
	}

	public Set getCommentsLikes() {
		return this.commentsLikes;
	}

	public void setCommentsLikes(Set commentsLikes) {
		this.commentsLikes = commentsLikes;
	}

	public Set getTbDiscussionForumAnsweres() {
		return this.tbDiscussionForumAnsweres;
	}

	public void setTbDiscussionForumAnsweres(Set tbDiscussionForumAnsweres) {
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
	}

}
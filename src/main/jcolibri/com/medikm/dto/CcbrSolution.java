package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * CcbrSolution entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class CcbrSolution implements java.io.Serializable {

	// Fields

	private Integer solutionId;
	private KeyConcept keyConceptByKeyConcept2;
	private KeyConcept keyConceptByKeyConcept3;
	private CcbrQuestion ccbrQuestion;
	private KeyConcept keyConceptByKeyConcept1;
	private CcbrSolution ccbrSolution;
	private SolCategory solCategory;
	private String solutionText;
	private String source;
	private String comments;
	private String rational;
	private Integer quality;
	private Set tbDiscussionForumAnsweres = new HashSet(0);
	private Set ccbrSolutions = new HashSet(0);

	// Constructors

	/** default constructor */
	public CcbrSolution() {
	}

	/** minimal constructor */
	public CcbrSolution(CcbrQuestion ccbrQuestion, KeyConcept keyConceptByKeyConcept1, String solutionText) {
		this.ccbrQuestion = ccbrQuestion;
		this.keyConceptByKeyConcept1 = keyConceptByKeyConcept1;
		this.solutionText = solutionText;
	}

	/** full constructor */
	public CcbrSolution(KeyConcept keyConceptByKeyConcept2, KeyConcept keyConceptByKeyConcept3,
			CcbrQuestion ccbrQuestion, KeyConcept keyConceptByKeyConcept1, CcbrSolution ccbrSolution,
			SolCategory solCategory, String solutionText, String source, String comments, String rational,
			Integer quality, Set tbDiscussionForumAnsweres, Set ccbrSolutions) {
		this.keyConceptByKeyConcept2 = keyConceptByKeyConcept2;
		this.keyConceptByKeyConcept3 = keyConceptByKeyConcept3;
		this.ccbrQuestion = ccbrQuestion;
		this.keyConceptByKeyConcept1 = keyConceptByKeyConcept1;
		this.ccbrSolution = ccbrSolution;
		this.solCategory = solCategory;
		this.solutionText = solutionText;
		this.source = source;
		this.comments = comments;
		this.rational = rational;
		this.quality = quality;
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
		this.ccbrSolutions = ccbrSolutions;
	}

	// Property accessors

	public Integer getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(Integer solutionId) {
		this.solutionId = solutionId;
	}

	public KeyConcept getKeyConceptByKeyConcept2() {
		return this.keyConceptByKeyConcept2;
	}

	public void setKeyConceptByKeyConcept2(KeyConcept keyConceptByKeyConcept2) {
		this.keyConceptByKeyConcept2 = keyConceptByKeyConcept2;
	}

	public KeyConcept getKeyConceptByKeyConcept3() {
		return this.keyConceptByKeyConcept3;
	}

	public void setKeyConceptByKeyConcept3(KeyConcept keyConceptByKeyConcept3) {
		this.keyConceptByKeyConcept3 = keyConceptByKeyConcept3;
	}

	public CcbrQuestion getCcbrQuestion() {
		return this.ccbrQuestion;
	}

	public void setCcbrQuestion(CcbrQuestion ccbrQuestion) {
		this.ccbrQuestion = ccbrQuestion;
	}

	public KeyConcept getKeyConceptByKeyConcept1() {
		return this.keyConceptByKeyConcept1;
	}

	public void setKeyConceptByKeyConcept1(KeyConcept keyConceptByKeyConcept1) {
		this.keyConceptByKeyConcept1 = keyConceptByKeyConcept1;
	}

	public CcbrSolution getCcbrSolution() {
		return this.ccbrSolution;
	}

	public void setCcbrSolution(CcbrSolution ccbrSolution) {
		this.ccbrSolution = ccbrSolution;
	}

	public SolCategory getSolCategory() {
		return this.solCategory;
	}

	public void setSolCategory(SolCategory solCategory) {
		this.solCategory = solCategory;
	}

	public String getSolutionText() {
		return this.solutionText;
	}

	public void setSolutionText(String solutionText) {
		this.solutionText = solutionText;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRational() {
		return this.rational;
	}

	public void setRational(String rational) {
		this.rational = rational;
	}

	public Integer getQuality() {
		return this.quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	public Set getTbDiscussionForumAnsweres() {
		return this.tbDiscussionForumAnsweres;
	}

	public void setTbDiscussionForumAnsweres(Set tbDiscussionForumAnsweres) {
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
	}

	public Set getCcbrSolutions() {
		return this.ccbrSolutions;
	}

	public void setCcbrSolutions(Set ccbrSolutions) {
		this.ccbrSolutions = ccbrSolutions;
	}

}
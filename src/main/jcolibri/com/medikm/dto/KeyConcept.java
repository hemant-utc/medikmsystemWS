package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * KeyConcept entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class KeyConcept implements java.io.Serializable {

	// Fields

	private Integer conceptId;
	private String conceptName;
	private Set ccbrSolutionsForKeyConcept2 = new HashSet(0);
	private Set ccbrQuestionsForKeyConcept3 = new HashSet(0);
	private Set ccbrSolutionsForKeyConcept3 = new HashSet(0);
	private Set ccbrQuestionsForKeyConcept2 = new HashSet(0);
	private Set ccbrQuestionsForKeyConcept1 = new HashSet(0);
	private Set ccbrSolutionsForKeyConcept1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public KeyConcept() {
	}

	/** minimal constructor */
	public KeyConcept(Integer conceptId, String conceptName) {
		this.conceptId = conceptId;
		this.conceptName = conceptName;
	}

	/** full constructor */
	public KeyConcept(Integer conceptId, String conceptName, Set ccbrSolutionsForKeyConcept2,
			Set ccbrQuestionsForKeyConcept3, Set ccbrSolutionsForKeyConcept3, Set ccbrQuestionsForKeyConcept2,
			Set ccbrQuestionsForKeyConcept1, Set ccbrSolutionsForKeyConcept1) {
		this.conceptId = conceptId;
		this.conceptName = conceptName;
		this.ccbrSolutionsForKeyConcept2 = ccbrSolutionsForKeyConcept2;
		this.ccbrQuestionsForKeyConcept3 = ccbrQuestionsForKeyConcept3;
		this.ccbrSolutionsForKeyConcept3 = ccbrSolutionsForKeyConcept3;
		this.ccbrQuestionsForKeyConcept2 = ccbrQuestionsForKeyConcept2;
		this.ccbrQuestionsForKeyConcept1 = ccbrQuestionsForKeyConcept1;
		this.ccbrSolutionsForKeyConcept1 = ccbrSolutionsForKeyConcept1;
	}

	// Property accessors

	public Integer getConceptId() {
		return this.conceptId;
	}

	public void setConceptId(Integer conceptId) {
		this.conceptId = conceptId;
	}

	public String getConceptName() {
		return this.conceptName;
	}

	public void setConceptName(String conceptName) {
		this.conceptName = conceptName;
	}

	public Set getCcbrSolutionsForKeyConcept2() {
		return this.ccbrSolutionsForKeyConcept2;
	}

	public void setCcbrSolutionsForKeyConcept2(Set ccbrSolutionsForKeyConcept2) {
		this.ccbrSolutionsForKeyConcept2 = ccbrSolutionsForKeyConcept2;
	}

	public Set getCcbrQuestionsForKeyConcept3() {
		return this.ccbrQuestionsForKeyConcept3;
	}

	public void setCcbrQuestionsForKeyConcept3(Set ccbrQuestionsForKeyConcept3) {
		this.ccbrQuestionsForKeyConcept3 = ccbrQuestionsForKeyConcept3;
	}

	public Set getCcbrSolutionsForKeyConcept3() {
		return this.ccbrSolutionsForKeyConcept3;
	}

	public void setCcbrSolutionsForKeyConcept3(Set ccbrSolutionsForKeyConcept3) {
		this.ccbrSolutionsForKeyConcept3 = ccbrSolutionsForKeyConcept3;
	}

	public Set getCcbrQuestionsForKeyConcept2() {
		return this.ccbrQuestionsForKeyConcept2;
	}

	public void setCcbrQuestionsForKeyConcept2(Set ccbrQuestionsForKeyConcept2) {
		this.ccbrQuestionsForKeyConcept2 = ccbrQuestionsForKeyConcept2;
	}

	public Set getCcbrQuestionsForKeyConcept1() {
		return this.ccbrQuestionsForKeyConcept1;
	}

	public void setCcbrQuestionsForKeyConcept1(Set ccbrQuestionsForKeyConcept1) {
		this.ccbrQuestionsForKeyConcept1 = ccbrQuestionsForKeyConcept1;
	}

	public Set getCcbrSolutionsForKeyConcept1() {
		return this.ccbrSolutionsForKeyConcept1;
	}

	public void setCcbrSolutionsForKeyConcept1(Set ccbrSolutionsForKeyConcept1) {
		this.ccbrSolutionsForKeyConcept1 = ccbrSolutionsForKeyConcept1;
	}

}
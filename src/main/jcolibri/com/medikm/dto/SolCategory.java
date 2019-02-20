package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * SolCategory entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class SolCategory implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private String categoryName;
	private Set ccbrSolutions = new HashSet(0);
	private Set ccbrQuestions = new HashSet(0);

	// Constructors

	/** default constructor */
	public SolCategory() {
	}

	/** minimal constructor */
	public SolCategory(String categoryName) {
		this.categoryName = categoryName;
	}

	/** full constructor */
	public SolCategory(String categoryName, Set ccbrSolutions, Set ccbrQuestions) {
		this.categoryName = categoryName;
		this.ccbrSolutions = ccbrSolutions;
		this.ccbrQuestions = ccbrQuestions;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set getCcbrSolutions() {
		return this.ccbrSolutions;
	}

	public void setCcbrSolutions(Set ccbrSolutions) {
		this.ccbrSolutions = ccbrSolutions;
	}

	public Set getCcbrQuestions() {
		return this.ccbrQuestions;
	}

	public void setCcbrQuestions(Set ccbrQuestions) {
		this.ccbrQuestions = ccbrQuestions;
	}

}
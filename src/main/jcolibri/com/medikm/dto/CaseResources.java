package com.medikm.dto;

import java.sql.Timestamp;

/**
 * CaseResources entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class CaseResources implements java.io.Serializable {

	// Fields

	private Integer id;
	private Case1 case1;
	private Physician physician;
	private MedikmResources medikmResources;
	private Timestamp dateOfPost;
	private Timestamp dateAssignedCase;

	// Constructors

	/** default constructor */
	public CaseResources() {
	}

	/** minimal constructor */
	public CaseResources(Case1 case1, Physician physician, MedikmResources medikmResources, Timestamp dateOfPost) {
		this.case1 = case1;
		this.physician = physician;
		this.medikmResources = medikmResources;
		this.dateOfPost = dateOfPost;
	}

	/** full constructor */
	public CaseResources(Case1 case1, Physician physician, MedikmResources medikmResources, Timestamp dateOfPost,
			Timestamp dateAssignedCase) {
		this.case1 = case1;
		this.physician = physician;
		this.medikmResources = medikmResources;
		this.dateOfPost = dateOfPost;
		this.dateAssignedCase = dateAssignedCase;
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

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public MedikmResources getMedikmResources() {
		return this.medikmResources;
	}

	public void setMedikmResources(MedikmResources medikmResources) {
		this.medikmResources = medikmResources;
	}

	public Timestamp getDateOfPost() {
		return this.dateOfPost;
	}

	public void setDateOfPost(Timestamp dateOfPost) {
		this.dateOfPost = dateOfPost;
	}

	public Timestamp getDateAssignedCase() {
		return this.dateAssignedCase;
	}

	public void setDateAssignedCase(Timestamp dateAssignedCase) {
		this.dateAssignedCase = dateAssignedCase;
	}

}
package com.medikm.dto;

/**
 * DiseaseSymptoms entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class DiseaseSymptoms implements java.io.Serializable {

	// Fields

	private Integer id;
	private Case1 case1;
	private Symptoms symptoms;

	// Constructors

	/** default constructor */
	public DiseaseSymptoms() {
	}

	/** full constructor */
	public DiseaseSymptoms(Case1 case1, Symptoms symptoms) {
		this.case1 = case1;
		this.symptoms = symptoms;
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

	public Symptoms getSymptoms() {
		return this.symptoms;
	}

	public void setSymptoms(Symptoms symptoms) {
		this.symptoms = symptoms;
	}

}
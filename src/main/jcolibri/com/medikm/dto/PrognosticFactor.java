package com.medikm.dto;

import java.sql.Timestamp;

/**
 * PrognosticFactor entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class PrognosticFactor implements java.io.Serializable {

	// Fields

	private PrognosticFactorId id;
	private Case1 case1;
	private Timestamp progFactDt;
	private Short riskJointSymtoms;
	private String riskJointSymtomsComm;
	private String sentiLymphNMNomo;
	private String additionalNodalMetstasis;
	private String nottinghamNomogram;

	// Constructors

	/** default constructor */
	public PrognosticFactor() {
	}

	/** minimal constructor */
	public PrognosticFactor(PrognosticFactorId id, Case1 case1) {
		this.id = id;
		this.case1 = case1;
	}

	/** full constructor */
	public PrognosticFactor(PrognosticFactorId id, Case1 case1, Timestamp progFactDt, Short riskJointSymtoms,
			String riskJointSymtomsComm, String sentiLymphNMNomo, String additionalNodalMetstasis,
			String nottinghamNomogram) {
		this.id = id;
		this.case1 = case1;
		this.progFactDt = progFactDt;
		this.riskJointSymtoms = riskJointSymtoms;
		this.riskJointSymtomsComm = riskJointSymtomsComm;
		this.sentiLymphNMNomo = sentiLymphNMNomo;
		this.additionalNodalMetstasis = additionalNodalMetstasis;
		this.nottinghamNomogram = nottinghamNomogram;
	}

	// Property accessors

	public PrognosticFactorId getId() {
		return this.id;
	}

	public void setId(PrognosticFactorId id) {
		this.id = id;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public Timestamp getProgFactDt() {
		return this.progFactDt;
	}

	public void setProgFactDt(Timestamp progFactDt) {
		this.progFactDt = progFactDt;
	}

	public Short getRiskJointSymtoms() {
		return this.riskJointSymtoms;
	}

	public void setRiskJointSymtoms(Short riskJointSymtoms) {
		this.riskJointSymtoms = riskJointSymtoms;
	}

	public String getRiskJointSymtomsComm() {
		return this.riskJointSymtomsComm;
	}

	public void setRiskJointSymtomsComm(String riskJointSymtomsComm) {
		this.riskJointSymtomsComm = riskJointSymtomsComm;
	}

	public String getSentiLymphNMNomo() {
		return this.sentiLymphNMNomo;
	}

	public void setSentiLymphNMNomo(String sentiLymphNMNomo) {
		this.sentiLymphNMNomo = sentiLymphNMNomo;
	}

	public String getAdditionalNodalMetstasis() {
		return this.additionalNodalMetstasis;
	}

	public void setAdditionalNodalMetstasis(String additionalNodalMetstasis) {
		this.additionalNodalMetstasis = additionalNodalMetstasis;
	}

	public String getNottinghamNomogram() {
		return this.nottinghamNomogram;
	}

	public void setNottinghamNomogram(String nottinghamNomogram) {
		this.nottinghamNomogram = nottinghamNomogram;
	}

}
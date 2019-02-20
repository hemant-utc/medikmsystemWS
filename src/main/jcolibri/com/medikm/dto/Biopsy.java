package com.medikm.dto;

import java.sql.Timestamp;

/**
 * Biopsy entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class Biopsy implements java.io.Serializable {

	// Fields

	private Integer encounterId;
	private Case1 case1;
	private LesionType lesionType;
	private Encounter encounter;
	private BiopsyType biopsyType;
	private Integer biopsyId;
	private String lesionLocation;
	private Integer needleGauge;
	private Short postBiopsyRecommendedMri;
	private Short postBiopsyRelatedMriControlateralBreast;
	private Short lesionCompletelyRemoved;
	private String complications;
	private Timestamp timeBiopsySampleTaken;
	private Timestamp timeBiopsySampleSent;
	private Short biopsyMargins;
	private String biopsyMarginsComm;
	private String snInjMethod;

	// Constructors

	/** default constructor */
	public Biopsy() {
	}

	/** minimal constructor */
	public Biopsy(Integer encounterId, Encounter encounter, Integer biopsyId) {
		this.encounterId = encounterId;
		this.encounter = encounter;
		this.biopsyId = biopsyId;
	}

	/** full constructor */
	public Biopsy(Integer encounterId, Case1 case1, LesionType lesionType, Encounter encounter, BiopsyType biopsyType,
			Integer biopsyId, String lesionLocation, Integer needleGauge, Short postBiopsyRecommendedMri,
			Short postBiopsyRelatedMriControlateralBreast, Short lesionCompletelyRemoved, String complications,
			Timestamp timeBiopsySampleTaken, Timestamp timeBiopsySampleSent, Short biopsyMargins,
			String biopsyMarginsComm, String snInjMethod) {
		this.encounterId = encounterId;
		this.case1 = case1;
		this.lesionType = lesionType;
		this.encounter = encounter;
		this.biopsyType = biopsyType;
		this.biopsyId = biopsyId;
		this.lesionLocation = lesionLocation;
		this.needleGauge = needleGauge;
		this.postBiopsyRecommendedMri = postBiopsyRecommendedMri;
		this.postBiopsyRelatedMriControlateralBreast = postBiopsyRelatedMriControlateralBreast;
		this.lesionCompletelyRemoved = lesionCompletelyRemoved;
		this.complications = complications;
		this.timeBiopsySampleTaken = timeBiopsySampleTaken;
		this.timeBiopsySampleSent = timeBiopsySampleSent;
		this.biopsyMargins = biopsyMargins;
		this.biopsyMarginsComm = biopsyMarginsComm;
		this.snInjMethod = snInjMethod;
	}

	// Property accessors

	public Integer getEncounterId() {
		return this.encounterId;
	}

	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public LesionType getLesionType() {
		return this.lesionType;
	}

	public void setLesionType(LesionType lesionType) {
		this.lesionType = lesionType;
	}

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public BiopsyType getBiopsyType() {
		return this.biopsyType;
	}

	public void setBiopsyType(BiopsyType biopsyType) {
		this.biopsyType = biopsyType;
	}

	public Integer getBiopsyId() {
		return this.biopsyId;
	}

	public void setBiopsyId(Integer biopsyId) {
		this.biopsyId = biopsyId;
	}

	public String getLesionLocation() {
		return this.lesionLocation;
	}

	public void setLesionLocation(String lesionLocation) {
		this.lesionLocation = lesionLocation;
	}

	public Integer getNeedleGauge() {
		return this.needleGauge;
	}

	public void setNeedleGauge(Integer needleGauge) {
		this.needleGauge = needleGauge;
	}

	public Short getPostBiopsyRecommendedMri() {
		return this.postBiopsyRecommendedMri;
	}

	public void setPostBiopsyRecommendedMri(Short postBiopsyRecommendedMri) {
		this.postBiopsyRecommendedMri = postBiopsyRecommendedMri;
	}

	public Short getPostBiopsyRelatedMriControlateralBreast() {
		return this.postBiopsyRelatedMriControlateralBreast;
	}

	public void setPostBiopsyRelatedMriControlateralBreast(Short postBiopsyRelatedMriControlateralBreast) {
		this.postBiopsyRelatedMriControlateralBreast = postBiopsyRelatedMriControlateralBreast;
	}

	public Short getLesionCompletelyRemoved() {
		return this.lesionCompletelyRemoved;
	}

	public void setLesionCompletelyRemoved(Short lesionCompletelyRemoved) {
		this.lesionCompletelyRemoved = lesionCompletelyRemoved;
	}

	public String getComplications() {
		return this.complications;
	}

	public void setComplications(String complications) {
		this.complications = complications;
	}

	public Timestamp getTimeBiopsySampleTaken() {
		return this.timeBiopsySampleTaken;
	}

	public void setTimeBiopsySampleTaken(Timestamp timeBiopsySampleTaken) {
		this.timeBiopsySampleTaken = timeBiopsySampleTaken;
	}

	public Timestamp getTimeBiopsySampleSent() {
		return this.timeBiopsySampleSent;
	}

	public void setTimeBiopsySampleSent(Timestamp timeBiopsySampleSent) {
		this.timeBiopsySampleSent = timeBiopsySampleSent;
	}

	public Short getBiopsyMargins() {
		return this.biopsyMargins;
	}

	public void setBiopsyMargins(Short biopsyMargins) {
		this.biopsyMargins = biopsyMargins;
	}

	public String getBiopsyMarginsComm() {
		return this.biopsyMarginsComm;
	}

	public void setBiopsyMarginsComm(String biopsyMarginsComm) {
		this.biopsyMarginsComm = biopsyMarginsComm;
	}

	public String getSnInjMethod() {
		return this.snInjMethod;
	}

	public void setSnInjMethod(String snInjMethod) {
		this.snInjMethod = snInjMethod;
	}

}
package com.medikm.dto;

import java.sql.Timestamp;

/**
 * TestResultResource entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class TestResultResource implements java.io.Serializable {

	// Fields

	private Integer resourseId;
	private Physician physician;
	private DiseaseType diseaseType;
	private Case1 case1;
	private String name;
	private String description;
	private String type;
	private String keywords;
	private Timestamp publicationYear;
	private String fileName;
	private String evidenceLevel;
	private String source;
	private Timestamp dateOfPosted;
	private Integer visibility;
	private String externalUrl;

	// Constructors

	/** default constructor */
	public TestResultResource() {
	}

	/** minimal constructor */
	public TestResultResource(DiseaseType diseaseType, Case1 case1, String name) {
		this.diseaseType = diseaseType;
		this.case1 = case1;
		this.name = name;
	}

	/** full constructor */
	public TestResultResource(Physician physician, DiseaseType diseaseType, Case1 case1, String name,
			String description, String type, String keywords, Timestamp publicationYear, String fileName,
			String evidenceLevel, String source, Timestamp dateOfPosted, Integer visibility, String externalUrl) {
		this.physician = physician;
		this.diseaseType = diseaseType;
		this.case1 = case1;
		this.name = name;
		this.description = description;
		this.type = type;
		this.keywords = keywords;
		this.publicationYear = publicationYear;
		this.fileName = fileName;
		this.evidenceLevel = evidenceLevel;
		this.source = source;
		this.dateOfPosted = dateOfPosted;
		this.visibility = visibility;
		this.externalUrl = externalUrl;
	}

	// Property accessors

	public Integer getResourseId() {
		return this.resourseId;
	}

	public void setResourseId(Integer resourseId) {
		this.resourseId = resourseId;
	}

	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public DiseaseType getDiseaseType() {
		return this.diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	public Case1 getCase1() {
		return this.case1;
	}

	public void setCase1(Case1 case1) {
		this.case1 = case1;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Timestamp getPublicationYear() {
		return this.publicationYear;
	}

	public void setPublicationYear(Timestamp publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getEvidenceLevel() {
		return this.evidenceLevel;
	}

	public void setEvidenceLevel(String evidenceLevel) {
		this.evidenceLevel = evidenceLevel;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Timestamp getDateOfPosted() {
		return this.dateOfPosted;
	}

	public void setDateOfPosted(Timestamp dateOfPosted) {
		this.dateOfPosted = dateOfPosted;
	}

	public Integer getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public String getExternalUrl() {
		return this.externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

}
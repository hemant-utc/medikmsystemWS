package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * MedikmResources entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class MedikmResources implements java.io.Serializable {

	// Fields

	private Integer resourseId;
	private Physician physician;
	private DiseaseType diseaseType;
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
	private Integer answerId;
	private Set tbDiscussionForumAnsweres = new HashSet(0);
	private Set forumAnswereResourceses = new HashSet(0);
	private Set caseResourceses = new HashSet(0);

	// Constructors

	/** default constructor */
	public MedikmResources() {
	}

	/** minimal constructor */
	public MedikmResources(DiseaseType diseaseType, String name, Timestamp dateOfPosted, Integer visibility) {
		this.diseaseType = diseaseType;
		this.name = name;
		this.dateOfPosted = dateOfPosted;
		this.visibility = visibility;
	}

	/** full constructor */
	public MedikmResources(Physician physician, DiseaseType diseaseType, String name, String description, String type,
			String keywords, Timestamp publicationYear, String fileName, String evidenceLevel, String source,
			Timestamp dateOfPosted, Integer visibility, String externalUrl, Integer answerId,
			Set tbDiscussionForumAnsweres, Set forumAnswereResourceses, Set caseResourceses) {
		this.physician = physician;
		this.diseaseType = diseaseType;
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
		this.answerId = answerId;
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
		this.forumAnswereResourceses = forumAnswereResourceses;
		this.caseResourceses = caseResourceses;
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

	public Integer getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public Set getTbDiscussionForumAnsweres() {
		return this.tbDiscussionForumAnsweres;
	}

	public void setTbDiscussionForumAnsweres(Set tbDiscussionForumAnsweres) {
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
	}

	public Set getForumAnswereResourceses() {
		return this.forumAnswereResourceses;
	}

	public void setForumAnswereResourceses(Set forumAnswereResourceses) {
		this.forumAnswereResourceses = forumAnswereResourceses;
	}

	public Set getCaseResourceses() {
		return this.caseResourceses;
	}

	public void setCaseResourceses(Set caseResourceses) {
		this.caseResourceses = caseResourceses;
	}

}
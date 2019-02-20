/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "medikm_resources")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "MedikmResources.findAll", query = "SELECT m FROM MedikmResources m") })
public class MedikmResources implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Resourse_Id")
	private Integer resourseId;
	@Basic(optional = false)
	@Column(name = "Name")
	private String name;
	@Lob
	@Column(name = "Description")
	private String description;
	@Column(name = "Type")
	private String type;
	@Lob
	@Column(name = "Keywords")
	private String keywords;
	@Column(name = "Publication_Year")
	@Temporal(TemporalType.TIMESTAMP)
	private Date publicationYear;
	@Column(name = "File_Name")
	private String fileName;
	@Column(name = "Evidence_Level")
	private String evidenceLevel;
	@Lob
	@Column(name = "Source")
	private String source;
	@Basic(optional = false)
	@Column(name = "Date_Of_Posted")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfPosted;
	@Basic(optional = false)
	@Column(name = "Visibility")
	private int visibility;
	@Basic(optional = false)
	@Column(name = "External_Url")
	private String externalUrl;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resourceId")
	private Collection<CaseResources> caseResourcesCollection;
	@OneToMany(mappedBy = "evidence")
	private Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection;
	@JoinColumn(name = "Provider_ID", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician providerID;
	@JoinColumn(name = "DiseaseType", referencedColumnName = "Disease_Type_Id")
	@ManyToOne(optional = false)
	private DiseaseType diseaseType;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resourceId")
	private Collection<ForumAnswereResources> forumAnswereResourcesCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "medikmResource")
	private Collection<ForumReplyResources> forumReplyResourcesCollection;

	public MedikmResources() {
	}

	public MedikmResources(Integer resourseId) {
		this.resourseId = resourseId;
	}

	public MedikmResources(Integer resourseId, String name, Date dateOfPosted, int visibility, String externalUrl) {
		this.resourseId = resourseId;
		this.name = name;
		this.dateOfPosted = dateOfPosted;
		this.visibility = visibility;
		this.externalUrl = externalUrl;
	}

	public Integer getResourseId() {
		return resourseId;
	}

	public void setResourseId(Integer resourseId) {
		this.resourseId = resourseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Date getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(Date publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getEvidenceLevel() {
		return evidenceLevel;
	}

	public void setEvidenceLevel(String evidenceLevel) {
		this.evidenceLevel = evidenceLevel;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDateOfPosted() {
		return dateOfPosted;
	}

	public void setDateOfPosted(Date dateOfPosted) {
		this.dateOfPosted = dateOfPosted;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

	@XmlTransient
	public Collection<CaseResources> getCaseResourcesCollection() {
		return caseResourcesCollection;
	}

	public void setCaseResourcesCollection(Collection<CaseResources> caseResourcesCollection) {
		this.caseResourcesCollection = caseResourcesCollection;
	}

	@XmlTransient
	public Collection<TbDiscussionForumAnswere> getTbDiscussionForumAnswereCollection() {
		return tbDiscussionForumAnswereCollection;
	}

	public void setTbDiscussionForumAnswereCollection(
			Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection) {
		this.tbDiscussionForumAnswereCollection = tbDiscussionForumAnswereCollection;
	}

	public Physician getProviderID() {
		return providerID;
	}

	public void setProviderID(Physician providerID) {
		this.providerID = providerID;
	}

	public DiseaseType getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	@XmlTransient
	public Collection<ForumAnswereResources> getForumAnswereResourcesCollection() {
		return forumAnswereResourcesCollection;
	}

	public void setForumAnswereResourcesCollection(Collection<ForumAnswereResources> forumAnswereResourcesCollection) {
		this.forumAnswereResourcesCollection = forumAnswereResourcesCollection;
	}

	public Collection<ForumReplyResources> getForumReplyResourcesCollection() {
		return forumReplyResourcesCollection;
	}

	public void setForumReplyResourcesCollection(Collection<ForumReplyResources> forumReplyResourcesCollection) {
		this.forumReplyResourcesCollection = forumReplyResourcesCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (resourseId != null ? resourseId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof MedikmResources)) {
			return false;
		}
		MedikmResources other = (MedikmResources) object;
		if ((this.resourseId == null && other.resourseId != null)
				|| (this.resourseId != null && !this.resourseId.equals(other.resourseId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.MedikmResources[ resourseId=" + resourseId + " ]";
	}

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "case_resources")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CaseResources.findAll", query = "SELECT c FROM CaseResources c") })
public class CaseResources implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Id")
	private Integer id;
	@Basic(optional = false)
	@Column(name = "Date_Of_Post")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfPost;
	@Column(name = "Date_Assigned_Case")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAssignedCase;
	@JoinColumn(name = "Provider_Id", referencedColumnName = "Physician_Id")
	@ManyToOne(optional = false)
	private Physician providerId;
	@JoinColumn(name = "Resource_Id", referencedColumnName = "Resourse_Id")
	@ManyToOne(optional = false)
	private MedikmResources resourceId;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false)
	private Case1 caseId;

	public CaseResources() {
	}

	public CaseResources(Integer id) {
		this.id = id;
	}

	public CaseResources(Integer id, Date dateOfPost) {
		this.id = id;
		this.dateOfPost = dateOfPost;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOfPost() {
		return dateOfPost;
	}

	public void setDateOfPost(Date dateOfPost) {
		this.dateOfPost = dateOfPost;
	}

	public Date getDateAssignedCase() {
		return dateAssignedCase;
	}

	public void setDateAssignedCase(Date dateAssignedCase) {
		this.dateAssignedCase = dateAssignedCase;
	}

	public Physician getProviderId() {
		return providerId;
	}

	public void setProviderId(Physician providerId) {
		this.providerId = providerId;
	}

	public MedikmResources getResourceId() {
		return resourceId;
	}

	public void setResourceId(MedikmResources resourceId) {
		this.resourceId = resourceId;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CaseResources)) {
			return false;
		}
		CaseResources other = (CaseResources) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CaseResources[ id=" + id + " ]";
	}

}

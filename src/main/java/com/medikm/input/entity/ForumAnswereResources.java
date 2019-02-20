/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "forum_answere_resources")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ForumAnswereResources.findAll", query = "SELECT f FROM ForumAnswereResources f") })
public class ForumAnswereResources implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Id")
	private Integer id;
	@JoinColumn(name = "Resource_Id", referencedColumnName = "Resourse_Id")
	@ManyToOne(optional = false)
	private MedikmResources resourceId;
	@JoinColumn(name = "Answere_Id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private TbDiscussionForumAnswere answereId;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false)
	private Case1 caseId;

	public ForumAnswereResources() {
	}

	public ForumAnswereResources(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MedikmResources getResourceId() {
		return resourceId;
	}

	public void setResourceId(MedikmResources resourceId) {
		this.resourceId = resourceId;
	}

	public TbDiscussionForumAnswere getAnswereId() {
		return answereId;
	}

	public void setAnswereId(TbDiscussionForumAnswere answereId) {
		this.answereId = answereId;
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
		if (!(object instanceof ForumAnswereResources)) {
			return false;
		}
		ForumAnswereResources other = (ForumAnswereResources) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ForumAnswereResources[ id=" + id + " ]";
	}

}

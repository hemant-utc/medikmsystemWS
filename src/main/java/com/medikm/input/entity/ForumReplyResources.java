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
 * @author JAVA 4
 */
@Entity
@Table(name = "forum_reply_resources")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ForumReplyResources.findAll", query = "SELECT f FROM ForumReplyResources f"),
		@NamedQuery(name = "ForumReplyResources.findById", query = "SELECT f FROM ForumReplyResources f WHERE f.id = :id") })
public class ForumReplyResources implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@JoinColumn(name = "forum_Question_Id", referencedColumnName = "ForumQuestionId")
	@ManyToOne(optional = false)
	private TbDiscussionForumQuestion forumQuestionId;
	@JoinColumn(name = "Resource_Id", referencedColumnName = "Resourse_Id")
	@ManyToOne(optional = false)
	private MedikmResources medikmResource;
	@JoinColumn(name = "reply_Id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private TbDiscussionForumAnswereComment replyId;
	@JoinColumn(name = "forum_Answere_Id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private TbDiscussionForumAnswere forumAnswereId;
	@JoinColumn(name = "case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false)
	private Case1 caseId;

	public ForumReplyResources() {
	}

	public ForumReplyResources(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TbDiscussionForumQuestion getForumQuestionId() {
		return forumQuestionId;
	}

	public void setForumQuestionId(TbDiscussionForumQuestion forumQuestionId) {
		this.forumQuestionId = forumQuestionId;
	}

	public MedikmResources getResourceId() {
		return medikmResource;
	}

	public void setResourceId(MedikmResources resourceId) {
		this.medikmResource = resourceId;
	}

	public TbDiscussionForumAnswereComment getReplyId() {
		return replyId;
	}

	public void setReplyId(TbDiscussionForumAnswereComment replyId) {
		this.replyId = replyId;
	}

	public TbDiscussionForumAnswere getForumAnswereId() {
		return forumAnswereId;
	}

	public void setForumAnswereId(TbDiscussionForumAnswere forumAnswereId) {
		this.forumAnswereId = forumAnswereId;
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
		if (!(object instanceof ForumReplyResources)) {
			return false;
		}
		ForumReplyResources other = (ForumReplyResources) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.ForumReplyResources[ id=" + id + " ]";
	}

}

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

/**
 *
 * @author sunil
 */
@Entity
@Table(name = "tb_discussion_forum_answere_comment")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "TbDiscussionForumAnswereComment.findAll", query = "SELECT t FROM TbDiscussionForumAnswereComment t"),
		@NamedQuery(name = "TbDiscussionForumAnswereComment.findById", query = "SELECT t FROM TbDiscussionForumAnswereComment t WHERE t.id = :id"),
		@NamedQuery(name = "TbDiscussionForumAnswereComment.findByCommentDate", query = "SELECT t FROM TbDiscussionForumAnswereComment t WHERE t.commentDate = :commentDate") })
public class TbDiscussionForumAnswereComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Lob
	@Column(name = "comment")
	private String comment;
	@Basic(optional = false)
	@Column(name = "comment_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date commentDate;
	@Lob
	@Column(name = "rational_text")
	private String rationalText;
	@JoinColumn(name = "answer_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private TbDiscussionForumAnswere answerId;
	@JoinColumn(name = "Physician_Id", referencedColumnName = "Physician_Id")
	@ManyToOne(optional = false)
	private Physician physicianId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "replyId")
	private Collection<ForumReplyResources> forumReplyResourcesCollection;

	public TbDiscussionForumAnswereComment() {
	}

	public TbDiscussionForumAnswereComment(Integer id) {
		this.id = id;
	}

	public TbDiscussionForumAnswereComment(Integer id, Date commentDate) {
		this.id = id;
		this.commentDate = commentDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public String getRationalText() {
		return rationalText;
	}

	public void setRationalText(String rationalText) {
		this.rationalText = rationalText;
	}

	public TbDiscussionForumAnswere getAnswerId() {
		return answerId;
	}

	public void setAnswerId(TbDiscussionForumAnswere answerId) {
		this.answerId = answerId;
	}

	public Physician getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(Physician physicianId) {
		this.physicianId = physicianId;
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
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TbDiscussionForumAnswereComment)) {
			return false;
		}
		TbDiscussionForumAnswereComment other = (TbDiscussionForumAnswereComment) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.TbDiscussionForumAnswereComment[ id=" + id + " ]";
	}

}

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
@Table(name = "tb_discussion_forum_answere")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "TbDiscussionForumAnswere.findAll", query = "SELECT t FROM TbDiscussionForumAnswere t") })
public class TbDiscussionForumAnswere implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Lob
	@Column(name = "answere")
	private String answere;
	@Basic(optional = false)
	@Column(name = "answere_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date answereDate;
	@JoinColumn(name = "Physician_Id", referencedColumnName = "Physician_Id")
	@ManyToOne(optional = false)
	private Physician physicianId;
	@JoinColumn(name = "CCBR_Answere_Id", referencedColumnName = "Solution_Id")
	@ManyToOne
	private CcbrSolution cCBRAnswereId;
	@JoinColumn(name = "ForumQuestionId", referencedColumnName = "ForumQuestionId")
	@ManyToOne
	private TbDiscussionForumQuestion forumQuestionId;
	@JoinColumn(name = "TB_Discussion_Id", referencedColumnName = "TB_Discussion_Id")
	@ManyToOne(optional = false)
	private TumorBoardDiscussion tBDiscussionId;
	@JoinColumn(name = "Evidence", referencedColumnName = "Resourse_Id")
	@ManyToOne
	private MedikmResources evidence;
	@OneToMany(mappedBy = "relatedAnswerId")
	private Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection;
	@JoinColumn(name = "Related_Answer_Id", referencedColumnName = "id")
	@ManyToOne
	private TbDiscussionForumAnswere relatedAnswerId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "commentsId")
	private Collection<CommentsLike> commentsLikeCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "answereId")
	private Collection<ForumAnswereResources> forumAnswereResourcesCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "answerId")
	private Collection<TbDiscussionForumAnswereComment> tbDiscussionForumAnswereCommentCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "forumAnswereId")
	private Collection<ForumReplyResources> forumReplyResourcesCollection;

	public TbDiscussionForumAnswere() {
	}

	public TbDiscussionForumAnswere(Integer id) {
		this.id = id;
	}

	public TbDiscussionForumAnswere(Integer id, Date answereDate) {
		this.id = id;
		this.answereDate = answereDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnswere() {
		return answere;
	}

	public void setAnswere(String answere) {
		this.answere = answere;
	}

	public Date getAnswereDate() {
		return answereDate;
	}

	public void setAnswereDate(Date answereDate) {
		this.answereDate = answereDate;
	}

	public Physician getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(Physician physicianId) {
		this.physicianId = physicianId;
	}

	public CcbrSolution getCCBRAnswereId() {
		return cCBRAnswereId;
	}

	public void setCCBRAnswereId(CcbrSolution cCBRAnswereId) {
		this.cCBRAnswereId = cCBRAnswereId;
	}

	public TbDiscussionForumQuestion getForumQuestionId() {
		return forumQuestionId;
	}

	public void setForumQuestionId(TbDiscussionForumQuestion forumQuestionId) {
		this.forumQuestionId = forumQuestionId;
	}

	public TumorBoardDiscussion getTBDiscussionId() {
		return tBDiscussionId;
	}

	public void setTBDiscussionId(TumorBoardDiscussion tBDiscussionId) {
		this.tBDiscussionId = tBDiscussionId;
	}

	public MedikmResources getEvidence() {
		return evidence;
	}

	public void setEvidence(MedikmResources evidence) {
		this.evidence = evidence;
	}

	@XmlTransient
	public Collection<TbDiscussionForumAnswere> getTbDiscussionForumAnswereCollection() {
		return tbDiscussionForumAnswereCollection;
	}

	public void setTbDiscussionForumAnswereCollection(
			Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection) {
		this.tbDiscussionForumAnswereCollection = tbDiscussionForumAnswereCollection;
	}

	public TbDiscussionForumAnswere getRelatedAnswerId() {
		return relatedAnswerId;
	}

	public void setRelatedAnswerId(TbDiscussionForumAnswere relatedAnswerId) {
		this.relatedAnswerId = relatedAnswerId;
	}

	@XmlTransient
	public Collection<CommentsLike> getCommentsLikeCollection() {
		return commentsLikeCollection;
	}

	public void setCommentsLikeCollection(Collection<CommentsLike> commentsLikeCollection) {
		this.commentsLikeCollection = commentsLikeCollection;
	}

	@XmlTransient
	public Collection<ForumAnswereResources> getForumAnswereResourcesCollection() {
		return forumAnswereResourcesCollection;
	}

	public void setForumAnswereResourcesCollection(Collection<ForumAnswereResources> forumAnswereResourcesCollection) {
		this.forumAnswereResourcesCollection = forumAnswereResourcesCollection;
	}

	public Collection<TbDiscussionForumAnswereComment> getTbDiscussionForumAnswereCommentCollection() {
		return tbDiscussionForumAnswereCommentCollection;
	}

	public void setTbDiscussionForumAnswereCommentCollection(
			Collection<TbDiscussionForumAnswereComment> tbDiscussionForumAnswereCommentCollection) {
		this.tbDiscussionForumAnswereCommentCollection = tbDiscussionForumAnswereCommentCollection;
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
		if (!(object instanceof TbDiscussionForumAnswere)) {
			return false;
		}
		TbDiscussionForumAnswere other = (TbDiscussionForumAnswere) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TbDiscussionForumAnswere[ id=" + id + " ]";
	}

}

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
@Table(name = "tb_discussion_forum_question")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "TbDiscussionForumQuestion.findAll", query = "SELECT t FROM TbDiscussionForumQuestion t") })
public class TbDiscussionForumQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ForumQuestionId")
	private Integer forumQuestionId;
	@Column(name = "question")
	private String question;
	@Column(name = "question_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date questionDate;
	@OneToMany(mappedBy = "forumQuestionId")
	private Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "questionId")
	private Collection<QuestionLike> questionLikeCollection;
	@JoinColumn(name = "CCBR_QuestionId", referencedColumnName = "Question_Id")
	@ManyToOne(cascade = CascadeType.ALL)
	private CcbrQuestion cCBRQuestionId;
	@JoinColumn(name = "Physician_Id", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician physicianId;
	@JoinColumn(name = "TB_Discussion_Id", referencedColumnName = "TB_Discussion_Id")
	@ManyToOne(optional = false)
	private TbDiscussionForum tBDiscussionId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "forumQuestionId")
	private Collection<ForumReplyResources> forumReplyResourcesCollection;

	public TbDiscussionForumQuestion() {
	}

	public TbDiscussionForumQuestion(Integer forumQuestionId) {
		this.forumQuestionId = forumQuestionId;
	}

	public Integer getForumQuestionId() {
		return forumQuestionId;
	}

	public void setForumQuestionId(Integer forumQuestionId) {
		this.forumQuestionId = forumQuestionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Date getQuestionDate() {
		return questionDate;
	}

	public void setQuestionDate(Date questionDate) {
		this.questionDate = questionDate;
	}

	@XmlTransient
	public Collection<TbDiscussionForumAnswere> getTbDiscussionForumAnswereCollection() {
		return tbDiscussionForumAnswereCollection;
	}

	public void setTbDiscussionForumAnswereCollection(
			Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection) {
		this.tbDiscussionForumAnswereCollection = tbDiscussionForumAnswereCollection;
	}

	@XmlTransient
	public Collection<QuestionLike> getQuestionLikeCollection() {
		return questionLikeCollection;
	}

	public void setQuestionLikeCollection(Collection<QuestionLike> questionLikeCollection) {
		this.questionLikeCollection = questionLikeCollection;
	}

	public CcbrQuestion getCCBRQuestionId() {
		return cCBRQuestionId;
	}

	public void setCCBRQuestionId(CcbrQuestion cCBRQuestionId) {
		this.cCBRQuestionId = cCBRQuestionId;
	}

	public Physician getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(Physician physicianId) {
		this.physicianId = physicianId;
	}

	public TbDiscussionForum getTBDiscussionId() {
		return tBDiscussionId;
	}

	public void setTBDiscussionId(TbDiscussionForum tBDiscussionId) {
		this.tBDiscussionId = tBDiscussionId;
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
		hash += (forumQuestionId != null ? forumQuestionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TbDiscussionForumQuestion)) {
			return false;
		}
		TbDiscussionForumQuestion other = (TbDiscussionForumQuestion) object;
		if ((this.forumQuestionId == null && other.forumQuestionId != null)
				|| (this.forumQuestionId != null && !this.forumQuestionId.equals(other.forumQuestionId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TbDiscussionForumQuestion[ forumQuestionId=" + forumQuestionId + " ]";
	}

}

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
@Table(name = "question_like")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "QuestionLike.findAll", query = "SELECT q FROM QuestionLike q") })
public class QuestionLike implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "like_id")
	private Integer likeId;
	@Basic(optional = false)
	@Column(name = "like_value")
	private short likeValue;
	@JoinColumn(name = "question_id", referencedColumnName = "ForumQuestionId")
	@ManyToOne(optional = false)
	private TbDiscussionForumQuestion questionId;
	@JoinColumn(name = "user_id", referencedColumnName = "Physician_Id")
	@ManyToOne(optional = false)
	private Physician userId;

	public QuestionLike() {
	}

	public QuestionLike(Integer likeId) {
		this.likeId = likeId;
	}

	public QuestionLike(Integer likeId, short likeValue) {
		this.likeId = likeId;
		this.likeValue = likeValue;
	}

	public Integer getLikeId() {
		return likeId;
	}

	public void setLikeId(Integer likeId) {
		this.likeId = likeId;
	}

	public short getLikeValue() {
		return likeValue;
	}

	public void setLikeValue(short likeValue) {
		this.likeValue = likeValue;
	}

	public TbDiscussionForumQuestion getQuestionId() {
		return questionId;
	}

	public void setQuestionId(TbDiscussionForumQuestion questionId) {
		this.questionId = questionId;
	}

	public Physician getUserId() {
		return userId;
	}

	public void setUserId(Physician userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (likeId != null ? likeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof QuestionLike)) {
			return false;
		}
		QuestionLike other = (QuestionLike) object;
		if ((this.likeId == null && other.likeId != null)
				|| (this.likeId != null && !this.likeId.equals(other.likeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.QuestionLike[ likeId=" + likeId + " ]";
	}

}

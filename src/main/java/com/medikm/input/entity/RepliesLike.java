package com.medikm.input.entity;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
@Table(name = "replies_like")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "RepliesLike.findAll", query = "SELECT r FROM RepliesLike r"),
		@NamedQuery(name = "RepliesLike.findByReplyLikeId", query = "SELECT r FROM RepliesLike r WHERE r.replyLikeId = :replyLikeId"),
		@NamedQuery(name = "RepliesLike.findByIsLike", query = "SELECT r FROM RepliesLike r WHERE r.isLike = :isLike") })
public class RepliesLike implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "reply_like_id")
	private Integer replyLikeId;
	@Basic(optional = false)
	@Column(name = "is_like")
	private boolean isLike;
	@JoinColumn(name = "reply_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private TbDiscussionForumAnswereComment replyId;
	@JoinColumn(name = "user_id", referencedColumnName = "Physician_Id")
	@ManyToOne(optional = false)
	private Physician userId;

	public RepliesLike() {
	}

	public RepliesLike(Integer replyLikeId) {
		this.replyLikeId = replyLikeId;
	}

	public RepliesLike(Integer replyLikeId, boolean isLike) {
		this.replyLikeId = replyLikeId;
		this.isLike = isLike;
	}

	public Integer getReplyLikeId() {
		return replyLikeId;
	}

	public void setReplyLikeId(Integer replyLikeId) {
		this.replyLikeId = replyLikeId;
	}

	public boolean isLike() {
		return isLike;
	}

	public void setLike(boolean isLike) {
		this.isLike = isLike;
	}

	public TbDiscussionForumAnswereComment getReplyId() {
		return replyId;
	}

	public void setReplyId(TbDiscussionForumAnswereComment replyId) {
		this.replyId = replyId;
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
		hash += (replyLikeId != null ? replyLikeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RepliesLike)) {
			return false;
		}
		RepliesLike other = (RepliesLike) object;
		if ((this.replyLikeId == null && other.replyLikeId != null)
				|| (this.replyLikeId != null && !this.replyLikeId.equals(other.replyLikeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "javaapplication1.RepliesLike[ replyLikeId=" + replyLikeId + " ]";
	}

}

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
@Table(name = "comments_like")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CommentsLike.findAll", query = "SELECT c FROM CommentsLike c") })
public class CommentsLike implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "like_id")
	private Integer likeId;
	@Basic(optional = false)
	@Column(name = "comment_like_value")
	private short commentLikeValue;
	@JoinColumn(name = "user_id", referencedColumnName = "Physician_Id")
	@ManyToOne(optional = false)
	private Physician userId;
	@JoinColumn(name = "comments_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private TbDiscussionForumAnswere commentsId;

	public CommentsLike() {
	}

	public CommentsLike(Integer likeId) {
		this.likeId = likeId;
	}

	public CommentsLike(Integer likeId, short commentLikeValue) {
		this.likeId = likeId;
		this.commentLikeValue = commentLikeValue;
	}

	public Integer getLikeId() {
		return likeId;
	}

	public void setLikeId(Integer likeId) {
		this.likeId = likeId;
	}

	public short getCommentLikeValue() {
		return commentLikeValue;
	}

	public void setCommentLikeValue(short commentLikeValue) {
		this.commentLikeValue = commentLikeValue;
	}

	public Physician getUserId() {
		return userId;
	}

	public void setUserId(Physician userId) {
		this.userId = userId;
	}

	public TbDiscussionForumAnswere getCommentsId() {
		return commentsId;
	}

	public void setCommentsId(TbDiscussionForumAnswere commentsId) {
		this.commentsId = commentsId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (likeId != null ? likeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CommentsLike)) {
			return false;
		}
		CommentsLike other = (CommentsLike) object;
		if ((this.likeId == null && other.likeId != null)
				|| (this.likeId != null && !this.likeId.equals(other.likeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CommentsLike[ likeId=" + likeId + " ]";
	}

}

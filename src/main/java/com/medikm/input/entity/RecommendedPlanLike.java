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

/**
 *
 * @author vinod 1
 */
@Entity
@Table(name = "recommended_plan_like")
@NamedQueries({ @NamedQuery(name = "RecommendedPlanLike.findAll", query = "SELECT r FROM RecommendedPlanLike r"),
		@NamedQuery(name = "RecommendedPlanLike.findById", query = "SELECT r FROM RecommendedPlanLike r WHERE r.id = :id"),
		@NamedQuery(name = "RecommendedPlanLike.findByLikeValue", query = "SELECT r FROM RecommendedPlanLike r WHERE r.likeValue = :likeValue") })
public class RecommendedPlanLike implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Basic(optional = false)
	@Column(name = "like_value")
	private short likeValue;
	@JoinColumn(name = "physicianId", referencedColumnName = "Physician_Id")
	@ManyToOne(optional = false)
	private Physician physician;
	@JoinColumn(name = "TB_Discussion_Id", referencedColumnName = "TB_Discussion_Id")
	@ManyToOne(optional = false)
	private TbDiscussionForum tbDiscussionForum;
	@Column(name = "creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	@Column(name = "modification_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificationDate;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public RecommendedPlanLike() {
	}

	public RecommendedPlanLike(Integer id) {
		this.id = id;
	}

	public RecommendedPlanLike(Integer id, short likeValue) {
		this.id = id;
		this.likeValue = likeValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public short getLikeValue() {
		return likeValue;
	}

	public void setLikeValue(short likeValue) {
		this.likeValue = likeValue;
	}

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public TbDiscussionForum getTbDiscussionForum() {
		return tbDiscussionForum;
	}

	public void setTbDiscussionForum(TbDiscussionForum tbDiscussionForum) {
		this.tbDiscussionForum = tbDiscussionForum;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RecommendedPlanLike)) {
			return false;
		}
		RecommendedPlanLike other = (RecommendedPlanLike) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.RecommendedPlanLike[id=" + id + "]";
	}

}

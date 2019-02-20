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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Monika
 */
@Entity
@Table(name = "reason_for_presentation")
@NamedQueries({ @NamedQuery(name = "ReasonForPresentation.findAll", query = "SELECT r FROM ReasonForPresentation r"),
		@NamedQuery(name = "ReasonForPresentation.findByTypeId", query = "SELECT r FROM ReasonForPresentation r WHERE r.typeId = :typeId"),
		@NamedQuery(name = "ReasonForPresentation.findByReason", query = "SELECT r FROM ReasonForPresentation r WHERE r.reason = :reason") })
public class ReasonForPresentation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Column(name = "reason")
	private String reason;

	public ReasonForPresentation() {
	}

	public ReasonForPresentation(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ReasonForPresentation)) {
			return false;
		}
		ReasonForPresentation other = (ReasonForPresentation) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ReasonForPresentation[typeId=" + typeId + "]";
	}

}

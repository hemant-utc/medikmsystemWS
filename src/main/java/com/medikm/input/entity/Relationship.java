/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "relationship")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Relationship.findAll", query = "SELECT r FROM Relationship r") })
public class Relationship implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "Relation")
	private String relation;
	@OneToMany(mappedBy = "relationship")
	private Collection<RelativeDetails> relativeDetailsCollection;

	public Relationship() {
	}

	public Relationship(Integer typeId) {
		this.typeId = typeId;
	}

	public Relationship(Integer typeId, String relation) {
		this.typeId = typeId;
		this.relation = relation;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@XmlTransient
	public Collection<RelativeDetails> getRelativeDetailsCollection() {
		return relativeDetailsCollection;
	}

	public void setRelativeDetailsCollection(Collection<RelativeDetails> relativeDetailsCollection) {
		this.relativeDetailsCollection = relativeDetailsCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Relationship)) {
			return false;
		}
		Relationship other = (Relationship) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Relationship[ typeId=" + typeId + " ]";
	}

}

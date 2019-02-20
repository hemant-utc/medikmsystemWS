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
@Table(name = "gemonics")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Gemonics.findAll", query = "SELECT g FROM Gemonics g") })
public class Gemonics implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Id")
	private Integer id;
	@Basic(optional = false)
	@Column(name = "GName")
	private String gName;
	@OneToMany(mappedBy = "genomics")
	private Collection<Case1> case1Collection;
	@OneToMany(mappedBy = "gemonics")
	private Collection<RelativeDetails> relativeDetailsCollection;

	public Gemonics() {
	}

	public Gemonics(Integer id) {
		this.id = id;
	}

	public Gemonics(Integer id, String gName) {
		this.id = id;
		this.gName = gName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGName() {
		return gName;
	}

	public void setGName(String gName) {
		this.gName = gName;
	}

	@XmlTransient
	public Collection<Case1> getCase1Collection() {
		return case1Collection;
	}

	public void setCase1Collection(Collection<Case1> case1Collection) {
		this.case1Collection = case1Collection;
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
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Gemonics)) {
			return false;
		}
		Gemonics other = (Gemonics) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Gemonics[ id=" + id + " ]";
	}

}

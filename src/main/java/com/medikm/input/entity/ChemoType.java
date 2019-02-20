/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "chemo_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ChemoType.findAll", query = "SELECT c FROM ChemoType c") })
public class ChemoType implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "ChName")
	private String chName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "chemoType")
	private Collection<Chemotherapy> chemotherapyCollection;

	public ChemoType() {
	}

	public ChemoType(Integer typeId) {
		this.typeId = typeId;
	}

	public ChemoType(Integer typeId, String chName) {
		this.typeId = typeId;
		this.chName = chName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	@XmlTransient
	public Collection<Chemotherapy> getChemotherapyCollection() {
		return chemotherapyCollection;
	}

	public void setChemotherapyCollection(Collection<Chemotherapy> chemotherapyCollection) {
		this.chemotherapyCollection = chemotherapyCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ChemoType)) {
			return false;
		}
		ChemoType other = (ChemoType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ChemoType[ typeId=" + typeId + " ]";
	}

}

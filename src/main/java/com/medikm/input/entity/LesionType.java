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
@Table(name = "lesion_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "LesionType.findAll", query = "SELECT l FROM LesionType l") })
public class LesionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "LName")
	private String lName;
	@OneToMany(mappedBy = "lesionType")
	private Collection<Biopsy> biopsyCollection;

	public LesionType() {
	}

	public LesionType(Integer typeId) {
		this.typeId = typeId;
	}

	public LesionType(Integer typeId, String lName) {
		this.typeId = typeId;
		this.lName = lName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getLName() {
		return lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	@XmlTransient
	public Collection<Biopsy> getBiopsyCollection() {
		return biopsyCollection;
	}

	public void setBiopsyCollection(Collection<Biopsy> biopsyCollection) {
		this.biopsyCollection = biopsyCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof LesionType)) {
			return false;
		}
		LesionType other = (LesionType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.LesionType[ typeId=" + typeId + " ]";
	}

}

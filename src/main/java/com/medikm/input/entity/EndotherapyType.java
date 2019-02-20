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
@Table(name = "endotherapy_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EndotherapyType.findAll", query = "SELECT e FROM EndotherapyType e") })
public class EndotherapyType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "ETName")
	private String eTName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "endotherapyType")
	private Collection<EndocrineTherapy> endocrineTherapyCollection;

	public EndotherapyType() {
	}

	public EndotherapyType(Integer typeId) {
		this.typeId = typeId;
	}

	public EndotherapyType(Integer typeId, String eTName) {
		this.typeId = typeId;
		this.eTName = eTName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getETName() {
		return eTName;
	}

	public void setETName(String eTName) {
		this.eTName = eTName;
	}

	@XmlTransient
	public Collection<EndocrineTherapy> getEndocrineTherapyCollection() {
		return endocrineTherapyCollection;
	}

	public void setEndocrineTherapyCollection(Collection<EndocrineTherapy> endocrineTherapyCollection) {
		this.endocrineTherapyCollection = endocrineTherapyCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EndotherapyType)) {
			return false;
		}
		EndotherapyType other = (EndotherapyType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EndotherapyType[ typeId=" + typeId + " ]";
	}

}

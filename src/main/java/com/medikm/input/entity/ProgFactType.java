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
@Table(name = "prog_fact_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ProgFactType.findAll", query = "SELECT p FROM ProgFactType p") })
public class ProgFactType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "PFName")
	private String pFName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "progFactType")
	private Collection<PrognosticFactor> prognosticFactorCollection;

	public ProgFactType() {
	}

	public ProgFactType(Integer typeId) {
		this.typeId = typeId;
	}

	public ProgFactType(Integer typeId, String pFName) {
		this.typeId = typeId;
		this.pFName = pFName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getPFName() {
		return pFName;
	}

	public void setPFName(String pFName) {
		this.pFName = pFName;
	}

	@XmlTransient
	public Collection<PrognosticFactor> getPrognosticFactorCollection() {
		return prognosticFactorCollection;
	}

	public void setPrognosticFactorCollection(Collection<PrognosticFactor> prognosticFactorCollection) {
		this.prognosticFactorCollection = prognosticFactorCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ProgFactType)) {
			return false;
		}
		ProgFactType other = (ProgFactType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ProgFactType[ typeId=" + typeId + " ]";
	}

}

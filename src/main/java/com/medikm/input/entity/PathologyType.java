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
@Table(name = "pathology_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "PathologyType.findAll", query = "SELECT p FROM PathologyType p") })
public class PathologyType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "PName")
	private String pName;
	@OneToMany(mappedBy = "pathologyType")
	private Collection<Pathology> pathologyCollection;

	public PathologyType() {
	}

	public PathologyType(Integer typeId) {
		this.typeId = typeId;
	}

	public PathologyType(Integer typeId, String pName) {
		this.typeId = typeId;
		this.pName = pName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getPName() {
		return pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	@XmlTransient
	public Collection<Pathology> getPathologyCollection() {
		return pathologyCollection;
	}

	public void setPathologyCollection(Collection<Pathology> pathologyCollection) {
		this.pathologyCollection = pathologyCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PathologyType)) {
			return false;
		}
		PathologyType other = (PathologyType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PathologyType[ typeId=" + typeId + " ]";
	}

}

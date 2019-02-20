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
@Table(name = "plastic_surgery_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "PlasticSurgeryType.findAll", query = "SELECT p FROM PlasticSurgeryType p") })
public class PlasticSurgeryType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "PSName")
	private String pSName;
	@OneToMany(mappedBy = "plasticSurgeryType")
	private Collection<Surgery> surgeryCollection;

	public PlasticSurgeryType() {
	}

	public PlasticSurgeryType(Integer typeId) {
		this.typeId = typeId;
	}

	public PlasticSurgeryType(Integer typeId, String pSName) {
		this.typeId = typeId;
		this.pSName = pSName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getPSName() {
		return pSName;
	}

	public void setPSName(String pSName) {
		this.pSName = pSName;
	}

	@XmlTransient
	public Collection<Surgery> getSurgeryCollection() {
		return surgeryCollection;
	}

	public void setSurgeryCollection(Collection<Surgery> surgeryCollection) {
		this.surgeryCollection = surgeryCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PlasticSurgeryType)) {
			return false;
		}
		PlasticSurgeryType other = (PlasticSurgeryType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PlasticSurgeryType[ typeId=" + typeId + " ]";
	}

}

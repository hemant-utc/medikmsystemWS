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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "surgery_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "SurgeryType.findAll", query = "SELECT s FROM SurgeryType s") })
public class SurgeryType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "SName")
	private String sName;
	@OneToMany(mappedBy = "surgeryTypeId")
	private Collection<Surgery> surgeryCollection;
	@JoinColumn(name = "Disease_Sub_Type_Id", referencedColumnName = "Disease_Sub_Type_Id")
	@ManyToOne
	private DiseaseSubType diseaseSubType;

	public DiseaseSubType getDiseaseSubType() {
		return diseaseSubType;
	}

	public void setDiseaseSubType(DiseaseSubType diseaseSubType) {
		this.diseaseSubType = diseaseSubType;
	}

	public SurgeryType() {
	}

	public SurgeryType(Integer typeId) {
		this.typeId = typeId;
	}

	public SurgeryType(Integer typeId, String sName) {
		this.typeId = typeId;
		this.sName = sName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String sName) {
		this.sName = sName;
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
		if (!(object instanceof SurgeryType)) {
			return false;
		}
		SurgeryType other = (SurgeryType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.SurgeryType[ typeId=" + typeId + " ]";
	}

}

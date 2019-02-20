/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Lms
 */
@Entity
@Table(name = "workup_kind_type")
@NamedQueries({ @NamedQuery(name = "WorkupKindType.findAll", query = "SELECT w FROM WorkupKindType w"),
		@NamedQuery(name = "WorkupKindType.findByTypeId", query = "SELECT w FROM WorkupKindType w WHERE w.typeId = :typeId"),
		@NamedQuery(name = "WorkupKindType.findByName", query = "SELECT w FROM WorkupKindType w WHERE w.name = :name") })
public class WorkupKindType implements Serializable, Comparable<WorkupKindType> {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "Name")
	private String name;
	@JoinColumn(name = "Ref_Id", referencedColumnName = "Type_Id")
	@ManyToOne(optional = false)
	private DxWkType dxWkType;
	@JoinColumn(name = "diseaseTypeId", referencedColumnName = "Disease_Type_Id")
	@ManyToOne(optional = false)
	private DiseaseType diseaseType;

	/**
	 * @return the diseaseType
	 */
	public DiseaseType getDiseaseType() {
		return diseaseType;
	}

	/**
	 * @param diseaseType
	 *            the diseaseType to set
	 */
	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	public WorkupKindType() {
	}

	public WorkupKindType(Integer typeId) {
		this.typeId = typeId;
	}

	public WorkupKindType(Integer typeId, String name) {
		this.typeId = typeId;
		this.name = name;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DxWkType getDxWkType() {
		return dxWkType;
	}

	public void setDxWkType(DxWkType dxWkType) {
		this.dxWkType = dxWkType;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof WorkupKindType)) {
			return false;
		}
		WorkupKindType other = (WorkupKindType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.WorkupKindType[typeId=" + typeId + "]";
	}

	public int compareTo(WorkupKindType o) {
		return this.getName().toLowerCase().compareTo(o.getName().toLowerCase());
	}

}

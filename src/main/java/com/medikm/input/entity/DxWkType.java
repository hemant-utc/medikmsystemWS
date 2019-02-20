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

/**
 *
 * @author Lms
 */
@Entity
@Table(name = "dx_wk_type")
@NamedQueries({ @NamedQuery(name = "DxWkType.findAll", query = "SELECT d FROM DxWkType d"),
		@NamedQuery(name = "DxWkType.findByTypeId", query = "SELECT d FROM DxWkType d WHERE d.typeId = :typeId"),
		@NamedQuery(name = "DxWkType.findByDxName", query = "SELECT d FROM DxWkType d WHERE d.dxName = :dxName") })
public class DxWkType implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "DxName")
	private String dxName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dxWkType")
	private Collection<WorkupKindType> workupKindTypeCollection;

	public DxWkType() {
	}

	public DxWkType(Integer typeId) {
		this.typeId = typeId;
	}

	public DxWkType(Integer typeId, String dxName) {
		this.typeId = typeId;
		this.dxName = dxName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getDxName() {
		return dxName;
	}

	public void setDxName(String dxName) {
		this.dxName = dxName;
	}

	public Collection<WorkupKindType> getWorkupKindTypeCollection() {
		return workupKindTypeCollection;
	}

	public void setWorkupKindTypeCollection(Collection<WorkupKindType> workupKindTypeCollection) {
		this.workupKindTypeCollection = workupKindTypeCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DxWkType)) {
			return false;
		}
		DxWkType other = (DxWkType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.DxWkType[typeId=" + typeId + "]";
	}

}

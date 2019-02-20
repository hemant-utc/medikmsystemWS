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
@Table(name = "chest_wall_rad_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ChestWallRadType.findAll", query = "SELECT c FROM ChestWallRadType c") })
public class ChestWallRadType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "CwName")
	private String cwName;
	@OneToMany(mappedBy = "chestWallRadTypeId")
	private Collection<RadiationTherapy> radiationTherapyCollection;

	public ChestWallRadType() {
	}

	public ChestWallRadType(Integer typeId) {
		this.typeId = typeId;
	}

	public ChestWallRadType(Integer typeId, String cwName) {
		this.typeId = typeId;
		this.cwName = cwName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getCwName() {
		return cwName;
	}

	public void setCwName(String cwName) {
		this.cwName = cwName;
	}

	@XmlTransient
	public Collection<RadiationTherapy> getRadiationTherapyCollection() {
		return radiationTherapyCollection;
	}

	public void setRadiationTherapyCollection(Collection<RadiationTherapy> radiationTherapyCollection) {
		this.radiationTherapyCollection = radiationTherapyCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ChestWallRadType)) {
			return false;
		}
		ChestWallRadType other = (ChestWallRadType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ChestWallRadType[ typeId=" + typeId + " ]";
	}

}

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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "nqmbc_level")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "NqmbcLevel.findAll", query = "SELECT n FROM NqmbcLevel n") })
public class NqmbcLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Level_Id")
	private Integer levelId;
	@Basic(optional = false)
	@Column(name = "LName")
	private String lName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "nQMBCCertiificationLevelId")
	private Collection<CareFacility> careFacilityCollection;

	public NqmbcLevel() {
	}

	public NqmbcLevel(Integer levelId) {
		this.levelId = levelId;
	}

	public NqmbcLevel(Integer levelId, String lName) {
		this.levelId = levelId;
		this.lName = lName;
	}

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public String getLName() {
		return lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	@XmlTransient
	public Collection<CareFacility> getCareFacilityCollection() {
		return careFacilityCollection;
	}

	public void setCareFacilityCollection(Collection<CareFacility> careFacilityCollection) {
		this.careFacilityCollection = careFacilityCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (levelId != null ? levelId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof NqmbcLevel)) {
			return false;
		}
		NqmbcLevel other = (NqmbcLevel) object;
		if ((this.levelId == null && other.levelId != null)
				|| (this.levelId != null && !this.levelId.equals(other.levelId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.NqmbcLevel[ levelId=" + levelId + " ]";
	}

}

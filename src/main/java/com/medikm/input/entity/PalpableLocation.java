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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "palpable_location")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "PalpableLocation.findAll", query = "SELECT p FROM PalpableLocation p") })
public class PalpableLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "LocationId")
	private Integer locationId;
	@Basic(optional = false)
	@Column(name = "Name")
	private String name;

	public PalpableLocation() {
	}

	public PalpableLocation(Integer locationId) {
		this.locationId = locationId;
	}

	public PalpableLocation(Integer locationId, String name) {
		this.locationId = locationId;
		this.name = name;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (locationId != null ? locationId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PalpableLocation)) {
			return false;
		}
		PalpableLocation other = (PalpableLocation) object;
		if ((this.locationId == null && other.locationId != null)
				|| (this.locationId != null && !this.locationId.equals(other.locationId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PalpableLocation[ locationId=" + locationId + " ]";
	}

}

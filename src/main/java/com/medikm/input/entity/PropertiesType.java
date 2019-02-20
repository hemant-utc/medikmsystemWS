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
@Table(name = "properties_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "PropertiesType.findAll", query = "SELECT p FROM PropertiesType p") })
public class PropertiesType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "properties_type_Id")
	private Integer propertiestypeId;
	@Column(name = "prop_type")
	private String propType;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "propertiestypeId")
	private Collection<UserPropertiesInfo> userPropertiesInfoCollection;

	public PropertiesType() {
	}

	public PropertiesType(Integer propertiestypeId) {
		this.propertiestypeId = propertiestypeId;
	}

	public Integer getPropertiestypeId() {
		return propertiestypeId;
	}

	public void setPropertiestypeId(Integer propertiestypeId) {
		this.propertiestypeId = propertiestypeId;
	}

	public String getPropType() {
		return propType;
	}

	public void setPropType(String propType) {
		this.propType = propType;
	}

	@XmlTransient
	public Collection<UserPropertiesInfo> getUserPropertiesInfoCollection() {
		return userPropertiesInfoCollection;
	}

	public void setUserPropertiesInfoCollection(Collection<UserPropertiesInfo> userPropertiesInfoCollection) {
		this.userPropertiesInfoCollection = userPropertiesInfoCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (propertiestypeId != null ? propertiestypeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PropertiesType)) {
			return false;
		}
		PropertiesType other = (PropertiesType) object;
		if ((this.propertiestypeId == null && other.propertiestypeId != null)
				|| (this.propertiestypeId != null && !this.propertiestypeId.equals(other.propertiestypeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PropertiesType[ propertiestypeId=" + propertiestypeId + " ]";
	}

}

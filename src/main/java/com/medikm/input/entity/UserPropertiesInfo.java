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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "user_properties_info")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "UserPropertiesInfo.findAll", query = "SELECT u FROM UserPropertiesInfo u") })
public class UserPropertiesInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "user_property_info_Id")
	private Integer userpropertyinfoId;
	@JoinColumn(name = "user_Id", referencedColumnName = "LoginId")
	@ManyToOne(optional = false)
	private User userId;
	@JoinColumn(name = "properties_type_Id", referencedColumnName = "properties_type_Id")
	@ManyToOne(optional = false)
	private PropertiesType propertiestypeId;
	@OneToMany(mappedBy = "userpropertyinfoId")
	private Collection<User> userCollection;

	public UserPropertiesInfo() {
	}

	public UserPropertiesInfo(Integer userpropertyinfoId) {
		this.userpropertyinfoId = userpropertyinfoId;
	}

	public Integer getUserpropertyinfoId() {
		return userpropertyinfoId;
	}

	public void setUserpropertyinfoId(Integer userpropertyinfoId) {
		this.userpropertyinfoId = userpropertyinfoId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public PropertiesType getPropertiestypeId() {
		return propertiestypeId;
	}

	public void setPropertiestypeId(PropertiesType propertiestypeId) {
		this.propertiestypeId = propertiestypeId;
	}

	@XmlTransient
	public Collection<User> getUserCollection() {
		return userCollection;
	}

	public void setUserCollection(Collection<User> userCollection) {
		this.userCollection = userCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (userpropertyinfoId != null ? userpropertyinfoId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof UserPropertiesInfo)) {
			return false;
		}
		UserPropertiesInfo other = (UserPropertiesInfo) object;
		if ((this.userpropertyinfoId == null && other.userpropertyinfoId != null)
				|| (this.userpropertyinfoId != null && !this.userpropertyinfoId.equals(other.userpropertyinfoId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.UserPropertiesInfo[ userpropertyinfoId=" + userpropertyinfoId + " ]";
	}

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "resource_temp")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ResourceTemp.findAll", query = "SELECT r FROM ResourceTemp r") })
public class ResourceTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Resourse_Id")
	private Integer resourseId;
	@Basic(optional = false)
	@Column(name = "Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	public ResourceTemp() {
	}

	public ResourceTemp(Integer resourseId) {
		this.resourseId = resourseId;
	}

	public ResourceTemp(Integer resourseId, Date date) {
		this.resourseId = resourseId;
		this.date = date;
	}

	public Integer getResourseId() {
		return resourseId;
	}

	public void setResourseId(Integer resourseId) {
		this.resourseId = resourseId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (resourseId != null ? resourseId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ResourceTemp)) {
			return false;
		}
		ResourceTemp other = (ResourceTemp) object;
		if ((this.resourseId == null && other.resourseId != null)
				|| (this.resourseId != null && !this.resourseId.equals(other.resourseId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ResourceTemp[ resourseId=" + resourseId + " ]";
	}

}

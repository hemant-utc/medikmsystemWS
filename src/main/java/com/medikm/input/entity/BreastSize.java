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
@Table(name = "breast_size")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "BreastSize.findAll", query = "SELECT b FROM BreastSize b") })
public class BreastSize implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Id")
	private Integer id;
	@Basic(optional = false)
	@Column(name = "BSize")
	private String bSize;

	public BreastSize() {
	}

	public BreastSize(Integer id) {
		this.id = id;
	}

	public BreastSize(Integer id, String bSize) {
		this.id = id;
		this.bSize = bSize;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBSize() {
		return bSize;
	}

	public void setBSize(String bSize) {
		this.bSize = bSize;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof BreastSize)) {
			return false;
		}
		BreastSize other = (BreastSize) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.BreastSize[ id=" + id + " ]";
	}

}

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
@Table(name = "functionalstatus")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Functionalstatus.findAll", query = "SELECT f FROM Functionalstatus f") })
public class Functionalstatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Id")
	private Integer id;
	@Basic(optional = false)
	@Column(name = "Status")
	private String status;
	@OneToMany(mappedBy = "functionalStatus")
	private Collection<Patient> patientCollection;

	public Functionalstatus() {
	}

	public Functionalstatus(Integer id) {
		this.id = id;
	}

	public Functionalstatus(Integer id, String status) {
		this.id = id;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@XmlTransient
	public Collection<Patient> getPatientCollection() {
		return patientCollection;
	}

	public void setPatientCollection(Collection<Patient> patientCollection) {
		this.patientCollection = patientCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Functionalstatus)) {
			return false;
		}
		Functionalstatus other = (Functionalstatus) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Functionalstatus[ id=" + id + " ]";
	}

}

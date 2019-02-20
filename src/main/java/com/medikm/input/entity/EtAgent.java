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
@Table(name = "et_agent")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EtAgent.findAll", query = "SELECT e FROM EtAgent e") })
public class EtAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "AName")
	private String aName;
	@OneToMany(mappedBy = "agentId")
	private Collection<EndocrineTherapy> endocrineTherapyCollection;

	public EtAgent() {
	}

	public EtAgent(Integer typeId) {
		this.typeId = typeId;
	}

	public EtAgent(Integer typeId, String aName) {
		this.typeId = typeId;
		this.aName = aName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getAName() {
		return aName;
	}

	public void setAName(String aName) {
		this.aName = aName;
	}

	@XmlTransient
	public Collection<EndocrineTherapy> getEndocrineTherapyCollection() {
		return endocrineTherapyCollection;
	}

	public void setEndocrineTherapyCollection(Collection<EndocrineTherapy> endocrineTherapyCollection) {
		this.endocrineTherapyCollection = endocrineTherapyCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EtAgent)) {
			return false;
		}
		EtAgent other = (EtAgent) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.EtAgent[ typeId=" + typeId + " ]";
	}

}

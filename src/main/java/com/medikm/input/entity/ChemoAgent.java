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
@Table(name = "chemo_agent")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ChemoAgent.findAll", query = "SELECT c FROM ChemoAgent c") })
public class ChemoAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Agent_Id")
	private Integer agentId;
	@Basic(optional = false)
	@Column(name = "AName")
	private String aName;
	@OneToMany(mappedBy = "ctpyAgentId")
	private Collection<Chemotherapy> chemotherapyCollection;

	public ChemoAgent() {
	}

	public ChemoAgent(Integer agentId) {
		this.agentId = agentId;
	}

	public ChemoAgent(Integer agentId, String aName) {
		this.agentId = agentId;
		this.aName = aName;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getAName() {
		return aName;
	}

	public void setAName(String aName) {
		this.aName = aName;
	}

	@XmlTransient
	public Collection<Chemotherapy> getChemotherapyCollection() {
		return chemotherapyCollection;
	}

	public void setChemotherapyCollection(Collection<Chemotherapy> chemotherapyCollection) {
		this.chemotherapyCollection = chemotherapyCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (agentId != null ? agentId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ChemoAgent)) {
			return false;
		}
		ChemoAgent other = (ChemoAgent) object;
		if ((this.agentId == null && other.agentId != null)
				|| (this.agentId != null && !this.agentId.equals(other.agentId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ChemoAgent[ agentId=" + agentId + " ]";
	}

}

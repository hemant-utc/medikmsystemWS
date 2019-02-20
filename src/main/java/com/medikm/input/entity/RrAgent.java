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
@Table(name = "rr_agent")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "RrAgent.findAll", query = "SELECT r FROM RrAgent r") })
public class RrAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Agent_Id")
	private Integer agentId;
	@Basic(optional = false)
	@Column(name = "AName")
	private String aName;
	@OneToMany(mappedBy = "riskReductionAgentId")
	private Collection<RiskReduction> riskReductionCollection;

	public RrAgent() {
	}

	public RrAgent(Integer agentId) {
		this.agentId = agentId;
	}

	public RrAgent(Integer agentId, String aName) {
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
	public Collection<RiskReduction> getRiskReductionCollection() {
		return riskReductionCollection;
	}

	public void setRiskReductionCollection(Collection<RiskReduction> riskReductionCollection) {
		this.riskReductionCollection = riskReductionCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (agentId != null ? agentId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RrAgent)) {
			return false;
		}
		RrAgent other = (RrAgent) object;
		if ((this.agentId == null && other.agentId != null)
				|| (this.agentId != null && !this.agentId.equals(other.agentId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.RrAgent[ agentId=" + agentId + " ]";
	}

}

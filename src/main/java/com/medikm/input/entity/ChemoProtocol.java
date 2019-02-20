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
@Table(name = "chemo_protocol")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ChemoProtocol.findAll", query = "SELECT c FROM ChemoProtocol c") })
public class ChemoProtocol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Protocol_Id")
	private Integer protocolId;
	@Basic(optional = false)
	@Column(name = "PName")
	private String pName;
	@OneToMany(mappedBy = "ctpyProtocolId")
	private Collection<Chemotherapy> chemotherapyCollection;

	public ChemoProtocol() {
	}

	public ChemoProtocol(Integer protocolId) {
		this.protocolId = protocolId;
	}

	public ChemoProtocol(Integer protocolId, String pName) {
		this.protocolId = protocolId;
		this.pName = pName;
	}

	public Integer getProtocolId() {
		return protocolId;
	}

	public void setProtocolId(Integer protocolId) {
		this.protocolId = protocolId;
	}

	public String getPName() {
		return pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
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
		hash += (protocolId != null ? protocolId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ChemoProtocol)) {
			return false;
		}
		ChemoProtocol other = (ChemoProtocol) object;
		if ((this.protocolId == null && other.protocolId != null)
				|| (this.protocolId != null && !this.protocolId.equals(other.protocolId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.ChemoProtocol[ protocolId=" + protocolId + " ]";
	}

}

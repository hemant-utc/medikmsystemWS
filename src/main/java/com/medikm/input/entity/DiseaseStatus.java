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
@Table(name = "disease_status")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "DiseaseStatus.findAll", query = "SELECT d FROM DiseaseStatus d") })
public class DiseaseStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "DName")
	private String dName;
	@OneToMany(mappedBy = "diseaseType")
	private Collection<Episode> episodeCollection;

	public DiseaseStatus() {
	}

	public DiseaseStatus(Integer typeId) {
		this.typeId = typeId;
	}

	public DiseaseStatus(Integer typeId, String dName) {
		this.typeId = typeId;
		this.dName = dName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getDName() {
		return dName;
	}

	public void setDName(String dName) {
		this.dName = dName;
	}

	@XmlTransient
	public Collection<Episode> getEpisodeCollection() {
		return episodeCollection;
	}

	public void setEpisodeCollection(Collection<Episode> episodeCollection) {
		this.episodeCollection = episodeCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DiseaseStatus)) {
			return false;
		}
		DiseaseStatus other = (DiseaseStatus) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.DiseaseStatus[ typeId=" + typeId + " ]";
	}

}

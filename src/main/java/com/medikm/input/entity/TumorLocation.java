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
import javax.persistence.FetchType;
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
 * @author Rohit Patel
 */
@Entity
@Table(name = "tumor_location")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TumorLocation.findAll", query = "SELECT t FROM TumorLocation t"),
		@NamedQuery(name = "TumorLocation.findByTumorLocationId", query = "SELECT t FROM TumorLocation t WHERE t.tumorLocationId = :tumorLocationId"),
		@NamedQuery(name = "TumorLocation.findByTumorLocationName", query = "SELECT t FROM TumorLocation t WHERE t.tumorLocationName = :tumorLocationName") })
public class TumorLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "tumor_Location_Id")
	private Integer tumorLocationId;
	@Column(name = "tumor_Location_Name")
	private String tumorLocationName;
	@OneToMany(mappedBy = "tumorLocation", fetch = FetchType.EAGER)
	private Collection<Case1> case1Collection;
	@JoinColumn(name = "Disease_Type_Id", referencedColumnName = "Disease_Type_Id")
	@ManyToOne(fetch = FetchType.EAGER)
	private DiseaseType diseaseTypeId;
	@JoinColumn(name = "Disease_Sub_Type_Id", referencedColumnName = "Disease_Sub_Type_Id")
	@ManyToOne(fetch = FetchType.EAGER)
	private DiseaseSubType diseaseSubTypeId;

	public TumorLocation() {
	}

	public TumorLocation(Integer tumorLocationId) {
		this.tumorLocationId = tumorLocationId;
	}

	public Integer getTumorLocationId() {
		return tumorLocationId;
	}

	public void setTumorLocationId(Integer tumorLocationId) {
		this.tumorLocationId = tumorLocationId;
	}

	public String getTumorLocationName() {
		return tumorLocationName;
	}

	public void setTumorLocationName(String tumorLocationName) {
		this.tumorLocationName = tumorLocationName;
	}

	@XmlTransient
	public Collection<Case1> getCase1Collection() {
		return case1Collection;
	}

	public void setCase1Collection(Collection<Case1> case1Collection) {
		this.case1Collection = case1Collection;
	}

	public DiseaseType getDiseaseTypeId() {
		return diseaseTypeId;
	}

	public void setDiseaseTypeId(DiseaseType diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	public DiseaseSubType getDiseaseSubTypeId() {
		return diseaseSubTypeId;
	}

	public void setDiseaseSubTypeId(DiseaseSubType diseaseSubTypeId) {
		this.diseaseSubTypeId = diseaseSubTypeId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tumorLocationId != null ? tumorLocationId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TumorLocation)) {
			return false;
		}
		TumorLocation other = (TumorLocation) object;
		if ((this.tumorLocationId == null && other.tumorLocationId != null)
				|| (this.tumorLocationId != null && !this.tumorLocationId.equals(other.tumorLocationId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.TumorLocation[ tumorLocationId=" + tumorLocationId + " ]";
	}

}

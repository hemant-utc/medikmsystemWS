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
@Table(name = "tnm_stage")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TnmStage.findAll", query = "SELECT t FROM TnmStage t") })
public class TnmStage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Stage_Id")
	private Integer stageId;
	@Basic(optional = false)
	@Column(name = "Value")
	private String value;
	@OneToMany(mappedBy = "finalTNMStageId")
	private Collection<Case1> case1Collection;
	@OneToMany(mappedBy = "workingTNMStageId")
	private Collection<Case1> case1Collection1;
	@OneToMany(mappedBy = "prCaWorkingTNM")
	private Collection<PersonalMedicalHistory> personalMedicalHistoryCollection;
	@OneToMany(mappedBy = "prCaTNM")
	private Collection<PersonalMedicalHistory> personalMedicalHistoryCollection1;
	@OneToMany(mappedBy = "episodeTNMStage")
	private Collection<CancerStage> cancerStageCollection;
	@OneToMany(mappedBy = "workingTNMStage")
	private Collection<CancerStage> cancerStageCollection1;

	public TnmStage() {
	}

	public TnmStage(Integer stageId) {
		this.stageId = stageId;
	}

	public TnmStage(Integer stageId, String value) {
		this.stageId = stageId;
		this.value = value;
	}

	public Integer getStageId() {
		return stageId;
	}

	public void setStageId(Integer stageId) {
		this.stageId = stageId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@XmlTransient
	public Collection<Case1> getCase1Collection() {
		return case1Collection;
	}

	public void setCase1Collection(Collection<Case1> case1Collection) {
		this.case1Collection = case1Collection;
	}

	@XmlTransient
	public Collection<Case1> getCase1Collection1() {
		return case1Collection1;
	}

	public void setCase1Collection1(Collection<Case1> case1Collection1) {
		this.case1Collection1 = case1Collection1;
	}

	@XmlTransient
	public Collection<PersonalMedicalHistory> getPersonalMedicalHistoryCollection() {
		return personalMedicalHistoryCollection;
	}

	public void setPersonalMedicalHistoryCollection(
			Collection<PersonalMedicalHistory> personalMedicalHistoryCollection) {
		this.personalMedicalHistoryCollection = personalMedicalHistoryCollection;
	}

	@XmlTransient
	public Collection<PersonalMedicalHistory> getPersonalMedicalHistoryCollection1() {
		return personalMedicalHistoryCollection1;
	}

	public void setPersonalMedicalHistoryCollection1(
			Collection<PersonalMedicalHistory> personalMedicalHistoryCollection1) {
		this.personalMedicalHistoryCollection1 = personalMedicalHistoryCollection1;
	}

	@XmlTransient
	public Collection<CancerStage> getCancerStageCollection() {
		return cancerStageCollection;
	}

	public void setCancerStageCollection(Collection<CancerStage> cancerStageCollection) {
		this.cancerStageCollection = cancerStageCollection;
	}

	@XmlTransient
	public Collection<CancerStage> getCancerStageCollection1() {
		return cancerStageCollection1;
	}

	public void setCancerStageCollection1(Collection<CancerStage> cancerStageCollection1) {
		this.cancerStageCollection1 = cancerStageCollection1;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (stageId != null ? stageId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TnmStage)) {
			return false;
		}
		TnmStage other = (TnmStage) object;
		if ((this.stageId == null && other.stageId != null)
				|| (this.stageId != null && !this.stageId.equals(other.stageId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TnmStage[ stageId=" + stageId + " ]";
	}

}

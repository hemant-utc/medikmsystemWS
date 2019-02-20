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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dhiraj Singh
 */
@Entity
@Table(name = "disease_sub_type")
@XmlRootElement
public class DiseaseSubType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Disease_Sub_Type_Id")
	private Integer diseaseSubTypeId;
	@Column(name = "Disease_Sub_Name")
	private String diseaseSubName;
	@Column(name = "Creation_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;
	@Column(name = "Modifcation_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifcationTime;
	@JoinColumn(name = "Disease_Type_Id", referencedColumnName = "Disease_Type_Id")
	@ManyToOne
	private DiseaseType diseaseTypeId;

	public DiseaseSubType() {
	}

	public DiseaseSubType(Integer diseaseSubTypeId) {
		this.diseaseSubTypeId = diseaseSubTypeId;
	}

	public Integer getDiseaseSubTypeId() {
		return diseaseSubTypeId;
	}

	public void setDiseaseSubTypeId(Integer diseaseSubTypeId) {
		this.diseaseSubTypeId = diseaseSubTypeId;
	}

	public String getDiseaseSubName() {
		return diseaseSubName;
	}

	public void setDiseaseSubName(String diseaseSubName) {
		this.diseaseSubName = diseaseSubName;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getModifcationTime() {
		return modifcationTime;
	}

	public void setModifcationTime(Date modifcationTime) {
		this.modifcationTime = modifcationTime;
	}

	public DiseaseType getDiseaseTypeId() {
		return diseaseTypeId;
	}

	public void setDiseaseTypeId(DiseaseType diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (diseaseSubTypeId != null ? diseaseSubTypeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DiseaseSubType)) {
			return false;
		}
		DiseaseSubType other = (DiseaseSubType) object;
		if ((this.diseaseSubTypeId == null && other.diseaseSubTypeId != null)
				|| (this.diseaseSubTypeId != null && !this.diseaseSubTypeId.equals(other.diseaseSubTypeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "medikm.DiseaseSubType[ diseaseSubTypeId=" + diseaseSubTypeId + " ]";
	}

}

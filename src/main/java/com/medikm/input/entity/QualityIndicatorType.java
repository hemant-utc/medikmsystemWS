/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author ROHITPATEL
 */
@Entity
@Table(name = "quality_indicator_type")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "QualityIndicatorType.findAll", query = "SELECT q FROM QualityIndicatorType q"),
		@NamedQuery(name = "QualityIndicatorType.findByTypeId", query = "SELECT q FROM QualityIndicatorType q WHERE q.typeId = :typeId"),
		@NamedQuery(name = "QualityIndicatorType.findByIndicatorName", query = "SELECT q FROM QualityIndicatorType q WHERE q.indicatorName = :indicatorName") })
public class QualityIndicatorType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "type_Id")
	private Integer typeId;
	@Basic(optional = false)
	@Column(name = "indicator_name")
	private String indicatorName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "indicatorType")
	private Collection<QualityIndicator> qualityIndicatorCollection;

	public QualityIndicatorType() {
	}

	public QualityIndicatorType(Integer typeId) {
		this.typeId = typeId;
	}

	public QualityIndicatorType(Integer typeId, String indicatorName) {
		this.typeId = typeId;
		this.indicatorName = indicatorName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getIndicatorName() {
		return indicatorName;
	}

	public void setIndicatorName(String indicatorName) {
		this.indicatorName = indicatorName;
	}

	@XmlTransient
	public Collection<QualityIndicator> getQualityIndicatorCollection() {
		return qualityIndicatorCollection;
	}

	public void setQualityIndicatorCollection(Collection<QualityIndicator> qualityIndicatorCollection) {
		this.qualityIndicatorCollection = qualityIndicatorCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (typeId != null ? typeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof QualityIndicatorType)) {
			return false;
		}
		QualityIndicatorType other = (QualityIndicatorType) object;
		if ((this.typeId == null && other.typeId != null)
				|| (this.typeId != null && !this.typeId.equals(other.typeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.QualityIndicatorType[ typeId=" + typeId + " ]";
	}

}

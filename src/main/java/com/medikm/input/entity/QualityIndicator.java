/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ROHITPATEL
 */
@Entity
@Table(name = "quality_indicator")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "QualityIndicator.findAll", query = "SELECT q FROM QualityIndicator q"),
		@NamedQuery(name = "QualityIndicator.findById", query = "SELECT q FROM QualityIndicator q WHERE q.id = :id"),
		@NamedQuery(name = "QualityIndicator.findByDescription", query = "SELECT q FROM QualityIndicator q WHERE q.description = :description"),
		@NamedQuery(name = "QualityIndicator.findByOption1", query = "SELECT q FROM QualityIndicator q WHERE q.option1 = :option1"),
		@NamedQuery(name = "QualityIndicator.findByOption2", query = "SELECT q FROM QualityIndicator q WHERE q.option2 = :option2"),
		@NamedQuery(name = "QualityIndicator.findByOption3", query = "SELECT q FROM QualityIndicator q WHERE q.option3 = :option3"),
		@NamedQuery(name = "QualityIndicator.findByOption4", query = "SELECT q FROM QualityIndicator q WHERE q.option4 = :option4"),
		@NamedQuery(name = "QualityIndicator.findByCreationTime", query = "SELECT q FROM QualityIndicator q WHERE q.creationTime = :creationTime"),
		@NamedQuery(name = "QualityIndicator.findByModificationTime", query = "SELECT q FROM QualityIndicator q WHERE q.modificationTime = :modificationTime") })
public class QualityIndicator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Column(name = "description")
	private String description;
	@Column(name = "option1")
	private String option1;
	@Column(name = "option2")
	private String option2;
	@Column(name = "option3")
	private String option3;
	@Column(name = "option4")
	private String option4;
	@Basic(optional = false)
	@Column(name = "creation_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;
	@Basic(optional = false)
	@Column(name = "modification_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificationTime;
	@JoinColumn(name = "indicator_type", referencedColumnName = "type_Id")
	@ManyToOne(optional = false)
	private QualityIndicatorType indicatorType;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "qualityIndicator")
	private Collection<CaseQualityIndicator> caseQualityIndicatorCollection;

	public QualityIndicator() {
	}

	public QualityIndicator(Integer id) {
		this.id = id;
	}

	public QualityIndicator(Integer id, Date creationTime, Date modificationTime) {
		this.id = id;
		this.creationTime = creationTime;
		this.modificationTime = modificationTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(Date modificationTime) {
		this.modificationTime = modificationTime;
	}

	public QualityIndicatorType getIndicatorType() {
		return indicatorType;
	}

	public void setIndicatorType(QualityIndicatorType indicatorType) {
		this.indicatorType = indicatorType;
	}

	@XmlTransient
	public Collection<CaseQualityIndicator> getCaseQualityIndicatorCollection() {
		return caseQualityIndicatorCollection;
	}

	public void setCaseQualityIndicatorCollection(Collection<CaseQualityIndicator> caseQualityIndicatorCollection) {
		this.caseQualityIndicatorCollection = caseQualityIndicatorCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof QualityIndicator)) {
			return false;
		}
		QualityIndicator other = (QualityIndicator) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.QualityIndicator[ id=" + id + " ]";
	}

}

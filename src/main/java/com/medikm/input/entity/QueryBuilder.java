package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
 * @author ANUKUL
 */
@Entity
@Table(name = "query_builder")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "QueryBuilder.findAll", query = "SELECT q FROM QueryBuilder q"),
		@NamedQuery(name = "QueryBuilder.findById", query = "SELECT q FROM QueryBuilder q WHERE q.id = :id"),
		@NamedQuery(name = "QueryBuilder.findByQbCondition", query = "SELECT q FROM QueryBuilder q WHERE q.qbCondition = :qbCondition"),
		@NamedQuery(name = "QueryBuilder.findByCreationTime", query = "SELECT q FROM QueryBuilder q WHERE q.creationTime = :creationTime"),
		@NamedQuery(name = "QueryBuilder.findByModificationTime", query = "SELECT q FROM QueryBuilder q WHERE q.modificationTime = :modificationTime") })
public class QueryBuilder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Basic(optional = false)
	@Lob
	@Column(name = "query_title")
	private String queryTitle;
	@Basic(optional = false)
	@Lob
	@Column(name = "medikim_sql_query")
	private String medikimSqlQuery;
	@Basic(optional = false)
	@Column(name = "qb_condition")
	private String qbCondition;
	@Basic(optional = false)
	@Lob
	@Column(name = "output_fields")
	private String outputFields;
	@Column(name = "creation_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;
	@Column(name = "modification_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificationTime;
	@Basic(optional = false)
	@Lob
	@Column(name = "discription")
	private String discription;
	@JoinColumn(name = "physician", referencedColumnName = "Physician_Id")
	@ManyToOne(optional = false)
	private Physician physician;
	@OneToMany(mappedBy = "querybuilderId")
	private Collection<QueryBuilderCondition> queryBuilderConditionCollection;

	public QueryBuilder() {
	}

	public QueryBuilder(Integer id) {
		this.id = id;
	}

	public QueryBuilder(Integer id, String queryTitle, String medikimSqlQuery, String qbCondition, String outputFields,
			String discription) {
		this.id = id;
		this.queryTitle = queryTitle;
		this.medikimSqlQuery = medikimSqlQuery;
		this.qbCondition = qbCondition;
		this.outputFields = outputFields;
		this.discription = discription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQueryTitle() {
		return queryTitle;
	}

	public void setQueryTitle(String queryTitle) {
		this.queryTitle = queryTitle;
	}

	public String getMedikimSqlQuery() {
		return medikimSqlQuery;
	}

	public void setMedikimSqlQuery(String medikimSqlQuery) {
		this.medikimSqlQuery = medikimSqlQuery;
	}

	public String getQbCondition() {
		return qbCondition;
	}

	public void setQbCondition(String qbCondition) {
		this.qbCondition = qbCondition;
	}

	public String getOutputFields() {
		return outputFields;
	}

	public void setOutputFields(String outputFields) {
		this.outputFields = outputFields;
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

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	@XmlTransient
	public Collection<QueryBuilderCondition> getQueryBuilderConditionCollection() {
		return queryBuilderConditionCollection;
	}

	public void setQueryBuilderConditionCollection(Collection<QueryBuilderCondition> queryBuilderConditionCollection) {
		this.queryBuilderConditionCollection = queryBuilderConditionCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof QueryBuilder)) {
			return false;
		}
		QueryBuilder other = (QueryBuilder) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.QueryBuilder[ id=" + id + " ]";
	}

}

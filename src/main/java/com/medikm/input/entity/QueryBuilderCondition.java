package com.medikm.input.entity;

import java.io.Serializable;

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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANUKUL
 */
@Entity
@Table(name = "query_builder_condition")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "QueryBuilderCondition.findAll", query = "SELECT q FROM QueryBuilderCondition q"),
		@NamedQuery(name = "QueryBuilderCondition.findById", query = "SELECT q FROM QueryBuilderCondition q WHERE q.id = :id"),
		@NamedQuery(name = "QueryBuilderCondition.findByOperator", query = "SELECT q FROM QueryBuilderCondition q WHERE q.operator = :operator") })
public class QueryBuilderCondition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Basic(optional = false)
	@Lob
	@Column(name = "field_id")
	private String fieldId;
	@Basic(optional = false)
	@Column(name = "operator")
	private String operator;
	@Basic(optional = false)
	@Lob
	@Column(name = "field_value")
	private String fieldValue;
	@JoinColumn(name = "querybuilderId", referencedColumnName = "id")
	@ManyToOne
	private QueryBuilder querybuilderId;

	public QueryBuilderCondition() {
	}

	public QueryBuilderCondition(Integer id) {
		this.id = id;
	}

	public QueryBuilderCondition(Integer id, String fieldId, String operator, String fieldValue) {
		this.id = id;
		this.fieldId = fieldId;
		this.operator = operator;
		this.fieldValue = fieldValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public QueryBuilder getQuerybuilderId() {
		return querybuilderId;
	}

	public void setQuerybuilderId(QueryBuilder querybuilderId) {
		this.querybuilderId = querybuilderId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof QueryBuilderCondition)) {
			return false;
		}
		QueryBuilderCondition other = (QueryBuilderCondition) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.QueryBuilderCondition[ id=" + id + " ]";
	}

}

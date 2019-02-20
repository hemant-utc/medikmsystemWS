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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "sol_category")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "SolCategory.findAll", query = "SELECT s FROM SolCategory s") })
public class SolCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Category_Id")
	private Integer categoryId;
	@Basic(optional = false)
	@Column(name = "Category_Name")
	private String categoryName;
	@OneToMany(mappedBy = "category")
	private Collection<CcbrSolution> ccbrSolutionCollection;
	@OneToMany(mappedBy = "category")
	private Collection<CcbrQuestion> ccbrQuestionCollection;

	public SolCategory() {
	}

	public SolCategory(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public SolCategory(Integer categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@XmlTransient
	public Collection<CcbrSolution> getCcbrSolutionCollection() {
		return ccbrSolutionCollection;
	}

	public void setCcbrSolutionCollection(Collection<CcbrSolution> ccbrSolutionCollection) {
		this.ccbrSolutionCollection = ccbrSolutionCollection;
	}

	@XmlTransient
	public Collection<CcbrQuestion> getCcbrQuestionCollection() {
		return ccbrQuestionCollection;
	}

	public void setCcbrQuestionCollection(Collection<CcbrQuestion> ccbrQuestionCollection) {
		this.ccbrQuestionCollection = ccbrQuestionCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (categoryId != null ? categoryId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof SolCategory)) {
			return false;
		}
		SolCategory other = (SolCategory) object;
		if ((this.categoryId == null && other.categoryId != null)
				|| (this.categoryId != null && !this.categoryId.equals(other.categoryId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.SolCategory[ categoryId=" + categoryId + " ]";
	}

}

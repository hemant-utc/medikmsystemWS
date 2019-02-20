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
 * @author Saikat
 */
@Entity
@Table(name = "key_concept")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "KeyConcept.findAll", query = "SELECT k FROM KeyConcept k") })
public class KeyConcept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "Concept_Id")
	private Integer conceptId;
	@Basic(optional = false)
	@Column(name = "Concept_Name")
	private String conceptName;
	@OneToMany(mappedBy = "keyConcept3")
	private Collection<CcbrSolution> ccbrSolutionCollection;
	@OneToMany(mappedBy = "keyConcept2")
	private Collection<CcbrSolution> ccbrSolutionCollection1;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "keyConcept1")
	private Collection<CcbrSolution> ccbrSolutionCollection2;
	@OneToMany(mappedBy = "keyConcept1")
	private Collection<CcbrQuestion> ccbrQuestionCollection;
	@OneToMany(mappedBy = "keyConcept3")
	private Collection<CcbrQuestion> ccbrQuestionCollection1;
	@OneToMany(mappedBy = "keyConcept2")
	private Collection<CcbrQuestion> ccbrQuestionCollection2;

	public KeyConcept() {
	}

	public KeyConcept(Integer conceptId) {
		this.conceptId = conceptId;
	}

	public KeyConcept(Integer conceptId, String conceptName) {
		this.conceptId = conceptId;
		this.conceptName = conceptName;
	}

	public Integer getConceptId() {
		return conceptId;
	}

	public void setConceptId(Integer conceptId) {
		this.conceptId = conceptId;
	}

	public String getConceptName() {
		return conceptName;
	}

	public void setConceptName(String conceptName) {
		this.conceptName = conceptName;
	}

	@XmlTransient
	public Collection<CcbrSolution> getCcbrSolutionCollection() {
		return ccbrSolutionCollection;
	}

	public void setCcbrSolutionCollection(Collection<CcbrSolution> ccbrSolutionCollection) {
		this.ccbrSolutionCollection = ccbrSolutionCollection;
	}

	@XmlTransient
	public Collection<CcbrSolution> getCcbrSolutionCollection1() {
		return ccbrSolutionCollection1;
	}

	public void setCcbrSolutionCollection1(Collection<CcbrSolution> ccbrSolutionCollection1) {
		this.ccbrSolutionCollection1 = ccbrSolutionCollection1;
	}

	@XmlTransient
	public Collection<CcbrSolution> getCcbrSolutionCollection2() {
		return ccbrSolutionCollection2;
	}

	public void setCcbrSolutionCollection2(Collection<CcbrSolution> ccbrSolutionCollection2) {
		this.ccbrSolutionCollection2 = ccbrSolutionCollection2;
	}

	@XmlTransient
	public Collection<CcbrQuestion> getCcbrQuestionCollection() {
		return ccbrQuestionCollection;
	}

	public void setCcbrQuestionCollection(Collection<CcbrQuestion> ccbrQuestionCollection) {
		this.ccbrQuestionCollection = ccbrQuestionCollection;
	}

	@XmlTransient
	public Collection<CcbrQuestion> getCcbrQuestionCollection1() {
		return ccbrQuestionCollection1;
	}

	public void setCcbrQuestionCollection1(Collection<CcbrQuestion> ccbrQuestionCollection1) {
		this.ccbrQuestionCollection1 = ccbrQuestionCollection1;
	}

	@XmlTransient
	public Collection<CcbrQuestion> getCcbrQuestionCollection2() {
		return ccbrQuestionCollection2;
	}

	public void setCcbrQuestionCollection2(Collection<CcbrQuestion> ccbrQuestionCollection2) {
		this.ccbrQuestionCollection2 = ccbrQuestionCollection2;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (conceptId != null ? conceptId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof KeyConcept)) {
			return false;
		}
		KeyConcept other = (KeyConcept) object;
		if ((this.conceptId == null && other.conceptId != null)
				|| (this.conceptId != null && !this.conceptId.equals(other.conceptId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.KeyConcept[ conceptId=" + conceptId + " ]";
	}

}

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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "ccbr_solution")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CcbrSolution.findAll", query = "SELECT c FROM CcbrSolution c") })
public class CcbrSolution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Solution_Id")
	private Integer solutionId;
	@Basic(optional = false)
	@Lob
	@Column(name = "Solution_Text")
	private String solutionText;
	@Column(name = "Source")
	private String source;
	@Lob
	@Column(name = "Comments")
	private String comments;
	@Column(name = "Rational")
	private String rational;
	@Column(name = "Quality")
	private Integer quality;
	@OneToMany(mappedBy = "relatedSolutionId")
	private Collection<CcbrSolution> ccbrSolutionCollection;
	@JoinColumn(name = "Related_Solution_Id", referencedColumnName = "Solution_Id")
	@ManyToOne
	private CcbrSolution relatedSolutionId;
	@JoinColumn(name = "Question_Id", referencedColumnName = "Question_Id")
	@ManyToOne(optional = false)
	private CcbrQuestion questionId;
	@JoinColumn(name = "Category", referencedColumnName = "Category_Id")
	@ManyToOne
	private SolCategory category;
	@JoinColumn(name = "Key_Concept3", referencedColumnName = "Concept_Id")
	@ManyToOne
	private KeyConcept keyConcept3;
	@JoinColumn(name = "Key_Concept2", referencedColumnName = "Concept_Id")
	@ManyToOne
	private KeyConcept keyConcept2;
	@JoinColumn(name = "Key_Concept1", referencedColumnName = "Concept_Id")
	@ManyToOne(optional = false)
	private KeyConcept keyConcept1;
	@OneToMany(mappedBy = "cCBRAnswereId")
	private Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection;

	public CcbrSolution() {
	}

	public CcbrSolution(Integer solutionId) {
		this.solutionId = solutionId;
	}

	public CcbrSolution(Integer solutionId, String solutionText) {
		this.solutionId = solutionId;
		this.solutionText = solutionText;
	}

	public Integer getSolutionId() {
		return solutionId;
	}

	public void setSolutionId(Integer solutionId) {
		this.solutionId = solutionId;
	}

	public String getSolutionText() {
		return solutionText;
	}

	public void setSolutionText(String solutionText) {
		this.solutionText = solutionText;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRational() {
		return rational;
	}

	public void setRational(String rational) {
		this.rational = rational;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	@XmlTransient
	public Collection<CcbrSolution> getCcbrSolutionCollection() {
		return ccbrSolutionCollection;
	}

	public void setCcbrSolutionCollection(Collection<CcbrSolution> ccbrSolutionCollection) {
		this.ccbrSolutionCollection = ccbrSolutionCollection;
	}

	public CcbrSolution getRelatedSolutionId() {
		return relatedSolutionId;
	}

	public void setRelatedSolutionId(CcbrSolution relatedSolutionId) {
		this.relatedSolutionId = relatedSolutionId;
	}

	public CcbrQuestion getQuestionId() {
		return questionId;
	}

	public void setQuestionId(CcbrQuestion questionId) {
		this.questionId = questionId;
	}

	public SolCategory getCategory() {
		return category;
	}

	public void setCategory(SolCategory category) {
		this.category = category;
	}

	public KeyConcept getKeyConcept3() {
		return keyConcept3;
	}

	public void setKeyConcept3(KeyConcept keyConcept3) {
		this.keyConcept3 = keyConcept3;
	}

	public KeyConcept getKeyConcept2() {
		return keyConcept2;
	}

	public void setKeyConcept2(KeyConcept keyConcept2) {
		this.keyConcept2 = keyConcept2;
	}

	public KeyConcept getKeyConcept1() {
		return keyConcept1;
	}

	public void setKeyConcept1(KeyConcept keyConcept1) {
		this.keyConcept1 = keyConcept1;
	}

	@XmlTransient
	public Collection<TbDiscussionForumAnswere> getTbDiscussionForumAnswereCollection() {
		return tbDiscussionForumAnswereCollection;
	}

	public void setTbDiscussionForumAnswereCollection(
			Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection) {
		this.tbDiscussionForumAnswereCollection = tbDiscussionForumAnswereCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (solutionId != null ? solutionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CcbrSolution)) {
			return false;
		}
		CcbrSolution other = (CcbrSolution) object;
		if ((this.solutionId == null && other.solutionId != null)
				|| (this.solutionId != null && !this.solutionId.equals(other.solutionId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CcbrSolution[ solutionId=" + solutionId + " ]";
	}

}

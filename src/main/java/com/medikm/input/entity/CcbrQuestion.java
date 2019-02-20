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
@Table(name = "ccbr_question")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CcbrQuestion.findAll", query = "SELECT c FROM CcbrQuestion c") })
public class CcbrQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Question_Id")
	private Integer questionId;
	@Column(name = "Exclude1")
	private Boolean exclude1;
	@Column(name = "Exclude2")
	private Boolean exclude2;
	@Column(name = "Exclude3")
	private Boolean exclude3;
	@Basic(optional = false)
	@Lob
	@Column(name = "Questiom_text")
	private String questiomtext;
	@Lob
	@Column(name = "Rational")
	private String rational;
	@Column(name = "reference_knowledge")
	private Short referenceKnowledge;
	@Column(name = "solution_available")
	private Short solutionAvailable;
	@Lob
	@Column(name = "Source")
	private String source;
	@Lob
	@Column(name = "comments")
	private String comments;
	@Column(name = "QRP_Age")
	private Boolean qRPAge;
	@Column(name = "QRP_Er")
	private Boolean qRPEr;
	@Column(name = "QRP_Pr")
	private Boolean qRPPr;
	@Column(name = "QRP_Genetics")
	private Boolean qRPGenetics;
	@Column(name = "QRP_Genomics")
	private Boolean qRPGenomics;
	@Column(name = "QRP_CancerType")
	private Boolean qRPCancerType;
	@Column(name = "QRP_TumorSize")
	private Boolean qRPTumorSize;
	@Column(name = "QRP_Nodes")
	private Boolean qRPNodes;
	@Column(name = "QRP_WorkingTNM")
	private Boolean qRPWorkingTNM;
	@Column(name = "QRP_FinalTNM")
	private Boolean qRPFinalTNM;
	@Column(name = "QRP_Grade")
	private Boolean qRPGrade;
	@Column(name = "QRP_Her2neu")
	private Boolean qRPHer2neu;
	@Column(name = "QRP_Her2neuSISH")
	private Boolean qRPHer2neuSISH;
	@Column(name = "QRP_DistantMet")
	private Boolean qRPDistantMet;
	@Column(name = "QRP_Gender")
	private Boolean qRPGender;
	@Column(name = "QRP_Menopause")
	private Boolean qRPMenopause;
	@Column(name = "QRP_Significance_Risk")
	private Boolean qRPSignificanceRisk;
	@Column(name = "QRP_Significance_Comorbities")
	private Boolean qRPSignificanceComorbities;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "questionId")
	private Collection<CcbrSolution> ccbrSolutionCollection;
	@JoinColumn(name = "Category", referencedColumnName = "Category_Id")
	@ManyToOne
	private SolCategory category;
	@JoinColumn(name = "key_Concept1", referencedColumnName = "Concept_Id")
	@ManyToOne
	private KeyConcept keyConcept1;
	@JoinColumn(name = "key_Concept3", referencedColumnName = "Concept_Id")
	@ManyToOne
	private KeyConcept keyConcept3;
	@JoinColumn(name = "Key_Concept2", referencedColumnName = "Concept_Id")
	@ManyToOne
	private KeyConcept keyConcept2;
	@OneToMany(mappedBy = "questionId")
	private Collection<TumorBoardDiscussion> tumorBoardDiscussionCollection;
	@OneToMany(mappedBy = "cCBRQuestionId")
	private Collection<TbDiscussionForumQuestion> tbDiscussionForumQuestionCollection;

	public CcbrQuestion() {
	}

	public CcbrQuestion(Integer questionId) {
		this.questionId = questionId;
	}

	public CcbrQuestion(Integer questionId, String questiomtext) {
		this.questionId = questionId;
		this.questiomtext = questiomtext;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Boolean getExclude1() {
		return exclude1;
	}

	public void setExclude1(Boolean exclude1) {
		this.exclude1 = exclude1;
	}

	public Boolean getExclude2() {
		return exclude2;
	}

	public void setExclude2(Boolean exclude2) {
		this.exclude2 = exclude2;
	}

	public Boolean getExclude3() {
		return exclude3;
	}

	public void setExclude3(Boolean exclude3) {
		this.exclude3 = exclude3;
	}

	public String getQuestiomtext() {
		return questiomtext;
	}

	public void setQuestiomtext(String questiomtext) {
		this.questiomtext = questiomtext;
	}

	public String getRational() {
		return rational;
	}

	public void setRational(String rational) {
		this.rational = rational;
	}

	public Short getReferenceKnowledge() {
		return referenceKnowledge;
	}

	public void setReferenceKnowledge(Short referenceKnowledge) {
		this.referenceKnowledge = referenceKnowledge;
	}

	public Short getSolutionAvailable() {
		return solutionAvailable;
	}

	public void setSolutionAvailable(Short solutionAvailable) {
		this.solutionAvailable = solutionAvailable;
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

	public Boolean getQRPAge() {
		return qRPAge;
	}

	public void setQRPAge(Boolean qRPAge) {
		this.qRPAge = qRPAge;
	}

	public Boolean getQRPEr() {
		return qRPEr;
	}

	public void setQRPEr(Boolean qRPEr) {
		this.qRPEr = qRPEr;
	}

	public Boolean getQRPPr() {
		return qRPPr;
	}

	public void setQRPPr(Boolean qRPPr) {
		this.qRPPr = qRPPr;
	}

	public Boolean getQRPGenetics() {
		return qRPGenetics;
	}

	public void setQRPGenetics(Boolean qRPGenetics) {
		this.qRPGenetics = qRPGenetics;
	}

	public Boolean getQRPGenomics() {
		return qRPGenomics;
	}

	public void setQRPGenomics(Boolean qRPGenomics) {
		this.qRPGenomics = qRPGenomics;
	}

	public Boolean getQRPCancerType() {
		return qRPCancerType;
	}

	public void setQRPCancerType(Boolean qRPCancerType) {
		this.qRPCancerType = qRPCancerType;
	}

	public Boolean getQRPTumorSize() {
		return qRPTumorSize;
	}

	public void setQRPTumorSize(Boolean qRPTumorSize) {
		this.qRPTumorSize = qRPTumorSize;
	}

	public Boolean getQRPNodes() {
		return qRPNodes;
	}

	public void setQRPNodes(Boolean qRPNodes) {
		this.qRPNodes = qRPNodes;
	}

	public Boolean getQRPWorkingTNM() {
		return qRPWorkingTNM;
	}

	public void setQRPWorkingTNM(Boolean qRPWorkingTNM) {
		this.qRPWorkingTNM = qRPWorkingTNM;
	}

	public Boolean getQRPFinalTNM() {
		return qRPFinalTNM;
	}

	public void setQRPFinalTNM(Boolean qRPFinalTNM) {
		this.qRPFinalTNM = qRPFinalTNM;
	}

	public Boolean getQRPGrade() {
		return qRPGrade;
	}

	public void setQRPGrade(Boolean qRPGrade) {
		this.qRPGrade = qRPGrade;
	}

	public Boolean getQRPHer2neu() {
		return qRPHer2neu;
	}

	public void setQRPHer2neu(Boolean qRPHer2neu) {
		this.qRPHer2neu = qRPHer2neu;
	}

	public Boolean getQRPHer2neuSISH() {
		return qRPHer2neuSISH;
	}

	public void setQRPHer2neuSISH(Boolean qRPHer2neuSISH) {
		this.qRPHer2neuSISH = qRPHer2neuSISH;
	}

	public Boolean getQRPDistantMet() {
		return qRPDistantMet;
	}

	public void setQRPDistantMet(Boolean qRPDistantMet) {
		this.qRPDistantMet = qRPDistantMet;
	}

	public Boolean getQRPGender() {
		return qRPGender;
	}

	public void setQRPGender(Boolean qRPGender) {
		this.qRPGender = qRPGender;
	}

	public Boolean getQRPMenopause() {
		return qRPMenopause;
	}

	public void setQRPMenopause(Boolean qRPMenopause) {
		this.qRPMenopause = qRPMenopause;
	}

	public Boolean getQRPSignificanceRisk() {
		return qRPSignificanceRisk;
	}

	public void setQRPSignificanceRisk(Boolean qRPSignificanceRisk) {
		this.qRPSignificanceRisk = qRPSignificanceRisk;
	}

	public Boolean getQRPSignificanceComorbities() {
		return qRPSignificanceComorbities;
	}

	public void setQRPSignificanceComorbities(Boolean qRPSignificanceComorbities) {
		this.qRPSignificanceComorbities = qRPSignificanceComorbities;
	}

	@XmlTransient
	public Collection<CcbrSolution> getCcbrSolutionCollection() {
		return ccbrSolutionCollection;
	}

	public void setCcbrSolutionCollection(Collection<CcbrSolution> ccbrSolutionCollection) {
		this.ccbrSolutionCollection = ccbrSolutionCollection;
	}

	public SolCategory getCategory() {
		return category;
	}

	public void setCategory(SolCategory category) {
		this.category = category;
	}

	public KeyConcept getKeyConcept1() {
		return keyConcept1;
	}

	public void setKeyConcept1(KeyConcept keyConcept1) {
		this.keyConcept1 = keyConcept1;
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

	@XmlTransient
	public Collection<TumorBoardDiscussion> getTumorBoardDiscussionCollection() {
		return tumorBoardDiscussionCollection;
	}

	public void setTumorBoardDiscussionCollection(Collection<TumorBoardDiscussion> tumorBoardDiscussionCollection) {
		this.tumorBoardDiscussionCollection = tumorBoardDiscussionCollection;
	}

	@XmlTransient
	public Collection<TbDiscussionForumQuestion> getTbDiscussionForumQuestionCollection() {
		return tbDiscussionForumQuestionCollection;
	}

	public void setTbDiscussionForumQuestionCollection(
			Collection<TbDiscussionForumQuestion> tbDiscussionForumQuestionCollection) {
		this.tbDiscussionForumQuestionCollection = tbDiscussionForumQuestionCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (questionId != null ? questionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CcbrQuestion)) {
			return false;
		}
		CcbrQuestion other = (CcbrQuestion) object;
		if ((this.questionId == null && other.questionId != null)
				|| (this.questionId != null && !this.questionId.equals(other.questionId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.CcbrQuestion[ questionId=" + questionId + " ]";
	}

}

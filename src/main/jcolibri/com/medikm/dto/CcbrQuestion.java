package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * CcbrQuestion entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class CcbrQuestion implements java.io.Serializable {

	// Fields

	private Integer questionId;
	private KeyConcept keyConceptByKeyConcept2;
	private KeyConcept keyConceptByKeyConcept3;
	private KeyConcept keyConceptByKeyConcept1;
	private SolCategory solCategory;
	private Boolean exclude1;
	private Boolean exclude2;
	private Boolean exclude3;
	private String questiomText;
	private String rational;
	private Short referenceKnowledge;
	private Short solutionAvailable;
	private String source;
	private String comments;
	private Boolean qrpAge;
	private Boolean qrpEr;
	private Boolean qrpPr;
	private Boolean qrpGenetics;
	private Boolean qrpGenomics;
	private Boolean qrpCancerType;
	private Boolean qrpTumorSize;
	private Boolean qrpNodes;
	private Boolean qrpWorkingTnm;
	private Boolean qrpFinalTnm;
	private Boolean qrpGrade;
	private Boolean qrpHer2neu;
	private Boolean qrpHer2neuSish;
	private Boolean qrpDistantMet;
	private Boolean qrpGender;
	private Boolean qrpMenopause;
	private Boolean qrpSignificanceRisk;
	private Boolean qrpSignificanceComorbities;
	private Set tbDiscussionForumQuestions = new HashSet(0);
	private Set ccbrSolutions = new HashSet(0);
	private Set tumorBoardDiscussions = new HashSet(0);
	private Set tbDiscussionForums = new HashSet(0);

	// Constructors

	/** default constructor */
	public CcbrQuestion() {
	}

	/** minimal constructor */
	public CcbrQuestion(String questiomText) {
		this.questiomText = questiomText;
	}

	/** full constructor */
	public CcbrQuestion(KeyConcept keyConceptByKeyConcept2, KeyConcept keyConceptByKeyConcept3,
			KeyConcept keyConceptByKeyConcept1, SolCategory solCategory, Boolean exclude1, Boolean exclude2,
			Boolean exclude3, String questiomText, String rational, Short referenceKnowledge, Short solutionAvailable,
			String source, String comments, Boolean qrpAge, Boolean qrpEr, Boolean qrpPr, Boolean qrpGenetics,
			Boolean qrpGenomics, Boolean qrpCancerType, Boolean qrpTumorSize, Boolean qrpNodes, Boolean qrpWorkingTnm,
			Boolean qrpFinalTnm, Boolean qrpGrade, Boolean qrpHer2neu, Boolean qrpHer2neuSish, Boolean qrpDistantMet,
			Boolean qrpGender, Boolean qrpMenopause, Boolean qrpSignificanceRisk, Boolean qrpSignificanceComorbities,
			Set tbDiscussionForumQuestions, Set ccbrSolutions, Set tumorBoardDiscussions, Set tbDiscussionForums) {
		this.keyConceptByKeyConcept2 = keyConceptByKeyConcept2;
		this.keyConceptByKeyConcept3 = keyConceptByKeyConcept3;
		this.keyConceptByKeyConcept1 = keyConceptByKeyConcept1;
		this.solCategory = solCategory;
		this.exclude1 = exclude1;
		this.exclude2 = exclude2;
		this.exclude3 = exclude3;
		this.questiomText = questiomText;
		this.rational = rational;
		this.referenceKnowledge = referenceKnowledge;
		this.solutionAvailable = solutionAvailable;
		this.source = source;
		this.comments = comments;
		this.qrpAge = qrpAge;
		this.qrpEr = qrpEr;
		this.qrpPr = qrpPr;
		this.qrpGenetics = qrpGenetics;
		this.qrpGenomics = qrpGenomics;
		this.qrpCancerType = qrpCancerType;
		this.qrpTumorSize = qrpTumorSize;
		this.qrpNodes = qrpNodes;
		this.qrpWorkingTnm = qrpWorkingTnm;
		this.qrpFinalTnm = qrpFinalTnm;
		this.qrpGrade = qrpGrade;
		this.qrpHer2neu = qrpHer2neu;
		this.qrpHer2neuSish = qrpHer2neuSish;
		this.qrpDistantMet = qrpDistantMet;
		this.qrpGender = qrpGender;
		this.qrpMenopause = qrpMenopause;
		this.qrpSignificanceRisk = qrpSignificanceRisk;
		this.qrpSignificanceComorbities = qrpSignificanceComorbities;
		this.tbDiscussionForumQuestions = tbDiscussionForumQuestions;
		this.ccbrSolutions = ccbrSolutions;
		this.tumorBoardDiscussions = tumorBoardDiscussions;
		this.tbDiscussionForums = tbDiscussionForums;
	}

	// Property accessors

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public KeyConcept getKeyConceptByKeyConcept2() {
		return this.keyConceptByKeyConcept2;
	}

	public void setKeyConceptByKeyConcept2(KeyConcept keyConceptByKeyConcept2) {
		this.keyConceptByKeyConcept2 = keyConceptByKeyConcept2;
	}

	public KeyConcept getKeyConceptByKeyConcept3() {
		return this.keyConceptByKeyConcept3;
	}

	public void setKeyConceptByKeyConcept3(KeyConcept keyConceptByKeyConcept3) {
		this.keyConceptByKeyConcept3 = keyConceptByKeyConcept3;
	}

	public KeyConcept getKeyConceptByKeyConcept1() {
		return this.keyConceptByKeyConcept1;
	}

	public void setKeyConceptByKeyConcept1(KeyConcept keyConceptByKeyConcept1) {
		this.keyConceptByKeyConcept1 = keyConceptByKeyConcept1;
	}

	public SolCategory getSolCategory() {
		return this.solCategory;
	}

	public void setSolCategory(SolCategory solCategory) {
		this.solCategory = solCategory;
	}

	public Boolean getExclude1() {
		return this.exclude1;
	}

	public void setExclude1(Boolean exclude1) {
		this.exclude1 = exclude1;
	}

	public Boolean getExclude2() {
		return this.exclude2;
	}

	public void setExclude2(Boolean exclude2) {
		this.exclude2 = exclude2;
	}

	public Boolean getExclude3() {
		return this.exclude3;
	}

	public void setExclude3(Boolean exclude3) {
		this.exclude3 = exclude3;
	}

	public String getQuestiomText() {
		return this.questiomText;
	}

	public void setQuestiomText(String questiomText) {
		this.questiomText = questiomText;
	}

	public String getRational() {
		return this.rational;
	}

	public void setRational(String rational) {
		this.rational = rational;
	}

	public Short getReferenceKnowledge() {
		return this.referenceKnowledge;
	}

	public void setReferenceKnowledge(Short referenceKnowledge) {
		this.referenceKnowledge = referenceKnowledge;
	}

	public Short getSolutionAvailable() {
		return this.solutionAvailable;
	}

	public void setSolutionAvailable(Short solutionAvailable) {
		this.solutionAvailable = solutionAvailable;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Boolean getQrpAge() {
		return this.qrpAge;
	}

	public void setQrpAge(Boolean qrpAge) {
		this.qrpAge = qrpAge;
	}

	public Boolean getQrpEr() {
		return this.qrpEr;
	}

	public void setQrpEr(Boolean qrpEr) {
		this.qrpEr = qrpEr;
	}

	public Boolean getQrpPr() {
		return this.qrpPr;
	}

	public void setQrpPr(Boolean qrpPr) {
		this.qrpPr = qrpPr;
	}

	public Boolean getQrpGenetics() {
		return this.qrpGenetics;
	}

	public void setQrpGenetics(Boolean qrpGenetics) {
		this.qrpGenetics = qrpGenetics;
	}

	public Boolean getQrpGenomics() {
		return this.qrpGenomics;
	}

	public void setQrpGenomics(Boolean qrpGenomics) {
		this.qrpGenomics = qrpGenomics;
	}

	public Boolean getQrpCancerType() {
		return this.qrpCancerType;
	}

	public void setQrpCancerType(Boolean qrpCancerType) {
		this.qrpCancerType = qrpCancerType;
	}

	public Boolean getQrpTumorSize() {
		return this.qrpTumorSize;
	}

	public void setQrpTumorSize(Boolean qrpTumorSize) {
		this.qrpTumorSize = qrpTumorSize;
	}

	public Boolean getQrpNodes() {
		return this.qrpNodes;
	}

	public void setQrpNodes(Boolean qrpNodes) {
		this.qrpNodes = qrpNodes;
	}

	public Boolean getQrpWorkingTnm() {
		return this.qrpWorkingTnm;
	}

	public void setQrpWorkingTnm(Boolean qrpWorkingTnm) {
		this.qrpWorkingTnm = qrpWorkingTnm;
	}

	public Boolean getQrpFinalTnm() {
		return this.qrpFinalTnm;
	}

	public void setQrpFinalTnm(Boolean qrpFinalTnm) {
		this.qrpFinalTnm = qrpFinalTnm;
	}

	public Boolean getQrpGrade() {
		return this.qrpGrade;
	}

	public void setQrpGrade(Boolean qrpGrade) {
		this.qrpGrade = qrpGrade;
	}

	public Boolean getQrpHer2neu() {
		return this.qrpHer2neu;
	}

	public void setQrpHer2neu(Boolean qrpHer2neu) {
		this.qrpHer2neu = qrpHer2neu;
	}

	public Boolean getQrpHer2neuSish() {
		return this.qrpHer2neuSish;
	}

	public void setQrpHer2neuSish(Boolean qrpHer2neuSish) {
		this.qrpHer2neuSish = qrpHer2neuSish;
	}

	public Boolean getQrpDistantMet() {
		return this.qrpDistantMet;
	}

	public void setQrpDistantMet(Boolean qrpDistantMet) {
		this.qrpDistantMet = qrpDistantMet;
	}

	public Boolean getQrpGender() {
		return this.qrpGender;
	}

	public void setQrpGender(Boolean qrpGender) {
		this.qrpGender = qrpGender;
	}

	public Boolean getQrpMenopause() {
		return this.qrpMenopause;
	}

	public void setQrpMenopause(Boolean qrpMenopause) {
		this.qrpMenopause = qrpMenopause;
	}

	public Boolean getQrpSignificanceRisk() {
		return this.qrpSignificanceRisk;
	}

	public void setQrpSignificanceRisk(Boolean qrpSignificanceRisk) {
		this.qrpSignificanceRisk = qrpSignificanceRisk;
	}

	public Boolean getQrpSignificanceComorbities() {
		return this.qrpSignificanceComorbities;
	}

	public void setQrpSignificanceComorbities(Boolean qrpSignificanceComorbities) {
		this.qrpSignificanceComorbities = qrpSignificanceComorbities;
	}

	public Set getTbDiscussionForumQuestions() {
		return this.tbDiscussionForumQuestions;
	}

	public void setTbDiscussionForumQuestions(Set tbDiscussionForumQuestions) {
		this.tbDiscussionForumQuestions = tbDiscussionForumQuestions;
	}

	public Set getCcbrSolutions() {
		return this.ccbrSolutions;
	}

	public void setCcbrSolutions(Set ccbrSolutions) {
		this.ccbrSolutions = ccbrSolutions;
	}

	public Set getTumorBoardDiscussions() {
		return this.tumorBoardDiscussions;
	}

	public void setTumorBoardDiscussions(Set tumorBoardDiscussions) {
		this.tumorBoardDiscussions = tumorBoardDiscussions;
	}

	public Set getTbDiscussionForums() {
		return this.tbDiscussionForums;
	}

	public void setTbDiscussionForums(Set tbDiscussionForums) {
		this.tbDiscussionForums = tbDiscussionForums;
	}

}
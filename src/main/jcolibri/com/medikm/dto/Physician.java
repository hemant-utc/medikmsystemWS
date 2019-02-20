package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Physician entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Physician implements java.io.Serializable {

	// Fields

	private Integer physicianId;
	private DiseaseType diseaseType;
	private CareFacility careFacility;
	private CancerType cancerType;
	private PhysicianSpeciality physicianSpeciality;
	private String fname;
	private String minit;
	private String lname;
	private String phyGroup;
	private String emailId;
	private String phoneNo;
	private String profileImage;
	private Set tbDiscussionForumQuestions = new HashSet(0);
	private Set case1sForPlasticSurgeonId = new HashSet(0);
	private Set case1sForRadOncPhysicianId = new HashSet(0);
	private Set casePhysicians = new HashSet(0);
	private Set commentsLikes = new HashSet(0);
	private Set medikmResourceses = new HashSet(0);
	private Set case1sForSurgOncPhysicianId = new HashSet(0);
	private Set caseResourceses = new HashSet(0);
	private Set case1sForMedOncPhysicianId = new HashSet(0);
	private Set tbDiscussionForumAnsweres = new HashSet(0);
	private Set case1sForReferingPhysiciaId = new HashSet(0);
	private Set encounterPhysicians = new HashSet(0);
	private Set recommendedPlanLikes = new HashSet(0);
	private Set clinicalTrials = new HashSet(0);
	private Set questionLikes = new HashSet(0);
	private Set pathologies = new HashSet(0);
	private Set testResultResources = new HashSet(0);
	private Set episodePhysicians = new HashSet(0);
	private Set userlogs = new HashSet(0);
	private Set physicalExams = new HashSet(0);

	// Constructors

	/** default constructor */
	public Physician() {
	}

	/** minimal constructor */
	public Physician(String lname) {
		this.lname = lname;
	}

	/** full constructor */
	public Physician(DiseaseType diseaseType, CareFacility careFacility, CancerType cancerType,
			PhysicianSpeciality physicianSpeciality, String fname, String minit, String lname, String phyGroup,
			String emailId, String phoneNo, String profileImage, Set tbDiscussionForumQuestions,
			Set case1sForPlasticSurgeonId, Set case1sForRadOncPhysicianId, Set casePhysicians, Set commentsLikes,
			Set medikmResourceses, Set case1sForSurgOncPhysicianId, Set caseResourceses, Set case1sForMedOncPhysicianId,
			Set tbDiscussionForumAnsweres, Set case1sForReferingPhysiciaId, Set encounterPhysicians,
			Set recommendedPlanLikes, Set clinicalTrials, Set questionLikes, Set pathologies, Set testResultResources,
			Set episodePhysicians, Set userlogs, Set physicalExams) {
		this.diseaseType = diseaseType;
		this.careFacility = careFacility;
		this.cancerType = cancerType;
		this.physicianSpeciality = physicianSpeciality;
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.phyGroup = phyGroup;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.profileImage = profileImage;
		this.tbDiscussionForumQuestions = tbDiscussionForumQuestions;
		this.case1sForPlasticSurgeonId = case1sForPlasticSurgeonId;
		this.case1sForRadOncPhysicianId = case1sForRadOncPhysicianId;
		this.casePhysicians = casePhysicians;
		this.commentsLikes = commentsLikes;
		this.medikmResourceses = medikmResourceses;
		this.case1sForSurgOncPhysicianId = case1sForSurgOncPhysicianId;
		this.caseResourceses = caseResourceses;
		this.case1sForMedOncPhysicianId = case1sForMedOncPhysicianId;
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
		this.case1sForReferingPhysiciaId = case1sForReferingPhysiciaId;
		this.encounterPhysicians = encounterPhysicians;
		this.recommendedPlanLikes = recommendedPlanLikes;
		this.clinicalTrials = clinicalTrials;
		this.questionLikes = questionLikes;
		this.pathologies = pathologies;
		this.testResultResources = testResultResources;
		this.episodePhysicians = episodePhysicians;
		this.userlogs = userlogs;
		this.physicalExams = physicalExams;
	}

	// Property accessors

	public Integer getPhysicianId() {
		return this.physicianId;
	}

	public void setPhysicianId(Integer physicianId) {
		this.physicianId = physicianId;
	}

	public DiseaseType getDiseaseType() {
		return this.diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	public CareFacility getCareFacility() {
		return this.careFacility;
	}

	public void setCareFacility(CareFacility careFacility) {
		this.careFacility = careFacility;
	}

	public CancerType getCancerType() {
		return this.cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	public PhysicianSpeciality getPhysicianSpeciality() {
		return this.physicianSpeciality;
	}

	public void setPhysicianSpeciality(PhysicianSpeciality physicianSpeciality) {
		this.physicianSpeciality = physicianSpeciality;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMinit() {
		return this.minit;
	}

	public void setMinit(String minit) {
		this.minit = minit;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhyGroup() {
		return this.phyGroup;
	}

	public void setPhyGroup(String phyGroup) {
		this.phyGroup = phyGroup;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProfileImage() {
		return this.profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public Set getTbDiscussionForumQuestions() {
		return this.tbDiscussionForumQuestions;
	}

	public void setTbDiscussionForumQuestions(Set tbDiscussionForumQuestions) {
		this.tbDiscussionForumQuestions = tbDiscussionForumQuestions;
	}

	public Set getCase1sForPlasticSurgeonId() {
		return this.case1sForPlasticSurgeonId;
	}

	public void setCase1sForPlasticSurgeonId(Set case1sForPlasticSurgeonId) {
		this.case1sForPlasticSurgeonId = case1sForPlasticSurgeonId;
	}

	public Set getCase1sForRadOncPhysicianId() {
		return this.case1sForRadOncPhysicianId;
	}

	public void setCase1sForRadOncPhysicianId(Set case1sForRadOncPhysicianId) {
		this.case1sForRadOncPhysicianId = case1sForRadOncPhysicianId;
	}

	public Set getCasePhysicians() {
		return this.casePhysicians;
	}

	public void setCasePhysicians(Set casePhysicians) {
		this.casePhysicians = casePhysicians;
	}

	public Set getCommentsLikes() {
		return this.commentsLikes;
	}

	public void setCommentsLikes(Set commentsLikes) {
		this.commentsLikes = commentsLikes;
	}

	public Set getMedikmResourceses() {
		return this.medikmResourceses;
	}

	public void setMedikmResourceses(Set medikmResourceses) {
		this.medikmResourceses = medikmResourceses;
	}

	public Set getCase1sForSurgOncPhysicianId() {
		return this.case1sForSurgOncPhysicianId;
	}

	public void setCase1sForSurgOncPhysicianId(Set case1sForSurgOncPhysicianId) {
		this.case1sForSurgOncPhysicianId = case1sForSurgOncPhysicianId;
	}

	public Set getCaseResourceses() {
		return this.caseResourceses;
	}

	public void setCaseResourceses(Set caseResourceses) {
		this.caseResourceses = caseResourceses;
	}

	public Set getCase1sForMedOncPhysicianId() {
		return this.case1sForMedOncPhysicianId;
	}

	public void setCase1sForMedOncPhysicianId(Set case1sForMedOncPhysicianId) {
		this.case1sForMedOncPhysicianId = case1sForMedOncPhysicianId;
	}

	public Set getTbDiscussionForumAnsweres() {
		return this.tbDiscussionForumAnsweres;
	}

	public void setTbDiscussionForumAnsweres(Set tbDiscussionForumAnsweres) {
		this.tbDiscussionForumAnsweres = tbDiscussionForumAnsweres;
	}

	public Set getCase1sForReferingPhysiciaId() {
		return this.case1sForReferingPhysiciaId;
	}

	public void setCase1sForReferingPhysiciaId(Set case1sForReferingPhysiciaId) {
		this.case1sForReferingPhysiciaId = case1sForReferingPhysiciaId;
	}

	public Set getEncounterPhysicians() {
		return this.encounterPhysicians;
	}

	public void setEncounterPhysicians(Set encounterPhysicians) {
		this.encounterPhysicians = encounterPhysicians;
	}

	public Set getRecommendedPlanLikes() {
		return this.recommendedPlanLikes;
	}

	public void setRecommendedPlanLikes(Set recommendedPlanLikes) {
		this.recommendedPlanLikes = recommendedPlanLikes;
	}

	public Set getClinicalTrials() {
		return this.clinicalTrials;
	}

	public void setClinicalTrials(Set clinicalTrials) {
		this.clinicalTrials = clinicalTrials;
	}

	public Set getQuestionLikes() {
		return this.questionLikes;
	}

	public void setQuestionLikes(Set questionLikes) {
		this.questionLikes = questionLikes;
	}

	public Set getPathologies() {
		return this.pathologies;
	}

	public void setPathologies(Set pathologies) {
		this.pathologies = pathologies;
	}

	public Set getTestResultResources() {
		return this.testResultResources;
	}

	public void setTestResultResources(Set testResultResources) {
		this.testResultResources = testResultResources;
	}

	public Set getEpisodePhysicians() {
		return this.episodePhysicians;
	}

	public void setEpisodePhysicians(Set episodePhysicians) {
		this.episodePhysicians = episodePhysicians;
	}

	public Set getUserlogs() {
		return this.userlogs;
	}

	public void setUserlogs(Set userlogs) {
		this.userlogs = userlogs;
	}

	public Set getPhysicalExams() {
		return this.physicalExams;
	}

	public void setPhysicalExams(Set physicalExams) {
		this.physicalExams = physicalExams;
	}

}
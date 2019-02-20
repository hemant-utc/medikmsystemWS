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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "physician")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Physician.findAll", query = "SELECT p FROM Physician p")})
public class Physician implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Physician_Id")
    private Integer physicianId;
    @Column(name = "FNAME")
    private String fname;
    @Column(name = "MINIT")
    private String minit;
    @Basic(optional = false)
    @Column(name = "LNAME")
    private String lname;
    @Column(name = "Phy_Group")
    private String phyGroup;
    @Column(name = "EMailId")
    private String eMailId;
    @Column(name = "PhoneNo")
    private String phoneNo;
    @Column(name = "Profile_Image")
    private String profileImage;
    @JoinColumn(name = "Facility_Id", referencedColumnName = "Facility_Id")
    @ManyToOne
    private CareFacility facilityId;
    @JoinColumn(name = "Specialty", referencedColumnName = "Type_Id")
    @ManyToOne
    private PhysicianSpeciality specialty;
    @JoinColumn(name = "Disease_Type_Id", referencedColumnName = "Disease_Type_Id")
    @ManyToOne
    private DiseaseType diseaseTypeId;
    @JoinColumn(name = "Cancer_Type_Id", referencedColumnName = "Can_Type_Id")
    @ManyToOne
    private CancerType cancerTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "providerId")
    private Collection<CaseResources> caseResourcesCollection;
    @OneToMany(mappedBy = "trialPhysicianId")
    private Collection<ClinicalTrial> clinicalTrialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "physician")
    private Collection<CasePhysician> casePhysicianCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "physician")
    private Collection<EncounterPhysician> encounterPhysicianCollection;
    @OneToMany(mappedBy = "referingPhysiciaId")
    private Collection<Case1> case1Collection;
    @OneToMany(mappedBy = "medOncPhysicianId")
    private Collection<Case1> case1Collection1;
    @OneToMany(mappedBy = "radOncPhysicianId")
    private Collection<Case1> case1Collection2;
    @OneToMany(mappedBy = "plasticSurgeonId")
    private Collection<Case1> case1Collection3;
    @OneToMany(mappedBy = "surgOncPhysicianId")
    private Collection<Case1> case1Collection4;
    @OneToMany(mappedBy = "gynOncologist")
    private Collection<Case1> case1Collection5;
    @OneToMany(mappedBy = "pathologist")
    private Collection<Case1> case1Collection6;
    @OneToMany(mappedBy = "physicianId")
    private Collection<Userlog> userlogCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "physicianId")
    private Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "physician")
    private Collection<EpisodePhysician> episodePhysicianCollection;
    @OneToMany(mappedBy = "physicianId")
    private Collection<Pathology> pathologyCollection;
    @OneToMany(mappedBy = "providerID")
    private Collection<MedikmResources> medikmResourcesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<QuestionLike> questionLikeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<CommentsLike> commentsLikeCollection;
    @OneToMany(mappedBy = "physicianId")
    private Collection<TbDiscussionForumQuestion> tbDiscussionForumQuestionCollection;
    @OneToMany(mappedBy = "createdBy", cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    private Collection<Case1> createdCaseCollection;
    @OneToMany(mappedBy = "lastUpdatedBy", cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    private Collection<Case1> lastUpdatedCaseCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "physician")
    private Collection<QueryBuilder> queryBuilderCollection;
    public Physician() {
    }

    public Physician(Integer physicianId) {
        this.physicianId = physicianId;
    }

    public Physician(Integer physicianId, String lname) {
        this.physicianId = physicianId;
        this.lname = lname;
    }

    public Integer getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(Integer physicianId) {
        this.physicianId = physicianId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMinit() {
        return minit;
    }

    public void setMinit(String minit) {
        this.minit = minit;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhyGroup() {
        return phyGroup;
    }

    public void setPhyGroup(String phyGroup) {
        this.phyGroup = phyGroup;
    }

    public String getEMailId() {
        return eMailId;
    }

    public void setEMailId(String eMailId) {
        this.eMailId = eMailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public CareFacility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(CareFacility facilityId) {
        this.facilityId = facilityId;
    }

    public PhysicianSpeciality getSpecialty() {
        return specialty;
    }

    public void setSpecialty(PhysicianSpeciality specialty) {
        this.specialty = specialty;
    }

    public DiseaseType getDiseaseTypeId() {
        return diseaseTypeId;
    }

    public void setDiseaseTypeId(DiseaseType diseaseTypeId) {
        this.diseaseTypeId = diseaseTypeId;
    }

    public CancerType getCancerTypeId() {
        return cancerTypeId;
    }

    public void setCancerTypeId(CancerType cancerTypeId) {
        this.cancerTypeId = cancerTypeId;
    }

    @XmlTransient
    public Collection<CaseResources> getCaseResourcesCollection() {
        return caseResourcesCollection;
    }

    public void setCaseResourcesCollection(Collection<CaseResources> caseResourcesCollection) {
        this.caseResourcesCollection = caseResourcesCollection;
    }

    @XmlTransient
    public Collection<ClinicalTrial> getClinicalTrialCollection() {
        return clinicalTrialCollection;
    }

    public void setClinicalTrialCollection(Collection<ClinicalTrial> clinicalTrialCollection) {
        this.clinicalTrialCollection = clinicalTrialCollection;
    }

    @XmlTransient
    public Collection<CasePhysician> getCasePhysicianCollection() {
        return casePhysicianCollection;
    }

    public void setCasePhysicianCollection(Collection<CasePhysician> casePhysicianCollection) {
        this.casePhysicianCollection = casePhysicianCollection;
    }

    @XmlTransient
    public Collection<EncounterPhysician> getEncounterPhysicianCollection() {
        return encounterPhysicianCollection;
    }

    public void setEncounterPhysicianCollection(Collection<EncounterPhysician> encounterPhysicianCollection) {
        this.encounterPhysicianCollection = encounterPhysicianCollection;
    }

    @XmlTransient
    public Collection<Case1> getCase1Collection() {
        return case1Collection;
    }

    public void setCase1Collection(Collection<Case1> case1Collection) {
        this.case1Collection = case1Collection;
    }

    @XmlTransient
    public Collection<Case1> getCase1Collection1() {
        return case1Collection1;
    }

    public void setCase1Collection1(Collection<Case1> case1Collection1) {
        this.case1Collection1 = case1Collection1;
    }

    @XmlTransient
    public Collection<Case1> getCase1Collection2() {
        return case1Collection2;
    }

    public void setCase1Collection2(Collection<Case1> case1Collection2) {
        this.case1Collection2 = case1Collection2;
    }

    @XmlTransient
    public Collection<Case1> getCase1Collection3() {
        return case1Collection3;
    }

    public void setCase1Collection3(Collection<Case1> case1Collection3) {
        this.case1Collection3 = case1Collection3;
    }

    @XmlTransient
    public Collection<Case1> getCase1Collection4() {
        return case1Collection4;
    }

    public void setCase1Collection4(Collection<Case1> case1Collection4) {
        this.case1Collection4 = case1Collection4;
    }

    @XmlTransient
    public Collection<Userlog> getUserlogCollection() {
        return userlogCollection;
    }

    public void setUserlogCollection(Collection<Userlog> userlogCollection) {
        this.userlogCollection = userlogCollection;
    }

    @XmlTransient
    public Collection<TbDiscussionForumAnswere> getTbDiscussionForumAnswereCollection() {
        return tbDiscussionForumAnswereCollection;
    }

    public void setTbDiscussionForumAnswereCollection(Collection<TbDiscussionForumAnswere> tbDiscussionForumAnswereCollection) {
        this.tbDiscussionForumAnswereCollection = tbDiscussionForumAnswereCollection;
    }

    @XmlTransient
    public Collection<EpisodePhysician> getEpisodePhysicianCollection() {
        return episodePhysicianCollection;
    }

    public void setEpisodePhysicianCollection(Collection<EpisodePhysician> episodePhysicianCollection) {
        this.episodePhysicianCollection = episodePhysicianCollection;
    }

    @XmlTransient
    public Collection<Pathology> getPathologyCollection() {
        return pathologyCollection;
    }

    public void setPathologyCollection(Collection<Pathology> pathologyCollection) {
        this.pathologyCollection = pathologyCollection;
    }

    @XmlTransient
    public Collection<MedikmResources> getMedikmResourcesCollection() {
        return medikmResourcesCollection;
    }

    public void setMedikmResourcesCollection(Collection<MedikmResources> medikmResourcesCollection) {
        this.medikmResourcesCollection = medikmResourcesCollection;
    }

    @XmlTransient
    public Collection<QuestionLike> getQuestionLikeCollection() {
        return questionLikeCollection;
    }

    public void setQuestionLikeCollection(Collection<QuestionLike> questionLikeCollection) {
        this.questionLikeCollection = questionLikeCollection;
    }

    @XmlTransient
    public Collection<CommentsLike> getCommentsLikeCollection() {
        return commentsLikeCollection;
    }

    public void setCommentsLikeCollection(Collection<CommentsLike> commentsLikeCollection) {
        this.commentsLikeCollection = commentsLikeCollection;
    }

    

    @XmlTransient
    public Collection<TbDiscussionForumQuestion> getTbDiscussionForumQuestionCollection() {
        return tbDiscussionForumQuestionCollection;
    }

    public void setTbDiscussionForumQuestionCollection(Collection<TbDiscussionForumQuestion> tbDiscussionForumQuestionCollection) {
        this.tbDiscussionForumQuestionCollection = tbDiscussionForumQuestionCollection;
    }

    /**
	 * @return the createdCaseCollection
	 */
    @XmlTransient
	public Collection<Case1> getCreatedCaseCollection() {
		return createdCaseCollection;
	}

	/**
	 * @param createdCaseCollection the createdCaseCollection to set
	 */
	public void setCreatedCaseCollection(Collection<Case1> createdCaseCollection) {
		this.createdCaseCollection = createdCaseCollection;
	}

	/**
	 * @return the lastUpdatedCaseCollection
	 */
	@XmlTransient
	public Collection<Case1> getLastUpdatedCaseCollection() {
		return lastUpdatedCaseCollection;
	}

	/**
	 * @param lastUpdatedCaseCollection the lastUpdatedCaseCollection to set
	 */
	public void setLastUpdatedCaseCollection(
			Collection<Case1> lastUpdatedCaseCollection) {
		this.lastUpdatedCaseCollection = lastUpdatedCaseCollection;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (physicianId != null ? physicianId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Physician)) {
            return false;
        }
        Physician other = (Physician) object;
        if ((this.physicianId == null && other.physicianId != null) || (this.physicianId != null && !this.physicianId.equals(other.physicianId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.medikm.input.entity.Physician[ physicianId=" + physicianId + " ]";
    }

	/**
	 * @return the queryBuilderCollection
	 */
	public Collection<QueryBuilder> getQueryBuilderCollection() {
		return queryBuilderCollection;
	}

	/**
	 * @param queryBuilderCollection the queryBuilderCollection to set
	 */
	public void setQueryBuilderCollection(Collection<QueryBuilder> queryBuilderCollection) {
		this.queryBuilderCollection = queryBuilderCollection;
	}


    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "episode")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Episode.findAll", query = "SELECT e FROM Episode e") })
public class Episode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Episode_Id")
	private Integer episodeId;
	@Column(name = "First_Encounter_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date firstEncounterDt;
	@Column(name = "Last_Encounter_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastEncounterDt;
	@Column(name = "Dt_Remission")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtRemission;
	@Column(name = "Dt_Initial_Complaint")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtInitialComplaint;
	@Column(name = "Dt_Resolution_Complaints")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtResolutionComplaints;
	@Lob
	@Column(name = "Health_Problem_Type")
	private String healthProblemType;
	@Column(name = "Problem_Unset_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date problemUnsetDt;
	@Lob
	@Column(name = "Symptoms_Complaints_Experienced")
	private String symptomsComplaintsExperienced;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "EP_Height")
	private Double ePHeight;
	@Column(name = "EP_Weight")
	private Double ePWeight;
	@Column(name = "Side_Of_Cancer")
	private String sideOfCancer;
	@Column(name = "Cancer_Location")
	private String cancerLocation;
	@Column(name = "hrt")
	private Boolean hrt;
	@Column(name = "relative_intraoperative_findings")
	private String relativeIntraoperativeFindings;
	@Column(name = "imaging_findings")
	private String imagingFindings;
	@Column(name = "biopsy_findings")
	private String biopsyFindings;
	@Column(name = "pathology_findings")
	private String pathologyFindings;
	@Column(name = "frozen_section_findings")
	private String frozenSectionFindings;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "episodeId", fetch = FetchType.LAZY)
	private Collection<Encounter> encounterCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "episodeId", fetch = FetchType.LAZY)
	private Collection<TumorBoardDiscussion> tumorBoardDiscussionCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "episode", fetch = FetchType.LAZY)
	private Collection<TbDiscussionForum> tbDiscussionForumCollection;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "episode", fetch = FetchType.LAZY)
	private Chemotherapy chemotherapy;
	@JoinColumn(name = "Disease_Type", referencedColumnName = "Type_Id")
	@ManyToOne
	private DiseaseStatus diseaseType;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Case1 caseId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "episode", fetch = FetchType.LAZY)
	private Collection<EpisodePhysician> episodePhysicianCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "episodeId", fetch = FetchType.LAZY)
	private List<TumorBoardDiscussionQuestion> tumorBoardDiscussionQuestionList;

	// ------------------------new create by satish-------------
	@Lob
	@Column(name = "recommended_plan")
	private String recommendedPlan;
	// ------------------------new create by satish-------------

	@Column(name = "nextVisitDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date nextVisitDate;

	public Episode() {
	}

	public Collection<TbDiscussionForum> getTbDiscussionForumCollection() {
		return tbDiscussionForumCollection;
	}

	public void setTbDiscussionForumCollection(Collection<TbDiscussionForum> tbDiscussionForumCollection) {
		this.tbDiscussionForumCollection = tbDiscussionForumCollection;
	}

	public String getRecommendedPlan() {
		return recommendedPlan;
	}

	public void setRecommendedPlan(String recommendedPlan) {
		this.recommendedPlan = recommendedPlan;
	}

	public Episode(Integer episodeId) {
		this.episodeId = episodeId;
	}

	public Integer getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}

	public Date getFirstEncounterDt() {
		return firstEncounterDt;
	}

	public void setFirstEncounterDt(Date firstEncounterDt) {
		this.firstEncounterDt = firstEncounterDt;
	}

	public Date getLastEncounterDt() {
		return lastEncounterDt;
	}

	public void setLastEncounterDt(Date lastEncounterDt) {
		this.lastEncounterDt = lastEncounterDt;
	}

	public Date getDtRemission() {
		return dtRemission;
	}

	public void setDtRemission(Date dtRemission) {
		this.dtRemission = dtRemission;
	}

	public Date getNextVisitDate() {
		return nextVisitDate;
	}

	public void setNextVisitDate(Date nextVisitDate) {
		this.nextVisitDate = nextVisitDate;
	}

	public Date getDtInitialComplaint() {
		return dtInitialComplaint;
	}

	public void setDtInitialComplaint(Date dtInitialComplaint) {
		this.dtInitialComplaint = dtInitialComplaint;
	}

	public Date getDtResolutionComplaints() {
		return dtResolutionComplaints;
	}

	public void setDtResolutionComplaints(Date dtResolutionComplaints) {
		this.dtResolutionComplaints = dtResolutionComplaints;
	}

	public String getHealthProblemType() {
		return healthProblemType;
	}

	public void setHealthProblemType(String healthProblemType) {
		this.healthProblemType = healthProblemType;
	}

	public Date getProblemUnsetDt() {
		return problemUnsetDt;
	}

	public void setProblemUnsetDt(Date problemUnsetDt) {
		this.problemUnsetDt = problemUnsetDt;
	}

	public String getSymptomsComplaintsExperienced() {
		return symptomsComplaintsExperienced;
	}

	public void setSymptomsComplaintsExperienced(String symptomsComplaintsExperienced) {
		this.symptomsComplaintsExperienced = symptomsComplaintsExperienced;
	}

	public Double getEPHeight() {
		return ePHeight;
	}

	public void setEPHeight(Double ePHeight) {
		this.ePHeight = ePHeight;
	}

	public Double getEPWeight() {
		return ePWeight;
	}

	public void setEPWeight(Double ePWeight) {
		this.ePWeight = ePWeight;
	}

	public String getSideOfCancer() {
		return sideOfCancer;
	}

	public void setSideOfCancer(String sideOfCancer) {
		this.sideOfCancer = sideOfCancer;
	}

	public String getCancerLocation() {
		return cancerLocation;
	}

	public void setCancerLocation(String cancerLocation) {
		this.cancerLocation = cancerLocation;
	}

	@XmlTransient
	public Collection<Encounter> getEncounterCollection() {
		return encounterCollection;
	}

	public void setEncounterCollection(Collection<Encounter> encounterCollection) {
		this.encounterCollection = encounterCollection;
	}

	@XmlTransient
	public Collection<TumorBoardDiscussion> getTumorBoardDiscussionCollection() {
		return tumorBoardDiscussionCollection;
	}

	public void setTumorBoardDiscussionCollection(Collection<TumorBoardDiscussion> tumorBoardDiscussionCollection) {
		this.tumorBoardDiscussionCollection = tumorBoardDiscussionCollection;
	}

	public Chemotherapy getChemotherapy() {
		return chemotherapy;
	}

	public void setChemotherapy(Chemotherapy chemotherapy) {
		this.chemotherapy = chemotherapy;
	}

	public DiseaseStatus getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(DiseaseStatus diseaseType) {
		this.diseaseType = diseaseType;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	@XmlTransient
	public Collection<EpisodePhysician> getEpisodePhysicianCollection() {
		return episodePhysicianCollection;
	}

	public void setEpisodePhysicianCollection(Collection<EpisodePhysician> episodePhysicianCollection) {
		this.episodePhysicianCollection = episodePhysicianCollection;
	}

	/**
	 * @return the relativeIntraoperativeFindings
	 */
	public String getRelativeIntraoperativeFindings() {
		return relativeIntraoperativeFindings;
	}

	/**
	 * @param relativeIntraoperativeFindings
	 *            the relativeIntraoperativeFindings to set
	 */
	public void setRelativeIntraoperativeFindings(String relativeIntraoperativeFindings) {
		this.relativeIntraoperativeFindings = relativeIntraoperativeFindings;
	}

	/**
	 * @return the imagingFindings
	 */
	public String getImagingFindings() {
		return imagingFindings;
	}

	/**
	 * @param imagingFindings
	 *            the imagingFindings to set
	 */
	public void setImagingFindings(String imagingFindings) {
		this.imagingFindings = imagingFindings;
	}

	/**
	 * @return the hrt
	 */
	public Boolean getHrt() {
		return hrt;
	}

	/**
	 * @param hrt
	 *            the hrt to set
	 */
	public void setHrt(Boolean hrt) {
		this.hrt = hrt;
	}

	/**
	 * @return the biopsyFindings
	 */
	public String getBiopsyFindings() {
		return biopsyFindings;
	}

	/**
	 * @param biopsyFindings
	 *            the biopsyFindings to set
	 */
	public void setBiopsyFindings(String biopsyFindings) {
		this.biopsyFindings = biopsyFindings;
	}

	/**
	 * @return the pathologyFindings
	 */
	public String getPathologyFindings() {
		return pathologyFindings;
	}

	/**
	 * @param pathologyFindings
	 *            the pathologyFindings to set
	 */
	public void setPathologyFindings(String pathologyFindings) {
		this.pathologyFindings = pathologyFindings;
	}

	/**
	 * @return the frozenSectionFindings
	 */
	public String getFrozenSectionFindings() {
		return frozenSectionFindings;
	}

	/**
	 * @param frozenSectionFindings
	 *            the frozenSectionFindings to set
	 */
	public void setFrozenSectionFindings(String frozenSectionFindings) {
		this.frozenSectionFindings = frozenSectionFindings;
	}

	/**
	 * @return the tumorBoardDiscussionQuestionList
	 */
	public List<TumorBoardDiscussionQuestion> getTumorBoardDiscussionQuestionList() {
		return tumorBoardDiscussionQuestionList;
	}

	/**
	 * @param tumorBoardDiscussionQuestionList
	 *            the tumorBoardDiscussionQuestionList to set
	 */
	public void setTumorBoardDiscussionQuestionList(
			List<TumorBoardDiscussionQuestion> tumorBoardDiscussionQuestionList) {
		this.tumorBoardDiscussionQuestionList = tumorBoardDiscussionQuestionList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (episodeId != null ? episodeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Episode)) {
			return false;
		}
		Episode other = (Episode) object;
		if ((this.episodeId == null && other.episodeId != null)
				|| (this.episodeId != null && !this.episodeId.equals(other.episodeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Episode[ episodeId=" + episodeId + " ]";
	}

}

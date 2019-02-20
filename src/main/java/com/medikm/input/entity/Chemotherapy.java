/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "chemotherapy")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Chemotherapy.findAll", query = "SELECT c FROM Chemotherapy c") })
public class Chemotherapy implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ChemotherapyPK chemotherapyPK;
	@Column(name = "Base_Line_MegaScan")
	private Short baseLineMegaScan;
	@Lob
	@Column(name = "Base_Line_MegaScan_Comm")
	private String baseLineMegaScanComm;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "Pretreatment_Weight")
	private Double pretreatmentWeight;
	@Column(name = "Post_Treatment_Weight")
	private Double postTreatmentWeight;
	@Column(name = "Start_Dt_Ctpy")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDtCtpy;
	@Column(name = "End_Dt_Ctpy")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDtCtpy;
	@Column(name = "Ctpy_Route")
	private Double ctpyRoute;
	@Column(name = "Ctp_Dose")
	private Double ctpDose;
	@Column(name = "Dose_Reduction_Needed")
	private Short doseReductionNeeded;
	@Column(name = "No_Cycles_Administered")
	private Short noCyclesAdministered;
	@Column(name = "Enrolled_Clinical_Trial")
	private Short enrolledClinicalTrial;
	@Column(name = "Eligible_Clinical_Trial")
	private Short eligibleClinicalTrial;
	@Column(name = "Side_Effects_Experienced")
	private Short sideEffectsExperienced;
	@Lob
	@Column(name = "Side_Effects_Experienced_Comm")
	private String sideEffectsExperiencedComm;
	@Column(name = "Allergic_Events")
	private Short allergicEvents;
	@Lob
	@Column(name = "Allergic_Events_Comm")
	private String allergicEventsComm;
	@Column(name = "Antracyclines_Administered")
	private Short antracyclinesAdministered;
	@Column(name = "Antracyclines_Administered_Dose")
	private Double antracyclinesAdministeredDose;
	@Column(name = "Hospitalization_Toxicity_During_Treatment")
	private Short hospitalizationToxicityDuringTreatment;
	@Column(name = "Neurotoxicity_Impairs_Activities_Daily_Living")
	private Short neurotoxicityImpairsActivitiesDailyLiving;
	@Column(name = "Cardiotoxicity")
	private Short cardiotoxicity;
	@Lob
	@Column(name = "Cardiotoxicity_Comm")
	private String cardiotoxicityComm;
	@Column(name = "Post_Chemo_MagaScan")
	private Short postChemoMagaScan;
	@Lob
	@Column(name = "Post_Chemo_MagaScan_Comm")
	private String postChemoMagaScanComm;
	@Lob
	@Column(name = "Reason_Stopping_Ctpy")
	private String reasonStoppingCtpy;
	@Column(name = "Pretreatment_Platelet_Count")
	private Short pretreatmentPlateletCount;
	@Lob
	@Column(name = "Pretreatment_Platelet_Count_Comm")
	private String pretreatmentPlateletCountComm;
	@Column(name = "Treatment_Related_Anemia")
	private Short treatmentRelatedAnemia;
	@Column(name = "Treatment_Related_Neutropenia")
	private Short treatmentRelatedNeutropenia;
	@Column(name = "Treatment_Related_Trombocytopenia")
	private Short treatmentRelatedTrombocytopenia;
	@Column(name = "Treatment_Related_Lymphocytopenia")
	private Short treatmentRelatedLymphocytopenia;
	@Column(name = "Palliative_Line")
	private Integer palliativeLine;
	@Column(name = "ChemoResponse")
	private String chemoResponse;
	@Column(name = "Radiosensitising")
	private Integer radiosensitising;
	@Column(name = "Chemo_Stop_Reason")
	private String chemoStopReason;
	@Column(name = "Chemo_Intension")
	private String chemoIntension;
	@Column(name = "ChemoCompid")
	private Integer chemoCompid;
	@JoinColumn(name = "Ctpy_Type_Id", referencedColumnName = "Type_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private ChemoType chemoType;
	@JoinColumn(name = "Ctpy_Agent_Id", referencedColumnName = "Agent_Id")
	@ManyToOne
	private ChemoAgent ctpyAgentId;
	@JoinColumn(name = "Ctpy_Protocol_Id", referencedColumnName = "Protocol_Id")
	@ManyToOne
	private ChemoProtocol ctpyProtocolId;
	@JoinColumn(name = "Eligible_Clinical_Trial_ID", referencedColumnName = "Clinical_Trial_Id")
	@ManyToOne
	private ClinicalTrial eligibleClinicalTrialID;
	@JoinColumn(name = "Case_Id", referencedColumnName = "Case_Id")
	@ManyToOne
	private Case1 caseId;
	@JoinColumn(name = "Enrolled_Clinical_Trial_ID", referencedColumnName = "Clinical_Trial_Id")
	@ManyToOne
	private ClinicalTrial enrolledClinicalTrialID;
	@JoinColumn(name = "Episode_Id", referencedColumnName = "Episode_Id", insertable = false, updatable = false)
	@OneToOne(optional = false)
	private Episode episode;

	public Chemotherapy() {
	}

	public Chemotherapy(ChemotherapyPK chemotherapyPK) {
		this.chemotherapyPK = chemotherapyPK;
	}

	public Chemotherapy(int episodeId, int ctpyTypeId) {
		this.chemotherapyPK = new ChemotherapyPK(episodeId, ctpyTypeId);
	}

	public ChemotherapyPK getChemotherapyPK() {
		return chemotherapyPK;
	}

	public void setChemotherapyPK(ChemotherapyPK chemotherapyPK) {
		this.chemotherapyPK = chemotherapyPK;
	}

	public Short getBaseLineMegaScan() {
		return baseLineMegaScan;
	}

	public void setBaseLineMegaScan(Short baseLineMegaScan) {
		this.baseLineMegaScan = baseLineMegaScan;
	}

	public String getBaseLineMegaScanComm() {
		return baseLineMegaScanComm;
	}

	public void setBaseLineMegaScanComm(String baseLineMegaScanComm) {
		this.baseLineMegaScanComm = baseLineMegaScanComm;
	}

	public Double getPretreatmentWeight() {
		return pretreatmentWeight;
	}

	public void setPretreatmentWeight(Double pretreatmentWeight) {
		this.pretreatmentWeight = pretreatmentWeight;
	}

	public Double getPostTreatmentWeight() {
		return postTreatmentWeight;
	}

	public void setPostTreatmentWeight(Double postTreatmentWeight) {
		this.postTreatmentWeight = postTreatmentWeight;
	}

	public Date getStartDtCtpy() {
		return startDtCtpy;
	}

	public void setStartDtCtpy(Date startDtCtpy) {
		this.startDtCtpy = startDtCtpy;
	}

	public Date getEndDtCtpy() {
		return endDtCtpy;
	}

	public void setEndDtCtpy(Date endDtCtpy) {
		this.endDtCtpy = endDtCtpy;
	}

	public Double getCtpyRoute() {
		return ctpyRoute;
	}

	public void setCtpyRoute(Double ctpyRoute) {
		this.ctpyRoute = ctpyRoute;
	}

	public Double getCtpDose() {
		return ctpDose;
	}

	public void setCtpDose(Double ctpDose) {
		this.ctpDose = ctpDose;
	}

	public Short getDoseReductionNeeded() {
		return doseReductionNeeded;
	}

	public void setDoseReductionNeeded(Short doseReductionNeeded) {
		this.doseReductionNeeded = doseReductionNeeded;
	}

	public Short getNoCyclesAdministered() {
		return noCyclesAdministered;
	}

	public void setNoCyclesAdministered(Short noCyclesAdministered) {
		this.noCyclesAdministered = noCyclesAdministered;
	}

	public Short getEnrolledClinicalTrial() {
		return enrolledClinicalTrial;
	}

	public void setEnrolledClinicalTrial(Short enrolledClinicalTrial) {
		this.enrolledClinicalTrial = enrolledClinicalTrial;
	}

	public Short getEligibleClinicalTrial() {
		return eligibleClinicalTrial;
	}

	public void setEligibleClinicalTrial(Short eligibleClinicalTrial) {
		this.eligibleClinicalTrial = eligibleClinicalTrial;
	}

	public Short getSideEffectsExperienced() {
		return sideEffectsExperienced;
	}

	public void setSideEffectsExperienced(Short sideEffectsExperienced) {
		this.sideEffectsExperienced = sideEffectsExperienced;
	}

	public String getSideEffectsExperiencedComm() {
		return sideEffectsExperiencedComm;
	}

	public void setSideEffectsExperiencedComm(String sideEffectsExperiencedComm) {
		this.sideEffectsExperiencedComm = sideEffectsExperiencedComm;
	}

	public Short getAllergicEvents() {
		return allergicEvents;
	}

	public void setAllergicEvents(Short allergicEvents) {
		this.allergicEvents = allergicEvents;
	}

	public String getAllergicEventsComm() {
		return allergicEventsComm;
	}

	public void setAllergicEventsComm(String allergicEventsComm) {
		this.allergicEventsComm = allergicEventsComm;
	}

	public Short getAntracyclinesAdministered() {
		return antracyclinesAdministered;
	}

	public void setAntracyclinesAdministered(Short antracyclinesAdministered) {
		this.antracyclinesAdministered = antracyclinesAdministered;
	}

	public Double getAntracyclinesAdministeredDose() {
		return antracyclinesAdministeredDose;
	}

	public void setAntracyclinesAdministeredDose(Double antracyclinesAdministeredDose) {
		this.antracyclinesAdministeredDose = antracyclinesAdministeredDose;
	}

	public Short getHospitalizationToxicityDuringTreatment() {
		return hospitalizationToxicityDuringTreatment;
	}

	public void setHospitalizationToxicityDuringTreatment(Short hospitalizationToxicityDuringTreatment) {
		this.hospitalizationToxicityDuringTreatment = hospitalizationToxicityDuringTreatment;
	}

	public Short getNeurotoxicityImpairsActivitiesDailyLiving() {
		return neurotoxicityImpairsActivitiesDailyLiving;
	}

	public void setNeurotoxicityImpairsActivitiesDailyLiving(Short neurotoxicityImpairsActivitiesDailyLiving) {
		this.neurotoxicityImpairsActivitiesDailyLiving = neurotoxicityImpairsActivitiesDailyLiving;
	}

	public Short getCardiotoxicity() {
		return cardiotoxicity;
	}

	public void setCardiotoxicity(Short cardiotoxicity) {
		this.cardiotoxicity = cardiotoxicity;
	}

	public String getCardiotoxicityComm() {
		return cardiotoxicityComm;
	}

	public void setCardiotoxicityComm(String cardiotoxicityComm) {
		this.cardiotoxicityComm = cardiotoxicityComm;
	}

	public Short getPostChemoMagaScan() {
		return postChemoMagaScan;
	}

	public void setPostChemoMagaScan(Short postChemoMagaScan) {
		this.postChemoMagaScan = postChemoMagaScan;
	}

	public String getPostChemoMagaScanComm() {
		return postChemoMagaScanComm;
	}

	public void setPostChemoMagaScanComm(String postChemoMagaScanComm) {
		this.postChemoMagaScanComm = postChemoMagaScanComm;
	}

	public String getReasonStoppingCtpy() {
		return reasonStoppingCtpy;
	}

	public void setReasonStoppingCtpy(String reasonStoppingCtpy) {
		this.reasonStoppingCtpy = reasonStoppingCtpy;
	}

	public Short getPretreatmentPlateletCount() {
		return pretreatmentPlateletCount;
	}

	public void setPretreatmentPlateletCount(Short pretreatmentPlateletCount) {
		this.pretreatmentPlateletCount = pretreatmentPlateletCount;
	}

	public String getPretreatmentPlateletCountComm() {
		return pretreatmentPlateletCountComm;
	}

	public void setPretreatmentPlateletCountComm(String pretreatmentPlateletCountComm) {
		this.pretreatmentPlateletCountComm = pretreatmentPlateletCountComm;
	}

	public Short getTreatmentRelatedAnemia() {
		return treatmentRelatedAnemia;
	}

	public void setTreatmentRelatedAnemia(Short treatmentRelatedAnemia) {
		this.treatmentRelatedAnemia = treatmentRelatedAnemia;
	}

	public Short getTreatmentRelatedNeutropenia() {
		return treatmentRelatedNeutropenia;
	}

	public void setTreatmentRelatedNeutropenia(Short treatmentRelatedNeutropenia) {
		this.treatmentRelatedNeutropenia = treatmentRelatedNeutropenia;
	}

	public Short getTreatmentRelatedTrombocytopenia() {
		return treatmentRelatedTrombocytopenia;
	}

	public void setTreatmentRelatedTrombocytopenia(Short treatmentRelatedTrombocytopenia) {
		this.treatmentRelatedTrombocytopenia = treatmentRelatedTrombocytopenia;
	}

	public Short getTreatmentRelatedLymphocytopenia() {
		return treatmentRelatedLymphocytopenia;
	}

	public void setTreatmentRelatedLymphocytopenia(Short treatmentRelatedLymphocytopenia) {
		this.treatmentRelatedLymphocytopenia = treatmentRelatedLymphocytopenia;
	}

	public Integer getPalliativeLine() {
		return palliativeLine;
	}

	public void setPalliativeLine(Integer palliativeLine) {
		this.palliativeLine = palliativeLine;
	}

	public String getChemoResponse() {
		return chemoResponse;
	}

	public void setChemoResponse(String chemoResponse) {
		this.chemoResponse = chemoResponse;
	}

	public Integer getRadiosensitising() {
		return radiosensitising;
	}

	public void setRadiosensitising(Integer radiosensitising) {
		this.radiosensitising = radiosensitising;
	}

	public String getChemoStopReason() {
		return chemoStopReason;
	}

	public void setChemoStopReason(String chemoStopReason) {
		this.chemoStopReason = chemoStopReason;
	}

	public String getChemoIntension() {
		return chemoIntension;
	}

	public void setChemoIntension(String chemoIntension) {
		this.chemoIntension = chemoIntension;
	}

	public Integer getChemoCompid() {
		return chemoCompid;
	}

	public void setChemoCompid(Integer chemoCompid) {
		this.chemoCompid = chemoCompid;
	}

	public ChemoType getChemoType() {
		return chemoType;
	}

	public void setChemoType(ChemoType chemoType) {
		this.chemoType = chemoType;
	}

	public ChemoAgent getCtpyAgentId() {
		return ctpyAgentId;
	}

	public void setCtpyAgentId(ChemoAgent ctpyAgentId) {
		this.ctpyAgentId = ctpyAgentId;
	}

	public ChemoProtocol getCtpyProtocolId() {
		return ctpyProtocolId;
	}

	public void setCtpyProtocolId(ChemoProtocol ctpyProtocolId) {
		this.ctpyProtocolId = ctpyProtocolId;
	}

	public ClinicalTrial getEligibleClinicalTrialID() {
		return eligibleClinicalTrialID;
	}

	public void setEligibleClinicalTrialID(ClinicalTrial eligibleClinicalTrialID) {
		this.eligibleClinicalTrialID = eligibleClinicalTrialID;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public ClinicalTrial getEnrolledClinicalTrialID() {
		return enrolledClinicalTrialID;
	}

	public void setEnrolledClinicalTrialID(ClinicalTrial enrolledClinicalTrialID) {
		this.enrolledClinicalTrialID = enrolledClinicalTrialID;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (chemotherapyPK != null ? chemotherapyPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Chemotherapy)) {
			return false;
		}
		Chemotherapy other = (Chemotherapy) object;
		if ((this.chemotherapyPK == null && other.chemotherapyPK != null)
				|| (this.chemotherapyPK != null && !this.chemotherapyPK.equals(other.chemotherapyPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Chemotherapy[ chemotherapyPK=" + chemotherapyPK + " ]";
	}

}

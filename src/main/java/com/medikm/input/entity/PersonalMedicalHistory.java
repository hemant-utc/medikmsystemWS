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
import javax.persistence.FetchType;
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
@Table(name = "personal_medical_history")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "PersonalMedicalHistory.findAll", query = "SELECT p FROM PersonalMedicalHistory p") })
public class PersonalMedicalHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected PersonalMedicalHistoryPK personalMedicalHistoryPK;
	@Column(name = "Previous_Cancer")
	private Short previousCancer;
	@Column(name = "PrCa_Diagnosis_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date prCaDiagnosisDt;
	@Column(name = "PrCa_Clear_Surgical_Margins")
	private Short prCaClearSurgicalMargins;
	@Column(name = "PC_Histological_Grade")
	private Integer pCHistologicalGrade;
	@Column(name = "PC_ER_Status")
	private String pCERStatus;
	@Column(name = "PC_PR_Status")
	private String pCPRStatus;
	@Column(name = "PC_HER2neu_Status")
	private String pCHER2neuStatus;
	@Column(name = "PC_HER2neu_SISH")
	private String pCHER2neuSISH;
	@Column(name = "PC_Surgery")
	private Short pCSurgery;
	@Lob
	@Column(name = "PC_Surgery_Comm")
	private String pCSurgeryComm;
	@Column(name = "PC_Chemo")
	private Short pCChemo;
	@Lob
	@Column(name = "PC_Chemo_Comm")
	private String pCChemoComm;
	@Column(name = "PC_RT")
	private Short pcRt;
	@Lob
	@Column(name = "PC_RT_Comm")
	private String pCRTComm;
	@Column(name = "PC_Endocrine_Therapy")
	private Short pCEndocrineTherapy;
	@Lob
	@Column(name = "PC_Endocrine_Therapy_Comm")
	private String pCEndocrineTherapyComm;
	@Column(name = "PC_Targeted_Therapy")
	private Short pCTargetedTherapy;
	@Lob
	@Column(name = "PC_Targeted_Therapy_Comm")
	private String pCTargetedTherapyComm;
	@Column(name = "PC_Biopsy")
	private Short pCBiopsy;
	@Lob
	@Column(name = "PC_Biopsy_Comm")
	private String pCBiopsyComm;
	@Column(name = "No_PC_Biopsies")
	private Integer noPCBiopsies;
	@Column(name = "Atypical_Hyperplasia_Breast_Biopsy")
	private Short atypicalHyperplasiaBreastBiopsy;
	@Column(name = "Hormone_Replacement_Therapy_Use")
	private Short hormoneReplacementTherapyUse;
	@Lob
	@Column(name = "Hormone_Replacement_Therapy_Use_Comm")
	private String hormoneReplacementTherapyUseComm;
	@Column(name = "Histerectomy")
	private Short histerectomy;
	@Column(name = "Ovariectomy")
	private Short ovariectomy;
	@Lob
	@Column(name = "Ovariectomy_Comm")
	private String ovariectomyComm;
	@Column(name = "Chest_Wall_Radiation")
	private Short chestWallRadiation;
	@Lob
	@Column(name = "Chest_Wall_Radiation_Comm")
	private String chestWallRadiationComm;
	@Column(name = "Radiation_Therapy_During_Pregnancy")
	private Short radiationTherapyDuringPregnancy;
	@Lob
	@Column(name = "Radiation_Therapy_During_Pregnancy_Comm")
	private String radiationTherapyDuringPregnancyComm;
	@Column(name = "Hormone_Manipulation_Therapy")
	private Short hormoneManipulationTherapy;
	@Lob
	@Column(name = "Major_Comorbidities")
	private String majorComorbidities;
	@Column(name = "Active_Connective_Tissue_Disease_Involving_Skin")
	private Short activeConnectiveTissueDiseaseInvolvingSkin;
	@Column(name = "Ovarian_Cancer")
	private Short ovarianCancer;
	@Column(name = "Previous_Other_Cancer")
	private String previousOtherCancer;
	@Column(name = "Thryroid_Disease")
	private Short thryroidDisease;
	@Lob
	@Column(name = "Thryroid_Disease_Comm")
	private String thryroidDiseaseComm;
	@Column(name = "Uterine_Fibroids")
	private Short uterineFibroids;
	@Column(name = "Perez_Jager_Disease")
	private Short perezJagerDisease;
	@Column(name = "Hamartomas")
	private Short hamartomas;
	@Column(name = "Autuimmune_Disease")
	private Short autuimmuneDisease;
	@Lob
	@Column(name = "Autuimmune_Disease_Comm")
	private String autuimmuneDiseaseComm;
	@Column(name = "Prostate_Disease")
	private Short prostateDisease;
	@Lob
	@Column(name = "Prostate_Disease_Comm")
	private String prostateDiseaseComm;
	@Column(name = "Synchronous_Primary_Breast_Cancer")
	private Short synchronousPrimaryBreastCancer;
	@Column(name = "Bilateral_BC")
	private Short bilateralBC;
	@Column(name = "Alcohol_Intake")
	private Short alcoholIntake;
	@Column(name = "Smoking_History")
	private Short smokingHistory;
	@Column(name = "Antracycline_Administered")
	private Short antracyclineAdministered;
	@Lob
	@Column(name = "Antracycline_Administered_Comm")
	private String antracyclineAdministeredComm;
	@Column(name = "Treatment_Related_Toxicity")
	private Short treatmentRelatedToxicity;
	@Lob
	@Column(name = "Treatment_Related_Toxicity_Comm")
	private String treatmentRelatedToxicityComm;
	@Column(name = "Benign_Breast_Disease")
	private Boolean benignBreastDisease;
	@Column(name = "Prior_Thoracic_RT")
	private Boolean priorThoracicRT;
	@Column(name = "Mutations")
	private Boolean mutations;
	@Column(name = "HxRenalFail")
	private Integer hxRenalFail;
	@Column(name = "Hx_VHL")
	private Integer hxVHL;
	@Column(name = "Hx_Prev_Cancer")
	private Integer hxPrevCancer;
	@Column(name = "Current_Smoker")
	private Integer currentSmoker;
	@Column(name = "NoYrSmoked")
	private Integer noYrSmoked;
	@Column(name = "NoPackSmokePDay")
	private Integer noPackSmokePDay;
	@Column(name = "PastSurgHx")
	private Integer pastSurgHx;
	@Column(name = "No_Prior_Abdominal_Sur")
	private Integer noPriorAbdominalSur;
	@Column(name = "CigPackYear")
	private Character cigPackYear;
	@Column(name = "Hypertention")
	private Integer hypertention;
	@Column(name = "pulmHypertn")
	private Integer pulmHypertn;
	@Column(name = "Diabetes")
	private Integer diabetes;
	@Column(name = "DiabCtrl")
	private Integer diabCtrl;
	@Column(name = "Dialysis")
	private Integer dialysis;
	@Column(name = "HemoglobinLst")
	private Character hemoglobinLst;
	@Column(name = "COPD")
	private Integer copd;
	@Column(name = "Hist_Gen_Syn_Bone")
	private Integer histGenSynBone;
	@Column(name = "Hist_Sarcoma")
	private Integer histSarcoma;
	@Column(name = "Hist_Mass")
	private Integer histMass;
	@Column(name = "Hist_Pain")
	private Integer histPain;
	@Column(name = "Hist_Path_Fracture")
	private Integer histPathFracture;
	@Column(name = "Prior_Chemo_Curative_No")
	private Integer priorChemoCurativeNo;
	@Column(name = "prior_Chemo_Palliative_No")
	private Integer priorChemoPalliativeNo;
	@Column(name = "Prior_Radio_Cura_No")
	private Integer priorRadioCuraNo;
	@Column(name = "Prior_Radio_Palliative_No")
	private Integer priorRadioPalliativeNo;
	@Column(name = "Prior_Surgery_No")
	private Integer priorSurgeryNo;
	@Column(name = "Prior_Cong_Inher_Syndrone")
	private Integer priorCongInherSyndrone;
	@Column(name = "Radio_Therapy_Exp")
	private Integer radioTherapyExp;
	@Column(name = "NoYrQuitSmoke")
	private Integer noYrQuitSmoke;
	@Column(name = "personal_medical_history_comments")
	private String comments;
	@Column(name = "other_history")
	private String otherHistory;
	@Column(name = "trauma_hx")
	private Short traumaHx;
	@Column(name = "rt_hx")
	private Short rtHx;
	@Column(name = "toxic_chemicals")
	private Short toxicChemicals;
	@Column(name = "adequate_Previous_Surgery")
	private Short adequatePreviousSurgery;
	@Column(name = "clinical_Presentation")
	private Short clinicalPresentation;
	@Column(name = "incidental_Finding")
	private Short incidentalFinding;
	@Column(name = "bmi")
	private String bmi;
	@Column(name = "calcium_level")
	private Integer calciumLevel;
	@Column(name = "cadmium_level")
	private Integer cadmiumLevel;
	@Column(name = "prostatitis")
	private Boolean prostatitis;
	@JoinColumn(name = "symptoms", referencedColumnName = "Symptoms_Id")
	@ManyToOne
	private Symptoms symptoms;
	@JoinColumn(name = "Cancer_Sub_Type", referencedColumnName = "Can_Sub_Type_Id")
	@ManyToOne
	private CancerSubType cancerSubType;
	@JoinColumn(name = "Cancer_Type", referencedColumnName = "Can_Type_Id")
	@ManyToOne
	private CancerType cancerType;
	@JoinColumn(name = "PrCa_Working_TNM", referencedColumnName = "Stage_Id")
	@ManyToOne
	private TnmStage prCaWorkingTNM;
	@JoinColumn(name = "PrCa_TNM", referencedColumnName = "Stage_Id")
	@ManyToOne
	private TnmStage prCaTNM;
	@JoinColumn(name = "Patient_Id", referencedColumnName = "Patient_Id", insertable = false, updatable = false)
	@OneToOne(optional = false, fetch = FetchType.LAZY)
	private Patient patient;

	public PersonalMedicalHistory() {
	}

	public PersonalMedicalHistory(PersonalMedicalHistoryPK personalMedicalHistoryPK) {
		this.personalMedicalHistoryPK = personalMedicalHistoryPK;
	}

	public PersonalMedicalHistory(int patientId, Date medHistDate) {
		this.personalMedicalHistoryPK = new PersonalMedicalHistoryPK(patientId, medHistDate);
	}

	public PersonalMedicalHistoryPK getPersonalMedicalHistoryPK() {
		return personalMedicalHistoryPK;
	}

	public void setPersonalMedicalHistoryPK(PersonalMedicalHistoryPK personalMedicalHistoryPK) {
		this.personalMedicalHistoryPK = personalMedicalHistoryPK;
	}

	public Short getPreviousCancer() {
		return previousCancer;
	}

	public void setPreviousCancer(Short previousCancer) {
		this.previousCancer = previousCancer;
	}

	public Date getPrCaDiagnosisDt() {
		return prCaDiagnosisDt;
	}

	public void setPrCaDiagnosisDt(Date prCaDiagnosisDt) {
		this.prCaDiagnosisDt = prCaDiagnosisDt;
	}

	public Short getPrCaClearSurgicalMargins() {
		return prCaClearSurgicalMargins;
	}

	public void setPrCaClearSurgicalMargins(Short prCaClearSurgicalMargins) {
		this.prCaClearSurgicalMargins = prCaClearSurgicalMargins;
	}

	public Integer getPCHistologicalGrade() {
		return pCHistologicalGrade;
	}

	public void setPCHistologicalGrade(Integer pCHistologicalGrade) {
		this.pCHistologicalGrade = pCHistologicalGrade;
	}

	public String getPCERStatus() {
		return pCERStatus;
	}

	public void setPCERStatus(String pCERStatus) {
		this.pCERStatus = pCERStatus;
	}

	public String getPCPRStatus() {
		return pCPRStatus;
	}

	public void setPCPRStatus(String pCPRStatus) {
		this.pCPRStatus = pCPRStatus;
	}

	public String getPCHER2neuStatus() {
		return pCHER2neuStatus;
	}

	public void setPCHER2neuStatus(String pCHER2neuStatus) {
		this.pCHER2neuStatus = pCHER2neuStatus;
	}

	public String getPCHER2neuSISH() {
		return pCHER2neuSISH;
	}

	public void setPCHER2neuSISH(String pCHER2neuSISH) {
		this.pCHER2neuSISH = pCHER2neuSISH;
	}

	public Short getPCSurgery() {
		return pCSurgery;
	}

	public void setPCSurgery(Short pCSurgery) {
		this.pCSurgery = pCSurgery;
	}

	public String getPCSurgeryComm() {
		return pCSurgeryComm;
	}

	public void setPCSurgeryComm(String pCSurgeryComm) {
		this.pCSurgeryComm = pCSurgeryComm;
	}

	public Short getPCChemo() {
		return pCChemo;
	}

	public void setPCChemo(Short pCChemo) {
		this.pCChemo = pCChemo;
	}

	public String getPCChemoComm() {
		return pCChemoComm;
	}

	public void setPCChemoComm(String pCChemoComm) {
		this.pCChemoComm = pCChemoComm;
	}

	public Short getPcRt() {
		return pcRt;
	}

	public void setPcRt(Short pcRt) {
		this.pcRt = pcRt;
	}

	public String getPCRTComm() {
		return pCRTComm;
	}

	public void setPCRTComm(String pCRTComm) {
		this.pCRTComm = pCRTComm;
	}

	public Short getPCEndocrineTherapy() {
		return pCEndocrineTherapy;
	}

	public void setPCEndocrineTherapy(Short pCEndocrineTherapy) {
		this.pCEndocrineTherapy = pCEndocrineTherapy;
	}

	public String getPCEndocrineTherapyComm() {
		return pCEndocrineTherapyComm;
	}

	public void setPCEndocrineTherapyComm(String pCEndocrineTherapyComm) {
		this.pCEndocrineTherapyComm = pCEndocrineTherapyComm;
	}

	public Short getPCTargetedTherapy() {
		return pCTargetedTherapy;
	}

	public void setPCTargetedTherapy(Short pCTargetedTherapy) {
		this.pCTargetedTherapy = pCTargetedTherapy;
	}

	public String getPCTargetedTherapyComm() {
		return pCTargetedTherapyComm;
	}

	public void setPCTargetedTherapyComm(String pCTargetedTherapyComm) {
		this.pCTargetedTherapyComm = pCTargetedTherapyComm;
	}

	public Short getPCBiopsy() {
		return pCBiopsy;
	}

	public void setPCBiopsy(Short pCBiopsy) {
		this.pCBiopsy = pCBiopsy;
	}

	public String getPCBiopsyComm() {
		return pCBiopsyComm;
	}

	public void setPCBiopsyComm(String pCBiopsyComm) {
		this.pCBiopsyComm = pCBiopsyComm;
	}

	public Integer getNoPCBiopsies() {
		return noPCBiopsies;
	}

	public void setNoPCBiopsies(Integer noPCBiopsies) {
		this.noPCBiopsies = noPCBiopsies;
	}

	public Short getAtypicalHyperplasiaBreastBiopsy() {
		return atypicalHyperplasiaBreastBiopsy;
	}

	public void setAtypicalHyperplasiaBreastBiopsy(Short atypicalHyperplasiaBreastBiopsy) {
		this.atypicalHyperplasiaBreastBiopsy = atypicalHyperplasiaBreastBiopsy;
	}

	public Short getHormoneReplacementTherapyUse() {
		return hormoneReplacementTherapyUse;
	}

	public void setHormoneReplacementTherapyUse(Short hormoneReplacementTherapyUse) {
		this.hormoneReplacementTherapyUse = hormoneReplacementTherapyUse;
	}

	public String getHormoneReplacementTherapyUseComm() {
		return hormoneReplacementTherapyUseComm;
	}

	public void setHormoneReplacementTherapyUseComm(String hormoneReplacementTherapyUseComm) {
		this.hormoneReplacementTherapyUseComm = hormoneReplacementTherapyUseComm;
	}

	public Short getHisterectomy() {
		return histerectomy;
	}

	public void setHisterectomy(Short histerectomy) {
		this.histerectomy = histerectomy;
	}

	public Short getOvariectomy() {
		return ovariectomy;
	}

	public void setOvariectomy(Short ovariectomy) {
		this.ovariectomy = ovariectomy;
	}

	public String getOvariectomyComm() {
		return ovariectomyComm;
	}

	public void setOvariectomyComm(String ovariectomyComm) {
		this.ovariectomyComm = ovariectomyComm;
	}

	public Short getChestWallRadiation() {
		return chestWallRadiation;
	}

	public void setChestWallRadiation(Short chestWallRadiation) {
		this.chestWallRadiation = chestWallRadiation;
	}

	public String getChestWallRadiationComm() {
		return chestWallRadiationComm;
	}

	public void setChestWallRadiationComm(String chestWallRadiationComm) {
		this.chestWallRadiationComm = chestWallRadiationComm;
	}

	public Short getRadiationTherapyDuringPregnancy() {
		return radiationTherapyDuringPregnancy;
	}

	public void setRadiationTherapyDuringPregnancy(Short radiationTherapyDuringPregnancy) {
		this.radiationTherapyDuringPregnancy = radiationTherapyDuringPregnancy;
	}

	public String getRadiationTherapyDuringPregnancyComm() {
		return radiationTherapyDuringPregnancyComm;
	}

	public void setRadiationTherapyDuringPregnancyComm(String radiationTherapyDuringPregnancyComm) {
		this.radiationTherapyDuringPregnancyComm = radiationTherapyDuringPregnancyComm;
	}

	public Short getHormoneManipulationTherapy() {
		return hormoneManipulationTherapy;
	}

	public void setHormoneManipulationTherapy(Short hormoneManipulationTherapy) {
		this.hormoneManipulationTherapy = hormoneManipulationTherapy;
	}

	public String getMajorComorbidities() {
		return majorComorbidities;
	}

	public void setMajorComorbidities(String majorComorbidities) {
		this.majorComorbidities = majorComorbidities;
	}

	public Short getActiveConnectiveTissueDiseaseInvolvingSkin() {
		return activeConnectiveTissueDiseaseInvolvingSkin;
	}

	public void setActiveConnectiveTissueDiseaseInvolvingSkin(Short activeConnectiveTissueDiseaseInvolvingSkin) {
		this.activeConnectiveTissueDiseaseInvolvingSkin = activeConnectiveTissueDiseaseInvolvingSkin;
	}

	public Short getOvarianCancer() {
		return ovarianCancer;
	}

	public void setOvarianCancer(Short ovarianCancer) {
		this.ovarianCancer = ovarianCancer;
	}

	public String getPreviousOtherCancer() {
		return previousOtherCancer;
	}

	public void setPreviousOtherCancer(String previousOtherCancer) {
		this.previousOtherCancer = previousOtherCancer;
	}

	public Short getThryroidDisease() {
		return thryroidDisease;
	}

	public void setThryroidDisease(Short thryroidDisease) {
		this.thryroidDisease = thryroidDisease;
	}

	public String getThryroidDiseaseComm() {
		return thryroidDiseaseComm;
	}

	public void setThryroidDiseaseComm(String thryroidDiseaseComm) {
		this.thryroidDiseaseComm = thryroidDiseaseComm;
	}

	public Short getUterineFibroids() {
		return uterineFibroids;
	}

	public void setUterineFibroids(Short uterineFibroids) {
		this.uterineFibroids = uterineFibroids;
	}

	public Short getPerezJagerDisease() {
		return perezJagerDisease;
	}

	public void setPerezJagerDisease(Short perezJagerDisease) {
		this.perezJagerDisease = perezJagerDisease;
	}

	public Short getHamartomas() {
		return hamartomas;
	}

	public void setHamartomas(Short hamartomas) {
		this.hamartomas = hamartomas;
	}

	public Short getAutuimmuneDisease() {
		return autuimmuneDisease;
	}

	public void setAutuimmuneDisease(Short autuimmuneDisease) {
		this.autuimmuneDisease = autuimmuneDisease;
	}

	public String getAutuimmuneDiseaseComm() {
		return autuimmuneDiseaseComm;
	}

	public void setAutuimmuneDiseaseComm(String autuimmuneDiseaseComm) {
		this.autuimmuneDiseaseComm = autuimmuneDiseaseComm;
	}

	public Short getProstateDisease() {
		return prostateDisease;
	}

	public void setProstateDisease(Short prostateDisease) {
		this.prostateDisease = prostateDisease;
	}

	public String getProstateDiseaseComm() {
		return prostateDiseaseComm;
	}

	public void setProstateDiseaseComm(String prostateDiseaseComm) {
		this.prostateDiseaseComm = prostateDiseaseComm;
	}

	public Short getSynchronousPrimaryBreastCancer() {
		return synchronousPrimaryBreastCancer;
	}

	public void setSynchronousPrimaryBreastCancer(Short synchronousPrimaryBreastCancer) {
		this.synchronousPrimaryBreastCancer = synchronousPrimaryBreastCancer;
	}

	public Short getBilateralBC() {
		return bilateralBC;
	}

	public void setBilateralBC(Short bilateralBC) {
		this.bilateralBC = bilateralBC;
	}

	public Short getAlcoholIntake() {
		return alcoholIntake;
	}

	public void setAlcoholIntake(Short alcoholIntake) {
		this.alcoholIntake = alcoholIntake;
	}

	public Short getSmokingHistory() {
		return smokingHistory;
	}

	public void setSmokingHistory(Short smokingHistory) {
		this.smokingHistory = smokingHistory;
	}

	public Short getAntracyclineAdministered() {
		return antracyclineAdministered;
	}

	public void setAntracyclineAdministered(Short antracyclineAdministered) {
		this.antracyclineAdministered = antracyclineAdministered;
	}

	public String getAntracyclineAdministeredComm() {
		return antracyclineAdministeredComm;
	}

	public void setAntracyclineAdministeredComm(String antracyclineAdministeredComm) {
		this.antracyclineAdministeredComm = antracyclineAdministeredComm;
	}

	public Short getTreatmentRelatedToxicity() {
		return treatmentRelatedToxicity;
	}

	public void setTreatmentRelatedToxicity(Short treatmentRelatedToxicity) {
		this.treatmentRelatedToxicity = treatmentRelatedToxicity;
	}

	public String getTreatmentRelatedToxicityComm() {
		return treatmentRelatedToxicityComm;
	}

	public void setTreatmentRelatedToxicityComm(String treatmentRelatedToxicityComm) {
		this.treatmentRelatedToxicityComm = treatmentRelatedToxicityComm;
	}

	public Boolean getBenignBreastDisease() {
		return benignBreastDisease;
	}

	public void setBenignBreastDisease(Boolean benignBreastDisease) {
		this.benignBreastDisease = benignBreastDisease;
	}

	public Boolean getPriorThoracicRT() {
		return priorThoracicRT;
	}

	public void setPriorThoracicRT(Boolean priorThoracicRT) {
		this.priorThoracicRT = priorThoracicRT;
	}

	public Boolean getMutations() {
		return mutations;
	}

	public void setMutations(Boolean mutations) {
		this.mutations = mutations;
	}

	public Integer getHxRenalFail() {
		return hxRenalFail;
	}

	public void setHxRenalFail(Integer hxRenalFail) {
		this.hxRenalFail = hxRenalFail;
	}

	public Integer getHxVHL() {
		return hxVHL;
	}

	public void setHxVHL(Integer hxVHL) {
		this.hxVHL = hxVHL;
	}

	public Integer getHxPrevCancer() {
		return hxPrevCancer;
	}

	public void setHxPrevCancer(Integer hxPrevCancer) {
		this.hxPrevCancer = hxPrevCancer;
	}

	public Integer getCurrentSmoker() {
		return currentSmoker;
	}

	public void setCurrentSmoker(Integer currentSmoker) {
		this.currentSmoker = currentSmoker;
	}

	public Integer getNoYrSmoked() {
		return noYrSmoked;
	}

	public void setNoYrSmoked(Integer noYrSmoked) {
		this.noYrSmoked = noYrSmoked;
	}

	public Integer getNoPackSmokePDay() {
		return noPackSmokePDay;
	}

	public void setNoPackSmokePDay(Integer noPackSmokePDay) {
		this.noPackSmokePDay = noPackSmokePDay;
	}

	public Integer getPastSurgHx() {
		return pastSurgHx;
	}

	public void setPastSurgHx(Integer pastSurgHx) {
		this.pastSurgHx = pastSurgHx;
	}

	public Integer getNoPriorAbdominalSur() {
		return noPriorAbdominalSur;
	}

	public void setNoPriorAbdominalSur(Integer noPriorAbdominalSur) {
		this.noPriorAbdominalSur = noPriorAbdominalSur;
	}

	public Character getCigPackYear() {
		return cigPackYear;
	}

	public void setCigPackYear(Character cigPackYear) {
		this.cigPackYear = cigPackYear;
	}

	public Integer getHypertention() {
		return hypertention;
	}

	public void setHypertention(Integer hypertention) {
		this.hypertention = hypertention;
	}

	public Integer getPulmHypertn() {
		return pulmHypertn;
	}

	public void setPulmHypertn(Integer pulmHypertn) {
		this.pulmHypertn = pulmHypertn;
	}

	public Integer getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(Integer diabetes) {
		this.diabetes = diabetes;
	}

	public Integer getDiabCtrl() {
		return diabCtrl;
	}

	public void setDiabCtrl(Integer diabCtrl) {
		this.diabCtrl = diabCtrl;
	}

	public Integer getDialysis() {
		return dialysis;
	}

	public void setDialysis(Integer dialysis) {
		this.dialysis = dialysis;
	}

	public Character getHemoglobinLst() {
		return hemoglobinLst;
	}

	public void setHemoglobinLst(Character hemoglobinLst) {
		this.hemoglobinLst = hemoglobinLst;
	}

	public Integer getCopd() {
		return copd;
	}

	public void setCopd(Integer copd) {
		this.copd = copd;
	}

	public Integer getHistGenSynBone() {
		return histGenSynBone;
	}

	public void setHistGenSynBone(Integer histGenSynBone) {
		this.histGenSynBone = histGenSynBone;
	}

	public Integer getHistSarcoma() {
		return histSarcoma;
	}

	public void setHistSarcoma(Integer histSarcoma) {
		this.histSarcoma = histSarcoma;
	}

	public Integer getHistMass() {
		return histMass;
	}

	public void setHistMass(Integer histMass) {
		this.histMass = histMass;
	}

	public Integer getHistPain() {
		return histPain;
	}

	public void setHistPain(Integer histPain) {
		this.histPain = histPain;
	}

	public Integer getHistPathFracture() {
		return histPathFracture;
	}

	public void setHistPathFracture(Integer histPathFracture) {
		this.histPathFracture = histPathFracture;
	}

	public Integer getPriorChemoCurativeNo() {
		return priorChemoCurativeNo;
	}

	public void setPriorChemoCurativeNo(Integer priorChemoCurativeNo) {
		this.priorChemoCurativeNo = priorChemoCurativeNo;
	}

	public Integer getPriorChemoPalliativeNo() {
		return priorChemoPalliativeNo;
	}

	public void setPriorChemoPalliativeNo(Integer priorChemoPalliativeNo) {
		this.priorChemoPalliativeNo = priorChemoPalliativeNo;
	}

	public Integer getPriorRadioCuraNo() {
		return priorRadioCuraNo;
	}

	public void setPriorRadioCuraNo(Integer priorRadioCuraNo) {
		this.priorRadioCuraNo = priorRadioCuraNo;
	}

	public Integer getPriorRadioPalliativeNo() {
		return priorRadioPalliativeNo;
	}

	public void setPriorRadioPalliativeNo(Integer priorRadioPalliativeNo) {
		this.priorRadioPalliativeNo = priorRadioPalliativeNo;
	}

	public Integer getPriorSurgeryNo() {
		return priorSurgeryNo;
	}

	public void setPriorSurgeryNo(Integer priorSurgeryNo) {
		this.priorSurgeryNo = priorSurgeryNo;
	}

	public Integer getPriorCongInherSyndrone() {
		return priorCongInherSyndrone;
	}

	public void setPriorCongInherSyndrone(Integer priorCongInherSyndrone) {
		this.priorCongInherSyndrone = priorCongInherSyndrone;
	}

	public Integer getRadioTherapyExp() {
		return radioTherapyExp;
	}

	public void setRadioTherapyExp(Integer radioTherapyExp) {
		this.radioTherapyExp = radioTherapyExp;
	}

	public Integer getNoYrQuitSmoke() {
		return noYrQuitSmoke;
	}

	public void setNoYrQuitSmoke(Integer noYrQuitSmoke) {
		this.noYrQuitSmoke = noYrQuitSmoke;
	}

	public CancerSubType getCancerSubType() {
		return cancerSubType;
	}

	public void setCancerSubType(CancerSubType cancerSubType) {
		this.cancerSubType = cancerSubType;
	}

	public CancerType getCancerType() {
		return cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	public TnmStage getPrCaWorkingTNM() {
		return prCaWorkingTNM;
	}

	public void setPrCaWorkingTNM(TnmStage prCaWorkingTNM) {
		this.prCaWorkingTNM = prCaWorkingTNM;
	}

	public TnmStage getPrCaTNM() {
		return prCaTNM;
	}

	public void setPrCaTNM(TnmStage prCaTNM) {
		this.prCaTNM = prCaTNM;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the otherHistory
	 */
	public String getOtherHistory() {
		return otherHistory;
	}

	/**
	 * @param otherHistory
	 *            the otherHistory to set
	 */
	public void setOtherHistory(String otherHistory) {
		this.otherHistory = otherHistory;
	}

	/**
	 * @return the traumaHx
	 */
	public Short getTraumaHx() {
		return traumaHx;
	}

	/**
	 * @param traumaHx
	 *            the traumaHx to set
	 */
	public void setTraumaHx(Short traumaHx) {
		this.traumaHx = traumaHx;
	}

	/**
	 * @return the rtHx
	 */
	public Short getRtHx() {
		return rtHx;
	}

	/**
	 * @param rtHx
	 *            the rtHx to set
	 */
	public void setRtHx(Short rtHx) {
		this.rtHx = rtHx;
	}

	/**
	 * @return the toxicChemicals
	 */
	public Short getToxicChemicals() {
		return toxicChemicals;
	}

	/**
	 * @param toxicChemicals
	 *            the toxicChemicals to set
	 */
	public void setToxicChemicals(Short toxicChemicals) {
		this.toxicChemicals = toxicChemicals;
	}

	public Short getAdequatePreviousSurgery() {
		return adequatePreviousSurgery;
	}

	public void setAdequatePreviousSurgery(Short adequatePreviousSurgery) {
		this.adequatePreviousSurgery = adequatePreviousSurgery;
	}

	public Short getClinicalPresentation() {
		return clinicalPresentation;
	}

	public void setClinicalPresentation(Short clinicalPresentation) {
		this.clinicalPresentation = clinicalPresentation;
	}

	public Short getIncidentalFinding() {
		return incidentalFinding;
	}

	public void setIncidentalFinding(Short incidentalFinding) {
		this.incidentalFinding = incidentalFinding;
	}

	public String getBmi() {
		return bmi;
	}

	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	public Integer getCalciumLevel() {
		return calciumLevel;
	}

	public void setCalciumLevel(Integer calciumLevel) {
		this.calciumLevel = calciumLevel;
	}

	public Integer getCadmiumLevel() {
		return cadmiumLevel;
	}

	public void setCadmiumLevel(Integer cadmiumLevel) {
		this.cadmiumLevel = cadmiumLevel;
	}

	public Boolean getProstatitis() {
		return prostatitis;
	}

	public void setProstatitis(Boolean prostatitis) {
		this.prostatitis = prostatitis;
	}

	public Symptoms getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(Symptoms symptoms) {
		this.symptoms = symptoms;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (personalMedicalHistoryPK != null ? personalMedicalHistoryPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PersonalMedicalHistory)) {
			return false;
		}
		PersonalMedicalHistory other = (PersonalMedicalHistory) object;
		if ((this.personalMedicalHistoryPK == null && other.personalMedicalHistoryPK != null)
				|| (this.personalMedicalHistoryPK != null
						&& !this.personalMedicalHistoryPK.equals(other.personalMedicalHistoryPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.PersonalMedicalHistory[ personalMedicalHistoryPK=" + personalMedicalHistoryPK
				+ " ]";
	}

}

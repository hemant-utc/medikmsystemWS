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
@Table(name = "case1")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Case1.findAll", query = "SELECT c FROM Case1 c") })
public class Case1 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Case_Id")
	private Integer caseId;
	@Column(name = "Age")
	private Integer age;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "Tumor_Size")
	private Double tumorSize;
	@Column(name = "No_Nodes")
	private Integer noNodes;
	@Column(name = "Distant_Mets")
	private Short distantMets;
	@Lob
	@Column(name = "Distant_Mets_Comm")
	private String distantMetsComm;
	@Column(name = "Clinical_Stage")
	private String clinicalStage;
	@Column(name = "Histological_Grade")
	private Integer histologicalGrade;
	@Column(name = "ER_Status")
	private String eRStatus;
	@Column(name = "ER_Percent")
	private Integer eRPercent;
	@Column(name = "PR_Status")
	private String pRStatus;
	@Column(name = "PR_Percent")
	private Integer pRPercent;
	@Column(name = "Case_HER2neu_Amplified")
	private Short caseHER2neuAmplified;
	@Column(name = "HER2_Status")
	private String hER2Status;
	@Column(name = "HER2_SISH")
	private String her2Sish;
	@Column(name = "Primary_Diagnosis_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date primaryDiagnosisDt;
	@Column(name = "Deceased_Due_BC")
	private Short deceasedDueBC;
	@Column(name = "Treatment_Related_Death")
	private Short treatmentRelatedDeath;
	@Column(name = "Unrelated_Death")
	private Short unrelatedDeath;
	@Column(name = "Dt_Death")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtDeath;
	@Column(name = "Date_First_Encounter")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFirstEncounter;
	@Column(name = "Menopause_Status")
	private String menopauseStatus;
	@Column(name = "Significance_Risk")
	private Boolean significanceRisk;
	@Column(name = "Significance_Comorbities")
	private Boolean significanceComorbities;
	@Basic(optional = false)
	@Column(name = "version")
	private int version;
	@Column(name = "Clinical_Staging_Method")
	private Short clinicalStagingMethod;
	@Column(name = "WHO_Classification")
	private Integer wHOClassification;
	@Column(name = "pleural_Inv")
	private Integer pleuralInv;
	@Column(name = "Necrosis_Percent")
	private Integer necrosisPercent;
	@Column(name = "Necrosis_Present")
	private String necrosisPresent;
	@Column(name = "Reason_Not_Treated")
	private Integer reasonNotTreated;
	@Column(name = "Disease_Treated")
	private Integer diseaseTreated;
	@Column(name = "Seen_On_CT")
	private Integer seenOnCT;
	@Column(name = "Duration_Of_Symptoms_Mon")
	private Integer durationOfSymptomsMon;
	@Column(name = "Seen_On_MRI")
	private Integer seenOnMRI;
	@Column(name = "Seen_On_PAT")
	private Integer seenOnPAT;
	@Column(name = "Seen_On_Thallium_Scan")
	private Integer seenOnThalliumScan;
	@Column(name = "Seen_On_Xray")
	private Integer seenOnXray;
	@Column(name = "Seen_On_Bonescan")
	private Integer seenOnBonescan;
	@Column(name = "Tumor_Depth")
	private Integer tumorDepth;
	@Column(name = "Invasion_Of_Adj_Structure")
	private Integer invasionOfAdjStructure;
	@Column(name = "Invasion_Of_Pleura")
	private Integer invasionOfPleura;
	@Column(name = "Invasion_Of_Chest_Wall")
	private Integer invasionOfChestWall;
	@Column(name = "Invasion_Of_Diaphragm")
	private Integer invasionOfDiaphragm;
	@Column(name = "Invasion_Of_Phrenic_Nerve")
	private Integer invasionOfPhrenicNerve;
	@Column(name = "Invasion_Of_Pericardium")
	private Integer invasionOfPericardium;
	@Column(name = "Atelectasis")
	private Integer atelectasis;
	@Column(name = "Obstractive_Pneumonitis")
	private Integer obstractivePneumonitis;
	@Column(name = "Separate_TNode_In_Same_Lobe")
	private Integer separateTNodeInSameLobe;
	@Column(name = "Invasion_In_Mediastnum")
	private Integer invasionInMediastnum;
	@Column(name = "Invasion_Into_Heart")
	private Integer invasionIntoHeart;
	@Column(name = "Invasion_Of_Main_Bronchus")
	private Integer invasionOfMainBronchus;
	@Column(name = "Invasion_Into_Great_Vessels")
	private Integer invasionIntoGreatVessels;
	@Column(name = "Invasion_Into_Trachea")
	private Integer invasionIntoTrachea;
	@Column(name = "Invasion_Into_Rec_Laryngeal_Nerve")
	private Integer invasionIntoRecLaryngealNerve;
	@Column(name = "Invasion_Into_Esophagus")
	private Integer invasionIntoEsophagus;
	@Column(name = "Invasion_Into_Vertbral_Body")
	private Integer invasionIntoVertbralBody;
	@Column(name = "Invasion_Into_Carina")
	private Integer invasionIntoCarina;
	@Column(name = "TNodes_In_Diff_Lobe")
	private Integer tNodesInDiffLobe;
	@Column(name = "Nodal_Metastases")
	private String nodalMetastases;
	@Column(name = "Esophagectomy_Done")
	private Integer esophagectomyDone;
	@Column(name = "Residual_Tumor")
	private Integer residualTumor;
	@Column(name = "Debulking_Status")
	private Integer debulkingStatus;
	@Column(name = "Platin_Status")
	private Integer platinStatus;
	@Column(name = "Recurrence")
	private Integer recurrence;
	@Column(name = "Date_Recurrence")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateRecurrence;
	@Column(name = "Secondary_Debulking_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date secondaryDebulkingDate;
	@Column(name = "Interval_Debulking_Dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date intervalDebulkingDt;
	@Column(name = "BaseLine_CA125")
	private String baseLineCA125;
	@Column(name = "Prg_Free_Survival")
	private Integer prgFreeSurvival;
	@Column(name = "Overall_Survival")
	private Integer overallSurvival;
	@Column(name = "Esophageal_C_Staging_Method")
	private Short esophagealCStagingMethod;
	@Column(name = "Later")
	private String later;
	@Column(name = "st_Primary")
	private Short stPrimary;
	@Column(name = "nd_Primary")
	private Short ndPrimary;
	@Column(name = "Disease_Propagation")
	private Short diseasePropagation;
	@Column(name = "Metastatic")
	private Short metastatic;
	@Lob
	@Column(name = "Chief_Complaint")
	private String chiefComplaint;
	@Column(name = "Lymfovascular_Invasion")
	private Short lymfovascularInvasion;
	@Column(name = "Margins")
	private String margins;
	@Column(name = "Closest_Margins")
	private String closestMargins;
	@Column(name = "Immune_Histochemistry")
	private String immuneHistochemistry;
	@Column(name = "No_Fossi")
	private Integer noFossi;
	@Column(name = "Brca")
	private Short brca;
	@Column(name = "OncDxScore")
	private Integer oncDxScore;
	@Column(name = "PathologicalT")
    private String PathologicalT;
	@Column(name = "bladderNeck")
	private Short bladderNeck;
	@Column(name = "NeoadjResponse")
	private String neoadjResponse;
	@Column(name = "metastasis")
	private short metastasis;
	@Column(name = "met_primary_site")
	private String metPrimarySite;
	@Column(name = "other_biomarkers")
	private String otherBiomarkers;
	@Column(name = "nln")
	private int nln;
    @Column(name="t_location")
    private String tlocation;
    @Column(name = "case_status")
    private String caseStatus;
	@Column(name = "tumor_type")
	private String tumorType;
	@Column(name = "tis_bank_pnr")
	private Short tisBankPnr;
	@Column(name = "tis_bank_odunsi")
	private Short tisBankOdunsi;
	@Column(name = "nv_inf")
	private Short nvInf;
	@Column(name = "nyso")
	private Short nyso;
	@Column(name = "wt")
	private Short wt;
	@Column(name = "ido")
	private Short ido;
	@Column(name = "tis_bank")
	private Short tisBank;
	@Column(name = "mucosal_invasion")
	private Short mucosalInvasion;
	@Column(name = "mi")
	private String mi;
	@Column(name = "lesion_depth")
	private String lesionDepth;
	@Column(name = "dist")
	private String dist;
	@Column(name = "t_rupture")
	private Short trupture;
	@Column(name = "tumor_on_surface")
	private Short tumorOnSurface;
	@Column(name = "lsvi")
	private Short lsvi;
	@Column(name = "parametrial_invasion")
	private Short parametrialInvasion;
	@Column(name = "stromal_invasion")
	private Short stromalInvasion;
	@Column(name = "depth")
	private Integer depth;
	@Column(name = "horizontal_spread")
	private Integer horizontalSpread;
	@Column(name = "washings")
	private Short washings;
	@Column(name = "capsule_intact")
	private Short capsuleIntact;
	@Column(name = "surgical_spill")
	private Short surgicalSpill;
    @Column(name = "metastatic_site")
    private String metastaticSite;
	@Column(name = "ln_metastasis_site")
	private String lnMetastasisSite;
	@Column(name = "malignant_ascites")
	private Short malignantAscites;
	@Column(name = "gross_cervical_involvement")
	private Short grossCervicalInvolvement;
	@Column(name = "aortic_node_positive")
	private Short aorticNodePositive;
	@Column(name = "tumor_penetrated_serosal_surface")
	private Short tumorPenetratedSerosalSurface;
	@Column(name = "malignant_cells_in_ascites")
	private Short malignantCellsInAscites;
	@Column(name = "malignant_cells_in_peritoneal_washings")
	private Short malignantCellsInPeritonealWashings;
	@Column(name = "peritoneal_implants")
	private Short peritonealImplants;
	@Column(name = "pelvic_extensions")
	private Short pelvicExtensions;
	@Column(name = "extension_to_other_structures")
	private Short extensionToOtherStructures;
	@Column(name = "specify")
	private String specify;
	@Column(name = "operable")
	private Short operable;
	@Column(name = "fertility_sparing")
	private Short fertilitySparing;
	@Column(name = "hydronephrosis")
	private Short hydronephrosis;
	@Column(name = "clinically_visible_lesion")
	private Short clinicallyVisibleLesion;
	@Column(name = "surgical_candidate")
	private Short surgicalCandidate;
	@Column(name = "surgically_resectable")
	private Short surgicallyResectable;
	@Column(name = "residual_disease")
	private Short residualDisease;
	@Column(name = "malignant_epithelial_carcinoma")
	private Short malignantEpithelialCarcinoma;
	@Column(name = "pure_endometrioid_carcinoma")
	private Short pureEndometrioidCarcinoma;
	@Column(name = "serous_cell_carcinoma")
	private Short serousCellCarcinoma;
	@Column(name = "stromal_tumor")
	private Short stromalTumor;
	@Column(name = "cap")
    private String cap;
	@Column(name = "uterus_disease_limited")
	private Short uterusDiseaseLimited;
	@Column(name = "suspected_extrauterine_disease")
	private Short suspectedExtrauterineDisease;
	@Column(name = "myometrial_invasion")
	private Short myometrialInvasion;
	@Column(name = "adverse_risk_factors")
	private Short adverseRiskFactors;
	@Column(name = "details")
	private String details;
	@Column(name = "clear_cell_histology")
	private Short clearCellHistology;
	@Column(name = "number_of_metastatic_sites")
	private Integer numberOfMetastaticSites;
	@Column(name = "miscellaneous")
	private String miscellaneous;
	
    @Column(name = "tumor_volume")
    private String tumorVolume;
    @Column(name = "cancer_status")
    private String cancerStatus;
    @Column(name = "progression_free_survival_after_surgery")
    private String progressionFreeSurvivalAfterSurgery;
    @Column(name = "progression_free_survival_after_rt")
    private String progressionFreeSurvivalAfterRt;
    @Column(name = "progression_free_survival_after_bt")
    private String progressionFreeSurvivalAfterBt;
    @Column(name = "alfha_fp")
    private Integer alfhaFp;
    @Column(name = "beta_hcg")
    private Integer betaHcg;
    @Column(name = "ldh")
    private Integer ldh;
    @Column(name = "prostate_volume")
    private Integer prostateVolume;
    @Column(name = "biopsy_gleason_score")
    private String biopsyGleasonScore;
    @Column(name = "surgical_gleason_score")
    private String surgicalGleasonScore;
    @Column(name = "number_positive_biopsy_cores")
    private Integer numberPositiveBiopsyCores;
    @Column(name = "positive_biopsy_cores_location")
    private String positiveBiopsyCoresLocation;
    @Column(name = "psa_doubling_time")
    private String psaDoublingTime;
    @Column(name = "psa_density")
    private Double psaDensity;
    @Column(name = "psa_cure_rate")
    private Float psaCureRate;
    @Column(name = "psa_levels")
    private Double psaLevels;
    @Column(name = "newPsaLevel")
    private String newPsaLevel;
    @Column(name = "number_of_bx_cores")
    private Integer numberOfBxCores;
    @Column(name = "number_of_positive_cores")
    private Integer numberOfPositiveCores;
    @Column(name = "percent_of_positive_cores")
    private Double percentOfPositiveCores;
    @Column(name = "prostate_echotexture")
    private String prostateEchotexture;
    @Column(name = "percant_cancer_in_any_core")
    private Float percantCancerInAnyCore;
    @Column(name = "net_Life_expectancy")
    private Integer netLifeexpectancy;
    @Column(name = "probability_of_Ca_death_se")
    private String probabilityofCadeathse;
    @Column(name = "tnmStagingSystem")
    private String tnmStagingSystem;
    @Column(name = "probability_of_Ca_death_dt")
    private String probabilityofCadeathdt;
    @Column(name = "one_y")
    private Float oneY;
    @Column(name = "two_y")
    private Float twoY;
    @Column(name = "crpc_median_survival_in_years")
    private Integer crpcMedianSurvivalInYears;
    @Column(name = "probability_of_lymph_node_involvement")
    private Float probabilityOfLymphNodeInvolvement;
    @Column(name = "progression_free_survival_probability_after_salvage_rt_six_y")
    private String progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
    @Column(name = "extracapsular_extension")
    private Short extracapsularExtension;
    @Column(name = "fixation")
    private Short fixation;
    @Column(name = "seminal_vesicle_invasion")
    private Short seminalVesicleInvasion;
    @Column(name = "tumor_in_central_location")
    private Short tumorInCentralLocation;
    @Column(name = "indolent_cancer")
    private Float indolentCancer;
    @Column(name = "leftBaseMedial")
    private String leftBaseMedial;
    @Column(name = "leftBaseLateral")
    private String leftBaseLateral;
    @Column(name = "rightBaseMedial")
    private String rightBaseMedial;
    @Column(name = "rightBaseLateral")
    private String rightBaseLateral;
    @Column(name = "leftMidMedial")
    private String leftMidMedial;
    @Column(name = "leftMidLateral")
    private String leftMidLateral;
    @Column(name = "rightMidMedial")
    private String rightMidMedial;
    @Column(name = "rightMidLateral")
    private String rightMidLateral;
    @Column(name = "leftApexMedial")
    private String leftApexMedial;
    @Column(name = "leftApexLateral")
    private String leftApexLateral;
    @Column(name = "rightApexMedial")
    private String rightApexMedial;
    @Column(name = "rightApexLateral")
    private String rightApexLateral;
    @Column(name = "organ_confined_disease")
    private Float organConfinedDisease;
    @Column(name = "capsular_penetration")
    private Float capsularPenetration;
    @Column(name = "lymph_node_mets")
    private Float lymphNodeMets;
    @Column(name = "seminal_v_invasion_percentage")
    private Float seminalVInvasionPercentage;
    @JoinColumn(name = "tumor_location", referencedColumnName = "tumor_Location_Id")
    @ManyToOne
    private TumorLocation tumorLocation;
    @Column(name="genetic_risk_evaluation")
    private String geneticRiskEvaluation;
    @Column(name="ref_Physician")
    private String refPhysician;
    @Column(name="optimalcytred")
    private Short optimalcytred;
    @Column(name="parametrium_pos")
    private Short parametriumPos;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<Encounter> encounterCollection;
	@OneToMany(mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<Surgery> surgeryCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<CaseResources> caseResourcesCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "case1", fetch = FetchType.LAZY)
	private Collection<CasePhysician> casePhysicianCollection;
	@OneToMany(mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<DiagnosticWorkup> diagnosticWorkupCollection;
	@JoinColumn(name = "Patient_Id", referencedColumnName = "Patient_Id")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Patient patient;
	@JoinColumn(name = "Disease_type", referencedColumnName = "Disease_Type_Id")
	@ManyToOne(optional = false)
	private DiseaseType diseaseType;
	@JoinColumn(name = "disease_sub_type_id", referencedColumnName = "Disease_Sub_Type_Id")
	@ManyToOne
	private DiseaseSubType diseaseSubTypeId;
	@JoinColumn(name = "Reference_Institution", referencedColumnName = "Facility_Id")
	@ManyToOne(optional = false)
	private CareFacility careFacility;
	@JoinColumn(name = "functional_status", referencedColumnName = "Id")
	@ManyToOne
	private Functionalstatus functionalStatus;
	@JoinColumn(name = "Genetics", referencedColumnName = "Id")
	@ManyToOne
	private Genetics genetics;
	@JoinColumn(name = "Genomics", referencedColumnName = "Id")
	@ManyToOne
	private Gemonics genomics;
	@JoinColumn(name = "Final_TNM_Stage_Id", referencedColumnName = "Stage_Id")
	@ManyToOne
	private TnmStage finalTNMStageId;
	@JoinColumn(name = "Working_TNM_Stage_Id", referencedColumnName = "Stage_Id")
	@ManyToOne
	private TnmStage workingTNMStageId;
	@JoinColumn(name = "Refering_Physicia_Id", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician referingPhysiciaId;
	@JoinColumn(name = "Med_Onc_Physician_Id", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician medOncPhysicianId;
	@JoinColumn(name = "Rad_Onc_Physician_Id", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician radOncPhysicianId;
	@JoinColumn(name = "Plastic_Surgeon_Id", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician plasticSurgeonId;
	@JoinColumn(name = "Surg_Onc_Physician_Id", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician surgOncPhysicianId;
	@JoinColumn(name = "pathologist", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician pathologist;
	@JoinColumn(name = "GYN_Oncologist", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician gynOncologist;
	@JoinColumn(name = "Cancer_Sub_Type_Id", referencedColumnName = "Can_Sub_Type_Id")
	@ManyToOne
	private CancerSubType cancerSubTypeId;
	@JoinColumn(name = "Cancer_Type_Id", referencedColumnName = "Can_Type_Id")
	@ManyToOne
	private CancerType cancerTypeId;
	@OneToMany(mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<Biopsy> biopsyCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<TumorBoardDiscussion> tumorBoardDiscussionCollection;
	@OneToMany(mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<Chemotherapy> chemotherapyCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<Episode> episodeCollection;
	@OneToMany(mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<Pathology> pathologyCollection;

	@OneToMany(mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<PhysicalExam> physicalExamCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<RadiationTherapy> radiationTherapyCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId")
	private Collection<CancerStage> cancerStageCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<ForumAnswereResources> forumAnswereResourcesCollection;
	@OneToMany(mappedBy = "caseId", fetch = FetchType.LAZY)
	private Collection<Followup> followupCollection;
	@Column(name = "met_primary")
	private Short metPrimary;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId", fetch = FetchType.LAZY)
	private List<TumorBoardDiscussionQuestion> tumorBoardDiscussionQuestionList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId",orphanRemoval=true)
    private Collection<DiseaseSymptoms> diseaseSymptomsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId")
    private Collection<CaseQualityIndicator> caseQualityIndicatorCollection;
    @JoinColumn(name = "created_By", referencedColumnName = "Physician_Id")
	@ManyToOne
    private Physician createdBy;
    @JoinColumn(name = "last_UpdatedBy", referencedColumnName = "Physician_Id")
	@ManyToOne
	private Physician lastUpdatedBy;
    @Column(name = "Creation_Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTime;
    
	public Collection<DiseaseSymptoms> getDiseaseSymptomsCollection() {
		return diseaseSymptomsCollection;
	}

	public void setDiseaseSymptomsCollection(
			Collection<DiseaseSymptoms> diseaseSymptomsCollection) {
		this.diseaseSymptomsCollection = diseaseSymptomsCollection;
	}

	public void removeAllDiseaseSymptomsCollection(){
		this.diseaseSymptomsCollection.clear();
	}
	
	public void addAllDiseaseSymptomsCollection(Collection<DiseaseSymptoms> diseaseSymptomsCollection){
		this.diseaseSymptomsCollection.addAll(diseaseSymptomsCollection);
	}
	
	public Physician getPathologist() {
		return pathologist;
	}

	public void setPathologist(Physician pathologist) {
		this.pathologist = pathologist;
	}

	public Short getMetPrimary() {
		return metPrimary;
	}

	public DiseaseSubType getDiseaseSubTypeId() {
		return diseaseSubTypeId;
	}

	public void setDiseaseSubTypeId(DiseaseSubType diseaseSubTypeId) {
		this.diseaseSubTypeId = diseaseSubTypeId;
	}

	public void setMetPrimary(Short metPrimary) {
		this.metPrimary = metPrimary;
	}

	public Case1() {
	}

	public Case1(Integer caseId) {
		this.caseId = caseId;
	}

	public Case1(Integer caseId, int version) {
		this.caseId = caseId;
		this.version = version;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Short getOptimalcytred() {
		return optimalcytred;
	}

	public void setOptimalcytred(Short optimalcytred) {
		this.optimalcytred = optimalcytred;
	}

	public Short getParametriumPos() {
		return parametriumPos;
	}

	public void setParametriumPos(Short parametriumPos) {
		this.parametriumPos = parametriumPos;
	}

	public Double getTumorSize() {
		return tumorSize;
	}

	public void setTumorSize(Double tumorSize) {
		this.tumorSize = tumorSize;
	}

	public Integer getNoNodes() {
		return noNodes;
	}

	public void setNoNodes(Integer noNodes) {
		this.noNodes = noNodes;
	}

	public Short getDistantMets() {
		return distantMets;
	}

	public void setDistantMets(Short distantMets) {
		this.distantMets = distantMets;
	}

	public String getDistantMetsComm() {
		return distantMetsComm;
	}

	public void setDistantMetsComm(String distantMetsComm) {
		this.distantMetsComm = distantMetsComm;
	}

	public String getClinicalStage() {
		return clinicalStage;
	}

	public void setClinicalStage(String clinicalStage) {
		this.clinicalStage = clinicalStage;
	}

	public Integer getHistologicalGrade() {
		return histologicalGrade;
	}

	public void setHistologicalGrade(Integer histologicalGrade) {
		this.histologicalGrade = histologicalGrade;
	}

	public String getERStatus() {
		return eRStatus;
	}

	public void setERStatus(String eRStatus) {
		this.eRStatus = eRStatus;
	}

	public Integer getERPercent() {
		return eRPercent;
	}

	public void setERPercent(Integer eRPercent) {
		this.eRPercent = eRPercent;
	}

	public String getPRStatus() {
		return pRStatus;
	}

	public void setPRStatus(String pRStatus) {
		this.pRStatus = pRStatus;
	}

	public Integer getPRPercent() {
		return pRPercent;
	}

	public void setPRPercent(Integer pRPercent) {
		this.pRPercent = pRPercent;
	}

	public Short getCaseHER2neuAmplified() {
		return caseHER2neuAmplified;
	}

	public void setCaseHER2neuAmplified(Short caseHER2neuAmplified) {
		this.caseHER2neuAmplified = caseHER2neuAmplified;
	}

	public String getHER2Status() {
		return hER2Status;
	}

	public void setHER2Status(String hER2Status) {
		this.hER2Status = hER2Status;
	}

	public String getHer2Sish() {
		return her2Sish;
	}

	public void setHer2Sish(String her2Sish) {
		this.her2Sish = her2Sish;
	}

	public Date getPrimaryDiagnosisDt() {
		return primaryDiagnosisDt;
	}

	public void setPrimaryDiagnosisDt(Date primaryDiagnosisDt) {
		this.primaryDiagnosisDt = primaryDiagnosisDt;
	}

	public Short getDeceasedDueBC() {
		return deceasedDueBC;
	}

	public void setDeceasedDueBC(Short deceasedDueBC) {
		this.deceasedDueBC = deceasedDueBC;
	}

	public Short getTreatmentRelatedDeath() {
		return treatmentRelatedDeath;
	}

	public void setTreatmentRelatedDeath(Short treatmentRelatedDeath) {
		this.treatmentRelatedDeath = treatmentRelatedDeath;
	}

	public Short getUnrelatedDeath() {
		return unrelatedDeath;
	}

	public void setUnrelatedDeath(Short unrelatedDeath) {
		this.unrelatedDeath = unrelatedDeath;
	}

	public Date getDtDeath() {
		return dtDeath;
	}

	public void setDtDeath(Date dtDeath) {
		this.dtDeath = dtDeath;
	}

	public Date getDateFirstEncounter() {
		return dateFirstEncounter;
	}

	public void setDateFirstEncounter(Date dateFirstEncounter) {
		this.dateFirstEncounter = dateFirstEncounter;
	}

	public String getMenopauseStatus() {
		return menopauseStatus;
	}

	public void setMenopauseStatus(String menopauseStatus) {
		this.menopauseStatus = menopauseStatus;
	}

	public Boolean getSignificanceRisk() {
		return significanceRisk;
	}

	public void setSignificanceRisk(Boolean significanceRisk) {
		this.significanceRisk = significanceRisk;
	}

	public Boolean getSignificanceComorbities() {
		return significanceComorbities;
	}

	public void setSignificanceComorbities(Boolean significanceComorbities) {
		this.significanceComorbities = significanceComorbities;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Short getClinicalStagingMethod() {
		return clinicalStagingMethod;
	}

	public void setClinicalStagingMethod(Short clinicalStagingMethod) {
		this.clinicalStagingMethod = clinicalStagingMethod;
	}

	public Integer getWHOClassification() {
		return wHOClassification;
	}

	public void setWHOClassification(Integer wHOClassification) {
		this.wHOClassification = wHOClassification;
	}

	public Integer getPleuralInv() {
		return pleuralInv;
	}

	public void setPleuralInv(Integer pleuralInv) {
		this.pleuralInv = pleuralInv;
	}

	public Integer getNecrosisPercent() {
		return necrosisPercent;
	}

	public void setNecrosisPercent(Integer necrosisPercent) {
		this.necrosisPercent = necrosisPercent;
	}

	public String getNecrosisPresent() {
		return necrosisPresent;
	}

	public void setNecrosisPresent(String necrosisPresent) {
		this.necrosisPresent = necrosisPresent;
	}

	public Integer getReasonNotTreated() {
		return reasonNotTreated;
	}

	public void setReasonNotTreated(Integer reasonNotTreated) {
		this.reasonNotTreated = reasonNotTreated;
	}

	public Integer getDiseaseTreated() {
		return diseaseTreated;
	}

	public void setDiseaseTreated(Integer diseaseTreated) {
		this.diseaseTreated = diseaseTreated;
	}

	public Integer getSeenOnCT() {
		return seenOnCT;
	}

	public void setSeenOnCT(Integer seenOnCT) {
		this.seenOnCT = seenOnCT;
	}

	public Integer getDurationOfSymptomsMon() {
		return durationOfSymptomsMon;
	}

	public void setDurationOfSymptomsMon(Integer durationOfSymptomsMon) {
		this.durationOfSymptomsMon = durationOfSymptomsMon;
	}

	public Integer getSeenOnMRI() {
		return seenOnMRI;
	}

	public void setSeenOnMRI(Integer seenOnMRI) {
		this.seenOnMRI = seenOnMRI;
	}

	public Integer getSeenOnPAT() {
		return seenOnPAT;
	}

	public void setSeenOnPAT(Integer seenOnPAT) {
		this.seenOnPAT = seenOnPAT;
	}

	public Integer getSeenOnThalliumScan() {
		return seenOnThalliumScan;
	}

	public void setSeenOnThalliumScan(Integer seenOnThalliumScan) {
		this.seenOnThalliumScan = seenOnThalliumScan;
	}

	public Integer getSeenOnXray() {
		return seenOnXray;
	}

	public void setSeenOnXray(Integer seenOnXray) {
		this.seenOnXray = seenOnXray;
	}

	public Integer getSeenOnBonescan() {
		return seenOnBonescan;
	}

	public void setSeenOnBonescan(Integer seenOnBonescan) {
		this.seenOnBonescan = seenOnBonescan;
	}

	public Integer getTumorDepth() {
		return tumorDepth;
	}

	public void setTumorDepth(Integer tumorDepth) {
		this.tumorDepth = tumorDepth;
	}

	public Integer getInvasionOfAdjStructure() {
		return invasionOfAdjStructure;
	}

	public void setInvasionOfAdjStructure(Integer invasionOfAdjStructure) {
		this.invasionOfAdjStructure = invasionOfAdjStructure;
	}

	public Integer getInvasionOfPleura() {
		return invasionOfPleura;
	}

	public void setInvasionOfPleura(Integer invasionOfPleura) {
		this.invasionOfPleura = invasionOfPleura;
	}

	public Integer getInvasionOfChestWall() {
		return invasionOfChestWall;
	}

	public void setInvasionOfChestWall(Integer invasionOfChestWall) {
		this.invasionOfChestWall = invasionOfChestWall;
	}

	public Integer getInvasionOfDiaphragm() {
		return invasionOfDiaphragm;
	}

	public void setInvasionOfDiaphragm(Integer invasionOfDiaphragm) {
		this.invasionOfDiaphragm = invasionOfDiaphragm;
	}

	public Integer getInvasionOfPhrenicNerve() {
		return invasionOfPhrenicNerve;
	}

	public void setInvasionOfPhrenicNerve(Integer invasionOfPhrenicNerve) {
		this.invasionOfPhrenicNerve = invasionOfPhrenicNerve;
	}

	public Integer getInvasionOfPericardium() {
		return invasionOfPericardium;
	}

	public void setInvasionOfPericardium(Integer invasionOfPericardium) {
		this.invasionOfPericardium = invasionOfPericardium;
	}

	public Integer getAtelectasis() {
		return atelectasis;
	}

	public void setAtelectasis(Integer atelectasis) {
		this.atelectasis = atelectasis;
	}

	public Integer getObstractivePneumonitis() {
		return obstractivePneumonitis;
	}

	public void setObstractivePneumonitis(Integer obstractivePneumonitis) {
		this.obstractivePneumonitis = obstractivePneumonitis;
	}

	public Integer getSeparateTNodeInSameLobe() {
		return separateTNodeInSameLobe;
	}

	public void setSeparateTNodeInSameLobe(Integer separateTNodeInSameLobe) {
		this.separateTNodeInSameLobe = separateTNodeInSameLobe;
	}

	public Integer getInvasionInMediastnum() {
		return invasionInMediastnum;
	}

	public void setInvasionInMediastnum(Integer invasionInMediastnum) {
		this.invasionInMediastnum = invasionInMediastnum;
	}

	public Integer getInvasionIntoHeart() {
		return invasionIntoHeart;
	}

	public void setInvasionIntoHeart(Integer invasionIntoHeart) {
		this.invasionIntoHeart = invasionIntoHeart;
	}

	public Integer getInvasionOfMainBronchus() {
		return invasionOfMainBronchus;
	}

	public void setInvasionOfMainBronchus(Integer invasionOfMainBronchus) {
		this.invasionOfMainBronchus = invasionOfMainBronchus;
	}

	public Integer getInvasionIntoGreatVessels() {
		return invasionIntoGreatVessels;
	}

	public void setInvasionIntoGreatVessels(Integer invasionIntoGreatVessels) {
		this.invasionIntoGreatVessels = invasionIntoGreatVessels;
	}

	public Integer getInvasionIntoTrachea() {
		return invasionIntoTrachea;
	}

	public void setInvasionIntoTrachea(Integer invasionIntoTrachea) {
		this.invasionIntoTrachea = invasionIntoTrachea;
	}

	public Integer getInvasionIntoRecLaryngealNerve() {
		return invasionIntoRecLaryngealNerve;
	}

	public void setInvasionIntoRecLaryngealNerve(
			Integer invasionIntoRecLaryngealNerve) {
		this.invasionIntoRecLaryngealNerve = invasionIntoRecLaryngealNerve;
	}

	public Integer getInvasionIntoEsophagus() {
		return invasionIntoEsophagus;
	}

	public void setInvasionIntoEsophagus(Integer invasionIntoEsophagus) {
		this.invasionIntoEsophagus = invasionIntoEsophagus;
	}

	public Integer getInvasionIntoVertbralBody() {
		return invasionIntoVertbralBody;
	}

	public void setInvasionIntoVertbralBody(Integer invasionIntoVertbralBody) {
		this.invasionIntoVertbralBody = invasionIntoVertbralBody;
	}

	public Integer getInvasionIntoCarina() {
		return invasionIntoCarina;
	}

	public void setInvasionIntoCarina(Integer invasionIntoCarina) {
		this.invasionIntoCarina = invasionIntoCarina;
	}

	public Integer getTNodesInDiffLobe() {
		return tNodesInDiffLobe;
	}

	public void setTNodesInDiffLobe(Integer tNodesInDiffLobe) {
		this.tNodesInDiffLobe = tNodesInDiffLobe;
	}

	public String getNodalMetastases() {
		return nodalMetastases;
	}

	public void setNodalMetastases(String nodalMetastases) {
		this.nodalMetastases = nodalMetastases;
	}

	public Integer getEsophagectomyDone() {
		return esophagectomyDone;
	}

	public void setEsophagectomyDone(Integer esophagectomyDone) {
		this.esophagectomyDone = esophagectomyDone;
	}

	public Integer getResidualTumor() {
		return residualTumor;
	}

	public void setResidualTumor(Integer residualTumor) {
		this.residualTumor = residualTumor;
	}

	public Integer getDebulkingStatus() {
		return debulkingStatus;
	}

	public void setDebulkingStatus(Integer debulkingStatus) {
		this.debulkingStatus = debulkingStatus;
	}

	public Integer getPlatinStatus() {
		return platinStatus;
	}

	public void setPlatinStatus(Integer platinStatus) {
		this.platinStatus = platinStatus;
	}

	public Integer getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(Integer recurrence) {
		this.recurrence = recurrence;
	}

	public Date getDateRecurrence() {
		return dateRecurrence;
	}

	public void setDateRecurrence(Date dateRecurrence) {
		this.dateRecurrence = dateRecurrence;
	}

	public Date getSecondaryDebulkingDate() {
		return secondaryDebulkingDate;
	}

	public void setSecondaryDebulkingDate(Date secondaryDebulkingDate) {
		this.secondaryDebulkingDate = secondaryDebulkingDate;
	}

	public Date getIntervalDebulkingDt() {
		return intervalDebulkingDt;
	}

	public void setIntervalDebulkingDt(Date intervalDebulkingDt) {
		this.intervalDebulkingDt = intervalDebulkingDt;
	}

	public String getBaseLineCA125() {
		return baseLineCA125;
	}

	public void setBaseLineCA125(String baseLineCA125) {
		this.baseLineCA125 = baseLineCA125;
	}

	public Integer getPrgFreeSurvival() {
		return prgFreeSurvival;
	}

	public void setPrgFreeSurvival(Integer prgFreeSurvival) {
		this.prgFreeSurvival = prgFreeSurvival;
	}

	public Integer getOverallSurvival() {
		return overallSurvival;
	}

	public void setOverallSurvival(Integer overallSurvival) {
		this.overallSurvival = overallSurvival;
	}

	public Short getEsophagealCStagingMethod() {
		return esophagealCStagingMethod;
	}

	public void setEsophagealCStagingMethod(Short esophagealCStagingMethod) {
		this.esophagealCStagingMethod = esophagealCStagingMethod;
	}

	@XmlTransient
	public Collection<Encounter> getEncounterCollection() {
		return encounterCollection;
	}

	public void setEncounterCollection(Collection<Encounter> encounterCollection) {
		this.encounterCollection = encounterCollection;
	}

	@XmlTransient
	public Collection<Surgery> getSurgeryCollection() {
		return surgeryCollection;
	}

	public void setSurgeryCollection(Collection<Surgery> surgeryCollection) {
		this.surgeryCollection = surgeryCollection;
	}

	@XmlTransient
	public Collection<CaseResources> getCaseResourcesCollection() {
		return caseResourcesCollection;
	}

	public void setCaseResourcesCollection(
			Collection<CaseResources> caseResourcesCollection) {
		this.caseResourcesCollection = caseResourcesCollection;
	}

	@XmlTransient
	public Collection<CasePhysician> getCasePhysicianCollection() {
		return casePhysicianCollection;
	}

	public void setCasePhysicianCollection(
			Collection<CasePhysician> casePhysicianCollection) {
		this.casePhysicianCollection = casePhysicianCollection;
	}

	@XmlTransient
	public Collection<DiagnosticWorkup> getDiagnosticWorkupCollection() {
		return diagnosticWorkupCollection;
	}

	public void setDiagnosticWorkupCollection(
			Collection<DiagnosticWorkup> diagnosticWorkupCollection) {
		this.diagnosticWorkupCollection = diagnosticWorkupCollection;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Genetics getGenetics() {
		return genetics;
	}

	public void setGenetics(Genetics genetics) {
		this.genetics = genetics;
	}

	public Gemonics getGenomics() {
		return genomics;
	}

	public void setGenomics(Gemonics genomics) {
		this.genomics = genomics;
	}

	public TnmStage getFinalTNMStageId() {
		return finalTNMStageId;
	}

	public void setFinalTNMStageId(TnmStage finalTNMStageId) {
		this.finalTNMStageId = finalTNMStageId;
	}

	public TnmStage getWorkingTNMStageId() {
		return workingTNMStageId;
	}

	public void setWorkingTNMStageId(TnmStage workingTNMStageId) {
		this.workingTNMStageId = workingTNMStageId;
	}

	public Physician getReferingPhysiciaId() {
		return referingPhysiciaId;
	}

	public void setReferingPhysiciaId(Physician referingPhysiciaId) {
		this.referingPhysiciaId = referingPhysiciaId;
	}

	public Physician getMedOncPhysicianId() {
		return medOncPhysicianId;
	}

	public void setMedOncPhysicianId(Physician medOncPhysicianId) {
		this.medOncPhysicianId = medOncPhysicianId;
	}

	public Physician getRadOncPhysicianId() {
		return radOncPhysicianId;
	}

	public void setRadOncPhysicianId(Physician radOncPhysicianId) {
		this.radOncPhysicianId = radOncPhysicianId;
	}

	public Physician getPlasticSurgeonId() {
		return plasticSurgeonId;
	}

	public void setPlasticSurgeonId(Physician plasticSurgeonId) {
		this.plasticSurgeonId = plasticSurgeonId;
	}

	public Physician getSurgOncPhysicianId() {
		return surgOncPhysicianId;
	}

	public void setSurgOncPhysicianId(Physician surgOncPhysicianId) {
		this.surgOncPhysicianId = surgOncPhysicianId;
	}

	public CancerSubType getCancerSubTypeId() {
		return cancerSubTypeId;
	}

	public void setCancerSubTypeId(CancerSubType cancerSubTypeId) {
		this.cancerSubTypeId = cancerSubTypeId;
	}

	public CancerType getCancerTypeId() {
		return cancerTypeId;
	}

	public void setCancerTypeId(CancerType cancerTypeId) {
		this.cancerTypeId = cancerTypeId;
	}

	@XmlTransient
	public Collection<Biopsy> getBiopsyCollection() {
		return biopsyCollection;
	}

	public void setBiopsyCollection(Collection<Biopsy> biopsyCollection) {
		this.biopsyCollection = biopsyCollection;
	}

	@XmlTransient
	public Collection<TumorBoardDiscussion> getTumorBoardDiscussionCollection() {
		return tumorBoardDiscussionCollection;
	}

	public void setTumorBoardDiscussionCollection(
			Collection<TumorBoardDiscussion> tumorBoardDiscussionCollection) {
		this.tumorBoardDiscussionCollection = tumorBoardDiscussionCollection;
	}

	@XmlTransient
	public Collection<Chemotherapy> getChemotherapyCollection() {
		return chemotherapyCollection;
	}

	public void setChemotherapyCollection(
			Collection<Chemotherapy> chemotherapyCollection) {
		this.chemotherapyCollection = chemotherapyCollection;
	}

	@XmlTransient
	public Collection<Episode> getEpisodeCollection() {
		return episodeCollection;
	}

	public void setEpisodeCollection(Collection<Episode> episodeCollection) {
		this.episodeCollection = episodeCollection;
	}

	@XmlTransient
	public Collection<Pathology> getPathologyCollection() {
		return pathologyCollection;
	}

	public void setPathologyCollection(Collection<Pathology> pathologyCollection) {
		this.pathologyCollection = pathologyCollection;
	}

	@XmlTransient
	public Collection<PhysicalExam> getPhysicalExamCollection() {
		return physicalExamCollection;
	}

	public void setPhysicalExamCollection(
			Collection<PhysicalExam> physicalExamCollection) {
		this.physicalExamCollection = physicalExamCollection;
	}

	@XmlTransient
	public Collection<RadiationTherapy> getRadiationTherapyCollection() {
		return radiationTherapyCollection;
	}

	public void setRadiationTherapyCollection(
			Collection<RadiationTherapy> radiationTherapyCollection) {
		this.radiationTherapyCollection = radiationTherapyCollection;
	}

	@XmlTransient
	public Collection<CancerStage> getCancerStageCollection() {
		return cancerStageCollection;
	}

	public void setCancerStageCollection(
			Collection<CancerStage> cancerStageCollection) {
		this.cancerStageCollection = cancerStageCollection;
	}

	@XmlTransient
	public Collection<ForumAnswereResources> getForumAnswereResourcesCollection() {
		return forumAnswereResourcesCollection;
	}

	public void setForumAnswereResourcesCollection(
			Collection<ForumAnswereResources> forumAnswereResourcesCollection) {
		this.forumAnswereResourcesCollection = forumAnswereResourcesCollection;
	}

	@XmlTransient
	public Collection<Followup> getFollowupCollection() {
		return followupCollection;
	}

	public void setFollowupCollection(Collection<Followup> followupCollection) {
		this.followupCollection = followupCollection;
	}

	/**
	 * @return the later
	 */
	public String getLater() {
		return later;
	}

	/**
	 * @param later
	 *            the later to set
	 */
	public void setLater(String later) {
		this.later = later;
	}

	/**
	 * @return the stPrimary
	 */
	public Short getStPrimary() {
		return stPrimary;
	}

	/**
	 * @param stPrimary
	 *            the stPrimary to set
	 */
	public void setStPrimary(Short stPrimary) {
		this.stPrimary = stPrimary;
	}

	/**
	 * @return the ndPrimary
	 */
	public Short getNdPrimary() {
		return ndPrimary;
	}

	/**
	 * @param ndPrimary
	 *            the ndPrimary to set
	 */
	public void setNdPrimary(Short ndPrimary) {
		this.ndPrimary = ndPrimary;
	}

	/**
	 * @return the diseasePropagation
	 */
	public Short getDiseasePropagation() {
		return diseasePropagation;
	}

	/**
	 * @param diseasePropagation
	 *            the diseasePropagation to set
	 */
	public void setDiseasePropagation(Short diseasePropagation) {
		this.diseasePropagation = diseasePropagation;
	}

	/**
	 * @return the metastatic
	 */
	public Short getMetastatic() {
		return metastatic;
	}

	/**
	 * @param metastatic
	 *            the metastatic to set
	 */
	public void setMetastatic(Short metastatic) {
		this.metastatic = metastatic;
	}

	/**
	 * @return the chiefComplaint
	 */
	public String getChiefComplaint() {
		return chiefComplaint;
	}

	/**
	 * @param chiefComplaint
	 *            the chiefComplaint to set
	 */
	public void setChiefComplaint(String chiefComplaint) {
		this.chiefComplaint = chiefComplaint;
	}

	/**
	 * @return the lymfovascularInvasion
	 */
	public Short getLymfovascularInvasion() {
		return lymfovascularInvasion;
	}

	/**
	 * @param lymfovascularInvasion
	 *            the lymfovascularInvasion to set
	 */
	public void setLymfovascularInvasion(Short lymfovascularInvasion) {
		this.lymfovascularInvasion = lymfovascularInvasion;
	}

	/**
	 * @return the margins
	 */
	public String getMargins() {
		return margins;
	}

	/**
	 * @param margins
	 *            the margins to set
	 */
	public void setMargins(String margins) {
		this.margins = margins;
	}

	/**
	 * @return the closestMargins
	 */
	public String getClosestMargins() {
		return closestMargins;
	}

	/**
	 * @param closestMargins
	 *            the closestMargins to set
	 */
	public void setClosestMargins(String closestMargins) {
		this.closestMargins = closestMargins;
	}

	/**
	 * @return the immuneHistochemistry
	 */
	public String getImmuneHistochemistry() {
		return immuneHistochemistry;
	}

	/**
	 * @param immuneHistochemistry
	 *            the immuneHistochemistry to set
	 */
	public void setImmuneHistochemistry(String immuneHistochemistry) {
		this.immuneHistochemistry = immuneHistochemistry;
	}

	/**
	 * @return the noFossi
	 */
	public Integer getNoFossi() {
		return noFossi;
	}

	/**
	 * @param noFossi
	 *            the noFossi to set
	 */
	public void setNoFossi(Integer noFossi) {
		this.noFossi = noFossi;
	}

	/**
	 * @return the brca
	 */
	public Short getBrca() {
		return brca;
	}

	/**
	 * @param brca
	 *            the brca to set
	 */
	public void setBrca(Short brca) {
		this.brca = brca;
	}

	/**
	 * @return the oncDxScore
	 */
	public Integer getOncDxScore() {
		return oncDxScore;
	}

	/**
	 * @param oncDxScore
	 *            the oncDxScore to set
	 */
	public void setOncDxScore(Integer oncDxScore) {
		this.oncDxScore = oncDxScore;
	}

	/**
	 * @return the neoadjResponse
	 */
	public String getNeoadjResponse() {
		return neoadjResponse;
	}

	/**
	 * @param neoadjResponse
	 *            the neoadjResponse to set
	 */
	public void setNeoadjResponse(String neoadjResponse) {
		this.neoadjResponse = neoadjResponse;
	}

	/**
	 * @return the diseasetype
	 */
	public DiseaseType getDiseaseType() {
		return diseaseType;
	}

	/**
	 * @param diseasetype
	 *            the diseasetype to set
	 */
	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	/**
	 * @return the careFacility
	 */
	public CareFacility getCareFacility() {
		return careFacility;
	}

	/**
	 * @param careFacility
	 *            the careFacility to set
	 */
	public void setCareFacility(CareFacility careFacility) {
		this.careFacility = careFacility;
	}

	/**
	 * @return the functionalStatus
	 */
	public Functionalstatus getFunctionalStatus() {
		return functionalStatus;
	}

	/**
	 * @param functionalStatus
	 *            the functionalStatus to set
	 */
	public void setFunctionalStatus(Functionalstatus functionalStatus) {
		this.functionalStatus = functionalStatus;
	}

	/**
	 * @return the metastasis
	 */
	public short getMetastasis() {
		return metastasis;
	}

	/**
	 * @param metastasis
	 *            the metastasis to set
	 */
	public void setMetastasis(short metastasis) {
		this.metastasis = metastasis;
	}

	/**
	 * @return the metPrimarySite
	 */
	public String getMetPrimarySite() {
		return metPrimarySite;
	}

	/**
	 * @param metPrimarySite
	 *            the metPrimarySite to set
	 */
	public void setMetPrimarySite(String metPrimarySite) {
		this.metPrimarySite = metPrimarySite;
	}

	/**
	 * @return the otherBiomarkers
	 */
	public String getOtherBiomarkers() {
		return otherBiomarkers;
	}

	/**
	 * @param otherBiomarkers
	 *            the otherBiomarkers to set
	 */
	public void setOtherBiomarkers(String otherBiomarkers) {
		this.otherBiomarkers = otherBiomarkers;
	}

	/**
	 * @return the nln
	 */
	public int getNln() {
		return nln;
	}

	/**
	 * @param nln
	 *            the nln to set
	 */
	public void setNln(int nln) {
		this.nln = nln;
	}
	/**
	 * @return the tlocation
	 */
	public String getTlocation() {
		return tlocation;
	}

	/**
	 * @param tlocation the tlocation to set
	 */
	public void setTlocation(String tlocation) {
		this.tlocation = tlocation;
	}
	public String getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	/**
	 * @return the tumorType
	 */
	public String getTumorType() {
		return tumorType;
	}

	/**
	 * @param tumorType
	 *            the tumorType to set
	 */
	public void setTumorType(String tumorType) {
		this.tumorType = tumorType;
	}

	/**
	 * @return the tisBankPnr
	 */
	public Short getTisBankPnr() {
		return tisBankPnr;
	}

	/**
	 * @param tisBankPnr
	 *            the tisBankPnr to set
	 */
	public void setTisBankPnr(Short tisBankPnr) {
		this.tisBankPnr = tisBankPnr;
	}

	/**
	 * @return the tisBankOdunsi
	 */
	public Short getTisBankOdunsi() {
		return tisBankOdunsi;
	}

	/**
	 * @param tisBankOdunsi
	 *            the tisBankOdunsi to set
	 */
	public void setTisBankOdunsi(Short tisBankOdunsi) {
		this.tisBankOdunsi = tisBankOdunsi;
	}

	/**
	 * @return the nvInf
	 */
	public Short getNvInf() {
		return nvInf;
	}

	/**
	 * @param nvInf
	 *            the nvInf to set
	 */
	public void setNvInf(Short nvInf) {
		this.nvInf = nvInf;
	}

	/**
	 * @return the nyso
	 */
	public Short getNyso() {
		return nyso;
	}

	/**
	 * @param nyso
	 *            the nyso to set
	 */
	public void setNyso(Short nyso) {
		this.nyso = nyso;
	}

	/**
	 * @return the wt
	 */
	public Short getWt() {
		return wt;
	}

	/**
	 * @param wt
	 *            the wt to set
	 */
	public void setWt(Short wt) {
		this.wt = wt;
	}

	/**
	 * @return the ido
	 */
	public Short getIdo() {
		return ido;
	}

	/**
	 * @param ido
	 *            the ido to set
	 */
	public void setIdo(Short ido) {
		this.ido = ido;
	}

	/**
	 * @return the tisBank
	 */
	public Short getTisBank() {
		return tisBank;
	}

	/**
	 * @param tisBank
	 *            the tisBank to set
	 */
	public void setTisBank(Short tisBank) {
		this.tisBank = tisBank;
	}

	/**
	 * @return the mucosalInvasion
	 */
	public Short getMucosalInvasion() {
		return mucosalInvasion;
	}

	/**
	 * @param mucosalInvasion
	 *            the mucosalInvasion to set
	 */
	public void setMucosalInvasion(Short mucosalInvasion) {
		this.mucosalInvasion = mucosalInvasion;
	}

	/**
	 * @return the mi
	 */
	public String getMi() {
		return mi;
	}

	/**
	 * @param mi
	 *            the mi to set
	 */
	public void setMi(String mi) {
		this.mi = mi;
	}

	/**
	 * @return the lesionDepth
	 */
	public String getLesionDepth() {
		return lesionDepth;
	}

	/**
	 * @param lesionDepth
	 *            the lesionDepth to set
	 */
	public void setLesionDepth(String lesionDepth) {
		this.lesionDepth = lesionDepth;
	}

	/**
	 * @return the dist
	 */
	public String getDist() {
		return dist;
	}

	/**
	 * @param dist
	 *            the dist to set
	 */
	public void setDist(String dist) {
		this.dist = dist;
	}

	/**
	 * @return the gynOncologist
	 */
	public Physician getGynOncologist() {
		return gynOncologist;
	}

	/**
	 * @param gynOncologist
	 *            the gynOncologist to set
	 */
	public void setGynOncologist(Physician gynOncologist) {
		this.gynOncologist = gynOncologist;
	}

	/**
	 * @return the trupture
	 */
	public Short getTrupture() {
		return trupture;
	}

	/**
	 * @param trupture
	 *            the trupture to set
	 */
	public void setTrupture(Short trupture) {
		this.trupture = trupture;
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

	public String geteRStatus() {
		return eRStatus;
	}

	public void seteRStatus(String eRStatus) {
		this.eRStatus = eRStatus;
	}

	public Integer geteRPercent() {
		return eRPercent;
	}

	public void seteRPercent(Integer eRPercent) {
		this.eRPercent = eRPercent;
	}

	public String getpRStatus() {
		return pRStatus;
	}

	public void setpRStatus(String pRStatus) {
		this.pRStatus = pRStatus;
	}

	public Integer getpRPercent() {
		return pRPercent;
	}

	public void setpRPercent(Integer pRPercent) {
		this.pRPercent = pRPercent;
	}

	public String gethER2Status() {
		return hER2Status;
	}

	public void sethER2Status(String hER2Status) {
		this.hER2Status = hER2Status;
	}

	public Integer getwHOClassification() {
		return wHOClassification;
	}

	public void setwHOClassification(Integer wHOClassification) {
		this.wHOClassification = wHOClassification;
	}

	public Integer gettNodesInDiffLobe() {
		return tNodesInDiffLobe;
	}

	public void settNodesInDiffLobe(Integer tNodesInDiffLobe) {
		this.tNodesInDiffLobe = tNodesInDiffLobe;
	}

	public Short getTumorOnSurface() {
		return tumorOnSurface;
	}

	public void setTumorOnSurface(Short tumorOnSurface) {
		this.tumorOnSurface = tumorOnSurface;
	}

	public Short getLsvi() {
		return lsvi;
	}

	public void setLsvi(Short lsvi) {
		this.lsvi = lsvi;
	}

	public Short getParametrialInvasion() {
		return parametrialInvasion;
	}

	public void setParametrialInvasion(Short parametrialInvasion) {
		this.parametrialInvasion = parametrialInvasion;
	}

	public Short getStromalInvasion() {
		return stromalInvasion;
	}

	public void setStromalInvasion(Short stromalInvasion) {
		this.stromalInvasion = stromalInvasion;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Integer getHorizontalSpread() {
		return horizontalSpread;
	}

	public void setHorizontalSpread(Integer horizontalSpread) {
		this.horizontalSpread = horizontalSpread;
	}

	public Short getWashings() {
		return washings;
	}

	public void setWashings(Short washings) {
		this.washings = washings;
	}

	public Short getCapsuleIntact() {
		return capsuleIntact;
	}

	public void setCapsuleIntact(Short capsuleIntact) {
		this.capsuleIntact = capsuleIntact;
	}

	public Short getSurgicalSpill() {
		return surgicalSpill;
	}

	public void setSurgicalSpill(Short surgicalSpill) {
		this.surgicalSpill = surgicalSpill;
	}

	public String getMetastaticSite() {
		return metastaticSite;
	}

	public void setMetastaticSite(String metastaticSite) {
		this.metastaticSite = metastaticSite;
	}

	public String getLnMetastasisSite() {
		return lnMetastasisSite;
	}

	public void setLnMetastasisSite(String lnMetastasisSite) {
		this.lnMetastasisSite = lnMetastasisSite;
	}

	public Short getMalignantAscites() {
		return malignantAscites;
	}

	public void setMalignantAscites(Short malignantAscites) {
		this.malignantAscites = malignantAscites;
	}

	public Short getGrossCervicalInvolvement() {
		return grossCervicalInvolvement;
	}

	public void setGrossCervicalInvolvement(Short grossCervicalInvolvement) {
		this.grossCervicalInvolvement = grossCervicalInvolvement;
	}

	public Short getAorticNodePositive() {
		return aorticNodePositive;
	}

	public void setAorticNodePositive(Short aorticNodePositive) {
		this.aorticNodePositive = aorticNodePositive;
	}

	public Short getTumorPenetratedSerosalSurface() {
		return tumorPenetratedSerosalSurface;
	}

	public void setTumorPenetratedSerosalSurface(
			Short tumorPenetratedSerosalSurface) {
		this.tumorPenetratedSerosalSurface = tumorPenetratedSerosalSurface;
	}

	public Short getMalignantCellsInAscites() {
		return malignantCellsInAscites;
	}

	public void setMalignantCellsInAscites(Short malignantCellsInAscites) {
		this.malignantCellsInAscites = malignantCellsInAscites;
	}

	public Short getMalignantCellsInPeritonealWashings() {
		return malignantCellsInPeritonealWashings;
	}

	public void setMalignantCellsInPeritonealWashings(
			Short malignantCellsInPeritonealWashings) {
		this.malignantCellsInPeritonealWashings = malignantCellsInPeritonealWashings;
	}

	public Short getPeritonealImplants() {
		return peritonealImplants;
	}

	public void setPeritonealImplants(Short peritonealImplants) {
		this.peritonealImplants = peritonealImplants;
	}

	public Short getPelvicExtensions() {
		return pelvicExtensions;
	}

	public void setPelvicExtensions(Short pelvicExtensions) {
		this.pelvicExtensions = pelvicExtensions;
	}

	public Short getExtensionToOtherStructures() {
		return extensionToOtherStructures;
	}

	public void setExtensionToOtherStructures(Short extensionToOtherStructures) {
		this.extensionToOtherStructures = extensionToOtherStructures;
	}

	public String getSpecify() {
		return specify;
	}

	public void setSpecify(String specify) {
		this.specify = specify;
	}

	public Short getOperable() {
		return operable;
	}

	public void setOperable(Short operable) {
		this.operable = operable;
	}

	public Short getFertilitySparing() {
		return fertilitySparing;
	}

	public void setFertilitySparing(Short fertilitySparing) {
		this.fertilitySparing = fertilitySparing;
	}

	public Short getHydronephrosis() {
		return hydronephrosis;
	}

	public void setHydronephrosis(Short hydronephrosis) {
		this.hydronephrosis = hydronephrosis;
	}

	public Short getClinicallyVisibleLesion() {
		return clinicallyVisibleLesion;
	}

	public void setClinicallyVisibleLesion(Short clinicallyVisibleLesion) {
		this.clinicallyVisibleLesion = clinicallyVisibleLesion;
	}

	public Short getSurgicalCandidate() {
		return surgicalCandidate;
	}

	public void setSurgicalCandidate(Short surgicalCandidate) {
		this.surgicalCandidate = surgicalCandidate;
	}

	public Short getSurgicallyResectable() {
		return surgicallyResectable;
	}

	public void setSurgicallyResectable(Short surgicallyResectable) {
		this.surgicallyResectable = surgicallyResectable;
	}

	public Short getResidualDisease() {
		return residualDisease;
	}

	public void setResidualDisease(Short residualDisease) {
		this.residualDisease = residualDisease;
	}

	public Short getMalignantEpithelialCarcinoma() {
		return malignantEpithelialCarcinoma;
	}

	public void setMalignantEpithelialCarcinoma(
			Short malignantEpithelialCarcinoma) {
		this.malignantEpithelialCarcinoma = malignantEpithelialCarcinoma;
	}

	public Short getPureEndometrioidCarcinoma() {
		return pureEndometrioidCarcinoma;
	}

	public void setPureEndometrioidCarcinoma(Short pureEndometrioidCarcinoma) {
		this.pureEndometrioidCarcinoma = pureEndometrioidCarcinoma;
	}

	public Short getSerousCellCarcinoma() {
		return serousCellCarcinoma;
	}

	public void setSerousCellCarcinoma(Short serousCellCarcinoma) {
		this.serousCellCarcinoma = serousCellCarcinoma;
	}

	public Short getStromalTumor() {
		return stromalTumor;
	}

	public void setStromalTumor(Short stromalTumor) {
		this.stromalTumor = stromalTumor;
	}

	public Short getUterusDiseaseLimited() {
		return uterusDiseaseLimited;
	}

	public void setUterusDiseaseLimited(Short uterusDiseaseLimited) {
		this.uterusDiseaseLimited = uterusDiseaseLimited;
	}

	public Short getSuspectedExtrauterineDisease() {
		return suspectedExtrauterineDisease;
	}

	public String getTumorVolume() {
		return tumorVolume;
	}

	public void setTumorVolume(String tumorVolume) {
		this.tumorVolume = tumorVolume;
	}

	public String getCancerStatus() {
		return cancerStatus;
	}

	public void setCancerStatus(String cancerStatus) {
		this.cancerStatus = cancerStatus;
	}

	public String getProgressionFreeSurvivalAfterSurgery() {
		return progressionFreeSurvivalAfterSurgery;
	}

	public void setProgressionFreeSurvivalAfterSurgery(
			String progressionFreeSurvivalAfterSurgery) {
		this.progressionFreeSurvivalAfterSurgery = progressionFreeSurvivalAfterSurgery;
	}

	public String getProgressionFreeSurvivalAfterRt() {
		return progressionFreeSurvivalAfterRt;
	}

	public void setProgressionFreeSurvivalAfterRt(
			String progressionFreeSurvivalAfterRt) {
		this.progressionFreeSurvivalAfterRt = progressionFreeSurvivalAfterRt;
	}

	public String getProgressionFreeSurvivalAfterBt() {
		return progressionFreeSurvivalAfterBt;
	}

	public void setProgressionFreeSurvivalAfterBt(
			String progressionFreeSurvivalAfterBt) {
		this.progressionFreeSurvivalAfterBt = progressionFreeSurvivalAfterBt;
	}

	public Integer getAlfhaFp() {
		return alfhaFp;
	}

	public void setAlfhaFp(Integer alfhaFp) {
		this.alfhaFp = alfhaFp;
	}

	public String getPathologicalT() {
		return PathologicalT;
	}

	public void setPathologicalT(String PathologicalT) {
		this.PathologicalT = PathologicalT;
	}

	public Short getBladderNeck() {
		return bladderNeck;
	}

	public void setBladderNeck(Short bladderNeck) {
		this.bladderNeck = bladderNeck;
	}

	public Integer getBetaHcg() {
		return betaHcg;
	}

	public void setBetaHcg(Integer betaHcg) {
		this.betaHcg = betaHcg;
	}

	public Integer getLdh() {
		return ldh;
	}

	public void setLdh(Integer ldh) {
		this.ldh = ldh;
	}

	public Integer getProstateVolume() {
		return prostateVolume;
	}

	public void setProstateVolume(Integer prostateVolume) {
		this.prostateVolume = prostateVolume;
	}

	public String getBiopsyGleasonScore() {
		return biopsyGleasonScore;
	}

	public void setBiopsyGleasonScore(String biopsyGleasonScore) {
		this.biopsyGleasonScore = biopsyGleasonScore;
	}

	public String getSurgicalGleasonScore() {
		return surgicalGleasonScore;
	}

	public void setSurgicalGleasonScore(String surgicalGleasonScore) {
		this.surgicalGleasonScore = surgicalGleasonScore;
	}

	public Integer getNumberPositiveBiopsyCores() {
		return numberPositiveBiopsyCores;
	}

	public void setNumberPositiveBiopsyCores(Integer numberPositiveBiopsyCores) {
		this.numberPositiveBiopsyCores = numberPositiveBiopsyCores;
	}

	public String getPositiveBiopsyCoresLocation() {
		return positiveBiopsyCoresLocation;
	}

	public void setPositiveBiopsyCoresLocation(String positiveBiopsyCoresLocation) {
		this.positiveBiopsyCoresLocation = positiveBiopsyCoresLocation;
	}

	public String getPsaDoublingTime() {
		return psaDoublingTime;
	}

	public void setPsaDoublingTime(String psaDoublingTime) {
		this.psaDoublingTime = psaDoublingTime;
	}

	public Double getPsaDensity() {
		return psaDensity;
	}

	public void setPsaDensity(Double psaDensity) {
		this.psaDensity = psaDensity;
	}

	public Float getPsaCureRate() {
		return psaCureRate;
	}

	public void setPsaCureRate(Float psaCureRate) {
		this.psaCureRate = psaCureRate;
	}

	public Double getPsaLevels() {
		return psaLevels;
	}

	public void setPsaLevels(Double psaLevels) {
		this.psaLevels = psaLevels;
	}
	public String getNewPsaLevel() {
		return newPsaLevel;
	}

	public void setNewPsaLevel(String newPsaLevel) {
		this.newPsaLevel = newPsaLevel;
	}

	public Integer getNumberOfBxCores() {
		return numberOfBxCores;
	}

	public void setNumberOfBxCores(Integer numberOfBxCores) {
		this.numberOfBxCores = numberOfBxCores;
	}

	public Integer getNumberOfPositiveCores() {
		return numberOfPositiveCores;
	}

	public void setNumberOfPositiveCores(Integer numberOfPositiveCores) {
		this.numberOfPositiveCores = numberOfPositiveCores;
	}

	public Double getPercentOfPositiveCores() {
		return percentOfPositiveCores;
	}

	public void setPercentOfPositiveCores(Double percentOfPositiveCores) {
		this.percentOfPositiveCores = percentOfPositiveCores;
	}

	public String getProstateEchotexture() {
		return prostateEchotexture;
	}

	public void setProstateEchotexture(String prostateEchotexture) {
		this.prostateEchotexture = prostateEchotexture;
	}

	public Float getPercantCancerInAnyCore() {
		return percantCancerInAnyCore;
	}

	public void setPercantCancerInAnyCore(Float percantCancerInAnyCore) {
		this.percantCancerInAnyCore = percantCancerInAnyCore;
	}

	public Integer getNetLifeexpectancy() {
		return netLifeexpectancy;
	}

	public void setNetLifeexpectancy(Integer netLifeexpectancy) {
		this.netLifeexpectancy = netLifeexpectancy;
	}


	public String getTnmStagingSystem() {
		return tnmStagingSystem;
	}

	public void setTnmStagingSystem(String tnmStagingSystem) {
		this.tnmStagingSystem = tnmStagingSystem;
	}



	public Float getOneY() {
		return oneY;
	}

	public String getProbabilityofCadeathse() {
		return probabilityofCadeathse;
	}

	public void setProbabilityofCadeathse(String probabilityofCadeathse) {
		this.probabilityofCadeathse = probabilityofCadeathse;
	}

	public String getProbabilityofCadeathdt() {
		return probabilityofCadeathdt;
	}

	public void setProbabilityofCadeathdt(String probabilityofCadeathdt) {
		this.probabilityofCadeathdt = probabilityofCadeathdt;
	}

	public void setOneY(Float oneY) {
		this.oneY = oneY;
	}

	public Float getTwoY() {
		return twoY;
	}

	public void setTwoY(Float twoY) {
		this.twoY = twoY;
	}

	public Integer getCrpcMedianSurvivalInYears() {
		return crpcMedianSurvivalInYears;
	}

	public void setCrpcMedianSurvivalInYears(Integer crpcMedianSurvivalInYears) {
		this.crpcMedianSurvivalInYears = crpcMedianSurvivalInYears;
	}

	public Float getProbabilityOfLymphNodeInvolvement() {
		return probabilityOfLymphNodeInvolvement;
	}

	public void setProbabilityOfLymphNodeInvolvement(
			Float probabilityOfLymphNodeInvolvement) {
		this.probabilityOfLymphNodeInvolvement = probabilityOfLymphNodeInvolvement;
	}

	public String getProgressionFreeSurvivalProbabilityAfterSalvageRtSixY() {
		return progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
	}

	public void setProgressionFreeSurvivalProbabilityAfterSalvageRtSixY(
			String progressionFreeSurvivalProbabilityAfterSalvageRtSixY) {
		this.progressionFreeSurvivalProbabilityAfterSalvageRtSixY = progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
	}

	public Short getExtracapsularExtension() {
		return extracapsularExtension;
	}

	public void setExtracapsularExtension(Short extracapsularExtension) {
		this.extracapsularExtension = extracapsularExtension;
	}

	public Short getFixation() {
		return fixation;
	}

	public void setFixation(Short fixation) {
		this.fixation = fixation;
	}

	public Short getSeminalVesicleInvasion() {
		return seminalVesicleInvasion;
	}

	public void setSeminalVesicleInvasion(Short seminalVesicleInvasion) {
		this.seminalVesicleInvasion = seminalVesicleInvasion;
	}

	public Float getSeminalVInvasionPercentage() {
		return seminalVInvasionPercentage;
	}

	public void setSeminalVInvasionPercentage(Float seminalVInvasionPercentage) {
		this.seminalVInvasionPercentage = seminalVInvasionPercentage;
	}

	public Short getTumorInCentralLocation() {
		return tumorInCentralLocation;
	}

	public void setTumorInCentralLocation(Short tumorInCentralLocation) {
		this.tumorInCentralLocation = tumorInCentralLocation;
	}

	public Float getIndolentCancer() {
		return indolentCancer;
	}

	public void setIndolentCancer(Float indolentCancer) {
		this.indolentCancer = indolentCancer;
	}

	public String getLeftBaseMedial() {
		return leftBaseMedial;
	}

	public void setLeftBaseMedial(String leftBaseMedial) {
		this.leftBaseMedial = leftBaseMedial;
	}

	public String getLeftBaseLateral() {
		return leftBaseLateral;
	}

	public void setLeftBaseLateral(String leftBaseLateral) {
		this.leftBaseLateral = leftBaseLateral;
	}

	public String getRightBaseMedial() {
		return rightBaseMedial;
	}

	public void setRightBaseMedial(String rightBaseMedial) {
		this.rightBaseMedial = rightBaseMedial;
	}

	public String getRightBaseLateral() {
		return rightBaseLateral;
	}

	public void setRightBaseLateral(String rightBaseLateral) {
		this.rightBaseLateral = rightBaseLateral;
	}

	public String getLeftMidMedial() {
		return leftMidMedial;
	}

	public void setLeftMidMedial(String leftMidMedial) {
		this.leftMidMedial = leftMidMedial;
	}

	public String getLeftMidLateral() {
		return leftMidLateral;
	}

	public void setLeftMidLateral(String leftMidLateral) {
		this.leftMidLateral = leftMidLateral;
	}

	public String getRightMidMedial() {
		return rightMidMedial;
	}

	public void setRightMidMedial(String rightMidMedial) {
		this.rightMidMedial = rightMidMedial;
	}

	public String getRightMidLateral() {
		return rightMidLateral;
	}

	public void setRightMidLateral(String rightMidLateral) {
		this.rightMidLateral = rightMidLateral;
	}

	public String getLeftApexMedial() {
		return leftApexMedial;
	}

	public void setLeftApexMedial(String leftApexMedial) {
		this.leftApexMedial = leftApexMedial;
	}

	public String getLeftApexLateral() {
		return leftApexLateral;
	}

	public void setLeftApexLateral(String leftApexLateral) {
		this.leftApexLateral = leftApexLateral;
	}

	public String getRightApexMedial() {
		return rightApexMedial;
	}

	public void setRightApexMedial(String rightApexMedial) {
		this.rightApexMedial = rightApexMedial;
	}

	public String getRightApexLateral() {
		return rightApexLateral;
	}

	public void setRightApexLateral(String rightApexLateral) {
		this.rightApexLateral = rightApexLateral;
	}

	public Float getOrganConfinedDisease() {
		return organConfinedDisease;
	}

	public void setOrganConfinedDisease(Float organConfinedDisease) {
		this.organConfinedDisease = organConfinedDisease;
	}

	public Float getCapsularPenetration() {
		return capsularPenetration;
	}

	public void setCapsularPenetration(Float capsularPenetration) {
		this.capsularPenetration = capsularPenetration;
	}

	public Float getLymphNodeMets() {
		return lymphNodeMets;
	}

	public void setLymphNodeMets(Float lymphNodeMets) {
		this.lymphNodeMets = lymphNodeMets;
	}

	public void setSuspectedExtrauterineDisease(
			Short suspectedExtrauterineDisease) {
		this.suspectedExtrauterineDisease = suspectedExtrauterineDisease;
	}

	public Short getMyometrialInvasion() {
		return myometrialInvasion;
	}

	public void setMyometrialInvasion(Short myometrialInvasion) {
		this.myometrialInvasion = myometrialInvasion;
	}

	public Short getAdverseRiskFactors() {
		return adverseRiskFactors;
	}

	public void setAdverseRiskFactors(Short adverseRiskFactors) {
		this.adverseRiskFactors = adverseRiskFactors;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public Short getClearCellHistology() {
		return clearCellHistology;
	}

	public void setClearCellHistology(Short clearCellHistology) {
		this.clearCellHistology = clearCellHistology;
	}

	public Integer getNumberOfMetastaticSites() {
		return numberOfMetastaticSites;
	}

	public void setNumberOfMetastaticSites(Integer numberOfMetastaticSites) {
		this.numberOfMetastaticSites = numberOfMetastaticSites;
	}

	public String getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(String miscellaneous) {
		this.miscellaneous = miscellaneous;
	}
	public TumorLocation getTumorLocation() {
		return tumorLocation;
	}

	public void setTumorLocation(TumorLocation tumorLocation) {
		this.tumorLocation = tumorLocation;
	}

	public String getGeneticRiskEvaluation() {
		return geneticRiskEvaluation;
	}

	public void setGeneticRiskEvaluation(String geneticRiskEvaluation) {
		this.geneticRiskEvaluation = geneticRiskEvaluation;
	}

	public String getRefPhysician() {
		return refPhysician;
	}

	public void setRefPhysician(String refPhysician) {
		this.refPhysician = refPhysician;
	}
   
	/**
	 * @return the createdBy
	 */
	public Physician getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(Physician createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the lastUpdatedBy
	 */
	public Physician getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(Physician lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@XmlTransient
    public Collection<CaseQualityIndicator> getCaseQualityIndicatorCollection() {
        return caseQualityIndicatorCollection;
    }

    public void setCaseQualityIndicatorCollection(Collection<CaseQualityIndicator> caseQualityIndicatorCollection) {
        this.caseQualityIndicatorCollection = caseQualityIndicatorCollection;
    }
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (caseId != null ? caseId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Case1)) {
			return false;
		}
		Case1 other = (Case1) object;
		if ((this.caseId == null && other.caseId != null)
				|| (this.caseId != null && !this.caseId.equals(other.caseId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.Case1[ caseId=" + caseId + " ]";
	}

	/**
	 * @return the creationTime
	 */
	public Date getCreationTime() {
		return creationTime;
	}

	/**
	 * @param creationTime the creationTime to set
	 */
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

}

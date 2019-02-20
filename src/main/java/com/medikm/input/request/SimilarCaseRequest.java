package com.medikm.input.request;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.medikm.input.util.CustomJsonDateDeserializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Saikat
 * 
 */
@ApiModel(value = "Similar Case Request", description = "Similar Case Request.")
@XmlRootElement(name = "similarCaseRequest")
public class SimilarCaseRequest {

	private Integer caseId;
	private Integer patientId;
	private Integer age;
	private Double tumorSize;
	private Integer noNodes;
	private Short distantMets;
	private String distantMetsComm;
	private String clinicalStage;
	private Integer histologicalGrade;
	private String erStatus;
	private Integer erPercent;
	private String prStatus;
	private Integer prPercent;
	private Short caseHER2neuAmplified;
	private String her2Status;
	private String her2Sish;
	private Date primaryDiagnosisDt;
	private Short deceasedDueBC;
	private Short treatmentRelatedDeath;
	private Short unrelatedDeath;
	private Date dtDeath;
	private Date dateFirstEncounter;
	private Boolean significanceRisk;
	private Boolean significanceComorbities;
	private int version;
	private Short clinicalStagingMethod;
	private Integer wHOClassification;
	private Integer pleuralInv;
	private Integer necrosisPercent;
	private String necrosisPresent;
	private Integer reasonNotTreated;
	private Integer diseaseTreated;
	private Integer seenOnCT;
	private Integer durationOfSymptomsMon;
	private Integer seenOnMRI;
	private Integer seenOnPAT;
	private Integer seenOnThalliumScan;
	private Integer seenOnXray;
	private Integer seenOnBonescan;
	private Integer tumorDepth;
	private Integer invasionOfAdjStructure;
	private Integer invasionOfPleura;
	private Integer invasionOfChestWall;
	private Integer invasionOfDiaphragm;
	private Integer invasionOfPhrenicNerve;
	private Integer invasionOfPericardium;
	private Integer atelectasis;
	private Integer obstractivePneumonitis;
	private Integer separateTNodeInSameLobe;
	private Integer invasionInMediastnum;
	private Integer invasionIntoHeart;
	private Integer invasionOfMainBronchus;
	private Integer invasionIntoGreatVessels;
	private Integer invasionIntoTrachea;
	private Integer invasionIntoRecLaryngealNerve;
	private Integer invasionIntoEsophagus;
	private Integer invasionIntoVertbralBody;
	private Integer invasionIntoCarina;
	private Integer tNodesInDiffLobe;
	private String nodalMetastases;
	private Integer esophagectomyDone;
	private Integer residualTumor;
	private Integer debulkingStatus;
	private Integer platinStatus;
	private Integer recurrence;
	private Date dateRecurrence;
	private Date secondaryDebulkingDate;
	private Date intervalDebulkingDt;
	private String baseLineCA125;
	private Integer prgFreeSurvival;
	private Integer overallSurvival;
	private Short esophagealCStagingMethod;
	private Integer referingPhysicia;
	private Integer medOncPhysician;
	private Integer radOncPhysician;
	private Integer plasticSurgeon;
	private Integer surgOncPhysician;
	private Integer cancerSubType;
	private Integer cancerType;
	private int geneticsId;
	private int genomicsId;
	private Integer finalTNMStage;
	private int workingTNMStage;
	private int customerId;
	private String authToken;
	private String later;
	private Short stPrimary;
	private Short ndPrimary;
	private Short diseasePropagation;
	private Short metastatic;
	private String chiefComplaint;
	private Short lymfovascularInvasion;
	private String margins;
	private String closestMargins;
	private String immuneHistochemistry;
	private Integer noFossi;
	private Short brca;
	private Integer oncDxScore;
	private String neoadjResponse;
	private Integer diseaseTypeId;
	private Integer diseaseSubType;
	private Integer facilityId;
	private short metastasis;
	private String metPrimarySite;
	private String otherBiomarkers;
	private Integer nln;
	private String tlocation;
	private String tumorType;
	private Short tisBankPnr;
	private Short tisBankOdunsi;
	private Short nvInf;
	private Short nyso;
	private String wt;
	private Short ido;
	private Short tisBank;
	private Short mucosalInvasion;
	private String mi;
	private String lesionDepth;
	private String dist;
	private short trupture;
	private Integer gynOncologistId;
	private Integer pathologistId;
	private Short metPrimary;
	private Short tumorOnSurface;
	private Short lsvi;
	private Short parametrialInvasion;
	private Short stromalInvasion;
	private Integer depth;
	private Integer horizontalSpread;
	private Short washings;
	private Short capsuleIntact;
	private Short surgicalSpill;
	private String metastaticSite;
	private String lnMetastasisSite;
	private Short malignantAscites;
	private Short grossCervicalInvolvement;
	private Short aorticNodePositive;
	private Short tumorPenetratedSerosalSurface;
	private Short malignantCellsInAscites;
	private Short malignantCellsInPeritonealWashings;
	private Short peritonealImplants;
	private Short pelvicExtensions;
	private Short extensionToOtherStructures;
	private String specify;
	private Short operable;
	private Short fertilitySparing;
	private Short hydronephrosis;
	private Short clinicallyVisibleLesion;
	private Short surgicalCandidate;
	private Short bladderNeck;
	private Short surgicallyResectable;
	private String residualDisease;
	private Short malignantEpithelialCarcinoma;
	private Short pureEndometrioidCarcinoma;
	private Short serousCellCarcinoma;
	private Short stromalTumor;
	private Short uterusDiseaseLimited;
	private Short suspectedExtrauterineDisease;
	private Short myometrialInvasion;
	private Short adverseRiskFactors;
	private String details;
	private Short clearCellHistology;
	private Integer numberOfMetastaticSites;
	private String miscellaneous;
	private Integer tLocationId;
	private String geneticRiskEvaluation;
	private String refPhysician;
	private Short optimalcytred;
	private Short parametriumPos;
	private Short extracapsularExtension;
	private Short fixation;
	private Short seminalVesicleInvasion;
	private Float seminalVInvasionPercentage;
	private Short tumorInCentralLocation;
	private String progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
	private Integer crpcMedianSurvivalInYears;
	private Float probabilityOfLymphNodeInvolvement;
	private Float oneY;
	private Float twoY;
	private String probabilityofCadeathdt;
	private String tnmStagingSystem;
	private String pathologicalT;
	private String progressionFreeSurvivalAfterBt;
	private String progressionFreeSurvivalAfterRt;
	private Float lymphNodeMets;
	private Float capsularPenetration;
	private Float organConfinedDisease;
	private Float indolentCancer;
	private String leftBaseMedial;
	private String leftBaseLateral;
	private String rightBaseMedial;
	private String rightBaseLateral;
	private String leftMidMedial;
	private String leftMidLateral;
	private String rightMidMedial;
	private String rightMidLateral;
	private String leftApexMedial;
	private String leftApexLateral;
	private String rightApexMedial;
	private String rightApexLateral;
	private String probabilityofCadeathse;
	private Integer netLifeexpectancy;
	private String prostateEchotexture;
	private Float psaCureRate;
	private Float percantCancerInAnyCore;
	private String cap;
	private Double psaDensity;
	private String psaDoublingTime;
	private String positiveBiopsyCoresLocation;
	private Integer numberPositiveBiopsyCores;
	private String surgicalGleasonScore;
	private String biopsyGleasonScore;
	private Integer prostateVolume;
	private Integer ldh;
	private Integer betaHcg;
	private Integer alfhaFp;
	private Double percentOfPositiveCores;
	private Integer numberOfPositiveCores;
	private Integer numberOfBxCores;
	private Float psaLevels;
	private String newPsaLevel;
	private String progressionFreeSurvivalAfterSurgery;
	private String cancerStatus;
	private String tumorVolume;
	private String gender;
	private String menopauseStatus;
	private String percent;
	private String hER2newstatus;
	private String numOfCases;
	private String edi;
	private String stage;

	@ApiModelProperty(value = "Gender", notes = "Gender", dataType = "String")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@ApiModelProperty(value = "Menopause Status", notes = "Menopause Status", dataType = "String")
	public String getMenopauseStatus() {
		return menopauseStatus;
	}

	public void setMenopauseStatus(String menopauseStatus) {
		this.menopauseStatus = menopauseStatus;
	}

	@ApiModelProperty(value = "HER 2 news tatus", notes = "HER 2 news tatus", dataType = "String")
	public String gethER2newstatus() {
		return hER2newstatus;
	}

	public void sethER2newstatus(String hER2newstatus) {
		this.hER2newstatus = hER2newstatus;
	}

	@ApiModelProperty(value = "Pathologist Id", notes = "Pathologist Id", dataType = "Integer")
	public Integer getPathologistId() {
		return pathologistId;
	}

	public void setPathologistId(Integer pathologistId) {
		this.pathologistId = pathologistId;
	}

	@ApiModelProperty(value = "Disease SubType", notes = "Disease SubType", dataType = "Integer")
	public Integer getDiseaseSubType() {
		return diseaseSubType;
	}

	public void setDiseaseSubType(Integer diseaseSubType) {
		this.diseaseSubType = diseaseSubType;
	}

	@ApiModelProperty(value = "Met Primary", notes = "Met Primary")
	public Short getMetPrimary() {
		return metPrimary;
	}

	public void setMetPrimary(Short metPrimary) {
		this.metPrimary = metPrimary;
	}

	@ApiModelProperty(value = "Optimalcytred", notes = "Optimalcytred")
	public Short getOptimalcytred() {
		return optimalcytred;
	}

	public void setOptimalcytred(Short optimalcytred) {
		this.optimalcytred = optimalcytred;
	}

	@ApiModelProperty(value = "Parametrium Pos", notes = "Parametrium Pos")
	public Short getParametriumPos() {
		return parametriumPos;
	}

	public void setParametriumPos(Short parametriumPos) {
		this.parametriumPos = parametriumPos;
	}

	/**
	 * @return the caseId
	 */
	@ApiModelProperty(value = "Case Id", notes = "Case Id", dataType = "Integer")
	public Integer getCaseId() {
		return caseId;
	}

	/**
	 * @param caseId
	 *            the caseId to set
	 */
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	/**
	 * @return the age
	 */
	@ApiModelProperty(value = "Age", notes = "Age", dataType = "Integer")
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the tumorSize
	 */
	@ApiModelProperty(value = "Tumor Size", notes = "Tumor Size", dataType = "Double")
	public Double getTumorSize() {
		return tumorSize;
	}

	/**
	 * @param tumorSize
	 *            the tumorSize to set
	 */
	public void setTumorSize(Double tumorSize) {
		this.tumorSize = tumorSize;
	}

	/**
	 * @return the noNodes
	 */
	@ApiModelProperty(value = "No Nodes", notes = "No Nodes", dataType = "Integer")
	public Integer getNoNodes() {
		return noNodes;
	}

	/**
	 * @param noNodes
	 *            the noNodes to set
	 */
	public void setNoNodes(Integer noNodes) {
		this.noNodes = noNodes;
	}

	/**
	 * @return the distantMets
	 */
	@ApiModelProperty(value = "Distant Mets", notes = "Distant Mets")
	public Short getDistantMets() {
		return distantMets;
	}

	/**
	 * @param distantMets
	 *            the distantMets to set
	 */
	public void setDistantMets(Short distantMets) {
		this.distantMets = distantMets;
	}

	/**
	 * @return the distantMetsComm
	 */
	@ApiModelProperty(value = "Distant Mets Comm", notes = "Distant Mets Comm", dataType = "String")
	public String getDistantMetsComm() {
		return distantMetsComm;
	}

	/**
	 * @param distantMetsComm
	 *            the distantMetsComm to set
	 */
	public void setDistantMetsComm(String distantMetsComm) {
		this.distantMetsComm = distantMetsComm;
	}

	/**
	 * @return the clinicalStage
	 */
	@ApiModelProperty(value = "Clinical Stage", notes = "Clinical Stage", dataType = "String")
	public String getClinicalStage() {
		return clinicalStage;
	}

	/**
	 * @param clinicalStage
	 *            the clinicalStage to set
	 */
	public void setClinicalStage(String clinicalStage) {
		this.clinicalStage = clinicalStage;
	}

	/**
	 * @return the histologicalGrade
	 */
	@ApiModelProperty(value = "Histological Grade", notes = "Histological Grade", dataType = "Integer")
	public Integer getHistologicalGrade() {
		return histologicalGrade;
	}

	/**
	 * @param histologicalGrade
	 *            the histologicalGrade to set
	 */
	public void setHistologicalGrade(Integer histologicalGrade) {
		this.histologicalGrade = histologicalGrade;
	}

	/**
	 * @return the eRStatus
	 */
	@ApiModelProperty(value = "Er Status", notes = "Er Status", dataType = "String")
	public String getErStatus() {
		return erStatus;
	}

	/**
	 * @param eRStatus
	 *            the eRStatus to set
	 */
	public void setErStatus(String erStatus) {
		this.erStatus = erStatus;
	}

	/**
	 * @return the eRPercent
	 */
	@ApiModelProperty(value = "Er Percent", notes = "Er Percent", dataType = "Integer")
	public Integer getErPercent() {
		return erPercent;
	}

	/**
	 * @param eRPercent
	 *            the eRPercent to set
	 */
	public void setErPercent(Integer erPercent) {
		this.erPercent = erPercent;
	}

	/**
	 * @return the pRStatus
	 */
	@ApiModelProperty(value = "Pr Status", notes = "Pr Status", dataType = "String")
	public String getPrStatus() {
		return prStatus;
	}

	/**
	 * @param pRStatus
	 *            the pRStatus to set
	 */
	public void setPrStatus(String prStatus) {
		this.prStatus = prStatus;
	}

	/**
	 * @return the pRPercent
	 */
	@ApiModelProperty(value = "Pr Percent", notes = "Pr Percent", dataType = "Integer")
	public Integer getPrPercent() {
		return prPercent;
	}

	/**
	 * @param pRPercent
	 *            the pRPercent to set
	 */
	public void setPrPercent(Integer prPercent) {
		this.prPercent = prPercent;
	}

	/**
	 * @return the caseHER2neuAmplified
	 */
	@ApiModelProperty(value = "Case HER 2 neu Amplified", notes = "Case HER 2 neu Amplified")
	public Short getCaseHER2neuAmplified() {
		return caseHER2neuAmplified;
	}

	/**
	 * @param caseHER2neuAmplified
	 *            the caseHER2neuAmplified to set
	 */
	public void setCaseHER2neuAmplified(Short caseHER2neuAmplified) {
		this.caseHER2neuAmplified = caseHER2neuAmplified;
	}

	/**
	 * @return the hER2Status
	 */
	@ApiModelProperty(value = "Her 2 Status", notes = "Her 2 Status", dataType = "String")
	public String getHer2Status() {
		return her2Status;
	}

	/**
	 * @param hER2Status
	 *            the hER2Status to set
	 */
	public void setHer2Status(String her2Status) {
		this.her2Status = her2Status;
	}

	/**
	 * @return the her2Sish
	 */
	@ApiModelProperty(value = "Her 2 Sish", notes = "Her 2 Sish ", dataType = "String")
	public String getHer2Sish() {
		return her2Sish;
	}

	/**
	 * @param her2Sish
	 *            the her2Sish to set
	 */
	public void setHer2Sish(String her2Sish) {
		this.her2Sish = her2Sish;
	}

	/**
	 * @return the primaryDiagnosisDt
	 */
	@ApiModelProperty(value = "Primary Diagnosis Date", notes = "Primary Diagnosis Date", dataType = "Date")
	public Date getPrimaryDiagnosisDt() {
		return primaryDiagnosisDt;
	}

	/**
	 * @param primaryDiagnosisDt
	 *            the primaryDiagnosisDt to set
	 */
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setPrimaryDiagnosisDt(Date primaryDiagnosisDt) {
		this.primaryDiagnosisDt = primaryDiagnosisDt;
	}

	/**
	 * @return the deceasedDueBC
	 */
	@ApiModelProperty(value = "Deceased Due BC", notes = "Deceased Due BC")
	public Short getDeceasedDueBC() {
		return deceasedDueBC;
	}

	/**
	 * @param deceasedDueBC
	 *            the deceasedDueBC to set
	 */
	public void setDeceasedDueBC(Short deceasedDueBC) {
		this.deceasedDueBC = deceasedDueBC;
	}

	/**
	 * @return the treatmentRelatedDeath
	 */
	@ApiModelProperty(value = "Treatment Related Death", notes = "Treatment Related Death")
	public Short getTreatmentRelatedDeath() {
		return treatmentRelatedDeath;
	}

	/**
	 * @param treatmentRelatedDeath
	 *            the treatmentRelatedDeath to set
	 */
	public void setTreatmentRelatedDeath(Short treatmentRelatedDeath) {
		this.treatmentRelatedDeath = treatmentRelatedDeath;
	}

	/**
	 * @return the unrelatedDeath
	 */
	@ApiModelProperty(value = "Unrelated Death", notes = "Unrelated Death")
	public Short getUnrelatedDeath() {
		return unrelatedDeath;
	}

	/**
	 * @param unrelatedDeath
	 *            the unrelatedDeath to set
	 */
	public void setUnrelatedDeath(Short unrelatedDeath) {
		this.unrelatedDeath = unrelatedDeath;
	}

	/**
	 * @return the dtDeath
	 */
	@ApiModelProperty(value = "Date Death", notes = "Date Death", dataType = "Date")
	public Date getDtDeath() {
		return dtDeath;
	}

	/**
	 * @param dtDeath
	 *            the dtDeath to set
	 */
	public void setDtDeath(Date dtDeath) {
		this.dtDeath = dtDeath;
	}

	/**
	 * @return the dateFirstEncounter
	 */
	@ApiModelProperty(value = "Date First Encounter", notes = "Date First Encounter", dataType = "Date")
	public Date getDateFirstEncounter() {
		return dateFirstEncounter;
	}

	/**
	 * @param dateFirstEncounter
	 *            the dateFirstEncounter to set
	 */
	public void setDateFirstEncounter(Date dateFirstEncounter) {
		this.dateFirstEncounter = dateFirstEncounter;
	}

	/**
	 * @return the menopauseStatus
	 */

	/**
	 * @return the significanceRisk
	 */
	@ApiModelProperty(value = "Significance Risk", notes = "Significance Risk", dataType = "Boolean")
	public Boolean getSignificanceRisk() {
		return significanceRisk;
	}

	/**
	 * @param significanceRisk
	 *            the significanceRisk to set
	 */
	public void setSignificanceRisk(Boolean significanceRisk) {
		this.significanceRisk = significanceRisk;
	}

	/**
	 * @return the significanceComorbities
	 */
	@ApiModelProperty(value = "Significance Comorbities", notes = "Significance Comorbities", dataType = "Boolean")
	public Boolean getSignificanceComorbities() {
		return significanceComorbities;
	}

	/**
	 * @param significanceComorbities
	 *            the significanceComorbities to set
	 */
	public void setSignificanceComorbities(Boolean significanceComorbities) {
		this.significanceComorbities = significanceComorbities;
	}

	/**
	 * @return the version
	 */
	@ApiModelProperty(value = "Version", notes = "Version", dataType = "int")
	public int getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the clinicalStagingMethod
	 */
	@ApiModelProperty(value = "Clinical Staging Method", notes = "Clinical Staging Method")
	public Short getClinicalStagingMethod() {
		return clinicalStagingMethod;
	}

	/**
	 * @param clinicalStagingMethod
	 *            the clinicalStagingMethod to set
	 */
	public void setClinicalStagingMethod(Short clinicalStagingMethod) {
		this.clinicalStagingMethod = clinicalStagingMethod;
	}

	/**
	 * @return the wHOClassification
	 */
	@ApiModelProperty(value = "wHO Classification", notes = "wHO Classification", dataType = "Integer")
	public Integer getwHOClassification() {
		return wHOClassification;
	}

	/**
	 * @param wHOClassification
	 *            the wHOClassification to set
	 */
	public void setwHOClassification(Integer wHOClassification) {
		this.wHOClassification = wHOClassification;
	}

	/**
	 * @return the pleuralInv
	 */
	@ApiModelProperty(value = "Pleural Inv", notes = "Pleural Inv", dataType = "Integer")
	public Integer getPleuralInv() {
		return pleuralInv;
	}

	/**
	 * @param pleuralInv
	 *            the pleuralInv to set
	 */
	public void setPleuralInv(Integer pleuralInv) {
		this.pleuralInv = pleuralInv;
	}

	/**
	 * @return the necrosisPercent
	 */
	@ApiModelProperty(value = "Necrosis Percent", notes = "Necrosis Percent", dataType = "Integer")
	public Integer getNecrosisPercent() {
		return necrosisPercent;
	}

	/**
	 * @param necrosisPercent
	 *            the necrosisPercent to set
	 */
	public void setNecrosisPercent(Integer necrosisPercent) {
		this.necrosisPercent = necrosisPercent;
	}

	/**
	 * @return the necrosisPresent
	 */
	@ApiModelProperty(value = "Necrosis Present", notes = "Necrosis Present", dataType = "String")
	public String getNecrosisPresent() {
		return necrosisPresent;
	}

	/**
	 * @param necrosisPresent
	 *            the necrosisPresent to set
	 */
	public void setNecrosisPresent(String necrosisPresent) {
		this.necrosisPresent = necrosisPresent;
	}

	/**
	 * @return the reasonNotTreated
	 */
	@ApiModelProperty(value = "Reason Not Treated", notes = "Reason Not Treated", dataType = "Integer")
	public Integer getReasonNotTreated() {
		return reasonNotTreated;
	}

	/**
	 * @param reasonNotTreated
	 *            the reasonNotTreated to set
	 */
	public void setReasonNotTreated(Integer reasonNotTreated) {
		this.reasonNotTreated = reasonNotTreated;
	}

	/**
	 * @return the diseaseTreated
	 */
	@ApiModelProperty(value = "Disease Treated", notes = "Disease Treated", dataType = "Integer")
	public Integer getDiseaseTreated() {
		return diseaseTreated;
	}

	/**
	 * @param diseaseTreated
	 *            the diseaseTreated to set
	 */
	public void setDiseaseTreated(Integer diseaseTreated) {
		this.diseaseTreated = diseaseTreated;
	}

	/**
	 * @return the seenOnCT
	 */
	@ApiModelProperty(value = "Seen On CT", notes = "Seen On CT", dataType = "Integer")
	public Integer getSeenOnCT() {
		return seenOnCT;
	}

	/**
	 * @param seenOnCT
	 *            the seenOnCT to set
	 */
	public void setSeenOnCT(Integer seenOnCT) {
		this.seenOnCT = seenOnCT;
	}

	/**
	 * @return the durationOfSymptomsMon
	 */
	@ApiModelProperty(value = "Duration Of Symptoms Mon", notes = "Duration Of Symptoms Mon", dataType = "Integer")
	public Integer getDurationOfSymptomsMon() {
		return durationOfSymptomsMon;
	}

	/**
	 * @param durationOfSymptomsMon
	 *            the durationOfSymptomsMon to set
	 */
	public void setDurationOfSymptomsMon(Integer durationOfSymptomsMon) {
		this.durationOfSymptomsMon = durationOfSymptomsMon;
	}

	/**
	 * @return the seenOnMRI
	 */
	@ApiModelProperty(value = "Seen On MRI", notes = "Seen On MRI", dataType = "Integer")
	public Integer getSeenOnMRI() {
		return seenOnMRI;
	}

	/**
	 * @param seenOnMRI
	 *            the seenOnMRI to set
	 */
	public void setSeenOnMRI(Integer seenOnMRI) {
		this.seenOnMRI = seenOnMRI;
	}

	/**
	 * @return the seenOnPAT
	 */
	@ApiModelProperty(value = "Seen On PAT", notes = "Seen On PAT", dataType = "Integer")
	public Integer getSeenOnPAT() {
		return seenOnPAT;
	}

	/**
	 * @param seenOnPAT
	 *            the seenOnPAT to set
	 */
	public void setSeenOnPAT(Integer seenOnPAT) {
		this.seenOnPAT = seenOnPAT;
	}

	/**
	 * @return the seenOnThalliumScan
	 */
	@ApiModelProperty(value = "Seen On Thallium Scan", notes = "Seen On Thallium Scan", dataType = "Integer")
	public Integer getSeenOnThalliumScan() {
		return seenOnThalliumScan;
	}

	/**
	 * @param seenOnThalliumScan
	 *            the seenOnThalliumScan to set
	 */
	public void setSeenOnThalliumScan(Integer seenOnThalliumScan) {
		this.seenOnThalliumScan = seenOnThalliumScan;
	}

	/**
	 * @return the seenOnXray
	 */
	@ApiModelProperty(value = "Seen On Xray", notes = "Seen On Xray", dataType = "Integer")
	public Integer getSeenOnXray() {
		return seenOnXray;
	}

	/**
	 * @param seenOnXray
	 *            the seenOnXray to set
	 */
	public void setSeenOnXray(Integer seenOnXray) {
		this.seenOnXray = seenOnXray;
	}

	/**
	 * @return the seenOnBonescan
	 */
	@ApiModelProperty(value = "Seen On Bonescan", notes = "Seen On Bonescan", dataType = "Integer")
	public Integer getSeenOnBonescan() {
		return seenOnBonescan;
	}

	/**
	 * @param seenOnBonescan
	 *            the seenOnBonescan to set
	 */
	public void setSeenOnBonescan(Integer seenOnBonescan) {
		this.seenOnBonescan = seenOnBonescan;
	}

	/**
	 * @return the tumorDepth
	 */
	@ApiModelProperty(value = "Tumor Depth", notes = "Tumor Depth", dataType = "Integer")
	public Integer getTumorDepth() {
		return tumorDepth;
	}

	/**
	 * @param tumorDepth
	 *            the tumorDepth to set
	 */
	public void setTumorDepth(Integer tumorDepth) {
		this.tumorDepth = tumorDepth;
	}

	/**
	 * @return the invasionOfAdjStructure
	 */
	@ApiModelProperty(value = "Invasion Of Adj Structure", notes = "Invasion Of Adj Structure", dataType = "Integer")
	public Integer getInvasionOfAdjStructure() {
		return invasionOfAdjStructure;
	}

	/**
	 * @param invasionOfAdjStructure
	 *            the invasionOfAdjStructure to set
	 */
	public void setInvasionOfAdjStructure(Integer invasionOfAdjStructure) {
		this.invasionOfAdjStructure = invasionOfAdjStructure;
	}

	/**
	 * @return the invasionOfPleura
	 */
	@ApiModelProperty(value = "Invasion Of Pleura", notes = "Invasion Of Pleura", dataType = "Integer")
	public Integer getInvasionOfPleura() {
		return invasionOfPleura;
	}

	/**
	 * @param invasionOfPleura
	 *            the invasionOfPleura to set
	 */
	public void setInvasionOfPleura(Integer invasionOfPleura) {
		this.invasionOfPleura = invasionOfPleura;
	}

	/**
	 * @return the invasionOfChestWall
	 */
	@ApiModelProperty(value = "Invasion Of Chest Wall", notes = "Invasion Of Chest Wall", dataType = "Integer")
	public Integer getInvasionOfChestWall() {
		return invasionOfChestWall;
	}

	/**
	 * @param invasionOfChestWall
	 *            the invasionOfChestWall to set
	 */
	public void setInvasionOfChestWall(Integer invasionOfChestWall) {
		this.invasionOfChestWall = invasionOfChestWall;
	}

	/**
	 * @return the invasionOfDiaphragm
	 */
	@ApiModelProperty(value = "Invasion Of Diaphragm", notes = "Invasion Of Diaphragm", dataType = "Integer")
	public Integer getInvasionOfDiaphragm() {
		return invasionOfDiaphragm;
	}

	/**
	 * @param invasionOfDiaphragm
	 *            the invasionOfDiaphragm to set
	 */
	public void setInvasionOfDiaphragm(Integer invasionOfDiaphragm) {
		this.invasionOfDiaphragm = invasionOfDiaphragm;
	}

	/**
	 * @return the invasionOfPhrenicNerve
	 */
	@ApiModelProperty(value = "Invasion Of Phrenic Nerve", notes = "Invasion Of Phrenic Nerve", dataType = "Integer")
	public Integer getInvasionOfPhrenicNerve() {
		return invasionOfPhrenicNerve;
	}

	/**
	 * @param invasionOfPhrenicNerve
	 *            the invasionOfPhrenicNerve to set
	 */
	public void setInvasionOfPhrenicNerve(Integer invasionOfPhrenicNerve) {
		this.invasionOfPhrenicNerve = invasionOfPhrenicNerve;
	}

	/**
	 * @return the invasionOfPericardium
	 */
	@ApiModelProperty(value = "Invasion Of Pericardium", notes = "Invasion Of Pericardium", dataType = "Integer")
	public Integer getInvasionOfPericardium() {
		return invasionOfPericardium;
	}

	/**
	 * @param invasionOfPericardium
	 *            the invasionOfPericardium to set
	 */
	public void setInvasionOfPericardium(Integer invasionOfPericardium) {
		this.invasionOfPericardium = invasionOfPericardium;
	}

	/**
	 * @return the atelectasis
	 */
	@ApiModelProperty(value = "Atelectasis", notes = "Atelectasis", dataType = "Integer")
	public Integer getAtelectasis() {
		return atelectasis;
	}

	/**
	 * @param atelectasis
	 *            the atelectasis to set
	 */
	public void setAtelectasis(Integer atelectasis) {
		this.atelectasis = atelectasis;
	}

	/**
	 * @return the obstractivePneumonitis
	 */
	@ApiModelProperty(value = "Obstractive Pneumonitis", notes = "Obstractive Pneumonitis", dataType = "Integer")
	public Integer getObstractivePneumonitis() {
		return obstractivePneumonitis;
	}

	/**
	 * @param obstractivePneumonitis
	 *            the obstractivePneumonitis to set
	 */
	public void setObstractivePneumonitis(Integer obstractivePneumonitis) {
		this.obstractivePneumonitis = obstractivePneumonitis;
	}

	/**
	 * @return the separateTNodeInSameLobe
	 */
	@ApiModelProperty(value = "Separate TNode In Same Lobe", notes = "Separate TNode In Same Lobe", dataType = "Integer")
	public Integer getSeparateTNodeInSameLobe() {
		return separateTNodeInSameLobe;
	}

	/**
	 * @param separateTNodeInSameLobe
	 *            the separateTNodeInSameLobe to set
	 */
	public void setSeparateTNodeInSameLobe(Integer separateTNodeInSameLobe) {
		this.separateTNodeInSameLobe = separateTNodeInSameLobe;
	}

	/**
	 * @return the invasionInMediastnum
	 */
	@ApiModelProperty(value = "Invasion In Mediastnum", notes = "Invasion In Mediastnum", dataType = "Integer")
	public Integer getInvasionInMediastnum() {
		return invasionInMediastnum;
	}

	/**
	 * @param invasionInMediastnum
	 *            the invasionInMediastnum to set
	 */
	public void setInvasionInMediastnum(Integer invasionInMediastnum) {
		this.invasionInMediastnum = invasionInMediastnum;
	}

	/**
	 * @return the invasionIntoHeart
	 */
	@ApiModelProperty(value = "Invasion Into Heart", notes = "Invasion Into Heart", dataType = "Integer")
	public Integer getInvasionIntoHeart() {
		return invasionIntoHeart;
	}

	/**
	 * @param invasionIntoHeart
	 *            the invasionIntoHeart to set
	 */
	public void setInvasionIntoHeart(Integer invasionIntoHeart) {
		this.invasionIntoHeart = invasionIntoHeart;
	}

	/**
	 * @return the invasionOfMainBronchus
	 */
	@ApiModelProperty(value = "Invasion Of Main Bronchus", notes = "Invasion Of Main Bronchus", dataType = "Integer")
	public Integer getInvasionOfMainBronchus() {
		return invasionOfMainBronchus;
	}

	/**
	 * @param invasionOfMainBronchus
	 *            the invasionOfMainBronchus to set
	 */
	public void setInvasionOfMainBronchus(Integer invasionOfMainBronchus) {
		this.invasionOfMainBronchus = invasionOfMainBronchus;
	}

	/**
	 * @return the invasionIntoGreatVessels
	 */
	@ApiModelProperty(value = "Invasion Into Great Vessels", notes = "Invasion Into Great Vessels", dataType = "Integer")
	public Integer getInvasionIntoGreatVessels() {
		return invasionIntoGreatVessels;
	}

	/**
	 * @param invasionIntoGreatVessels
	 *            the invasionIntoGreatVessels to set
	 */
	public void setInvasionIntoGreatVessels(Integer invasionIntoGreatVessels) {
		this.invasionIntoGreatVessels = invasionIntoGreatVessels;
	}

	/**
	 * @return the invasionIntoTrachea
	 */
	@ApiModelProperty(value = "Invasion Into Trachea", notes = "Invasion Into Trachea", dataType = "Integer")
	public Integer getInvasionIntoTrachea() {
		return invasionIntoTrachea;
	}

	/**
	 * @param invasionIntoTrachea
	 *            the invasionIntoTrachea to set
	 */
	public void setInvasionIntoTrachea(Integer invasionIntoTrachea) {
		this.invasionIntoTrachea = invasionIntoTrachea;
	}

	/**
	 * @return the invasionIntoRecLaryngealNerve
	 */
	@ApiModelProperty(value = "Invasion Into Rec Laryngeal Nerve", notes = "Invasion Into Rec Laryngeal Nerve", dataType = "Integer")
	public Integer getInvasionIntoRecLaryngealNerve() {
		return invasionIntoRecLaryngealNerve;
	}

	/**
	 * @param invasionIntoRecLaryngealNerve
	 *            the invasionIntoRecLaryngealNerve to set
	 */
	public void setInvasionIntoRecLaryngealNerve(Integer invasionIntoRecLaryngealNerve) {
		this.invasionIntoRecLaryngealNerve = invasionIntoRecLaryngealNerve;
	}

	/**
	 * @return the invasionIntoEsophagus
	 */
	@ApiModelProperty(value = "Invasion Into Esophagus", notes = "Invasion Into Esophagus", dataType = "Integer")
	public Integer getInvasionIntoEsophagus() {
		return invasionIntoEsophagus;
	}

	/**
	 * @param invasionIntoEsophagus
	 *            the invasionIntoEsophagus to set
	 */
	public void setInvasionIntoEsophagus(Integer invasionIntoEsophagus) {
		this.invasionIntoEsophagus = invasionIntoEsophagus;
	}

	/**
	 * @return the invasionIntoVertbralBody
	 */
	@ApiModelProperty(value = "Invasion Into Vertbral Body", notes = "Invasion Into Vertbral Body", dataType = "Integer")
	public Integer getInvasionIntoVertbralBody() {
		return invasionIntoVertbralBody;
	}

	/**
	 * @param invasionIntoVertbralBody
	 *            the invasionIntoVertbralBody to set
	 */
	public void setInvasionIntoVertbralBody(Integer invasionIntoVertbralBody) {
		this.invasionIntoVertbralBody = invasionIntoVertbralBody;
	}

	/**
	 * @return the invasionIntoCarina
	 */
	@ApiModelProperty(value = "Invasion Into Carina", notes = "Invasion Into Carina", dataType = "Integer")
	public Integer getInvasionIntoCarina() {
		return invasionIntoCarina;
	}

	/**
	 * @param invasionIntoCarina
	 *            the invasionIntoCarina to set
	 */
	public void setInvasionIntoCarina(Integer invasionIntoCarina) {
		this.invasionIntoCarina = invasionIntoCarina;
	}

	/**
	 * @return the tNodesInDiffLobe
	 */
	@ApiModelProperty(value = "Nodes In Diff Lobe", notes = "Nodes In Diff Lobe", dataType = "Integer")
	public Integer gettNodesInDiffLobe() {
		return tNodesInDiffLobe;
	}

	/**
	 * @param tNodesInDiffLobe
	 *            the tNodesInDiffLobe to set
	 */
	public void settNodesInDiffLobe(Integer tNodesInDiffLobe) {
		this.tNodesInDiffLobe = tNodesInDiffLobe;
	}

	/**
	 * @return the nodalMetastases
	 */
	@ApiModelProperty(value = "Nodal Metastases", notes = "Nodal Metastases", dataType = "String")
	public String getNodalMetastases() {
		return nodalMetastases;
	}

	/**
	 * @param nodalMetastases
	 *            the nodalMetastases to set
	 */
	public void setNodalMetastases(String nodalMetastases) {
		this.nodalMetastases = nodalMetastases;
	}

	/**
	 * @return the esophagectomyDone
	 */
	@ApiModelProperty(value = "Esophagectomy Done", notes = "Esophagectomy Done", dataType = "Integer")
	public Integer getEsophagectomyDone() {
		return esophagectomyDone;
	}

	/**
	 * @param esophagectomyDone
	 *            the esophagectomyDone to set
	 */
	public void setEsophagectomyDone(Integer esophagectomyDone) {
		this.esophagectomyDone = esophagectomyDone;
	}

	/**
	 * @return the residualTumor
	 */
	@ApiModelProperty(value = "Residual Tumor", notes = "Residual Tumor", dataType = "Integer")
	public Integer getResidualTumor() {
		return residualTumor;
	}

	/**
	 * @param residualTumor
	 *            the residualTumor to set
	 */
	public void setResidualTumor(Integer residualTumor) {
		this.residualTumor = residualTumor;
	}

	/**
	 * @return the debulkingStatus
	 */
	@ApiModelProperty(value = "Debulking Status", notes = "Debulking Status", dataType = "Integer")
	public Integer getDebulkingStatus() {
		return debulkingStatus;
	}

	/**
	 * @param debulkingStatus
	 *            the debulkingStatus to set
	 */
	public void setDebulkingStatus(Integer debulkingStatus) {
		this.debulkingStatus = debulkingStatus;
	}

	/**
	 * @return the platinStatus
	 */
	@ApiModelProperty(value = "Platin Status", notes = "Platin Status", dataType = "Integer")
	public Integer getPlatinStatus() {
		return platinStatus;
	}

	/**
	 * @param platinStatus
	 *            the platinStatus to set
	 */
	public void setPlatinStatus(Integer platinStatus) {
		this.platinStatus = platinStatus;
	}

	/**
	 * @return the recurrence
	 */
	@ApiModelProperty(value = "Recurrence", notes = "Recurrence", dataType = "Integer")
	public Integer getRecurrence() {
		return recurrence;
	}

	/**
	 * @param recurrence
	 *            the recurrence to set
	 */
	public void setRecurrence(Integer recurrence) {
		this.recurrence = recurrence;
	}

	/**
	 * @return the dateRecurrence
	 */
	@ApiModelProperty(value = "Date Recurrence", notes = "Date Recurrence", dataType = "Date")
	public Date getDateRecurrence() {
		return dateRecurrence;
	}

	/**
	 * @param dateRecurrence
	 *            the dateRecurrence to set
	 */
	public void setDateRecurrence(Date dateRecurrence) {
		this.dateRecurrence = dateRecurrence;
	}

	/**
	 * @return the secondaryDebulkingDate
	 */
	@ApiModelProperty(value = "Secondary Debulking Date", notes = "Secondary Debulking Date", dataType = "Date")
	public Date getSecondaryDebulkingDate() {
		return secondaryDebulkingDate;
	}

	/**
	 * @param secondaryDebulkingDate
	 *            the secondaryDebulkingDate to set
	 */
	public void setSecondaryDebulkingDate(Date secondaryDebulkingDate) {
		this.secondaryDebulkingDate = secondaryDebulkingDate;
	}

	/**
	 * @return the intervalDebulkingDt
	 */
	@ApiModelProperty(value = "Interval Debulking Date", notes = "Interval Debulking Date", dataType = "Date")
	public Date getIntervalDebulkingDt() {
		return intervalDebulkingDt;
	}

	/**
	 * @param intervalDebulkingDt
	 *            the intervalDebulkingDt to set
	 */
	public void setIntervalDebulkingDt(Date intervalDebulkingDt) {
		this.intervalDebulkingDt = intervalDebulkingDt;
	}

	/**
	 * @return the baseLineCA125
	 */
	@ApiModelProperty(value = "Base Line CA125", notes = "Base Line CA125", dataType = "String")
	public String getBaseLineCA125() {
		return baseLineCA125;
	}

	/**
	 * @param baseLineCA125
	 *            the baseLineCA125 to set
	 */
	public void setBaseLineCA125(String baseLineCA125) {
		this.baseLineCA125 = baseLineCA125;
	}

	/**
	 * @return the prgFreeSurvival
	 */
	@ApiModelProperty(value = "Prg Free Survival", notes = "Prg Free Survival", dataType = "Integer")
	public Integer getPrgFreeSurvival() {
		return prgFreeSurvival;
	}

	/**
	 * @param prgFreeSurvival
	 *            the prgFreeSurvival to set
	 */
	public void setPrgFreeSurvival(Integer prgFreeSurvival) {
		this.prgFreeSurvival = prgFreeSurvival;
	}

	/**
	 * @return the overallSurvival
	 */
	@ApiModelProperty(value = "Overall Survival", notes = "Overall Survival", dataType = "Integer")
	public Integer getOverallSurvival() {
		return overallSurvival;
	}

	/**
	 * @param overallSurvival
	 *            the overallSurvival to set
	 */
	public void setOverallSurvival(Integer overallSurvival) {
		this.overallSurvival = overallSurvival;
	}

	/**
	 * @return the esophagealCStagingMethod
	 */
	@ApiModelProperty(value = "Esophageal C Staging Method", notes = "sophageal C Staging Method")
	public Short getEsophagealCStagingMethod() {
		return esophagealCStagingMethod;
	}

	/**
	 * @param esophagealCStagingMethod
	 *            the esophagealCStagingMethod to set
	 */
	public void setEsophagealCStagingMethod(Short esophagealCStagingMethod) {
		this.esophagealCStagingMethod = esophagealCStagingMethod;
	}

	/**
	 * @return the referingPhysicia
	 */
	@ApiModelProperty(value = "Refering Physicia", notes = "Refering Physicia", dataType = "Integer")
	public Integer getReferingPhysicia() {
		return referingPhysicia;
	}

	/**
	 * @param referingPhysicia
	 *            the referingPhysicia to set
	 */
	public void setReferingPhysicia(Integer referingPhysicia) {
		this.referingPhysicia = referingPhysicia;
	}

	/**
	 * @return the medOncPhysician
	 */
	@ApiModelProperty(value = "Med Onc Physician", notes = "Med Onc Physician", dataType = "Integer")
	public Integer getMedOncPhysician() {
		return medOncPhysician;
	}

	/**
	 * @param medOncPhysician
	 *            the medOncPhysician to set
	 */
	public void setMedOncPhysician(Integer medOncPhysician) {
		this.medOncPhysician = medOncPhysician;
	}

	/**
	 * @return the radOncPhysician
	 */
	@ApiModelProperty(value = "Rad Onc Physician", notes = "Rad Onc Physician", dataType = "Integer")
	public Integer getRadOncPhysician() {
		return radOncPhysician;
	}

	/**
	 * @param radOncPhysician
	 *            the radOncPhysician to set
	 */
	public void setRadOncPhysician(Integer radOncPhysician) {
		this.radOncPhysician = radOncPhysician;
	}

	/**
	 * @return the plasticSurgeon
	 */
	@ApiModelProperty(value = "Plastic Surgeon", notes = "Plastic Surgeon", dataType = "Integer")
	public Integer getPlasticSurgeon() {
		return plasticSurgeon;
	}

	/**
	 * @param plasticSurgeon
	 *            the plasticSurgeon to set
	 */
	public void setPlasticSurgeon(Integer plasticSurgeon) {
		this.plasticSurgeon = plasticSurgeon;
	}

	/**
	 * @return the surgOncPhysician
	 */
	@ApiModelProperty(value = "Surg Onc Physician", notes = "Surg Onc Physician", dataType = "Integer")
	public Integer getSurgOncPhysician() {
		return surgOncPhysician;
	}

	/**
	 * @param surgOncPhysician
	 *            the surgOncPhysician to set
	 */
	public void setSurgOncPhysician(Integer surgOncPhysician) {
		this.surgOncPhysician = surgOncPhysician;
	}

	/**
	 * @return the cancerSubType
	 */
	@ApiModelProperty(value = "Cancer SubType", notes = "Cancer SubType", dataType = "Integer")
	public Integer getCancerSubType() {
		return cancerSubType;
	}

	/**
	 * @param cancerSubType
	 *            the cancerSubType to set
	 */
	public void setCancerSubType(Integer cancerSubType) {
		this.cancerSubType = cancerSubType;
	}

	/**
	 * @return the cancerType
	 */
	@ApiModelProperty(value = "Cancer Type", notes = "Cancer Type", dataType = "Integer")
	public Integer getCancerType() {
		return cancerType;
	}

	/**
	 * @param cancerType
	 *            the cancerType to set
	 */
	public void setCancerType(Integer cancerType) {
		this.cancerType = cancerType;
	}

	/**
	 * @return the genetics
	 */
	@ApiModelProperty(value = "Genetics Id", notes = "Genetics Id", dataType = "int")
	public int getGeneticsId() {
		return geneticsId;
	}

	/**
	 * @param genetics
	 *            the genetics to set
	 */
	public void setGeneticsId(int geneticsId) {
		this.geneticsId = geneticsId;
	}

	/**
	 * @return the genomics
	 */
	@ApiModelProperty(value = "Genomics Id", notes = "Genomics Id", dataType = "int")
	public int getGenomicsId() {
		return genomicsId;
	}

	/**
	 * @param genomics
	 *            the genomics to set
	 */
	public void setGenomicsId(int genomicsId) {
		this.genomicsId = genomicsId;
	}

	/**
	 * @return the finalTNMStage
	 */
	@ApiModelProperty(value = "Final TNM Stage", notes = "Final TNM Stage", dataType = "Integer")
	public Integer getFinalTNMStage() {
		return finalTNMStage;
	}

	/**
	 * @param finalTNMStage
	 *            the finalTNMStage to set
	 */
	public void setFinalTNMStage(Integer finalTNMStage) {
		this.finalTNMStage = finalTNMStage;
	}

	/**
	 * @return the workingTNMStage
	 */
	@ApiModelProperty(value = "Working TNM Stage", notes = "Working TNM Stage", dataType = "int")
	public int getWorkingTNMStage() {
		return workingTNMStage;
	}

	/**
	 * @param workingTNMStage
	 *            the workingTNMStage to set
	 */
	public void setWorkingTNMStage(int workingTNMStage) {
		this.workingTNMStage = workingTNMStage;
	}

	/**
	 * @return the patient
	 */
	@ApiModelProperty(value = "Patient Id", notes = "Patient Id", dataType = "Integer")
	public Integer getPatientId() {
		return patientId;
	}

	/**
	 * @param patient
	 *            the patient to set
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the customerId
	 */
	@ApiModelProperty(value = "Customer Id", notes = "Customer Id", dataType = "int")
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the authToken
	 */
	@ApiModelProperty(value = "Auth Token", notes = "Auth Token", dataType = "String")
	public String getAuthToken() {
		return authToken;
	}

	/**
	 * @param authToken
	 *            the authToken to set
	 */
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	/**
	 * @return the later
	 */
	@ApiModelProperty(value = "Later", notes = "Later", dataType = "String")
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
	@ApiModelProperty(value = "St Primary", notes = "St Primary")
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
	@ApiModelProperty(value = "Nd Primary", notes = "Nd Primary")
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
	@ApiModelProperty(value = "Disease Propagation", notes = "Disease Propagation")
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
	@ApiModelProperty(value = "Metastatic", notes = "Metastatic")
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
	@ApiModelProperty(value = "Chief Complaint", notes = "Chief Complaint", dataType = "String")
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
	@ApiModelProperty(value = "Lymfovascular Invasion", notes = "Lymfovascular Invasion")
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
	@ApiModelProperty(value = "Margins", notes = "Margins", dataType = "String")
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
	@ApiModelProperty(value = "Closest Margins", notes = "Closest Margins", dataType = "String")
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
	@ApiModelProperty(value = "Immune Histochemistry", notes = "Immune Histochemistry", dataType = "String")
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
	@ApiModelProperty(value = "No Fossi", notes = "No Fossi", dataType = "Integer")
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
	@ApiModelProperty(value = "Brca", notes = "Brca")
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
	@ApiModelProperty(value = "Onc Dx Score", notes = "Onc Dx Score", dataType = "Integer")
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
	@ApiModelProperty(value = "Neoadj Response", notes = "Neoadj Response", dataType = "String")
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
	 * @return the diseaseType
	 */
	@ApiModelProperty(value = "Disease Type Id", notes = "Disease Type Id", dataType = "Integer")
	public Integer getDiseaseTypeId() {
		return diseaseTypeId;
	}

	/**
	 * @param diseaseType
	 *            the diseaseType to set
	 */
	public void setDiseaseTypeId(Integer diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	/**
	 * @return the facilityId
	 */
	@ApiModelProperty(value = "Facility Id", notes = "Facility Id", dataType = "Integer")
	public Integer getFacilityId() {
		return facilityId;
	}

	/**
	 * @param facilityId
	 *            the facilityId to set
	 */
	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	/**
	 * @return the metastasis
	 */
	@ApiModelProperty(value = "Metastasis", notes = "Metastasis")
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
	@ApiModelProperty(value = "Met Primary Site", notes = "Met Primary Site", dataType = "String")
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
	@ApiModelProperty(value = "Other Biomarkers", notes = "Other Biomarkers", dataType = "String")
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
	@ApiModelProperty(value = "Nln", notes = "Nln", dataType = "Integer")
	public Integer getNln() {
		return nln;
	}

	@ApiModelProperty(value = "Tlocation", notes = "Tlocation", dataType = "String")
	public String getTlocation() {
		return tlocation;
	}

	public void setTlocation(String tlocation) {
		this.tlocation = tlocation;
	}

	/**
	 * @param nln
	 *            the nln to set
	 */
	public void setNln(Integer nln) {
		this.nln = nln;
	}

	/**
	 * @return the tumorType
	 */
	@ApiModelProperty(value = "Tumor Type", notes = "Tumor Type", dataType = "String")
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
	@ApiModelProperty(value = "Tis Bank Pnr", notes = "Tis Bank Pnr")
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
	@ApiModelProperty(value = "Tis Bank Odunsi", notes = "Tis Bank Odunsi")
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
	@ApiModelProperty(value = "Nv Inf", notes = "Nv Inf")
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
	@ApiModelProperty(value = "Nyso", notes = "Nyso")
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
	@ApiModelProperty(value = "Wt", notes = "Wt", dataType = "String")
	public String getWt() {
		return wt;
	}

	/**
	 * @param wt
	 *            the wt to set
	 */
	public void setWt(String wt) {
		this.wt = wt;
	}

	/**
	 * @return the ido
	 */
	@ApiModelProperty(value = "Ido", notes = "Ido")
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
	@ApiModelProperty(value = "Tis Bank", notes = "Tis Bank")
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
	@ApiModelProperty(value = "Mucosal Invasion", notes = "Mucosal Invasion")
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
	@ApiModelProperty(value = "Mi", notes = "Mi", dataType = "String")
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
	@ApiModelProperty(value = "Lesion Depth", notes = "Lesion Depth", dataType = "String")
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
	@ApiModelProperty(value = "Dist", notes = "Dist", dataType = "String")
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
	@ApiModelProperty(value = "Gyn Oncologist Id", notes = "Gyn Oncologist Id", dataType = "Integer")
	public Integer getGynOncologistId() {
		return gynOncologistId;
	}

	/**
	 * @param gynOncologist
	 *            the gynOncologist to set
	 */
	public void setGynOncologistId(Integer gynOncologistId) {
		this.gynOncologistId = gynOncologistId;
	}

	/**
	 * @return the trupture
	 */
	@ApiModelProperty(value = "Trupture", notes = "Trupture")
	public short getTrupture() {
		return trupture;
	}

	/**
	 * @param trupture
	 *            the trupture to set
	 */
	public void setTrupture(short trupture) {
		this.trupture = trupture;
	}

	@ApiModelProperty(value = "Tumor On Surface", notes = "Tumor On Surface")
	public Short getTumorOnSurface() {
		return tumorOnSurface;
	}

	public void setTumorOnSurface(Short tumorOnSurface) {
		this.tumorOnSurface = tumorOnSurface;
	}

	@ApiModelProperty(value = "Lsvi", notes = "Lsvi")
	public Short getLsvi() {
		return lsvi;
	}

	public void setLsvi(Short lsvi) {
		this.lsvi = lsvi;
	}

	@ApiModelProperty(value = "Parametrial Invasion", notes = "Parametrial Invasion")
	public Short getParametrialInvasion() {
		return parametrialInvasion;
	}

	public void setParametrialInvasion(Short parametrialInvasion) {
		this.parametrialInvasion = parametrialInvasion;
	}

	@ApiModelProperty(value = "Stromal Invasion", notes = "Stromal Invasion")
	public Short getStromalInvasion() {
		return stromalInvasion;
	}

	public void setStromalInvasion(Short stromalInvasion) {
		this.stromalInvasion = stromalInvasion;
	}

	@ApiModelProperty(value = "Depth", notes = "Depth", dataType = "Integer")
	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	@ApiModelProperty(value = "Horizontal Spread", notes = "Horizontal Spread", dataType = "Integer")
	public Integer getHorizontalSpread() {
		return horizontalSpread;
	}

	public void setHorizontalSpread(Integer horizontalSpread) {
		this.horizontalSpread = horizontalSpread;
	}

	@ApiModelProperty(value = "Washings", notes = "Washings")
	public Short getWashings() {
		return washings;
	}

	public void setWashings(Short washings) {
		this.washings = washings;
	}

	@ApiModelProperty(value = "Capsule Intact", notes = "Capsule Intact")
	public Short getCapsuleIntact() {
		return capsuleIntact;
	}

	public void setCapsuleIntact(Short capsuleIntact) {
		this.capsuleIntact = capsuleIntact;
	}

	@ApiModelProperty(value = "SurgicalSpill", notes = "SurgicalSpill")
	public Short getSurgicalSpill() {
		return surgicalSpill;
	}

	public void setSurgicalSpill(Short surgicalSpill) {
		this.surgicalSpill = surgicalSpill;
	}

	@ApiModelProperty(value = "Metastatic Site", notes = "Metastatic Site", dataType = "String")
	public String getMetastaticSite() {
		return metastaticSite;
	}

	public void setMetastaticSite(String metastaticSite) {
		this.metastaticSite = metastaticSite;
	}

	@ApiModelProperty(value = "Ln Metastasis Site", notes = "Ln Metastasis Site", dataType = "String")
	public String getLnMetastasisSite() {
		return lnMetastasisSite;
	}

	public void setLnMetastasisSite(String lnMetastasisSite) {
		this.lnMetastasisSite = lnMetastasisSite;
	}

	@ApiModelProperty(value = "Malignant Ascites", notes = "Malignant Ascites")
	public Short getMalignantAscites() {
		return malignantAscites;
	}

	public void setMalignantAscites(Short malignantAscites) {
		this.malignantAscites = malignantAscites;
	}

	@ApiModelProperty(value = "Gross Cervical Involvement", notes = "Gross Cervical Involvement")
	public Short getGrossCervicalInvolvement() {
		return grossCervicalInvolvement;
	}

	public void setGrossCervicalInvolvement(Short grossCervicalInvolvement) {
		this.grossCervicalInvolvement = grossCervicalInvolvement;
	}

	@ApiModelProperty(value = "Aortic Node Positive", notes = "Aortic Node Positive")
	public Short getAorticNodePositive() {
		return aorticNodePositive;
	}

	public void setAorticNodePositive(Short aorticNodePositive) {
		this.aorticNodePositive = aorticNodePositive;
	}

	@ApiModelProperty(value = "Tumor Penetrated Serosal Surface", notes = "Tumor Penetrated Serosal Surface")
	public Short getTumorPenetratedSerosalSurface() {
		return tumorPenetratedSerosalSurface;
	}

	public void setTumorPenetratedSerosalSurface(Short tumorPenetratedSerosalSurface) {
		this.tumorPenetratedSerosalSurface = tumorPenetratedSerosalSurface;
	}

	@ApiModelProperty(value = "Malignant Cells In Ascites", notes = "Malignant Cells In Ascites")
	public Short getMalignantCellsInAscites() {
		return malignantCellsInAscites;
	}

	public void setMalignantCellsInAscites(Short malignantCellsInAscites) {
		this.malignantCellsInAscites = malignantCellsInAscites;
	}

	@ApiModelProperty(value = "Malignant Cells In Peritoneal Washings", notes = "Malignant Cells In Peritoneal Washings")
	public Short getMalignantCellsInPeritonealWashings() {
		return malignantCellsInPeritonealWashings;
	}

	public void setMalignantCellsInPeritonealWashings(Short malignantCellsInPeritonealWashings) {
		this.malignantCellsInPeritonealWashings = malignantCellsInPeritonealWashings;
	}

	@ApiModelProperty(value = "Peritoneal Implants", notes = "Peritoneal Implants")
	public Short getPeritonealImplants() {
		return peritonealImplants;
	}

	public void setPeritonealImplants(Short peritonealImplants) {
		this.peritonealImplants = peritonealImplants;
	}

	@ApiModelProperty(value = "Pelvic Extensions", notes = "Pelvic Extensions")
	public Short getPelvicExtensions() {
		return pelvicExtensions;
	}

	public void setPelvicExtensions(Short pelvicExtensions) {
		this.pelvicExtensions = pelvicExtensions;
	}

	@ApiModelProperty(value = "Extension To Other Structures", notes = "Extension To Other Structures")
	public Short getExtensionToOtherStructures() {
		return extensionToOtherStructures;
	}

	public void setExtensionToOtherStructures(Short extensionToOtherStructures) {
		this.extensionToOtherStructures = extensionToOtherStructures;
	}

	@ApiModelProperty(value = "Specify", notes = "Specify", dataType = "String")
	public String getSpecify() {
		return specify;
	}

	public void setSpecify(String specify) {
		this.specify = specify;
	}

	@ApiModelProperty(value = "Operable", notes = "Operable")
	public Short getOperable() {
		return operable;
	}

	public void setOperable(Short operable) {
		this.operable = operable;
	}

	@ApiModelProperty(value = "Fertility Sparing", notes = "Fertility Sparing")
	public Short getFertilitySparing() {
		return fertilitySparing;
	}

	public void setFertilitySparing(Short fertilitySparing) {
		this.fertilitySparing = fertilitySparing;
	}

	@ApiModelProperty(value = "Hydronephrosis", notes = "Hydronephrosis")
	public Short getHydronephrosis() {
		return hydronephrosis;
	}

	public void setHydronephrosis(Short hydronephrosis) {
		this.hydronephrosis = hydronephrosis;
	}

	@ApiModelProperty(value = "Clinically Visible Lesion", notes = "Clinically Visible Lesion")
	public Short getClinicallyVisibleLesion() {
		return clinicallyVisibleLesion;
	}

	public void setClinicallyVisibleLesion(Short clinicallyVisibleLesion) {
		this.clinicallyVisibleLesion = clinicallyVisibleLesion;
	}

	@ApiModelProperty(value = "Surgical Candidate", notes = "Surgical Candidate")
	public Short getSurgicalCandidate() {
		return surgicalCandidate;
	}

	public void setSurgicalCandidate(Short surgicalCandidate) {
		this.surgicalCandidate = surgicalCandidate;
	}

	@ApiModelProperty(value = "Bladder Neck", notes = "Bladder Neck")
	public Short getBladderNeck() {
		return bladderNeck;
	}

	public void setBladderNeck(Short bladderNeck) {
		this.bladderNeck = bladderNeck;
	}

	@ApiModelProperty(value = "Surgically Resectable", notes = "Surgically Resectable")
	public Short getSurgicallyResectable() {
		return surgicallyResectable;
	}

	public void setSurgicallyResectable(Short surgicallyResectable) {
		this.surgicallyResectable = surgicallyResectable;
	}

	@ApiModelProperty(value = "Residual Disease", notes = "Residual Disease", dataType = "String")
	public String getResidualDisease() {
		return residualDisease;
	}

	public void setResidualDisease(String residualDisease) {
		this.residualDisease = residualDisease;
	}

	@ApiModelProperty(value = "Malignant Epithelial Carcinoma", notes = "Malignant Epithelial Carcinoma")
	public Short getMalignantEpithelialCarcinoma() {
		return malignantEpithelialCarcinoma;
	}

	public void setMalignantEpithelialCarcinoma(Short malignantEpithelialCarcinoma) {
		this.malignantEpithelialCarcinoma = malignantEpithelialCarcinoma;
	}

	@ApiModelProperty(value = "Pure Endometrioid Carcinoma", notes = "Pure Endometrioid Carcinoma")
	public Short getPureEndometrioidCarcinoma() {
		return pureEndometrioidCarcinoma;
	}

	public void setPureEndometrioidCarcinoma(Short pureEndometrioidCarcinoma) {
		this.pureEndometrioidCarcinoma = pureEndometrioidCarcinoma;
	}

	@ApiModelProperty(value = "Serous Cell Carcinoma", notes = "Serous Cell Carcinoma")
	public Short getSerousCellCarcinoma() {
		return serousCellCarcinoma;
	}

	public void setSerousCellCarcinoma(Short serousCellCarcinoma) {
		this.serousCellCarcinoma = serousCellCarcinoma;
	}

	@ApiModelProperty(value = "Stromal Tumor", notes = "Stromal Tumor")
	public Short getStromalTumor() {
		return stromalTumor;
	}

	public void setStromalTumor(Short stromalTumor) {
		this.stromalTumor = stromalTumor;
	}

	@ApiModelProperty(value = "Uterus Disease Limited", notes = "Uterus Disease Limited")
	public Short getUterusDiseaseLimited() {
		return uterusDiseaseLimited;
	}

	public void setUterusDiseaseLimited(Short uterusDiseaseLimited) {
		this.uterusDiseaseLimited = uterusDiseaseLimited;
	}

	@ApiModelProperty(value = "Suspected Extrauterine Disease", notes = "Suspected Extrauterine Disease")
	public Short getSuspectedExtrauterineDisease() {
		return suspectedExtrauterineDisease;
	}

	public void setSuspectedExtrauterineDisease(Short suspectedExtrauterineDisease) {
		this.suspectedExtrauterineDisease = suspectedExtrauterineDisease;
	}

	@ApiModelProperty(value = "Myometrial Invasion", notes = "Myometrial Invasion")
	public Short getMyometrialInvasion() {
		return myometrialInvasion;
	}

	public void setMyometrialInvasion(Short myometrialInvasion) {
		this.myometrialInvasion = myometrialInvasion;
	}

	@ApiModelProperty(value = "Adverse Risk Factors", notes = "Adverse Risk Factors")
	public Short getAdverseRiskFactors() {
		return adverseRiskFactors;
	}

	public void setAdverseRiskFactors(Short adverseRiskFactors) {
		this.adverseRiskFactors = adverseRiskFactors;
	}

	@ApiModelProperty(value = "Details", notes = "Details", dataType = "String")
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@ApiModelProperty(value = "Clear Cell Histology", notes = "Clear Cell Histology")
	public Short getClearCellHistology() {
		return clearCellHistology;
	}

	public void setClearCellHistology(Short clearCellHistology) {
		this.clearCellHistology = clearCellHistology;
	}

	@ApiModelProperty(value = "Numbe rOf Metastatic Sites", notes = "Number Of Metastatic Sites", dataType = "Integer")
	public Integer getNumberOfMetastaticSites() {
		return numberOfMetastaticSites;
	}

	public void setNumberOfMetastaticSites(Integer numberOfMetastaticSites) {
		this.numberOfMetastaticSites = numberOfMetastaticSites;
	}

	@ApiModelProperty(value = "Miscellaneous", notes = "Miscellaneous", dataType = "String")
	public String getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(String miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	@ApiModelProperty(value = "tLocation Id", notes = "tLocation Id", dataType = "Integer")
	public Integer gettLocationId() {
		return tLocationId;
	}

	public void settLocationId(Integer tLocationId) {
		this.tLocationId = tLocationId;
	}

	@ApiModelProperty(value = "Genetic Risk Evaluation", notes = "Genetic Risk Evaluation", dataType = "String")
	public String getGeneticRiskEvaluation() {
		return geneticRiskEvaluation;
	}

	public void setGeneticRiskEvaluation(String geneticRiskEvaluation) {
		this.geneticRiskEvaluation = geneticRiskEvaluation;
	}

	@ApiModelProperty(value = "Ref Physician", notes = "Ref Physician", dataType = "String")
	public String getRefPhysician() {
		return refPhysician;
	}

	public void setRefPhysician(String refPhysician) {
		this.refPhysician = refPhysician;
	}

	@ApiModelProperty(value = "Extracapsular Extension", notes = "Extracapsular Extension")
	public Short getExtracapsularExtension() {
		return extracapsularExtension;
	}

	public void setExtracapsularExtension(Short extracapsularExtension) {
		this.extracapsularExtension = extracapsularExtension;
	}

	@ApiModelProperty(value = "Fixation", notes = "Fixation")
	public Short getFixation() {
		return fixation;
	}

	public void setFixation(Short fixation) {
		this.fixation = fixation;
	}

	@ApiModelProperty(value = "Seminal Vesicle Invasion", notes = "Seminal Vesicle Invasion")
	public Short getSeminalVesicleInvasion() {
		return seminalVesicleInvasion;
	}

	public void setSeminalVesicleInvasion(Short seminalVesicleInvasion) {
		this.seminalVesicleInvasion = seminalVesicleInvasion;
	}

	@ApiModelProperty(value = "Tumor In Central Location", notes = "Tumor In Central Location")
	public Short getTumorInCentralLocation() {
		return tumorInCentralLocation;
	}

	public void setTumorInCentralLocation(Short tumorInCentralLocation) {
		this.tumorInCentralLocation = tumorInCentralLocation;
	}

	@ApiModelProperty(value = "One Y", notes = "One Y", dataType = "Float")
	public Float getOneY() {
		return oneY;
	}

	public void setOneY(Float oneY) {
		this.oneY = oneY;
	}

	@ApiModelProperty(value = "Two Y", notes = "Two Y", dataType = "Float")
	public Float getTwoY() {
		return twoY;
	}

	public void setTwoY(Float twoY) {
		this.twoY = twoY;
	}

	@ApiModelProperty(value = "Tnm Staging System", notes = "Tnm Staging System", dataType = "String")
	public String getTnmStagingSystem() {
		return tnmStagingSystem;
	}

	public void setTnmStagingSystem(String tnmStagingSystem) {
		this.tnmStagingSystem = tnmStagingSystem;
	}

	@ApiModelProperty(value = "Lymph Node Mets", notes = "Lymph Node Mets", dataType = "Float")
	public Float getLymphNodeMets() {
		return lymphNodeMets;
	}

	public void setLymphNodeMets(Float lymphNodeMets) {
		this.lymphNodeMets = lymphNodeMets;
	}

	@ApiModelProperty(value = "Capsular Penetration", notes = "Capsular Penetration", dataType = "Float")
	public Float getCapsularPenetration() {
		return capsularPenetration;
	}

	public void setCapsularPenetration(Float capsularPenetration) {
		this.capsularPenetration = capsularPenetration;
	}

	@ApiModelProperty(value = "Organ Confined Disease", notes = "Organ Confined Disease", dataType = "Float")
	public Float getOrganConfinedDisease() {
		return organConfinedDisease;
	}

	public void setOrganConfinedDisease(Float organConfinedDisease) {
		this.organConfinedDisease = organConfinedDisease;
	}

	@ApiModelProperty(value = "Indolent Cancer", notes = "Indolent Cancer", dataType = "Float")
	public Float getIndolentCancer() {
		return indolentCancer;
	}

	public void setIndolentCancer(Float indolentCancer) {
		this.indolentCancer = indolentCancer;
	}

	@ApiModelProperty(value = "Left Base Medial", notes = "Left Base Medial", dataType = "String")
	public String getLeftBaseMedial() {
		return leftBaseMedial;
	}

	public void setLeftBaseMedial(String leftBaseMedial) {
		this.leftBaseMedial = leftBaseMedial;
	}

	@ApiModelProperty(value = "Left Base Lateral", notes = "Left Base Lateral", dataType = "String")
	public String getLeftBaseLateral() {
		return leftBaseLateral;
	}

	public void setLeftBaseLateral(String leftBaseLateral) {
		this.leftBaseLateral = leftBaseLateral;
	}

	@ApiModelProperty(value = "Right Base Medial", notes = "Right Base Medial", dataType = "String")
	public String getRightBaseMedial() {
		return rightBaseMedial;
	}

	public void setRightBaseMedial(String rightBaseMedial) {
		this.rightBaseMedial = rightBaseMedial;
	}

	@ApiModelProperty(value = "Right Base Lateral", notes = "Right Base Lateral", dataType = "String")
	public String getRightBaseLateral() {
		return rightBaseLateral;
	}

	public void setRightBaseLateral(String rightBaseLateral) {
		this.rightBaseLateral = rightBaseLateral;
	}

	@ApiModelProperty(value = "Left Mid Medial", notes = "Left Mid Medial", dataType = "String")
	public String getLeftMidMedial() {
		return leftMidMedial;
	}

	public void setLeftMidMedial(String leftMidMedial) {
		this.leftMidMedial = leftMidMedial;
	}

	@ApiModelProperty(value = "Left Mid Lateral", notes = "Left Mid Lateral", dataType = "String")
	public String getLeftMidLateral() {
		return leftMidLateral;
	}

	public void setLeftMidLateral(String leftMidLateral) {
		this.leftMidLateral = leftMidLateral;
	}

	@ApiModelProperty(value = "Right Mid Medial", notes = "Right Mid Medial", dataType = "String")
	public String getRightMidMedial() {
		return rightMidMedial;
	}

	public void setRightMidMedial(String rightMidMedial) {
		this.rightMidMedial = rightMidMedial;
	}

	@ApiModelProperty(value = "Right Mid Lateral", notes = "Right Mid Lateral", dataType = "String")
	public String getRightMidLateral() {
		return rightMidLateral;
	}

	public void setRightMidLateral(String rightMidLateral) {
		this.rightMidLateral = rightMidLateral;
	}

	@ApiModelProperty(value = "Left Apex Medial", notes = "Left Apex Medial", dataType = "String")
	public String getLeftApexMedial() {
		return leftApexMedial;
	}

	public void setLeftApexMedial(String leftApexMedial) {
		this.leftApexMedial = leftApexMedial;
	}

	@ApiModelProperty(value = "Left Apex Lateral", notes = "Left Apex Lateral", dataType = "String")
	public String getLeftApexLateral() {
		return leftApexLateral;
	}

	public void setLeftApexLateral(String leftApexLateral) {
		this.leftApexLateral = leftApexLateral;
	}

	@ApiModelProperty(value = "Right Apex Medial", notes = "Right Apex Medial", dataType = "String")
	public String getRightApexMedial() {
		return rightApexMedial;
	}

	public void setRightApexMedial(String rightApexMedial) {
		this.rightApexMedial = rightApexMedial;
	}

	@ApiModelProperty(value = "Right Apex Lateral", notes = "Right Apex Lateral", dataType = "String")
	public String getRightApexLateral() {
		return rightApexLateral;
	}

	public void setRightApexLateral(String rightApexLateral) {
		this.rightApexLateral = rightApexLateral;
	}

	@ApiModelProperty(value = "Net Lifeexpectancy", notes = "Net Lifeexpectancy", dataType = "Integer")
	public Integer getNetLifeexpectancy() {
		return netLifeexpectancy;
	}

	public void setNetLifeexpectancy(Integer netLifeexpectancy) {
		this.netLifeexpectancy = netLifeexpectancy;
	}

	@ApiModelProperty(value = "Prostate Echotexture", notes = "Prostate Echotexture", dataType = "String")
	public String getProstateEchotexture() {
		return prostateEchotexture;
	}

	public void setProstateEchotexture(String prostateEchotexture) {
		this.prostateEchotexture = prostateEchotexture;
	}

	@ApiModelProperty(value = "Psa Cure Rate", notes = "Psa Cure Rate", dataType = "Float")
	public Float getPsaCureRate() {
		return psaCureRate;
	}

	public void setPsaCureRate(Float psaCureRate) {
		this.psaCureRate = psaCureRate;
	}

	@ApiModelProperty(value = "Psa Density", notes = "Psa Density", dataType = "Double")
	public Double getPsaDensity() {
		return psaDensity;
	}

	public void setPsaDensity(Double psaDensity) {
		this.psaDensity = psaDensity;
	}

	@ApiModelProperty(value = "Psa Doubling Time", notes = "Psa Doubling Time", dataType = "String")
	public String getPsaDoublingTime() {
		return psaDoublingTime;
	}

	public void setPsaDoublingTime(String psaDoublingTime) {
		this.psaDoublingTime = psaDoublingTime;
	}

	@ApiModelProperty(value = "Surgical Gleason Score", notes = "Surgical Gleason Score", dataType = "String")
	public String getSurgicalGleasonScore() {
		return surgicalGleasonScore;
	}

	public void setSurgicalGleasonScore(String surgicalGleasonScore) {
		this.surgicalGleasonScore = surgicalGleasonScore;
	}

	@ApiModelProperty(value = "Seminal V Invasion Percentage", notes = "Seminal V Invasion Percentage", dataType = "Float")
	public Float getSeminalVInvasionPercentage() {
		return seminalVInvasionPercentage;
	}

	public void setSeminalVInvasionPercentage(Float seminalVInvasionPercentage) {
		this.seminalVInvasionPercentage = seminalVInvasionPercentage;
	}

	@ApiModelProperty(value = "Number Positive Biopsy Cores", notes = "Number Positive Biopsy Cores", dataType = "Integer")
	public Integer getNumberPositiveBiopsyCores() {
		return numberPositiveBiopsyCores;
	}

	public void setNumberPositiveBiopsyCores(Integer numberPositiveBiopsyCores) {
		this.numberPositiveBiopsyCores = numberPositiveBiopsyCores;
	}

	@ApiModelProperty(value = "Biopsy Gleason Score", notes = "Biopsy Gleason Score", dataType = "String")
	public String getBiopsyGleasonScore() {
		return biopsyGleasonScore;
	}

	public void setBiopsyGleasonScore(String biopsyGleasonScore) {
		this.biopsyGleasonScore = biopsyGleasonScore;
	}

	@ApiModelProperty(value = "Prostate Volume", notes = "Prostate Volume", dataType = "Integer")
	public Integer getProstateVolume() {
		return prostateVolume;
	}

	public void setProstateVolume(Integer prostateVolume) {
		this.prostateVolume = prostateVolume;
	}

	@ApiModelProperty(value = "Ldh", notes = "Ldh", dataType = "Integer")
	public Integer getLdh() {
		return ldh;
	}

	public void setLdh(Integer ldh) {
		this.ldh = ldh;
	}

	@ApiModelProperty(value = "Positive Biopsy Cores Location", notes = "Positive Biopsy Cores Location", dataType = "String")
	public String getPositiveBiopsyCoresLocation() {
		return positiveBiopsyCoresLocation;
	}

	public void setPositiveBiopsyCoresLocation(String positiveBiopsyCoresLocation) {
		this.positiveBiopsyCoresLocation = positiveBiopsyCoresLocation;
	}

	@ApiModelProperty(value = "Beta Hcg", notes = "Beta Hcg", dataType = "Integer")
	public Integer getBetaHcg() {
		return betaHcg;
	}

	public void setBetaHcg(Integer betaHcg) {
		this.betaHcg = betaHcg;
	}

	@ApiModelProperty(value = "Alfha Fp", notes = "Alfha Fp", dataType = "Integer")
	public Integer getAlfhaFp() {
		return alfhaFp;
	}

	public void setAlfhaFp(Integer alfhaFp) {
		this.alfhaFp = alfhaFp;
	}

	@ApiModelProperty(value = "Percent Of Positive Cores", notes = "Percent Of Positive Cores", dataType = "Double")
	public Double getPercentOfPositiveCores() {
		return percentOfPositiveCores;
	}

	public void setPercentOfPositiveCores(Double percentOfPositiveCores) {
		this.percentOfPositiveCores = percentOfPositiveCores;
	}

	@ApiModelProperty(value = "Number Of PositiveC ores", notes = "Number Of Positive Cores", dataType = "Integer")
	public Integer getNumberOfPositiveCores() {
		return numberOfPositiveCores;
	}

	public void setNumberOfPositiveCores(Integer numberOfPositiveCores) {
		this.numberOfPositiveCores = numberOfPositiveCores;
	}

	@ApiModelProperty(value = "Number Of Bx Cores", notes = "Number Of Bx Cores", dataType = "Integer")
	public Integer getNumberOfBxCores() {
		return numberOfBxCores;
	}

	public void setNumberOfBxCores(Integer numberOfBxCores) {
		this.numberOfBxCores = numberOfBxCores;
	}

	@ApiModelProperty(value = "Psa Levels", notes = "PsaLevels", dataType = "Float")
	public Float getPsaLevels() {
		return psaLevels;
	}

	public void setPsaLevels(Float psaLevels) {
		this.psaLevels = psaLevels;
	}

	@ApiModelProperty(value = "New Psa Level", notes = "New Psa Level", dataType = "String")
	public String getNewPsaLevel() {
		return newPsaLevel;
	}

	public void setNewPsaLevel(String newPsaLevel) {
		this.newPsaLevel = newPsaLevel;
	}

	@ApiModelProperty(value = "Cancer Status", notes = "Cancer Status", dataType = "String")
	public String getCancerStatus() {
		return cancerStatus;
	}

	public void setCancerStatus(String cancerStatus) {
		this.cancerStatus = cancerStatus;
	}

	@ApiModelProperty(value = "ProgressionFreeSurvivalProbabilityAfterSalvageRtSixY", notes = "ProgressionFreeSurvivalProbabilityAfterSalvageRtSixY")
	public String getProgressionFreeSurvivalProbabilityAfterSalvageRtSixY() {
		return progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
	}

	public void setProgressionFreeSurvivalProbabilityAfterSalvageRtSixY(
			String progressionFreeSurvivalProbabilityAfterSalvageRtSixY) {
		this.progressionFreeSurvivalProbabilityAfterSalvageRtSixY = progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
	}

	@ApiModelProperty(value = "Crpc Median Survival In Years", notes = "Crpc Median Survival In Years", dataType = "Integer")
	public Integer getCrpcMedianSurvivalInYears() {
		return crpcMedianSurvivalInYears;
	}

	public void setCrpcMedianSurvivalInYears(Integer crpcMedianSurvivalInYears) {
		this.crpcMedianSurvivalInYears = crpcMedianSurvivalInYears;
	}

	@ApiModelProperty(value = "Probability Of Lymph Node Involvement", notes = "Probability Of Lymph Node Involvement", dataType = "Float")
	public Float getProbabilityOfLymphNodeInvolvement() {
		return probabilityOfLymphNodeInvolvement;
	}

	public void setProbabilityOfLymphNodeInvolvement(Float probabilityOfLymphNodeInvolvement) {
		this.probabilityOfLymphNodeInvolvement = probabilityOfLymphNodeInvolvement;
	}

	@ApiModelProperty(value = "Probabilityof Cadeathdt", notes = "Probabilityof Cadeathdt", dataType = "String")
	public String getProbabilityofCadeathdt() {
		return probabilityofCadeathdt;
	}

	public void setProbabilityofCadeathdt(String probabilityofCadeathdt) {
		this.probabilityofCadeathdt = probabilityofCadeathdt;
	}

	@ApiModelProperty(value = "Progression Fre eSurvival After Bt", notes = "Progression Fre eSurvival After Bt", dataType = "String")
	public String getProgressionFreeSurvivalAfterBt() {
		return progressionFreeSurvivalAfterBt;
	}

	public void setProgressionFreeSurvivalAfterBt(String progressionFreeSurvivalAfterBt) {
		this.progressionFreeSurvivalAfterBt = progressionFreeSurvivalAfterBt;
	}

	@ApiModelProperty(value = "Progression Free Survival After Rt", notes = "Progression Free Survival After Rt", dataType = "String")
	public String getProgressionFreeSurvivalAfterRt() {
		return progressionFreeSurvivalAfterRt;
	}

	public void setProgressionFreeSurvivalAfterRt(String progressionFreeSurvivalAfterRt) {
		this.progressionFreeSurvivalAfterRt = progressionFreeSurvivalAfterRt;
	}

	@ApiModelProperty(value = "Probabilityof Cadeathse", notes = "Probabilityof Cadeathse", dataType = "String")
	public String getProbabilityofCadeathse() {
		return probabilityofCadeathse;
	}

	public void setProbabilityofCadeathse(String probabilityofCadeathse) {
		this.probabilityofCadeathse = probabilityofCadeathse;
	}

	@ApiModelProperty(value = "Percant Cancer In Any Core", notes = "Percant Cancer In Any Core", dataType = "Float")
	public Float getPercantCancerInAnyCore() {
		return percantCancerInAnyCore;
	}

	public void setPercantCancerInAnyCore(Float percantCancerInAnyCore) {
		this.percantCancerInAnyCore = percantCancerInAnyCore;
	}

	@ApiModelProperty(value = "Progression Free Survival After Surgery", notes = "Progression Free Survival After Surgery", dataType = "String")
	public String getProgressionFreeSurvivalAfterSurgery() {
		return progressionFreeSurvivalAfterSurgery;
	}

	public void setProgressionFreeSurvivalAfterSurgery(String progressionFreeSurvivalAfterSurgery) {
		this.progressionFreeSurvivalAfterSurgery = progressionFreeSurvivalAfterSurgery;
	}

	@ApiModelProperty(value = "Tumor Volume", notes = "Tumor Volume", dataType = "String")
	public String getTumorVolume() {
		return tumorVolume;
	}

	public void setTumorVolume(String tumorVolume) {
		this.tumorVolume = tumorVolume;
	}

	@ApiModelProperty(value = "Pathological T", notes = "Pathological T", dataType = "String")
	public String getPathologicalT() {
		return pathologicalT;
	}

	public void setPathologicalT(String pathologicalT) {
		this.pathologicalT = pathologicalT;
	}

	@ApiModelProperty(value = "Cap", notes = "Cap", dataType = "String")
	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	@ApiModelProperty(value = "Percent", notes = "Percent", dataType = "String")
	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	@ApiModelProperty(value = "Num Of Cases", notes = "Num Of Cases", dataType = "String")
	public String getNumOfCases() {
		return numOfCases;
	}

	public void setNumOfCases(String numOfCases) {
		this.numOfCases = numOfCases;
	}

	@ApiModelProperty(value = "Edi", notes = "Edi", dataType = "String")
	public String getEdi() {
		return edi;
	}

	public void setEdi(String edi) {
		this.edi = edi;
	}

	@ApiModelProperty(value = "Stage", notes = "Stage", dataType = "String")
	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

}

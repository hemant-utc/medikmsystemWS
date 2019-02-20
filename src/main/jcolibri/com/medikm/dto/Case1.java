package com.medikm.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.medikm.jcolibri.cbrcore.Attribute;
import com.medikm.jcolibri.cbrcore.CaseComponent;

/**
 * Case1 entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Case1 implements java.io.Serializable, CaseComponent {

	// Fields

	private Integer caseId;
	private TnmStage tnmStageByFinalTnmStageId;
	private DiseaseSubType diseaseSubType;
	private CareFacility careFacility;
	private Functionalstatus functionalstatus;
	private TnmStage tnmStageByWorkingTnmStageId;
	private Physician physicianByReferingPhysiciaId;
	private Physician physicianByMedOncPhysicianId;
	private Physician physicianByPlasticSurgeonId;
	private Physician physicianBySurgOncPhysicianId;
	private Patient patient;
	private DiseaseType diseaseType;
	private Gemonics gemonics;
	private CancerType cancerType;
	private Genetics genetics;
	private Physician physicianByRadOncPhysicianId;
	private TumorLocation tumorLocation;
	private CancerSubType cancerSubType;
	private String refPhysician;
	private Integer pathologist;
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
	private Short caseHer2neuAmplified;
	private String her2Status;
	private String her2Sish;
	private Timestamp primaryDiagnosisDt;
	private Short deceasedDueBc;
	private Short treatmentRelatedDeath;
	private Short unrelatedDeath;
	private Timestamp dtDeath;
	private Timestamp dateFirstEncounter;
	private String menopauseStatus;
	private Boolean significanceRisk;
	private Boolean significanceComorbities;
	private Integer version;
	private Byte clinicalStagingMethod;
	private Integer whoClassification;
	private Integer pleuralInv;
	private Integer necrosisPercent;
	private String necrosisPresent;
	private Integer reasonNotTreated;
	private Integer diseaseTreated;
	private Integer seenOnCt;
	private Integer durationOfSymptomsMon;
	private Integer seenOnMri;
	private Integer seenOnPat;
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
	private Integer separateTnodeInSameLobe;
	private Integer invasionInMediastnum;
	private Integer invasionIntoHeart;
	private Integer invasionOfMainBronchus;
	private Integer invasionIntoGreatVessels;
	private Integer invasionIntoTrachea;
	private Integer invasionIntoRecLaryngealNerve;
	private Integer invasionIntoEsophagus;
	private Integer invasionIntoVertbralBody;
	private Integer invasionIntoCarina;
	private Integer tnodesInDiffLobe;
	private String nodalMetastases;
	private Integer esophagectomyDone;
	private Integer residualTumor;
	private Integer debulkingStatus;
	private Integer platinStatus;
	private Integer recurrence;
	private Timestamp dateRecurrence;
	private Timestamp secondaryDebulkingDate;
	private Timestamp intervalDebulkingDt;
	private String baseLineCa125;
	private Integer prgFreeSurvival;
	private Integer overallSurvival;
	private Byte esophagealCStagingMethod;
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
	private Short metastasis;
	private String metPrimarySite;
	private String otherBiomarkers;
	private Integer nln;
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
	private Short surgicallyResectable;
	private Short residualDisease;
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
	private String geneticRiskEvaluation;
	private Integer psaLevels;
	private Integer numberOfBxCores;
	private Integer numberOfPositiveCores;
	private Float percentOfPositiveCores;
	private String tumorVolume;
	private String cancerStatus;
	private String progressionFreeSurvivalAfterSurgery;
	private String progressionFreeSurvivalAfterRt;
	private String progressionFreeSurvivalAfterBt;
	private Integer alfhaFp;
	private Integer betaHcg;
	private Integer ldh;
	private Integer prostateVolume;
	private String biopsyGleasonScore;
	private String surgicalGleasonScore;
	private Integer numberPositiveBiopsyCores;
	private String positiveBiopsyCoresLocation;
	private String psaDoublingTime;
	private Float psaDensity;
	private Float psaCureRate;
	private String prostateEchotexture;
	private Float percantCancerInAnyCore;
	private Integer netLifeExpectancy;
	private String probabilityOfCaDeathSe;
	private String tnmStagingSystem;
	private String probabilityOfCaDeathDt;
	private Float oneY;
	private Float twoY;
	private Integer crpcMedianSurvivalInYears;
	private Float probabilityOfLymphNodeInvolvement;
	private String progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
	private Short extracapsularExtension;
	private Short fixation;
	private Short seminalVesicleInvasion;
	private Short tumorInCentralLocation;
	private Float indolentCancer;
	private Float organConfinedDisease;
	private Float capsularPenetration;
	private Float lymphNodeMets;
	private String neoadjResponse;
	private Short optimalcytred;
	private Short parametriumPos;
	private Float seminalVInvasionPercentage;
	private Float cap;
	private String pathologicalT;
	private Short bladderNeck;
	private Float leftBaseMedial;
	private Float leftBaseLateral;
	private Float rightBaseMedial;
	private Float rightBaseLateral;
	private Float leftMidMedial;
	private Float leftMidLateral;
	private Float rightMidMedial;
	private Float rightMidLateral;
	private Float leftApexMedial;
	private Float leftApexLateral;
	private Float rightApexMedial;
	private Float rightApexLateral;
	private String newPsaLevel;
	private Integer gynOncologist;
	private String tumorType;
	private Short tisBankPnr;
	private Short tisBankOdunsi;
	private Short nvInf;
	private Short nyso;
	private Short wt;
	private Short ido;
	private Short tisBank;
	private Short mucosalInvasion;
	private String mi;
	private String lesionDepth;
	private String dist;
	private Short TRupture;
	private Short metPrimary;
	private String gleasonScore;
	private String TLocation;
	private Set cancerStages = new HashSet(0);
	private Set diseaseSymptomses = new HashSet(0);
	private Set chemotherapies = new HashSet(0);
	private Set caseResourceses = new HashSet(0);
	private Set endocrineTherapies = new HashSet(0);
	private Set caseQualityIndicators = new HashSet(0);
	private Set tumorBoardDiscussions = new HashSet(0);
	private Set diagnosticWorkups = new HashSet(0);
	private Set pathologies = new HashSet(0);
	private Set episodes = new HashSet(0);
	private Set surgeries = new HashSet(0);
	private Set biopsies = new HashSet(0);
	private Set radiationTherapies = new HashSet(0);
	private Set casePhysicians = new HashSet(0);
	private Set forumAnswereResourceses = new HashSet(0);
	private Set encounterGuidelines = new HashSet(0);
	private Set tbDiscussionForums = new HashSet(0);
	private Set encounters = new HashSet(0);
	private Set followups = new HashSet(0);
	private Set riskReductions = new HashSet(0);
	private Set physicalExams = new HashSet(0);
	private Set targetedTherapies = new HashSet(0);
	private Set tumorBoardDiscussionQuestions = new HashSet(0);
	private Set prognosticFactors = new HashSet(0);
	private Set testResultResources = new HashSet(0);
	private Set encounterClinicalTrials = new HashSet(0);

	// Constructors

	/** default constructor */
	public Case1() {
	}

	/** minimal constructor */
	public Case1(Patient patient, DiseaseType diseaseType, Integer version) {
		this.patient = patient;
		this.diseaseType = diseaseType;
		this.version = version;
	}

	/** full constructor */
	public Case1(TnmStage tnmStageByFinalTnmStageId, DiseaseSubType diseaseSubType, CareFacility careFacility,
			Functionalstatus functionalstatus, TnmStage tnmStageByWorkingTnmStageId,
			Physician physicianByReferingPhysiciaId, Physician physicianByMedOncPhysicianId,
			Physician physicianByPlasticSurgeonId, Physician physicianBySurgOncPhysicianId, Patient patient,
			DiseaseType diseaseType, Gemonics gemonics, CancerType cancerType, Genetics genetics,
			Physician physicianByRadOncPhysicianId, TumorLocation tumorLocation, CancerSubType cancerSubType,
			String refPhysician, Integer pathologist, Integer age, Double tumorSize, Integer noNodes, Short distantMets,
			String distantMetsComm, String clinicalStage, Integer histologicalGrade, String erStatus, Integer erPercent,
			String prStatus, Integer prPercent, Short caseHer2neuAmplified, String her2Status, String her2Sish,
			Timestamp primaryDiagnosisDt, Short deceasedDueBc, Short treatmentRelatedDeath, Short unrelatedDeath,
			Timestamp dtDeath, Timestamp dateFirstEncounter, String menopauseStatus, Boolean significanceRisk,
			Boolean significanceComorbities, Integer version, Byte clinicalStagingMethod, Integer whoClassification,
			Integer pleuralInv, Integer necrosisPercent, String necrosisPresent, Integer reasonNotTreated,
			Integer diseaseTreated, Integer seenOnCt, Integer durationOfSymptomsMon, Integer seenOnMri,
			Integer seenOnPat, Integer seenOnThalliumScan, Integer seenOnXray, Integer seenOnBonescan,
			Integer tumorDepth, Integer invasionOfAdjStructure, Integer invasionOfPleura, Integer invasionOfChestWall,
			Integer invasionOfDiaphragm, Integer invasionOfPhrenicNerve, Integer invasionOfPericardium,
			Integer atelectasis, Integer obstractivePneumonitis, Integer separateTnodeInSameLobe,
			Integer invasionInMediastnum, Integer invasionIntoHeart, Integer invasionOfMainBronchus,
			Integer invasionIntoGreatVessels, Integer invasionIntoTrachea, Integer invasionIntoRecLaryngealNerve,
			Integer invasionIntoEsophagus, Integer invasionIntoVertbralBody, Integer invasionIntoCarina,
			Integer tnodesInDiffLobe, String nodalMetastases, Integer esophagectomyDone, Integer residualTumor,
			Integer debulkingStatus, Integer platinStatus, Integer recurrence, Timestamp dateRecurrence,
			Timestamp secondaryDebulkingDate, Timestamp intervalDebulkingDt, String baseLineCa125,
			Integer prgFreeSurvival, Integer overallSurvival, Byte esophagealCStagingMethod, String later,
			Short stPrimary, Short ndPrimary, Short diseasePropagation, Short metastatic, String chiefComplaint,
			Short lymfovascularInvasion, String margins, String closestMargins, String immuneHistochemistry,
			Integer noFossi, Short brca, Integer oncDxScore, Short metastasis, String metPrimarySite,
			String otherBiomarkers, Integer nln, Short tumorOnSurface, Short lsvi, Short parametrialInvasion,
			Short stromalInvasion, Integer depth, Integer horizontalSpread, Short washings, Short capsuleIntact,
			Short surgicalSpill, String metastaticSite, String lnMetastasisSite, Short malignantAscites,
			Short grossCervicalInvolvement, Short aorticNodePositive, Short tumorPenetratedSerosalSurface,
			Short malignantCellsInAscites, Short malignantCellsInPeritonealWashings, Short peritonealImplants,
			Short pelvicExtensions, Short extensionToOtherStructures, String specify, Short operable,
			Short fertilitySparing, Short hydronephrosis, Short clinicallyVisibleLesion, Short surgicalCandidate,
			Short surgicallyResectable, Short residualDisease, Short malignantEpithelialCarcinoma,
			Short pureEndometrioidCarcinoma, Short serousCellCarcinoma, Short stromalTumor, Short uterusDiseaseLimited,
			Short suspectedExtrauterineDisease, Short myometrialInvasion, Short adverseRiskFactors, String details,
			Short clearCellHistology, Integer numberOfMetastaticSites, String miscellaneous,
			String geneticRiskEvaluation, Integer psaLevels, Integer numberOfBxCores, Integer numberOfPositiveCores,
			Float percentOfPositiveCores, String tumorVolume, String cancerStatus,
			String progressionFreeSurvivalAfterSurgery, String progressionFreeSurvivalAfterRt,
			String progressionFreeSurvivalAfterBt, Integer alfhaFp, Integer betaHcg, Integer ldh,
			Integer prostateVolume, String biopsyGleasonScore, String surgicalGleasonScore,
			Integer numberPositiveBiopsyCores, String positiveBiopsyCoresLocation, String psaDoublingTime,
			Float psaDensity, Float psaCureRate, String prostateEchotexture, Float percantCancerInAnyCore,
			Integer netLifeExpectancy, String probabilityOfCaDeathSe, String tnmStagingSystem,
			String probabilityOfCaDeathDt, Float oneY, Float twoY, Integer crpcMedianSurvivalInYears,
			Float probabilityOfLymphNodeInvolvement, String progressionFreeSurvivalProbabilityAfterSalvageRtSixY,
			Short extracapsularExtension, Short fixation, Short seminalVesicleInvasion, Short tumorInCentralLocation,
			Float indolentCancer, Float organConfinedDisease, Float capsularPenetration, Float lymphNodeMets,
			String neoadjResponse, Short optimalcytred, Short parametriumPos, Float seminalVInvasionPercentage,
			Float cap, String pathologicalT, Short bladderNeck, Float leftBaseMedial, Float leftBaseLateral,
			Float rightBaseMedial, Float rightBaseLateral, Float leftMidMedial, Float leftMidLateral,
			Float rightMidMedial, Float rightMidLateral, Float leftApexMedial, Float leftApexLateral,
			Float rightApexMedial, Float rightApexLateral, String newPsaLevel, Integer gynOncologist, String tumorType,
			Short tisBankPnr, Short tisBankOdunsi, Short nvInf, Short nyso, Short wt, Short ido, Short tisBank,
			Short mucosalInvasion, String mi, String lesionDepth, String dist, Short TRupture, Short metPrimary,
			String gleasonScore, String TLocation, Set cancerStages, Set diseaseSymptomses, Set chemotherapies,
			Set caseResourceses, Set endocrineTherapies, Set caseQualityIndicators, Set tumorBoardDiscussions,
			Set diagnosticWorkups, Set pathologies, Set episodes, Set surgeries, Set biopsies, Set radiationTherapies,
			Set casePhysicians, Set forumAnswereResourceses, Set encounterGuidelines, Set tbDiscussionForums,
			Set encounters, Set followups, Set riskReductions, Set physicalExams, Set targetedTherapies,
			Set tumorBoardDiscussionQuestions, Set prognosticFactors, Set testResultResources,
			Set encounterClinicalTrials) {
		this.tnmStageByFinalTnmStageId = tnmStageByFinalTnmStageId;
		this.diseaseSubType = diseaseSubType;
		this.careFacility = careFacility;
		this.functionalstatus = functionalstatus;
		this.tnmStageByWorkingTnmStageId = tnmStageByWorkingTnmStageId;
		this.physicianByReferingPhysiciaId = physicianByReferingPhysiciaId;
		this.physicianByMedOncPhysicianId = physicianByMedOncPhysicianId;
		this.physicianByPlasticSurgeonId = physicianByPlasticSurgeonId;
		this.physicianBySurgOncPhysicianId = physicianBySurgOncPhysicianId;
		this.patient = patient;
		this.diseaseType = diseaseType;
		this.gemonics = gemonics;
		this.cancerType = cancerType;
		this.genetics = genetics;
		this.physicianByRadOncPhysicianId = physicianByRadOncPhysicianId;
		this.tumorLocation = tumorLocation;
		this.cancerSubType = cancerSubType;
		this.refPhysician = refPhysician;
		this.pathologist = pathologist;
		this.age = age;
		this.tumorSize = tumorSize;
		this.noNodes = noNodes;
		this.distantMets = distantMets;
		this.distantMetsComm = distantMetsComm;
		this.clinicalStage = clinicalStage;
		this.histologicalGrade = histologicalGrade;
		this.erStatus = erStatus;
		this.erPercent = erPercent;
		this.prStatus = prStatus;
		this.prPercent = prPercent;
		this.caseHer2neuAmplified = caseHer2neuAmplified;
		this.her2Status = her2Status;
		this.her2Sish = her2Sish;
		this.primaryDiagnosisDt = primaryDiagnosisDt;
		this.deceasedDueBc = deceasedDueBc;
		this.treatmentRelatedDeath = treatmentRelatedDeath;
		this.unrelatedDeath = unrelatedDeath;
		this.dtDeath = dtDeath;
		this.dateFirstEncounter = dateFirstEncounter;
		this.menopauseStatus = menopauseStatus;
		this.significanceRisk = significanceRisk;
		this.significanceComorbities = significanceComorbities;
		this.version = version;
		this.clinicalStagingMethod = clinicalStagingMethod;
		this.whoClassification = whoClassification;
		this.pleuralInv = pleuralInv;
		this.necrosisPercent = necrosisPercent;
		this.necrosisPresent = necrosisPresent;
		this.reasonNotTreated = reasonNotTreated;
		this.diseaseTreated = diseaseTreated;
		this.seenOnCt = seenOnCt;
		this.durationOfSymptomsMon = durationOfSymptomsMon;
		this.seenOnMri = seenOnMri;
		this.seenOnPat = seenOnPat;
		this.seenOnThalliumScan = seenOnThalliumScan;
		this.seenOnXray = seenOnXray;
		this.seenOnBonescan = seenOnBonescan;
		this.tumorDepth = tumorDepth;
		this.invasionOfAdjStructure = invasionOfAdjStructure;
		this.invasionOfPleura = invasionOfPleura;
		this.invasionOfChestWall = invasionOfChestWall;
		this.invasionOfDiaphragm = invasionOfDiaphragm;
		this.invasionOfPhrenicNerve = invasionOfPhrenicNerve;
		this.invasionOfPericardium = invasionOfPericardium;
		this.atelectasis = atelectasis;
		this.obstractivePneumonitis = obstractivePneumonitis;
		this.separateTnodeInSameLobe = separateTnodeInSameLobe;
		this.invasionInMediastnum = invasionInMediastnum;
		this.invasionIntoHeart = invasionIntoHeart;
		this.invasionOfMainBronchus = invasionOfMainBronchus;
		this.invasionIntoGreatVessels = invasionIntoGreatVessels;
		this.invasionIntoTrachea = invasionIntoTrachea;
		this.invasionIntoRecLaryngealNerve = invasionIntoRecLaryngealNerve;
		this.invasionIntoEsophagus = invasionIntoEsophagus;
		this.invasionIntoVertbralBody = invasionIntoVertbralBody;
		this.invasionIntoCarina = invasionIntoCarina;
		this.tnodesInDiffLobe = tnodesInDiffLobe;
		this.nodalMetastases = nodalMetastases;
		this.esophagectomyDone = esophagectomyDone;
		this.residualTumor = residualTumor;
		this.debulkingStatus = debulkingStatus;
		this.platinStatus = platinStatus;
		this.recurrence = recurrence;
		this.dateRecurrence = dateRecurrence;
		this.secondaryDebulkingDate = secondaryDebulkingDate;
		this.intervalDebulkingDt = intervalDebulkingDt;
		this.baseLineCa125 = baseLineCa125;
		this.prgFreeSurvival = prgFreeSurvival;
		this.overallSurvival = overallSurvival;
		this.esophagealCStagingMethod = esophagealCStagingMethod;
		this.later = later;
		this.stPrimary = stPrimary;
		this.ndPrimary = ndPrimary;
		this.diseasePropagation = diseasePropagation;
		this.metastatic = metastatic;
		this.chiefComplaint = chiefComplaint;
		this.lymfovascularInvasion = lymfovascularInvasion;
		this.margins = margins;
		this.closestMargins = closestMargins;
		this.immuneHistochemistry = immuneHistochemistry;
		this.noFossi = noFossi;
		this.brca = brca;
		this.oncDxScore = oncDxScore;
		this.metastasis = metastasis;
		this.metPrimarySite = metPrimarySite;
		this.otherBiomarkers = otherBiomarkers;
		this.nln = nln;
		this.tumorOnSurface = tumorOnSurface;
		this.lsvi = lsvi;
		this.parametrialInvasion = parametrialInvasion;
		this.stromalInvasion = stromalInvasion;
		this.depth = depth;
		this.horizontalSpread = horizontalSpread;
		this.washings = washings;
		this.capsuleIntact = capsuleIntact;
		this.surgicalSpill = surgicalSpill;
		this.metastaticSite = metastaticSite;
		this.lnMetastasisSite = lnMetastasisSite;
		this.malignantAscites = malignantAscites;
		this.grossCervicalInvolvement = grossCervicalInvolvement;
		this.aorticNodePositive = aorticNodePositive;
		this.tumorPenetratedSerosalSurface = tumorPenetratedSerosalSurface;
		this.malignantCellsInAscites = malignantCellsInAscites;
		this.malignantCellsInPeritonealWashings = malignantCellsInPeritonealWashings;
		this.peritonealImplants = peritonealImplants;
		this.pelvicExtensions = pelvicExtensions;
		this.extensionToOtherStructures = extensionToOtherStructures;
		this.specify = specify;
		this.operable = operable;
		this.fertilitySparing = fertilitySparing;
		this.hydronephrosis = hydronephrosis;
		this.clinicallyVisibleLesion = clinicallyVisibleLesion;
		this.surgicalCandidate = surgicalCandidate;
		this.surgicallyResectable = surgicallyResectable;
		this.residualDisease = residualDisease;
		this.malignantEpithelialCarcinoma = malignantEpithelialCarcinoma;
		this.pureEndometrioidCarcinoma = pureEndometrioidCarcinoma;
		this.serousCellCarcinoma = serousCellCarcinoma;
		this.stromalTumor = stromalTumor;
		this.uterusDiseaseLimited = uterusDiseaseLimited;
		this.suspectedExtrauterineDisease = suspectedExtrauterineDisease;
		this.myometrialInvasion = myometrialInvasion;
		this.adverseRiskFactors = adverseRiskFactors;
		this.details = details;
		this.clearCellHistology = clearCellHistology;
		this.numberOfMetastaticSites = numberOfMetastaticSites;
		this.miscellaneous = miscellaneous;
		this.geneticRiskEvaluation = geneticRiskEvaluation;
		this.psaLevels = psaLevels;
		this.numberOfBxCores = numberOfBxCores;
		this.numberOfPositiveCores = numberOfPositiveCores;
		this.percentOfPositiveCores = percentOfPositiveCores;
		this.tumorVolume = tumorVolume;
		this.cancerStatus = cancerStatus;
		this.progressionFreeSurvivalAfterSurgery = progressionFreeSurvivalAfterSurgery;
		this.progressionFreeSurvivalAfterRt = progressionFreeSurvivalAfterRt;
		this.progressionFreeSurvivalAfterBt = progressionFreeSurvivalAfterBt;
		this.alfhaFp = alfhaFp;
		this.betaHcg = betaHcg;
		this.ldh = ldh;
		this.prostateVolume = prostateVolume;
		this.biopsyGleasonScore = biopsyGleasonScore;
		this.surgicalGleasonScore = surgicalGleasonScore;
		this.numberPositiveBiopsyCores = numberPositiveBiopsyCores;
		this.positiveBiopsyCoresLocation = positiveBiopsyCoresLocation;
		this.psaDoublingTime = psaDoublingTime;
		this.psaDensity = psaDensity;
		this.psaCureRate = psaCureRate;
		this.prostateEchotexture = prostateEchotexture;
		this.percantCancerInAnyCore = percantCancerInAnyCore;
		this.netLifeExpectancy = netLifeExpectancy;
		this.probabilityOfCaDeathSe = probabilityOfCaDeathSe;
		this.tnmStagingSystem = tnmStagingSystem;
		this.probabilityOfCaDeathDt = probabilityOfCaDeathDt;
		this.oneY = oneY;
		this.twoY = twoY;
		this.crpcMedianSurvivalInYears = crpcMedianSurvivalInYears;
		this.probabilityOfLymphNodeInvolvement = probabilityOfLymphNodeInvolvement;
		this.progressionFreeSurvivalProbabilityAfterSalvageRtSixY = progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
		this.extracapsularExtension = extracapsularExtension;
		this.fixation = fixation;
		this.seminalVesicleInvasion = seminalVesicleInvasion;
		this.tumorInCentralLocation = tumorInCentralLocation;
		this.indolentCancer = indolentCancer;
		this.organConfinedDisease = organConfinedDisease;
		this.capsularPenetration = capsularPenetration;
		this.lymphNodeMets = lymphNodeMets;
		this.neoadjResponse = neoadjResponse;
		this.optimalcytred = optimalcytred;
		this.parametriumPos = parametriumPos;
		this.seminalVInvasionPercentage = seminalVInvasionPercentage;
		this.cap = cap;
		this.pathologicalT = pathologicalT;
		this.bladderNeck = bladderNeck;
		this.leftBaseMedial = leftBaseMedial;
		this.leftBaseLateral = leftBaseLateral;
		this.rightBaseMedial = rightBaseMedial;
		this.rightBaseLateral = rightBaseLateral;
		this.leftMidMedial = leftMidMedial;
		this.leftMidLateral = leftMidLateral;
		this.rightMidMedial = rightMidMedial;
		this.rightMidLateral = rightMidLateral;
		this.leftApexMedial = leftApexMedial;
		this.leftApexLateral = leftApexLateral;
		this.rightApexMedial = rightApexMedial;
		this.rightApexLateral = rightApexLateral;
		this.newPsaLevel = newPsaLevel;
		this.gynOncologist = gynOncologist;
		this.tumorType = tumorType;
		this.tisBankPnr = tisBankPnr;
		this.tisBankOdunsi = tisBankOdunsi;
		this.nvInf = nvInf;
		this.nyso = nyso;
		this.wt = wt;
		this.ido = ido;
		this.tisBank = tisBank;
		this.mucosalInvasion = mucosalInvasion;
		this.mi = mi;
		this.lesionDepth = lesionDepth;
		this.dist = dist;
		this.TRupture = TRupture;
		this.metPrimary = metPrimary;
		this.gleasonScore = gleasonScore;
		this.TLocation = TLocation;
		this.cancerStages = cancerStages;
		this.diseaseSymptomses = diseaseSymptomses;
		this.chemotherapies = chemotherapies;
		this.caseResourceses = caseResourceses;
		this.endocrineTherapies = endocrineTherapies;
		this.caseQualityIndicators = caseQualityIndicators;
		this.tumorBoardDiscussions = tumorBoardDiscussions;
		this.diagnosticWorkups = diagnosticWorkups;
		this.pathologies = pathologies;
		this.episodes = episodes;
		this.surgeries = surgeries;
		this.biopsies = biopsies;
		this.radiationTherapies = radiationTherapies;
		this.casePhysicians = casePhysicians;
		this.forumAnswereResourceses = forumAnswereResourceses;
		this.encounterGuidelines = encounterGuidelines;
		this.tbDiscussionForums = tbDiscussionForums;
		this.encounters = encounters;
		this.followups = followups;
		this.riskReductions = riskReductions;
		this.physicalExams = physicalExams;
		this.targetedTherapies = targetedTherapies;
		this.tumorBoardDiscussionQuestions = tumorBoardDiscussionQuestions;
		this.prognosticFactors = prognosticFactors;
		this.testResultResources = testResultResources;
		this.encounterClinicalTrials = encounterClinicalTrials;
	}

	// Property accessors

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public TnmStage getTnmStageByFinalTnmStageId() {
		return this.tnmStageByFinalTnmStageId;
	}

	public void setTnmStageByFinalTnmStageId(TnmStage tnmStageByFinalTnmStageId) {
		this.tnmStageByFinalTnmStageId = tnmStageByFinalTnmStageId;
	}

	public DiseaseSubType getDiseaseSubType() {
		return this.diseaseSubType;
	}

	public void setDiseaseSubType(DiseaseSubType diseaseSubType) {
		this.diseaseSubType = diseaseSubType;
	}

	public CareFacility getCareFacility() {
		return this.careFacility;
	}

	public void setCareFacility(CareFacility careFacility) {
		this.careFacility = careFacility;
	}

	public Functionalstatus getFunctionalstatus() {
		return this.functionalstatus;
	}

	public void setFunctionalstatus(Functionalstatus functionalstatus) {
		this.functionalstatus = functionalstatus;
	}

	public TnmStage getTnmStageByWorkingTnmStageId() {
		return this.tnmStageByWorkingTnmStageId;
	}

	public void setTnmStageByWorkingTnmStageId(TnmStage tnmStageByWorkingTnmStageId) {
		this.tnmStageByWorkingTnmStageId = tnmStageByWorkingTnmStageId;
	}

	public Physician getPhysicianByReferingPhysiciaId() {
		return this.physicianByReferingPhysiciaId;
	}

	public void setPhysicianByReferingPhysiciaId(Physician physicianByReferingPhysiciaId) {
		this.physicianByReferingPhysiciaId = physicianByReferingPhysiciaId;
	}

	public Physician getPhysicianByMedOncPhysicianId() {
		return this.physicianByMedOncPhysicianId;
	}

	public void setPhysicianByMedOncPhysicianId(Physician physicianByMedOncPhysicianId) {
		this.physicianByMedOncPhysicianId = physicianByMedOncPhysicianId;
	}

	public Physician getPhysicianByPlasticSurgeonId() {
		return this.physicianByPlasticSurgeonId;
	}

	public void setPhysicianByPlasticSurgeonId(Physician physicianByPlasticSurgeonId) {
		this.physicianByPlasticSurgeonId = physicianByPlasticSurgeonId;
	}

	public Physician getPhysicianBySurgOncPhysicianId() {
		return this.physicianBySurgOncPhysicianId;
	}

	public void setPhysicianBySurgOncPhysicianId(Physician physicianBySurgOncPhysicianId) {
		this.physicianBySurgOncPhysicianId = physicianBySurgOncPhysicianId;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public DiseaseType getDiseaseType() {
		return this.diseaseType;
	}

	public void setDiseaseType(DiseaseType diseaseType) {
		this.diseaseType = diseaseType;
	}

	public Gemonics getGemonics() {
		return this.gemonics;
	}

	public void setGemonics(Gemonics gemonics) {
		this.gemonics = gemonics;
	}

	public CancerType getCancerType() {
		return this.cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	public Genetics getGenetics() {
		return this.genetics;
	}

	public void setGenetics(Genetics genetics) {
		this.genetics = genetics;
	}

	public Physician getPhysicianByRadOncPhysicianId() {
		return this.physicianByRadOncPhysicianId;
	}

	public void setPhysicianByRadOncPhysicianId(Physician physicianByRadOncPhysicianId) {
		this.physicianByRadOncPhysicianId = physicianByRadOncPhysicianId;
	}

	public TumorLocation getTumorLocation() {
		return this.tumorLocation;
	}

	public void setTumorLocation(TumorLocation tumorLocation) {
		this.tumorLocation = tumorLocation;
	}

	public CancerSubType getCancerSubType() {
		return this.cancerSubType;
	}

	public void setCancerSubType(CancerSubType cancerSubType) {
		this.cancerSubType = cancerSubType;
	}

	public String getRefPhysician() {
		return this.refPhysician;
	}

	public void setRefPhysician(String refPhysician) {
		this.refPhysician = refPhysician;
	}

	public Integer getPathologist() {
		return this.pathologist;
	}

	public void setPathologist(Integer pathologist) {
		this.pathologist = pathologist;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getTumorSize() {
		return this.tumorSize;
	}

	public void setTumorSize(Double tumorSize) {
		this.tumorSize = tumorSize;
	}

	public Integer getNoNodes() {
		return this.noNodes;
	}

	public void setNoNodes(Integer noNodes) {
		this.noNodes = noNodes;
	}

	public Short getDistantMets() {
		return this.distantMets;
	}

	public void setDistantMets(Short distantMets) {
		this.distantMets = distantMets;
	}

	public String getDistantMetsComm() {
		return this.distantMetsComm;
	}

	public void setDistantMetsComm(String distantMetsComm) {
		this.distantMetsComm = distantMetsComm;
	}

	public String getClinicalStage() {
		return this.clinicalStage;
	}

	public void setClinicalStage(String clinicalStage) {
		this.clinicalStage = clinicalStage;
	}

	public Integer getHistologicalGrade() {
		return this.histologicalGrade;
	}

	public void setHistologicalGrade(Integer histologicalGrade) {
		this.histologicalGrade = histologicalGrade;
	}

	public String getErStatus() {
		return this.erStatus;
	}

	public void setErStatus(String erStatus) {
		this.erStatus = erStatus;
	}

	public Integer getErPercent() {
		return this.erPercent;
	}

	public void setErPercent(Integer erPercent) {
		this.erPercent = erPercent;
	}

	public String getPrStatus() {
		return this.prStatus;
	}

	public void setPrStatus(String prStatus) {
		this.prStatus = prStatus;
	}

	public Integer getPrPercent() {
		return this.prPercent;
	}

	public void setPrPercent(Integer prPercent) {
		this.prPercent = prPercent;
	}

	public Short getCaseHer2neuAmplified() {
		return this.caseHer2neuAmplified;
	}

	public void setCaseHer2neuAmplified(Short caseHer2neuAmplified) {
		this.caseHer2neuAmplified = caseHer2neuAmplified;
	}

	public String getHer2Status() {
		return this.her2Status;
	}

	public void setHer2Status(String her2Status) {
		this.her2Status = her2Status;
	}

	public String getHer2Sish() {
		return this.her2Sish;
	}

	public void setHer2Sish(String her2Sish) {
		this.her2Sish = her2Sish;
	}

	public Timestamp getPrimaryDiagnosisDt() {
		return this.primaryDiagnosisDt;
	}

	public void setPrimaryDiagnosisDt(Timestamp primaryDiagnosisDt) {
		this.primaryDiagnosisDt = primaryDiagnosisDt;
	}

	public Short getDeceasedDueBc() {
		return this.deceasedDueBc;
	}

	public void setDeceasedDueBc(Short deceasedDueBc) {
		this.deceasedDueBc = deceasedDueBc;
	}

	public Short getTreatmentRelatedDeath() {
		return this.treatmentRelatedDeath;
	}

	public void setTreatmentRelatedDeath(Short treatmentRelatedDeath) {
		this.treatmentRelatedDeath = treatmentRelatedDeath;
	}

	public Short getUnrelatedDeath() {
		return this.unrelatedDeath;
	}

	public void setUnrelatedDeath(Short unrelatedDeath) {
		this.unrelatedDeath = unrelatedDeath;
	}

	public Timestamp getDtDeath() {
		return this.dtDeath;
	}

	public void setDtDeath(Timestamp dtDeath) {
		this.dtDeath = dtDeath;
	}

	public Timestamp getDateFirstEncounter() {
		return this.dateFirstEncounter;
	}

	public void setDateFirstEncounter(Timestamp dateFirstEncounter) {
		this.dateFirstEncounter = dateFirstEncounter;
	}

	public String getMenopauseStatus() {
		return this.menopauseStatus;
	}

	public void setMenopauseStatus(String menopauseStatus) {
		this.menopauseStatus = menopauseStatus;
	}

	public Boolean getSignificanceRisk() {
		return this.significanceRisk;
	}

	public void setSignificanceRisk(Boolean significanceRisk) {
		this.significanceRisk = significanceRisk;
	}

	public Boolean getSignificanceComorbities() {
		return this.significanceComorbities;
	}

	public void setSignificanceComorbities(Boolean significanceComorbities) {
		this.significanceComorbities = significanceComorbities;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Byte getClinicalStagingMethod() {
		return this.clinicalStagingMethod;
	}

	public void setClinicalStagingMethod(Byte clinicalStagingMethod) {
		this.clinicalStagingMethod = clinicalStagingMethod;
	}

	public Integer getWhoClassification() {
		return this.whoClassification;
	}

	public void setWhoClassification(Integer whoClassification) {
		this.whoClassification = whoClassification;
	}

	public Integer getPleuralInv() {
		return this.pleuralInv;
	}

	public void setPleuralInv(Integer pleuralInv) {
		this.pleuralInv = pleuralInv;
	}

	public Integer getNecrosisPercent() {
		return this.necrosisPercent;
	}

	public void setNecrosisPercent(Integer necrosisPercent) {
		this.necrosisPercent = necrosisPercent;
	}

	public String getNecrosisPresent() {
		return this.necrosisPresent;
	}

	public void setNecrosisPresent(String necrosisPresent) {
		this.necrosisPresent = necrosisPresent;
	}

	public Integer getReasonNotTreated() {
		return this.reasonNotTreated;
	}

	public void setReasonNotTreated(Integer reasonNotTreated) {
		this.reasonNotTreated = reasonNotTreated;
	}

	public Integer getDiseaseTreated() {
		return this.diseaseTreated;
	}

	public void setDiseaseTreated(Integer diseaseTreated) {
		this.diseaseTreated = diseaseTreated;
	}

	public Integer getSeenOnCt() {
		return this.seenOnCt;
	}

	public void setSeenOnCt(Integer seenOnCt) {
		this.seenOnCt = seenOnCt;
	}

	public Integer getDurationOfSymptomsMon() {
		return this.durationOfSymptomsMon;
	}

	public void setDurationOfSymptomsMon(Integer durationOfSymptomsMon) {
		this.durationOfSymptomsMon = durationOfSymptomsMon;
	}

	public Integer getSeenOnMri() {
		return this.seenOnMri;
	}

	public void setSeenOnMri(Integer seenOnMri) {
		this.seenOnMri = seenOnMri;
	}

	public Integer getSeenOnPat() {
		return this.seenOnPat;
	}

	public void setSeenOnPat(Integer seenOnPat) {
		this.seenOnPat = seenOnPat;
	}

	public Integer getSeenOnThalliumScan() {
		return this.seenOnThalliumScan;
	}

	public void setSeenOnThalliumScan(Integer seenOnThalliumScan) {
		this.seenOnThalliumScan = seenOnThalliumScan;
	}

	public Integer getSeenOnXray() {
		return this.seenOnXray;
	}

	public void setSeenOnXray(Integer seenOnXray) {
		this.seenOnXray = seenOnXray;
	}

	public Integer getSeenOnBonescan() {
		return this.seenOnBonescan;
	}

	public void setSeenOnBonescan(Integer seenOnBonescan) {
		this.seenOnBonescan = seenOnBonescan;
	}

	public Integer getTumorDepth() {
		return this.tumorDepth;
	}

	public void setTumorDepth(Integer tumorDepth) {
		this.tumorDepth = tumorDepth;
	}

	public Integer getInvasionOfAdjStructure() {
		return this.invasionOfAdjStructure;
	}

	public void setInvasionOfAdjStructure(Integer invasionOfAdjStructure) {
		this.invasionOfAdjStructure = invasionOfAdjStructure;
	}

	public Integer getInvasionOfPleura() {
		return this.invasionOfPleura;
	}

	public void setInvasionOfPleura(Integer invasionOfPleura) {
		this.invasionOfPleura = invasionOfPleura;
	}

	public Integer getInvasionOfChestWall() {
		return this.invasionOfChestWall;
	}

	public void setInvasionOfChestWall(Integer invasionOfChestWall) {
		this.invasionOfChestWall = invasionOfChestWall;
	}

	public Integer getInvasionOfDiaphragm() {
		return this.invasionOfDiaphragm;
	}

	public void setInvasionOfDiaphragm(Integer invasionOfDiaphragm) {
		this.invasionOfDiaphragm = invasionOfDiaphragm;
	}

	public Integer getInvasionOfPhrenicNerve() {
		return this.invasionOfPhrenicNerve;
	}

	public void setInvasionOfPhrenicNerve(Integer invasionOfPhrenicNerve) {
		this.invasionOfPhrenicNerve = invasionOfPhrenicNerve;
	}

	public Integer getInvasionOfPericardium() {
		return this.invasionOfPericardium;
	}

	public void setInvasionOfPericardium(Integer invasionOfPericardium) {
		this.invasionOfPericardium = invasionOfPericardium;
	}

	public Integer getAtelectasis() {
		return this.atelectasis;
	}

	public void setAtelectasis(Integer atelectasis) {
		this.atelectasis = atelectasis;
	}

	public Integer getObstractivePneumonitis() {
		return this.obstractivePneumonitis;
	}

	public void setObstractivePneumonitis(Integer obstractivePneumonitis) {
		this.obstractivePneumonitis = obstractivePneumonitis;
	}

	public Integer getSeparateTnodeInSameLobe() {
		return this.separateTnodeInSameLobe;
	}

	public void setSeparateTnodeInSameLobe(Integer separateTnodeInSameLobe) {
		this.separateTnodeInSameLobe = separateTnodeInSameLobe;
	}

	public Integer getInvasionInMediastnum() {
		return this.invasionInMediastnum;
	}

	public void setInvasionInMediastnum(Integer invasionInMediastnum) {
		this.invasionInMediastnum = invasionInMediastnum;
	}

	public Integer getInvasionIntoHeart() {
		return this.invasionIntoHeart;
	}

	public void setInvasionIntoHeart(Integer invasionIntoHeart) {
		this.invasionIntoHeart = invasionIntoHeart;
	}

	public Integer getInvasionOfMainBronchus() {
		return this.invasionOfMainBronchus;
	}

	public void setInvasionOfMainBronchus(Integer invasionOfMainBronchus) {
		this.invasionOfMainBronchus = invasionOfMainBronchus;
	}

	public Integer getInvasionIntoGreatVessels() {
		return this.invasionIntoGreatVessels;
	}

	public void setInvasionIntoGreatVessels(Integer invasionIntoGreatVessels) {
		this.invasionIntoGreatVessels = invasionIntoGreatVessels;
	}

	public Integer getInvasionIntoTrachea() {
		return this.invasionIntoTrachea;
	}

	public void setInvasionIntoTrachea(Integer invasionIntoTrachea) {
		this.invasionIntoTrachea = invasionIntoTrachea;
	}

	public Integer getInvasionIntoRecLaryngealNerve() {
		return this.invasionIntoRecLaryngealNerve;
	}

	public void setInvasionIntoRecLaryngealNerve(Integer invasionIntoRecLaryngealNerve) {
		this.invasionIntoRecLaryngealNerve = invasionIntoRecLaryngealNerve;
	}

	public Integer getInvasionIntoEsophagus() {
		return this.invasionIntoEsophagus;
	}

	public void setInvasionIntoEsophagus(Integer invasionIntoEsophagus) {
		this.invasionIntoEsophagus = invasionIntoEsophagus;
	}

	public Integer getInvasionIntoVertbralBody() {
		return this.invasionIntoVertbralBody;
	}

	public void setInvasionIntoVertbralBody(Integer invasionIntoVertbralBody) {
		this.invasionIntoVertbralBody = invasionIntoVertbralBody;
	}

	public Integer getInvasionIntoCarina() {
		return this.invasionIntoCarina;
	}

	public void setInvasionIntoCarina(Integer invasionIntoCarina) {
		this.invasionIntoCarina = invasionIntoCarina;
	}

	public Integer getTnodesInDiffLobe() {
		return this.tnodesInDiffLobe;
	}

	public void setTnodesInDiffLobe(Integer tnodesInDiffLobe) {
		this.tnodesInDiffLobe = tnodesInDiffLobe;
	}

	public String getNodalMetastases() {
		return this.nodalMetastases;
	}

	public void setNodalMetastases(String nodalMetastases) {
		this.nodalMetastases = nodalMetastases;
	}

	public Integer getEsophagectomyDone() {
		return this.esophagectomyDone;
	}

	public void setEsophagectomyDone(Integer esophagectomyDone) {
		this.esophagectomyDone = esophagectomyDone;
	}

	public Integer getResidualTumor() {
		return this.residualTumor;
	}

	public void setResidualTumor(Integer residualTumor) {
		this.residualTumor = residualTumor;
	}

	public Integer getDebulkingStatus() {
		return this.debulkingStatus;
	}

	public void setDebulkingStatus(Integer debulkingStatus) {
		this.debulkingStatus = debulkingStatus;
	}

	public Integer getPlatinStatus() {
		return this.platinStatus;
	}

	public void setPlatinStatus(Integer platinStatus) {
		this.platinStatus = platinStatus;
	}

	public Integer getRecurrence() {
		return this.recurrence;
	}

	public void setRecurrence(Integer recurrence) {
		this.recurrence = recurrence;
	}

	public Timestamp getDateRecurrence() {
		return this.dateRecurrence;
	}

	public void setDateRecurrence(Timestamp dateRecurrence) {
		this.dateRecurrence = dateRecurrence;
	}

	public Timestamp getSecondaryDebulkingDate() {
		return this.secondaryDebulkingDate;
	}

	public void setSecondaryDebulkingDate(Timestamp secondaryDebulkingDate) {
		this.secondaryDebulkingDate = secondaryDebulkingDate;
	}

	public Timestamp getIntervalDebulkingDt() {
		return this.intervalDebulkingDt;
	}

	public void setIntervalDebulkingDt(Timestamp intervalDebulkingDt) {
		this.intervalDebulkingDt = intervalDebulkingDt;
	}

	public String getBaseLineCa125() {
		return this.baseLineCa125;
	}

	public void setBaseLineCa125(String baseLineCa125) {
		this.baseLineCa125 = baseLineCa125;
	}

	public Integer getPrgFreeSurvival() {
		return this.prgFreeSurvival;
	}

	public void setPrgFreeSurvival(Integer prgFreeSurvival) {
		this.prgFreeSurvival = prgFreeSurvival;
	}

	public Integer getOverallSurvival() {
		return this.overallSurvival;
	}

	public void setOverallSurvival(Integer overallSurvival) {
		this.overallSurvival = overallSurvival;
	}

	public Byte getEsophagealCStagingMethod() {
		return this.esophagealCStagingMethod;
	}

	public void setEsophagealCStagingMethod(Byte esophagealCStagingMethod) {
		this.esophagealCStagingMethod = esophagealCStagingMethod;
	}

	public String getLater() {
		return this.later;
	}

	public void setLater(String later) {
		this.later = later;
	}

	public Short getStPrimary() {
		return this.stPrimary;
	}

	public void setStPrimary(Short stPrimary) {
		this.stPrimary = stPrimary;
	}

	public Short getNdPrimary() {
		return this.ndPrimary;
	}

	public void setNdPrimary(Short ndPrimary) {
		this.ndPrimary = ndPrimary;
	}

	public Short getDiseasePropagation() {
		return this.diseasePropagation;
	}

	public void setDiseasePropagation(Short diseasePropagation) {
		this.diseasePropagation = diseasePropagation;
	}

	public Short getMetastatic() {
		return this.metastatic;
	}

	public void setMetastatic(Short metastatic) {
		this.metastatic = metastatic;
	}

	public String getChiefComplaint() {
		return this.chiefComplaint;
	}

	public void setChiefComplaint(String chiefComplaint) {
		this.chiefComplaint = chiefComplaint;
	}

	public Short getLymfovascularInvasion() {
		return this.lymfovascularInvasion;
	}

	public void setLymfovascularInvasion(Short lymfovascularInvasion) {
		this.lymfovascularInvasion = lymfovascularInvasion;
	}

	public String getMargins() {
		return this.margins;
	}

	public void setMargins(String margins) {
		this.margins = margins;
	}

	public String getClosestMargins() {
		return this.closestMargins;
	}

	public void setClosestMargins(String closestMargins) {
		this.closestMargins = closestMargins;
	}

	public String getImmuneHistochemistry() {
		return this.immuneHistochemistry;
	}

	public void setImmuneHistochemistry(String immuneHistochemistry) {
		this.immuneHistochemistry = immuneHistochemistry;
	}

	public Integer getNoFossi() {
		return this.noFossi;
	}

	public void setNoFossi(Integer noFossi) {
		this.noFossi = noFossi;
	}

	public Short getBrca() {
		return this.brca;
	}

	public void setBrca(Short brca) {
		this.brca = brca;
	}

	public Integer getOncDxScore() {
		return this.oncDxScore;
	}

	public void setOncDxScore(Integer oncDxScore) {
		this.oncDxScore = oncDxScore;
	}

	public Short getMetastasis() {
		return this.metastasis;
	}

	public void setMetastasis(Short metastasis) {
		this.metastasis = metastasis;
	}

	public String getMetPrimarySite() {
		return this.metPrimarySite;
	}

	public void setMetPrimarySite(String metPrimarySite) {
		this.metPrimarySite = metPrimarySite;
	}

	public String getOtherBiomarkers() {
		return this.otherBiomarkers;
	}

	public void setOtherBiomarkers(String otherBiomarkers) {
		this.otherBiomarkers = otherBiomarkers;
	}

	public Integer getNln() {
		return this.nln;
	}

	public void setNln(Integer nln) {
		this.nln = nln;
	}

	public Short getTumorOnSurface() {
		return this.tumorOnSurface;
	}

	public void setTumorOnSurface(Short tumorOnSurface) {
		this.tumorOnSurface = tumorOnSurface;
	}

	public Short getLsvi() {
		return this.lsvi;
	}

	public void setLsvi(Short lsvi) {
		this.lsvi = lsvi;
	}

	public Short getParametrialInvasion() {
		return this.parametrialInvasion;
	}

	public void setParametrialInvasion(Short parametrialInvasion) {
		this.parametrialInvasion = parametrialInvasion;
	}

	public Short getStromalInvasion() {
		return this.stromalInvasion;
	}

	public void setStromalInvasion(Short stromalInvasion) {
		this.stromalInvasion = stromalInvasion;
	}

	public Integer getDepth() {
		return this.depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Integer getHorizontalSpread() {
		return this.horizontalSpread;
	}

	public void setHorizontalSpread(Integer horizontalSpread) {
		this.horizontalSpread = horizontalSpread;
	}

	public Short getWashings() {
		return this.washings;
	}

	public void setWashings(Short washings) {
		this.washings = washings;
	}

	public Short getCapsuleIntact() {
		return this.capsuleIntact;
	}

	public void setCapsuleIntact(Short capsuleIntact) {
		this.capsuleIntact = capsuleIntact;
	}

	public Short getSurgicalSpill() {
		return this.surgicalSpill;
	}

	public void setSurgicalSpill(Short surgicalSpill) {
		this.surgicalSpill = surgicalSpill;
	}

	public String getMetastaticSite() {
		return this.metastaticSite;
	}

	public void setMetastaticSite(String metastaticSite) {
		this.metastaticSite = metastaticSite;
	}

	public String getLnMetastasisSite() {
		return this.lnMetastasisSite;
	}

	public void setLnMetastasisSite(String lnMetastasisSite) {
		this.lnMetastasisSite = lnMetastasisSite;
	}

	public Short getMalignantAscites() {
		return this.malignantAscites;
	}

	public void setMalignantAscites(Short malignantAscites) {
		this.malignantAscites = malignantAscites;
	}

	public Short getGrossCervicalInvolvement() {
		return this.grossCervicalInvolvement;
	}

	public void setGrossCervicalInvolvement(Short grossCervicalInvolvement) {
		this.grossCervicalInvolvement = grossCervicalInvolvement;
	}

	public Short getAorticNodePositive() {
		return this.aorticNodePositive;
	}

	public void setAorticNodePositive(Short aorticNodePositive) {
		this.aorticNodePositive = aorticNodePositive;
	}

	public Short getTumorPenetratedSerosalSurface() {
		return this.tumorPenetratedSerosalSurface;
	}

	public void setTumorPenetratedSerosalSurface(Short tumorPenetratedSerosalSurface) {
		this.tumorPenetratedSerosalSurface = tumorPenetratedSerosalSurface;
	}

	public Short getMalignantCellsInAscites() {
		return this.malignantCellsInAscites;
	}

	public void setMalignantCellsInAscites(Short malignantCellsInAscites) {
		this.malignantCellsInAscites = malignantCellsInAscites;
	}

	public Short getMalignantCellsInPeritonealWashings() {
		return this.malignantCellsInPeritonealWashings;
	}

	public void setMalignantCellsInPeritonealWashings(Short malignantCellsInPeritonealWashings) {
		this.malignantCellsInPeritonealWashings = malignantCellsInPeritonealWashings;
	}

	public Short getPeritonealImplants() {
		return this.peritonealImplants;
	}

	public void setPeritonealImplants(Short peritonealImplants) {
		this.peritonealImplants = peritonealImplants;
	}

	public Short getPelvicExtensions() {
		return this.pelvicExtensions;
	}

	public void setPelvicExtensions(Short pelvicExtensions) {
		this.pelvicExtensions = pelvicExtensions;
	}

	public Short getExtensionToOtherStructures() {
		return this.extensionToOtherStructures;
	}

	public void setExtensionToOtherStructures(Short extensionToOtherStructures) {
		this.extensionToOtherStructures = extensionToOtherStructures;
	}

	public String getSpecify() {
		return this.specify;
	}

	public void setSpecify(String specify) {
		this.specify = specify;
	}

	public Short getOperable() {
		return this.operable;
	}

	public void setOperable(Short operable) {
		this.operable = operable;
	}

	public Short getFertilitySparing() {
		return this.fertilitySparing;
	}

	public void setFertilitySparing(Short fertilitySparing) {
		this.fertilitySparing = fertilitySparing;
	}

	public Short getHydronephrosis() {
		return this.hydronephrosis;
	}

	public void setHydronephrosis(Short hydronephrosis) {
		this.hydronephrosis = hydronephrosis;
	}

	public Short getClinicallyVisibleLesion() {
		return this.clinicallyVisibleLesion;
	}

	public void setClinicallyVisibleLesion(Short clinicallyVisibleLesion) {
		this.clinicallyVisibleLesion = clinicallyVisibleLesion;
	}

	public Short getSurgicalCandidate() {
		return this.surgicalCandidate;
	}

	public void setSurgicalCandidate(Short surgicalCandidate) {
		this.surgicalCandidate = surgicalCandidate;
	}

	public Short getSurgicallyResectable() {
		return this.surgicallyResectable;
	}

	public void setSurgicallyResectable(Short surgicallyResectable) {
		this.surgicallyResectable = surgicallyResectable;
	}

	public Short getResidualDisease() {
		return this.residualDisease;
	}

	public void setResidualDisease(Short residualDisease) {
		this.residualDisease = residualDisease;
	}

	public Short getMalignantEpithelialCarcinoma() {
		return this.malignantEpithelialCarcinoma;
	}

	public void setMalignantEpithelialCarcinoma(Short malignantEpithelialCarcinoma) {
		this.malignantEpithelialCarcinoma = malignantEpithelialCarcinoma;
	}

	public Short getPureEndometrioidCarcinoma() {
		return this.pureEndometrioidCarcinoma;
	}

	public void setPureEndometrioidCarcinoma(Short pureEndometrioidCarcinoma) {
		this.pureEndometrioidCarcinoma = pureEndometrioidCarcinoma;
	}

	public Short getSerousCellCarcinoma() {
		return this.serousCellCarcinoma;
	}

	public void setSerousCellCarcinoma(Short serousCellCarcinoma) {
		this.serousCellCarcinoma = serousCellCarcinoma;
	}

	public Short getStromalTumor() {
		return this.stromalTumor;
	}

	public void setStromalTumor(Short stromalTumor) {
		this.stromalTumor = stromalTumor;
	}

	public Short getUterusDiseaseLimited() {
		return this.uterusDiseaseLimited;
	}

	public void setUterusDiseaseLimited(Short uterusDiseaseLimited) {
		this.uterusDiseaseLimited = uterusDiseaseLimited;
	}

	public Short getSuspectedExtrauterineDisease() {
		return this.suspectedExtrauterineDisease;
	}

	public void setSuspectedExtrauterineDisease(Short suspectedExtrauterineDisease) {
		this.suspectedExtrauterineDisease = suspectedExtrauterineDisease;
	}

	public Short getMyometrialInvasion() {
		return this.myometrialInvasion;
	}

	public void setMyometrialInvasion(Short myometrialInvasion) {
		this.myometrialInvasion = myometrialInvasion;
	}

	public Short getAdverseRiskFactors() {
		return this.adverseRiskFactors;
	}

	public void setAdverseRiskFactors(Short adverseRiskFactors) {
		this.adverseRiskFactors = adverseRiskFactors;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Short getClearCellHistology() {
		return this.clearCellHistology;
	}

	public void setClearCellHistology(Short clearCellHistology) {
		this.clearCellHistology = clearCellHistology;
	}

	public Integer getNumberOfMetastaticSites() {
		return this.numberOfMetastaticSites;
	}

	public void setNumberOfMetastaticSites(Integer numberOfMetastaticSites) {
		this.numberOfMetastaticSites = numberOfMetastaticSites;
	}

	public String getMiscellaneous() {
		return this.miscellaneous;
	}

	public void setMiscellaneous(String miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	public String getGeneticRiskEvaluation() {
		return this.geneticRiskEvaluation;
	}

	public void setGeneticRiskEvaluation(String geneticRiskEvaluation) {
		this.geneticRiskEvaluation = geneticRiskEvaluation;
	}

	public Integer getPsaLevels() {
		return this.psaLevels;
	}

	public void setPsaLevels(Integer psaLevels) {
		this.psaLevels = psaLevels;
	}

	public Integer getNumberOfBxCores() {
		return this.numberOfBxCores;
	}

	public void setNumberOfBxCores(Integer numberOfBxCores) {
		this.numberOfBxCores = numberOfBxCores;
	}

	public Integer getNumberOfPositiveCores() {
		return this.numberOfPositiveCores;
	}

	public void setNumberOfPositiveCores(Integer numberOfPositiveCores) {
		this.numberOfPositiveCores = numberOfPositiveCores;
	}

	public Float getPercentOfPositiveCores() {
		return this.percentOfPositiveCores;
	}

	public void setPercentOfPositiveCores(Float percentOfPositiveCores) {
		this.percentOfPositiveCores = percentOfPositiveCores;
	}

	public String getTumorVolume() {
		return this.tumorVolume;
	}

	public void setTumorVolume(String tumorVolume) {
		this.tumorVolume = tumorVolume;
	}

	public String getCancerStatus() {
		return this.cancerStatus;
	}

	public void setCancerStatus(String cancerStatus) {
		this.cancerStatus = cancerStatus;
	}

	public String getProgressionFreeSurvivalAfterSurgery() {
		return this.progressionFreeSurvivalAfterSurgery;
	}

	public void setProgressionFreeSurvivalAfterSurgery(String progressionFreeSurvivalAfterSurgery) {
		this.progressionFreeSurvivalAfterSurgery = progressionFreeSurvivalAfterSurgery;
	}

	public String getProgressionFreeSurvivalAfterRt() {
		return this.progressionFreeSurvivalAfterRt;
	}

	public void setProgressionFreeSurvivalAfterRt(String progressionFreeSurvivalAfterRt) {
		this.progressionFreeSurvivalAfterRt = progressionFreeSurvivalAfterRt;
	}

	public String getProgressionFreeSurvivalAfterBt() {
		return this.progressionFreeSurvivalAfterBt;
	}

	public void setProgressionFreeSurvivalAfterBt(String progressionFreeSurvivalAfterBt) {
		this.progressionFreeSurvivalAfterBt = progressionFreeSurvivalAfterBt;
	}

	public Integer getAlfhaFp() {
		return this.alfhaFp;
	}

	public void setAlfhaFp(Integer alfhaFp) {
		this.alfhaFp = alfhaFp;
	}

	public Integer getBetaHcg() {
		return this.betaHcg;
	}

	public void setBetaHcg(Integer betaHcg) {
		this.betaHcg = betaHcg;
	}

	public Integer getLdh() {
		return this.ldh;
	}

	public void setLdh(Integer ldh) {
		this.ldh = ldh;
	}

	public Integer getProstateVolume() {
		return this.prostateVolume;
	}

	public void setProstateVolume(Integer prostateVolume) {
		this.prostateVolume = prostateVolume;
	}

	public String getBiopsyGleasonScore() {
		return this.biopsyGleasonScore;
	}

	public void setBiopsyGleasonScore(String biopsyGleasonScore) {
		this.biopsyGleasonScore = biopsyGleasonScore;
	}

	public String getSurgicalGleasonScore() {
		return this.surgicalGleasonScore;
	}

	public void setSurgicalGleasonScore(String surgicalGleasonScore) {
		this.surgicalGleasonScore = surgicalGleasonScore;
	}

	public Integer getNumberPositiveBiopsyCores() {
		return this.numberPositiveBiopsyCores;
	}

	public void setNumberPositiveBiopsyCores(Integer numberPositiveBiopsyCores) {
		this.numberPositiveBiopsyCores = numberPositiveBiopsyCores;
	}

	public String getPositiveBiopsyCoresLocation() {
		return this.positiveBiopsyCoresLocation;
	}

	public void setPositiveBiopsyCoresLocation(String positiveBiopsyCoresLocation) {
		this.positiveBiopsyCoresLocation = positiveBiopsyCoresLocation;
	}

	public String getPsaDoublingTime() {
		return this.psaDoublingTime;
	}

	public void setPsaDoublingTime(String psaDoublingTime) {
		this.psaDoublingTime = psaDoublingTime;
	}

	public Float getPsaDensity() {
		return this.psaDensity;
	}

	public void setPsaDensity(Float psaDensity) {
		this.psaDensity = psaDensity;
	}

	public Float getPsaCureRate() {
		return this.psaCureRate;
	}

	public void setPsaCureRate(Float psaCureRate) {
		this.psaCureRate = psaCureRate;
	}

	public String getProstateEchotexture() {
		return this.prostateEchotexture;
	}

	public void setProstateEchotexture(String prostateEchotexture) {
		this.prostateEchotexture = prostateEchotexture;
	}

	public Float getPercantCancerInAnyCore() {
		return this.percantCancerInAnyCore;
	}

	public void setPercantCancerInAnyCore(Float percantCancerInAnyCore) {
		this.percantCancerInAnyCore = percantCancerInAnyCore;
	}

	public Integer getNetLifeExpectancy() {
		return this.netLifeExpectancy;
	}

	public void setNetLifeExpectancy(Integer netLifeExpectancy) {
		this.netLifeExpectancy = netLifeExpectancy;
	}

	public String getProbabilityOfCaDeathSe() {
		return this.probabilityOfCaDeathSe;
	}

	public void setProbabilityOfCaDeathSe(String probabilityOfCaDeathSe) {
		this.probabilityOfCaDeathSe = probabilityOfCaDeathSe;
	}

	public String getTnmStagingSystem() {
		return this.tnmStagingSystem;
	}

	public void setTnmStagingSystem(String tnmStagingSystem) {
		this.tnmStagingSystem = tnmStagingSystem;
	}

	public String getProbabilityOfCaDeathDt() {
		return this.probabilityOfCaDeathDt;
	}

	public void setProbabilityOfCaDeathDt(String probabilityOfCaDeathDt) {
		this.probabilityOfCaDeathDt = probabilityOfCaDeathDt;
	}

	public Float getOneY() {
		return this.oneY;
	}

	public void setOneY(Float oneY) {
		this.oneY = oneY;
	}

	public Float getTwoY() {
		return this.twoY;
	}

	public void setTwoY(Float twoY) {
		this.twoY = twoY;
	}

	public Integer getCrpcMedianSurvivalInYears() {
		return this.crpcMedianSurvivalInYears;
	}

	public void setCrpcMedianSurvivalInYears(Integer crpcMedianSurvivalInYears) {
		this.crpcMedianSurvivalInYears = crpcMedianSurvivalInYears;
	}

	public Float getProbabilityOfLymphNodeInvolvement() {
		return this.probabilityOfLymphNodeInvolvement;
	}

	public void setProbabilityOfLymphNodeInvolvement(Float probabilityOfLymphNodeInvolvement) {
		this.probabilityOfLymphNodeInvolvement = probabilityOfLymphNodeInvolvement;
	}

	public String getProgressionFreeSurvivalProbabilityAfterSalvageRtSixY() {
		return this.progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
	}

	public void setProgressionFreeSurvivalProbabilityAfterSalvageRtSixY(
			String progressionFreeSurvivalProbabilityAfterSalvageRtSixY) {
		this.progressionFreeSurvivalProbabilityAfterSalvageRtSixY = progressionFreeSurvivalProbabilityAfterSalvageRtSixY;
	}

	public Short getExtracapsularExtension() {
		return this.extracapsularExtension;
	}

	public void setExtracapsularExtension(Short extracapsularExtension) {
		this.extracapsularExtension = extracapsularExtension;
	}

	public Short getFixation() {
		return this.fixation;
	}

	public void setFixation(Short fixation) {
		this.fixation = fixation;
	}

	public Short getSeminalVesicleInvasion() {
		return this.seminalVesicleInvasion;
	}

	public void setSeminalVesicleInvasion(Short seminalVesicleInvasion) {
		this.seminalVesicleInvasion = seminalVesicleInvasion;
	}

	public Short getTumorInCentralLocation() {
		return this.tumorInCentralLocation;
	}

	public void setTumorInCentralLocation(Short tumorInCentralLocation) {
		this.tumorInCentralLocation = tumorInCentralLocation;
	}

	public Float getIndolentCancer() {
		return this.indolentCancer;
	}

	public void setIndolentCancer(Float indolentCancer) {
		this.indolentCancer = indolentCancer;
	}

	public Float getOrganConfinedDisease() {
		return this.organConfinedDisease;
	}

	public void setOrganConfinedDisease(Float organConfinedDisease) {
		this.organConfinedDisease = organConfinedDisease;
	}

	public Float getCapsularPenetration() {
		return this.capsularPenetration;
	}

	public void setCapsularPenetration(Float capsularPenetration) {
		this.capsularPenetration = capsularPenetration;
	}

	public Float getLymphNodeMets() {
		return this.lymphNodeMets;
	}

	public void setLymphNodeMets(Float lymphNodeMets) {
		this.lymphNodeMets = lymphNodeMets;
	}

	public String getNeoadjResponse() {
		return this.neoadjResponse;
	}

	public void setNeoadjResponse(String neoadjResponse) {
		this.neoadjResponse = neoadjResponse;
	}

	public Short getOptimalcytred() {
		return this.optimalcytred;
	}

	public void setOptimalcytred(Short optimalcytred) {
		this.optimalcytred = optimalcytred;
	}

	public Short getParametriumPos() {
		return this.parametriumPos;
	}

	public void setParametriumPos(Short parametriumPos) {
		this.parametriumPos = parametriumPos;
	}

	public Float getSeminalVInvasionPercentage() {
		return this.seminalVInvasionPercentage;
	}

	public void setSeminalVInvasionPercentage(Float seminalVInvasionPercentage) {
		this.seminalVInvasionPercentage = seminalVInvasionPercentage;
	}

	public Float getCap() {
		return this.cap;
	}

	public void setCap(Float cap) {
		this.cap = cap;
	}

	public String getPathologicalT() {
		return this.pathologicalT;
	}

	public void setPathologicalT(String pathologicalT) {
		this.pathologicalT = pathologicalT;
	}

	public Short getBladderNeck() {
		return this.bladderNeck;
	}

	public void setBladderNeck(Short bladderNeck) {
		this.bladderNeck = bladderNeck;
	}

	public Float getLeftBaseMedial() {
		return this.leftBaseMedial;
	}

	public void setLeftBaseMedial(Float leftBaseMedial) {
		this.leftBaseMedial = leftBaseMedial;
	}

	public Float getLeftBaseLateral() {
		return this.leftBaseLateral;
	}

	public void setLeftBaseLateral(Float leftBaseLateral) {
		this.leftBaseLateral = leftBaseLateral;
	}

	public Float getRightBaseMedial() {
		return this.rightBaseMedial;
	}

	public void setRightBaseMedial(Float rightBaseMedial) {
		this.rightBaseMedial = rightBaseMedial;
	}

	public Float getRightBaseLateral() {
		return this.rightBaseLateral;
	}

	public void setRightBaseLateral(Float rightBaseLateral) {
		this.rightBaseLateral = rightBaseLateral;
	}

	public Float getLeftMidMedial() {
		return this.leftMidMedial;
	}

	public void setLeftMidMedial(Float leftMidMedial) {
		this.leftMidMedial = leftMidMedial;
	}

	public Float getLeftMidLateral() {
		return this.leftMidLateral;
	}

	public void setLeftMidLateral(Float leftMidLateral) {
		this.leftMidLateral = leftMidLateral;
	}

	public Float getRightMidMedial() {
		return this.rightMidMedial;
	}

	public void setRightMidMedial(Float rightMidMedial) {
		this.rightMidMedial = rightMidMedial;
	}

	public Float getRightMidLateral() {
		return this.rightMidLateral;
	}

	public void setRightMidLateral(Float rightMidLateral) {
		this.rightMidLateral = rightMidLateral;
	}

	public Float getLeftApexMedial() {
		return this.leftApexMedial;
	}

	public void setLeftApexMedial(Float leftApexMedial) {
		this.leftApexMedial = leftApexMedial;
	}

	public Float getLeftApexLateral() {
		return this.leftApexLateral;
	}

	public void setLeftApexLateral(Float leftApexLateral) {
		this.leftApexLateral = leftApexLateral;
	}

	public Float getRightApexMedial() {
		return this.rightApexMedial;
	}

	public void setRightApexMedial(Float rightApexMedial) {
		this.rightApexMedial = rightApexMedial;
	}

	public Float getRightApexLateral() {
		return this.rightApexLateral;
	}

	public void setRightApexLateral(Float rightApexLateral) {
		this.rightApexLateral = rightApexLateral;
	}

	public String getNewPsaLevel() {
		return this.newPsaLevel;
	}

	public void setNewPsaLevel(String newPsaLevel) {
		this.newPsaLevel = newPsaLevel;
	}

	public Integer getGynOncologist() {
		return this.gynOncologist;
	}

	public void setGynOncologist(Integer gynOncologist) {
		this.gynOncologist = gynOncologist;
	}

	public String getTumorType() {
		return this.tumorType;
	}

	public void setTumorType(String tumorType) {
		this.tumorType = tumorType;
	}

	public Short getTisBankPnr() {
		return this.tisBankPnr;
	}

	public void setTisBankPnr(Short tisBankPnr) {
		this.tisBankPnr = tisBankPnr;
	}

	public Short getTisBankOdunsi() {
		return this.tisBankOdunsi;
	}

	public void setTisBankOdunsi(Short tisBankOdunsi) {
		this.tisBankOdunsi = tisBankOdunsi;
	}

	public Short getNvInf() {
		return this.nvInf;
	}

	public void setNvInf(Short nvInf) {
		this.nvInf = nvInf;
	}

	public Short getNyso() {
		return this.nyso;
	}

	public void setNyso(Short nyso) {
		this.nyso = nyso;
	}

	public Short getWt() {
		return this.wt;
	}

	public void setWt(Short wt) {
		this.wt = wt;
	}

	public Short getIdo() {
		return this.ido;
	}

	public void setIdo(Short ido) {
		this.ido = ido;
	}

	public Short getTisBank() {
		return this.tisBank;
	}

	public void setTisBank(Short tisBank) {
		this.tisBank = tisBank;
	}

	public Short getMucosalInvasion() {
		return this.mucosalInvasion;
	}

	public void setMucosalInvasion(Short mucosalInvasion) {
		this.mucosalInvasion = mucosalInvasion;
	}

	public String getMi() {
		return this.mi;
	}

	public void setMi(String mi) {
		this.mi = mi;
	}

	public String getLesionDepth() {
		return this.lesionDepth;
	}

	public void setLesionDepth(String lesionDepth) {
		this.lesionDepth = lesionDepth;
	}

	public String getDist() {
		return this.dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public Short getTRupture() {
		return this.TRupture;
	}

	public void setTRupture(Short TRupture) {
		this.TRupture = TRupture;
	}

	public Short getMetPrimary() {
		return this.metPrimary;
	}

	public void setMetPrimary(Short metPrimary) {
		this.metPrimary = metPrimary;
	}

	public String getGleasonScore() {
		return this.gleasonScore;
	}

	public void setGleasonScore(String gleasonScore) {
		this.gleasonScore = gleasonScore;
	}

	public String getTLocation() {
		return this.TLocation;
	}

	public void setTLocation(String TLocation) {
		this.TLocation = TLocation;
	}

	public Set getCancerStages() {
		return this.cancerStages;
	}

	public void setCancerStages(Set cancerStages) {
		this.cancerStages = cancerStages;
	}

	public Set getDiseaseSymptomses() {
		return this.diseaseSymptomses;
	}

	public void setDiseaseSymptomses(Set diseaseSymptomses) {
		this.diseaseSymptomses = diseaseSymptomses;
	}

	public Set getChemotherapies() {
		return this.chemotherapies;
	}

	public void setChemotherapies(Set chemotherapies) {
		this.chemotherapies = chemotherapies;
	}

	public Set getCaseResourceses() {
		return this.caseResourceses;
	}

	public void setCaseResourceses(Set caseResourceses) {
		this.caseResourceses = caseResourceses;
	}

	public Set getEndocrineTherapies() {
		return this.endocrineTherapies;
	}

	public void setEndocrineTherapies(Set endocrineTherapies) {
		this.endocrineTherapies = endocrineTherapies;
	}

	public Set getCaseQualityIndicators() {
		return this.caseQualityIndicators;
	}

	public void setCaseQualityIndicators(Set caseQualityIndicators) {
		this.caseQualityIndicators = caseQualityIndicators;
	}

	public Set getTumorBoardDiscussions() {
		return this.tumorBoardDiscussions;
	}

	public void setTumorBoardDiscussions(Set tumorBoardDiscussions) {
		this.tumorBoardDiscussions = tumorBoardDiscussions;
	}

	public Set getDiagnosticWorkups() {
		return this.diagnosticWorkups;
	}

	public void setDiagnosticWorkups(Set diagnosticWorkups) {
		this.diagnosticWorkups = diagnosticWorkups;
	}

	public Set getPathologies() {
		return this.pathologies;
	}

	public void setPathologies(Set pathologies) {
		this.pathologies = pathologies;
	}

	public Set getEpisodes() {
		return this.episodes;
	}

	public void setEpisodes(Set episodes) {
		this.episodes = episodes;
	}

	public Set getSurgeries() {
		return this.surgeries;
	}

	public void setSurgeries(Set surgeries) {
		this.surgeries = surgeries;
	}

	public Set getBiopsies() {
		return this.biopsies;
	}

	public void setBiopsies(Set biopsies) {
		this.biopsies = biopsies;
	}

	public Set getRadiationTherapies() {
		return this.radiationTherapies;
	}

	public void setRadiationTherapies(Set radiationTherapies) {
		this.radiationTherapies = radiationTherapies;
	}

	public Set getCasePhysicians() {
		return this.casePhysicians;
	}

	public void setCasePhysicians(Set casePhysicians) {
		this.casePhysicians = casePhysicians;
	}

	public Set getForumAnswereResourceses() {
		return this.forumAnswereResourceses;
	}

	public void setForumAnswereResourceses(Set forumAnswereResourceses) {
		this.forumAnswereResourceses = forumAnswereResourceses;
	}

	public Set getEncounterGuidelines() {
		return this.encounterGuidelines;
	}

	public void setEncounterGuidelines(Set encounterGuidelines) {
		this.encounterGuidelines = encounterGuidelines;
	}

	public Set getTbDiscussionForums() {
		return this.tbDiscussionForums;
	}

	public void setTbDiscussionForums(Set tbDiscussionForums) {
		this.tbDiscussionForums = tbDiscussionForums;
	}

	public Set getEncounters() {
		return this.encounters;
	}

	public void setEncounters(Set encounters) {
		this.encounters = encounters;
	}

	public Set getFollowups() {
		return this.followups;
	}

	public void setFollowups(Set followups) {
		this.followups = followups;
	}

	public Set getRiskReductions() {
		return this.riskReductions;
	}

	public void setRiskReductions(Set riskReductions) {
		this.riskReductions = riskReductions;
	}

	public Set getPhysicalExams() {
		return this.physicalExams;
	}

	public void setPhysicalExams(Set physicalExams) {
		this.physicalExams = physicalExams;
	}

	public Set getTargetedTherapies() {
		return this.targetedTherapies;
	}

	public void setTargetedTherapies(Set targetedTherapies) {
		this.targetedTherapies = targetedTherapies;
	}

	public Set getTumorBoardDiscussionQuestions() {
		return this.tumorBoardDiscussionQuestions;
	}

	public void setTumorBoardDiscussionQuestions(Set tumorBoardDiscussionQuestions) {
		this.tumorBoardDiscussionQuestions = tumorBoardDiscussionQuestions;
	}

	public Set getPrognosticFactors() {
		return this.prognosticFactors;
	}

	public void setPrognosticFactors(Set prognosticFactors) {
		this.prognosticFactors = prognosticFactors;
	}

	public Set getTestResultResources() {
		return this.testResultResources;
	}

	public void setTestResultResources(Set testResultResources) {
		this.testResultResources = testResultResources;
	}

	public Set getEncounterClinicalTrials() {
		return this.encounterClinicalTrials;
	}

	public void setEncounterClinicalTrials(Set encounterClinicalTrials) {
		this.encounterClinicalTrials = encounterClinicalTrials;
	}

	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}

}
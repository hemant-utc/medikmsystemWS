package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Case1;

/**
 * A data access object (DAO) providing persistence and search support for Case1
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.medikm.dto.Case1
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class Case1DAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(Case1DAO.class);
	// property constants
	public static final String REF_PHYSICIAN = "refPhysician";
	public static final String PATHOLOGIST = "pathologist";
	public static final String AGE = "age";
	public static final String TUMOR_SIZE = "tumorSize";
	public static final String NO_NODES = "noNodes";
	public static final String DISTANT_METS = "distantMets";
	public static final String DISTANT_METS_COMM = "distantMetsComm";
	public static final String CLINICAL_STAGE = "clinicalStage";
	public static final String HISTOLOGICAL_GRADE = "histologicalGrade";
	public static final String ER_STATUS = "erStatus";
	public static final String ER_PERCENT = "erPercent";
	public static final String PR_STATUS = "prStatus";
	public static final String PR_PERCENT = "prPercent";
	public static final String CASE_HER2NEU_AMPLIFIED = "caseHer2neuAmplified";
	public static final String HER2_STATUS = "her2Status";
	public static final String HER2_SISH = "her2Sish";
	public static final String DECEASED_DUE_BC = "deceasedDueBc";
	public static final String TREATMENT_RELATED_DEATH = "treatmentRelatedDeath";
	public static final String UNRELATED_DEATH = "unrelatedDeath";
	public static final String MENOPAUSE_STATUS = "menopauseStatus";
	public static final String SIGNIFICANCE_RISK = "significanceRisk";
	public static final String SIGNIFICANCE_COMORBITIES = "significanceComorbities";
	public static final String VERSION = "version";
	public static final String CLINICAL_STAGING_METHOD = "clinicalStagingMethod";
	public static final String WHO_CLASSIFICATION = "whoClassification";
	public static final String PLEURAL_INV = "pleuralInv";
	public static final String NECROSIS_PERCENT = "necrosisPercent";
	public static final String NECROSIS_PRESENT = "necrosisPresent";
	public static final String REASON_NOT_TREATED = "reasonNotTreated";
	public static final String DISEASE_TREATED = "diseaseTreated";
	public static final String SEEN_ON_CT = "seenOnCt";
	public static final String DURATION_OF_SYMPTOMS_MON = "durationOfSymptomsMon";
	public static final String SEEN_ON_MRI = "seenOnMri";
	public static final String SEEN_ON_PAT = "seenOnPat";
	public static final String SEEN_ON_THALLIUM_SCAN = "seenOnThalliumScan";
	public static final String SEEN_ON_XRAY = "seenOnXray";
	public static final String SEEN_ON_BONESCAN = "seenOnBonescan";
	public static final String TUMOR_DEPTH = "tumorDepth";
	public static final String INVASION_OF_ADJ_STRUCTURE = "invasionOfAdjStructure";
	public static final String INVASION_OF_PLEURA = "invasionOfPleura";
	public static final String INVASION_OF_CHEST_WALL = "invasionOfChestWall";
	public static final String INVASION_OF_DIAPHRAGM = "invasionOfDiaphragm";
	public static final String INVASION_OF_PHRENIC_NERVE = "invasionOfPhrenicNerve";
	public static final String INVASION_OF_PERICARDIUM = "invasionOfPericardium";
	public static final String ATELECTASIS = "atelectasis";
	public static final String OBSTRACTIVE_PNEUMONITIS = "obstractivePneumonitis";
	public static final String SEPARATE_TNODE_IN_SAME_LOBE = "separateTnodeInSameLobe";
	public static final String INVASION_IN_MEDIASTNUM = "invasionInMediastnum";
	public static final String INVASION_INTO_HEART = "invasionIntoHeart";
	public static final String INVASION_OF_MAIN_BRONCHUS = "invasionOfMainBronchus";
	public static final String INVASION_INTO_GREAT_VESSELS = "invasionIntoGreatVessels";
	public static final String INVASION_INTO_TRACHEA = "invasionIntoTrachea";
	public static final String INVASION_INTO_REC_LARYNGEAL_NERVE = "invasionIntoRecLaryngealNerve";
	public static final String INVASION_INTO_ESOPHAGUS = "invasionIntoEsophagus";
	public static final String INVASION_INTO_VERTBRAL_BODY = "invasionIntoVertbralBody";
	public static final String INVASION_INTO_CARINA = "invasionIntoCarina";
	public static final String TNODES_IN_DIFF_LOBE = "tnodesInDiffLobe";
	public static final String NODAL_METASTASES = "nodalMetastases";
	public static final String ESOPHAGECTOMY_DONE = "esophagectomyDone";
	public static final String RESIDUAL_TUMOR = "residualTumor";
	public static final String DEBULKING_STATUS = "debulkingStatus";
	public static final String PLATIN_STATUS = "platinStatus";
	public static final String RECURRENCE = "recurrence";
	public static final String BASE_LINE_CA125 = "baseLineCa125";
	public static final String PRG_FREE_SURVIVAL = "prgFreeSurvival";
	public static final String OVERALL_SURVIVAL = "overallSurvival";
	public static final String ESOPHAGEAL_CSTAGING_METHOD = "esophagealCStagingMethod";
	public static final String LATER = "later";
	public static final String ST_PRIMARY = "stPrimary";
	public static final String ND_PRIMARY = "ndPrimary";
	public static final String DISEASE_PROPAGATION = "diseasePropagation";
	public static final String METASTATIC = "metastatic";
	public static final String CHIEF_COMPLAINT = "chiefComplaint";
	public static final String LYMFOVASCULAR_INVASION = "lymfovascularInvasion";
	public static final String MARGINS = "margins";
	public static final String CLOSEST_MARGINS = "closestMargins";
	public static final String IMMUNE_HISTOCHEMISTRY = "immuneHistochemistry";
	public static final String NO_FOSSI = "noFossi";
	public static final String BRCA = "brca";
	public static final String ONC_DX_SCORE = "oncDxScore";
	public static final String METASTASIS = "metastasis";
	public static final String MET_PRIMARY_SITE = "metPrimarySite";
	public static final String OTHER_BIOMARKERS = "otherBiomarkers";
	public static final String NLN = "nln";
	public static final String TUMOR_ON_SURFACE = "tumorOnSurface";
	public static final String LSVI = "lsvi";
	public static final String PARAMETRIAL_INVASION = "parametrialInvasion";
	public static final String STROMAL_INVASION = "stromalInvasion";
	public static final String DEPTH = "depth";
	public static final String HORIZONTAL_SPREAD = "horizontalSpread";
	public static final String WASHINGS = "washings";
	public static final String CAPSULE_INTACT = "capsuleIntact";
	public static final String SURGICAL_SPILL = "surgicalSpill";
	public static final String METASTATIC_SITE = "metastaticSite";
	public static final String LN_METASTASIS_SITE = "lnMetastasisSite";
	public static final String MALIGNANT_ASCITES = "malignantAscites";
	public static final String GROSS_CERVICAL_INVOLVEMENT = "grossCervicalInvolvement";
	public static final String AORTIC_NODE_POSITIVE = "aorticNodePositive";
	public static final String TUMOR_PENETRATED_SEROSAL_SURFACE = "tumorPenetratedSerosalSurface";
	public static final String MALIGNANT_CELLS_IN_ASCITES = "malignantCellsInAscites";
	public static final String MALIGNANT_CELLS_IN_PERITONEAL_WASHINGS = "malignantCellsInPeritonealWashings";
	public static final String PERITONEAL_IMPLANTS = "peritonealImplants";
	public static final String PELVIC_EXTENSIONS = "pelvicExtensions";
	public static final String EXTENSION_TO_OTHER_STRUCTURES = "extensionToOtherStructures";
	public static final String SPECIFY = "specify";
	public static final String OPERABLE = "operable";
	public static final String FERTILITY_SPARING = "fertilitySparing";
	public static final String HYDRONEPHROSIS = "hydronephrosis";
	public static final String CLINICALLY_VISIBLE_LESION = "clinicallyVisibleLesion";
	public static final String SURGICAL_CANDIDATE = "surgicalCandidate";
	public static final String SURGICALLY_RESECTABLE = "surgicallyResectable";
	public static final String RESIDUAL_DISEASE = "residualDisease";
	public static final String MALIGNANT_EPITHELIAL_CARCINOMA = "malignantEpithelialCarcinoma";
	public static final String PURE_ENDOMETRIOID_CARCINOMA = "pureEndometrioidCarcinoma";
	public static final String SEROUS_CELL_CARCINOMA = "serousCellCarcinoma";
	public static final String STROMAL_TUMOR = "stromalTumor";
	public static final String UTERUS_DISEASE_LIMITED = "uterusDiseaseLimited";
	public static final String SUSPECTED_EXTRAUTERINE_DISEASE = "suspectedExtrauterineDisease";
	public static final String MYOMETRIAL_INVASION = "myometrialInvasion";
	public static final String ADVERSE_RISK_FACTORS = "adverseRiskFactors";
	public static final String DETAILS = "details";
	public static final String CLEAR_CELL_HISTOLOGY = "clearCellHistology";
	public static final String NUMBER_OF_METASTATIC_SITES = "numberOfMetastaticSites";
	public static final String MISCELLANEOUS = "miscellaneous";
	public static final String GENETIC_RISK_EVALUATION = "geneticRiskEvaluation";
	public static final String PSA_LEVELS = "psaLevels";
	public static final String NUMBER_OF_BX_CORES = "numberOfBxCores";
	public static final String NUMBER_OF_POSITIVE_CORES = "numberOfPositiveCores";
	public static final String PERCENT_OF_POSITIVE_CORES = "percentOfPositiveCores";
	public static final String TUMOR_VOLUME = "tumorVolume";
	public static final String CANCER_STATUS = "cancerStatus";
	public static final String PROGRESSION_FREE_SURVIVAL_AFTER_SURGERY = "progressionFreeSurvivalAfterSurgery";
	public static final String PROGRESSION_FREE_SURVIVAL_AFTER_RT = "progressionFreeSurvivalAfterRt";
	public static final String PROGRESSION_FREE_SURVIVAL_AFTER_BT = "progressionFreeSurvivalAfterBt";
	public static final String ALFHA_FP = "alfhaFp";
	public static final String BETA_HCG = "betaHcg";
	public static final String LDH = "ldh";
	public static final String PROSTATE_VOLUME = "prostateVolume";
	public static final String BIOPSY_GLEASON_SCORE = "biopsyGleasonScore";
	public static final String SURGICAL_GLEASON_SCORE = "surgicalGleasonScore";
	public static final String NUMBER_POSITIVE_BIOPSY_CORES = "numberPositiveBiopsyCores";
	public static final String POSITIVE_BIOPSY_CORES_LOCATION = "positiveBiopsyCoresLocation";
	public static final String PSA_DOUBLING_TIME = "psaDoublingTime";
	public static final String PSA_DENSITY = "psaDensity";
	public static final String PSA_CURE_RATE = "psaCureRate";
	public static final String PROSTATE_ECHOTEXTURE = "prostateEchotexture";
	public static final String PERCANT_CANCER_IN_ANY_CORE = "percantCancerInAnyCore";
	public static final String NET_LIFE_EXPECTANCY = "netLifeExpectancy";
	public static final String PROBABILITY_OF_CA_DEATH_SE = "probabilityOfCaDeathSe";
	public static final String TNM_STAGING_SYSTEM = "tnmStagingSystem";
	public static final String PROBABILITY_OF_CA_DEATH_DT = "probabilityOfCaDeathDt";
	public static final String ONE_Y = "oneY";
	public static final String TWO_Y = "twoY";
	public static final String CRPC_MEDIAN_SURVIVAL_IN_YEARS = "crpcMedianSurvivalInYears";
	public static final String PROBABILITY_OF_LYMPH_NODE_INVOLVEMENT = "probabilityOfLymphNodeInvolvement";
	public static final String PROGRESSION_FREE_SURVIVAL_PROBABILITY_AFTER_SALVAGE_RT_SIX_Y = "progressionFreeSurvivalProbabilityAfterSalvageRtSixY";
	public static final String EXTRACAPSULAR_EXTENSION = "extracapsularExtension";
	public static final String FIXATION = "fixation";
	public static final String SEMINAL_VESICLE_INVASION = "seminalVesicleInvasion";
	public static final String TUMOR_IN_CENTRAL_LOCATION = "tumorInCentralLocation";
	public static final String INDOLENT_CANCER = "indolentCancer";
	public static final String ORGAN_CONFINED_DISEASE = "organConfinedDisease";
	public static final String CAPSULAR_PENETRATION = "capsularPenetration";
	public static final String LYMPH_NODE_METS = "lymphNodeMets";
	public static final String NEOADJ_RESPONSE = "neoadjResponse";
	public static final String OPTIMALCYTRED = "optimalcytred";
	public static final String PARAMETRIUM_POS = "parametriumPos";
	public static final String SEMINAL_VINVASION_PERCENTAGE = "seminalVInvasionPercentage";
	public static final String CAP = "cap";
	public static final String PATHOLOGICAL_T = "pathologicalT";
	public static final String BLADDER_NECK = "bladderNeck";
	public static final String LEFT_BASE_MEDIAL = "leftBaseMedial";
	public static final String LEFT_BASE_LATERAL = "leftBaseLateral";
	public static final String RIGHT_BASE_MEDIAL = "rightBaseMedial";
	public static final String RIGHT_BASE_LATERAL = "rightBaseLateral";
	public static final String LEFT_MID_MEDIAL = "leftMidMedial";
	public static final String LEFT_MID_LATERAL = "leftMidLateral";
	public static final String RIGHT_MID_MEDIAL = "rightMidMedial";
	public static final String RIGHT_MID_LATERAL = "rightMidLateral";
	public static final String LEFT_APEX_MEDIAL = "leftApexMedial";
	public static final String LEFT_APEX_LATERAL = "leftApexLateral";
	public static final String RIGHT_APEX_MEDIAL = "rightApexMedial";
	public static final String RIGHT_APEX_LATERAL = "rightApexLateral";
	public static final String NEW_PSA_LEVEL = "newPsaLevel";
	public static final String GYN_ONCOLOGIST = "gynOncologist";
	public static final String TUMOR_TYPE = "tumorType";
	public static final String TIS_BANK_PNR = "tisBankPnr";
	public static final String TIS_BANK_ODUNSI = "tisBankOdunsi";
	public static final String NV_INF = "nvInf";
	public static final String NYSO = "nyso";
	public static final String WT = "wt";
	public static final String IDO = "ido";
	public static final String TIS_BANK = "tisBank";
	public static final String MUCOSAL_INVASION = "mucosalInvasion";
	public static final String MI = "mi";
	public static final String LESION_DEPTH = "lesionDepth";
	public static final String DIST = "dist";
	public static final String _TRUPTURE = "TRupture";
	public static final String MET_PRIMARY = "metPrimary";
	public static final String GLEASON_SCORE = "gleasonScore";
	public static final String _TLOCATION = "TLocation";

	public void save(Case1 transientInstance) {
		log.debug("saving Case1 instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Case1 persistentInstance) {
		log.debug("deleting Case1 instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Case1 findById(java.lang.Integer id) {
		log.debug("getting Case1 instance with id: " + id);
		try {
			Case1 instance = (Case1) getSession().get("com.medikm.dto.Case1", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Case1 instance) {
		log.debug("finding Case1 instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Case1").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Case1 instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Case1 as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRefPhysician(Object refPhysician) {
		return findByProperty(REF_PHYSICIAN, refPhysician);
	}

	public List findByPathologist(Object pathologist) {
		return findByProperty(PATHOLOGIST, pathologist);
	}

	public List findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List findByTumorSize(Object tumorSize) {
		return findByProperty(TUMOR_SIZE, tumorSize);
	}

	public List findByNoNodes(Object noNodes) {
		return findByProperty(NO_NODES, noNodes);
	}

	public List findByDistantMets(Object distantMets) {
		return findByProperty(DISTANT_METS, distantMets);
	}

	public List findByDistantMetsComm(Object distantMetsComm) {
		return findByProperty(DISTANT_METS_COMM, distantMetsComm);
	}

	public List findByClinicalStage(Object clinicalStage) {
		return findByProperty(CLINICAL_STAGE, clinicalStage);
	}

	public List findByHistologicalGrade(Object histologicalGrade) {
		return findByProperty(HISTOLOGICAL_GRADE, histologicalGrade);
	}

	public List findByErStatus(Object erStatus) {
		return findByProperty(ER_STATUS, erStatus);
	}

	public List findByErPercent(Object erPercent) {
		return findByProperty(ER_PERCENT, erPercent);
	}

	public List findByPrStatus(Object prStatus) {
		return findByProperty(PR_STATUS, prStatus);
	}

	public List findByPrPercent(Object prPercent) {
		return findByProperty(PR_PERCENT, prPercent);
	}

	public List findByCaseHer2neuAmplified(Object caseHer2neuAmplified) {
		return findByProperty(CASE_HER2NEU_AMPLIFIED, caseHer2neuAmplified);
	}

	public List findByHer2Status(Object her2Status) {
		return findByProperty(HER2_STATUS, her2Status);
	}

	public List findByHer2Sish(Object her2Sish) {
		return findByProperty(HER2_SISH, her2Sish);
	}

	public List findByDeceasedDueBc(Object deceasedDueBc) {
		return findByProperty(DECEASED_DUE_BC, deceasedDueBc);
	}

	public List findByTreatmentRelatedDeath(Object treatmentRelatedDeath) {
		return findByProperty(TREATMENT_RELATED_DEATH, treatmentRelatedDeath);
	}

	public List findByUnrelatedDeath(Object unrelatedDeath) {
		return findByProperty(UNRELATED_DEATH, unrelatedDeath);
	}

	public List findByMenopauseStatus(Object menopauseStatus) {
		return findByProperty(MENOPAUSE_STATUS, menopauseStatus);
	}

	public List findBySignificanceRisk(Object significanceRisk) {
		return findByProperty(SIGNIFICANCE_RISK, significanceRisk);
	}

	public List findBySignificanceComorbities(Object significanceComorbities) {
		return findByProperty(SIGNIFICANCE_COMORBITIES, significanceComorbities);
	}

	public List findByVersion(Object version) {
		return findByProperty(VERSION, version);
	}

	public List findByClinicalStagingMethod(Object clinicalStagingMethod) {
		return findByProperty(CLINICAL_STAGING_METHOD, clinicalStagingMethod);
	}

	public List findByWhoClassification(Object whoClassification) {
		return findByProperty(WHO_CLASSIFICATION, whoClassification);
	}

	public List findByPleuralInv(Object pleuralInv) {
		return findByProperty(PLEURAL_INV, pleuralInv);
	}

	public List findByNecrosisPercent(Object necrosisPercent) {
		return findByProperty(NECROSIS_PERCENT, necrosisPercent);
	}

	public List findByNecrosisPresent(Object necrosisPresent) {
		return findByProperty(NECROSIS_PRESENT, necrosisPresent);
	}

	public List findByReasonNotTreated(Object reasonNotTreated) {
		return findByProperty(REASON_NOT_TREATED, reasonNotTreated);
	}

	public List findByDiseaseTreated(Object diseaseTreated) {
		return findByProperty(DISEASE_TREATED, diseaseTreated);
	}

	public List findBySeenOnCt(Object seenOnCt) {
		return findByProperty(SEEN_ON_CT, seenOnCt);
	}

	public List findByDurationOfSymptomsMon(Object durationOfSymptomsMon) {
		return findByProperty(DURATION_OF_SYMPTOMS_MON, durationOfSymptomsMon);
	}

	public List findBySeenOnMri(Object seenOnMri) {
		return findByProperty(SEEN_ON_MRI, seenOnMri);
	}

	public List findBySeenOnPat(Object seenOnPat) {
		return findByProperty(SEEN_ON_PAT, seenOnPat);
	}

	public List findBySeenOnThalliumScan(Object seenOnThalliumScan) {
		return findByProperty(SEEN_ON_THALLIUM_SCAN, seenOnThalliumScan);
	}

	public List findBySeenOnXray(Object seenOnXray) {
		return findByProperty(SEEN_ON_XRAY, seenOnXray);
	}

	public List findBySeenOnBonescan(Object seenOnBonescan) {
		return findByProperty(SEEN_ON_BONESCAN, seenOnBonescan);
	}

	public List findByTumorDepth(Object tumorDepth) {
		return findByProperty(TUMOR_DEPTH, tumorDepth);
	}

	public List findByInvasionOfAdjStructure(Object invasionOfAdjStructure) {
		return findByProperty(INVASION_OF_ADJ_STRUCTURE, invasionOfAdjStructure);
	}

	public List findByInvasionOfPleura(Object invasionOfPleura) {
		return findByProperty(INVASION_OF_PLEURA, invasionOfPleura);
	}

	public List findByInvasionOfChestWall(Object invasionOfChestWall) {
		return findByProperty(INVASION_OF_CHEST_WALL, invasionOfChestWall);
	}

	public List findByInvasionOfDiaphragm(Object invasionOfDiaphragm) {
		return findByProperty(INVASION_OF_DIAPHRAGM, invasionOfDiaphragm);
	}

	public List findByInvasionOfPhrenicNerve(Object invasionOfPhrenicNerve) {
		return findByProperty(INVASION_OF_PHRENIC_NERVE, invasionOfPhrenicNerve);
	}

	public List findByInvasionOfPericardium(Object invasionOfPericardium) {
		return findByProperty(INVASION_OF_PERICARDIUM, invasionOfPericardium);
	}

	public List findByAtelectasis(Object atelectasis) {
		return findByProperty(ATELECTASIS, atelectasis);
	}

	public List findByObstractivePneumonitis(Object obstractivePneumonitis) {
		return findByProperty(OBSTRACTIVE_PNEUMONITIS, obstractivePneumonitis);
	}

	public List findBySeparateTnodeInSameLobe(Object separateTnodeInSameLobe) {
		return findByProperty(SEPARATE_TNODE_IN_SAME_LOBE, separateTnodeInSameLobe);
	}

	public List findByInvasionInMediastnum(Object invasionInMediastnum) {
		return findByProperty(INVASION_IN_MEDIASTNUM, invasionInMediastnum);
	}

	public List findByInvasionIntoHeart(Object invasionIntoHeart) {
		return findByProperty(INVASION_INTO_HEART, invasionIntoHeart);
	}

	public List findByInvasionOfMainBronchus(Object invasionOfMainBronchus) {
		return findByProperty(INVASION_OF_MAIN_BRONCHUS, invasionOfMainBronchus);
	}

	public List findByInvasionIntoGreatVessels(Object invasionIntoGreatVessels) {
		return findByProperty(INVASION_INTO_GREAT_VESSELS, invasionIntoGreatVessels);
	}

	public List findByInvasionIntoTrachea(Object invasionIntoTrachea) {
		return findByProperty(INVASION_INTO_TRACHEA, invasionIntoTrachea);
	}

	public List findByInvasionIntoRecLaryngealNerve(Object invasionIntoRecLaryngealNerve) {
		return findByProperty(INVASION_INTO_REC_LARYNGEAL_NERVE, invasionIntoRecLaryngealNerve);
	}

	public List findByInvasionIntoEsophagus(Object invasionIntoEsophagus) {
		return findByProperty(INVASION_INTO_ESOPHAGUS, invasionIntoEsophagus);
	}

	public List findByInvasionIntoVertbralBody(Object invasionIntoVertbralBody) {
		return findByProperty(INVASION_INTO_VERTBRAL_BODY, invasionIntoVertbralBody);
	}

	public List findByInvasionIntoCarina(Object invasionIntoCarina) {
		return findByProperty(INVASION_INTO_CARINA, invasionIntoCarina);
	}

	public List findByTnodesInDiffLobe(Object tnodesInDiffLobe) {
		return findByProperty(TNODES_IN_DIFF_LOBE, tnodesInDiffLobe);
	}

	public List findByNodalMetastases(Object nodalMetastases) {
		return findByProperty(NODAL_METASTASES, nodalMetastases);
	}

	public List findByEsophagectomyDone(Object esophagectomyDone) {
		return findByProperty(ESOPHAGECTOMY_DONE, esophagectomyDone);
	}

	public List findByResidualTumor(Object residualTumor) {
		return findByProperty(RESIDUAL_TUMOR, residualTumor);
	}

	public List findByDebulkingStatus(Object debulkingStatus) {
		return findByProperty(DEBULKING_STATUS, debulkingStatus);
	}

	public List findByPlatinStatus(Object platinStatus) {
		return findByProperty(PLATIN_STATUS, platinStatus);
	}

	public List findByRecurrence(Object recurrence) {
		return findByProperty(RECURRENCE, recurrence);
	}

	public List findByBaseLineCa125(Object baseLineCa125) {
		return findByProperty(BASE_LINE_CA125, baseLineCa125);
	}

	public List findByPrgFreeSurvival(Object prgFreeSurvival) {
		return findByProperty(PRG_FREE_SURVIVAL, prgFreeSurvival);
	}

	public List findByOverallSurvival(Object overallSurvival) {
		return findByProperty(OVERALL_SURVIVAL, overallSurvival);
	}

	public List findByEsophagealCStagingMethod(Object esophagealCStagingMethod) {
		return findByProperty(ESOPHAGEAL_CSTAGING_METHOD, esophagealCStagingMethod);
	}

	public List findByLater(Object later) {
		return findByProperty(LATER, later);
	}

	public List findByStPrimary(Object stPrimary) {
		return findByProperty(ST_PRIMARY, stPrimary);
	}

	public List findByNdPrimary(Object ndPrimary) {
		return findByProperty(ND_PRIMARY, ndPrimary);
	}

	public List findByDiseasePropagation(Object diseasePropagation) {
		return findByProperty(DISEASE_PROPAGATION, diseasePropagation);
	}

	public List findByMetastatic(Object metastatic) {
		return findByProperty(METASTATIC, metastatic);
	}

	public List findByChiefComplaint(Object chiefComplaint) {
		return findByProperty(CHIEF_COMPLAINT, chiefComplaint);
	}

	public List findByLymfovascularInvasion(Object lymfovascularInvasion) {
		return findByProperty(LYMFOVASCULAR_INVASION, lymfovascularInvasion);
	}

	public List findByMargins(Object margins) {
		return findByProperty(MARGINS, margins);
	}

	public List findByClosestMargins(Object closestMargins) {
		return findByProperty(CLOSEST_MARGINS, closestMargins);
	}

	public List findByImmuneHistochemistry(Object immuneHistochemistry) {
		return findByProperty(IMMUNE_HISTOCHEMISTRY, immuneHistochemistry);
	}

	public List findByNoFossi(Object noFossi) {
		return findByProperty(NO_FOSSI, noFossi);
	}

	public List findByBrca(Object brca) {
		return findByProperty(BRCA, brca);
	}

	public List findByOncDxScore(Object oncDxScore) {
		return findByProperty(ONC_DX_SCORE, oncDxScore);
	}

	public List findByMetastasis(Object metastasis) {
		return findByProperty(METASTASIS, metastasis);
	}

	public List findByMetPrimarySite(Object metPrimarySite) {
		return findByProperty(MET_PRIMARY_SITE, metPrimarySite);
	}

	public List findByOtherBiomarkers(Object otherBiomarkers) {
		return findByProperty(OTHER_BIOMARKERS, otherBiomarkers);
	}

	public List findByNln(Object nln) {
		return findByProperty(NLN, nln);
	}

	public List findByTumorOnSurface(Object tumorOnSurface) {
		return findByProperty(TUMOR_ON_SURFACE, tumorOnSurface);
	}

	public List findByLsvi(Object lsvi) {
		return findByProperty(LSVI, lsvi);
	}

	public List findByParametrialInvasion(Object parametrialInvasion) {
		return findByProperty(PARAMETRIAL_INVASION, parametrialInvasion);
	}

	public List findByStromalInvasion(Object stromalInvasion) {
		return findByProperty(STROMAL_INVASION, stromalInvasion);
	}

	public List findByDepth(Object depth) {
		return findByProperty(DEPTH, depth);
	}

	public List findByHorizontalSpread(Object horizontalSpread) {
		return findByProperty(HORIZONTAL_SPREAD, horizontalSpread);
	}

	public List findByWashings(Object washings) {
		return findByProperty(WASHINGS, washings);
	}

	public List findByCapsuleIntact(Object capsuleIntact) {
		return findByProperty(CAPSULE_INTACT, capsuleIntact);
	}

	public List findBySurgicalSpill(Object surgicalSpill) {
		return findByProperty(SURGICAL_SPILL, surgicalSpill);
	}

	public List findByMetastaticSite(Object metastaticSite) {
		return findByProperty(METASTATIC_SITE, metastaticSite);
	}

	public List findByLnMetastasisSite(Object lnMetastasisSite) {
		return findByProperty(LN_METASTASIS_SITE, lnMetastasisSite);
	}

	public List findByMalignantAscites(Object malignantAscites) {
		return findByProperty(MALIGNANT_ASCITES, malignantAscites);
	}

	public List findByGrossCervicalInvolvement(Object grossCervicalInvolvement) {
		return findByProperty(GROSS_CERVICAL_INVOLVEMENT, grossCervicalInvolvement);
	}

	public List findByAorticNodePositive(Object aorticNodePositive) {
		return findByProperty(AORTIC_NODE_POSITIVE, aorticNodePositive);
	}

	public List findByTumorPenetratedSerosalSurface(Object tumorPenetratedSerosalSurface) {
		return findByProperty(TUMOR_PENETRATED_SEROSAL_SURFACE, tumorPenetratedSerosalSurface);
	}

	public List findByMalignantCellsInAscites(Object malignantCellsInAscites) {
		return findByProperty(MALIGNANT_CELLS_IN_ASCITES, malignantCellsInAscites);
	}

	public List findByMalignantCellsInPeritonealWashings(Object malignantCellsInPeritonealWashings) {
		return findByProperty(MALIGNANT_CELLS_IN_PERITONEAL_WASHINGS, malignantCellsInPeritonealWashings);
	}

	public List findByPeritonealImplants(Object peritonealImplants) {
		return findByProperty(PERITONEAL_IMPLANTS, peritonealImplants);
	}

	public List findByPelvicExtensions(Object pelvicExtensions) {
		return findByProperty(PELVIC_EXTENSIONS, pelvicExtensions);
	}

	public List findByExtensionToOtherStructures(Object extensionToOtherStructures) {
		return findByProperty(EXTENSION_TO_OTHER_STRUCTURES, extensionToOtherStructures);
	}

	public List findBySpecify(Object specify) {
		return findByProperty(SPECIFY, specify);
	}

	public List findByOperable(Object operable) {
		return findByProperty(OPERABLE, operable);
	}

	public List findByFertilitySparing(Object fertilitySparing) {
		return findByProperty(FERTILITY_SPARING, fertilitySparing);
	}

	public List findByHydronephrosis(Object hydronephrosis) {
		return findByProperty(HYDRONEPHROSIS, hydronephrosis);
	}

	public List findByClinicallyVisibleLesion(Object clinicallyVisibleLesion) {
		return findByProperty(CLINICALLY_VISIBLE_LESION, clinicallyVisibleLesion);
	}

	public List findBySurgicalCandidate(Object surgicalCandidate) {
		return findByProperty(SURGICAL_CANDIDATE, surgicalCandidate);
	}

	public List findBySurgicallyResectable(Object surgicallyResectable) {
		return findByProperty(SURGICALLY_RESECTABLE, surgicallyResectable);
	}

	public List findByResidualDisease(Object residualDisease) {
		return findByProperty(RESIDUAL_DISEASE, residualDisease);
	}

	public List findByMalignantEpithelialCarcinoma(Object malignantEpithelialCarcinoma) {
		return findByProperty(MALIGNANT_EPITHELIAL_CARCINOMA, malignantEpithelialCarcinoma);
	}

	public List findByPureEndometrioidCarcinoma(Object pureEndometrioidCarcinoma) {
		return findByProperty(PURE_ENDOMETRIOID_CARCINOMA, pureEndometrioidCarcinoma);
	}

	public List findBySerousCellCarcinoma(Object serousCellCarcinoma) {
		return findByProperty(SEROUS_CELL_CARCINOMA, serousCellCarcinoma);
	}

	public List findByStromalTumor(Object stromalTumor) {
		return findByProperty(STROMAL_TUMOR, stromalTumor);
	}

	public List findByUterusDiseaseLimited(Object uterusDiseaseLimited) {
		return findByProperty(UTERUS_DISEASE_LIMITED, uterusDiseaseLimited);
	}

	public List findBySuspectedExtrauterineDisease(Object suspectedExtrauterineDisease) {
		return findByProperty(SUSPECTED_EXTRAUTERINE_DISEASE, suspectedExtrauterineDisease);
	}

	public List findByMyometrialInvasion(Object myometrialInvasion) {
		return findByProperty(MYOMETRIAL_INVASION, myometrialInvasion);
	}

	public List findByAdverseRiskFactors(Object adverseRiskFactors) {
		return findByProperty(ADVERSE_RISK_FACTORS, adverseRiskFactors);
	}

	public List findByDetails(Object details) {
		return findByProperty(DETAILS, details);
	}

	public List findByClearCellHistology(Object clearCellHistology) {
		return findByProperty(CLEAR_CELL_HISTOLOGY, clearCellHistology);
	}

	public List findByNumberOfMetastaticSites(Object numberOfMetastaticSites) {
		return findByProperty(NUMBER_OF_METASTATIC_SITES, numberOfMetastaticSites);
	}

	public List findByMiscellaneous(Object miscellaneous) {
		return findByProperty(MISCELLANEOUS, miscellaneous);
	}

	public List findByGeneticRiskEvaluation(Object geneticRiskEvaluation) {
		return findByProperty(GENETIC_RISK_EVALUATION, geneticRiskEvaluation);
	}

	public List findByPsaLevels(Object psaLevels) {
		return findByProperty(PSA_LEVELS, psaLevels);
	}

	public List findByNumberOfBxCores(Object numberOfBxCores) {
		return findByProperty(NUMBER_OF_BX_CORES, numberOfBxCores);
	}

	public List findByNumberOfPositiveCores(Object numberOfPositiveCores) {
		return findByProperty(NUMBER_OF_POSITIVE_CORES, numberOfPositiveCores);
	}

	public List findByPercentOfPositiveCores(Object percentOfPositiveCores) {
		return findByProperty(PERCENT_OF_POSITIVE_CORES, percentOfPositiveCores);
	}

	public List findByTumorVolume(Object tumorVolume) {
		return findByProperty(TUMOR_VOLUME, tumorVolume);
	}

	public List findByCancerStatus(Object cancerStatus) {
		return findByProperty(CANCER_STATUS, cancerStatus);
	}

	public List findByProgressionFreeSurvivalAfterSurgery(Object progressionFreeSurvivalAfterSurgery) {
		return findByProperty(PROGRESSION_FREE_SURVIVAL_AFTER_SURGERY, progressionFreeSurvivalAfterSurgery);
	}

	public List findByProgressionFreeSurvivalAfterRt(Object progressionFreeSurvivalAfterRt) {
		return findByProperty(PROGRESSION_FREE_SURVIVAL_AFTER_RT, progressionFreeSurvivalAfterRt);
	}

	public List findByProgressionFreeSurvivalAfterBt(Object progressionFreeSurvivalAfterBt) {
		return findByProperty(PROGRESSION_FREE_SURVIVAL_AFTER_BT, progressionFreeSurvivalAfterBt);
	}

	public List findByAlfhaFp(Object alfhaFp) {
		return findByProperty(ALFHA_FP, alfhaFp);
	}

	public List findByBetaHcg(Object betaHcg) {
		return findByProperty(BETA_HCG, betaHcg);
	}

	public List findByLdh(Object ldh) {
		return findByProperty(LDH, ldh);
	}

	public List findByProstateVolume(Object prostateVolume) {
		return findByProperty(PROSTATE_VOLUME, prostateVolume);
	}

	public List findByBiopsyGleasonScore(Object biopsyGleasonScore) {
		return findByProperty(BIOPSY_GLEASON_SCORE, biopsyGleasonScore);
	}

	public List findBySurgicalGleasonScore(Object surgicalGleasonScore) {
		return findByProperty(SURGICAL_GLEASON_SCORE, surgicalGleasonScore);
	}

	public List findByNumberPositiveBiopsyCores(Object numberPositiveBiopsyCores) {
		return findByProperty(NUMBER_POSITIVE_BIOPSY_CORES, numberPositiveBiopsyCores);
	}

	public List findByPositiveBiopsyCoresLocation(Object positiveBiopsyCoresLocation) {
		return findByProperty(POSITIVE_BIOPSY_CORES_LOCATION, positiveBiopsyCoresLocation);
	}

	public List findByPsaDoublingTime(Object psaDoublingTime) {
		return findByProperty(PSA_DOUBLING_TIME, psaDoublingTime);
	}

	public List findByPsaDensity(Object psaDensity) {
		return findByProperty(PSA_DENSITY, psaDensity);
	}

	public List findByPsaCureRate(Object psaCureRate) {
		return findByProperty(PSA_CURE_RATE, psaCureRate);
	}

	public List findByProstateEchotexture(Object prostateEchotexture) {
		return findByProperty(PROSTATE_ECHOTEXTURE, prostateEchotexture);
	}

	public List findByPercantCancerInAnyCore(Object percantCancerInAnyCore) {
		return findByProperty(PERCANT_CANCER_IN_ANY_CORE, percantCancerInAnyCore);
	}

	public List findByNetLifeExpectancy(Object netLifeExpectancy) {
		return findByProperty(NET_LIFE_EXPECTANCY, netLifeExpectancy);
	}

	public List findByProbabilityOfCaDeathSe(Object probabilityOfCaDeathSe) {
		return findByProperty(PROBABILITY_OF_CA_DEATH_SE, probabilityOfCaDeathSe);
	}

	public List findByTnmStagingSystem(Object tnmStagingSystem) {
		return findByProperty(TNM_STAGING_SYSTEM, tnmStagingSystem);
	}

	public List findByProbabilityOfCaDeathDt(Object probabilityOfCaDeathDt) {
		return findByProperty(PROBABILITY_OF_CA_DEATH_DT, probabilityOfCaDeathDt);
	}

	public List findByOneY(Object oneY) {
		return findByProperty(ONE_Y, oneY);
	}

	public List findByTwoY(Object twoY) {
		return findByProperty(TWO_Y, twoY);
	}

	public List findByCrpcMedianSurvivalInYears(Object crpcMedianSurvivalInYears) {
		return findByProperty(CRPC_MEDIAN_SURVIVAL_IN_YEARS, crpcMedianSurvivalInYears);
	}

	public List findByProbabilityOfLymphNodeInvolvement(Object probabilityOfLymphNodeInvolvement) {
		return findByProperty(PROBABILITY_OF_LYMPH_NODE_INVOLVEMENT, probabilityOfLymphNodeInvolvement);
	}

	public List findByProgressionFreeSurvivalProbabilityAfterSalvageRtSixY(
			Object progressionFreeSurvivalProbabilityAfterSalvageRtSixY) {
		return findByProperty(PROGRESSION_FREE_SURVIVAL_PROBABILITY_AFTER_SALVAGE_RT_SIX_Y,
				progressionFreeSurvivalProbabilityAfterSalvageRtSixY);
	}

	public List findByExtracapsularExtension(Object extracapsularExtension) {
		return findByProperty(EXTRACAPSULAR_EXTENSION, extracapsularExtension);
	}

	public List findByFixation(Object fixation) {
		return findByProperty(FIXATION, fixation);
	}

	public List findBySeminalVesicleInvasion(Object seminalVesicleInvasion) {
		return findByProperty(SEMINAL_VESICLE_INVASION, seminalVesicleInvasion);
	}

	public List findByTumorInCentralLocation(Object tumorInCentralLocation) {
		return findByProperty(TUMOR_IN_CENTRAL_LOCATION, tumorInCentralLocation);
	}

	public List findByIndolentCancer(Object indolentCancer) {
		return findByProperty(INDOLENT_CANCER, indolentCancer);
	}

	public List findByOrganConfinedDisease(Object organConfinedDisease) {
		return findByProperty(ORGAN_CONFINED_DISEASE, organConfinedDisease);
	}

	public List findByCapsularPenetration(Object capsularPenetration) {
		return findByProperty(CAPSULAR_PENETRATION, capsularPenetration);
	}

	public List findByLymphNodeMets(Object lymphNodeMets) {
		return findByProperty(LYMPH_NODE_METS, lymphNodeMets);
	}

	public List findByNeoadjResponse(Object neoadjResponse) {
		return findByProperty(NEOADJ_RESPONSE, neoadjResponse);
	}

	public List findByOptimalcytred(Object optimalcytred) {
		return findByProperty(OPTIMALCYTRED, optimalcytred);
	}

	public List findByParametriumPos(Object parametriumPos) {
		return findByProperty(PARAMETRIUM_POS, parametriumPos);
	}

	public List findBySeminalVInvasionPercentage(Object seminalVInvasionPercentage) {
		return findByProperty(SEMINAL_VINVASION_PERCENTAGE, seminalVInvasionPercentage);
	}

	public List findByCap(Object cap) {
		return findByProperty(CAP, cap);
	}

	public List findByPathologicalT(Object pathologicalT) {
		return findByProperty(PATHOLOGICAL_T, pathologicalT);
	}

	public List findByBladderNeck(Object bladderNeck) {
		return findByProperty(BLADDER_NECK, bladderNeck);
	}

	public List findByLeftBaseMedial(Object leftBaseMedial) {
		return findByProperty(LEFT_BASE_MEDIAL, leftBaseMedial);
	}

	public List findByLeftBaseLateral(Object leftBaseLateral) {
		return findByProperty(LEFT_BASE_LATERAL, leftBaseLateral);
	}

	public List findByRightBaseMedial(Object rightBaseMedial) {
		return findByProperty(RIGHT_BASE_MEDIAL, rightBaseMedial);
	}

	public List findByRightBaseLateral(Object rightBaseLateral) {
		return findByProperty(RIGHT_BASE_LATERAL, rightBaseLateral);
	}

	public List findByLeftMidMedial(Object leftMidMedial) {
		return findByProperty(LEFT_MID_MEDIAL, leftMidMedial);
	}

	public List findByLeftMidLateral(Object leftMidLateral) {
		return findByProperty(LEFT_MID_LATERAL, leftMidLateral);
	}

	public List findByRightMidMedial(Object rightMidMedial) {
		return findByProperty(RIGHT_MID_MEDIAL, rightMidMedial);
	}

	public List findByRightMidLateral(Object rightMidLateral) {
		return findByProperty(RIGHT_MID_LATERAL, rightMidLateral);
	}

	public List findByLeftApexMedial(Object leftApexMedial) {
		return findByProperty(LEFT_APEX_MEDIAL, leftApexMedial);
	}

	public List findByLeftApexLateral(Object leftApexLateral) {
		return findByProperty(LEFT_APEX_LATERAL, leftApexLateral);
	}

	public List findByRightApexMedial(Object rightApexMedial) {
		return findByProperty(RIGHT_APEX_MEDIAL, rightApexMedial);
	}

	public List findByRightApexLateral(Object rightApexLateral) {
		return findByProperty(RIGHT_APEX_LATERAL, rightApexLateral);
	}

	public List findByNewPsaLevel(Object newPsaLevel) {
		return findByProperty(NEW_PSA_LEVEL, newPsaLevel);
	}

	public List findByGynOncologist(Object gynOncologist) {
		return findByProperty(GYN_ONCOLOGIST, gynOncologist);
	}

	public List findByTumorType(Object tumorType) {
		return findByProperty(TUMOR_TYPE, tumorType);
	}

	public List findByTisBankPnr(Object tisBankPnr) {
		return findByProperty(TIS_BANK_PNR, tisBankPnr);
	}

	public List findByTisBankOdunsi(Object tisBankOdunsi) {
		return findByProperty(TIS_BANK_ODUNSI, tisBankOdunsi);
	}

	public List findByNvInf(Object nvInf) {
		return findByProperty(NV_INF, nvInf);
	}

	public List findByNyso(Object nyso) {
		return findByProperty(NYSO, nyso);
	}

	public List findByWt(Object wt) {
		return findByProperty(WT, wt);
	}

	public List findByIdo(Object ido) {
		return findByProperty(IDO, ido);
	}

	public List findByTisBank(Object tisBank) {
		return findByProperty(TIS_BANK, tisBank);
	}

	public List findByMucosalInvasion(Object mucosalInvasion) {
		return findByProperty(MUCOSAL_INVASION, mucosalInvasion);
	}

	public List findByMi(Object mi) {
		return findByProperty(MI, mi);
	}

	public List findByLesionDepth(Object lesionDepth) {
		return findByProperty(LESION_DEPTH, lesionDepth);
	}

	public List findByDist(Object dist) {
		return findByProperty(DIST, dist);
	}

	public List findByTRupture(Object TRupture) {
		return findByProperty(_TRUPTURE, TRupture);
	}

	public List findByMetPrimary(Object metPrimary) {
		return findByProperty(MET_PRIMARY, metPrimary);
	}

	public List findByGleasonScore(Object gleasonScore) {
		return findByProperty(GLEASON_SCORE, gleasonScore);
	}

	public List findByTLocation(Object TLocation) {
		return findByProperty(_TLOCATION, TLocation);
	}

	public List findAll() {
		log.debug("finding all Case1 instances");
		try {
			String queryString = "from Case1";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Case1 merge(Case1 detachedInstance) {
		log.debug("merging Case1 instance");
		try {
			Case1 result = (Case1) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Case1 instance) {
		log.debug("attaching dirty Case1 instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Case1 instance) {
		log.debug("attaching clean Case1 instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
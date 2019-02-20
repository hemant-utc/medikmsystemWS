package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.PersonalMedicalHistory;

/**
 * A data access object (DAO) providing persistence and search support for
 * PersonalMedicalHistory entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.PersonalMedicalHistory
 * @author MyEclipse Persistence Tools
 */

@SuppressWarnings({ "rawtypes", "deprecation" })
public class PersonalMedicalHistoryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PersonalMedicalHistoryDAO.class);
	// property constants
	public static final String PREVIOUS_CANCER = "previousCancer";
	public static final String PR_CA_CLEAR_SURGICAL_MARGINS = "prCaClearSurgicalMargins";
	public static final String PC_HISTOLOGICAL_GRADE = "pcHistologicalGrade";
	public static final String PC_ER_STATUS = "pcErStatus";
	public static final String PC_PR_STATUS = "pcPrStatus";
	public static final String PC_HER2NEU_STATUS = "pcHer2neuStatus";
	public static final String PC_HER2NEU_SISH = "pcHer2neuSish";
	public static final String PC_SURGERY = "pcSurgery";
	public static final String PC_SURGERY_COMM = "pcSurgeryComm";
	public static final String PC_CHEMO = "pcChemo";
	public static final String PC_CHEMO_COMM = "pcChemoComm";
	public static final String PC_RT = "pcRt";
	public static final String PC_RT_COMM = "pcRtComm";
	public static final String PC_ENDOCRINE_THERAPY = "pcEndocrineTherapy";
	public static final String PC_ENDOCRINE_THERAPY_COMM = "pcEndocrineTherapyComm";
	public static final String PC_TARGETED_THERAPY = "pcTargetedTherapy";
	public static final String PC_TARGETED_THERAPY_COMM = "pcTargetedTherapyComm";
	public static final String PC_BIOPSY = "pcBiopsy";
	public static final String PC_BIOPSY_COMM = "pcBiopsyComm";
	public static final String NO_PC_BIOPSIES = "noPcBiopsies";
	public static final String ATYPICAL_HYPERPLASIA_BREAST_BIOPSY = "atypicalHyperplasiaBreastBiopsy";
	public static final String HORMONE_REPLACEMENT_THERAPY_USE = "hormoneReplacementTherapyUse";
	public static final String HORMONE_REPLACEMENT_THERAPY_USE_COMM = "hormoneReplacementTherapyUseComm";
	public static final String HISTERECTOMY = "histerectomy";
	public static final String OVARIECTOMY = "ovariectomy";
	public static final String OVARIECTOMY_COMM = "ovariectomyComm";
	public static final String CHEST_WALL_RADIATION = "chestWallRadiation";
	public static final String CHEST_WALL_RADIATION_COMM = "chestWallRadiationComm";
	public static final String RADIATION_THERAPY_DURING_PREGNANCY = "radiationTherapyDuringPregnancy";
	public static final String RADIATION_THERAPY_DURING_PREGNANCY_COMM = "radiationTherapyDuringPregnancyComm";
	public static final String HORMONE_MANIPULATION_THERAPY = "hormoneManipulationTherapy";
	public static final String MAJOR_COMORBIDITIES = "majorComorbidities";
	public static final String ACTIVE_CONNECTIVE_TISSUE_DISEASE_INVOLVING_SKIN = "activeConnectiveTissueDiseaseInvolvingSkin";
	public static final String OVARIAN_CANCER = "ovarianCancer";
	public static final String PREVIOUS_OTHER_CANCER = "previousOtherCancer";
	public static final String THRYROID_DISEASE = "thryroidDisease";
	public static final String THRYROID_DISEASE_COMM = "thryroidDiseaseComm";
	public static final String UTERINE_FIBROIDS = "uterineFibroids";
	public static final String PEREZ_JAGER_DISEASE = "perezJagerDisease";
	public static final String HAMARTOMAS = "hamartomas";
	public static final String AUTUIMMUNE_DISEASE = "autuimmuneDisease";
	public static final String AUTUIMMUNE_DISEASE_COMM = "autuimmuneDiseaseComm";
	public static final String PROSTATE_DISEASE = "prostateDisease";
	public static final String PROSTATE_DISEASE_COMM = "prostateDiseaseComm";
	public static final String SYNCHRONOUS_PRIMARY_BREAST_CANCER = "synchronousPrimaryBreastCancer";
	public static final String BILATERAL_BC = "bilateralBc";
	public static final String ALCOHOL_INTAKE = "alcoholIntake";
	public static final String SMOKING_HISTORY = "smokingHistory";
	public static final String ANTRACYCLINE_ADMINISTERED = "antracyclineAdministered";
	public static final String ANTRACYCLINE_ADMINISTERED_COMM = "antracyclineAdministeredComm";
	public static final String TREATMENT_RELATED_TOXICITY = "treatmentRelatedToxicity";
	public static final String TREATMENT_RELATED_TOXICITY_COMM = "treatmentRelatedToxicityComm";
	public static final String BENIGN_BREAST_DISEASE = "benignBreastDisease";
	public static final String PRIOR_THORACIC_RT = "priorThoracicRt";
	public static final String MUTATIONS = "mutations";
	public static final String HX_RENAL_FAIL = "hxRenalFail";
	public static final String HX_VHL = "hxVhl";
	public static final String HX_PREV_CANCER = "hxPrevCancer";
	public static final String CURRENT_SMOKER = "currentSmoker";
	public static final String NO_YR_SMOKED = "noYrSmoked";
	public static final String NO_PACK_SMOKE_PDAY = "noPackSmokePday";
	public static final String PAST_SURG_HX = "pastSurgHx";
	public static final String NO_PRIOR_ABDOMINAL_SUR = "noPriorAbdominalSur";
	public static final String CIG_PACK_YEAR = "cigPackYear";
	public static final String HYPERTENTION = "hypertention";
	public static final String PULM_HYPERTN = "pulmHypertn";
	public static final String DIABETES = "diabetes";
	public static final String DIAB_CTRL = "diabCtrl";
	public static final String DIALYSIS = "dialysis";
	public static final String HEMOGLOBIN_LST = "hemoglobinLst";
	public static final String COPD = "copd";
	public static final String HIST_GEN_SYN_BONE = "histGenSynBone";
	public static final String HIST_SARCOMA = "histSarcoma";
	public static final String HIST_MASS = "histMass";
	public static final String HIST_PAIN = "histPain";
	public static final String HIST_PATH_FRACTURE = "histPathFracture";
	public static final String PRIOR_CHEMO_CURATIVE_NO = "priorChemoCurativeNo";
	public static final String PRIOR_CHEMO_PALLIATIVE_NO = "priorChemoPalliativeNo";
	public static final String PRIOR_RADIO_CURA_NO = "priorRadioCuraNo";
	public static final String PRIOR_RADIO_PALLIATIVE_NO = "priorRadioPalliativeNo";
	public static final String PRIOR_SURGERY_NO = "priorSurgeryNo";
	public static final String PRIOR_CONG_INHER_SYNDRONE = "priorCongInherSyndrone";
	public static final String RADIO_THERAPY_EXP = "radioTherapyExp";
	public static final String NO_YR_QUIT_SMOKE = "noYrQuitSmoke";
	public static final String PERSONAL_MEDICAL_HISTORY_COMMENTS = "personalMedicalHistoryComments";
	public static final String OTHER_HISTORY = "otherHistory";
	public static final String TRAUMA_HX = "traumaHx";
	public static final String RT_HX = "rtHx";
	public static final String TOXIC_CHEMICALS = "toxicChemicals";
	public static final String ADEQUATE_PREVIOUS_SURGERY = "adequatePreviousSurgery";
	public static final String CLINICAL_PRESENTATION = "clinicalPresentation";
	public static final String INCIDENTAL_FINDING = "incidentalFinding";
	public static final String BMI = "bmi";
	public static final String CALCIUM_LEVEL = "calciumLevel";
	public static final String CADMIUM_LEVEL = "cadmiumLevel";
	public static final String PROSTATITIS = "prostatitis";

	public void save(PersonalMedicalHistory transientInstance) {
		log.debug("saving PersonalMedicalHistory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PersonalMedicalHistory persistentInstance) {
		log.debug("deleting PersonalMedicalHistory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PersonalMedicalHistory findById(com.medikm.dto.PersonalMedicalHistoryId id) {
		log.debug("getting PersonalMedicalHistory instance with id: " + id);
		try {
			PersonalMedicalHistory instance = (PersonalMedicalHistory) getSession()
					.get("com.medikm.dto.PersonalMedicalHistory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PersonalMedicalHistory instance) {
		log.debug("finding PersonalMedicalHistory instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.PersonalMedicalHistory")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PersonalMedicalHistory instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PersonalMedicalHistory as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPreviousCancer(Object previousCancer) {
		return findByProperty(PREVIOUS_CANCER, previousCancer);
	}

	public List findByPrCaClearSurgicalMargins(Object prCaClearSurgicalMargins) {
		return findByProperty(PR_CA_CLEAR_SURGICAL_MARGINS, prCaClearSurgicalMargins);
	}

	public List findByPcHistologicalGrade(Object pcHistologicalGrade) {
		return findByProperty(PC_HISTOLOGICAL_GRADE, pcHistologicalGrade);
	}

	public List findByPcErStatus(Object pcErStatus) {
		return findByProperty(PC_ER_STATUS, pcErStatus);
	}

	public List findByPcPrStatus(Object pcPrStatus) {
		return findByProperty(PC_PR_STATUS, pcPrStatus);
	}

	public List findByPcHer2neuStatus(Object pcHer2neuStatus) {
		return findByProperty(PC_HER2NEU_STATUS, pcHer2neuStatus);
	}

	public List findByPcHer2neuSish(Object pcHer2neuSish) {
		return findByProperty(PC_HER2NEU_SISH, pcHer2neuSish);
	}

	public List findByPcSurgery(Object pcSurgery) {
		return findByProperty(PC_SURGERY, pcSurgery);
	}

	public List findByPcSurgeryComm(Object pcSurgeryComm) {
		return findByProperty(PC_SURGERY_COMM, pcSurgeryComm);
	}

	public List findByPcChemo(Object pcChemo) {
		return findByProperty(PC_CHEMO, pcChemo);
	}

	public List findByPcChemoComm(Object pcChemoComm) {
		return findByProperty(PC_CHEMO_COMM, pcChemoComm);
	}

	public List findByPcRt(Object pcRt) {
		return findByProperty(PC_RT, pcRt);
	}

	public List findByPcRtComm(Object pcRtComm) {
		return findByProperty(PC_RT_COMM, pcRtComm);
	}

	public List findByPcEndocrineTherapy(Object pcEndocrineTherapy) {
		return findByProperty(PC_ENDOCRINE_THERAPY, pcEndocrineTherapy);
	}

	public List findByPcEndocrineTherapyComm(Object pcEndocrineTherapyComm) {
		return findByProperty(PC_ENDOCRINE_THERAPY_COMM, pcEndocrineTherapyComm);
	}

	public List findByPcTargetedTherapy(Object pcTargetedTherapy) {
		return findByProperty(PC_TARGETED_THERAPY, pcTargetedTherapy);
	}

	public List findByPcTargetedTherapyComm(Object pcTargetedTherapyComm) {
		return findByProperty(PC_TARGETED_THERAPY_COMM, pcTargetedTherapyComm);
	}

	public List findByPcBiopsy(Object pcBiopsy) {
		return findByProperty(PC_BIOPSY, pcBiopsy);
	}

	public List findByPcBiopsyComm(Object pcBiopsyComm) {
		return findByProperty(PC_BIOPSY_COMM, pcBiopsyComm);
	}

	public List findByNoPcBiopsies(Object noPcBiopsies) {
		return findByProperty(NO_PC_BIOPSIES, noPcBiopsies);
	}

	public List findByAtypicalHyperplasiaBreastBiopsy(Object atypicalHyperplasiaBreastBiopsy) {
		return findByProperty(ATYPICAL_HYPERPLASIA_BREAST_BIOPSY, atypicalHyperplasiaBreastBiopsy);
	}

	public List findByHormoneReplacementTherapyUse(Object hormoneReplacementTherapyUse) {
		return findByProperty(HORMONE_REPLACEMENT_THERAPY_USE, hormoneReplacementTherapyUse);
	}

	public List findByHormoneReplacementTherapyUseComm(Object hormoneReplacementTherapyUseComm) {
		return findByProperty(HORMONE_REPLACEMENT_THERAPY_USE_COMM, hormoneReplacementTherapyUseComm);
	}

	public List findByHisterectomy(Object histerectomy) {
		return findByProperty(HISTERECTOMY, histerectomy);
	}

	public List findByOvariectomy(Object ovariectomy) {
		return findByProperty(OVARIECTOMY, ovariectomy);
	}

	public List findByOvariectomyComm(Object ovariectomyComm) {
		return findByProperty(OVARIECTOMY_COMM, ovariectomyComm);
	}

	public List findByChestWallRadiation(Object chestWallRadiation) {
		return findByProperty(CHEST_WALL_RADIATION, chestWallRadiation);
	}

	public List findByChestWallRadiationComm(Object chestWallRadiationComm) {
		return findByProperty(CHEST_WALL_RADIATION_COMM, chestWallRadiationComm);
	}

	public List findByRadiationTherapyDuringPregnancy(Object radiationTherapyDuringPregnancy) {
		return findByProperty(RADIATION_THERAPY_DURING_PREGNANCY, radiationTherapyDuringPregnancy);
	}

	public List findByRadiationTherapyDuringPregnancyComm(Object radiationTherapyDuringPregnancyComm) {
		return findByProperty(RADIATION_THERAPY_DURING_PREGNANCY_COMM, radiationTherapyDuringPregnancyComm);
	}

	public List findByHormoneManipulationTherapy(Object hormoneManipulationTherapy) {
		return findByProperty(HORMONE_MANIPULATION_THERAPY, hormoneManipulationTherapy);
	}

	public List findByMajorComorbidities(Object majorComorbidities) {
		return findByProperty(MAJOR_COMORBIDITIES, majorComorbidities);
	}

	public List findByActiveConnectiveTissueDiseaseInvolvingSkin(Object activeConnectiveTissueDiseaseInvolvingSkin) {
		return findByProperty(ACTIVE_CONNECTIVE_TISSUE_DISEASE_INVOLVING_SKIN,
				activeConnectiveTissueDiseaseInvolvingSkin);
	}

	public List findByOvarianCancer(Object ovarianCancer) {
		return findByProperty(OVARIAN_CANCER, ovarianCancer);
	}

	public List findByPreviousOtherCancer(Object previousOtherCancer) {
		return findByProperty(PREVIOUS_OTHER_CANCER, previousOtherCancer);
	}

	public List findByThryroidDisease(Object thryroidDisease) {
		return findByProperty(THRYROID_DISEASE, thryroidDisease);
	}

	public List findByThryroidDiseaseComm(Object thryroidDiseaseComm) {
		return findByProperty(THRYROID_DISEASE_COMM, thryroidDiseaseComm);
	}

	public List findByUterineFibroids(Object uterineFibroids) {
		return findByProperty(UTERINE_FIBROIDS, uterineFibroids);
	}

	public List findByPerezJagerDisease(Object perezJagerDisease) {
		return findByProperty(PEREZ_JAGER_DISEASE, perezJagerDisease);
	}

	public List findByHamartomas(Object hamartomas) {
		return findByProperty(HAMARTOMAS, hamartomas);
	}

	public List findByAutuimmuneDisease(Object autuimmuneDisease) {
		return findByProperty(AUTUIMMUNE_DISEASE, autuimmuneDisease);
	}

	public List findByAutuimmuneDiseaseComm(Object autuimmuneDiseaseComm) {
		return findByProperty(AUTUIMMUNE_DISEASE_COMM, autuimmuneDiseaseComm);
	}

	public List findByProstateDisease(Object prostateDisease) {
		return findByProperty(PROSTATE_DISEASE, prostateDisease);
	}

	public List findByProstateDiseaseComm(Object prostateDiseaseComm) {
		return findByProperty(PROSTATE_DISEASE_COMM, prostateDiseaseComm);
	}

	public List findBySynchronousPrimaryBreastCancer(Object synchronousPrimaryBreastCancer) {
		return findByProperty(SYNCHRONOUS_PRIMARY_BREAST_CANCER, synchronousPrimaryBreastCancer);
	}

	public List findByBilateralBc(Object bilateralBc) {
		return findByProperty(BILATERAL_BC, bilateralBc);
	}

	public List findByAlcoholIntake(Object alcoholIntake) {
		return findByProperty(ALCOHOL_INTAKE, alcoholIntake);
	}

	public List findBySmokingHistory(Object smokingHistory) {
		return findByProperty(SMOKING_HISTORY, smokingHistory);
	}

	public List findByAntracyclineAdministered(Object antracyclineAdministered) {
		return findByProperty(ANTRACYCLINE_ADMINISTERED, antracyclineAdministered);
	}

	public List findByAntracyclineAdministeredComm(Object antracyclineAdministeredComm) {
		return findByProperty(ANTRACYCLINE_ADMINISTERED_COMM, antracyclineAdministeredComm);
	}

	public List findByTreatmentRelatedToxicity(Object treatmentRelatedToxicity) {
		return findByProperty(TREATMENT_RELATED_TOXICITY, treatmentRelatedToxicity);
	}

	public List findByTreatmentRelatedToxicityComm(Object treatmentRelatedToxicityComm) {
		return findByProperty(TREATMENT_RELATED_TOXICITY_COMM, treatmentRelatedToxicityComm);
	}

	public List findByBenignBreastDisease(Object benignBreastDisease) {
		return findByProperty(BENIGN_BREAST_DISEASE, benignBreastDisease);
	}

	public List findByPriorThoracicRt(Object priorThoracicRt) {
		return findByProperty(PRIOR_THORACIC_RT, priorThoracicRt);
	}

	public List findByMutations(Object mutations) {
		return findByProperty(MUTATIONS, mutations);
	}

	public List findByHxRenalFail(Object hxRenalFail) {
		return findByProperty(HX_RENAL_FAIL, hxRenalFail);
	}

	public List findByHxVhl(Object hxVhl) {
		return findByProperty(HX_VHL, hxVhl);
	}

	public List findByHxPrevCancer(Object hxPrevCancer) {
		return findByProperty(HX_PREV_CANCER, hxPrevCancer);
	}

	public List findByCurrentSmoker(Object currentSmoker) {
		return findByProperty(CURRENT_SMOKER, currentSmoker);
	}

	public List findByNoYrSmoked(Object noYrSmoked) {
		return findByProperty(NO_YR_SMOKED, noYrSmoked);
	}

	public List findByNoPackSmokePday(Object noPackSmokePday) {
		return findByProperty(NO_PACK_SMOKE_PDAY, noPackSmokePday);
	}

	public List findByPastSurgHx(Object pastSurgHx) {
		return findByProperty(PAST_SURG_HX, pastSurgHx);
	}

	public List findByNoPriorAbdominalSur(Object noPriorAbdominalSur) {
		return findByProperty(NO_PRIOR_ABDOMINAL_SUR, noPriorAbdominalSur);
	}

	public List findByCigPackYear(Object cigPackYear) {
		return findByProperty(CIG_PACK_YEAR, cigPackYear);
	}

	public List findByHypertention(Object hypertention) {
		return findByProperty(HYPERTENTION, hypertention);
	}

	public List findByPulmHypertn(Object pulmHypertn) {
		return findByProperty(PULM_HYPERTN, pulmHypertn);
	}

	public List findByDiabetes(Object diabetes) {
		return findByProperty(DIABETES, diabetes);
	}

	public List findByDiabCtrl(Object diabCtrl) {
		return findByProperty(DIAB_CTRL, diabCtrl);
	}

	public List findByDialysis(Object dialysis) {
		return findByProperty(DIALYSIS, dialysis);
	}

	public List findByHemoglobinLst(Object hemoglobinLst) {
		return findByProperty(HEMOGLOBIN_LST, hemoglobinLst);
	}

	public List findByCopd(Object copd) {
		return findByProperty(COPD, copd);
	}

	public List findByHistGenSynBone(Object histGenSynBone) {
		return findByProperty(HIST_GEN_SYN_BONE, histGenSynBone);
	}

	public List findByHistSarcoma(Object histSarcoma) {
		return findByProperty(HIST_SARCOMA, histSarcoma);
	}

	public List findByHistMass(Object histMass) {
		return findByProperty(HIST_MASS, histMass);
	}

	public List findByHistPain(Object histPain) {
		return findByProperty(HIST_PAIN, histPain);
	}

	public List findByHistPathFracture(Object histPathFracture) {
		return findByProperty(HIST_PATH_FRACTURE, histPathFracture);
	}

	public List findByPriorChemoCurativeNo(Object priorChemoCurativeNo) {
		return findByProperty(PRIOR_CHEMO_CURATIVE_NO, priorChemoCurativeNo);
	}

	public List findByPriorChemoPalliativeNo(Object priorChemoPalliativeNo) {
		return findByProperty(PRIOR_CHEMO_PALLIATIVE_NO, priorChemoPalliativeNo);
	}

	public List findByPriorRadioCuraNo(Object priorRadioCuraNo) {
		return findByProperty(PRIOR_RADIO_CURA_NO, priorRadioCuraNo);
	}

	public List findByPriorRadioPalliativeNo(Object priorRadioPalliativeNo) {
		return findByProperty(PRIOR_RADIO_PALLIATIVE_NO, priorRadioPalliativeNo);
	}

	public List findByPriorSurgeryNo(Object priorSurgeryNo) {
		return findByProperty(PRIOR_SURGERY_NO, priorSurgeryNo);
	}

	public List findByPriorCongInherSyndrone(Object priorCongInherSyndrone) {
		return findByProperty(PRIOR_CONG_INHER_SYNDRONE, priorCongInherSyndrone);
	}

	public List findByRadioTherapyExp(Object radioTherapyExp) {
		return findByProperty(RADIO_THERAPY_EXP, radioTherapyExp);
	}

	public List findByNoYrQuitSmoke(Object noYrQuitSmoke) {
		return findByProperty(NO_YR_QUIT_SMOKE, noYrQuitSmoke);
	}

	public List findByPersonalMedicalHistoryComments(Object personalMedicalHistoryComments) {
		return findByProperty(PERSONAL_MEDICAL_HISTORY_COMMENTS, personalMedicalHistoryComments);
	}

	public List findByOtherHistory(Object otherHistory) {
		return findByProperty(OTHER_HISTORY, otherHistory);
	}

	public List findByTraumaHx(Object traumaHx) {
		return findByProperty(TRAUMA_HX, traumaHx);
	}

	public List findByRtHx(Object rtHx) {
		return findByProperty(RT_HX, rtHx);
	}

	public List findByToxicChemicals(Object toxicChemicals) {
		return findByProperty(TOXIC_CHEMICALS, toxicChemicals);
	}

	public List findByAdequatePreviousSurgery(Object adequatePreviousSurgery) {
		return findByProperty(ADEQUATE_PREVIOUS_SURGERY, adequatePreviousSurgery);
	}

	public List findByClinicalPresentation(Object clinicalPresentation) {
		return findByProperty(CLINICAL_PRESENTATION, clinicalPresentation);
	}

	public List findByIncidentalFinding(Object incidentalFinding) {
		return findByProperty(INCIDENTAL_FINDING, incidentalFinding);
	}

	public List findByBmi(Object bmi) {
		return findByProperty(BMI, bmi);
	}

	public List findByCalciumLevel(Object calciumLevel) {
		return findByProperty(CALCIUM_LEVEL, calciumLevel);
	}

	public List findByCadmiumLevel(Object cadmiumLevel) {
		return findByProperty(CADMIUM_LEVEL, cadmiumLevel);
	}

	public List findByProstatitis(Object prostatitis) {
		return findByProperty(PROSTATITIS, prostatitis);
	}

	public List findAll() {
		log.debug("finding all PersonalMedicalHistory instances");
		try {
			String queryString = "from PersonalMedicalHistory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PersonalMedicalHistory merge(PersonalMedicalHistory detachedInstance) {
		log.debug("merging PersonalMedicalHistory instance");
		try {
			PersonalMedicalHistory result = (PersonalMedicalHistory) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PersonalMedicalHistory instance) {
		log.debug("attaching dirty PersonalMedicalHistory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PersonalMedicalHistory instance) {
		log.debug("attaching clean PersonalMedicalHistory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
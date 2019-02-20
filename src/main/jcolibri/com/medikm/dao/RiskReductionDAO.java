package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.RiskReduction;

/**
 * A data access object (DAO) providing persistence and search support for
 * RiskReduction entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.RiskReduction
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class RiskReductionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(RiskReductionDAO.class);
	// property constants
	public static final String RISK_REDUCTION_CONC = "riskReductionConc";
	public static final String RISK_REDUCTION_COUNSELING = "riskReductionCounseling";
	public static final String LIFETIME_RISK_OF_BC = "lifetimeRiskOfBc";
	public static final String MODIFIED_GAIL_MODEL_WOMEN35_YAGE = "modifiedGailModelWomen35YAge";
	public static final String BC_RISK5YR = "bcRisk5yr";
	public static final String LIFE_EXPECTANCY = "lifeExpectancy";
	public static final String CONTRA_TO_TAMO_OR_ROLO = "contraToTamoOrRolo";
	public static final String PATIENT_DESIRES_RISK_RED_THERAPY = "patientDesiresRiskRedTherapy";
	public static final String RISK_REDUCTION_MASTECTOMY_DESIRED = "riskReductionMastectomyDesired";
	public static final String RISK_RED_BILAT_SAL_OOPH_DESIRED = "riskRedBilatSalOophDesired";
	public static final String BENEFIT_RATIO_TAMOXIFENE = "benefitRatioTamoxifene";
	public static final String BASELINE_GYNECOLOGICA_ASSESSMENT = "baselineGynecologicaAssessment";
	public static final String BASELINE_GYNECOLOGICA_ASSESSMENT_COMM = "baselineGynecologicaAssessmentComm";
	public static final String CLINICAL_TRIAL = "clinicalTrial";
	public static final String ROU_FOLLOW_UP_AS_CLINICALLY_INDICATED = "rouFollowUpAsClinicallyIndicated";
	public static final String ANNUAL_GYNECOLOGIC_ASSESSMENT = "annualGynecologicAssessment";
	public static final String VISION_PROBLEMS = "visionProblems";
	public static final String OPHTALMOLOGY_EXAM = "ophtalmologyExam";
	public static final String RALOXIFENE_RELATED_SYMTOMS = "raloxifeneRelatedSymtoms";
	public static final String ABNORMAL_VAGINAL_BLEEDING = "abnormalVaginalBleeding";
	public static final String ENDOMETRIAL_CANCER = "endometrialCancer";
	public static final String ENDOMETRIAL_PATHOLOGY_FOUND = "endometrialPathologyFound";
	public static final String HISTERECTOMY_ENDO_PATH_REL_RR_THEREPY = "histerectomyEndoPathRelRrTherepy";
	public static final String REIN_RR_THERAPY_FOLLOW_HISTERECTOMY = "reinRrTherapyFollowHisterectomy";
	public static final String RR_THERAPY_DISCONTINUED = "rrTherapyDiscontinued";
	public static final String RR_THERAPY_RESUMED = "rrTherapyResumed";
	public static final String RR_THERAPY_COMPLICATIONS = "rrTherapyComplications";
	public static final String RR_THERAPY_COMPLICATIONS_COMM = "rrTherapyComplicationsComm";
	public static final String PROLONGED_IMMOBILIZATION = "prolongedImmobilization";
	public static final String RR_THERAPY_DISCONTINUED_THERAPY = "rrTherapyDiscontinuedTherapy";

	public void save(RiskReduction transientInstance) {
		log.debug("saving RiskReduction instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RiskReduction persistentInstance) {
		log.debug("deleting RiskReduction instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RiskReduction findById(com.medikm.dto.RiskReductionId id) {
		log.debug("getting RiskReduction instance with id: " + id);
		try {
			RiskReduction instance = (RiskReduction) getSession().get("com.medikm.dto.RiskReduction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RiskReduction instance) {
		log.debug("finding RiskReduction instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.RiskReduction").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RiskReduction instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from RiskReduction as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRiskReductionConc(Object riskReductionConc) {
		return findByProperty(RISK_REDUCTION_CONC, riskReductionConc);
	}

	public List findByRiskReductionCounseling(Object riskReductionCounseling) {
		return findByProperty(RISK_REDUCTION_COUNSELING, riskReductionCounseling);
	}

	public List findByLifetimeRiskOfBc(Object lifetimeRiskOfBc) {
		return findByProperty(LIFETIME_RISK_OF_BC, lifetimeRiskOfBc);
	}

	public List findByModifiedGailModelWomen35YAge(Object modifiedGailModelWomen35YAge) {
		return findByProperty(MODIFIED_GAIL_MODEL_WOMEN35_YAGE, modifiedGailModelWomen35YAge);
	}

	public List findByBcRisk5yr(Object bcRisk5yr) {
		return findByProperty(BC_RISK5YR, bcRisk5yr);
	}

	public List findByLifeExpectancy(Object lifeExpectancy) {
		return findByProperty(LIFE_EXPECTANCY, lifeExpectancy);
	}

	public List findByContraToTamoOrRolo(Object contraToTamoOrRolo) {
		return findByProperty(CONTRA_TO_TAMO_OR_ROLO, contraToTamoOrRolo);
	}

	public List findByPatientDesiresRiskRedTherapy(Object patientDesiresRiskRedTherapy) {
		return findByProperty(PATIENT_DESIRES_RISK_RED_THERAPY, patientDesiresRiskRedTherapy);
	}

	public List findByRiskReductionMastectomyDesired(Object riskReductionMastectomyDesired) {
		return findByProperty(RISK_REDUCTION_MASTECTOMY_DESIRED, riskReductionMastectomyDesired);
	}

	public List findByRiskRedBilatSalOophDesired(Object riskRedBilatSalOophDesired) {
		return findByProperty(RISK_RED_BILAT_SAL_OOPH_DESIRED, riskRedBilatSalOophDesired);
	}

	public List findByBenefitRatioTamoxifene(Object benefitRatioTamoxifene) {
		return findByProperty(BENEFIT_RATIO_TAMOXIFENE, benefitRatioTamoxifene);
	}

	public List findByBaselineGynecologicaAssessment(Object baselineGynecologicaAssessment) {
		return findByProperty(BASELINE_GYNECOLOGICA_ASSESSMENT, baselineGynecologicaAssessment);
	}

	public List findByBaselineGynecologicaAssessmentComm(Object baselineGynecologicaAssessmentComm) {
		return findByProperty(BASELINE_GYNECOLOGICA_ASSESSMENT_COMM, baselineGynecologicaAssessmentComm);
	}

	public List findByClinicalTrial(Object clinicalTrial) {
		return findByProperty(CLINICAL_TRIAL, clinicalTrial);
	}

	public List findByRouFollowUpAsClinicallyIndicated(Object rouFollowUpAsClinicallyIndicated) {
		return findByProperty(ROU_FOLLOW_UP_AS_CLINICALLY_INDICATED, rouFollowUpAsClinicallyIndicated);
	}

	public List findByAnnualGynecologicAssessment(Object annualGynecologicAssessment) {
		return findByProperty(ANNUAL_GYNECOLOGIC_ASSESSMENT, annualGynecologicAssessment);
	}

	public List findByVisionProblems(Object visionProblems) {
		return findByProperty(VISION_PROBLEMS, visionProblems);
	}

	public List findByOphtalmologyExam(Object ophtalmologyExam) {
		return findByProperty(OPHTALMOLOGY_EXAM, ophtalmologyExam);
	}

	public List findByRaloxifeneRelatedSymtoms(Object raloxifeneRelatedSymtoms) {
		return findByProperty(RALOXIFENE_RELATED_SYMTOMS, raloxifeneRelatedSymtoms);
	}

	public List findByAbnormalVaginalBleeding(Object abnormalVaginalBleeding) {
		return findByProperty(ABNORMAL_VAGINAL_BLEEDING, abnormalVaginalBleeding);
	}

	public List findByEndometrialCancer(Object endometrialCancer) {
		return findByProperty(ENDOMETRIAL_CANCER, endometrialCancer);
	}

	public List findByEndometrialPathologyFound(Object endometrialPathologyFound) {
		return findByProperty(ENDOMETRIAL_PATHOLOGY_FOUND, endometrialPathologyFound);
	}

	public List findByHisterectomyEndoPathRelRrTherepy(Object histerectomyEndoPathRelRrTherepy) {
		return findByProperty(HISTERECTOMY_ENDO_PATH_REL_RR_THEREPY, histerectomyEndoPathRelRrTherepy);
	}

	public List findByReinRrTherapyFollowHisterectomy(Object reinRrTherapyFollowHisterectomy) {
		return findByProperty(REIN_RR_THERAPY_FOLLOW_HISTERECTOMY, reinRrTherapyFollowHisterectomy);
	}

	public List findByRrTherapyDiscontinued(Object rrTherapyDiscontinued) {
		return findByProperty(RR_THERAPY_DISCONTINUED, rrTherapyDiscontinued);
	}

	public List findByRrTherapyResumed(Object rrTherapyResumed) {
		return findByProperty(RR_THERAPY_RESUMED, rrTherapyResumed);
	}

	public List findByRrTherapyComplications(Object rrTherapyComplications) {
		return findByProperty(RR_THERAPY_COMPLICATIONS, rrTherapyComplications);
	}

	public List findByRrTherapyComplicationsComm(Object rrTherapyComplicationsComm) {
		return findByProperty(RR_THERAPY_COMPLICATIONS_COMM, rrTherapyComplicationsComm);
	}

	public List findByProlongedImmobilization(Object prolongedImmobilization) {
		return findByProperty(PROLONGED_IMMOBILIZATION, prolongedImmobilization);
	}

	public List findByRrTherapyDiscontinuedTherapy(Object rrTherapyDiscontinuedTherapy) {
		return findByProperty(RR_THERAPY_DISCONTINUED_THERAPY, rrTherapyDiscontinuedTherapy);
	}

	public List findAll() {
		log.debug("finding all RiskReduction instances");
		try {
			String queryString = "from RiskReduction";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RiskReduction merge(RiskReduction detachedInstance) {
		log.debug("merging RiskReduction instance");
		try {
			RiskReduction result = (RiskReduction) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RiskReduction instance) {
		log.debug("attaching dirty RiskReduction instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RiskReduction instance) {
		log.debug("attaching clean RiskReduction instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
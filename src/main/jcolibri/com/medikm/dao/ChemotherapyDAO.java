package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Chemotherapy;

/**
 * A data access object (DAO) providing persistence and search support for
 * Chemotherapy entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.Chemotherapy
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ChemotherapyDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ChemotherapyDAO.class);
	// property constants
	public static final String BASE_LINE_MEGA_SCAN = "baseLineMegaScan";
	public static final String BASE_LINE_MEGA_SCAN_COMM = "baseLineMegaScanComm";
	public static final String PRETREATMENT_WEIGHT = "pretreatmentWeight";
	public static final String POST_TREATMENT_WEIGHT = "postTreatmentWeight";
	public static final String CTPY_ROUTE = "ctpyRoute";
	public static final String CTP_DOSE = "ctpDose";
	public static final String DOSE_REDUCTION_NEEDED = "doseReductionNeeded";
	public static final String NO_CYCLES_ADMINISTERED = "noCyclesAdministered";
	public static final String ENROLLED_CLINICAL_TRIAL = "enrolledClinicalTrial";
	public static final String ELIGIBLE_CLINICAL_TRIAL = "eligibleClinicalTrial";
	public static final String SIDE_EFFECTS_EXPERIENCED = "sideEffectsExperienced";
	public static final String SIDE_EFFECTS_EXPERIENCED_COMM = "sideEffectsExperiencedComm";
	public static final String ALLERGIC_EVENTS = "allergicEvents";
	public static final String ALLERGIC_EVENTS_COMM = "allergicEventsComm";
	public static final String ANTRACYCLINES_ADMINISTERED = "antracyclinesAdministered";
	public static final String ANTRACYCLINES_ADMINISTERED_DOSE = "antracyclinesAdministeredDose";
	public static final String HOSPITALIZATION_TOXICITY_DURING_TREATMENT = "hospitalizationToxicityDuringTreatment";
	public static final String NEUROTOXICITY_IMPAIRS_ACTIVITIES_DAILY_LIVING = "neurotoxicityImpairsActivitiesDailyLiving";
	public static final String CARDIOTOXICITY = "cardiotoxicity";
	public static final String CARDIOTOXICITY_COMM = "cardiotoxicityComm";
	public static final String POST_CHEMO_MAGA_SCAN = "postChemoMagaScan";
	public static final String POST_CHEMO_MAGA_SCAN_COMM = "postChemoMagaScanComm";
	public static final String REASON_STOPPING_CTPY = "reasonStoppingCtpy";
	public static final String PRETREATMENT_PLATELET_COUNT = "pretreatmentPlateletCount";
	public static final String PRETREATMENT_PLATELET_COUNT_COMM = "pretreatmentPlateletCountComm";
	public static final String TREATMENT_RELATED_ANEMIA = "treatmentRelatedAnemia";
	public static final String TREATMENT_RELATED_NEUTROPENIA = "treatmentRelatedNeutropenia";
	public static final String TREATMENT_RELATED_TROMBOCYTOPENIA = "treatmentRelatedTrombocytopenia";
	public static final String TREATMENT_RELATED_LYMPHOCYTOPENIA = "treatmentRelatedLymphocytopenia";
	public static final String PALLIATIVE_LINE = "palliativeLine";
	public static final String CHEMO_RESPONSE = "chemoResponse";
	public static final String RADIOSENSITISING = "radiosensitising";
	public static final String CHEMO_STOP_REASON = "chemoStopReason";
	public static final String CHEMO_INTENSION = "chemoIntension";
	public static final String CHEMO_COMPID = "chemoCompid";

	public void save(Chemotherapy transientInstance) {
		log.debug("saving Chemotherapy instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Chemotherapy persistentInstance) {
		log.debug("deleting Chemotherapy instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Chemotherapy findById(com.medikm.dto.ChemotherapyId id) {
		log.debug("getting Chemotherapy instance with id: " + id);
		try {
			Chemotherapy instance = (Chemotherapy) getSession().get("com.medikm.dto.Chemotherapy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Chemotherapy instance) {
		log.debug("finding Chemotherapy instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Chemotherapy").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Chemotherapy instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Chemotherapy as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBaseLineMegaScan(Object baseLineMegaScan) {
		return findByProperty(BASE_LINE_MEGA_SCAN, baseLineMegaScan);
	}

	public List findByBaseLineMegaScanComm(Object baseLineMegaScanComm) {
		return findByProperty(BASE_LINE_MEGA_SCAN_COMM, baseLineMegaScanComm);
	}

	public List findByPretreatmentWeight(Object pretreatmentWeight) {
		return findByProperty(PRETREATMENT_WEIGHT, pretreatmentWeight);
	}

	public List findByPostTreatmentWeight(Object postTreatmentWeight) {
		return findByProperty(POST_TREATMENT_WEIGHT, postTreatmentWeight);
	}

	public List findByCtpyRoute(Object ctpyRoute) {
		return findByProperty(CTPY_ROUTE, ctpyRoute);
	}

	public List findByCtpDose(Object ctpDose) {
		return findByProperty(CTP_DOSE, ctpDose);
	}

	public List findByDoseReductionNeeded(Object doseReductionNeeded) {
		return findByProperty(DOSE_REDUCTION_NEEDED, doseReductionNeeded);
	}

	public List findByNoCyclesAdministered(Object noCyclesAdministered) {
		return findByProperty(NO_CYCLES_ADMINISTERED, noCyclesAdministered);
	}

	public List findByEnrolledClinicalTrial(Object enrolledClinicalTrial) {
		return findByProperty(ENROLLED_CLINICAL_TRIAL, enrolledClinicalTrial);
	}

	public List findByEligibleClinicalTrial(Object eligibleClinicalTrial) {
		return findByProperty(ELIGIBLE_CLINICAL_TRIAL, eligibleClinicalTrial);
	}

	public List findBySideEffectsExperienced(Object sideEffectsExperienced) {
		return findByProperty(SIDE_EFFECTS_EXPERIENCED, sideEffectsExperienced);
	}

	public List findBySideEffectsExperiencedComm(Object sideEffectsExperiencedComm) {
		return findByProperty(SIDE_EFFECTS_EXPERIENCED_COMM, sideEffectsExperiencedComm);
	}

	public List findByAllergicEvents(Object allergicEvents) {
		return findByProperty(ALLERGIC_EVENTS, allergicEvents);
	}

	public List findByAllergicEventsComm(Object allergicEventsComm) {
		return findByProperty(ALLERGIC_EVENTS_COMM, allergicEventsComm);
	}

	public List findByAntracyclinesAdministered(Object antracyclinesAdministered) {
		return findByProperty(ANTRACYCLINES_ADMINISTERED, antracyclinesAdministered);
	}

	public List findByAntracyclinesAdministeredDose(Object antracyclinesAdministeredDose) {
		return findByProperty(ANTRACYCLINES_ADMINISTERED_DOSE, antracyclinesAdministeredDose);
	}

	public List findByHospitalizationToxicityDuringTreatment(Object hospitalizationToxicityDuringTreatment) {
		return findByProperty(HOSPITALIZATION_TOXICITY_DURING_TREATMENT, hospitalizationToxicityDuringTreatment);
	}

	public List findByNeurotoxicityImpairsActivitiesDailyLiving(Object neurotoxicityImpairsActivitiesDailyLiving) {
		return findByProperty(NEUROTOXICITY_IMPAIRS_ACTIVITIES_DAILY_LIVING, neurotoxicityImpairsActivitiesDailyLiving);
	}

	public List findByCardiotoxicity(Object cardiotoxicity) {
		return findByProperty(CARDIOTOXICITY, cardiotoxicity);
	}

	public List findByCardiotoxicityComm(Object cardiotoxicityComm) {
		return findByProperty(CARDIOTOXICITY_COMM, cardiotoxicityComm);
	}

	public List findByPostChemoMagaScan(Object postChemoMagaScan) {
		return findByProperty(POST_CHEMO_MAGA_SCAN, postChemoMagaScan);
	}

	public List findByPostChemoMagaScanComm(Object postChemoMagaScanComm) {
		return findByProperty(POST_CHEMO_MAGA_SCAN_COMM, postChemoMagaScanComm);
	}

	public List findByReasonStoppingCtpy(Object reasonStoppingCtpy) {
		return findByProperty(REASON_STOPPING_CTPY, reasonStoppingCtpy);
	}

	public List findByPretreatmentPlateletCount(Object pretreatmentPlateletCount) {
		return findByProperty(PRETREATMENT_PLATELET_COUNT, pretreatmentPlateletCount);
	}

	public List findByPretreatmentPlateletCountComm(Object pretreatmentPlateletCountComm) {
		return findByProperty(PRETREATMENT_PLATELET_COUNT_COMM, pretreatmentPlateletCountComm);
	}

	public List findByTreatmentRelatedAnemia(Object treatmentRelatedAnemia) {
		return findByProperty(TREATMENT_RELATED_ANEMIA, treatmentRelatedAnemia);
	}

	public List findByTreatmentRelatedNeutropenia(Object treatmentRelatedNeutropenia) {
		return findByProperty(TREATMENT_RELATED_NEUTROPENIA, treatmentRelatedNeutropenia);
	}

	public List findByTreatmentRelatedTrombocytopenia(Object treatmentRelatedTrombocytopenia) {
		return findByProperty(TREATMENT_RELATED_TROMBOCYTOPENIA, treatmentRelatedTrombocytopenia);
	}

	public List findByTreatmentRelatedLymphocytopenia(Object treatmentRelatedLymphocytopenia) {
		return findByProperty(TREATMENT_RELATED_LYMPHOCYTOPENIA, treatmentRelatedLymphocytopenia);
	}

	public List findByPalliativeLine(Object palliativeLine) {
		return findByProperty(PALLIATIVE_LINE, palliativeLine);
	}

	public List findByChemoResponse(Object chemoResponse) {
		return findByProperty(CHEMO_RESPONSE, chemoResponse);
	}

	public List findByRadiosensitising(Object radiosensitising) {
		return findByProperty(RADIOSENSITISING, radiosensitising);
	}

	public List findByChemoStopReason(Object chemoStopReason) {
		return findByProperty(CHEMO_STOP_REASON, chemoStopReason);
	}

	public List findByChemoIntension(Object chemoIntension) {
		return findByProperty(CHEMO_INTENSION, chemoIntension);
	}

	public List findByChemoCompid(Object chemoCompid) {
		return findByProperty(CHEMO_COMPID, chemoCompid);
	}

	public List findAll() {
		log.debug("finding all Chemotherapy instances");
		try {
			String queryString = "from Chemotherapy";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Chemotherapy merge(Chemotherapy detachedInstance) {
		log.debug("merging Chemotherapy instance");
		try {
			Chemotherapy result = (Chemotherapy) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Chemotherapy instance) {
		log.debug("attaching dirty Chemotherapy instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Chemotherapy instance) {
		log.debug("attaching clean Chemotherapy instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
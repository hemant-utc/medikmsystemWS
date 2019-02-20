package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Followup;

/**
 * A data access object (DAO) providing persistence and search support for
 * Followup entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Followup
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class FollowupDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(FollowupDAO.class);
	// property constants
	public static final String YEARS_PAST_TREATMENT = "yearsPastTreatment";
	public static final String HISTORY_PHYSICAL_MONTHS = "historyPhysicalMonths";
	public static final String MAMMOGRAM_MONTHS = "mammogramMonths";
	public static final String ANN_GYNEC_ASSESS_WOMEN_TAMO = "annGynecAssessWomenTamo";
	public static final String BONE_MINERAL_DENSITY = "boneMineralDensity";
	public static final String BONE_MINERAL_DENSITY_COMM = "boneMineralDensityComm";
	public static final String ADHERENCE_ADJUVANT_ENDOCRINE_THERAPY = "adherenceAdjuvantEndocrineTherapy";
	public static final String CHEST_WALL_PAIN = "chestWallPain";
	public static final String DIS_STATUS = "disStatus";
	public static final String CLINICAL_RESPONSE = "clinicalResponse";

	public void save(Followup transientInstance) {
		log.debug("saving Followup instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Followup persistentInstance) {
		log.debug("deleting Followup instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Followup findById(java.lang.Integer id) {
		log.debug("getting Followup instance with id: " + id);
		try {
			Followup instance = (Followup) getSession().get("com.medikm.dto.Followup", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Followup instance) {
		log.debug("finding Followup instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Followup").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Followup instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Followup as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByYearsPastTreatment(Object yearsPastTreatment) {
		return findByProperty(YEARS_PAST_TREATMENT, yearsPastTreatment);
	}

	public List findByHistoryPhysicalMonths(Object historyPhysicalMonths) {
		return findByProperty(HISTORY_PHYSICAL_MONTHS, historyPhysicalMonths);
	}

	public List findByMammogramMonths(Object mammogramMonths) {
		return findByProperty(MAMMOGRAM_MONTHS, mammogramMonths);
	}

	public List findByAnnGynecAssessWomenTamo(Object annGynecAssessWomenTamo) {
		return findByProperty(ANN_GYNEC_ASSESS_WOMEN_TAMO, annGynecAssessWomenTamo);
	}

	public List findByBoneMineralDensity(Object boneMineralDensity) {
		return findByProperty(BONE_MINERAL_DENSITY, boneMineralDensity);
	}

	public List findByBoneMineralDensityComm(Object boneMineralDensityComm) {
		return findByProperty(BONE_MINERAL_DENSITY_COMM, boneMineralDensityComm);
	}

	public List findByAdherenceAdjuvantEndocrineTherapy(Object adherenceAdjuvantEndocrineTherapy) {
		return findByProperty(ADHERENCE_ADJUVANT_ENDOCRINE_THERAPY, adherenceAdjuvantEndocrineTherapy);
	}

	public List findByChestWallPain(Object chestWallPain) {
		return findByProperty(CHEST_WALL_PAIN, chestWallPain);
	}

	public List findByDisStatus(Object disStatus) {
		return findByProperty(DIS_STATUS, disStatus);
	}

	public List findByClinicalResponse(Object clinicalResponse) {
		return findByProperty(CLINICAL_RESPONSE, clinicalResponse);
	}

	public List findAll() {
		log.debug("finding all Followup instances");
		try {
			String queryString = "from Followup";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Followup merge(Followup detachedInstance) {
		log.debug("merging Followup instance");
		try {
			Followup result = (Followup) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Followup instance) {
		log.debug("attaching dirty Followup instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Followup instance) {
		log.debug("attaching clean Followup instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
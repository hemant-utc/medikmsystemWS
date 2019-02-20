package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Encounter;

/**
 * A data access object (DAO) providing persistence and search support for
 * Encounter entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Encounter
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class EncounterDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EncounterDAO.class);
	// property constants
	public static final String FACILITY_ID = "facilityId";
	public static final String PROVIDER_NOTE = "providerNote";
	public static final String EN_HEIGHT = "enHeight";
	public static final String EN_WEIGHT = "enWeight";
	public static final String PREGNANCY_STATUS = "pregnancyStatus";
	public static final String MONTH_PREGNANCY = "monthPregnancy";
	public static final String CLINICAL_TRIAL_OFFERED = "clinicalTrialOffered";
	public static final String CLINICAL_TRIAL_DECLINED = "clinicalTrialDeclined";
	public static final String EN_BMI = "enBmi";
	public static final String RELATIVE_INTRAOPERATIVE_FINDINGS = "relativeIntraoperativeFindings";
	public static final String IMAGING_FINDINGS = "imagingFindings";

	public void save(Encounter transientInstance) {
		log.debug("saving Encounter instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Encounter persistentInstance) {
		log.debug("deleting Encounter instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Encounter findById(java.lang.Integer id) {
		log.debug("getting Encounter instance with id: " + id);
		try {
			Encounter instance = (Encounter) getSession().get("com.medikm.dto.Encounter", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Encounter instance) {
		log.debug("finding Encounter instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Encounter").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Encounter instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Encounter as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFacilityId(Object facilityId) {
		return findByProperty(FACILITY_ID, facilityId);
	}

	public List findByProviderNote(Object providerNote) {
		return findByProperty(PROVIDER_NOTE, providerNote);
	}

	public List findByEnHeight(Object enHeight) {
		return findByProperty(EN_HEIGHT, enHeight);
	}

	public List findByEnWeight(Object enWeight) {
		return findByProperty(EN_WEIGHT, enWeight);
	}

	public List findByPregnancyStatus(Object pregnancyStatus) {
		return findByProperty(PREGNANCY_STATUS, pregnancyStatus);
	}

	public List findByMonthPregnancy(Object monthPregnancy) {
		return findByProperty(MONTH_PREGNANCY, monthPregnancy);
	}

	public List findByClinicalTrialOffered(Object clinicalTrialOffered) {
		return findByProperty(CLINICAL_TRIAL_OFFERED, clinicalTrialOffered);
	}

	public List findByClinicalTrialDeclined(Object clinicalTrialDeclined) {
		return findByProperty(CLINICAL_TRIAL_DECLINED, clinicalTrialDeclined);
	}

	public List findByEnBmi(Object enBmi) {
		return findByProperty(EN_BMI, enBmi);
	}

	public List findByRelativeIntraoperativeFindings(Object relativeIntraoperativeFindings) {
		return findByProperty(RELATIVE_INTRAOPERATIVE_FINDINGS, relativeIntraoperativeFindings);
	}

	public List findByImagingFindings(Object imagingFindings) {
		return findByProperty(IMAGING_FINDINGS, imagingFindings);
	}

	public List findAll() {
		log.debug("finding all Encounter instances");
		try {
			String queryString = "from Encounter";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Encounter merge(Encounter detachedInstance) {
		log.debug("merging Encounter instance");
		try {
			Encounter result = (Encounter) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Encounter instance) {
		log.debug("attaching dirty Encounter instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Encounter instance) {
		log.debug("attaching clean Encounter instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
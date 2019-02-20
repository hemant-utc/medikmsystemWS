package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ClinicalTrial;

/**
 * A data access object (DAO) providing persistence and search support for
 * ClinicalTrial entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.ClinicalTrial
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ClinicalTrialDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ClinicalTrialDAO.class);
	// property constants
	public static final String TRIAL_NAME = "trialName";
	public static final String TRIAL_DESCRIPTION = "trialDescription";
	public static final String TRIAL_PHASE = "trialPhase";
	public static final String TRIAL_PRIMARY_OBJECTIVE = "trialPrimaryObjective";
	public static final String TRIAL_STATUS = "trialStatus";
	public static final String INCLUSION_CRITERIA = "inclusionCriteria";
	public static final String EXCLUSION_CRITERIA = "exclusionCriteria";
	public static final String SPONSOR = "sponsor";
	public static final String TRIAL_PARTICIPATING_SITES = "trialParticipatingSites";

	public void save(ClinicalTrial transientInstance) {
		log.debug("saving ClinicalTrial instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ClinicalTrial persistentInstance) {
		log.debug("deleting ClinicalTrial instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ClinicalTrial findById(java.lang.Integer id) {
		log.debug("getting ClinicalTrial instance with id: " + id);
		try {
			ClinicalTrial instance = (ClinicalTrial) getSession().get("com.medikm.dto.ClinicalTrial", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ClinicalTrial instance) {
		log.debug("finding ClinicalTrial instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.ClinicalTrial").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ClinicalTrial instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ClinicalTrial as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTrialName(Object trialName) {
		return findByProperty(TRIAL_NAME, trialName);
	}

	public List findByTrialDescription(Object trialDescription) {
		return findByProperty(TRIAL_DESCRIPTION, trialDescription);
	}

	public List findByTrialPhase(Object trialPhase) {
		return findByProperty(TRIAL_PHASE, trialPhase);
	}

	public List findByTrialPrimaryObjective(Object trialPrimaryObjective) {
		return findByProperty(TRIAL_PRIMARY_OBJECTIVE, trialPrimaryObjective);
	}

	public List findByTrialStatus(Object trialStatus) {
		return findByProperty(TRIAL_STATUS, trialStatus);
	}

	public List findByInclusionCriteria(Object inclusionCriteria) {
		return findByProperty(INCLUSION_CRITERIA, inclusionCriteria);
	}

	public List findByExclusionCriteria(Object exclusionCriteria) {
		return findByProperty(EXCLUSION_CRITERIA, exclusionCriteria);
	}

	public List findBySponsor(Object sponsor) {
		return findByProperty(SPONSOR, sponsor);
	}

	public List findByTrialParticipatingSites(Object trialParticipatingSites) {
		return findByProperty(TRIAL_PARTICIPATING_SITES, trialParticipatingSites);
	}

	public List findAll() {
		log.debug("finding all ClinicalTrial instances");
		try {
			String queryString = "from ClinicalTrial";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ClinicalTrial merge(ClinicalTrial detachedInstance) {
		log.debug("merging ClinicalTrial instance");
		try {
			ClinicalTrial result = (ClinicalTrial) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ClinicalTrial instance) {
		log.debug("attaching dirty ClinicalTrial instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ClinicalTrial instance) {
		log.debug("attaching clean ClinicalTrial instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.EncounterGuideline;

/**
 * A data access object (DAO) providing persistence and search support for
 * EncounterGuideline entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.EncounterGuideline
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class EncounterGuidelineDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EncounterGuidelineDAO.class);
	// property constants
	public static final String GUIDELINE_MET = "guidelineMet";
	public static final String GUIDELINE_MET_COMM = "guidelineMetComm";

	public void save(EncounterGuideline transientInstance) {
		log.debug("saving EncounterGuideline instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EncounterGuideline persistentInstance) {
		log.debug("deleting EncounterGuideline instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EncounterGuideline findById(com.medikm.dto.EncounterGuidelineId id) {
		log.debug("getting EncounterGuideline instance with id: " + id);
		try {
			EncounterGuideline instance = (EncounterGuideline) getSession().get("com.medikm.dto.EncounterGuideline",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EncounterGuideline instance) {
		log.debug("finding EncounterGuideline instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.EncounterGuideline")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EncounterGuideline instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from EncounterGuideline as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGuidelineMet(Object guidelineMet) {
		return findByProperty(GUIDELINE_MET, guidelineMet);
	}

	public List findByGuidelineMetComm(Object guidelineMetComm) {
		return findByProperty(GUIDELINE_MET_COMM, guidelineMetComm);
	}

	public List findAll() {
		log.debug("finding all EncounterGuideline instances");
		try {
			String queryString = "from EncounterGuideline";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EncounterGuideline merge(EncounterGuideline detachedInstance) {
		log.debug("merging EncounterGuideline instance");
		try {
			EncounterGuideline result = (EncounterGuideline) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EncounterGuideline instance) {
		log.debug("attaching dirty EncounterGuideline instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EncounterGuideline instance) {
		log.debug("attaching clean EncounterGuideline instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
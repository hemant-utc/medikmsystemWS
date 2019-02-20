package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.EncounterClinicalTrial;

/**
 * A data access object (DAO) providing persistence and search support for
 * EncounterClinicalTrial entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.EncounterClinicalTrial
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class EncounterClinicalTrialDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EncounterClinicalTrialDAO.class);

	// property constants

	public void save(EncounterClinicalTrial transientInstance) {
		log.debug("saving EncounterClinicalTrial instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EncounterClinicalTrial persistentInstance) {
		log.debug("deleting EncounterClinicalTrial instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EncounterClinicalTrial findById(com.medikm.dto.EncounterClinicalTrialId id) {
		log.debug("getting EncounterClinicalTrial instance with id: " + id);
		try {
			EncounterClinicalTrial instance = (EncounterClinicalTrial) getSession()
					.get("com.medikm.dto.EncounterClinicalTrial", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EncounterClinicalTrial instance) {
		log.debug("finding EncounterClinicalTrial instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.EncounterClinicalTrial")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EncounterClinicalTrial instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from EncounterClinicalTrial as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EncounterClinicalTrial instances");
		try {
			String queryString = "from EncounterClinicalTrial";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EncounterClinicalTrial merge(EncounterClinicalTrial detachedInstance) {
		log.debug("merging EncounterClinicalTrial instance");
		try {
			EncounterClinicalTrial result = (EncounterClinicalTrial) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EncounterClinicalTrial instance) {
		log.debug("attaching dirty EncounterClinicalTrial instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EncounterClinicalTrial instance) {
		log.debug("attaching clean EncounterClinicalTrial instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
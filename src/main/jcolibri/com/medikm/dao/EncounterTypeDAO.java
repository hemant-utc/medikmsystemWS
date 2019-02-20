package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.EncounterType;

/**
 * A data access object (DAO) providing persistence and search support for
 * EncounterType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.EncounterType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class EncounterTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EncounterTypeDAO.class);
	// property constants
	public static final String ENAME = "ename";

	public void save(EncounterType transientInstance) {
		log.debug("saving EncounterType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EncounterType persistentInstance) {
		log.debug("deleting EncounterType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EncounterType findById(java.lang.Integer id) {
		log.debug("getting EncounterType instance with id: " + id);
		try {
			EncounterType instance = (EncounterType) getSession().get("com.medikm.dto.EncounterType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EncounterType instance) {
		log.debug("finding EncounterType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.EncounterType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EncounterType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from EncounterType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEname(Object ename) {
		return findByProperty(ENAME, ename);
	}

	public List findAll() {
		log.debug("finding all EncounterType instances");
		try {
			String queryString = "from EncounterType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EncounterType merge(EncounterType detachedInstance) {
		log.debug("merging EncounterType instance");
		try {
			EncounterType result = (EncounterType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EncounterType instance) {
		log.debug("attaching dirty EncounterType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EncounterType instance) {
		log.debug("attaching clean EncounterType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
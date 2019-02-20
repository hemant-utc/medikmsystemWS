package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TrialType;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrialType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.TrialType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TrialTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TrialTypeDAO.class);
	// property constants
	public static final String TNAME = "tname";

	public void save(TrialType transientInstance) {
		log.debug("saving TrialType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrialType persistentInstance) {
		log.debug("deleting TrialType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrialType findById(java.lang.Integer id) {
		log.debug("getting TrialType instance with id: " + id);
		try {
			TrialType instance = (TrialType) getSession().get("com.medikm.dto.TrialType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TrialType instance) {
		log.debug("finding TrialType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TrialType").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TrialType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TrialType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTname(Object tname) {
		return findByProperty(TNAME, tname);
	}

	public List findAll() {
		log.debug("finding all TrialType instances");
		try {
			String queryString = "from TrialType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TrialType merge(TrialType detachedInstance) {
		log.debug("merging TrialType instance");
		try {
			TrialType result = (TrialType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrialType instance) {
		log.debug("attaching dirty TrialType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrialType instance) {
		log.debug("attaching clean TrialType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
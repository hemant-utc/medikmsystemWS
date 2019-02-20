package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.RrAgent;

/**
 * A data access object (DAO) providing persistence and search support for
 * RrAgent entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.RrAgent
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class RrAgentDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(RrAgentDAO.class);
	// property constants
	public static final String ANAME = "aname";

	public void save(RrAgent transientInstance) {
		log.debug("saving RrAgent instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RrAgent persistentInstance) {
		log.debug("deleting RrAgent instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RrAgent findById(java.lang.Integer id) {
		log.debug("getting RrAgent instance with id: " + id);
		try {
			RrAgent instance = (RrAgent) getSession().get("com.medikm.dto.RrAgent", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RrAgent instance) {
		log.debug("finding RrAgent instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.RrAgent").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RrAgent instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from RrAgent as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAname(Object aname) {
		return findByProperty(ANAME, aname);
	}

	public List findAll() {
		log.debug("finding all RrAgent instances");
		try {
			String queryString = "from RrAgent";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RrAgent merge(RrAgent detachedInstance) {
		log.debug("merging RrAgent instance");
		try {
			RrAgent result = (RrAgent) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RrAgent instance) {
		log.debug("attaching dirty RrAgent instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RrAgent instance) {
		log.debug("attaching clean RrAgent instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
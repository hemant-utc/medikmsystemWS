package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ChemoAgent;

/**
 * A data access object (DAO) providing persistence and search support for
 * ChemoAgent entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.ChemoAgent
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ChemoAgentDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ChemoAgentDAO.class);
	// property constants
	public static final String ANAME = "aname";

	public void save(ChemoAgent transientInstance) {
		log.debug("saving ChemoAgent instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ChemoAgent persistentInstance) {
		log.debug("deleting ChemoAgent instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ChemoAgent findById(java.lang.Integer id) {
		log.debug("getting ChemoAgent instance with id: " + id);
		try {
			ChemoAgent instance = (ChemoAgent) getSession().get("com.medikm.dto.ChemoAgent", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ChemoAgent instance) {
		log.debug("finding ChemoAgent instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.ChemoAgent").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ChemoAgent instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ChemoAgent as model where model." + propertyName + "= ?";
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
		log.debug("finding all ChemoAgent instances");
		try {
			String queryString = "from ChemoAgent";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ChemoAgent merge(ChemoAgent detachedInstance) {
		log.debug("merging ChemoAgent instance");
		try {
			ChemoAgent result = (ChemoAgent) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ChemoAgent instance) {
		log.debug("attaching dirty ChemoAgent instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ChemoAgent instance) {
		log.debug("attaching clean ChemoAgent instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
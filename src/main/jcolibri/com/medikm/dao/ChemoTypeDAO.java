package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ChemoType;

/**
 * A data access object (DAO) providing persistence and search support for
 * ChemoType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.ChemoType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ChemoTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ChemoTypeDAO.class);
	// property constants
	public static final String CH_NAME = "chName";

	public void save(ChemoType transientInstance) {
		log.debug("saving ChemoType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ChemoType persistentInstance) {
		log.debug("deleting ChemoType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ChemoType findById(java.lang.Integer id) {
		log.debug("getting ChemoType instance with id: " + id);
		try {
			ChemoType instance = (ChemoType) getSession().get("com.medikm.dto.ChemoType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ChemoType instance) {
		log.debug("finding ChemoType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.ChemoType").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ChemoType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ChemoType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByChName(Object chName) {
		return findByProperty(CH_NAME, chName);
	}

	public List findAll() {
		log.debug("finding all ChemoType instances");
		try {
			String queryString = "from ChemoType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ChemoType merge(ChemoType detachedInstance) {
		log.debug("merging ChemoType instance");
		try {
			ChemoType result = (ChemoType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ChemoType instance) {
		log.debug("attaching dirty ChemoType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ChemoType instance) {
		log.debug("attaching clean ChemoType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
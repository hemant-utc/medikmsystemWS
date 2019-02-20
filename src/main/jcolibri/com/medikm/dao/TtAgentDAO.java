package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TtAgent;

/**
 * A data access object (DAO) providing persistence and search support for
 * TtAgent entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.TtAgent
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TtAgentDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TtAgentDAO.class);
	// property constants
	public static final String ANAME = "aname";

	public void save(TtAgent transientInstance) {
		log.debug("saving TtAgent instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TtAgent persistentInstance) {
		log.debug("deleting TtAgent instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TtAgent findById(java.lang.Integer id) {
		log.debug("getting TtAgent instance with id: " + id);
		try {
			TtAgent instance = (TtAgent) getSession().get("com.medikm.dto.TtAgent", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TtAgent instance) {
		log.debug("finding TtAgent instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TtAgent").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TtAgent instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TtAgent as model where model." + propertyName + "= ?";
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
		log.debug("finding all TtAgent instances");
		try {
			String queryString = "from TtAgent";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TtAgent merge(TtAgent detachedInstance) {
		log.debug("merging TtAgent instance");
		try {
			TtAgent result = (TtAgent) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TtAgent instance) {
		log.debug("attaching dirty TtAgent instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TtAgent instance) {
		log.debug("attaching clean TtAgent instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
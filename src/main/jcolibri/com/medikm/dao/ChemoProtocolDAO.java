package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ChemoProtocol;

/**
 * A data access object (DAO) providing persistence and search support for
 * ChemoProtocol entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.ChemoProtocol
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ChemoProtocolDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ChemoProtocolDAO.class);
	// property constants
	public static final String PNAME = "pname";

	public void save(ChemoProtocol transientInstance) {
		log.debug("saving ChemoProtocol instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ChemoProtocol persistentInstance) {
		log.debug("deleting ChemoProtocol instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ChemoProtocol findById(java.lang.Integer id) {
		log.debug("getting ChemoProtocol instance with id: " + id);
		try {
			ChemoProtocol instance = (ChemoProtocol) getSession().get("com.medikm.dto.ChemoProtocol", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ChemoProtocol instance) {
		log.debug("finding ChemoProtocol instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.ChemoProtocol").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ChemoProtocol instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ChemoProtocol as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPname(Object pname) {
		return findByProperty(PNAME, pname);
	}

	public List findAll() {
		log.debug("finding all ChemoProtocol instances");
		try {
			String queryString = "from ChemoProtocol";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ChemoProtocol merge(ChemoProtocol detachedInstance) {
		log.debug("merging ChemoProtocol instance");
		try {
			ChemoProtocol result = (ChemoProtocol) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ChemoProtocol instance) {
		log.debug("attaching dirty ChemoProtocol instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ChemoProtocol instance) {
		log.debug("attaching clean ChemoProtocol instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
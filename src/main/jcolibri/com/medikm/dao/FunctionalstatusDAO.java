package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Functionalstatus;

/**
 * A data access object (DAO) providing persistence and search support for
 * Functionalstatus entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.Functionalstatus
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class FunctionalstatusDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(FunctionalstatusDAO.class);
	// property constants
	public static final String STATUS = "status";

	public void save(Functionalstatus transientInstance) {
		log.debug("saving Functionalstatus instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Functionalstatus persistentInstance) {
		log.debug("deleting Functionalstatus instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Functionalstatus findById(java.lang.Integer id) {
		log.debug("getting Functionalstatus instance with id: " + id);
		try {
			Functionalstatus instance = (Functionalstatus) getSession().get("com.medikm.dto.Functionalstatus", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Functionalstatus instance) {
		log.debug("finding Functionalstatus instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Functionalstatus").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Functionalstatus instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Functionalstatus as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all Functionalstatus instances");
		try {
			String queryString = "from Functionalstatus";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Functionalstatus merge(Functionalstatus detachedInstance) {
		log.debug("merging Functionalstatus instance");
		try {
			Functionalstatus result = (Functionalstatus) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Functionalstatus instance) {
		log.debug("attaching dirty Functionalstatus instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Functionalstatus instance) {
		log.debug("attaching clean Functionalstatus instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
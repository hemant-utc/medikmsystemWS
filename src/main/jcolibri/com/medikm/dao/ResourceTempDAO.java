package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ResourceTemp;

/**
 * A data access object (DAO) providing persistence and search support for
 * ResourceTemp entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.ResourceTemp
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ResourceTempDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ResourceTempDAO.class);

	// property constants

	public void save(ResourceTemp transientInstance) {
		log.debug("saving ResourceTemp instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ResourceTemp persistentInstance) {
		log.debug("deleting ResourceTemp instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ResourceTemp findById(java.lang.Integer id) {
		log.debug("getting ResourceTemp instance with id: " + id);
		try {
			ResourceTemp instance = (ResourceTemp) getSession().get("com.medikm.dto.ResourceTemp", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ResourceTemp instance) {
		log.debug("finding ResourceTemp instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.ResourceTemp").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ResourceTemp instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ResourceTemp as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ResourceTemp instances");
		try {
			String queryString = "from ResourceTemp";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ResourceTemp merge(ResourceTemp detachedInstance) {
		log.debug("merging ResourceTemp instance");
		try {
			ResourceTemp result = (ResourceTemp) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ResourceTemp instance) {
		log.debug("attaching dirty ResourceTemp instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ResourceTemp instance) {
		log.debug("attaching clean ResourceTemp instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
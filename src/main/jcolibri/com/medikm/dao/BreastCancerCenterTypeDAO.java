package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.BreastCancerCenterType;

/**
 * A data access object (DAO) providing persistence and search support for
 * BreastCancerCenterType entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.BreastCancerCenterType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class BreastCancerCenterTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(BreastCancerCenterTypeDAO.class);
	// property constants
	public static final String CENTER_TYPE_DESCRIPTION = "centerTypeDescription";

	public void save(BreastCancerCenterType transientInstance) {
		log.debug("saving BreastCancerCenterType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BreastCancerCenterType persistentInstance) {
		log.debug("deleting BreastCancerCenterType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BreastCancerCenterType findById(java.lang.Integer id) {
		log.debug("getting BreastCancerCenterType instance with id: " + id);
		try {
			BreastCancerCenterType instance = (BreastCancerCenterType) getSession()
					.get("com.medikm.dto.BreastCancerCenterType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BreastCancerCenterType instance) {
		log.debug("finding BreastCancerCenterType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.BreastCancerCenterType")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding BreastCancerCenterType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from BreastCancerCenterType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCenterTypeDescription(Object centerTypeDescription) {
		return findByProperty(CENTER_TYPE_DESCRIPTION, centerTypeDescription);
	}

	public List findAll() {
		log.debug("finding all BreastCancerCenterType instances");
		try {
			String queryString = "from BreastCancerCenterType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BreastCancerCenterType merge(BreastCancerCenterType detachedInstance) {
		log.debug("merging BreastCancerCenterType instance");
		try {
			BreastCancerCenterType result = (BreastCancerCenterType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BreastCancerCenterType instance) {
		log.debug("attaching dirty BreastCancerCenterType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BreastCancerCenterType instance) {
		log.debug("attaching clean BreastCancerCenterType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CancerSubType;

/**
 * A data access object (DAO) providing persistence and search support for
 * CancerSubType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CancerSubType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CancerSubTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CancerSubTypeDAO.class);
	// property constants
	public static final String NAME = "name";

	public void save(CancerSubType transientInstance) {
		log.debug("saving CancerSubType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CancerSubType persistentInstance) {
		log.debug("deleting CancerSubType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CancerSubType findById(java.lang.Integer id) {
		log.debug("getting CancerSubType instance with id: " + id);
		try {
			CancerSubType instance = (CancerSubType) getSession().get("com.medikm.dto.CancerSubType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CancerSubType instance) {
		log.debug("finding CancerSubType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CancerSubType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CancerSubType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CancerSubType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findAll() {
		log.debug("finding all CancerSubType instances");
		try {
			String queryString = "from CancerSubType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CancerSubType merge(CancerSubType detachedInstance) {
		log.debug("merging CancerSubType instance");
		try {
			CancerSubType result = (CancerSubType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CancerSubType instance) {
		log.debug("attaching dirty CancerSubType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CancerSubType instance) {
		log.debug("attaching clean CancerSubType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
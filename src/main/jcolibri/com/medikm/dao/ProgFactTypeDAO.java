package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ProgFactType;

/**
 * A data access object (DAO) providing persistence and search support for
 * ProgFactType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.ProgFactType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ProgFactTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ProgFactTypeDAO.class);
	// property constants
	public static final String PFNAME = "pfname";

	public void save(ProgFactType transientInstance) {
		log.debug("saving ProgFactType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ProgFactType persistentInstance) {
		log.debug("deleting ProgFactType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProgFactType findById(java.lang.Integer id) {
		log.debug("getting ProgFactType instance with id: " + id);
		try {
			ProgFactType instance = (ProgFactType) getSession().get("com.medikm.dto.ProgFactType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ProgFactType instance) {
		log.debug("finding ProgFactType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.ProgFactType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ProgFactType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ProgFactType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPfname(Object pfname) {
		return findByProperty(PFNAME, pfname);
	}

	public List findAll() {
		log.debug("finding all ProgFactType instances");
		try {
			String queryString = "from ProgFactType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ProgFactType merge(ProgFactType detachedInstance) {
		log.debug("merging ProgFactType instance");
		try {
			ProgFactType result = (ProgFactType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ProgFactType instance) {
		log.debug("attaching dirty ProgFactType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProgFactType instance) {
		log.debug("attaching clean ProgFactType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
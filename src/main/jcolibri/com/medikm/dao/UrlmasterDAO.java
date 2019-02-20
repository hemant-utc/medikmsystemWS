package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Urlmaster;

/**
 * A data access object (DAO) providing persistence and search support for
 * Urlmaster entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Urlmaster
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class UrlmasterDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(UrlmasterDAO.class);
	// property constants
	public static final String PAGE_URL = "pageUrl";
	public static final String PAGE_NAME = "pageName";

	public void save(Urlmaster transientInstance) {
		log.debug("saving Urlmaster instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Urlmaster persistentInstance) {
		log.debug("deleting Urlmaster instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Urlmaster findById(java.lang.Long id) {
		log.debug("getting Urlmaster instance with id: " + id);
		try {
			Urlmaster instance = (Urlmaster) getSession().get("com.medikm.dto.Urlmaster", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Urlmaster instance) {
		log.debug("finding Urlmaster instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Urlmaster").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Urlmaster instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Urlmaster as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPageUrl(Object pageUrl) {
		return findByProperty(PAGE_URL, pageUrl);
	}

	public List findByPageName(Object pageName) {
		return findByProperty(PAGE_NAME, pageName);
	}

	public List findAll() {
		log.debug("finding all Urlmaster instances");
		try {
			String queryString = "from Urlmaster";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Urlmaster merge(Urlmaster detachedInstance) {
		log.debug("merging Urlmaster instance");
		try {
			Urlmaster result = (Urlmaster) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Urlmaster instance) {
		log.debug("attaching dirty Urlmaster instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Urlmaster instance) {
		log.debug("attaching clean Urlmaster instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
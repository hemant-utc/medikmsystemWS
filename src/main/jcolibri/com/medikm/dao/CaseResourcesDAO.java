package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CaseResources;

/**
 * A data access object (DAO) providing persistence and search support for
 * CaseResources entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CaseResources
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CaseResourcesDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CaseResourcesDAO.class);

	// property constants

	public void save(CaseResources transientInstance) {
		log.debug("saving CaseResources instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CaseResources persistentInstance) {
		log.debug("deleting CaseResources instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CaseResources findById(java.lang.Integer id) {
		log.debug("getting CaseResources instance with id: " + id);
		try {
			CaseResources instance = (CaseResources) getSession().get("com.medikm.dto.CaseResources", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CaseResources instance) {
		log.debug("finding CaseResources instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CaseResources").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CaseResources instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CaseResources as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CaseResources instances");
		try {
			String queryString = "from CaseResources";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CaseResources merge(CaseResources detachedInstance) {
		log.debug("merging CaseResources instance");
		try {
			CaseResources result = (CaseResources) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CaseResources instance) {
		log.debug("attaching dirty CaseResources instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CaseResources instance) {
		log.debug("attaching clean CaseResources instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
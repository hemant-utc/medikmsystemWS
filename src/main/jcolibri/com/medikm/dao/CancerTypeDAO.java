package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CancerType;

/**
 * A data access object (DAO) providing persistence and search support for
 * CancerType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.CancerType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CancerTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CancerTypeDAO.class);
	// property constants
	public static final String CNAME = "cname";
	public static final String COMMENTS = "comments";

	public void save(CancerType transientInstance) {
		log.debug("saving CancerType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CancerType persistentInstance) {
		log.debug("deleting CancerType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CancerType findById(java.lang.Integer id) {
		log.debug("getting CancerType instance with id: " + id);
		try {
			CancerType instance = (CancerType) getSession().get("com.medikm.dto.CancerType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CancerType instance) {
		log.debug("finding CancerType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CancerType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CancerType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CancerType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCname(Object cname) {
		return findByProperty(CNAME, cname);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findAll() {
		log.debug("finding all CancerType instances");
		try {
			String queryString = "from CancerType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CancerType merge(CancerType detachedInstance) {
		log.debug("merging CancerType instance");
		try {
			CancerType result = (CancerType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CancerType instance) {
		log.debug("attaching dirty CancerType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CancerType instance) {
		log.debug("attaching clean CancerType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
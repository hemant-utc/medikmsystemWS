package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.PathologyType;

/**
 * A data access object (DAO) providing persistence and search support for
 * PathologyType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.PathologyType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class PathologyTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PathologyTypeDAO.class);
	// property constants
	public static final String PNAME = "pname";

	public void save(PathologyType transientInstance) {
		log.debug("saving PathologyType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PathologyType persistentInstance) {
		log.debug("deleting PathologyType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PathologyType findById(java.lang.Integer id) {
		log.debug("getting PathologyType instance with id: " + id);
		try {
			PathologyType instance = (PathologyType) getSession().get("com.medikm.dto.PathologyType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PathologyType instance) {
		log.debug("finding PathologyType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.PathologyType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PathologyType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PathologyType as model where model." + propertyName + "= ?";
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
		log.debug("finding all PathologyType instances");
		try {
			String queryString = "from PathologyType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PathologyType merge(PathologyType detachedInstance) {
		log.debug("merging PathologyType instance");
		try {
			PathologyType result = (PathologyType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PathologyType instance) {
		log.debug("attaching dirty PathologyType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PathologyType instance) {
		log.debug("attaching clean PathologyType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
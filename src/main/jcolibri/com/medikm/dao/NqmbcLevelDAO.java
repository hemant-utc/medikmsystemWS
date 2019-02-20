package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.NqmbcLevel;

/**
 * A data access object (DAO) providing persistence and search support for
 * NqmbcLevel entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.NqmbcLevel
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class NqmbcLevelDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(NqmbcLevelDAO.class);
	// property constants
	public static final String LNAME = "lname";

	public void save(NqmbcLevel transientInstance) {
		log.debug("saving NqmbcLevel instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(NqmbcLevel persistentInstance) {
		log.debug("deleting NqmbcLevel instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NqmbcLevel findById(java.lang.Integer id) {
		log.debug("getting NqmbcLevel instance with id: " + id);
		try {
			NqmbcLevel instance = (NqmbcLevel) getSession().get("com.medikm.dto.NqmbcLevel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(NqmbcLevel instance) {
		log.debug("finding NqmbcLevel instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.NqmbcLevel").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding NqmbcLevel instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from NqmbcLevel as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLname(Object lname) {
		return findByProperty(LNAME, lname);
	}

	public List findAll() {
		log.debug("finding all NqmbcLevel instances");
		try {
			String queryString = "from NqmbcLevel";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public NqmbcLevel merge(NqmbcLevel detachedInstance) {
		log.debug("merging NqmbcLevel instance");
		try {
			NqmbcLevel result = (NqmbcLevel) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(NqmbcLevel instance) {
		log.debug("attaching dirty NqmbcLevel instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NqmbcLevel instance) {
		log.debug("attaching clean NqmbcLevel instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.LesionType;

/**
 * A data access object (DAO) providing persistence and search support for
 * LesionType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.LesionType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class LesionTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(LesionTypeDAO.class);
	// property constants
	public static final String LNAME = "lname";

	public void save(LesionType transientInstance) {
		log.debug("saving LesionType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LesionType persistentInstance) {
		log.debug("deleting LesionType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LesionType findById(java.lang.Integer id) {
		log.debug("getting LesionType instance with id: " + id);
		try {
			LesionType instance = (LesionType) getSession().get("com.medikm.dto.LesionType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LesionType instance) {
		log.debug("finding LesionType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.LesionType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding LesionType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from LesionType as model where model." + propertyName + "= ?";
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
		log.debug("finding all LesionType instances");
		try {
			String queryString = "from LesionType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LesionType merge(LesionType detachedInstance) {
		log.debug("merging LesionType instance");
		try {
			LesionType result = (LesionType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LesionType instance) {
		log.debug("attaching dirty LesionType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LesionType instance) {
		log.debug("attaching clean LesionType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
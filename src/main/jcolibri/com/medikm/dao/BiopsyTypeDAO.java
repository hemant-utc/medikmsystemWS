package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.BiopsyType;

/**
 * A data access object (DAO) providing persistence and search support for
 * BiopsyType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.BiopsyType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class BiopsyTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(BiopsyTypeDAO.class);
	// property constants
	public static final String BNAME = "bname";

	public void save(BiopsyType transientInstance) {
		log.debug("saving BiopsyType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BiopsyType persistentInstance) {
		log.debug("deleting BiopsyType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BiopsyType findById(java.lang.Integer id) {
		log.debug("getting BiopsyType instance with id: " + id);
		try {
			BiopsyType instance = (BiopsyType) getSession().get("com.medikm.dto.BiopsyType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BiopsyType instance) {
		log.debug("finding BiopsyType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.BiopsyType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding BiopsyType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from BiopsyType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBname(Object bname) {
		return findByProperty(BNAME, bname);
	}

	public List findAll() {
		log.debug("finding all BiopsyType instances");
		try {
			String queryString = "from BiopsyType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BiopsyType merge(BiopsyType detachedInstance) {
		log.debug("merging BiopsyType instance");
		try {
			BiopsyType result = (BiopsyType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BiopsyType instance) {
		log.debug("attaching dirty BiopsyType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BiopsyType instance) {
		log.debug("attaching clean BiopsyType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
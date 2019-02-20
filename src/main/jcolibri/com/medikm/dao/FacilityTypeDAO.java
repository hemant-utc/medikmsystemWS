package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.FacilityType;

/**
 * A data access object (DAO) providing persistence and search support for
 * FacilityType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.FacilityType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class FacilityTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(FacilityTypeDAO.class);
	// property constants
	public static final String FNAME = "fname";

	public void save(FacilityType transientInstance) {
		log.debug("saving FacilityType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FacilityType persistentInstance) {
		log.debug("deleting FacilityType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FacilityType findById(java.lang.Integer id) {
		log.debug("getting FacilityType instance with id: " + id);
		try {
			FacilityType instance = (FacilityType) getSession().get("com.medikm.dto.FacilityType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FacilityType instance) {
		log.debug("finding FacilityType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.FacilityType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding FacilityType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from FacilityType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFname(Object fname) {
		return findByProperty(FNAME, fname);
	}

	public List findAll() {
		log.debug("finding all FacilityType instances");
		try {
			String queryString = "from FacilityType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FacilityType merge(FacilityType detachedInstance) {
		log.debug("merging FacilityType instance");
		try {
			FacilityType result = (FacilityType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FacilityType instance) {
		log.debug("attaching dirty FacilityType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FacilityType instance) {
		log.debug("attaching clean FacilityType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
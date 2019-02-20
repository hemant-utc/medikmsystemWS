package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.SurgeryType;

/**
 * A data access object (DAO) providing persistence and search support for
 * SurgeryType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.SurgeryType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class SurgeryTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(SurgeryTypeDAO.class);
	// property constants
	public static final String SNAME = "sname";

	public void save(SurgeryType transientInstance) {
		log.debug("saving SurgeryType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SurgeryType persistentInstance) {
		log.debug("deleting SurgeryType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SurgeryType findById(java.lang.Integer id) {
		log.debug("getting SurgeryType instance with id: " + id);
		try {
			SurgeryType instance = (SurgeryType) getSession().get("com.medikm.dto.SurgeryType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SurgeryType instance) {
		log.debug("finding SurgeryType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.SurgeryType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding SurgeryType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from SurgeryType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySname(Object sname) {
		return findByProperty(SNAME, sname);
	}

	public List findAll() {
		log.debug("finding all SurgeryType instances");
		try {
			String queryString = "from SurgeryType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SurgeryType merge(SurgeryType detachedInstance) {
		log.debug("merging SurgeryType instance");
		try {
			SurgeryType result = (SurgeryType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SurgeryType instance) {
		log.debug("attaching dirty SurgeryType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SurgeryType instance) {
		log.debug("attaching clean SurgeryType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
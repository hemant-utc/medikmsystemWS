package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.UserPropertiesInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserPropertiesInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.UserPropertiesInfo
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class UserPropertiesInfoDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(UserPropertiesInfoDAO.class);

	// property constants

	public void save(UserPropertiesInfo transientInstance) {
		log.debug("saving UserPropertiesInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UserPropertiesInfo persistentInstance) {
		log.debug("deleting UserPropertiesInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UserPropertiesInfo findById(java.lang.Integer id) {
		log.debug("getting UserPropertiesInfo instance with id: " + id);
		try {
			UserPropertiesInfo instance = (UserPropertiesInfo) getSession().get("com.medikm.dto.UserPropertiesInfo",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UserPropertiesInfo instance) {
		log.debug("finding UserPropertiesInfo instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.UserPropertiesInfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding UserPropertiesInfo instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from UserPropertiesInfo as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UserPropertiesInfo instances");
		try {
			String queryString = "from UserPropertiesInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UserPropertiesInfo merge(UserPropertiesInfo detachedInstance) {
		log.debug("merging UserPropertiesInfo instance");
		try {
			UserPropertiesInfo result = (UserPropertiesInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UserPropertiesInfo instance) {
		log.debug("attaching dirty UserPropertiesInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserPropertiesInfo instance) {
		log.debug("attaching clean UserPropertiesInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Userlog;

/**
 * A data access object (DAO) providing persistence and search support for
 * Userlog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Userlog
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class UserlogDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(UserlogDAO.class);
	// property constants
	public static final String ACTIVITY_NAME = "activityName";
	public static final String ACTIVITY_ID = "activityId";
	public static final String IP_ADDRESS = "ipAddress";

	public void save(Userlog transientInstance) {
		log.debug("saving Userlog instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Userlog persistentInstance) {
		log.debug("deleting Userlog instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Userlog findById(java.lang.Long id) {
		log.debug("getting Userlog instance with id: " + id);
		try {
			Userlog instance = (Userlog) getSession().get("com.medikm.dto.Userlog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Userlog instance) {
		log.debug("finding Userlog instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Userlog").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Userlog instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Userlog as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByActivityName(Object activityName) {
		return findByProperty(ACTIVITY_NAME, activityName);
	}

	public List findByActivityId(Object activityId) {
		return findByProperty(ACTIVITY_ID, activityId);
	}

	public List findByIpAddress(Object ipAddress) {
		return findByProperty(IP_ADDRESS, ipAddress);
	}

	public List findAll() {
		log.debug("finding all Userlog instances");
		try {
			String queryString = "from Userlog";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Userlog merge(Userlog detachedInstance) {
		log.debug("merging Userlog instance");
		try {
			Userlog result = (Userlog) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Userlog instance) {
		log.debug("attaching dirty Userlog instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Userlog instance) {
		log.debug("attaching clean Userlog instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
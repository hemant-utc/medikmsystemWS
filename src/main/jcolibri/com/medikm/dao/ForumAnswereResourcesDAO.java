package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ForumAnswereResources;

/**
 * A data access object (DAO) providing persistence and search support for
 * ForumAnswereResources entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dao.ForumAnswereResources
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ForumAnswereResourcesDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(ForumAnswereResourcesDAO.class);

	// property constants

	public void save(ForumAnswereResources transientInstance) {
		log.debug("saving ForumAnswereResources instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ForumAnswereResources persistentInstance) {
		log.debug("deleting ForumAnswereResources instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ForumAnswereResources findById(java.lang.Integer id) {
		log.debug("getting ForumAnswereResources instance with id: " + id);
		try {
			ForumAnswereResources instance = (ForumAnswereResources) getSession()
					.get("com.medikm.dto.ForumAnswereResources", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ForumAnswereResources instance) {
		log.debug("finding ForumAnswereResources instance by example");
		try {
			List results = getSession()
					.createCriteria("com.medikm.dto.ForumAnswereResources")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ForumAnswereResources instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ForumAnswereResources as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ForumAnswereResources instances");
		try {
			String queryString = "from ForumAnswereResources";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ForumAnswereResources merge(ForumAnswereResources detachedInstance) {
		log.debug("merging ForumAnswereResources instance");
		try {
			ForumAnswereResources result = (ForumAnswereResources) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ForumAnswereResources instance) {
		log.debug("attaching dirty ForumAnswereResources instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ForumAnswereResources instance) {
		log.debug("attaching clean ForumAnswereResources instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
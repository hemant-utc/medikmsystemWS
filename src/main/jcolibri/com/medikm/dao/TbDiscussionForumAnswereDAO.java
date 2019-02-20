package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TbDiscussionForumAnswere;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbDiscussionForumAnswere entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.medikm.dto.TbDiscussionForumAnswere
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TbDiscussionForumAnswereDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbDiscussionForumAnswereDAO.class);
	// property constants
	public static final String ANSWERE = "answere";
	public static final String RATIONAL_TEXT = "rationalText";

	public void save(TbDiscussionForumAnswere transientInstance) {
		log.debug("saving TbDiscussionForumAnswere instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbDiscussionForumAnswere persistentInstance) {
		log.debug("deleting TbDiscussionForumAnswere instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbDiscussionForumAnswere findById(java.lang.Integer id) {
		log.debug("getting TbDiscussionForumAnswere instance with id: " + id);
		try {
			TbDiscussionForumAnswere instance = (TbDiscussionForumAnswere) getSession()
					.get("com.medikm.dto.TbDiscussionForumAnswere", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbDiscussionForumAnswere instance) {
		log.debug("finding TbDiscussionForumAnswere instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TbDiscussionForumAnswere")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TbDiscussionForumAnswere instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TbDiscussionForumAnswere as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAnswere(Object answere) {
		return findByProperty(ANSWERE, answere);
	}

	public List findByRationalText(Object rationalText) {
		return findByProperty(RATIONAL_TEXT, rationalText);
	}

	public List findAll() {
		log.debug("finding all TbDiscussionForumAnswere instances");
		try {
			String queryString = "from TbDiscussionForumAnswere";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbDiscussionForumAnswere merge(TbDiscussionForumAnswere detachedInstance) {
		log.debug("merging TbDiscussionForumAnswere instance");
		try {
			TbDiscussionForumAnswere result = (TbDiscussionForumAnswere) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbDiscussionForumAnswere instance) {
		log.debug("attaching dirty TbDiscussionForumAnswere instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbDiscussionForumAnswere instance) {
		log.debug("attaching clean TbDiscussionForumAnswere instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.SolCategory;

/**
 * A data access object (DAO) providing persistence and search support for
 * SolCategory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.SolCategory
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class SolCategoryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(SolCategoryDAO.class);
	// property constants
	public static final String CATEGORY_NAME = "categoryName";

	public void save(SolCategory transientInstance) {
		log.debug("saving SolCategory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SolCategory persistentInstance) {
		log.debug("deleting SolCategory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SolCategory findById(java.lang.Integer id) {
		log.debug("getting SolCategory instance with id: " + id);
		try {
			SolCategory instance = (SolCategory) getSession().get("com.medikm.dto.SolCategory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SolCategory instance) {
		log.debug("finding SolCategory instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.SolCategory").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding SolCategory instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from SolCategory as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCategoryName(Object categoryName) {
		return findByProperty(CATEGORY_NAME, categoryName);
	}

	public List findAll() {
		log.debug("finding all SolCategory instances");
		try {
			String queryString = "from SolCategory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SolCategory merge(SolCategory detachedInstance) {
		log.debug("merging SolCategory instance");
		try {
			SolCategory result = (SolCategory) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SolCategory instance) {
		log.debug("attaching dirty SolCategory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SolCategory instance) {
		log.debug("attaching clean SolCategory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
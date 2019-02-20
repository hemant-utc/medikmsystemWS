package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.DiseaseStatus;

/**
 * A data access object (DAO) providing persistence and search support for
 * DiseaseStatus entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.DiseaseStatus
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class DiseaseStatusDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(DiseaseStatusDAO.class);
	// property constants
	public static final String DNAME = "dname";

	public void save(DiseaseStatus transientInstance) {
		log.debug("saving DiseaseStatus instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DiseaseStatus persistentInstance) {
		log.debug("deleting DiseaseStatus instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DiseaseStatus findById(java.lang.Integer id) {
		log.debug("getting DiseaseStatus instance with id: " + id);
		try {
			DiseaseStatus instance = (DiseaseStatus) getSession().get("com.medikm.dto.DiseaseStatus", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DiseaseStatus instance) {
		log.debug("finding DiseaseStatus instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.DiseaseStatus").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding DiseaseStatus instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from DiseaseStatus as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDname(Object dname) {
		return findByProperty(DNAME, dname);
	}

	public List findAll() {
		log.debug("finding all DiseaseStatus instances");
		try {
			String queryString = "from DiseaseStatus";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DiseaseStatus merge(DiseaseStatus detachedInstance) {
		log.debug("merging DiseaseStatus instance");
		try {
			DiseaseStatus result = (DiseaseStatus) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DiseaseStatus instance) {
		log.debug("attaching dirty DiseaseStatus instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DiseaseStatus instance) {
		log.debug("attaching clean DiseaseStatus instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
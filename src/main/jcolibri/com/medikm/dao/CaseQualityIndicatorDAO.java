package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CaseQualityIndicator;

/**
 * A data access object (DAO) providing persistence and search support for
 * CaseQualityIndicator entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CaseQualityIndicator
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CaseQualityIndicatorDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CaseQualityIndicatorDAO.class);
	// property constants
	public static final String ANSWER = "answer";

	public void save(CaseQualityIndicator transientInstance) {
		log.debug("saving CaseQualityIndicator instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CaseQualityIndicator persistentInstance) {
		log.debug("deleting CaseQualityIndicator instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CaseQualityIndicator findById(com.medikm.dto.CaseQualityIndicatorId id) {
		log.debug("getting CaseQualityIndicator instance with id: " + id);
		try {
			CaseQualityIndicator instance = (CaseQualityIndicator) getSession()
					.get("com.medikm.dto.CaseQualityIndicator", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CaseQualityIndicator instance) {
		log.debug("finding CaseQualityIndicator instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CaseQualityIndicator")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CaseQualityIndicator instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CaseQualityIndicator as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAnswer(Object answer) {
		return findByProperty(ANSWER, answer);
	}

	public List findAll() {
		log.debug("finding all CaseQualityIndicator instances");
		try {
			String queryString = "from CaseQualityIndicator";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CaseQualityIndicator merge(CaseQualityIndicator detachedInstance) {
		log.debug("merging CaseQualityIndicator instance");
		try {
			CaseQualityIndicator result = (CaseQualityIndicator) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CaseQualityIndicator instance) {
		log.debug("attaching dirty CaseQualityIndicator instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CaseQualityIndicator instance) {
		log.debug("attaching clean CaseQualityIndicator instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
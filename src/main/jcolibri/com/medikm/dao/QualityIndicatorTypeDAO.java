package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.QualityIndicatorType;

/**
 * A data access object (DAO) providing persistence and search support for
 * QualityIndicatorType entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.QualityIndicatorType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class QualityIndicatorTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(QualityIndicatorTypeDAO.class);
	// property constants
	public static final String INDICATOR_NAME = "indicatorName";

	public void save(QualityIndicatorType transientInstance) {
		log.debug("saving QualityIndicatorType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QualityIndicatorType persistentInstance) {
		log.debug("deleting QualityIndicatorType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QualityIndicatorType findById(java.lang.Integer id) {
		log.debug("getting QualityIndicatorType instance with id: " + id);
		try {
			QualityIndicatorType instance = (QualityIndicatorType) getSession()
					.get("com.medikm.dto.QualityIndicatorType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QualityIndicatorType instance) {
		log.debug("finding QualityIndicatorType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.QualityIndicatorType")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding QualityIndicatorType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from QualityIndicatorType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIndicatorName(Object indicatorName) {
		return findByProperty(INDICATOR_NAME, indicatorName);
	}

	public List findAll() {
		log.debug("finding all QualityIndicatorType instances");
		try {
			String queryString = "from QualityIndicatorType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QualityIndicatorType merge(QualityIndicatorType detachedInstance) {
		log.debug("merging QualityIndicatorType instance");
		try {
			QualityIndicatorType result = (QualityIndicatorType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QualityIndicatorType instance) {
		log.debug("attaching dirty QualityIndicatorType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QualityIndicatorType instance) {
		log.debug("attaching clean QualityIndicatorType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
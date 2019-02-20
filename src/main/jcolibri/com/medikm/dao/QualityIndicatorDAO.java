package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.QualityIndicator;

/**
 * A data access object (DAO) providing persistence and search support for
 * QualityIndicator entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.QualityIndicator
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class QualityIndicatorDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(QualityIndicatorDAO.class);
	// property constants
	public static final String DESCRIPTION = "description";
	public static final String OPTION1 = "option1";
	public static final String OPTION2 = "option2";
	public static final String OPTION3 = "option3";
	public static final String OPTION4 = "option4";

	public void save(QualityIndicator transientInstance) {
		log.debug("saving QualityIndicator instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QualityIndicator persistentInstance) {
		log.debug("deleting QualityIndicator instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QualityIndicator findById(java.lang.Integer id) {
		log.debug("getting QualityIndicator instance with id: " + id);
		try {
			QualityIndicator instance = (QualityIndicator) getSession().get("com.medikm.dto.QualityIndicator", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QualityIndicator instance) {
		log.debug("finding QualityIndicator instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.QualityIndicator").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding QualityIndicator instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from QualityIndicator as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByOption1(Object option1) {
		return findByProperty(OPTION1, option1);
	}

	public List findByOption2(Object option2) {
		return findByProperty(OPTION2, option2);
	}

	public List findByOption3(Object option3) {
		return findByProperty(OPTION3, option3);
	}

	public List findByOption4(Object option4) {
		return findByProperty(OPTION4, option4);
	}

	public List findAll() {
		log.debug("finding all QualityIndicator instances");
		try {
			String queryString = "from QualityIndicator";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QualityIndicator merge(QualityIndicator detachedInstance) {
		log.debug("merging QualityIndicator instance");
		try {
			QualityIndicator result = (QualityIndicator) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QualityIndicator instance) {
		log.debug("attaching dirty QualityIndicator instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QualityIndicator instance) {
		log.debug("attaching clean QualityIndicator instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
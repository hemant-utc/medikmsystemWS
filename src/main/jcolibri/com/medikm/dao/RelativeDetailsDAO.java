package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.RelativeDetails;

/**
 * A data access object (DAO) providing persistence and search support for
 * RelativeDetails entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.RelativeDetails
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class RelativeDetailsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(RelativeDetailsDAO.class);
	// property constants
	public static final String AGE_AT_DIAGNOSIS = "ageAtDiagnosis";
	public static final String AGE_AT_DEATH = "ageAtDeath";

	public void save(RelativeDetails transientInstance) {
		log.debug("saving RelativeDetails instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RelativeDetails persistentInstance) {
		log.debug("deleting RelativeDetails instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RelativeDetails findById(com.medikm.dto.RelativeDetailsId id) {
		log.debug("getting RelativeDetails instance with id: " + id);
		try {
			RelativeDetails instance = (RelativeDetails) getSession().get("com.medikm.dto.RelativeDetails", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RelativeDetails instance) {
		log.debug("finding RelativeDetails instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.RelativeDetails").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RelativeDetails instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from RelativeDetails as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAgeAtDiagnosis(Object ageAtDiagnosis) {
		return findByProperty(AGE_AT_DIAGNOSIS, ageAtDiagnosis);
	}

	public List findByAgeAtDeath(Object ageAtDeath) {
		return findByProperty(AGE_AT_DEATH, ageAtDeath);
	}

	public List findAll() {
		log.debug("finding all RelativeDetails instances");
		try {
			String queryString = "from RelativeDetails";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RelativeDetails merge(RelativeDetails detachedInstance) {
		log.debug("merging RelativeDetails instance");
		try {
			RelativeDetails result = (RelativeDetails) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RelativeDetails instance) {
		log.debug("attaching dirty RelativeDetails instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RelativeDetails instance) {
		log.debug("attaching clean RelativeDetails instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
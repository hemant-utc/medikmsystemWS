package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.PropertiesType;

/**
 * A data access object (DAO) providing persistence and search support for
 * PropertiesType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.PropertiesType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class PropertiesTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PropertiesTypeDAO.class);
	// property constants
	public static final String PROP_TYPE = "propType";

	public void save(PropertiesType transientInstance) {
		log.debug("saving PropertiesType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PropertiesType persistentInstance) {
		log.debug("deleting PropertiesType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PropertiesType findById(java.lang.Integer id) {
		log.debug("getting PropertiesType instance with id: " + id);
		try {
			PropertiesType instance = (PropertiesType) getSession().get("com.medikm.dto.PropertiesType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PropertiesType instance) {
		log.debug("finding PropertiesType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.PropertiesType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PropertiesType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PropertiesType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPropType(Object propType) {
		return findByProperty(PROP_TYPE, propType);
	}

	public List findAll() {
		log.debug("finding all PropertiesType instances");
		try {
			String queryString = "from PropertiesType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PropertiesType merge(PropertiesType detachedInstance) {
		log.debug("merging PropertiesType instance");
		try {
			PropertiesType result = (PropertiesType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PropertiesType instance) {
		log.debug("attaching dirty PropertiesType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PropertiesType instance) {
		log.debug("attaching clean PropertiesType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
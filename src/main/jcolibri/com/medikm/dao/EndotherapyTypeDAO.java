package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.EndotherapyType;

/**
 * A data access object (DAO) providing persistence and search support for
 * EndotherapyType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.EndotherapyType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class EndotherapyTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EndotherapyTypeDAO.class);
	// property constants
	public static final String ETNAME = "etname";

	public void save(EndotherapyType transientInstance) {
		log.debug("saving EndotherapyType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EndotherapyType persistentInstance) {
		log.debug("deleting EndotherapyType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EndotherapyType findById(java.lang.Integer id) {
		log.debug("getting EndotherapyType instance with id: " + id);
		try {
			EndotherapyType instance = (EndotherapyType) getSession().get("com.medikm.dto.EndotherapyType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EndotherapyType instance) {
		log.debug("finding EndotherapyType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.EndotherapyType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EndotherapyType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from EndotherapyType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEtname(Object etname) {
		return findByProperty(ETNAME, etname);
	}

	public List findAll() {
		log.debug("finding all EndotherapyType instances");
		try {
			String queryString = "from EndotherapyType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EndotherapyType merge(EndotherapyType detachedInstance) {
		log.debug("merging EndotherapyType instance");
		try {
			EndotherapyType result = (EndotherapyType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EndotherapyType instance) {
		log.debug("attaching dirty EndotherapyType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EndotherapyType instance) {
		log.debug("attaching clean EndotherapyType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
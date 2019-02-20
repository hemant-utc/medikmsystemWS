package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.RadiationType;

/**
 * A data access object (DAO) providing persistence and search support for
 * RadiationType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.RadiationType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class RadiationTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(RadiationTypeDAO.class);
	// property constants
	public static final String RNAME = "rname";

	public void save(RadiationType transientInstance) {
		log.debug("saving RadiationType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RadiationType persistentInstance) {
		log.debug("deleting RadiationType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RadiationType findById(java.lang.Integer id) {
		log.debug("getting RadiationType instance with id: " + id);
		try {
			RadiationType instance = (RadiationType) getSession().get(
					"com.medikm.dto.RadiationType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RadiationType instance) {
		log.debug("finding RadiationType instance by example");
		try {
			List results = getSession()
					.createCriteria("com.medikm.dto.RadiationType")
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
		log.debug("finding RadiationType instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from RadiationType as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRname(Object rname) {
		return findByProperty(RNAME, rname);
	}

	public List findAll() {
		log.debug("finding all RadiationType instances");
		try {
			String queryString = "from RadiationType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RadiationType merge(RadiationType detachedInstance) {
		log.debug("merging RadiationType instance");
		try {
			RadiationType result = (RadiationType) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RadiationType instance) {
		log.debug("attaching dirty RadiationType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RadiationType instance) {
		log.debug("attaching clean RadiationType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
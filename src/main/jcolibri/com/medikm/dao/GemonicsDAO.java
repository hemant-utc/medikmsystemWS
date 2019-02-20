package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Gemonics;

/**
 * A data access object (DAO) providing persistence and search support for
 * Gemonics entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Gemonics
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class GemonicsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(GemonicsDAO.class);
	// property constants
	public static final String GNAME = "gname";

	public void save(Gemonics transientInstance) {
		log.debug("saving Gemonics instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Gemonics persistentInstance) {
		log.debug("deleting Gemonics instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Gemonics findById(java.lang.Integer id) {
		log.debug("getting Gemonics instance with id: " + id);
		try {
			Gemonics instance = (Gemonics) getSession().get("com.medikm.dto.Gemonics", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Gemonics instance) {
		log.debug("finding Gemonics instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Gemonics").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Gemonics instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Gemonics as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGname(Object gname) {
		return findByProperty(GNAME, gname);
	}

	public List findAll() {
		log.debug("finding all Gemonics instances");
		try {
			String queryString = "from Gemonics";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Gemonics merge(Gemonics detachedInstance) {
		log.debug("merging Gemonics instance");
		try {
			Gemonics result = (Gemonics) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Gemonics instance) {
		log.debug("attaching dirty Gemonics instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Gemonics instance) {
		log.debug("attaching clean Gemonics instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Genetics;

/**
 * A data access object (DAO) providing persistence and search support for
 * Genetics entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Genetics
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class GeneticsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(GeneticsDAO.class);
	// property constants
	public static final String GN_NAME = "gnName";

	public void save(Genetics transientInstance) {
		log.debug("saving Genetics instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Genetics persistentInstance) {
		log.debug("deleting Genetics instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Genetics findById(java.lang.Integer id) {
		log.debug("getting Genetics instance with id: " + id);
		try {
			Genetics instance = (Genetics) getSession().get(
					"com.medikm.dto.Genetics", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Genetics instance) {
		log.debug("finding Genetics instance by example");
		try {
			List results = getSession()
					.createCriteria("com.medikm.dto.Genetics")
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
		log.debug("finding Genetics instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Genetics as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGnName(Object gnName) {
		return findByProperty(GN_NAME, gnName);
	}

	public List findAll() {
		log.debug("finding all Genetics instances");
		try {
			String queryString = "from Genetics";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Genetics merge(Genetics detachedInstance) {
		log.debug("merging Genetics instance");
		try {
			Genetics result = (Genetics) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Genetics instance) {
		log.debug("attaching dirty Genetics instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Genetics instance) {
		log.debug("attaching clean Genetics instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ServiceProvider;

/**
 * A data access object (DAO) providing persistence and search support for
 * ServiceProvider entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.ServiceProvider
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ServiceProviderDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ServiceProviderDAO.class);
	// property constants
	public static final String FNAME = "fname";
	public static final String MINIT = "minit";
	public static final String LNAME = "lname";

	public void save(ServiceProvider transientInstance) {
		log.debug("saving ServiceProvider instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ServiceProvider persistentInstance) {
		log.debug("deleting ServiceProvider instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ServiceProvider findById(java.lang.Integer id) {
		log.debug("getting ServiceProvider instance with id: " + id);
		try {
			ServiceProvider instance = (ServiceProvider) getSession().get("com.medikm.dto.ServiceProvider", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ServiceProvider instance) {
		log.debug("finding ServiceProvider instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.ServiceProvider").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ServiceProvider instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ServiceProvider as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFname(Object fname) {
		return findByProperty(FNAME, fname);
	}

	public List findByMinit(Object minit) {
		return findByProperty(MINIT, minit);
	}

	public List findByLname(Object lname) {
		return findByProperty(LNAME, lname);
	}

	public List findAll() {
		log.debug("finding all ServiceProvider instances");
		try {
			String queryString = "from ServiceProvider";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ServiceProvider merge(ServiceProvider detachedInstance) {
		log.debug("merging ServiceProvider instance");
		try {
			ServiceProvider result = (ServiceProvider) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ServiceProvider instance) {
		log.debug("attaching dirty ServiceProvider instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ServiceProvider instance) {
		log.debug("attaching clean ServiceProvider instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
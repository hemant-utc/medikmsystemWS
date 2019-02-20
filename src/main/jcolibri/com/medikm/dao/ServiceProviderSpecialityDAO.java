package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ServiceProviderSpeciality;

/**
 * A data access object (DAO) providing persistence and search support for
 * ServiceProviderSpeciality entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.medikm.dto.ServiceProviderSpeciality
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ServiceProviderSpecialityDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ServiceProviderSpecialityDAO.class);
	// property constants
	public static final String NAME = "name";

	public void save(ServiceProviderSpeciality transientInstance) {
		log.debug("saving ServiceProviderSpeciality instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ServiceProviderSpeciality persistentInstance) {
		log.debug("deleting ServiceProviderSpeciality instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ServiceProviderSpeciality findById(java.lang.Integer id) {
		log.debug("getting ServiceProviderSpeciality instance with id: " + id);
		try {
			ServiceProviderSpeciality instance = (ServiceProviderSpeciality) getSession()
					.get("com.medikm.dto.ServiceProviderSpeciality", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ServiceProviderSpeciality instance) {
		log.debug("finding ServiceProviderSpeciality instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.ServiceProviderSpeciality")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ServiceProviderSpeciality instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ServiceProviderSpeciality as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findAll() {
		log.debug("finding all ServiceProviderSpeciality instances");
		try {
			String queryString = "from ServiceProviderSpeciality";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ServiceProviderSpeciality merge(ServiceProviderSpeciality detachedInstance) {
		log.debug("merging ServiceProviderSpeciality instance");
		try {
			ServiceProviderSpeciality result = (ServiceProviderSpeciality) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ServiceProviderSpeciality instance) {
		log.debug("attaching dirty ServiceProviderSpeciality instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ServiceProviderSpeciality instance) {
		log.debug("attaching clean ServiceProviderSpeciality instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
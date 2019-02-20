package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.MedikmUserRole;

/**
 * A data access object (DAO) providing persistence and search support for
 * MedikmUserRole entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.MedikmUserRole
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class MedikmUserRoleDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(MedikmUserRoleDAO.class);
	// property constants
	public static final String LOGINNAME = "loginname";
	public static final String ROLENAME = "rolename";

	public void save(MedikmUserRole transientInstance) {
		log.debug("saving MedikmUserRole instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MedikmUserRole persistentInstance) {
		log.debug("deleting MedikmUserRole instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MedikmUserRole findById(java.lang.Integer id) {
		log.debug("getting MedikmUserRole instance with id: " + id);
		try {
			MedikmUserRole instance = (MedikmUserRole) getSession().get("com.medikm.dto.MedikmUserRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MedikmUserRole instance) {
		log.debug("finding MedikmUserRole instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.MedikmUserRole").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MedikmUserRole instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from MedikmUserRole as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLoginname(Object loginname) {
		return findByProperty(LOGINNAME, loginname);
	}

	public List findByRolename(Object rolename) {
		return findByProperty(ROLENAME, rolename);
	}

	public List findAll() {
		log.debug("finding all MedikmUserRole instances");
		try {
			String queryString = "from MedikmUserRole";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MedikmUserRole merge(MedikmUserRole detachedInstance) {
		log.debug("merging MedikmUserRole instance");
		try {
			MedikmUserRole result = (MedikmUserRole) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MedikmUserRole instance) {
		log.debug("attaching dirty MedikmUserRole instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MedikmUserRole instance) {
		log.debug("attaching clean MedikmUserRole instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
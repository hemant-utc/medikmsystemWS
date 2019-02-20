package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.DxWkType;

/**
 * A data access object (DAO) providing persistence and search support for
 * DxWkType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.DxWkType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class DxWkTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(DxWkTypeDAO.class);
	// property constants
	public static final String DX_NAME = "dxName";

	public void save(DxWkType transientInstance) {
		log.debug("saving DxWkType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DxWkType persistentInstance) {
		log.debug("deleting DxWkType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DxWkType findById(java.lang.Integer id) {
		log.debug("getting DxWkType instance with id: " + id);
		try {
			DxWkType instance = (DxWkType) getSession().get("com.medikm.dto.DxWkType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DxWkType instance) {
		log.debug("finding DxWkType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.DxWkType").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding DxWkType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from DxWkType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDxName(Object dxName) {
		return findByProperty(DX_NAME, dxName);
	}

	public List findAll() {
		log.debug("finding all DxWkType instances");
		try {
			String queryString = "from DxWkType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DxWkType merge(DxWkType detachedInstance) {
		log.debug("merging DxWkType instance");
		try {
			DxWkType result = (DxWkType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DxWkType instance) {
		log.debug("attaching dirty DxWkType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DxWkType instance) {
		log.debug("attaching clean DxWkType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
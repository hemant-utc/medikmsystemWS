package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Rolepermissions;

/**
 * A data access object (DAO) providing persistence and search support for
 * Rolepermissions entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.Rolepermissions
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class RolepermissionsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(RolepermissionsDAO.class);
	// property constants
	public static final String URL_ID = "urlId";
	public static final String ROLE_CODE = "roleCode";

	public void save(Rolepermissions transientInstance) {
		log.debug("saving Rolepermissions instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Rolepermissions persistentInstance) {
		log.debug("deleting Rolepermissions instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Rolepermissions findById(java.lang.Long id) {
		log.debug("getting Rolepermissions instance with id: " + id);
		try {
			Rolepermissions instance = (Rolepermissions) getSession().get("com.medikm.dto.Rolepermissions", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Rolepermissions instance) {
		log.debug("finding Rolepermissions instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Rolepermissions").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Rolepermissions instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Rolepermissions as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUrlId(Object urlId) {
		return findByProperty(URL_ID, urlId);
	}

	public List findByRoleCode(Object roleCode) {
		return findByProperty(ROLE_CODE, roleCode);
	}

	public List findAll() {
		log.debug("finding all Rolepermissions instances");
		try {
			String queryString = "from Rolepermissions";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Rolepermissions merge(Rolepermissions detachedInstance) {
		log.debug("merging Rolepermissions instance");
		try {
			Rolepermissions result = (Rolepermissions) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Rolepermissions instance) {
		log.debug("attaching dirty Rolepermissions instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Rolepermissions instance) {
		log.debug("attaching clean Rolepermissions instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.PhysicianSpeciality;

/**
 * A data access object (DAO) providing persistence and search support for
 * PhysicianSpeciality entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.PhysicianSpeciality
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class PhysicianSpecialityDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PhysicianSpecialityDAO.class);
	// property constants
	public static final String NAME = "name";

	public void save(PhysicianSpeciality transientInstance) {
		log.debug("saving PhysicianSpeciality instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PhysicianSpeciality persistentInstance) {
		log.debug("deleting PhysicianSpeciality instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PhysicianSpeciality findById(java.lang.Integer id) {
		log.debug("getting PhysicianSpeciality instance with id: " + id);
		try {
			PhysicianSpeciality instance = (PhysicianSpeciality) getSession().get("com.medikm.dto.PhysicianSpeciality",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PhysicianSpeciality instance) {
		log.debug("finding PhysicianSpeciality instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.PhysicianSpeciality")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PhysicianSpeciality instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PhysicianSpeciality as model where model." + propertyName + "= ?";
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
		log.debug("finding all PhysicianSpeciality instances");
		try {
			String queryString = "from PhysicianSpeciality";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PhysicianSpeciality merge(PhysicianSpeciality detachedInstance) {
		log.debug("merging PhysicianSpeciality instance");
		try {
			PhysicianSpeciality result = (PhysicianSpeciality) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PhysicianSpeciality instance) {
		log.debug("attaching dirty PhysicianSpeciality instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PhysicianSpeciality instance) {
		log.debug("attaching clean PhysicianSpeciality instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
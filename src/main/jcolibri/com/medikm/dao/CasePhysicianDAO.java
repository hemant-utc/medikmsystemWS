package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CasePhysician;

/**
 * A data access object (DAO) providing persistence and search support for
 * CasePhysician entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CasePhysician
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CasePhysicianDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CasePhysicianDAO.class);
	// property constants
	public static final String PHYSICAN_NOTES = "physicanNotes";

	public void save(CasePhysician transientInstance) {
		log.debug("saving CasePhysician instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CasePhysician persistentInstance) {
		log.debug("deleting CasePhysician instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CasePhysician findById(com.medikm.dto.CasePhysicianId id) {
		log.debug("getting CasePhysician instance with id: " + id);
		try {
			CasePhysician instance = (CasePhysician) getSession().get("com.medikm.dto.CasePhysician", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CasePhysician instance) {
		log.debug("finding CasePhysician instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CasePhysician").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CasePhysician instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CasePhysician as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPhysicanNotes(Object physicanNotes) {
		return findByProperty(PHYSICAN_NOTES, physicanNotes);
	}

	public List findAll() {
		log.debug("finding all CasePhysician instances");
		try {
			String queryString = "from CasePhysician";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CasePhysician merge(CasePhysician detachedInstance) {
		log.debug("merging CasePhysician instance");
		try {
			CasePhysician result = (CasePhysician) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CasePhysician instance) {
		log.debug("attaching dirty CasePhysician instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CasePhysician instance) {
		log.debug("attaching clean CasePhysician instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.EncounterPhysician;

/**
 * A data access object (DAO) providing persistence and search support for
 * EncounterPhysician entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.EncounterPhysician
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class EncounterPhysicianDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EncounterPhysicianDAO.class);
	// property constants
	public static final String PHYSICAN_ENCOUNTER_NOTE = "physicanEncounterNote";

	public void save(EncounterPhysician transientInstance) {
		log.debug("saving EncounterPhysician instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EncounterPhysician persistentInstance) {
		log.debug("deleting EncounterPhysician instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EncounterPhysician findById(com.medikm.dto.EncounterPhysicianId id) {
		log.debug("getting EncounterPhysician instance with id: " + id);
		try {
			EncounterPhysician instance = (EncounterPhysician) getSession().get("com.medikm.dto.EncounterPhysician",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EncounterPhysician instance) {
		log.debug("finding EncounterPhysician instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.EncounterPhysician")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EncounterPhysician instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from EncounterPhysician as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPhysicanEncounterNote(Object physicanEncounterNote) {
		return findByProperty(PHYSICAN_ENCOUNTER_NOTE, physicanEncounterNote);
	}

	public List findAll() {
		log.debug("finding all EncounterPhysician instances");
		try {
			String queryString = "from EncounterPhysician";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EncounterPhysician merge(EncounterPhysician detachedInstance) {
		log.debug("merging EncounterPhysician instance");
		try {
			EncounterPhysician result = (EncounterPhysician) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EncounterPhysician instance) {
		log.debug("attaching dirty EncounterPhysician instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EncounterPhysician instance) {
		log.debug("attaching clean EncounterPhysician instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
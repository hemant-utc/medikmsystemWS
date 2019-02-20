package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TbDiscussionParticipants;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbDiscussionParticipants entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.medikm.dto.TbDiscussionParticipants
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TbDiscussionParticipantsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbDiscussionParticipantsDAO.class);
	// property constants
	public static final String PHYSICIAN_SPECIALITY = "physicianSpeciality";

	public void save(TbDiscussionParticipants transientInstance) {
		log.debug("saving TbDiscussionParticipants instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbDiscussionParticipants persistentInstance) {
		log.debug("deleting TbDiscussionParticipants instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbDiscussionParticipants findById(com.medikm.dto.TbDiscussionParticipantsId id) {
		log.debug("getting TbDiscussionParticipants instance with id: " + id);
		try {
			TbDiscussionParticipants instance = (TbDiscussionParticipants) getSession()
					.get("com.medikm.dto.TbDiscussionParticipants", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbDiscussionParticipants instance) {
		log.debug("finding TbDiscussionParticipants instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TbDiscussionParticipants")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TbDiscussionParticipants instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TbDiscussionParticipants as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPhysicianSpeciality(Object physicianSpeciality) {
		return findByProperty(PHYSICIAN_SPECIALITY, physicianSpeciality);
	}

	public List findAll() {
		log.debug("finding all TbDiscussionParticipants instances");
		try {
			String queryString = "from TbDiscussionParticipants";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbDiscussionParticipants merge(TbDiscussionParticipants detachedInstance) {
		log.debug("merging TbDiscussionParticipants instance");
		try {
			TbDiscussionParticipants result = (TbDiscussionParticipants) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbDiscussionParticipants instance) {
		log.debug("attaching dirty TbDiscussionParticipants instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbDiscussionParticipants instance) {
		log.debug("attaching clean TbDiscussionParticipants instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
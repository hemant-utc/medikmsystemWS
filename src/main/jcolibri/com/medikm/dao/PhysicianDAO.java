package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Physician;

/**
 * A data access object (DAO) providing persistence and search support for
 * Physician entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Physician
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class PhysicianDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PhysicianDAO.class);
	// property constants
	public static final String FNAME = "fname";
	public static final String MINIT = "minit";
	public static final String LNAME = "lname";
	public static final String PHY_GROUP = "phyGroup";
	public static final String EMAIL_ID = "emailId";
	public static final String PHONE_NO = "phoneNo";
	public static final String PROFILE_IMAGE = "profileImage";

	public void save(Physician transientInstance) {
		log.debug("saving Physician instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Physician persistentInstance) {
		log.debug("deleting Physician instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Physician findById(java.lang.Integer id) {
		log.debug("getting Physician instance with id: " + id);
		try {
			Physician instance = (Physician) getSession().get("com.medikm.dto.Physician", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Physician instance) {
		log.debug("finding Physician instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Physician").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Physician instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Physician as model where model." + propertyName + "= ?";
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

	public List findByPhyGroup(Object phyGroup) {
		return findByProperty(PHY_GROUP, phyGroup);
	}

	public List findByEmailId(Object emailId) {
		return findByProperty(EMAIL_ID, emailId);
	}

	public List findByPhoneNo(Object phoneNo) {
		return findByProperty(PHONE_NO, phoneNo);
	}

	public List findByProfileImage(Object profileImage) {
		return findByProperty(PROFILE_IMAGE, profileImage);
	}

	public List findAll() {
		log.debug("finding all Physician instances");
		try {
			String queryString = "from Physician";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Physician merge(Physician detachedInstance) {
		log.debug("merging Physician instance");
		try {
			Physician result = (Physician) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Physician instance) {
		log.debug("attaching dirty Physician instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Physician instance) {
		log.debug("attaching clean Physician instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
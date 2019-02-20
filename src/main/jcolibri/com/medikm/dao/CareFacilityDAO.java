package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CareFacility;

/**
 * A data access object (DAO) providing persistence and search support for
 * CareFacility entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CareFacility
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CareFacilityDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CareFacilityDAO.class);
	// property constants
	public static final String FACILITY_NAME = "facilityName";
	public static final String FACILITY_ADDRESS = "facilityAddress";
	public static final String FACILITY_CITY = "facilityCity";
	public static final String FACILITY_STATE = "facilityState";
	public static final String FACILITY_ZIP = "facilityZip";

	public void save(CareFacility transientInstance) {
		log.debug("saving CareFacility instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CareFacility persistentInstance) {
		log.debug("deleting CareFacility instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CareFacility findById(java.lang.Integer id) {
		log.debug("getting CareFacility instance with id: " + id);
		try {
			CareFacility instance = (CareFacility) getSession().get("com.medikm.dto.CareFacility", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CareFacility instance) {
		log.debug("finding CareFacility instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CareFacility").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CareFacility instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CareFacility as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFacilityName(Object facilityName) {
		return findByProperty(FACILITY_NAME, facilityName);
	}

	public List findByFacilityAddress(Object facilityAddress) {
		return findByProperty(FACILITY_ADDRESS, facilityAddress);
	}

	public List findByFacilityCity(Object facilityCity) {
		return findByProperty(FACILITY_CITY, facilityCity);
	}

	public List findByFacilityState(Object facilityState) {
		return findByProperty(FACILITY_STATE, facilityState);
	}

	public List findByFacilityZip(Object facilityZip) {
		return findByProperty(FACILITY_ZIP, facilityZip);
	}

	public List findAll() {
		log.debug("finding all CareFacility instances");
		try {
			String queryString = "from CareFacility";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CareFacility merge(CareFacility detachedInstance) {
		log.debug("merging CareFacility instance");
		try {
			CareFacility result = (CareFacility) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CareFacility instance) {
		log.debug("attaching dirty CareFacility instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CareFacility instance) {
		log.debug("attaching clean CareFacility instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
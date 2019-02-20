package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TargetedTherapy;

/**
 * A data access object (DAO) providing persistence and search support for
 * TargetedTherapy entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.TargetedTherapy
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TargetedTherapyDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TargetedTherapyDAO.class);
	// property constants
	public static final String PRE_TRANSTUZUMAB_EJECTION_FRACTION = "preTranstuzumabEjectionFraction";
	public static final String ANTI_HER2_REALTED_COMPLICATIONS = "antiHer2RealtedComplications";
	public static final String BEVACIZUMAB_AVASTIN_REALTED_COMPLICATIONS = "bevacizumabAvastinRealtedComplications";
	public static final String ENROLLED_CLINICAL_TRIAL = "enrolledClinicalTrial";
	public static final String ELIGIBLE_CLINICAL_TRIAL = "eligibleClinicalTrial";

	public void save(TargetedTherapy transientInstance) {
		log.debug("saving TargetedTherapy instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TargetedTherapy persistentInstance) {
		log.debug("deleting TargetedTherapy instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TargetedTherapy findById(com.medikm.dto.TargetedTherapyId id) {
		log.debug("getting TargetedTherapy instance with id: " + id);
		try {
			TargetedTherapy instance = (TargetedTherapy) getSession().get("com.medikm.dto.TargetedTherapy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TargetedTherapy instance) {
		log.debug("finding TargetedTherapy instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TargetedTherapy").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TargetedTherapy instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TargetedTherapy as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPreTranstuzumabEjectionFraction(Object preTranstuzumabEjectionFraction) {
		return findByProperty(PRE_TRANSTUZUMAB_EJECTION_FRACTION, preTranstuzumabEjectionFraction);
	}

	public List findByAntiHer2RealtedComplications(Object antiHer2RealtedComplications) {
		return findByProperty(ANTI_HER2_REALTED_COMPLICATIONS, antiHer2RealtedComplications);
	}

	public List findByBevacizumabAvastinRealtedComplications(Object bevacizumabAvastinRealtedComplications) {
		return findByProperty(BEVACIZUMAB_AVASTIN_REALTED_COMPLICATIONS, bevacizumabAvastinRealtedComplications);
	}

	public List findByEnrolledClinicalTrial(Object enrolledClinicalTrial) {
		return findByProperty(ENROLLED_CLINICAL_TRIAL, enrolledClinicalTrial);
	}

	public List findByEligibleClinicalTrial(Object eligibleClinicalTrial) {
		return findByProperty(ELIGIBLE_CLINICAL_TRIAL, eligibleClinicalTrial);
	}

	public List findAll() {
		log.debug("finding all TargetedTherapy instances");
		try {
			String queryString = "from TargetedTherapy";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TargetedTherapy merge(TargetedTherapy detachedInstance) {
		log.debug("merging TargetedTherapy instance");
		try {
			TargetedTherapy result = (TargetedTherapy) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TargetedTherapy instance) {
		log.debug("attaching dirty TargetedTherapy instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TargetedTherapy instance) {
		log.debug("attaching clean TargetedTherapy instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.PrognosticFactor;

/**
 * A data access object (DAO) providing persistence and search support for
 * PrognosticFactor entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.PrognosticFactor
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class PrognosticFactorDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PrognosticFactorDAO.class);
	// property constants
	public static final String RISK_JOINT_SYMTOMS = "riskJointSymtoms";
	public static final String RISK_JOINT_SYMTOMS_COMM = "riskJointSymtomsComm";
	public static final String SENTI_LYMPH_NMNOMO = "sentiLymphNMNomo";
	public static final String ADDITIONAL_NODAL_METSTASIS = "additionalNodalMetstasis";
	public static final String NOTTINGHAM_NOMOGRAM = "nottinghamNomogram";

	public void save(PrognosticFactor transientInstance) {
		log.debug("saving PrognosticFactor instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PrognosticFactor persistentInstance) {
		log.debug("deleting PrognosticFactor instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PrognosticFactor findById(com.medikm.dto.PrognosticFactorId id) {
		log.debug("getting PrognosticFactor instance with id: " + id);
		try {
			PrognosticFactor instance = (PrognosticFactor) getSession().get("com.medikm.dto.PrognosticFactor", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PrognosticFactor instance) {
		log.debug("finding PrognosticFactor instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.PrognosticFactor").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PrognosticFactor instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PrognosticFactor as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRiskJointSymtoms(Object riskJointSymtoms) {
		return findByProperty(RISK_JOINT_SYMTOMS, riskJointSymtoms);
	}

	public List findByRiskJointSymtomsComm(Object riskJointSymtomsComm) {
		return findByProperty(RISK_JOINT_SYMTOMS_COMM, riskJointSymtomsComm);
	}

	public List findBySentiLymphNMNomo(Object sentiLymphNMNomo) {
		return findByProperty(SENTI_LYMPH_NMNOMO, sentiLymphNMNomo);
	}

	public List findByAdditionalNodalMetstasis(Object additionalNodalMetstasis) {
		return findByProperty(ADDITIONAL_NODAL_METSTASIS, additionalNodalMetstasis);
	}

	public List findByNottinghamNomogram(Object nottinghamNomogram) {
		return findByProperty(NOTTINGHAM_NOMOGRAM, nottinghamNomogram);
	}

	public List findAll() {
		log.debug("finding all PrognosticFactor instances");
		try {
			String queryString = "from PrognosticFactor";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PrognosticFactor merge(PrognosticFactor detachedInstance) {
		log.debug("merging PrognosticFactor instance");
		try {
			PrognosticFactor result = (PrognosticFactor) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PrognosticFactor instance) {
		log.debug("attaching dirty PrognosticFactor instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PrognosticFactor instance) {
		log.debug("attaching clean PrognosticFactor instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
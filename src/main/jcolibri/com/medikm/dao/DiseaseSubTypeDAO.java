package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.DiseaseSubType;

/**
 * A data access object (DAO) providing persistence and search support for
 * DiseaseSubType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.DiseaseSubType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class DiseaseSubTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(DiseaseSubTypeDAO.class);
	// property constants
	public static final String DISEASE_SUB_NAME = "diseaseSubName";

	public void save(DiseaseSubType transientInstance) {
		log.debug("saving DiseaseSubType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DiseaseSubType persistentInstance) {
		log.debug("deleting DiseaseSubType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DiseaseSubType findById(java.lang.Integer id) {
		log.debug("getting DiseaseSubType instance with id: " + id);
		try {
			DiseaseSubType instance = (DiseaseSubType) getSession().get("com.medikm.dto.DiseaseSubType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DiseaseSubType instance) {
		log.debug("finding DiseaseSubType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.DiseaseSubType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding DiseaseSubType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from DiseaseSubType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDiseaseSubName(Object diseaseSubName) {
		return findByProperty(DISEASE_SUB_NAME, diseaseSubName);
	}

	public List findAll() {
		log.debug("finding all DiseaseSubType instances");
		try {
			String queryString = "from DiseaseSubType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DiseaseSubType merge(DiseaseSubType detachedInstance) {
		log.debug("merging DiseaseSubType instance");
		try {
			DiseaseSubType result = (DiseaseSubType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DiseaseSubType instance) {
		log.debug("attaching dirty DiseaseSubType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DiseaseSubType instance) {
		log.debug("attaching clean DiseaseSubType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
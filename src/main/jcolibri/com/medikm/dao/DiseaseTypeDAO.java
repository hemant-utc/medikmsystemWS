package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.DiseaseType;

/**
 * A data access object (DAO) providing persistence and search support for
 * DiseaseType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.DiseaseType
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class DiseaseTypeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(DiseaseTypeDAO.class);
	// property constants
	public static final String DISEASE_NAME = "diseaseName";

	public void save(DiseaseType transientInstance) {
		log.debug("saving DiseaseType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DiseaseType persistentInstance) {
		log.debug("deleting DiseaseType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DiseaseType findById(java.lang.Integer id) {
		log.debug("getting DiseaseType instance with id: " + id);
		try {
			DiseaseType instance = (DiseaseType) getSession().get("com.medikm.dto.DiseaseType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DiseaseType instance) {
		log.debug("finding DiseaseType instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.DiseaseType").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding DiseaseType instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from DiseaseType as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDiseaseName(Object diseaseName) {
		return findByProperty(DISEASE_NAME, diseaseName);
	}

	public List findAll() {
		log.debug("finding all DiseaseType instances");
		try {
			String queryString = "from DiseaseType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DiseaseType merge(DiseaseType detachedInstance) {
		log.debug("merging DiseaseType instance");
		try {
			DiseaseType result = (DiseaseType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DiseaseType instance) {
		log.debug("attaching dirty DiseaseType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DiseaseType instance) {
		log.debug("attaching clean DiseaseType instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
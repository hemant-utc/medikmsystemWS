package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CancerStage;

/**
 * A data access object (DAO) providing persistence and search support for
 * CancerStage entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CancerStage
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CancerStageDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CancerStageDAO.class);
	// property constants
	public static final String RESTAGE = "restage";
	public static final String RESTAGE_COMM = "restageComm";
	public static final String WORKING_TUMOR = "workingTumor";
	public static final String WORKING_NODE = "workingNode";
	public static final String WORKING_METASTASIS = "workingMetastasis";
	public static final String EPISODE_TUMOR = "episodeTumor";
	public static final String EPISODE_NODE = "episodeNode";
	public static final String EPISODE_METASTASIS = "episodeMetastasis";
	public static final String WORK_CANCER_STAGE = "workCancerStage";
	public static final String CLINICAL_CANCER_STAGE = "clinicalCancerStage";

	public void save(CancerStage transientInstance) {
		log.debug("saving CancerStage instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CancerStage persistentInstance) {
		log.debug("deleting CancerStage instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CancerStage findById(com.medikm.dto.CancerStageId id) {
		log.debug("getting CancerStage instance with id: " + id);
		try {
			CancerStage instance = (CancerStage) getSession().get("com.medikm.dto.CancerStage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CancerStage instance) {
		log.debug("finding CancerStage instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CancerStage").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CancerStage instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CancerStage as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRestage(Object restage) {
		return findByProperty(RESTAGE, restage);
	}

	public List findByRestageComm(Object restageComm) {
		return findByProperty(RESTAGE_COMM, restageComm);
	}

	public List findByWorkingTumor(Object workingTumor) {
		return findByProperty(WORKING_TUMOR, workingTumor);
	}

	public List findByWorkingNode(Object workingNode) {
		return findByProperty(WORKING_NODE, workingNode);
	}

	public List findByWorkingMetastasis(Object workingMetastasis) {
		return findByProperty(WORKING_METASTASIS, workingMetastasis);
	}

	public List findByEpisodeTumor(Object episodeTumor) {
		return findByProperty(EPISODE_TUMOR, episodeTumor);
	}

	public List findByEpisodeNode(Object episodeNode) {
		return findByProperty(EPISODE_NODE, episodeNode);
	}

	public List findByEpisodeMetastasis(Object episodeMetastasis) {
		return findByProperty(EPISODE_METASTASIS, episodeMetastasis);
	}

	public List findByWorkCancerStage(Object workCancerStage) {
		return findByProperty(WORK_CANCER_STAGE, workCancerStage);
	}

	public List findByClinicalCancerStage(Object clinicalCancerStage) {
		return findByProperty(CLINICAL_CANCER_STAGE, clinicalCancerStage);
	}

	public List findAll() {
		log.debug("finding all CancerStage instances");
		try {
			String queryString = "from CancerStage";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CancerStage merge(CancerStage detachedInstance) {
		log.debug("merging CancerStage instance");
		try {
			CancerStage result = (CancerStage) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CancerStage instance) {
		log.debug("attaching dirty CancerStage instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CancerStage instance) {
		log.debug("attaching clean CancerStage instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
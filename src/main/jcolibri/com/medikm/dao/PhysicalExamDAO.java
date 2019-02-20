package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.PhysicalExam;

/**
 * A data access object (DAO) providing persistence and search support for
 * PhysicalExam entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.PhysicalExam
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class PhysicalExamDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PhysicalExamDAO.class);
	// property constants
	public static final String CBE_REPORT = "cbeReport";
	public static final String PERFORMANCE_SCORE = "performanceScore";
	public static final String CBE_NORMAL = "cbeNormal";
	public static final String PALPABLE_NODES = "palpableNodes";
	public static final String SKIN_CHANGES = "skinChanges";
	public static final String NIPPLE_CHANGES = "nippleChanges";

	public void save(PhysicalExam transientInstance) {
		log.debug("saving PhysicalExam instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PhysicalExam persistentInstance) {
		log.debug("deleting PhysicalExam instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PhysicalExam findById(java.lang.Integer id) {
		log.debug("getting PhysicalExam instance with id: " + id);
		try {
			PhysicalExam instance = (PhysicalExam) getSession().get("com.medikm.dto.PhysicalExam", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PhysicalExam instance) {
		log.debug("finding PhysicalExam instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.PhysicalExam").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PhysicalExam instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PhysicalExam as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCbeReport(Object cbeReport) {
		return findByProperty(CBE_REPORT, cbeReport);
	}

	public List findByPerformanceScore(Object performanceScore) {
		return findByProperty(PERFORMANCE_SCORE, performanceScore);
	}

	public List findByCbeNormal(Object cbeNormal) {
		return findByProperty(CBE_NORMAL, cbeNormal);
	}

	public List findByPalpableNodes(Object palpableNodes) {
		return findByProperty(PALPABLE_NODES, palpableNodes);
	}

	public List findBySkinChanges(Object skinChanges) {
		return findByProperty(SKIN_CHANGES, skinChanges);
	}

	public List findByNippleChanges(Object nippleChanges) {
		return findByProperty(NIPPLE_CHANGES, nippleChanges);
	}

	public List findAll() {
		log.debug("finding all PhysicalExam instances");
		try {
			String queryString = "from PhysicalExam";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PhysicalExam merge(PhysicalExam detachedInstance) {
		log.debug("merging PhysicalExam instance");
		try {
			PhysicalExam result = (PhysicalExam) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PhysicalExam instance) {
		log.debug("attaching dirty PhysicalExam instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PhysicalExam instance) {
		log.debug("attaching clean PhysicalExam instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Guideline;

/**
 * A data access object (DAO) providing persistence and search support for
 * Guideline entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Guideline
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class GuidelineDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(GuidelineDAO.class);
	// property constants
	public static final String GUIDELINE_NAME = "guidelineName";
	public static final String FLOWCHART = "flowchart";
	public static final String DETAILS = "details";
	public static final String GUIDELINE_FILE_NAME = "guidelineFileName";

	public void save(Guideline transientInstance) {
		log.debug("saving Guideline instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Guideline persistentInstance) {
		log.debug("deleting Guideline instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Guideline findById(com.medikm.dto.GuidelineId id) {
		log.debug("getting Guideline instance with id: " + id);
		try {
			Guideline instance = (Guideline) getSession().get("com.medikm.dto.Guideline", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Guideline instance) {
		log.debug("finding Guideline instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Guideline").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Guideline instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Guideline as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGuidelineName(Object guidelineName) {
		return findByProperty(GUIDELINE_NAME, guidelineName);
	}

	public List findByFlowchart(Object flowchart) {
		return findByProperty(FLOWCHART, flowchart);
	}

	public List findByDetails(Object details) {
		return findByProperty(DETAILS, details);
	}

	public List findByGuidelineFileName(Object guidelineFileName) {
		return findByProperty(GUIDELINE_FILE_NAME, guidelineFileName);
	}

	public List findAll() {
		log.debug("finding all Guideline instances");
		try {
			String queryString = "from Guideline";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Guideline merge(Guideline detachedInstance) {
		log.debug("merging Guideline instance");
		try {
			Guideline result = (Guideline) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Guideline instance) {
		log.debug("attaching dirty Guideline instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Guideline instance) {
		log.debug("attaching clean Guideline instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
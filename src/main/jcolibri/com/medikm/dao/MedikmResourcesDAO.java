package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.MedikmResources;

/**
 * A data access object (DAO) providing persistence and search support for
 * MedikmResources entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.MedikmResources
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class MedikmResourcesDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(MedikmResourcesDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String TYPE = "type";
	public static final String KEYWORDS = "keywords";
	public static final String FILE_NAME = "fileName";
	public static final String EVIDENCE_LEVEL = "evidenceLevel";
	public static final String SOURCE = "source";
	public static final String VISIBILITY = "visibility";
	public static final String EXTERNAL_URL = "externalUrl";
	public static final String ANSWER_ID = "answerId";

	public void save(MedikmResources transientInstance) {
		log.debug("saving MedikmResources instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MedikmResources persistentInstance) {
		log.debug("deleting MedikmResources instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MedikmResources findById(java.lang.Integer id) {
		log.debug("getting MedikmResources instance with id: " + id);
		try {
			MedikmResources instance = (MedikmResources) getSession().get("com.medikm.dto.MedikmResources", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MedikmResources instance) {
		log.debug("finding MedikmResources instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.MedikmResources").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MedikmResources instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from MedikmResources as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByKeywords(Object keywords) {
		return findByProperty(KEYWORDS, keywords);
	}

	public List findByFileName(Object fileName) {
		return findByProperty(FILE_NAME, fileName);
	}

	public List findByEvidenceLevel(Object evidenceLevel) {
		return findByProperty(EVIDENCE_LEVEL, evidenceLevel);
	}

	public List findBySource(Object source) {
		return findByProperty(SOURCE, source);
	}

	public List findByVisibility(Object visibility) {
		return findByProperty(VISIBILITY, visibility);
	}

	public List findByExternalUrl(Object externalUrl) {
		return findByProperty(EXTERNAL_URL, externalUrl);
	}

	public List findByAnswerId(Object answerId) {
		return findByProperty(ANSWER_ID, answerId);
	}

	public List findAll() {
		log.debug("finding all MedikmResources instances");
		try {
			String queryString = "from MedikmResources";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MedikmResources merge(MedikmResources detachedInstance) {
		log.debug("merging MedikmResources instance");
		try {
			MedikmResources result = (MedikmResources) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MedikmResources instance) {
		log.debug("attaching dirty MedikmResources instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MedikmResources instance) {
		log.debug("attaching clean MedikmResources instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
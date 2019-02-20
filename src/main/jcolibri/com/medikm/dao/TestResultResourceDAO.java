package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TestResultResource;

/**
 * A data access object (DAO) providing persistence and search support for
 * TestResultResource entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.TestResultResource
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TestResultResourceDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TestResultResourceDAO.class);
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

	public void save(TestResultResource transientInstance) {
		log.debug("saving TestResultResource instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TestResultResource persistentInstance) {
		log.debug("deleting TestResultResource instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TestResultResource findById(java.lang.Integer id) {
		log.debug("getting TestResultResource instance with id: " + id);
		try {
			TestResultResource instance = (TestResultResource) getSession().get("com.medikm.dto.TestResultResource",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TestResultResource instance) {
		log.debug("finding TestResultResource instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TestResultResource")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TestResultResource instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TestResultResource as model where model." + propertyName + "= ?";
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

	public List findAll() {
		log.debug("finding all TestResultResource instances");
		try {
			String queryString = "from TestResultResource";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TestResultResource merge(TestResultResource detachedInstance) {
		log.debug("merging TestResultResource instance");
		try {
			TestResultResource result = (TestResultResource) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TestResultResource instance) {
		log.debug("attaching dirty TestResultResource instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TestResultResource instance) {
		log.debug("attaching clean TestResultResource instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
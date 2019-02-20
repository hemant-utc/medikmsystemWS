package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CcbrSolution;

/**
 * A data access object (DAO) providing persistence and search support for
 * CcbrSolution entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CcbrSolution
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CcbrSolutionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CcbrSolutionDAO.class);
	// property constants
	public static final String SOLUTION_TEXT = "solutionText";
	public static final String SOURCE = "source";
	public static final String COMMENTS = "comments";
	public static final String RATIONAL = "rational";
	public static final String QUALITY = "quality";

	public void save(CcbrSolution transientInstance) {
		log.debug("saving CcbrSolution instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CcbrSolution persistentInstance) {
		log.debug("deleting CcbrSolution instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CcbrSolution findById(java.lang.Integer id) {
		log.debug("getting CcbrSolution instance with id: " + id);
		try {
			CcbrSolution instance = (CcbrSolution) getSession().get("com.medikm.dto.CcbrSolution", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CcbrSolution instance) {
		log.debug("finding CcbrSolution instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CcbrSolution").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CcbrSolution instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CcbrSolution as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySolutionText(Object solutionText) {
		return findByProperty(SOLUTION_TEXT, solutionText);
	}

	public List findBySource(Object source) {
		return findByProperty(SOURCE, source);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findByRational(Object rational) {
		return findByProperty(RATIONAL, rational);
	}

	public List findByQuality(Object quality) {
		return findByProperty(QUALITY, quality);
	}

	public List findAll() {
		log.debug("finding all CcbrSolution instances");
		try {
			String queryString = "from CcbrSolution";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CcbrSolution merge(CcbrSolution detachedInstance) {
		log.debug("merging CcbrSolution instance");
		try {
			CcbrSolution result = (CcbrSolution) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CcbrSolution instance) {
		log.debug("attaching dirty CcbrSolution instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CcbrSolution instance) {
		log.debug("attaching clean CcbrSolution instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
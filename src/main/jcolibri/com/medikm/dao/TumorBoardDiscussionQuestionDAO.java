package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TumorBoardDiscussionQuestion;

/**
 * A data access object (DAO) providing persistence and search support for
 * TumorBoardDiscussionQuestion entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.medikm.dto.TumorBoardDiscussionQuestion
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TumorBoardDiscussionQuestionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TumorBoardDiscussionQuestionDAO.class);
	// property constants
	public static final String QUESTION_TEXT = "questionText";

	public void save(TumorBoardDiscussionQuestion transientInstance) {
		log.debug("saving TumorBoardDiscussionQuestion instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TumorBoardDiscussionQuestion persistentInstance) {
		log.debug("deleting TumorBoardDiscussionQuestion instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TumorBoardDiscussionQuestion findById(java.lang.Integer id) {
		log.debug("getting TumorBoardDiscussionQuestion instance with id: " + id);
		try {
			TumorBoardDiscussionQuestion instance = (TumorBoardDiscussionQuestion) getSession()
					.get("com.medikm.dto.TumorBoardDiscussionQuestion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TumorBoardDiscussionQuestion instance) {
		log.debug("finding TumorBoardDiscussionQuestion instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TumorBoardDiscussionQuestion")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TumorBoardDiscussionQuestion instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TumorBoardDiscussionQuestion as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByQuestionText(Object questionText) {
		return findByProperty(QUESTION_TEXT, questionText);
	}

	public List findAll() {
		log.debug("finding all TumorBoardDiscussionQuestion instances");
		try {
			String queryString = "from TumorBoardDiscussionQuestion";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TumorBoardDiscussionQuestion merge(TumorBoardDiscussionQuestion detachedInstance) {
		log.debug("merging TumorBoardDiscussionQuestion instance");
		try {
			TumorBoardDiscussionQuestion result = (TumorBoardDiscussionQuestion) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TumorBoardDiscussionQuestion instance) {
		log.debug("attaching dirty TumorBoardDiscussionQuestion instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TumorBoardDiscussionQuestion instance) {
		log.debug("attaching clean TumorBoardDiscussionQuestion instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
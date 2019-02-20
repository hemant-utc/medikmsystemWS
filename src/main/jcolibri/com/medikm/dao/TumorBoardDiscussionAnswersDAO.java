package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TumorBoardDiscussionAnswers;

/**
 * A data access object (DAO) providing persistence and search support for
 * TumorBoardDiscussionAnswers entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.medikm.dto.TumorBoardDiscussionAnswers
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TumorBoardDiscussionAnswersDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TumorBoardDiscussionAnswersDAO.class);
	// property constants
	public static final String ANSWER_TEXT = "answerText";
	public static final String CONCURRENCE = "concurrence";
	public static final String DISCURRENCE = "discurrence";

	public void save(TumorBoardDiscussionAnswers transientInstance) {
		log.debug("saving TumorBoardDiscussionAnswers instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TumorBoardDiscussionAnswers persistentInstance) {
		log.debug("deleting TumorBoardDiscussionAnswers instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TumorBoardDiscussionAnswers findById(java.lang.Integer id) {
		log.debug("getting TumorBoardDiscussionAnswers instance with id: " + id);
		try {
			TumorBoardDiscussionAnswers instance = (TumorBoardDiscussionAnswers) getSession()
					.get("com.medikm.dto.TumorBoardDiscussionAnswers", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TumorBoardDiscussionAnswers instance) {
		log.debug("finding TumorBoardDiscussionAnswers instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TumorBoardDiscussionAnswers")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TumorBoardDiscussionAnswers instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TumorBoardDiscussionAnswers as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAnswerText(Object answerText) {
		return findByProperty(ANSWER_TEXT, answerText);
	}

	public List findByConcurrence(Object concurrence) {
		return findByProperty(CONCURRENCE, concurrence);
	}

	public List findByDiscurrence(Object discurrence) {
		return findByProperty(DISCURRENCE, discurrence);
	}

	public List findAll() {
		log.debug("finding all TumorBoardDiscussionAnswers instances");
		try {
			String queryString = "from TumorBoardDiscussionAnswers";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TumorBoardDiscussionAnswers merge(TumorBoardDiscussionAnswers detachedInstance) {
		log.debug("merging TumorBoardDiscussionAnswers instance");
		try {
			TumorBoardDiscussionAnswers result = (TumorBoardDiscussionAnswers) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TumorBoardDiscussionAnswers instance) {
		log.debug("attaching dirty TumorBoardDiscussionAnswers instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TumorBoardDiscussionAnswers instance) {
		log.debug("attaching clean TumorBoardDiscussionAnswers instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
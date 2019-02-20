package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TbDiscussionForumQuestion;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbDiscussionForumQuestion entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.medikm.dto.TbDiscussionForumQuestion
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TbDiscussionForumQuestionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbDiscussionForumQuestionDAO.class);
	// property constants
	public static final String QUESTION = "question";

	public void save(TbDiscussionForumQuestion transientInstance) {
		log.debug("saving TbDiscussionForumQuestion instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbDiscussionForumQuestion persistentInstance) {
		log.debug("deleting TbDiscussionForumQuestion instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbDiscussionForumQuestion findById(java.lang.Integer id) {
		log.debug("getting TbDiscussionForumQuestion instance with id: " + id);
		try {
			TbDiscussionForumQuestion instance = (TbDiscussionForumQuestion) getSession()
					.get("com.medikm.dto.TbDiscussionForumQuestion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbDiscussionForumQuestion instance) {
		log.debug("finding TbDiscussionForumQuestion instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TbDiscussionForumQuestion")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TbDiscussionForumQuestion instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TbDiscussionForumQuestion as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByQuestion(Object question) {
		return findByProperty(QUESTION, question);
	}

	public List findAll() {
		log.debug("finding all TbDiscussionForumQuestion instances");
		try {
			String queryString = "from TbDiscussionForumQuestion";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbDiscussionForumQuestion merge(TbDiscussionForumQuestion detachedInstance) {
		log.debug("merging TbDiscussionForumQuestion instance");
		try {
			TbDiscussionForumQuestion result = (TbDiscussionForumQuestion) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbDiscussionForumQuestion instance) {
		log.debug("attaching dirty TbDiscussionForumQuestion instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbDiscussionForumQuestion instance) {
		log.debug("attaching clean TbDiscussionForumQuestion instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
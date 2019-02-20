package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CommentsLike;

/**
 * A data access object (DAO) providing persistence and search support for
 * CommentsLike entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CommentsLike
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CommentsLikeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CommentsLikeDAO.class);
	// property constants
	public static final String COMMENT_LIKE_VALUE = "commentLikeValue";

	public void save(CommentsLike transientInstance) {
		log.debug("saving CommentsLike instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CommentsLike persistentInstance) {
		log.debug("deleting CommentsLike instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CommentsLike findById(java.lang.Integer id) {
		log.debug("getting CommentsLike instance with id: " + id);
		try {
			CommentsLike instance = (CommentsLike) getSession().get("com.medikm.dto.CommentsLike", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CommentsLike instance) {
		log.debug("finding CommentsLike instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CommentsLike").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CommentsLike instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CommentsLike as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCommentLikeValue(Object commentLikeValue) {
		return findByProperty(COMMENT_LIKE_VALUE, commentLikeValue);
	}

	public List findAll() {
		log.debug("finding all CommentsLike instances");
		try {
			String queryString = "from CommentsLike";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CommentsLike merge(CommentsLike detachedInstance) {
		log.debug("merging CommentsLike instance");
		try {
			CommentsLike result = (CommentsLike) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CommentsLike instance) {
		log.debug("attaching dirty CommentsLike instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CommentsLike instance) {
		log.debug("attaching clean CommentsLike instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
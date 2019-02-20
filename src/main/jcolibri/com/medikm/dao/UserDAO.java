package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.User;

/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.medikm.dto.User
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class UserDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(UserDAO.class);
	// property constants
	public static final String PHYSICIAN_ID = "physicianId";
	public static final String USER_NAME = "userName";
	public static final String PASSWORD = "password";
	public static final String PRIORITY = "priority";
	public static final String IS_ACTIVE = "isActive";
	public static final String ROLE_CODE = "roleCode";
	public static final String AUTH_TOKEN = "authToken";
	public static final String DEVICE_ID = "deviceId";
	public static final String PLATFORM_CODE = "platformCode";
	public static final String LOGIN_ATTEMPT = "loginAttempt";
	public static final String SESSION_ID = "sessionId";
	public static final String REGISTER_CODE = "registerCode";
	public static final String SET_PASSWORD_REQUEST = "setPasswordRequest";

	public void save(User transientInstance) {
		log.debug("saving User instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(User persistentInstance) {
		log.debug("deleting User instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public User findById(java.lang.Integer id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) getSession().get("com.medikm.dto.User", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(User instance) {
		log.debug("finding User instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.User").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding User instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from User as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPhysicianId(Object physicianId) {
		return findByProperty(PHYSICIAN_ID, physicianId);
	}

	public List findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByPriority(Object priority) {
		return findByProperty(PRIORITY, priority);
	}

	public List findByIsActive(Object isActive) {
		return findByProperty(IS_ACTIVE, isActive);
	}

	public List findByRoleCode(Object roleCode) {
		return findByProperty(ROLE_CODE, roleCode);
	}

	public List findByAuthToken(Object authToken) {
		return findByProperty(AUTH_TOKEN, authToken);
	}

	public List findByDeviceId(Object deviceId) {
		return findByProperty(DEVICE_ID, deviceId);
	}

	public List findByPlatformCode(Object platformCode) {
		return findByProperty(PLATFORM_CODE, platformCode);
	}

	public List findByLoginAttempt(Object loginAttempt) {
		return findByProperty(LOGIN_ATTEMPT, loginAttempt);
	}

	public List findBySessionId(Object sessionId) {
		return findByProperty(SESSION_ID, sessionId);
	}

	public List findByRegisterCode(Object registerCode) {
		return findByProperty(REGISTER_CODE, registerCode);
	}

	public List findBySetPasswordRequest(Object setPasswordRequest) {
		return findByProperty(SET_PASSWORD_REQUEST, setPasswordRequest);
	}

	public List findAll() {
		log.debug("finding all User instances");
		try {
			String queryString = "from User";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public User merge(User detachedInstance) {
		log.debug("merging User instance");
		try {
			User result = (User) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(User instance) {
		log.debug("attaching dirty User instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(User instance) {
		log.debug("attaching clean User instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
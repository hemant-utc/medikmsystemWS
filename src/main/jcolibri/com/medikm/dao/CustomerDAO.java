package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Customer;

/**
 * A data access object (DAO) providing persistence and search support for
 * Customer entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Customer
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CustomerDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CustomerDAO.class);
	// property constants
	public static final String CUST_NAME = "custName";
	public static final String CUST_STATUS = "custStatus";
	public static final String ACCEPTED_AGGREMENT = "acceptedAggrement";
	public static final String CUST_ADDRESS1 = "custAddress1";
	public static final String CUST_ADDRESS2 = "custAddress2";
	public static final String CUST_ZIP = "custZip";
	public static final String NUMBER_NODES_LICENSES = "numberNodesLicenses";
	public static final String SHARING_CASE_DATA = "sharingCaseData";
	public static final String CUST_PHONE_NO = "custPhoneNo";
	public static final String CUST_EMAIL = "custEmail";

	public void save(Customer transientInstance) {
		log.debug("saving Customer instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Customer persistentInstance) {
		log.debug("deleting Customer instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Customer findById(java.lang.Integer id) {
		log.debug("getting Customer instance with id: " + id);
		try {
			Customer instance = (Customer) getSession().get("com.medikm.dto.Customer", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Customer instance) {
		log.debug("finding Customer instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Customer").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Customer instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Customer as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCustName(Object custName) {
		return findByProperty(CUST_NAME, custName);
	}

	public List findByCustStatus(Object custStatus) {
		return findByProperty(CUST_STATUS, custStatus);
	}

	public List findByAcceptedAggrement(Object acceptedAggrement) {
		return findByProperty(ACCEPTED_AGGREMENT, acceptedAggrement);
	}

	public List findByCustAddress1(Object custAddress1) {
		return findByProperty(CUST_ADDRESS1, custAddress1);
	}

	public List findByCustAddress2(Object custAddress2) {
		return findByProperty(CUST_ADDRESS2, custAddress2);
	}

	public List findByCustZip(Object custZip) {
		return findByProperty(CUST_ZIP, custZip);
	}

	public List findByNumberNodesLicenses(Object numberNodesLicenses) {
		return findByProperty(NUMBER_NODES_LICENSES, numberNodesLicenses);
	}

	public List findBySharingCaseData(Object sharingCaseData) {
		return findByProperty(SHARING_CASE_DATA, sharingCaseData);
	}

	public List findByCustPhoneNo(Object custPhoneNo) {
		return findByProperty(CUST_PHONE_NO, custPhoneNo);
	}

	public List findByCustEmail(Object custEmail) {
		return findByProperty(CUST_EMAIL, custEmail);
	}

	public List findAll() {
		log.debug("finding all Customer instances");
		try {
			String queryString = "from Customer";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Customer merge(Customer detachedInstance) {
		log.debug("merging Customer instance");
		try {
			Customer result = (Customer) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Customer instance) {
		log.debug("attaching dirty Customer instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Customer instance) {
		log.debug("attaching clean Customer instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
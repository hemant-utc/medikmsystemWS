package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.PatientExcelData;

/**
 * A data access object (DAO) providing persistence and search support for
 * PatientExcelData entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.PatientExcelData
 * @author MyEclipse Persistence Tools
 */

@SuppressWarnings({ "rawtypes", "deprecation" })
public class PatientExcelDataDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PatientExcelDataDAO.class);
	// property constants
	public static final String BD = "bd";
	public static final String MRN = "mrn";
	public static final String LNAME = "lname";
	public static final String FNAME = "fname";
	public static final String RACE = "race";
	public static final String ADDR1 = "addr1";
	public static final String ADDR2 = "addr2";
	public static final String CITY = "city";
	public static final String STATE = "state";
	public static final String ZIP = "zip";
	public static final String PHONE = "phone";
	public static final String PCP = "pcp";
	public static final String EMERGENCY_CONTACT = "emergencyContact";
	public static final String RELATIONSHIP = "relationship";
	public static final String CONTACT_PHONE = "contactPhone";

	public void save(PatientExcelData transientInstance) {
		log.debug("saving PatientExcelData instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PatientExcelData persistentInstance) {
		log.debug("deleting PatientExcelData instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PatientExcelData findById(com.medikm.dto.PatientExcelDataId id) {
		log.debug("getting PatientExcelData instance with id: " + id);
		try {
			PatientExcelData instance = (PatientExcelData) getSession().get("com.medikm.dto.PatientExcelData", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PatientExcelData instance) {
		log.debug("finding PatientExcelData instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.PatientExcelData").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PatientExcelData instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PatientExcelData as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBd(Object bd) {
		return findByProperty(BD, bd);
	}

	public List findByMrn(Object mrn) {
		return findByProperty(MRN, mrn);
	}

	public List findByLname(Object lname) {
		return findByProperty(LNAME, lname);
	}

	public List findByFname(Object fname) {
		return findByProperty(FNAME, fname);
	}

	public List findByRace(Object race) {
		return findByProperty(RACE, race);
	}

	public List findByAddr1(Object addr1) {
		return findByProperty(ADDR1, addr1);
	}

	public List findByAddr2(Object addr2) {
		return findByProperty(ADDR2, addr2);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findByZip(Object zip) {
		return findByProperty(ZIP, zip);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByPcp(Object pcp) {
		return findByProperty(PCP, pcp);
	}

	public List findByEmergencyContact(Object emergencyContact) {
		return findByProperty(EMERGENCY_CONTACT, emergencyContact);
	}

	public List findByRelationship(Object relationship) {
		return findByProperty(RELATIONSHIP, relationship);
	}

	public List findByContactPhone(Object contactPhone) {
		return findByProperty(CONTACT_PHONE, contactPhone);
	}

	public List findAll() {
		log.debug("finding all PatientExcelData instances");
		try {
			String queryString = "from PatientExcelData";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PatientExcelData merge(PatientExcelData detachedInstance) {
		log.debug("merging PatientExcelData instance");
		try {
			PatientExcelData result = (PatientExcelData) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PatientExcelData instance) {
		log.debug("attaching dirty PatientExcelData instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PatientExcelData instance) {
		log.debug("attaching clean PatientExcelData instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
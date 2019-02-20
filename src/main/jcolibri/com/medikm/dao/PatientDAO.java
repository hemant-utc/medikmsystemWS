package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Patient;

/**
 * A data access object (DAO) providing persistence and search support for
 * Patient entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Patient
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class PatientDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PatientDAO.class);
	// property constants
	public static final String FNAME = "fname";
	public static final String MNAME = "mname";
	public static final String LNAME = "lname";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String EMERGENCY_CONTACT_NAME = "emergencyContactName";
	public static final String EMERGENCY_CONTACT_PHONE_NUMBER = "emergencyContactPhoneNumber";
	public static final String ZIPCODE = "zipcode";
	public static final String INCREASE_RISK = "increaseRisk";
	public static final String GENDER = "gender";
	public static final String PATIENT_CONCERNS = "patientConcerns";
	public static final String CELL_PHONE_NUMBER = "cellPhoneNumber";
	public static final String WORK_PHONE_NUMBER = "workPhoneNumber";
	public static final String ADDRESS = "address";
	public static final String CITY = "city";
	public static final String EMPLOYEMENT_TYPE = "employementType";
	public static final String INSURANCE_NAME = "insuranceName";
	public static final String MAMMOGRAPHIC_BREAST_DENSITY = "mammographicBreastDensity";
	public static final String STATUS = "status";
	public static final String ACTIVE = "active";
	public static final String MED_REC_NO = "medRecNo";
	public static final String ETHNICITY = "ethnicity";

	public void save(Patient transientInstance) {
		log.debug("saving Patient instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Patient persistentInstance) {
		log.debug("deleting Patient instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Patient findById(java.lang.Integer id) {
		log.debug("getting Patient instance with id: " + id);
		try {
			Patient instance = (Patient) getSession().get("com.medikm.dto.Patient", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Patient instance) {
		log.debug("finding Patient instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Patient").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Patient instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Patient as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFname(Object fname) {
		return findByProperty(FNAME, fname);
	}

	public List findByMname(Object mname) {
		return findByProperty(MNAME, mname);
	}

	public List findByLname(Object lname) {
		return findByProperty(LNAME, lname);
	}

	public List findByPhoneNumber(Object phoneNumber) {
		return findByProperty(PHONE_NUMBER, phoneNumber);
	}

	public List findByEmergencyContactName(Object emergencyContactName) {
		return findByProperty(EMERGENCY_CONTACT_NAME, emergencyContactName);
	}

	public List findByEmergencyContactPhoneNumber(Object emergencyContactPhoneNumber) {
		return findByProperty(EMERGENCY_CONTACT_PHONE_NUMBER, emergencyContactPhoneNumber);
	}

	public List findByZipcode(Object zipcode) {
		return findByProperty(ZIPCODE, zipcode);
	}

	public List findByIncreaseRisk(Object increaseRisk) {
		return findByProperty(INCREASE_RISK, increaseRisk);
	}

	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	public List findByPatientConcerns(Object patientConcerns) {
		return findByProperty(PATIENT_CONCERNS, patientConcerns);
	}

	public List findByCellPhoneNumber(Object cellPhoneNumber) {
		return findByProperty(CELL_PHONE_NUMBER, cellPhoneNumber);
	}

	public List findByWorkPhoneNumber(Object workPhoneNumber) {
		return findByProperty(WORK_PHONE_NUMBER, workPhoneNumber);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByEmployementType(Object employementType) {
		return findByProperty(EMPLOYEMENT_TYPE, employementType);
	}

	public List findByInsuranceName(Object insuranceName) {
		return findByProperty(INSURANCE_NAME, insuranceName);
	}

	public List findByMammographicBreastDensity(Object mammographicBreastDensity) {
		return findByProperty(MAMMOGRAPHIC_BREAST_DENSITY, mammographicBreastDensity);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findByMedRecNo(Object medRecNo) {
		return findByProperty(MED_REC_NO, medRecNo);
	}

	public List findByEthnicity(Object ethnicity) {
		return findByProperty(ETHNICITY, ethnicity);
	}

	public List findAll() {
		log.debug("finding all Patient instances");
		try {
			String queryString = "from Patient";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Patient merge(Patient detachedInstance) {
		log.debug("merging Patient instance");
		try {
			Patient result = (Patient) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Patient instance) {
		log.debug("attaching dirty Patient instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Patient instance) {
		log.debug("attaching clean Patient instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
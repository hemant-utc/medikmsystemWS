package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.EndocrineTherapy;

/**
 * A data access object (DAO) providing persistence and search support for
 * EndocrineTherapy entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.EndocrineTherapy
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class EndocrineTherapyDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EndocrineTherapyDAO.class);
	// property constants
	public static final String CONTRAINDICATION_TO_ARMTS_INHBT_COMM = "contraindicationToArmtsInhbtComm";
	public static final String ANASTROZOLE_SAFETY_PROFILE = "anastrozoleSafetyProfile";
	public static final String PATIENT_DECLINED_ARMTS_INHBT = "patientDeclinedArmtsInhbt";
	public static final String PATIETN_INTOLLERANT_TO_ARMTS_INHBT = "patietnIntollerantToArmtsInhbt";
	public static final String RESUMPTION = "resumption";
	public static final String ESTRADIOL_LEVELS = "estradiolLevels";
	public static final String FSH_LEVELS = "fshLevels";
	public static final String ENROLLED_CLINICAL_TRIAL = "enrolledClinicalTrial";
	public static final String ELIGIBLE_CLINICAL_TRIAL = "eligibleClinicalTrial";

	public void save(EndocrineTherapy transientInstance) {
		log.debug("saving EndocrineTherapy instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EndocrineTherapy persistentInstance) {
		log.debug("deleting EndocrineTherapy instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EndocrineTherapy findById(com.medikm.dto.EndocrineTherapyId id) {
		log.debug("getting EndocrineTherapy instance with id: " + id);
		try {
			EndocrineTherapy instance = (EndocrineTherapy) getSession().get("com.medikm.dto.EndocrineTherapy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EndocrineTherapy instance) {
		log.debug("finding EndocrineTherapy instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.EndocrineTherapy").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EndocrineTherapy instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from EndocrineTherapy as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByContraindicationToArmtsInhbtComm(Object contraindicationToArmtsInhbtComm) {
		return findByProperty(CONTRAINDICATION_TO_ARMTS_INHBT_COMM, contraindicationToArmtsInhbtComm);
	}

	public List findByAnastrozoleSafetyProfile(Object anastrozoleSafetyProfile) {
		return findByProperty(ANASTROZOLE_SAFETY_PROFILE, anastrozoleSafetyProfile);
	}

	public List findByPatientDeclinedArmtsInhbt(Object patientDeclinedArmtsInhbt) {
		return findByProperty(PATIENT_DECLINED_ARMTS_INHBT, patientDeclinedArmtsInhbt);
	}

	public List findByPatietnIntollerantToArmtsInhbt(Object patietnIntollerantToArmtsInhbt) {
		return findByProperty(PATIETN_INTOLLERANT_TO_ARMTS_INHBT, patietnIntollerantToArmtsInhbt);
	}

	public List findByResumption(Object resumption) {
		return findByProperty(RESUMPTION, resumption);
	}

	public List findByEstradiolLevels(Object estradiolLevels) {
		return findByProperty(ESTRADIOL_LEVELS, estradiolLevels);
	}

	public List findByFshLevels(Object fshLevels) {
		return findByProperty(FSH_LEVELS, fshLevels);
	}

	public List findByEnrolledClinicalTrial(Object enrolledClinicalTrial) {
		return findByProperty(ENROLLED_CLINICAL_TRIAL, enrolledClinicalTrial);
	}

	public List findByEligibleClinicalTrial(Object eligibleClinicalTrial) {
		return findByProperty(ELIGIBLE_CLINICAL_TRIAL, eligibleClinicalTrial);
	}

	public List findAll() {
		log.debug("finding all EndocrineTherapy instances");
		try {
			String queryString = "from EndocrineTherapy";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EndocrineTherapy merge(EndocrineTherapy detachedInstance) {
		log.debug("merging EndocrineTherapy instance");
		try {
			EndocrineTherapy result = (EndocrineTherapy) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EndocrineTherapy instance) {
		log.debug("attaching dirty EndocrineTherapy instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EndocrineTherapy instance) {
		log.debug("attaching clean EndocrineTherapy instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
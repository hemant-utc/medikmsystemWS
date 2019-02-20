package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.ReproductiveHistory;

/**
 * A data access object (DAO) providing persistence and search support for
 * ReproductiveHistory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.ReproductiveHistory
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ReproductiveHistoryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ReproductiveHistoryDAO.class);
	// property constants
	public static final String AGE_MENARCHE = "ageMenarche";
	public static final String AGE_MENOPAUSE = "ageMenopause";
	public static final String NO_PREGNANCIES = "noPregnancies";
	public static final String NO_DELIVERIES = "noDeliveries";
	public static final String AGE_FIRST_LIVE_BIRTH = "ageFirstLiveBirth";
	public static final String BREAST_FEEDING_FOR6_MONTHS = "breastFeedingFor6Months";
	public static final String AGE_FIRST_BIRTH = "ageFirstBirth";
	public static final String PROGESTERONE_THERAPY = "progesteroneTherapy";
	public static final String PROGESTERONE_THERAPY_COMM = "progesteroneTherapyComm";
	public static final String ORAL_CONTRACCEPTIVES = "oralContracceptives";
	public static final String ORAL_CONTRACCEPTIVES_COMM = "oralContracceptivesComm";
	public static final String FERTILITY_DRUGS = "fertilityDrugs";
	public static final String FERTILITY_DRUGS_COMM = "fertilityDrugsComm";
	public static final String BIRTH_CONTROL_PILLS_USED = "birthControlPillsUsed";

	public void save(ReproductiveHistory transientInstance) {
		log.debug("saving ReproductiveHistory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ReproductiveHistory persistentInstance) {
		log.debug("deleting ReproductiveHistory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ReproductiveHistory findById(com.medikm.dto.ReproductiveHistoryId id) {
		log.debug("getting ReproductiveHistory instance with id: " + id);
		try {
			ReproductiveHistory instance = (ReproductiveHistory) getSession().get("com.medikm.dto.ReproductiveHistory",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ReproductiveHistory instance) {
		log.debug("finding ReproductiveHistory instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.ReproductiveHistory")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ReproductiveHistory instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ReproductiveHistory as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAgeMenarche(Object ageMenarche) {
		return findByProperty(AGE_MENARCHE, ageMenarche);
	}

	public List findByAgeMenopause(Object ageMenopause) {
		return findByProperty(AGE_MENOPAUSE, ageMenopause);
	}

	public List findByNoPregnancies(Object noPregnancies) {
		return findByProperty(NO_PREGNANCIES, noPregnancies);
	}

	public List findByNoDeliveries(Object noDeliveries) {
		return findByProperty(NO_DELIVERIES, noDeliveries);
	}

	public List findByAgeFirstLiveBirth(Object ageFirstLiveBirth) {
		return findByProperty(AGE_FIRST_LIVE_BIRTH, ageFirstLiveBirth);
	}

	public List findByBreastFeedingFor6Months(Object breastFeedingFor6Months) {
		return findByProperty(BREAST_FEEDING_FOR6_MONTHS, breastFeedingFor6Months);
	}

	public List findByAgeFirstBirth(Object ageFirstBirth) {
		return findByProperty(AGE_FIRST_BIRTH, ageFirstBirth);
	}

	public List findByProgesteroneTherapy(Object progesteroneTherapy) {
		return findByProperty(PROGESTERONE_THERAPY, progesteroneTherapy);
	}

	public List findByProgesteroneTherapyComm(Object progesteroneTherapyComm) {
		return findByProperty(PROGESTERONE_THERAPY_COMM, progesteroneTherapyComm);
	}

	public List findByOralContracceptives(Object oralContracceptives) {
		return findByProperty(ORAL_CONTRACCEPTIVES, oralContracceptives);
	}

	public List findByOralContracceptivesComm(Object oralContracceptivesComm) {
		return findByProperty(ORAL_CONTRACCEPTIVES_COMM, oralContracceptivesComm);
	}

	public List findByFertilityDrugs(Object fertilityDrugs) {
		return findByProperty(FERTILITY_DRUGS, fertilityDrugs);
	}

	public List findByFertilityDrugsComm(Object fertilityDrugsComm) {
		return findByProperty(FERTILITY_DRUGS_COMM, fertilityDrugsComm);
	}

	public List findByBirthControlPillsUsed(Object birthControlPillsUsed) {
		return findByProperty(BIRTH_CONTROL_PILLS_USED, birthControlPillsUsed);
	}

	public List findAll() {
		log.debug("finding all ReproductiveHistory instances");
		try {
			String queryString = "from ReproductiveHistory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ReproductiveHistory merge(ReproductiveHistory detachedInstance) {
		log.debug("merging ReproductiveHistory instance");
		try {
			ReproductiveHistory result = (ReproductiveHistory) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ReproductiveHistory instance) {
		log.debug("attaching dirty ReproductiveHistory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ReproductiveHistory instance) {
		log.debug("attaching clean ReproductiveHistory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
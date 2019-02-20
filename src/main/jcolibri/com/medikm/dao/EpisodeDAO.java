package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Episode;

/**
 * A data access object (DAO) providing persistence and search support for
 * Episode entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Episode
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class EpisodeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EpisodeDAO.class);
	// property constants
	public static final String HEALTH_PROBLEM_TYPE = "healthProblemType";
	public static final String DISEASE_TYPE = "diseaseType";
	public static final String SYMPTOMS_COMPLAINTS_EXPERIENCED = "symptomsComplaintsExperienced";
	public static final String EP_HEIGHT = "epHeight";
	public static final String EP_WEIGHT = "epWeight";
	public static final String SIDE_OF_CANCER = "sideOfCancer";
	public static final String CANCER_LOCATION = "cancerLocation";
	public static final String HRT = "hrt";
	public static final String RELATIVE_INTRAOPERATIVE_FINDINGS = "relativeIntraoperativeFindings";
	public static final String IMAGING_FINDINGS = "imagingFindings";
	public static final String BIOPSY_FINDINGS = "biopsyFindings";
	public static final String PATHOLOGY_FINDINGS = "pathologyFindings";
	public static final String FROZEN_SECTION_FINDINGS = "frozenSectionFindings";
	public static final String RECOMMENDED_PLAN = "recommendedPlan";

	public void save(Episode transientInstance) {
		log.debug("saving Episode instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Episode persistentInstance) {
		log.debug("deleting Episode instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Episode findById(java.lang.Integer id) {
		log.debug("getting Episode instance with id: " + id);
		try {
			Episode instance = (Episode) getSession().get("com.medikm.dto.Episode", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Episode instance) {
		log.debug("finding Episode instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Episode").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Episode instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Episode as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByHealthProblemType(Object healthProblemType) {
		return findByProperty(HEALTH_PROBLEM_TYPE, healthProblemType);
	}

	public List findByDiseaseType(Object diseaseType) {
		return findByProperty(DISEASE_TYPE, diseaseType);
	}

	public List findBySymptomsComplaintsExperienced(Object symptomsComplaintsExperienced) {
		return findByProperty(SYMPTOMS_COMPLAINTS_EXPERIENCED, symptomsComplaintsExperienced);
	}

	public List findByEpHeight(Object epHeight) {
		return findByProperty(EP_HEIGHT, epHeight);
	}

	public List findByEpWeight(Object epWeight) {
		return findByProperty(EP_WEIGHT, epWeight);
	}

	public List findBySideOfCancer(Object sideOfCancer) {
		return findByProperty(SIDE_OF_CANCER, sideOfCancer);
	}

	public List findByCancerLocation(Object cancerLocation) {
		return findByProperty(CANCER_LOCATION, cancerLocation);
	}

	public List findByHrt(Object hrt) {
		return findByProperty(HRT, hrt);
	}

	public List findByRelativeIntraoperativeFindings(Object relativeIntraoperativeFindings) {
		return findByProperty(RELATIVE_INTRAOPERATIVE_FINDINGS, relativeIntraoperativeFindings);
	}

	public List findByImagingFindings(Object imagingFindings) {
		return findByProperty(IMAGING_FINDINGS, imagingFindings);
	}

	public List findByBiopsyFindings(Object biopsyFindings) {
		return findByProperty(BIOPSY_FINDINGS, biopsyFindings);
	}

	public List findByPathologyFindings(Object pathologyFindings) {
		return findByProperty(PATHOLOGY_FINDINGS, pathologyFindings);
	}

	public List findByFrozenSectionFindings(Object frozenSectionFindings) {
		return findByProperty(FROZEN_SECTION_FINDINGS, frozenSectionFindings);
	}

	public List findByRecommendedPlan(Object recommendedPlan) {
		return findByProperty(RECOMMENDED_PLAN, recommendedPlan);
	}

	public List findAll() {
		log.debug("finding all Episode instances");
		try {
			String queryString = "from Episode";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Episode merge(Episode detachedInstance) {
		log.debug("merging Episode instance");
		try {
			Episode result = (Episode) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Episode instance) {
		log.debug("attaching dirty Episode instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Episode instance) {
		log.debug("attaching clean Episode instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
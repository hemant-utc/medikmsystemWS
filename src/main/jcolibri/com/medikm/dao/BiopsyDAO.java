package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Biopsy;

/**
 * A data access object (DAO) providing persistence and search support for
 * Biopsy entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Biopsy
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class BiopsyDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(BiopsyDAO.class);
	// property constants
	public static final String BIOPSY_ID = "biopsyId";
	public static final String LESION_LOCATION = "lesionLocation";
	public static final String NEEDLE_GAUGE = "needleGauge";
	public static final String POST_BIOPSY_RECOMMENDED_MRI = "postBiopsyRecommendedMri";
	public static final String POST_BIOPSY_RELATED_MRI_CONTROLATERAL_BREAST = "postBiopsyRelatedMriControlateralBreast";
	public static final String LESION_COMPLETELY_REMOVED = "lesionCompletelyRemoved";
	public static final String COMPLICATIONS = "complications";
	public static final String BIOPSY_MARGINS = "biopsyMargins";
	public static final String BIOPSY_MARGINS_COMM = "biopsyMarginsComm";
	public static final String SN_INJ_METHOD = "snInjMethod";

	public void save(Biopsy transientInstance) {
		log.debug("saving Biopsy instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Biopsy persistentInstance) {
		log.debug("deleting Biopsy instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Biopsy findById(java.lang.Integer id) {
		log.debug("getting Biopsy instance with id: " + id);
		try {
			Biopsy instance = (Biopsy) getSession().get("com.medikm.dto.Biopsy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Biopsy instance) {
		log.debug("finding Biopsy instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Biopsy").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Biopsy instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Biopsy as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBiopsyId(Object biopsyId) {
		return findByProperty(BIOPSY_ID, biopsyId);
	}

	public List findByLesionLocation(Object lesionLocation) {
		return findByProperty(LESION_LOCATION, lesionLocation);
	}

	public List findByNeedleGauge(Object needleGauge) {
		return findByProperty(NEEDLE_GAUGE, needleGauge);
	}

	public List findByPostBiopsyRecommendedMri(Object postBiopsyRecommendedMri) {
		return findByProperty(POST_BIOPSY_RECOMMENDED_MRI, postBiopsyRecommendedMri);
	}

	public List findByPostBiopsyRelatedMriControlateralBreast(Object postBiopsyRelatedMriControlateralBreast) {
		return findByProperty(POST_BIOPSY_RELATED_MRI_CONTROLATERAL_BREAST, postBiopsyRelatedMriControlateralBreast);
	}

	public List findByLesionCompletelyRemoved(Object lesionCompletelyRemoved) {
		return findByProperty(LESION_COMPLETELY_REMOVED, lesionCompletelyRemoved);
	}

	public List findByComplications(Object complications) {
		return findByProperty(COMPLICATIONS, complications);
	}

	public List findByBiopsyMargins(Object biopsyMargins) {
		return findByProperty(BIOPSY_MARGINS, biopsyMargins);
	}

	public List findByBiopsyMarginsComm(Object biopsyMarginsComm) {
		return findByProperty(BIOPSY_MARGINS_COMM, biopsyMarginsComm);
	}

	public List findBySnInjMethod(Object snInjMethod) {
		return findByProperty(SN_INJ_METHOD, snInjMethod);
	}

	public List findAll() {
		log.debug("finding all Biopsy instances");
		try {
			String queryString = "from Biopsy";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Biopsy merge(Biopsy detachedInstance) {
		log.debug("merging Biopsy instance");
		try {
			Biopsy result = (Biopsy) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Biopsy instance) {
		log.debug("attaching dirty Biopsy instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Biopsy instance) {
		log.debug("attaching clean Biopsy instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
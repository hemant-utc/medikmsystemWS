package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CoMorbidity;

/**
 * A data access object (DAO) providing persistence and search support for
 * CoMorbidity entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CoMorbidity
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CoMorbidityDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CoMorbidityDAO.class);
	// property constants
	public static final String COMORB_CAD = "comorbCad";
	public static final String COMORB_HTN = "comorbHtn";
	public static final String COMORB_HYPERLIPIDEMIA = "comorbHyperlipidemia";
	public static final String COMORB_PNEUMONIA = "comorbPneumonia";
	public static final String COMORB_GERD = "comorbGerd";
	public static final String COMORB_ARTHRITIS = "comorbArthritis";
	public static final String COMORB_HYPOTHYROIDISM = "comorbHypothyroidism";
	public static final String COMORB_HYPERTHYROIDISM = "comorbHyperthyroidism";
	public static final String COMORB_MI = "comorbMi";
	public static final String COMORB_CHF = "comorbChf";
	public static final String COMORB_PVD = "comorbPvd";
	public static final String COMORB_CVD = "comorbCvd";
	public static final String COMORB_DEMENTIA = "comorbDementia";
	public static final String COMORB_COPD = "comorbCopd";
	public static final String COMORB_CONN_TISS_DZ = "comorbConnTissDz";
	public static final String COMORB_PUD = "comorbPud";
	public static final String COMORB_MID_LIVER_DZ = "comorbMidLiverDz";
	public static final String COMORB_DIABETES = "comorbDiabetes";
	public static final String COMORB_DIAB_ORGAN_DMAGE = "comorbDiabOrganDmage";
	public static final String COMORB_HEMIPLEGIA = "comorbHemiplegia";
	public static final String COMORB_RENAL_DZ = "comorbRenalDz";
	public static final String COMORB_ANY_TUMOR = "comorbAnyTumor";
	public static final String COMORB_LYMPHOMA = "comorbLymphoma";
	public static final String COMORB_LEUKEMIA = "comorbLeukemia";
	public static final String COMORB_SEV_LIVER_DZ = "comorbSevLiverDz";
	public static final String COMORB_METS = "comorbMets";
	public static final String COMORB_AIDS = "comorbAids";
	public static final String COMORB_OTHER = "comorbOther";

	public void save(CoMorbidity transientInstance) {
		log.debug("saving CoMorbidity instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CoMorbidity persistentInstance) {
		log.debug("deleting CoMorbidity instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CoMorbidity findById(java.lang.Integer id) {
		log.debug("getting CoMorbidity instance with id: " + id);
		try {
			CoMorbidity instance = (CoMorbidity) getSession().get("com.medikm.dto.CoMorbidity", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CoMorbidity instance) {
		log.debug("finding CoMorbidity instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CoMorbidity").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CoMorbidity instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CoMorbidity as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByComorbCad(Object comorbCad) {
		return findByProperty(COMORB_CAD, comorbCad);
	}

	public List findByComorbHtn(Object comorbHtn) {
		return findByProperty(COMORB_HTN, comorbHtn);
	}

	public List findByComorbHyperlipidemia(Object comorbHyperlipidemia) {
		return findByProperty(COMORB_HYPERLIPIDEMIA, comorbHyperlipidemia);
	}

	public List findByComorbPneumonia(Object comorbPneumonia) {
		return findByProperty(COMORB_PNEUMONIA, comorbPneumonia);
	}

	public List findByComorbGerd(Object comorbGerd) {
		return findByProperty(COMORB_GERD, comorbGerd);
	}

	public List findByComorbArthritis(Object comorbArthritis) {
		return findByProperty(COMORB_ARTHRITIS, comorbArthritis);
	}

	public List findByComorbHypothyroidism(Object comorbHypothyroidism) {
		return findByProperty(COMORB_HYPOTHYROIDISM, comorbHypothyroidism);
	}

	public List findByComorbHyperthyroidism(Object comorbHyperthyroidism) {
		return findByProperty(COMORB_HYPERTHYROIDISM, comorbHyperthyroidism);
	}

	public List findByComorbMi(Object comorbMi) {
		return findByProperty(COMORB_MI, comorbMi);
	}

	public List findByComorbChf(Object comorbChf) {
		return findByProperty(COMORB_CHF, comorbChf);
	}

	public List findByComorbPvd(Object comorbPvd) {
		return findByProperty(COMORB_PVD, comorbPvd);
	}

	public List findByComorbCvd(Object comorbCvd) {
		return findByProperty(COMORB_CVD, comorbCvd);
	}

	public List findByComorbDementia(Object comorbDementia) {
		return findByProperty(COMORB_DEMENTIA, comorbDementia);
	}

	public List findByComorbCopd(Object comorbCopd) {
		return findByProperty(COMORB_COPD, comorbCopd);
	}

	public List findByComorbConnTissDz(Object comorbConnTissDz) {
		return findByProperty(COMORB_CONN_TISS_DZ, comorbConnTissDz);
	}

	public List findByComorbPud(Object comorbPud) {
		return findByProperty(COMORB_PUD, comorbPud);
	}

	public List findByComorbMidLiverDz(Object comorbMidLiverDz) {
		return findByProperty(COMORB_MID_LIVER_DZ, comorbMidLiverDz);
	}

	public List findByComorbDiabetes(Object comorbDiabetes) {
		return findByProperty(COMORB_DIABETES, comorbDiabetes);
	}

	public List findByComorbDiabOrganDmage(Object comorbDiabOrganDmage) {
		return findByProperty(COMORB_DIAB_ORGAN_DMAGE, comorbDiabOrganDmage);
	}

	public List findByComorbHemiplegia(Object comorbHemiplegia) {
		return findByProperty(COMORB_HEMIPLEGIA, comorbHemiplegia);
	}

	public List findByComorbRenalDz(Object comorbRenalDz) {
		return findByProperty(COMORB_RENAL_DZ, comorbRenalDz);
	}

	public List findByComorbAnyTumor(Object comorbAnyTumor) {
		return findByProperty(COMORB_ANY_TUMOR, comorbAnyTumor);
	}

	public List findByComorbLymphoma(Object comorbLymphoma) {
		return findByProperty(COMORB_LYMPHOMA, comorbLymphoma);
	}

	public List findByComorbLeukemia(Object comorbLeukemia) {
		return findByProperty(COMORB_LEUKEMIA, comorbLeukemia);
	}

	public List findByComorbSevLiverDz(Object comorbSevLiverDz) {
		return findByProperty(COMORB_SEV_LIVER_DZ, comorbSevLiverDz);
	}

	public List findByComorbMets(Object comorbMets) {
		return findByProperty(COMORB_METS, comorbMets);
	}

	public List findByComorbAids(Object comorbAids) {
		return findByProperty(COMORB_AIDS, comorbAids);
	}

	public List findByComorbOther(Object comorbOther) {
		return findByProperty(COMORB_OTHER, comorbOther);
	}

	public List findAll() {
		log.debug("finding all CoMorbidity instances");
		try {
			String queryString = "from CoMorbidity";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CoMorbidity merge(CoMorbidity detachedInstance) {
		log.debug("merging CoMorbidity instance");
		try {
			CoMorbidity result = (CoMorbidity) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CoMorbidity instance) {
		log.debug("attaching dirty CoMorbidity instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CoMorbidity instance) {
		log.debug("attaching clean CoMorbidity instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.FamilyHistory;

/**
 * A data access object (DAO) providing persistence and search support for
 * FamilyHistory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.FamilyHistory
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class FamilyHistoryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(FamilyHistoryDAO.class);
	// property constants
	public static final String NO_FIRST_DEGREE_RELATIVES_WITH_BC = "noFirstDegreeRelativesWithBc";
	public static final String YOUNGEST_AGE_DIAGNOSIS_FIRST_DEGREE_RELATIVES = "youngestAgeDiagnosisFirstDegreeRelatives";
	public static final String ANY_RELATIVE_BC_BEFORE50 = "anyRelativeBcBefore50";
	public static final String OVARIAN_CANCER = "ovarianCancer";
	public static final String OVARIAN_AND_BC = "ovarianAndBc";
	public static final String MALE_RELATIVE_WITH_BC = "maleRelativeWithBc";
	public static final String BILATERAL_BC = "bilateralBc";
	public static final String GENETIC_ABNORMALITIES = "geneticAbnormalities";
	public static final String GENETIC_ABNORMALITIES_COMM = "geneticAbnormalitiesComm";
	public static final String NO_FIRST_DEGREE_RELATIVES_BC = "noFirstDegreeRelativesBc";
	public static final String BRCA12 = "brca12";
	public static final String OTHER_CANCER = "otherCancer";
	public static final String THYROID_DISEASE = "thyroidDisease";
	public static final String FAMILY_HISTORY_COMMENTS = "familyHistoryComments";

	public void save(FamilyHistory transientInstance) {
		log.debug("saving FamilyHistory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FamilyHistory persistentInstance) {
		log.debug("deleting FamilyHistory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FamilyHistory findById(com.medikm.dto.FamilyHistoryId id) {
		log.debug("getting FamilyHistory instance with id: " + id);
		try {
			FamilyHistory instance = (FamilyHistory) getSession().get("com.medikm.dto.FamilyHistory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FamilyHistory instance) {
		log.debug("finding FamilyHistory instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.FamilyHistory").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding FamilyHistory instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from FamilyHistory as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNoFirstDegreeRelativesWithBc(Object noFirstDegreeRelativesWithBc) {
		return findByProperty(NO_FIRST_DEGREE_RELATIVES_WITH_BC, noFirstDegreeRelativesWithBc);
	}

	public List findByYoungestAgeDiagnosisFirstDegreeRelatives(Object youngestAgeDiagnosisFirstDegreeRelatives) {
		return findByProperty(YOUNGEST_AGE_DIAGNOSIS_FIRST_DEGREE_RELATIVES, youngestAgeDiagnosisFirstDegreeRelatives);
	}

	public List findByAnyRelativeBcBefore50(Object anyRelativeBcBefore50) {
		return findByProperty(ANY_RELATIVE_BC_BEFORE50, anyRelativeBcBefore50);
	}

	public List findByOvarianCancer(Object ovarianCancer) {
		return findByProperty(OVARIAN_CANCER, ovarianCancer);
	}

	public List findByOvarianAndBc(Object ovarianAndBc) {
		return findByProperty(OVARIAN_AND_BC, ovarianAndBc);
	}

	public List findByMaleRelativeWithBc(Object maleRelativeWithBc) {
		return findByProperty(MALE_RELATIVE_WITH_BC, maleRelativeWithBc);
	}

	public List findByBilateralBc(Object bilateralBc) {
		return findByProperty(BILATERAL_BC, bilateralBc);
	}

	public List findByGeneticAbnormalities(Object geneticAbnormalities) {
		return findByProperty(GENETIC_ABNORMALITIES, geneticAbnormalities);
	}

	public List findByGeneticAbnormalitiesComm(Object geneticAbnormalitiesComm) {
		return findByProperty(GENETIC_ABNORMALITIES_COMM, geneticAbnormalitiesComm);
	}

	public List findByNoFirstDegreeRelativesBc(Object noFirstDegreeRelativesBc) {
		return findByProperty(NO_FIRST_DEGREE_RELATIVES_BC, noFirstDegreeRelativesBc);
	}

	public List findByBrca12(Object brca12) {
		return findByProperty(BRCA12, brca12);
	}

	public List findByOtherCancer(Object otherCancer) {
		return findByProperty(OTHER_CANCER, otherCancer);
	}

	public List findByThyroidDisease(Object thyroidDisease) {
		return findByProperty(THYROID_DISEASE, thyroidDisease);
	}

	public List findByFamilyHistoryComments(Object familyHistoryComments) {
		return findByProperty(FAMILY_HISTORY_COMMENTS, familyHistoryComments);
	}

	public List findAll() {
		log.debug("finding all FamilyHistory instances");
		try {
			String queryString = "from FamilyHistory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FamilyHistory merge(FamilyHistory detachedInstance) {
		log.debug("merging FamilyHistory instance");
		try {
			FamilyHistory result = (FamilyHistory) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FamilyHistory instance) {
		log.debug("attaching dirty FamilyHistory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FamilyHistory instance) {
		log.debug("attaching clean FamilyHistory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
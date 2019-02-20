package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.RadiationTherapy;

/**
 * A data access object (DAO) providing persistence and search support for
 * RadiationTherapy entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.RadiationTherapy
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class RadiationTherapyDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(RadiationTherapyDAO.class);
	// property constants
	public static final String CLINICAL_ASSESSMENT = "clinicalAssessment";
	public static final String CT_BASE_TREATMENT_PLANNING = "ctBaseTreatmentPlanning";
	public static final String DOSE_DISTRIBUTION = "doseDistribution";
	public static final String BEAM_ARRAMGEMENT = "beamArramgement";
	public static final String RT_AREA = "rtArea";
	public static final String FRACTION_DOSE = "fractionDose";
	public static final String TOTAL_BREAST_DOSE = "totalBreastDose";
	public static final String BOOST_TUMOR_BED = "boostTumorBed";
	public static final String BOOST_TUMOR_BED_TYPE = "boostTumorBedType";
	public static final String BOOST_TUMOR_BED_DOSE = "boostTumorBedDose";
	public static final String CHEST_WALL_RAD = "chestWallRad";
	public static final String CT_BASED_CHEST_WALL_RAD_PLAN = "ctBasedChestWallRadPlan";
	public static final String REGIONAL_NODAL_RAD = "regionalNodalRad";
	public static final String CT_BASED_REG_NODAL_RAD_PLAN = "ctBasedRegNodalRadPlan";
	public static final String REG_NODAL_RAD_TOTAL_DOSE = "regNodalRadTotalDose";
	public static final String REG_NODAL_RAD_NO_FRACTION = "regNodalRadNoFraction";
	public static final String NO_RT_VISITS = "noRtVisits";
	public static final String ELAPSED_DAYS = "elapsedDays";
	public static final String LYMPHEDEMA = "lymphedema";
	public static final String CANDIDATE_MAMMOSITE = "candidateMammosite";
	public static final String TISSUE_EXPANSION = "tissueExpansion";
	public static final String COMPL_IMMED_RECONST_FOLLOW_RT = "complImmedReconstFollowRt";
	public static final String INTENDED_BENEFIT_RTHERA = "intendedBenefitRthera";
	public static final String RT_REASON_STOP = "rtReasonStop";

	public void save(RadiationTherapy transientInstance) {
		log.debug("saving RadiationTherapy instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RadiationTherapy persistentInstance) {
		log.debug("deleting RadiationTherapy instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RadiationTherapy findById(com.medikm.dto.RadiationTherapyId id) {
		log.debug("getting RadiationTherapy instance with id: " + id);
		try {
			RadiationTherapy instance = (RadiationTherapy) getSession().get("com.medikm.dto.RadiationTherapy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RadiationTherapy instance) {
		log.debug("finding RadiationTherapy instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.RadiationTherapy").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RadiationTherapy instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from RadiationTherapy as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByClinicalAssessment(Object clinicalAssessment) {
		return findByProperty(CLINICAL_ASSESSMENT, clinicalAssessment);
	}

	public List findByCtBaseTreatmentPlanning(Object ctBaseTreatmentPlanning) {
		return findByProperty(CT_BASE_TREATMENT_PLANNING, ctBaseTreatmentPlanning);
	}

	public List findByDoseDistribution(Object doseDistribution) {
		return findByProperty(DOSE_DISTRIBUTION, doseDistribution);
	}

	public List findByBeamArramgement(Object beamArramgement) {
		return findByProperty(BEAM_ARRAMGEMENT, beamArramgement);
	}

	public List findByRtArea(Object rtArea) {
		return findByProperty(RT_AREA, rtArea);
	}

	public List findByFractionDose(Object fractionDose) {
		return findByProperty(FRACTION_DOSE, fractionDose);
	}

	public List findByTotalBreastDose(Object totalBreastDose) {
		return findByProperty(TOTAL_BREAST_DOSE, totalBreastDose);
	}

	public List findByBoostTumorBed(Object boostTumorBed) {
		return findByProperty(BOOST_TUMOR_BED, boostTumorBed);
	}

	public List findByBoostTumorBedType(Object boostTumorBedType) {
		return findByProperty(BOOST_TUMOR_BED_TYPE, boostTumorBedType);
	}

	public List findByBoostTumorBedDose(Object boostTumorBedDose) {
		return findByProperty(BOOST_TUMOR_BED_DOSE, boostTumorBedDose);
	}

	public List findByChestWallRad(Object chestWallRad) {
		return findByProperty(CHEST_WALL_RAD, chestWallRad);
	}

	public List findByCtBasedChestWallRadPlan(Object ctBasedChestWallRadPlan) {
		return findByProperty(CT_BASED_CHEST_WALL_RAD_PLAN, ctBasedChestWallRadPlan);
	}

	public List findByRegionalNodalRad(Object regionalNodalRad) {
		return findByProperty(REGIONAL_NODAL_RAD, regionalNodalRad);
	}

	public List findByCtBasedRegNodalRadPlan(Object ctBasedRegNodalRadPlan) {
		return findByProperty(CT_BASED_REG_NODAL_RAD_PLAN, ctBasedRegNodalRadPlan);
	}

	public List findByRegNodalRadTotalDose(Object regNodalRadTotalDose) {
		return findByProperty(REG_NODAL_RAD_TOTAL_DOSE, regNodalRadTotalDose);
	}

	public List findByRegNodalRadNoFraction(Object regNodalRadNoFraction) {
		return findByProperty(REG_NODAL_RAD_NO_FRACTION, regNodalRadNoFraction);
	}

	public List findByNoRtVisits(Object noRtVisits) {
		return findByProperty(NO_RT_VISITS, noRtVisits);
	}

	public List findByElapsedDays(Object elapsedDays) {
		return findByProperty(ELAPSED_DAYS, elapsedDays);
	}

	public List findByLymphedema(Object lymphedema) {
		return findByProperty(LYMPHEDEMA, lymphedema);
	}

	public List findByCandidateMammosite(Object candidateMammosite) {
		return findByProperty(CANDIDATE_MAMMOSITE, candidateMammosite);
	}

	public List findByTissueExpansion(Object tissueExpansion) {
		return findByProperty(TISSUE_EXPANSION, tissueExpansion);
	}

	public List findByComplImmedReconstFollowRt(Object complImmedReconstFollowRt) {
		return findByProperty(COMPL_IMMED_RECONST_FOLLOW_RT, complImmedReconstFollowRt);
	}

	public List findByIntendedBenefitRthera(Object intendedBenefitRthera) {
		return findByProperty(INTENDED_BENEFIT_RTHERA, intendedBenefitRthera);
	}

	public List findByRtReasonStop(Object rtReasonStop) {
		return findByProperty(RT_REASON_STOP, rtReasonStop);
	}

	public List findAll() {
		log.debug("finding all RadiationTherapy instances");
		try {
			String queryString = "from RadiationTherapy";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RadiationTherapy merge(RadiationTherapy detachedInstance) {
		log.debug("merging RadiationTherapy instance");
		try {
			RadiationTherapy result = (RadiationTherapy) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RadiationTherapy instance) {
		log.debug("attaching dirty RadiationTherapy instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RadiationTherapy instance) {
		log.debug("attaching clean RadiationTherapy instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Preop;

/**
 * A data access object (DAO) providing persistence and search support for Preop
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.medikm.dto.Preop
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class PreopDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PreopDAO.class);
	// property constants
	public static final String WEIGHT_LOSS_THREE_MON = "weightLossThreeMon";
	public static final String HEMATURIA = "hematuria";
	public static final String MASS = "mass";
	public static final String PAIN = "pain";
	public static final String ANOREXIA = "anorexia";
	public static final String FEVERS = "fevers";
	public static final String CHILLS = "chills";
	public static final String NIGHT_SWEATS = "nightSweats";
	public static final String MALAISE = "malaise";
	public static final String BONE_PAIN = "bonePain";
	public static final String NEUROLOGIC_SYMPTOMS = "neurologicSymptoms";
	public static final String ECOG_STATUS = "ecogStatus";
	public static final String PREOP_CR_CL = "preopCrCl";
	public static final String PER_RENALSCAN_FN_LEFT = "perRenalscanFnLeft";
	public static final String PER_RENALSCAN_FN_RIGHT = "perRenalscanFnRight";
	public static final String STEROIDS_IN24HR = "steroidsIn24hr";
	public static final String CON_HEART_FAIL = "conHeartFail";
	public static final String COR_ART_DIS = "corArtDis";
	public static final String PER_VAS_DIS = "perVasDis";
	public static final String PRI_CARD_SURG = "priCardSurg";
	public static final String PRE_OP_CHEMO = "preOpChemo";
	public static final String PRE_OP_CHEMO_WHEN = "preOpChemoWhen";
	public static final String PRE_OP_XRT = "preOpXrt";
	public static final String PRE_OP_XRTWHEN = "preOpXrtwhen";
	public static final String CEREBRO_HX = "cerebroHx";
	public static final String INTERSTITAL_FIB = "interstitalFib";
	public static final String PUL_FUN_TEST_PERF = "pulFunTestPerf";
	public static final String PFTNOT_PER_REAS = "pftnotPerReas";
	public static final String FEVTEST_PER = "fevtestPer";
	public static final String FEV_VALUE = "fevValue";
	public static final String DLCOTES_PER = "dlcotesPer";
	public static final String DLCO_VALUE = "dlcoValue";
	public static final String ZUBROD_SCORE = "zubrodScore";
	public static final String LUNG_CANCER = "lungCancer";

	public void save(Preop transientInstance) {
		log.debug("saving Preop instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Preop persistentInstance) {
		log.debug("deleting Preop instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Preop findById(java.lang.Integer id) {
		log.debug("getting Preop instance with id: " + id);
		try {
			Preop instance = (Preop) getSession().get("com.medikm.dto.Preop", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Preop instance) {
		log.debug("finding Preop instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Preop").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Preop instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Preop as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByWeightLossThreeMon(Object weightLossThreeMon) {
		return findByProperty(WEIGHT_LOSS_THREE_MON, weightLossThreeMon);
	}

	public List findByHematuria(Object hematuria) {
		return findByProperty(HEMATURIA, hematuria);
	}

	public List findByMass(Object mass) {
		return findByProperty(MASS, mass);
	}

	public List findByPain(Object pain) {
		return findByProperty(PAIN, pain);
	}

	public List findByAnorexia(Object anorexia) {
		return findByProperty(ANOREXIA, anorexia);
	}

	public List findByFevers(Object fevers) {
		return findByProperty(FEVERS, fevers);
	}

	public List findByChills(Object chills) {
		return findByProperty(CHILLS, chills);
	}

	public List findByNightSweats(Object nightSweats) {
		return findByProperty(NIGHT_SWEATS, nightSweats);
	}

	public List findByMalaise(Object malaise) {
		return findByProperty(MALAISE, malaise);
	}

	public List findByBonePain(Object bonePain) {
		return findByProperty(BONE_PAIN, bonePain);
	}

	public List findByNeurologicSymptoms(Object neurologicSymptoms) {
		return findByProperty(NEUROLOGIC_SYMPTOMS, neurologicSymptoms);
	}

	public List findByEcogStatus(Object ecogStatus) {
		return findByProperty(ECOG_STATUS, ecogStatus);
	}

	public List findByPreopCrCl(Object preopCrCl) {
		return findByProperty(PREOP_CR_CL, preopCrCl);
	}

	public List findByPerRenalscanFnLeft(Object perRenalscanFnLeft) {
		return findByProperty(PER_RENALSCAN_FN_LEFT, perRenalscanFnLeft);
	}

	public List findByPerRenalscanFnRight(Object perRenalscanFnRight) {
		return findByProperty(PER_RENALSCAN_FN_RIGHT, perRenalscanFnRight);
	}

	public List findBySteroidsIn24hr(Object steroidsIn24hr) {
		return findByProperty(STEROIDS_IN24HR, steroidsIn24hr);
	}

	public List findByConHeartFail(Object conHeartFail) {
		return findByProperty(CON_HEART_FAIL, conHeartFail);
	}

	public List findByCorArtDis(Object corArtDis) {
		return findByProperty(COR_ART_DIS, corArtDis);
	}

	public List findByPerVasDis(Object perVasDis) {
		return findByProperty(PER_VAS_DIS, perVasDis);
	}

	public List findByPriCardSurg(Object priCardSurg) {
		return findByProperty(PRI_CARD_SURG, priCardSurg);
	}

	public List findByPreOpChemo(Object preOpChemo) {
		return findByProperty(PRE_OP_CHEMO, preOpChemo);
	}

	public List findByPreOpChemoWhen(Object preOpChemoWhen) {
		return findByProperty(PRE_OP_CHEMO_WHEN, preOpChemoWhen);
	}

	public List findByPreOpXrt(Object preOpXrt) {
		return findByProperty(PRE_OP_XRT, preOpXrt);
	}

	public List findByPreOpXrtwhen(Object preOpXrtwhen) {
		return findByProperty(PRE_OP_XRTWHEN, preOpXrtwhen);
	}

	public List findByCerebroHx(Object cerebroHx) {
		return findByProperty(CEREBRO_HX, cerebroHx);
	}

	public List findByInterstitalFib(Object interstitalFib) {
		return findByProperty(INTERSTITAL_FIB, interstitalFib);
	}

	public List findByPulFunTestPerf(Object pulFunTestPerf) {
		return findByProperty(PUL_FUN_TEST_PERF, pulFunTestPerf);
	}

	public List findByPftnotPerReas(Object pftnotPerReas) {
		return findByProperty(PFTNOT_PER_REAS, pftnotPerReas);
	}

	public List findByFevtestPer(Object fevtestPer) {
		return findByProperty(FEVTEST_PER, fevtestPer);
	}

	public List findByFevValue(Object fevValue) {
		return findByProperty(FEV_VALUE, fevValue);
	}

	public List findByDlcotesPer(Object dlcotesPer) {
		return findByProperty(DLCOTES_PER, dlcotesPer);
	}

	public List findByDlcoValue(Object dlcoValue) {
		return findByProperty(DLCO_VALUE, dlcoValue);
	}

	public List findByZubrodScore(Object zubrodScore) {
		return findByProperty(ZUBROD_SCORE, zubrodScore);
	}

	public List findByLungCancer(Object lungCancer) {
		return findByProperty(LUNG_CANCER, lungCancer);
	}

	public List findAll() {
		log.debug("finding all Preop instances");
		try {
			String queryString = "from Preop";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Preop merge(Preop detachedInstance) {
		log.debug("merging Preop instance");
		try {
			Preop result = (Preop) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Preop instance) {
		log.debug("attaching dirty Preop instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Preop instance) {
		log.debug("attaching clean Preop instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Surgery;

/**
 * A data access object (DAO) providing persistence and search support for
 * Surgery entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Surgery
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class SurgeryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(SurgeryDAO.class);
	// property constants
	public static final String PATIENT_ELIGIBLE_BC_SURG = "patientEligibleBcSurg";
	public static final String BREAST_CONSERVATION_SURGERY_MARGINS = "breastConservationSurgeryMargins";
	public static final String RESECTION_INVOLVED_MARGIN = "resectionInvolvedMargin";
	public static final String RESECTION_INVOLVED_MARGIN_COMM = "resectionInvolvedMarginComm";
	public static final String RESECTION_EEXCISION_CAVITY = "resectionEexcisionCavity";
	public static final String ORIENTATION_RESECTION_SN = "orientationResectionSn";
	public static final String ORIENTATION_RESECTION_SN_COMM = "orientationResectionSnComm";
	public static final String SKIN_SPEARING_MASTECTOMY_RT_CONSULT = "skinSpearingMastectomyRtConsult";
	public static final String SENTINEL_NODE_BIOPSY = "sentinelNodeBiopsy";
	public static final String SENTINEL_NODE_IDENTIFIED_DYE = "sentinelNodeIdentifiedDye";
	public static final String NO_SENTINE_NODES_REMOVED = "noSentineNodesRemoved";
	public static final String AXILLARY_NODE_DISSECTION = "axillaryNodeDissection";
	public static final String AXILLARY_DISECTION_NUMBER_NODE = "axillaryDisectionNumberNode";
	public static final String AMBU_BC_SURG_UNPLAN_ONIGHT_STAY = "ambuBcSurgUnplanONightStay";
	public static final String AMBULATORY_BC_SURGERY = "ambulatoryBcSurgery";
	public static final String PLASTIC_SURGEON_CONSULT = "plasticSurgeonConsult";
	public static final String RECONSTRUCTIVE_BS_IMPLANT = "reconstructiveBsImplant";
	public static final String IMMEDIATE_BREAST_RECONSTRUCTION = "immediateBreastReconstruction";
	public static final String DELAYED_BREAST_RECONSTRUCTION = "delayedBreastReconstruction";
	public static final String RECONSTRUCTIVE_BS_COMPLICATIONS = "reconstructiveBsComplications";
	public static final String RECONSTRUCTIVE_BS_COMPLICATIONS_COMM = "reconstructiveBsComplicationsComm";
	public static final String CONTRAINDICATION_BC = "contraindicationBc";
	public static final String CONTRAINDICATION_BC_COMM = "contraindicationBcComm";
	public static final String MED_CONSULT_PRE_SURGERY = "medConsultPreSurgery";
	public static final String MARGIN_MEASUREMENT = "marginMeasurement";
	public static final String TUMOR_INK = "tumorInk";
	public static final String PRIMARY_PROC_IND = "primaryProcInd";
	public static final String REASON_FOR_RET_TO_OR = "reasonForRetToOr";
	public static final String UNEXPECTED_RET_TO_OR = "unexpectedRetToOr";
	public static final String POST_OP_EVENT30DAY = "postOpEvent30day";
	public static final String DISPOSITION_AFTER_SURG = "dispositionAfterSurg";
	public static final String SUR_MARGIN_ASSESSMENT = "surMarginAssessment";
	public static final String BREAST_SIDE = "breastSide";
	public static final String BR_SURG_LOCATION = "brSurgLocation";
	public static final String ANESTHESIA_TYPE = "anesthesiaType";
	public static final String SUR_TIME_STATUS = "surTimeStatus";
	public static final String RE_OPERATION = "reOperation";
	public static final String INTRAOP_PRBC = "intraopPrbc";
	public static final String ASA_CLASSIFICATION = "asaClassification";
	public static final String TUMOUR_SPILL = "tumourSpill";

	public void save(Surgery transientInstance) {
		log.debug("saving Surgery instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Surgery persistentInstance) {
		log.debug("deleting Surgery instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Surgery findById(java.lang.Integer id) {
		log.debug("getting Surgery instance with id: " + id);
		try {
			Surgery instance = (Surgery) getSession().get("com.medikm.dto.Surgery", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Surgery instance) {
		log.debug("finding Surgery instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Surgery").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Surgery instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Surgery as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPatientEligibleBcSurg(Object patientEligibleBcSurg) {
		return findByProperty(PATIENT_ELIGIBLE_BC_SURG, patientEligibleBcSurg);
	}

	public List findByBreastConservationSurgeryMargins(Object breastConservationSurgeryMargins) {
		return findByProperty(BREAST_CONSERVATION_SURGERY_MARGINS, breastConservationSurgeryMargins);
	}

	public List findByResectionInvolvedMargin(Object resectionInvolvedMargin) {
		return findByProperty(RESECTION_INVOLVED_MARGIN, resectionInvolvedMargin);
	}

	public List findByResectionInvolvedMarginComm(Object resectionInvolvedMarginComm) {
		return findByProperty(RESECTION_INVOLVED_MARGIN_COMM, resectionInvolvedMarginComm);
	}

	public List findByResectionEexcisionCavity(Object resectionEexcisionCavity) {
		return findByProperty(RESECTION_EEXCISION_CAVITY, resectionEexcisionCavity);
	}

	public List findByOrientationResectionSn(Object orientationResectionSn) {
		return findByProperty(ORIENTATION_RESECTION_SN, orientationResectionSn);
	}

	public List findByOrientationResectionSnComm(Object orientationResectionSnComm) {
		return findByProperty(ORIENTATION_RESECTION_SN_COMM, orientationResectionSnComm);
	}

	public List findBySkinSpearingMastectomyRtConsult(Object skinSpearingMastectomyRtConsult) {
		return findByProperty(SKIN_SPEARING_MASTECTOMY_RT_CONSULT, skinSpearingMastectomyRtConsult);
	}

	public List findBySentinelNodeBiopsy(Object sentinelNodeBiopsy) {
		return findByProperty(SENTINEL_NODE_BIOPSY, sentinelNodeBiopsy);
	}

	public List findBySentinelNodeIdentifiedDye(Object sentinelNodeIdentifiedDye) {
		return findByProperty(SENTINEL_NODE_IDENTIFIED_DYE, sentinelNodeIdentifiedDye);
	}

	public List findByNoSentineNodesRemoved(Object noSentineNodesRemoved) {
		return findByProperty(NO_SENTINE_NODES_REMOVED, noSentineNodesRemoved);
	}

	public List findByAxillaryNodeDissection(Object axillaryNodeDissection) {
		return findByProperty(AXILLARY_NODE_DISSECTION, axillaryNodeDissection);
	}

	public List findByAxillaryDisectionNumberNode(Object axillaryDisectionNumberNode) {
		return findByProperty(AXILLARY_DISECTION_NUMBER_NODE, axillaryDisectionNumberNode);
	}

	public List findByAmbuBcSurgUnplanONightStay(Object ambuBcSurgUnplanONightStay) {
		return findByProperty(AMBU_BC_SURG_UNPLAN_ONIGHT_STAY, ambuBcSurgUnplanONightStay);
	}

	public List findByAmbulatoryBcSurgery(Object ambulatoryBcSurgery) {
		return findByProperty(AMBULATORY_BC_SURGERY, ambulatoryBcSurgery);
	}

	public List findByPlasticSurgeonConsult(Object plasticSurgeonConsult) {
		return findByProperty(PLASTIC_SURGEON_CONSULT, plasticSurgeonConsult);
	}

	public List findByReconstructiveBsImplant(Object reconstructiveBsImplant) {
		return findByProperty(RECONSTRUCTIVE_BS_IMPLANT, reconstructiveBsImplant);
	}

	public List findByImmediateBreastReconstruction(Object immediateBreastReconstruction) {
		return findByProperty(IMMEDIATE_BREAST_RECONSTRUCTION, immediateBreastReconstruction);
	}

	public List findByDelayedBreastReconstruction(Object delayedBreastReconstruction) {
		return findByProperty(DELAYED_BREAST_RECONSTRUCTION, delayedBreastReconstruction);
	}

	public List findByReconstructiveBsComplications(Object reconstructiveBsComplications) {
		return findByProperty(RECONSTRUCTIVE_BS_COMPLICATIONS, reconstructiveBsComplications);
	}

	public List findByReconstructiveBsComplicationsComm(Object reconstructiveBsComplicationsComm) {
		return findByProperty(RECONSTRUCTIVE_BS_COMPLICATIONS_COMM, reconstructiveBsComplicationsComm);
	}

	public List findByContraindicationBc(Object contraindicationBc) {
		return findByProperty(CONTRAINDICATION_BC, contraindicationBc);
	}

	public List findByContraindicationBcComm(Object contraindicationBcComm) {
		return findByProperty(CONTRAINDICATION_BC_COMM, contraindicationBcComm);
	}

	public List findByMedConsultPreSurgery(Object medConsultPreSurgery) {
		return findByProperty(MED_CONSULT_PRE_SURGERY, medConsultPreSurgery);
	}

	public List findByMarginMeasurement(Object marginMeasurement) {
		return findByProperty(MARGIN_MEASUREMENT, marginMeasurement);
	}

	public List findByTumorInk(Object tumorInk) {
		return findByProperty(TUMOR_INK, tumorInk);
	}

	public List findByPrimaryProcInd(Object primaryProcInd) {
		return findByProperty(PRIMARY_PROC_IND, primaryProcInd);
	}

	public List findByReasonForRetToOr(Object reasonForRetToOr) {
		return findByProperty(REASON_FOR_RET_TO_OR, reasonForRetToOr);
	}

	public List findByUnexpectedRetToOr(Object unexpectedRetToOr) {
		return findByProperty(UNEXPECTED_RET_TO_OR, unexpectedRetToOr);
	}

	public List findByPostOpEvent30day(Object postOpEvent30day) {
		return findByProperty(POST_OP_EVENT30DAY, postOpEvent30day);
	}

	public List findByDispositionAfterSurg(Object dispositionAfterSurg) {
		return findByProperty(DISPOSITION_AFTER_SURG, dispositionAfterSurg);
	}

	public List findBySurMarginAssessment(Object surMarginAssessment) {
		return findByProperty(SUR_MARGIN_ASSESSMENT, surMarginAssessment);
	}

	public List findByBreastSide(Object breastSide) {
		return findByProperty(BREAST_SIDE, breastSide);
	}

	public List findByBrSurgLocation(Object brSurgLocation) {
		return findByProperty(BR_SURG_LOCATION, brSurgLocation);
	}

	public List findByAnesthesiaType(Object anesthesiaType) {
		return findByProperty(ANESTHESIA_TYPE, anesthesiaType);
	}

	public List findBySurTimeStatus(Object surTimeStatus) {
		return findByProperty(SUR_TIME_STATUS, surTimeStatus);
	}

	public List findByReOperation(Object reOperation) {
		return findByProperty(RE_OPERATION, reOperation);
	}

	public List findByIntraopPrbc(Object intraopPrbc) {
		return findByProperty(INTRAOP_PRBC, intraopPrbc);
	}

	public List findByAsaClassification(Object asaClassification) {
		return findByProperty(ASA_CLASSIFICATION, asaClassification);
	}

	public List findByTumourSpill(Object tumourSpill) {
		return findByProperty(TUMOUR_SPILL, tumourSpill);
	}

	public List findAll() {
		log.debug("finding all Surgery instances");
		try {
			String queryString = "from Surgery";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Surgery merge(Surgery detachedInstance) {
		log.debug("merging Surgery instance");
		try {
			Surgery result = (Surgery) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Surgery instance) {
		log.debug("attaching dirty Surgery instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Surgery instance) {
		log.debug("attaching clean Surgery instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
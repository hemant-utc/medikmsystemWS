package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.TumorBoardDiscussion;

/**
 * A data access object (DAO) providing persistence and search support for
 * TumorBoardDiscussion entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.TumorBoardDiscussion
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class TumorBoardDiscussionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TumorBoardDiscussionDAO.class);
	// property constants
	public static final String PRIMARY_QUESTION_ASKED_TO_TB = "primaryQuestionAskedToTb";
	public static final String PUB_RESEARCH_USED = "pubResearchUsed";
	public static final String NCCN_GUIDELINE_MET = "nccnGuidelineMet";
	public static final String NCCN_GUIDELINE_MET_COMMENT = "nccnGuidelineMetComment";
	public static final String PATIENT_INPUT_CONSIDERED = "patientInputConsidered";
	public static final String PATIENT_INPUT_CONSIDERED_COMMENT = "patientInputConsideredComment";
	public static final String PATIENT_PREFERENCES = "patientPreferences";
	public static final String CONSENSUS_REACHED = "consensusReached";
	public static final String CONSENSUS_REACHED_COMMENT = "consensusReachedComment";
	public static final String FINAL_TB_RECOMMENDATION = "finalTbRecommendation";
	public static final String RESCHEDULED_FU_TB_DISCUSSION = "rescheduledFuTbDiscussion";
	public static final String RESCHEDULED_FU_TB_DISCUSSION_COMM = "rescheduledFuTbDiscussionComm";
	public static final String OPTIONS_GENERATED = "optionsGenerated";
	public static final String CONVERGING_OPINIONS = "convergingOpinions";
	public static final String CONVERGING_OPINIONS_COMMENT = "convergingOpinionsComment";
	public static final String DIVERGING_OPINIOS = "divergingOpinios";
	public static final String DIVERGING_OPINIOS_COMMENT = "divergingOpiniosComment";
	public static final String ADDITIONAL_EVIDENCE = "additionalEvidence";
	public static final String LITERATURE_CONSULTED = "literatureConsulted";
	public static final String IS_ALGORITHM_USED = "isAlgorithmUsed";
	public static final String IS_ALGORITHM_USED_COMMENT = "isAlgorithmUsedComment";
	public static final String CLINICAL_TRAILS_ELIGIBLE = "clinicalTrailsEligible";
	public static final String CLINICAL_TRAILS_DISCUSSED = "clinicalTrailsDiscussed";
	public static final String CLINICAL_TRAILS_COMMENT = "clinicalTrailsComment";
	public static final String COMPARATIVE_EFFECTIVENESS_ANALYSIS = "comparativeEffectivenessAnalysis";
	public static final String OPTIONS_CONSIDERED = "optionsConsidered";
	public static final String STATUS = "status";

	public void save(TumorBoardDiscussion transientInstance) {
		log.debug("saving TumorBoardDiscussion instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TumorBoardDiscussion persistentInstance) {
		log.debug("deleting TumorBoardDiscussion instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TumorBoardDiscussion findById(java.lang.Integer id) {
		log.debug("getting TumorBoardDiscussion instance with id: " + id);
		try {
			TumorBoardDiscussion instance = (TumorBoardDiscussion) getSession()
					.get("com.medikm.dto.TumorBoardDiscussion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TumorBoardDiscussion instance) {
		log.debug("finding TumorBoardDiscussion instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.TumorBoardDiscussion")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TumorBoardDiscussion instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TumorBoardDiscussion as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPrimaryQuestionAskedToTb(Object primaryQuestionAskedToTb) {
		return findByProperty(PRIMARY_QUESTION_ASKED_TO_TB, primaryQuestionAskedToTb);
	}

	public List findByPubResearchUsed(Object pubResearchUsed) {
		return findByProperty(PUB_RESEARCH_USED, pubResearchUsed);
	}

	public List findByNccnGuidelineMet(Object nccnGuidelineMet) {
		return findByProperty(NCCN_GUIDELINE_MET, nccnGuidelineMet);
	}

	public List findByNccnGuidelineMetComment(Object nccnGuidelineMetComment) {
		return findByProperty(NCCN_GUIDELINE_MET_COMMENT, nccnGuidelineMetComment);
	}

	public List findByPatientInputConsidered(Object patientInputConsidered) {
		return findByProperty(PATIENT_INPUT_CONSIDERED, patientInputConsidered);
	}

	public List findByPatientInputConsideredComment(Object patientInputConsideredComment) {
		return findByProperty(PATIENT_INPUT_CONSIDERED_COMMENT, patientInputConsideredComment);
	}

	public List findByPatientPreferences(Object patientPreferences) {
		return findByProperty(PATIENT_PREFERENCES, patientPreferences);
	}

	public List findByConsensusReached(Object consensusReached) {
		return findByProperty(CONSENSUS_REACHED, consensusReached);
	}

	public List findByConsensusReachedComment(Object consensusReachedComment) {
		return findByProperty(CONSENSUS_REACHED_COMMENT, consensusReachedComment);
	}

	public List findByFinalTbRecommendation(Object finalTbRecommendation) {
		return findByProperty(FINAL_TB_RECOMMENDATION, finalTbRecommendation);
	}

	public List findByRescheduledFuTbDiscussion(Object rescheduledFuTbDiscussion) {
		return findByProperty(RESCHEDULED_FU_TB_DISCUSSION, rescheduledFuTbDiscussion);
	}

	public List findByRescheduledFuTbDiscussionComm(Object rescheduledFuTbDiscussionComm) {
		return findByProperty(RESCHEDULED_FU_TB_DISCUSSION_COMM, rescheduledFuTbDiscussionComm);
	}

	public List findByOptionsGenerated(Object optionsGenerated) {
		return findByProperty(OPTIONS_GENERATED, optionsGenerated);
	}

	public List findByConvergingOpinions(Object convergingOpinions) {
		return findByProperty(CONVERGING_OPINIONS, convergingOpinions);
	}

	public List findByConvergingOpinionsComment(Object convergingOpinionsComment) {
		return findByProperty(CONVERGING_OPINIONS_COMMENT, convergingOpinionsComment);
	}

	public List findByDivergingOpinios(Object divergingOpinios) {
		return findByProperty(DIVERGING_OPINIOS, divergingOpinios);
	}

	public List findByDivergingOpiniosComment(Object divergingOpiniosComment) {
		return findByProperty(DIVERGING_OPINIOS_COMMENT, divergingOpiniosComment);
	}

	public List findByAdditionalEvidence(Object additionalEvidence) {
		return findByProperty(ADDITIONAL_EVIDENCE, additionalEvidence);
	}

	public List findByLiteratureConsulted(Object literatureConsulted) {
		return findByProperty(LITERATURE_CONSULTED, literatureConsulted);
	}

	public List findByIsAlgorithmUsed(Object isAlgorithmUsed) {
		return findByProperty(IS_ALGORITHM_USED, isAlgorithmUsed);
	}

	public List findByIsAlgorithmUsedComment(Object isAlgorithmUsedComment) {
		return findByProperty(IS_ALGORITHM_USED_COMMENT, isAlgorithmUsedComment);
	}

	public List findByClinicalTrailsEligible(Object clinicalTrailsEligible) {
		return findByProperty(CLINICAL_TRAILS_ELIGIBLE, clinicalTrailsEligible);
	}

	public List findByClinicalTrailsDiscussed(Object clinicalTrailsDiscussed) {
		return findByProperty(CLINICAL_TRAILS_DISCUSSED, clinicalTrailsDiscussed);
	}

	public List findByClinicalTrailsComment(Object clinicalTrailsComment) {
		return findByProperty(CLINICAL_TRAILS_COMMENT, clinicalTrailsComment);
	}

	public List findByComparativeEffectivenessAnalysis(Object comparativeEffectivenessAnalysis) {
		return findByProperty(COMPARATIVE_EFFECTIVENESS_ANALYSIS, comparativeEffectivenessAnalysis);
	}

	public List findByOptionsConsidered(Object optionsConsidered) {
		return findByProperty(OPTIONS_CONSIDERED, optionsConsidered);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all TumorBoardDiscussion instances");
		try {
			String queryString = "from TumorBoardDiscussion";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TumorBoardDiscussion merge(TumorBoardDiscussion detachedInstance) {
		log.debug("merging TumorBoardDiscussion instance");
		try {
			TumorBoardDiscussion result = (TumorBoardDiscussion) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TumorBoardDiscussion instance) {
		log.debug("attaching dirty TumorBoardDiscussion instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TumorBoardDiscussion instance) {
		log.debug("attaching clean TumorBoardDiscussion instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
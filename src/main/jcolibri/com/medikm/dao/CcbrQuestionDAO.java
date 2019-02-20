package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.CcbrQuestion;

/**
 * A data access object (DAO) providing persistence and search support for
 * CcbrQuestion entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.medikm.dto.CcbrQuestion
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class CcbrQuestionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CcbrQuestionDAO.class);
	// property constants
	public static final String EXCLUDE1 = "exclude1";
	public static final String EXCLUDE2 = "exclude2";
	public static final String EXCLUDE3 = "exclude3";
	public static final String QUESTIOM_TEXT = "questiomText";
	public static final String RATIONAL = "rational";
	public static final String REFERENCE_KNOWLEDGE = "referenceKnowledge";
	public static final String SOLUTION_AVAILABLE = "solutionAvailable";
	public static final String SOURCE = "source";
	public static final String COMMENTS = "comments";
	public static final String QRP_AGE = "qrpAge";
	public static final String QRP_ER = "qrpEr";
	public static final String QRP_PR = "qrpPr";
	public static final String QRP_GENETICS = "qrpGenetics";
	public static final String QRP_GENOMICS = "qrpGenomics";
	public static final String QRP_CANCER_TYPE = "qrpCancerType";
	public static final String QRP_TUMOR_SIZE = "qrpTumorSize";
	public static final String QRP_NODES = "qrpNodes";
	public static final String QRP_WORKING_TNM = "qrpWorkingTnm";
	public static final String QRP_FINAL_TNM = "qrpFinalTnm";
	public static final String QRP_GRADE = "qrpGrade";
	public static final String QRP_HER2NEU = "qrpHer2neu";
	public static final String QRP_HER2NEU_SISH = "qrpHer2neuSish";
	public static final String QRP_DISTANT_MET = "qrpDistantMet";
	public static final String QRP_GENDER = "qrpGender";
	public static final String QRP_MENOPAUSE = "qrpMenopause";
	public static final String QRP_SIGNIFICANCE_RISK = "qrpSignificanceRisk";
	public static final String QRP_SIGNIFICANCE_COMORBITIES = "qrpSignificanceComorbities";

	public void save(CcbrQuestion transientInstance) {
		log.debug("saving CcbrQuestion instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CcbrQuestion persistentInstance) {
		log.debug("deleting CcbrQuestion instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CcbrQuestion findById(java.lang.Integer id) {
		log.debug("getting CcbrQuestion instance with id: " + id);
		try {
			CcbrQuestion instance = (CcbrQuestion) getSession().get("com.medikm.dto.CcbrQuestion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CcbrQuestion instance) {
		log.debug("finding CcbrQuestion instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.CcbrQuestion").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CcbrQuestion instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CcbrQuestion as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByExclude1(Object exclude1) {
		return findByProperty(EXCLUDE1, exclude1);
	}

	public List findByExclude2(Object exclude2) {
		return findByProperty(EXCLUDE2, exclude2);
	}

	public List findByExclude3(Object exclude3) {
		return findByProperty(EXCLUDE3, exclude3);
	}

	public List findByQuestiomText(Object questiomText) {
		return findByProperty(QUESTIOM_TEXT, questiomText);
	}

	public List findByRational(Object rational) {
		return findByProperty(RATIONAL, rational);
	}

	public List findByReferenceKnowledge(Object referenceKnowledge) {
		return findByProperty(REFERENCE_KNOWLEDGE, referenceKnowledge);
	}

	public List findBySolutionAvailable(Object solutionAvailable) {
		return findByProperty(SOLUTION_AVAILABLE, solutionAvailable);
	}

	public List findBySource(Object source) {
		return findByProperty(SOURCE, source);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findByQrpAge(Object qrpAge) {
		return findByProperty(QRP_AGE, qrpAge);
	}

	public List findByQrpEr(Object qrpEr) {
		return findByProperty(QRP_ER, qrpEr);
	}

	public List findByQrpPr(Object qrpPr) {
		return findByProperty(QRP_PR, qrpPr);
	}

	public List findByQrpGenetics(Object qrpGenetics) {
		return findByProperty(QRP_GENETICS, qrpGenetics);
	}

	public List findByQrpGenomics(Object qrpGenomics) {
		return findByProperty(QRP_GENOMICS, qrpGenomics);
	}

	public List findByQrpCancerType(Object qrpCancerType) {
		return findByProperty(QRP_CANCER_TYPE, qrpCancerType);
	}

	public List findByQrpTumorSize(Object qrpTumorSize) {
		return findByProperty(QRP_TUMOR_SIZE, qrpTumorSize);
	}

	public List findByQrpNodes(Object qrpNodes) {
		return findByProperty(QRP_NODES, qrpNodes);
	}

	public List findByQrpWorkingTnm(Object qrpWorkingTnm) {
		return findByProperty(QRP_WORKING_TNM, qrpWorkingTnm);
	}

	public List findByQrpFinalTnm(Object qrpFinalTnm) {
		return findByProperty(QRP_FINAL_TNM, qrpFinalTnm);
	}

	public List findByQrpGrade(Object qrpGrade) {
		return findByProperty(QRP_GRADE, qrpGrade);
	}

	public List findByQrpHer2neu(Object qrpHer2neu) {
		return findByProperty(QRP_HER2NEU, qrpHer2neu);
	}

	public List findByQrpHer2neuSish(Object qrpHer2neuSish) {
		return findByProperty(QRP_HER2NEU_SISH, qrpHer2neuSish);
	}

	public List findByQrpDistantMet(Object qrpDistantMet) {
		return findByProperty(QRP_DISTANT_MET, qrpDistantMet);
	}

	public List findByQrpGender(Object qrpGender) {
		return findByProperty(QRP_GENDER, qrpGender);
	}

	public List findByQrpMenopause(Object qrpMenopause) {
		return findByProperty(QRP_MENOPAUSE, qrpMenopause);
	}

	public List findByQrpSignificanceRisk(Object qrpSignificanceRisk) {
		return findByProperty(QRP_SIGNIFICANCE_RISK, qrpSignificanceRisk);
	}

	public List findByQrpSignificanceComorbities(Object qrpSignificanceComorbities) {
		return findByProperty(QRP_SIGNIFICANCE_COMORBITIES, qrpSignificanceComorbities);
	}

	public List findAll() {
		log.debug("finding all CcbrQuestion instances");
		try {
			String queryString = "from CcbrQuestion";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CcbrQuestion merge(CcbrQuestion detachedInstance) {
		log.debug("merging CcbrQuestion instance");
		try {
			CcbrQuestion result = (CcbrQuestion) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CcbrQuestion instance) {
		log.debug("attaching dirty CcbrQuestion instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CcbrQuestion instance) {
		log.debug("attaching clean CcbrQuestion instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
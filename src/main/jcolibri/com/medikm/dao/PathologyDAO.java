package com.medikm.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.medikm.dto.Pathology;

/**
 * A data access object (DAO) providing persistence and search support for
 * Pathology entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.medikm.dto.Pathology
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class PathologyDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PathologyDAO.class);
	// property constants
	public static final String _PRPT_ID = "PRptId";
	public static final String GROSS_SM_DESCRIPTION = "grossSmDescription";
	public static final String TUMOR_SIZE = "tumorSize";
	public static final String SIZE_INVASIVE_COMPONENT = "sizeInvasiveComponent";
	public static final String SIZE_DCIS_COMPONENT = "sizeDcisComponent";
	public static final String MARGINS_STATUS = "marginsStatus";
	public static final String MARGINS_VALUE = "marginsValue";
	public static final String HE_SERIAL_SECTIONS = "heSerialSections";
	public static final String SPECIAL_STEINS = "specialSteins";
	public static final String SPECIAL_STEINS_COMM = "specialSteinsComm";
	public static final String TUMOR_LOCATION = "tumorLocation";
	public static final String MULTIFOCAL = "multifocal";
	public static final String MULTIFOCAL_COMM = "multifocalComm";
	public static final String MULTICENTRIC = "multicentric";
	public static final String MULTICENTRIC_COMM = "multicentricComm";
	public static final String DISSEMINATED_DCIS = "disseminatedDcis";
	public static final String DISSEMINATED_DCIS_COMM = "disseminatedDcisComm";
	public static final String ER_STATUS = "erStatus";
	public static final String ER_PERCENT = "erPercent";
	public static final String PR_STATUS = "prStatus";
	public static final String PR_PERCENT = "prPercent";
	public static final String HER2NEU_STATUS = "her2neuStatus";
	public static final String HER2NEU_SISH = "her2neuSish";
	public static final String HISTOLOGICAL_GRADE = "histologicalGrade";
	public static final String LYMPH_NODE_IDENTIFIED = "lymphNodeIdentified";
	public static final String SIZE_LARGEST_LYMPH_NODE = "sizeLargestLymphNode";
	public static final String EXTRA_NODAL_FATEXTENSION = "extraNodalFatextension";
	public static final String NEGTIVE_NODE = "negtiveNode";
	public static final String POSITIVE_NODE = "positiveNode";
	public static final String LYMPH_NODE_ANALYSIS = "lymphNodeAnalysis";
	public static final String LYMPHOVASCULAR_INVASION = "lymphovascularInvasion";
	public static final String LYMPHOVASCULAR_INVASION_COMM = "lymphovascularInvasionComm";
	public static final String NO_NODE_RESECTED = "noNodeResected";
	public static final String NO_NODE_WITH_METASTATIC_CANCER = "noNodeWithMetastaticCancer";
	public static final String ANY_MATTED_NODES = "anyMattedNodes";
	public static final String FISH_RATING = "fishRating";
	public static final String FISH_VALUE = "fishValue";
	public static final String NUCLEAR_GRADE = "nuclearGrade";
	public static final String DERM_LYMPH_INV = "dermLymphInv";
	public static final String VASC_LYMPH_INV = "vascLymphInv";
	public static final String DCISEXT_IDCOMP = "dcisextIdcomp";
	public static final String TUM_NECROSIS = "tumNecrosis";
	public static final String SITE_OF_DISTANT_METS = "siteOfDistantMets";
	public static final String ONCOTYPE_DX = "oncotypeDx";
	public static final String ALLRED_ER = "allredEr";
	public static final String ALLRED_PR = "allredPr";
	public static final String SBR_GRADE = "sbrGrade";

	public void save(Pathology transientInstance) {
		log.debug("saving Pathology instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Pathology persistentInstance) {
		log.debug("deleting Pathology instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Pathology findById(java.lang.Integer id) {
		log.debug("getting Pathology instance with id: " + id);
		try {
			Pathology instance = (Pathology) getSession().get("com.medikm.dto.Pathology", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Pathology instance) {
		log.debug("finding Pathology instance by example");
		try {
			List results = getSession().createCriteria("com.medikm.dto.Pathology").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Pathology instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Pathology as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPRptId(Object PRptId) {
		return findByProperty(_PRPT_ID, PRptId);
	}

	public List findByGrossSmDescription(Object grossSmDescription) {
		return findByProperty(GROSS_SM_DESCRIPTION, grossSmDescription);
	}

	public List findByTumorSize(Object tumorSize) {
		return findByProperty(TUMOR_SIZE, tumorSize);
	}

	public List findBySizeInvasiveComponent(Object sizeInvasiveComponent) {
		return findByProperty(SIZE_INVASIVE_COMPONENT, sizeInvasiveComponent);
	}

	public List findBySizeDcisComponent(Object sizeDcisComponent) {
		return findByProperty(SIZE_DCIS_COMPONENT, sizeDcisComponent);
	}

	public List findByMarginsStatus(Object marginsStatus) {
		return findByProperty(MARGINS_STATUS, marginsStatus);
	}

	public List findByMarginsValue(Object marginsValue) {
		return findByProperty(MARGINS_VALUE, marginsValue);
	}

	public List findByHeSerialSections(Object heSerialSections) {
		return findByProperty(HE_SERIAL_SECTIONS, heSerialSections);
	}

	public List findBySpecialSteins(Object specialSteins) {
		return findByProperty(SPECIAL_STEINS, specialSteins);
	}

	public List findBySpecialSteinsComm(Object specialSteinsComm) {
		return findByProperty(SPECIAL_STEINS_COMM, specialSteinsComm);
	}

	public List findByTumorLocation(Object tumorLocation) {
		return findByProperty(TUMOR_LOCATION, tumorLocation);
	}

	public List findByMultifocal(Object multifocal) {
		return findByProperty(MULTIFOCAL, multifocal);
	}

	public List findByMultifocalComm(Object multifocalComm) {
		return findByProperty(MULTIFOCAL_COMM, multifocalComm);
	}

	public List findByMulticentric(Object multicentric) {
		return findByProperty(MULTICENTRIC, multicentric);
	}

	public List findByMulticentricComm(Object multicentricComm) {
		return findByProperty(MULTICENTRIC_COMM, multicentricComm);
	}

	public List findByDisseminatedDcis(Object disseminatedDcis) {
		return findByProperty(DISSEMINATED_DCIS, disseminatedDcis);
	}

	public List findByDisseminatedDcisComm(Object disseminatedDcisComm) {
		return findByProperty(DISSEMINATED_DCIS_COMM, disseminatedDcisComm);
	}

	public List findByErStatus(Object erStatus) {
		return findByProperty(ER_STATUS, erStatus);
	}

	public List findByErPercent(Object erPercent) {
		return findByProperty(ER_PERCENT, erPercent);
	}

	public List findByPrStatus(Object prStatus) {
		return findByProperty(PR_STATUS, prStatus);
	}

	public List findByPrPercent(Object prPercent) {
		return findByProperty(PR_PERCENT, prPercent);
	}

	public List findByHer2neuStatus(Object her2neuStatus) {
		return findByProperty(HER2NEU_STATUS, her2neuStatus);
	}

	public List findByHer2neuSish(Object her2neuSish) {
		return findByProperty(HER2NEU_SISH, her2neuSish);
	}

	public List findByHistologicalGrade(Object histologicalGrade) {
		return findByProperty(HISTOLOGICAL_GRADE, histologicalGrade);
	}

	public List findByLymphNodeIdentified(Object lymphNodeIdentified) {
		return findByProperty(LYMPH_NODE_IDENTIFIED, lymphNodeIdentified);
	}

	public List findBySizeLargestLymphNode(Object sizeLargestLymphNode) {
		return findByProperty(SIZE_LARGEST_LYMPH_NODE, sizeLargestLymphNode);
	}

	public List findByExtraNodalFatextension(Object extraNodalFatextension) {
		return findByProperty(EXTRA_NODAL_FATEXTENSION, extraNodalFatextension);
	}

	public List findByNegtiveNode(Object negtiveNode) {
		return findByProperty(NEGTIVE_NODE, negtiveNode);
	}

	public List findByPositiveNode(Object positiveNode) {
		return findByProperty(POSITIVE_NODE, positiveNode);
	}

	public List findByLymphNodeAnalysis(Object lymphNodeAnalysis) {
		return findByProperty(LYMPH_NODE_ANALYSIS, lymphNodeAnalysis);
	}

	public List findByLymphovascularInvasion(Object lymphovascularInvasion) {
		return findByProperty(LYMPHOVASCULAR_INVASION, lymphovascularInvasion);
	}

	public List findByLymphovascularInvasionComm(Object lymphovascularInvasionComm) {
		return findByProperty(LYMPHOVASCULAR_INVASION_COMM, lymphovascularInvasionComm);
	}

	public List findByNoNodeResected(Object noNodeResected) {
		return findByProperty(NO_NODE_RESECTED, noNodeResected);
	}

	public List findByNoNodeWithMetastaticCancer(Object noNodeWithMetastaticCancer) {
		return findByProperty(NO_NODE_WITH_METASTATIC_CANCER, noNodeWithMetastaticCancer);
	}

	public List findByAnyMattedNodes(Object anyMattedNodes) {
		return findByProperty(ANY_MATTED_NODES, anyMattedNodes);
	}

	public List findByFishRating(Object fishRating) {
		return findByProperty(FISH_RATING, fishRating);
	}

	public List findByFishValue(Object fishValue) {
		return findByProperty(FISH_VALUE, fishValue);
	}

	public List findByNuclearGrade(Object nuclearGrade) {
		return findByProperty(NUCLEAR_GRADE, nuclearGrade);
	}

	public List findByDermLymphInv(Object dermLymphInv) {
		return findByProperty(DERM_LYMPH_INV, dermLymphInv);
	}

	public List findByVascLymphInv(Object vascLymphInv) {
		return findByProperty(VASC_LYMPH_INV, vascLymphInv);
	}

	public List findByDcisextIdcomp(Object dcisextIdcomp) {
		return findByProperty(DCISEXT_IDCOMP, dcisextIdcomp);
	}

	public List findByTumNecrosis(Object tumNecrosis) {
		return findByProperty(TUM_NECROSIS, tumNecrosis);
	}

	public List findBySiteOfDistantMets(Object siteOfDistantMets) {
		return findByProperty(SITE_OF_DISTANT_METS, siteOfDistantMets);
	}

	public List findByOncotypeDx(Object oncotypeDx) {
		return findByProperty(ONCOTYPE_DX, oncotypeDx);
	}

	public List findByAllredEr(Object allredEr) {
		return findByProperty(ALLRED_ER, allredEr);
	}

	public List findByAllredPr(Object allredPr) {
		return findByProperty(ALLRED_PR, allredPr);
	}

	public List findBySbrGrade(Object sbrGrade) {
		return findByProperty(SBR_GRADE, sbrGrade);
	}

	public List findAll() {
		log.debug("finding all Pathology instances");
		try {
			String queryString = "from Pathology";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Pathology merge(Pathology detachedInstance) {
		log.debug("merging Pathology instance");
		try {
			Pathology result = (Pathology) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Pathology instance) {
		log.debug("attaching dirty Pathology instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Pathology instance) {
		log.debug("attaching clean Pathology instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
/**
 * 
 */
package com.medikm.input.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import com.medikm.input.entity.Symptoms;
import com.medikm.input.dao.EpisodeDao;
import com.medikm.input.entity.CcbrQuestion;
import com.medikm.input.entity.DiseaseSymptoms;
import com.medikm.input.entity.Encounter;
import com.medikm.input.entity.Episode;
import com.medikm.input.entity.FamilyHistory;
import com.medikm.input.entity.PersonalMedicalHistory;
import com.medikm.input.entity.ReproductiveHistory;
import com.medikm.input.entity.Symptoms;
import com.medikm.input.entity.TbDiscussionForumQuestion;

/**
 * @author Saikat
 *
 */
@Repository("episodeDao")
public class EpisodeDaoImpl implements EpisodeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unused")
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public Integer addEpisode(Episode episode) {
		hibernateTemplate.save(episode);
		return episode.getEpisodeId();
	}

	@Transactional
	@Override
	public void addPersonalMedicalHistory(PersonalMedicalHistory history) {
		hibernateTemplate.save(history);
	}

	@Transactional
	@Override
	public void addReproductiveHistory(ReproductiveHistory history) {
		hibernateTemplate.save(history);

	}

	@Transactional
	@Override
	public void addFamilyHistory(FamilyHistory familyHistory) {
		hibernateTemplate.save(familyHistory);
	}

	@Transactional
	@Override
	public Episode getEpisodeById(Integer episodeId) {
		@SuppressWarnings("unchecked")
		List<Episode> episodeList = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Episode.class).add(Restrictions.eq("episodeId", episodeId)));
		if (episodeList != null && episodeList.size() > 0) {
			return episodeList.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public Symptoms getSymptomsById(Integer symptomsId) {
		@SuppressWarnings("unchecked")
		List<Symptoms> symptomslist = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(Symptoms.class).add(Restrictions.eq("symptomsId", symptomsId)));
		if (symptomslist != null && symptomslist.size() > 0) {
			return symptomslist.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public void addDiseaseSymptoms(DiseaseSymptoms diseaseSymptoms) {
		hibernateTemplate.save(diseaseSymptoms);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public PersonalMedicalHistory getPerosonalMedicalHistoryOfPatient(Integer patientId) {
		List<PersonalMedicalHistory> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(PersonalMedicalHistory.class)
						.add(Restrictions.eq("personalMedicalHistoryPK.patientId", patientId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public void updatePersonalMedicalHistory(PersonalMedicalHistory personalHistory) {
		hibernateTemplate.merge(personalHistory);

	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public ReproductiveHistory getReproductiveHistory(Integer patientId) {
		List<ReproductiveHistory> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(ReproductiveHistory.class)
						.add(Restrictions.eq("reproductiveHistoryPK.patientId", patientId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public void updateReproductiveHistory(ReproductiveHistory reproductiveHistory) {
		hibernateTemplate.merge(reproductiveHistory);

	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public FamilyHistory getFamilyHistoryOfPatient(Integer patientId) {
		List<FamilyHistory> li = hibernateTemplate.findByCriteria(DetachedCriteria.forClass(FamilyHistory.class)
				.add(Restrictions.eq("familyHistoryPK.patientId", patientId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public void updateFamilyHistory(FamilyHistory familyHistory) {
		hibernateTemplate.merge(familyHistory);

	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Transactional
	public Encounter getEncounterById(final Integer encounterId) {
		List<Encounter> encounterList = new ArrayList<Encounter>();
		// hibernateTemplate.findByCriteria(DetachedCriteria.forClass(Encounter.class).add(Restrictions.eq("encounterId", encounterId)));
		final String hqlString = "select Distinct encounter From Encounter encounter where encounter.encounterId= :encounterId";
		encounterList = hibernateTemplate.execute(new HibernateCallback<List>() {

			public List doInHibernate(Session s) throws HibernateException {
				Query sql = s.createQuery(hqlString);
				sql.setParameter("encounterId", encounterId);
				return sql.list();
			}
		});

		if (encounterList != null && encounterList.size() > 0) {
			return encounterList.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public void updateEpisode(Episode episode) {
		hibernateTemplate.merge(episode);

	}

	@SuppressWarnings("unchecked")
	public Symptoms findSymptoms(Integer symptomsId) {
		List<Symptoms> li = hibernateTemplate.findByCriteria(DetachedCriteria.forClass(Symptoms.class)
				.add(Restrictions.eq("DiseaseSymptomsPK.symptomsId", symptomsId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public CcbrQuestion addCcbrQuestionInitialy(CcbrQuestion ccbrQuestion) {
		hibernateTemplate.save(ccbrQuestion);
		return ccbrQuestion;
	}

	@Transactional
	@Override
	public Integer addTbDiscussionForumQuestionInitialy(TbDiscussionForumQuestion tbDiscussionForumQuestion) {
		hibernateTemplate.save(tbDiscussionForumQuestion);
		return tbDiscussionForumQuestion.getForumQuestionId();
	}
}

/**
 * 
 */
package com.medikm.input.dao;

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
public interface EpisodeDao {

	public Integer addEpisode(Episode episode);

	public void addPersonalMedicalHistory(PersonalMedicalHistory history);

	public void addReproductiveHistory(ReproductiveHistory history);

	public void addFamilyHistory(FamilyHistory familyHistory);

	public void addDiseaseSymptoms(DiseaseSymptoms diseaseSymptoms);

	public PersonalMedicalHistory getPerosonalMedicalHistoryOfPatient(Integer patientId);

	public void updatePersonalMedicalHistory(PersonalMedicalHistory personalHistory);

	public ReproductiveHistory getReproductiveHistory(Integer patientId);

	public void updateReproductiveHistory(ReproductiveHistory reproductiveHistory);

	public FamilyHistory getFamilyHistoryOfPatient(Integer patientId);

	public void updateFamilyHistory(FamilyHistory familyHistory);

	public Encounter getEncounterById(Integer encounterId);

	public void updateEpisode(Episode episode);

	public Episode getEpisodeById(Integer episodeId);

	public Symptoms getSymptomsById(Integer symptomsId);

	public Symptoms findSymptoms(Integer symptomsId);

	public CcbrQuestion addCcbrQuestionInitialy(CcbrQuestion ccbrQuestion);

	public Integer addTbDiscussionForumQuestionInitialy(TbDiscussionForumQuestion tbDiscussionForumQuestion);
	
}

/**
 * 
 */
package com.medikm.input.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.medikm.input.dao.CaseDao;
import com.medikm.input.dao.EpisodeDao;
import com.medikm.input.entity.Biopsy;
import com.medikm.input.entity.BiopsyType;
import com.medikm.input.entity.Case1;
import com.medikm.input.entity.CcbrQuestion;
import com.medikm.input.entity.DiagnosticWorkup;
import com.medikm.input.entity.DiseaseStatus;
import com.medikm.input.entity.DiseaseSymptoms;
import com.medikm.input.entity.Encounter;
import com.medikm.input.entity.Episode;
import com.medikm.input.entity.FamilyHistory;
import com.medikm.input.entity.FamilyHistoryPK;
import com.medikm.input.entity.Functionalstatus;
import com.medikm.input.entity.PersonalMedicalHistory;
import com.medikm.input.entity.PersonalMedicalHistoryPK;
import com.medikm.input.entity.PhysicalExam;
import com.medikm.input.entity.Physician;
import com.medikm.input.entity.ReproductiveHistory;
import com.medikm.input.entity.ReproductiveHistoryPK;
import com.medikm.input.entity.Surgery;
import com.medikm.input.entity.SurgeryType;
import com.medikm.input.entity.Symptoms;
import com.medikm.input.entity.TbDiscussionForum;
import com.medikm.input.entity.TbDiscussionForumQuestion;
import com.medikm.input.entity.TumorBoardDiscussion;
import com.medikm.input.entity.WorkupKindType;
import com.medikm.input.request.BiopsyRequest;
import com.medikm.input.request.EpisodeRequest;
import com.medikm.input.request.ImagingRequest;
import com.medikm.input.request.PhysicalExamRequest;
import com.medikm.input.request.SurgicalProcedureRequest;
import com.medikm.input.response.EpisodeResponse;
import com.medikm.input.service.EpisodeService;
import com.medikm.input.util.AuthenticationService;
import com.medikm.input.util.MedikmConstants;

/**
 * @author Saikat
 * 
 */
@SuppressWarnings({ "unused" })
@Service("episodeService")
public class EpisodeServiceImpl implements EpisodeService {

	private static final long serialVersionUID = 1L;

	Logger logger = Logger.getLogger(EpisodeServiceImpl.class);

	@Autowired
	private CaseDao caseDao;

	@Autowired
	private EpisodeDao episodeDao;

	@Value("${hub.url.value}")
	private String hubUrl;

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AuthenticationService authenticationService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.medikm.input.service.EpisodeService#addEpisode(com.medikm.input.request
	 * .EpisodeRequest)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public EpisodeResponse addBreastEpisode(EpisodeRequest episodeRequest, String ipAddress) {
		logger.info(" ############### addBreastEpisode Start ############### ");
		EpisodeResponse episodeResponse = new EpisodeResponse();
		
		try {
			if (authenticationService.authenticateAuthToken(episodeRequest.getAuthToken(), ipAddress)) {
			Episode episode = new Episode();
			if (episodeRequest.getDiseaseType() != null
					&& episodeRequest.getDiseaseType() != 0) {
				DiseaseStatus diseaseStatus = new DiseaseStatus(
						episodeRequest.getDiseaseType());
				episode.setDiseaseType(diseaseStatus);
			}
			episode.setCaseId(new Case1(episodeRequest.getCaseId()));
			episode.setHrt(episodeRequest.getHrt());
			episode.setImagingFindings(episodeRequest.getImagingFindings());
			episode.setRelativeIntraoperativeFindings(episodeRequest
					.getRelativeIntraoperativeFindings());
			episode.setBiopsyFindings(episodeRequest.getBiopsyFindings());
			TumorBoardDiscussion tbDiscussion = new TumorBoardDiscussion();
			tbDiscussion.setCaseId(new Case1(episodeRequest.getCaseId()));
			tbDiscussion.setPrimaryQuestionAskedtoTB(episodeRequest
					.getReasonForPresentation());
			tbDiscussion.setOptionsConsidered(episodeRequest.getOptionConsideredComment());
			tbDiscussion.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
			if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			  	String conferenceDate=episodeRequest.getDiscussionDt();
			  	tbDiscussion.setDiscussiondt(fmt.parse(conferenceDate));
			} else {
				//tbDiscussion.setDiscussiondt(episodeRequest.getDiscussionDt());
			}
			
			/*if (episodeRequest.getDiscussionEndDt() != null && !episodeRequest.getDiscussionEndDt().equals("")) { //sunil
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
			  	tbDiscussion.setDiscussionEndTime(fmt.parse(conferenceEndDate));
			} else {
				//tbDiscussion.setDiscussionEndTime(episodeRequest.getDiscussionEndDt());
			}
			*/
			tbDiscussion.setEpisodeId(episode);
			List<TumorBoardDiscussion> tbList = new ArrayList<TumorBoardDiscussion>();
			tbList.add(tbDiscussion);
			episode.setTumorBoardDiscussionCollection(tbList);
			//---------------- add virtual mdt forum Begin --------------------------
			TbDiscussionForum tbDiscussionForum = new TbDiscussionForum();
			tbDiscussionForum.setCase1(new Case1(episodeRequest.getCaseId()));
			tbDiscussionForum.setOptionsConsidered(episodeRequest.getOptionConsideredComment());
			tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
			tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
			DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			if (episodeRequest.getDiscussionStartDt() != null && !episodeRequest.getDiscussionStartDt().equals("")) {
			  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
			  	//tbDiscussionForum.setDiscussionStartdt(fmt.parse(conferenceStartDate));
			  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
			} else {
				tbDiscussionForum.setDiscussiondt(null);
			}
			
			if (!episodeRequest.getDiscussionEndDt().equals("")) {
			  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
			  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
			} else {
				tbDiscussionForum.setDiscussionEndTime(null);
			}
			tbDiscussionForum.setStatus(episodeRequest.getStatus());
			tbDiscussionForum.setEpisode(episode);
			List<TbDiscussionForum> tbDiscussionForumList = new ArrayList<TbDiscussionForum>();
			tbDiscussionForumList.add(tbDiscussionForum);
			episode.setTbDiscussionForumCollection(tbDiscussionForumList);
			//---------------- add virtual mdt forum End --------------------------
			if ((episodeRequest.getCasehistory() != null && !episodeRequest
					.getCasehistory().trim().equals(""))
					|| ((episodeRequest.getComorbidities() != null && !episodeRequest
							.getComorbidities().trim().equals("")))
					|| ((episodeRequest.getOtherHistory() != null && !episodeRequest
							.getOtherHistory().trim().equals("")))) {
				PersonalMedicalHistoryPK perHistoryPK = new PersonalMedicalHistoryPK();
				perHistoryPK.setPatientId(episodeRequest.getPatientId());
				perHistoryPK.setMedHistDate(new Date());
				PersonalMedicalHistory medicalHistory = new PersonalMedicalHistory();
				medicalHistory.setPersonalMedicalHistoryPK(perHistoryPK);
				medicalHistory.setComments(episodeRequest.getCasehistory());
				medicalHistory.setMajorComorbidities(episodeRequest
						.getComorbidities());
				medicalHistory
						.setOtherHistory(episodeRequest.getOtherHistory());
				episodeDao.addPersonalMedicalHistory(medicalHistory);
			}

			ReproductiveHistoryPK reproductiveHistoryPK = new ReproductiveHistoryPK();
			reproductiveHistoryPK.setPatientId(episodeRequest.getPatientId());
			reproductiveHistoryPK.setRHDt(new Date());
			ReproductiveHistory reproductiveHistory = new ReproductiveHistory();
			reproductiveHistory.setReproductiveHistoryPK(reproductiveHistoryPK);
			reproductiveHistory.setBirthControlPillsUsed(episodeRequest
					.getBcp());
			reproductiveHistory.setNoDeliveries(episodeRequest
					.getNoOfDelivery());
			reproductiveHistory.setNoPregnancies(episodeRequest
					.getNoOfPregnancy());
			episodeDao.addReproductiveHistory(reproductiveHistory);
			if (episodeRequest.getFamilyHistory() != null
					&& !episodeRequest.getFamilyHistory().trim().equals("")) {
				FamilyHistoryPK familyHistoryPK = new FamilyHistoryPK();
				familyHistoryPK.setPatientId(episodeRequest.getPatientId());
				familyHistoryPK.setFHDate(new Date());
				FamilyHistory familyHistory = new FamilyHistory();
				familyHistory.setFamilyHistoryPK(familyHistoryPK);
				familyHistory.setFamilyHistoryComments(episodeRequest
						.getFamilyHistory());
				episodeDao.addFamilyHistory(familyHistory);
			}
			Case1 case1 = caseDao.getCaseById(episodeRequest.getCaseId());
			if (case1 != null) {
				case1.setMenopauseStatus(episodeRequest.getMenopauseStatus());
			} 

			if (episodeRequest.getFunctionalStatus() != null
					&& episodeRequest.getFunctionalStatus() != 0) {
				case1.setFunctionalStatus(new Functionalstatus(episodeRequest
						.getFunctionalStatus()));
			}
			//---------------get caseStatus from Episode request and set to case1 table ----satart
			case1.setCaseStatus(episodeRequest.getCaseStatus());
			//---------------get caseStatus from Episode request and set to case1 table ----end
			caseDao.updateCase(case1);
			List<Encounter> encounterList = new ArrayList<Encounter>();
			Encounter encounter = null;

			if (episodeRequest.getPhysicalExamList() != null
					&& episodeRequest.getPhysicalExamList().size() > 0) {
				for (PhysicalExamRequest p : episodeRequest
						.getPhysicalExamList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(p.getPhysicalExamDate());
					PhysicalExam physicalExam = new PhysicalExam();
					physicalExam.setCBEReport(p.getPhysicalExamReport());
					physicalExam.setCaseId(case1);
					physicalExam.setEncounter(encounter);
					encounter.setPhysicalExam(physicalExam);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getSurgicalProcedureList() != null
					&& episodeRequest.getSurgicalProcedureList().size() > 0) {
				for (SurgicalProcedureRequest s : episodeRequest
						.getSurgicalProcedureList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(s.getSurgicalProcedureDate());
					Surgery surgery = new Surgery();
					surgery.setSurgeryTypeId(new SurgeryType(s
							.getSurgicalProcedureType()));
					surgery.setCaseId(case1);
					surgery.setEncounter(encounter);
					encounter.setSurgery(surgery);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getImagingList() != null
					&& episodeRequest.getImagingList().size() > 0) {
				for (ImagingRequest i : episodeRequest.getImagingList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(i.getImagingDate());
					DiagnosticWorkup d = new DiagnosticWorkup();
					d.setDxWkupTypeId(new WorkupKindType(i.getImagingType()));
					d.setCaseId(case1);
					d.setEncounter(encounter);
					encounter.setDiagnosticWorkup(d);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getBiopsyList() != null
					&& episodeRequest.getBiopsyList().size() > 0) {
				for (BiopsyRequest b : episodeRequest.getBiopsyList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(b.getBiopsyDate());
					Biopsy biopsy = new Biopsy();
					biopsy.setBiopsyTypeId(new BiopsyType(b.getBiopsyType()));
					biopsy.setCaseId(case1);
					biopsy.setEncounter(encounter);
					encounter.setBiopsy(biopsy);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}
			episode.setEncounterCollection(encounterList);
			Integer episodeId = episodeDao.addEpisode(episode);

			CcbrQuestion ccbrQuestion = new CcbrQuestion();
			ccbrQuestion.setQuestiomtext(episodeRequest.getReasonForPresentation());
		    ccbrQuestion = episodeDao.addCcbrQuestionInitialy(ccbrQuestion);
            TbDiscussionForumQuestion tbDiscussionForumQuestion = new TbDiscussionForumQuestion();
            tbDiscussionForumQuestion.setQuestion(episodeRequest.getReasonForPresentation()); //deafult question should be
            tbDiscussionForumQuestion.setQuestionDate(new Date());
            tbDiscussionForumQuestion.setCCBRQuestionId(ccbrQuestion);
            tbDiscussionForumQuestion.setPhysicianId(new Physician(episodeRequest.getPhysicianId()));
            tbDiscussionForumQuestion.setTBDiscussionId(tbDiscussionForum);
            Integer tbDiscussionForumQuestionID = episodeDao.addTbDiscussionForumQuestionInitialy(tbDiscussionForumQuestion);
			
			episodeRequest.setEpisodeId(episodeId);
			if (episode.getTumorBoardDiscussionCollection() != null
					&& episode.getTumorBoardDiscussionCollection().size() > 0) {
				episodeRequest
						.setTumorBoardId(new ArrayList<TumorBoardDiscussion>(
								episode.getTumorBoardDiscussionCollection())
								.get(0).getTBDiscussionId());
			}
			Case1 ca = caseDao.getCaseById(episodeRequest.getCaseId());
			episodeRequest.setImagingList(new ArrayList<ImagingRequest>());
			ArrayList<ImagingRequest> imagingList = new ArrayList<ImagingRequest>();
			ImagingRequest image = null;
			for (DiagnosticWorkup d : ca.getDiagnosticWorkupCollection()) {
				image = new ImagingRequest();
				image.setEncounterId(d.getEncounterId());
				image.setImagingDate(d.getEncounter().getEncounterDt());
				image.setImagingType(d.getDxWkupTypeId().getTypeId());
				imagingList.add(image);
			}
			episodeRequest.setImagingList(imagingList);
			episodeRequest.setBiopsyList(new ArrayList<BiopsyRequest>());
			ArrayList<BiopsyRequest> biopsyList = new ArrayList<BiopsyRequest>();
			BiopsyRequest biopsy = null;
			for (Biopsy b : ca.getBiopsyCollection()) {
				biopsy = new BiopsyRequest();
				biopsy.setEncounterId(b.getEncounter().getEncounterId());
				biopsy.setBiopsyDate(b.getEncounter().getEncounterDt());
				biopsy.setBiopsyType(b.getBiopsyTypeId().getTypeId());
				biopsyList.add(biopsy);
			}
			episodeRequest.setBiopsyList(biopsyList);
			episodeRequest
					.setPhysicalExamList(new ArrayList<PhysicalExamRequest>());
			ArrayList<PhysicalExamRequest> physicalList = new ArrayList<PhysicalExamRequest>();
			PhysicalExamRequest exam = null;
			for (PhysicalExam p : ca.getPhysicalExamCollection()) {
				exam = new PhysicalExamRequest();
				exam.setEncounterId(p.getEncounterId());
				exam.setPhysicalExamDate(p.getEncounter().getEncounterDt());
				exam.setPhysicalExamReport(p.getCBEReport());
				physicalList.add(exam);
			}
			episodeRequest.setPhysicalExamList(physicalList);
			episodeRequest
					.setSurgicalProcedureList(new ArrayList<SurgicalProcedureRequest>());
			ArrayList<SurgicalProcedureRequest> surgeryList = new ArrayList<SurgicalProcedureRequest>();
			SurgicalProcedureRequest surgery = null;
			for (Surgery s : ca.getSurgeryCollection()) {
				surgery = new SurgicalProcedureRequest();
				surgery.setEncounterId(s.getEncounterId());
				surgery.setSurgicalProcedureDate(s.getEncounter()
						.getEncounterDt());
				surgery.setSurgicalProcedureType(s.getSurgeryTypeId()
						.getTypeId());
				surgeryList.add(surgery);
			}
			episodeRequest.setSurgicalProcedureList(surgeryList);

			/*restTemplate.postForObject(hubUrl + "episode/addEpisode.json",
					episodeRequest, MedikmResponse.class);*/

			episodeResponse.setAuthenticationKey("");
			episodeResponse.setEpisodeId(episodeId);
			episodeResponse.setTBDiscussionId(tbDiscussionForum.getTBDiscussionId());
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		}else {
			logger.error("Authentication Failed");
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			episodeResponse.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
			episodeResponse.setEpisodeId(0);
		}
	} catch (Exception ex) {
			logger.error("Error in EpisodeServiceImpl : " + ex.getMessage());
			ex.printStackTrace();
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);

		}
		logger.info(" ############### addBreastEpisode End ############### ");
		return episodeResponse;
		
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public EpisodeResponse editBreastEpisode(EpisodeRequest episodeRequest, String ipAddress) {
		logger.info("Episode Update Start");
		EpisodeResponse episodeResponse = new EpisodeResponse();
		try {
			if (authenticationService.authenticateAuthToken(episodeRequest.getAuthToken(), ipAddress)) {
			Episode episode = episodeDao.getEpisodeById(episodeRequest
					.getEpisodeId());
			if (episode != null) {
				DiseaseStatus diseaseStatus = new DiseaseStatus(
						episodeRequest.getDiseaseType());
				episode.setDiseaseType(diseaseStatus);
				episode.setCaseId(new Case1(episodeRequest.getCaseId()));
				episode.setHrt(episodeRequest.getHrt());
				episode.setImagingFindings(episodeRequest.getImagingFindings());
				episode.setRelativeIntraoperativeFindings(episodeRequest
						.getRelativeIntraoperativeFindings());
				episode.setBiopsyFindings(episodeRequest.getBiopsyFindings());
				Collection<TumorBoardDiscussion> tumorboardCollection = episode.getTumorBoardDiscussionCollection();
				List<TumorBoardDiscussion> tumorBoardList = new ArrayList<TumorBoardDiscussion>(tumorboardCollection);
				
				
				if(tumorBoardList!=null && tumorBoardList.size()>0){
					
					TumorBoardDiscussion tumorBoardDiscussion=null;
					if(tumorBoardList.size()==0){
						tumorBoardDiscussion=tumorBoardList.get(0);
					}else if(tumorBoardList.size()>=1){
						List<TumorBoardDiscussion> tbdList=new ArrayList<TumorBoardDiscussion>();
						for (TumorBoardDiscussion tbd : tumorBoardList) {
							if(tbd.getDiscussiondt()!=null){
								tbdList.add(tbd);
							}
							/*if(tbd.getDiscussionEndTime()!=null){															
								tbdList.add(tbd);
							}*/
						}
						if(tbdList.size()>0){
							Collections.sort(tbdList,Collections.reverseOrder());
							tumorBoardDiscussion=tbdList.get(0);
						}else{
							tumorBoardDiscussion=tumorBoardList.get(tumorBoardList.size()-1);
						}
					}
					if(tumorBoardDiscussion!=null){
						tumorBoardDiscussion.setPrimaryQuestionAskedtoTB(episodeRequest
								.getReasonForPresentation());
						if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
							
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceDate=episodeRequest.getDiscussionDt();
						  	tumorBoardDiscussion.setDiscussiondt(fmt.parse(conferenceDate));

						} else {
							tumorBoardDiscussion.setDiscussiondt(null);
						}
						tumorBoardList.set(0, tumorBoardDiscussion);
					}
				}else {
					TumorBoardDiscussion tumorBoard = new TumorBoardDiscussion();
					tumorBoard.setPrimaryQuestionAskedtoTB(episodeRequest
							.getReasonForPresentation());
					if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
						
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceDate=episodeRequest.getDiscussionDt();
					  	tumorBoard.setDiscussiondt(fmt.parse(conferenceDate));

					} else {
						tumorBoard.setDiscussiondt(null);
					}
					/*if (episodeRequest.getDiscussionEndDt() != null && !episodeRequest.getDiscussionEndDt().equals("")) {
						
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
					  	tumorBoard.setDiscussionEndTime(fmt.parse(conferenceEndDate));

					} else {
						tumorBoard.setDiscussiondt(null);
					}*/
					tumorBoardList.set(0, tumorBoard);
				}
/*				if (tumorBoardList != null && tumorBoardList.size() > 0) {
					TumorBoardDiscussion tumorBoard = tumorBoardList.get(0);
					tumorBoard.setPrimaryQuestionAskedtoTB(episodeRequest
							.getReasonForPresentation());
					
					if (!episodeRequest.getDiscussionDt().equals("")) {
						
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceDate=episodeRequest.getDiscussionDt();
					  	tumorBoard.setDiscussiondt(fmt.parse(conferenceDate));
					} else {
						tumorBoard.setDiscussiondt(null);
					}
					//tumorBoard.setDiscussiondt(episodeRequest.getDiscussionDt());
					tumorBoardList.set(0, tumorBoard);
				} else {
					TumorBoardDiscussion tumorBoard = new TumorBoardDiscussion();
					tumorBoard.setPrimaryQuestionAskedtoTB(episodeRequest
							.getReasonForPresentation());
					
					if (!episodeRequest.getDiscussionDt().equals("")) {
						
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceDate=episodeRequest.getDiscussionDt();
					  	tumorBoard.setDiscussiondt(fmt.parse(conferenceDate));
					} else {
						tumorBoard.setDiscussiondt(null);
					}
					//tumorBoard.setDiscussiondt(episodeRequest.getDiscussionDt());
					tumorBoardList.set(0, tumorBoard);
				}*/
				episode.setTumorBoardDiscussionCollection(tumorBoardList);
				//============================== Edit virtual mdt Begin ==========================================
				Collection<TbDiscussionForum> tbDiscussionForumCollection=episode.getTbDiscussionForumCollection();
				List<TbDiscussionForum> tbDiscussionForumList = new ArrayList<TbDiscussionForum>(tbDiscussionForumCollection);
				TbDiscussionForum tbDiscussionForum=null;
				//-----   if tbDiscussionForumList is not empty --------------------
				if(tbDiscussionForumList!=null && tbDiscussionForumList.size()>0){

					if(tbDiscussionForumList.size()==0){
						tbDiscussionForum=tbDiscussionForumList.get(0);
					}else if(tbDiscussionForumList.size()>=1){
						List<TbDiscussionForum> tbdList=new ArrayList<TbDiscussionForum>();
						for (TbDiscussionForum tbd : tbDiscussionForumList) {
							if(tbd.getDiscussiondt()!=null){
								tbdList.add(tbd);
							}
						}
						if(tbdList.size()>0){
							Collections.sort(tbdList,Collections.reverseOrder());
							tbDiscussionForum=tbdList.get(0);
						}else{
							tbDiscussionForum=tbDiscussionForumList.get(tbDiscussionForumList.size()-1);
						}
					}
					if(tbDiscussionForum!=null){
						tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
						//tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
						tbDiscussionForum.setStatus(episodeRequest.getStatus());
						if (episodeRequest.getDiscussionStartDt()!=null && !episodeRequest.getDiscussionStartDt().equals("")) {
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
						  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
						}else {
							tbDiscussionForum.setDiscussiondt(null);
						}
						if (episodeRequest.getDiscussionEndDt()!=null && !episodeRequest.getDiscussionEndDt().equals("")) {
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
						  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
						}else {
							tbDiscussionForum.setDiscussionEndTime(null);
						}
						tbDiscussionForumList.set(0, tbDiscussionForum);
					}
				}else{
					//-----   if tbDiscussionForumList is empty -----------------
					tbDiscussionForum=new TbDiscussionForum();
					tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
					//tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
					tbDiscussionForum.setStatus(episodeRequest.getStatus());
					if (episodeRequest.getDiscussionStartDt()!=null && !episodeRequest.getDiscussionStartDt().equals("")) {
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
					  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
					}else {
						tbDiscussionForum.setDiscussiondt(null);
					}
					if (episodeRequest.getDiscussionEndDt()!=null && !episodeRequest.getDiscussionEndDt().equals("")) {
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
					  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
					}else {
						tbDiscussionForum.setDiscussionEndTime(null);
					}
					tbDiscussionForumList.set(0, tbDiscussionForum);
				}
				episode.setTbDiscussionForumCollection(tbDiscussionForumList);
				if ((episodeRequest.getCasehistory() != null && !episodeRequest
						.getCasehistory().trim().equals(""))
						|| ((episodeRequest.getComorbidities() != null && !episodeRequest
								.getComorbidities().trim().equals("")))) {
					PersonalMedicalHistoryPK perHistoryPK = new PersonalMedicalHistoryPK();
					perHistoryPK.setPatientId(episodeRequest.getPatientId());
					perHistoryPK.setMedHistDate(new Date());
					PersonalMedicalHistory medicalHistory = new PersonalMedicalHistory();
					medicalHistory.setPersonalMedicalHistoryPK(perHistoryPK);
					medicalHistory.setComments(episodeRequest.getCasehistory());
					medicalHistory.setMajorComorbidities(episodeRequest
							.getComorbidities());
					medicalHistory.setOtherHistory(episodeRequest
							.getOtherHistory());
					episodeDao.addPersonalMedicalHistory(medicalHistory);
				}

				{
					ReproductiveHistory reproductiveHistory;
					ReproductiveHistoryPK reproductiveHistoryPK = new ReproductiveHistoryPK();
					reproductiveHistoryPK.setPatientId(episodeRequest
							.getPatientId());
					reproductiveHistoryPK.setRHDt(new Date());
					reproductiveHistory = new ReproductiveHistory();
					reproductiveHistory
							.setReproductiveHistoryPK(reproductiveHistoryPK);
					reproductiveHistory.setBirthControlPillsUsed(episodeRequest
							.getBcp());
					reproductiveHistory.setNoDeliveries(episodeRequest
							.getNoOfDelivery());
					reproductiveHistory.setNoPregnancies(episodeRequest
							.getNoOfPregnancy());
					episodeDao.addReproductiveHistory(reproductiveHistory);
				}
				if (episodeRequest.getFamilyHistory() != null
						&& !episodeRequest.getFamilyHistory().trim().equals("")) {
					FamilyHistory familyHistory;
					FamilyHistoryPK familyHistoryPK = new FamilyHistoryPK();
					familyHistoryPK.setPatientId(episodeRequest.getPatientId());
					familyHistoryPK.setFHDate(new Date());
					familyHistory = new FamilyHistory();
					familyHistory.setFamilyHistoryPK(familyHistoryPK);
					familyHistory.setFamilyHistoryComments(episodeRequest
							.getFamilyHistory());
					episodeDao.addFamilyHistory(familyHistory);
				}
				Case1 case1 = caseDao.getCaseById(episodeRequest.getCaseId());
				case1.setMenopauseStatus(episodeRequest.getMenopauseStatus());
				if (episodeRequest.getFunctionalStatus() != null
						&& episodeRequest.getFunctionalStatus() != 0) {
					case1.setFunctionalStatus(new Functionalstatus(
							episodeRequest.getFunctionalStatus()));
				}
				//---------------get caseStatus from Episode request and set to case1 table ----satart
				case1.setCaseStatus(episodeRequest.getCaseStatus());
				//---------------get caseStatus from Episode request and set to case1 table ----end
				caseDao.updateCase(case1);
				List<Encounter> encounterList = new ArrayList<Encounter>();
				Encounter encounter = null;

				if (episodeRequest.getPhysicalExamList() != null
						&& episodeRequest.getPhysicalExamList().size() > 0) {
					for (PhysicalExamRequest p : episodeRequest
							.getPhysicalExamList()) {
						encounter = episodeDao.getEncounterById(p
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(p.getPhysicalExamDate());
							PhysicalExam physicalExam = encounter
									.getPhysicalExam();
							physicalExam
									.setCBEReport(p.getPhysicalExamReport());
							physicalExam.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							physicalExam.setEncounter(encounter);
							encounter.setPhysicalExam(physicalExam);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(p.getPhysicalExamDate());
							PhysicalExam physicalExam = new PhysicalExam();
							physicalExam
									.setCBEReport(p.getPhysicalExamReport());
							physicalExam.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							physicalExam.setEncounter(encounter);
							encounter.setPhysicalExam(physicalExam);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getSurgicalProcedureList() != null
						&& episodeRequest.getSurgicalProcedureList().size() > 0) {
					for (SurgicalProcedureRequest s : episodeRequest
							.getSurgicalProcedureList()) {
						encounter = episodeDao.getEncounterById(s
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(s
									.getSurgicalProcedureDate());
							Surgery surgery = encounter.getSurgery();
							surgery.setSurgeryTypeId(new SurgeryType(s
									.getSurgicalProcedureType()));
							surgery.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							surgery.setEncounter(encounter);
							encounter.setSurgery(surgery);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(s
									.getSurgicalProcedureDate());
							Surgery surgery = new Surgery();
							surgery.setSurgeryTypeId(new SurgeryType(s
									.getSurgicalProcedureType()));
							surgery.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							surgery.setEncounter(encounter);
							encounter.setSurgery(surgery);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getImagingList() != null
						&& episodeRequest.getImagingList().size() > 0) {
					for (ImagingRequest i : episodeRequest.getImagingList()) {
						encounter = episodeDao.getEncounterById(i
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(i.getImagingDate());
							DiagnosticWorkup d = encounter
									.getDiagnosticWorkup();
							d.setDxWkupTypeId(new WorkupKindType(i
									.getImagingType()));
							d.setCaseId(new Case1(episodeRequest.getCaseId()));
							d.setEncounter(encounter);
							encounter.setDiagnosticWorkup(d);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(i.getImagingDate());
							DiagnosticWorkup d = new DiagnosticWorkup();
							d.setDxWkupTypeId(new WorkupKindType(i
									.getImagingType()));
							d.setCaseId(new Case1(episodeRequest.getCaseId()));
							d.setEncounter(encounter);
							encounter.setDiagnosticWorkup(d);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getBiopsyList() != null
						&& episodeRequest.getBiopsyList().size() > 0) {
					for (BiopsyRequest b : episodeRequest.getBiopsyList()) {
						encounter = episodeDao.getEncounterById(b
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(b.getBiopsyDate());
							Biopsy biopsy = encounter.getBiopsy();
							biopsy.setBiopsyTypeId(new BiopsyType(b
									.getBiopsyType()));
							biopsy.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							biopsy.setEncounter(encounter);
							encounter.setBiopsy(biopsy);
							encounter.setEpisodeId(episode);

						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(b.getBiopsyDate());
							Biopsy biopsy = new Biopsy();
							biopsy.setBiopsyTypeId(new BiopsyType(b
									.getBiopsyType()));
							biopsy.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							biopsy.setEncounter(encounter);
							encounter.setBiopsy(biopsy);
							encounter.setEpisodeId(episode);

						}

						encounterList.add(encounter);
					}
				}
				episode.setEncounterCollection(encounterList);
				episodeDao.updateEpisode(episode);
				logger.info("EPisode Edited Successfully");
				Case1 ca = caseDao.getCaseById(episodeRequest.getCaseId());
				episodeRequest.setImagingList(new ArrayList<ImagingRequest>());
				ArrayList<ImagingRequest> imagingList = new ArrayList<ImagingRequest>();
				ImagingRequest image = null;
				for (DiagnosticWorkup d : ca.getDiagnosticWorkupCollection()) {
					image = new ImagingRequest();
					image.setEncounterId(d.getEncounterId());
					image.setImagingDate(d.getEncounter().getEncounterDt());
					image.setImagingType(d.getDxWkupTypeId().getTypeId());
					imagingList.add(image);
				}
				episodeRequest.setImagingList(imagingList);
				episodeRequest.setBiopsyList(new ArrayList<BiopsyRequest>());
				ArrayList<BiopsyRequest> biopsyList = new ArrayList<BiopsyRequest>();
				BiopsyRequest biopsy = null;
				for (Biopsy b : ca.getBiopsyCollection()) {
					biopsy = new BiopsyRequest();
					biopsy.setEncounterId(b.getEncounter().getEncounterId());
					biopsy.setBiopsyDate(b.getEncounter().getEncounterDt());
					biopsy.setBiopsyType(b.getBiopsyTypeId().getTypeId());
					biopsyList.add(biopsy);
				}
				episodeRequest.setBiopsyList(biopsyList);
				episodeRequest
						.setPhysicalExamList(new ArrayList<PhysicalExamRequest>());
				ArrayList<PhysicalExamRequest> physicalList = new ArrayList<PhysicalExamRequest>();
				PhysicalExamRequest exam = null;
				for (PhysicalExam p : ca.getPhysicalExamCollection()) {
					exam = new PhysicalExamRequest();
					exam.setEncounterId(p.getEncounterId());
					exam.setPhysicalExamDate(p.getEncounter().getEncounterDt());
					exam.setPhysicalExamReport(p.getCBEReport());
					physicalList.add(exam);
				}
				episodeRequest.setPhysicalExamList(physicalList);
				episodeRequest
						.setSurgicalProcedureList(new ArrayList<SurgicalProcedureRequest>());
				ArrayList<SurgicalProcedureRequest> surgeryList = new ArrayList<SurgicalProcedureRequest>();
				SurgicalProcedureRequest surgery = null;
				for (Surgery s : ca.getSurgeryCollection()) {
					surgery = new SurgicalProcedureRequest();
					surgery.setEncounterId(s.getEncounterId());
					surgery.setSurgicalProcedureDate(s.getEncounter()
							.getEncounterDt());
					surgery.setSurgicalProcedureType(s.getSurgeryTypeId()
							.getTypeId());
					surgeryList.add(surgery);
				}
				episodeRequest.setSurgicalProcedureList(surgeryList);

				/*restTemplate.postForObject(hubUrl + "episode/editEpisode.json",
						episodeRequest, MedikmResponse.class);*/
				episodeResponse.setTBDiscussionId(tbDiscussionForum.getTBDiscussionId());
				episodeResponse.setAuthenticationKey("");
				episodeResponse
						.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				episodeResponse
						.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			} else {
				episodeResponse=addBreastEpisode(episodeRequest, ipAddress);
			}
		}else {
			logger.error("Authentication Failed");
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			episodeResponse.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	} catch (Exception ex) {
			logger.error("Error in update Episode : " + ex);
			ex.printStackTrace();
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		return episodeResponse;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public EpisodeResponse addGynEpisode(EpisodeRequest episodeRequest, String ipAddress) {
		EpisodeResponse episodeResponse = new EpisodeResponse();
		
		try {
			if (authenticationService.authenticateAuthToken(episodeRequest.getAuthToken(), ipAddress)) {
			Episode episode = new Episode();
			if (episodeRequest.getDiseaseType() != null
					&& episodeRequest.getDiseaseType() != 0) {
				DiseaseStatus diseaseStatus = new DiseaseStatus(
						episodeRequest.getDiseaseType());
				episode.setDiseaseType(diseaseStatus);
			}
			episode.setCaseId(new Case1(episodeRequest.getCaseId()));
			episode.setHrt(episodeRequest.getHrt());
			episode.setImagingFindings(episodeRequest.getImagingFindings());
			episode.setRelativeIntraoperativeFindings(episodeRequest
					.getRelativeIntraoperativeFindings());
			episode.setFrozenSectionFindings(episodeRequest
					.getFrozenSectionFindings());
			episode.setPathologyFindings(episodeRequest.getPathologyFindings());
			episode.setBiopsyFindings(episodeRequest.getBiopsyFindings());
			TumorBoardDiscussion tbDiscussion = new TumorBoardDiscussion();
			tbDiscussion.setCaseId(new Case1(episodeRequest.getCaseId()));
			tbDiscussion.setPrimaryQuestionAskedtoTB(episodeRequest
					.getReasonForPresentation());
			tbDiscussion.setOptionsConsidered(episodeRequest.getOptionConsideredComment());
			tbDiscussion.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
			tbDiscussion.setEpisodeId(episode);
			if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			  	String conferenceDate=episodeRequest.getDiscussionDt();
			  	tbDiscussion.setDiscussiondt(fmt.parse(conferenceDate));

			} else {
				//tbDiscussion.setDiscussiondt(episodeRequest.getDiscussionDt());
			}
			/*if (episodeRequest.getDiscussionEndDt() != null && !episodeRequest.getDiscussionEndDt().equals("")) { 
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
			  	tbDiscussion.setDiscussionEndTime(fmt.parse(conferenceEndDate));
			} else {
				//tbDiscussion.setDiscussionEndTime(episodeRequest.getDiscussionEndDt());
			}*/
			//tbDiscussion.setDiscussiondt(episodeRequest.getDiscussionDt());
			List<TumorBoardDiscussion> tbList = new ArrayList<TumorBoardDiscussion>();
			tbList.add(tbDiscussion);
			episode.setTumorBoardDiscussionCollection(tbList);
			DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			if (!episodeRequest.getNextVisitDate().equals("")) {
			  	String nextVisitDate=episodeRequest.getNextVisitDate();
			  	episode.setNextVisitDate(fmt.parse(nextVisitDate));
			} else {
				episode.setNextVisitDate(null);
			}
			//---------------- add virtual mdt forum Begin --------------------------
			TbDiscussionForum tbDiscussionForum = new TbDiscussionForum();
			tbDiscussionForum.setCase1(new Case1(episodeRequest.getCaseId()));
			tbDiscussionForum.setOptionsConsidered(episodeRequest.getOptionConsideredComment());
			tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
			tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());

			if (episodeRequest.getDiscussionStartDt() != null && !episodeRequest.getDiscussionStartDt().equals("")) {
			  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
			  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
			} else {
				tbDiscussionForum.setDiscussiondt(null);
			}
			if (episodeRequest.getDiscussionEndDt() != null && !episodeRequest.getDiscussionEndDt().equals("")) {
			  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
			  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
			} else {
				tbDiscussionForum.setDiscussionEndTime(null);
			}
			tbDiscussionForum.setStatus(episodeRequest.getStatus());
			tbDiscussionForum.setEpisode(episode);
			List<TbDiscussionForum> tbDiscussionForumList = new ArrayList<TbDiscussionForum>();
			tbDiscussionForumList.add(tbDiscussionForum);
			episode.setTbDiscussionForumCollection(tbDiscussionForumList);
			//---------------- add virtual mdt forum End --------------------------
			if ((episodeRequest.getCasehistory() != null && !episodeRequest.getCasehistory().trim().equals(""))
					|| ((episodeRequest.getComorbidities() != null && !episodeRequest.getComorbidities().trim().equals("")))
					|| ((episodeRequest.getOtherHistory() != null && !episodeRequest.getOtherHistory().trim().equals(""))) 
					|| (episodeRequest.getAdequatePreviousSurgery() != null)
					|| (episodeRequest.getClinicalPresentation() != null)
					|| (episodeRequest.getIncidentalFinding() != null)
					|| ((episodeRequest.getBmi() != null && !episodeRequest.getBmi().trim().equals("")))
					|| ((episodeRequest.getSymptomsId() != null))) {
				PersonalMedicalHistoryPK perHistoryPK = new PersonalMedicalHistoryPK();
				perHistoryPK.setPatientId(episodeRequest.getPatientId());
				perHistoryPK.setMedHistDate(new Date());
				PersonalMedicalHistory medicalHistory = new PersonalMedicalHistory();
				medicalHistory.setPersonalMedicalHistoryPK(perHistoryPK);
				medicalHistory.setComments(episodeRequest.getCasehistory());
				medicalHistory.setMajorComorbidities(episodeRequest
						.getComorbidities());
				medicalHistory
						.setOtherHistory(episodeRequest.getOtherHistory());
				medicalHistory.setAdequatePreviousSurgery(episodeRequest.getAdequatePreviousSurgery());
				medicalHistory.setClinicalPresentation(episodeRequest.getClinicalPresentation());
				medicalHistory.setIncidentalFinding(episodeRequest.getIncidentalFinding());
				medicalHistory.setBmi(episodeRequest.getBmi());
			//	medicalHistory.setSymptoms(episodeDao.getSymptomsById(episodeRequest.getSymptomsId()));
				episodeDao.addPersonalMedicalHistory(medicalHistory);
			}

			ReproductiveHistoryPK reproductiveHistoryPK = new ReproductiveHistoryPK();
			reproductiveHistoryPK.setPatientId(episodeRequest.getPatientId());
			reproductiveHistoryPK.setRHDt(new Date());
			ReproductiveHistory reproductiveHistory = new ReproductiveHistory();
			reproductiveHistory.setReproductiveHistoryPK(reproductiveHistoryPK);
			reproductiveHistory.setBirthControlPillsUsed(episodeRequest
					.getBcp());
			reproductiveHistory.setNoDeliveries(episodeRequest
					.getNoOfDelivery());
			reproductiveHistory.setNoPregnancies(episodeRequest
					.getNoOfPregnancy());
			episodeDao.addReproductiveHistory(reproductiveHistory);
			if (episodeRequest.getFamilyHistory() != null
					&& !episodeRequest.getFamilyHistory().trim().equals("")) {
				FamilyHistoryPK familyHistoryPK = new FamilyHistoryPK();
				familyHistoryPK.setPatientId(episodeRequest.getPatientId());
				familyHistoryPK.setFHDate(new Date());
				FamilyHistory familyHistory = new FamilyHistory();
				familyHistory.setFamilyHistoryPK(familyHistoryPK);
				familyHistory.setFamilyHistoryComments(episodeRequest
						.getFamilyHistory());
				episodeDao.addFamilyHistory(familyHistory);
			}
			Case1 case1 = caseDao.getCaseById(episodeRequest.getCaseId());
			case1.setMenopauseStatus(episodeRequest.getMenopauseStatus());
			if (episodeRequest.getFunctionalStatus() != null
					&& episodeRequest.getFunctionalStatus() != 0) {
				case1.setFunctionalStatus(new Functionalstatus(episodeRequest
						.getFunctionalStatus()));
			}
			//---------------get caseStatus from Episode request and set to case1 table ----satart
			case1.setCaseStatus(episodeRequest.getCaseStatus());
			//---------------get caseStatus from Episode request and set to case1 table ----end
			caseDao.updateCase(case1);
			if(episodeRequest.getSymptomsId()!=null && episodeRequest.getSymptomsId().size()>0){
				for(Integer symptomsId : episodeRequest.getSymptomsId()){
					//Symptoms symptoms=episodeDao.getSymptomsById(symptomsId);
					DiseaseSymptoms diseaseSymptoms=new DiseaseSymptoms();
					diseaseSymptoms.setSymptomsId(new Symptoms(symptomsId));
					diseaseSymptoms.setCaseId(case1);
					episodeDao.addDiseaseSymptoms(diseaseSymptoms);
				}
			}
			List<Encounter> encounterList = new ArrayList<Encounter>();
			Encounter encounter = null;

			if (episodeRequest.getPhysicalExamList() != null
					&& episodeRequest.getPhysicalExamList().size() > 0) {
				for (PhysicalExamRequest p : episodeRequest
						.getPhysicalExamList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(p.getPhysicalExamDate());
					PhysicalExam physicalExam = new PhysicalExam();
					physicalExam.setCBEReport(p.getPhysicalExamReport());
					physicalExam.setCaseId(case1);
					physicalExam.setEncounter(encounter);
					encounter.setPhysicalExam(physicalExam);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getSurgicalProcedureList() != null
					&& episodeRequest.getSurgicalProcedureList().size() > 0) {
				for (SurgicalProcedureRequest s : episodeRequest
						.getSurgicalProcedureList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(s.getSurgicalProcedureDate());
					Surgery surgery = new Surgery();
					surgery.setSurgeryTypeId(new SurgeryType(s
							.getSurgicalProcedureType()));
					surgery.setCaseId(case1);
					surgery.setEncounter(encounter);
					encounter.setSurgery(surgery);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getImagingList() != null
					&& episodeRequest.getImagingList().size() > 0) {
				for (ImagingRequest i : episodeRequest.getImagingList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(i.getImagingDate());
					DiagnosticWorkup d = new DiagnosticWorkup();
					d.setDxWkupTypeId(new WorkupKindType(i.getImagingType()));
					d.setCaseId(case1);
					d.setEncounter(encounter);
					encounter.setDiagnosticWorkup(d);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getBiopsyList() != null
					&& episodeRequest.getBiopsyList().size() > 0) {
				for (BiopsyRequest b : episodeRequest.getBiopsyList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(b.getBiopsyDate());
					Biopsy biopsy = new Biopsy();
					biopsy.setBiopsyTypeId(new BiopsyType(b.getBiopsyType()));
					biopsy.setCaseId(case1);
					biopsy.setEncounter(encounter);
					encounter.setBiopsy(biopsy);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}
			episode.setEncounterCollection(encounterList);
			Integer episodeId = episodeDao.addEpisode(episode);

			CcbrQuestion ccbrQuestion = new CcbrQuestion();
			ccbrQuestion.setQuestiomtext(episodeRequest.getReasonForPresentation());
		    ccbrQuestion = episodeDao.addCcbrQuestionInitialy(ccbrQuestion);
            TbDiscussionForumQuestion tbDiscussionForumQuestion = new TbDiscussionForumQuestion();
            tbDiscussionForumQuestion.setQuestion(episodeRequest.getReasonForPresentation()); //deafult question should be
            tbDiscussionForumQuestion.setQuestionDate(new Date());
            tbDiscussionForumQuestion.setCCBRQuestionId(ccbrQuestion);
            tbDiscussionForumQuestion.setPhysicianId(new Physician(episodeRequest.getPhysicianId()));
            tbDiscussionForumQuestion.setTBDiscussionId(tbDiscussionForum);
            Integer tbDiscussionForumQuestionID = episodeDao.addTbDiscussionForumQuestionInitialy(tbDiscussionForumQuestion);
			
			episodeRequest.setEpisodeId(episodeId);
			if (episode.getTumorBoardDiscussionCollection() != null
					&& episode.getTumorBoardDiscussionCollection().size() > 0) {
				episodeRequest
						.setTumorBoardId(new ArrayList<TumorBoardDiscussion>(
								episode.getTumorBoardDiscussionCollection())
								.get(0).getTBDiscussionId());
			}
			Case1 ca = caseDao.getCaseById(episodeRequest.getCaseId());
			episodeRequest.setImagingList(new ArrayList<ImagingRequest>());
			ArrayList<ImagingRequest> imagingList = new ArrayList<ImagingRequest>();
			ImagingRequest image = null;
			// logger.info("Size : "+ca.getDiagnosticWorkupCollection().size());
			for (DiagnosticWorkup d : ca.getDiagnosticWorkupCollection()) {
				image = new ImagingRequest();
				image.setEncounterId(d.getEncounterId());
				image.setImagingDate(d.getEncounter().getEncounterDt());
				image.setImagingType(d.getDxWkupTypeId().getTypeId());
				imagingList.add(image);
			}
			episodeRequest.setImagingList(imagingList);
			episodeRequest.setBiopsyList(new ArrayList<BiopsyRequest>());
			ArrayList<BiopsyRequest> biopsyList = new ArrayList<BiopsyRequest>();
			BiopsyRequest biopsy = null;
			for (Biopsy b : ca.getBiopsyCollection()) {
				biopsy = new BiopsyRequest();
				biopsy.setEncounterId(b.getEncounter().getEncounterId());
				biopsy.setBiopsyDate(b.getEncounter().getEncounterDt());
				biopsy.setBiopsyType(b.getBiopsyTypeId().getTypeId());
				biopsyList.add(biopsy);
			}
			episodeRequest.setBiopsyList(biopsyList);
			episodeRequest
					.setPhysicalExamList(new ArrayList<PhysicalExamRequest>());
			ArrayList<PhysicalExamRequest> physicalList = new ArrayList<PhysicalExamRequest>();
			PhysicalExamRequest exam = null;
			for (PhysicalExam p : ca.getPhysicalExamCollection()) {
				exam = new PhysicalExamRequest();
				exam.setEncounterId(p.getEncounterId());
				exam.setPhysicalExamDate(p.getEncounter().getEncounterDt());
				exam.setPhysicalExamReport(p.getCBEReport());
				physicalList.add(exam);
			}
			episodeRequest.setPhysicalExamList(physicalList);
			episodeRequest
					.setSurgicalProcedureList(new ArrayList<SurgicalProcedureRequest>());
			ArrayList<SurgicalProcedureRequest> surgeryList = new ArrayList<SurgicalProcedureRequest>();
			SurgicalProcedureRequest surgery = null;
			for (Surgery s : ca.getSurgeryCollection()) {
				surgery = new SurgicalProcedureRequest();
				surgery.setEncounterId(s.getEncounterId());
				surgery.setSurgicalProcedureDate(s.getEncounter()
						.getEncounterDt());
				surgery.setSurgicalProcedureType(s.getSurgeryTypeId()
						.getTypeId());
				surgeryList.add(surgery);
			}
			episodeRequest.setSurgicalProcedureList(surgeryList);

			/*restTemplate.postForObject(hubUrl + "episode/addEpisode.json",
					episodeRequest, MedikmResponse.class);*/

			episodeResponse.setAuthenticationKey("");
			episodeResponse.setEpisodeId(episodeId);
			episodeResponse.setTBDiscussionId(tbDiscussionForum.getTBDiscussionId());
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		} else {
			logger.error("Authentication Failed");
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			episodeResponse.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
			episodeResponse.setEpisodeId(0);
		}
	}catch (Exception ex) {
			logger.error("Error in EpisodeServiceImpl : " + ex.getMessage());
			ex.printStackTrace();
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);

		}
		return episodeResponse;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public EpisodeResponse addSurcomaEpisode(EpisodeRequest episodeRequest, String ipAddress) {
		EpisodeResponse episodeResponse = new EpisodeResponse();
		try {
			if (authenticationService.authenticateAuthToken(episodeRequest.getAuthToken(), ipAddress)) {
			Episode episode = new Episode();
			if (episodeRequest.getDiseaseType() != null
					&& episodeRequest.getDiseaseType() != 0) {
				DiseaseStatus diseaseStatus = new DiseaseStatus(
						episodeRequest.getDiseaseType());
				episode.setDiseaseType(diseaseStatus);
			}
			episode.setCaseId(new Case1(episodeRequest.getCaseId()));
			episode.setHrt(episodeRequest.getHrt());
			episode.setImagingFindings(episodeRequest.getImagingFindings());
			episode.setRelativeIntraoperativeFindings(episodeRequest
					.getRelativeIntraoperativeFindings());
			episode.setFrozenSectionFindings(episodeRequest
					.getFrozenSectionFindings());
			episode.setPathologyFindings(episodeRequest.getPathologyFindings());
			episode.setBiopsyFindings(episodeRequest.getBiopsyFindings());
			TumorBoardDiscussion tbDiscussion = new TumorBoardDiscussion();
			tbDiscussion.setCaseId(new Case1(episodeRequest.getCaseId()));
			tbDiscussion.setPrimaryQuestionAskedtoTB(episodeRequest
					.getReasonForPresentation());
			tbDiscussion.setOptionsConsidered(episodeRequest.getOptionConsideredComment());
			tbDiscussion.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
			tbDiscussion.setEpisodeId(episode);
			if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
				
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			  	String conferenceDate=episodeRequest.getDiscussionDt();
			  	tbDiscussion.setDiscussiondt(fmt.parse(conferenceDate));

			} else {
				//tbDiscussion.setDiscussiondt(episodeRequest.getDiscussionDt());
			}
			/*if (episodeRequest.getDiscussionEndDt() != null && !episodeRequest.getDiscussionEndDt().equals("")) { 
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
			  	tbDiscussion.setDiscussionEndTime(fmt.parse(conferenceEndDate));
			} else {
				//tbDiscussion.setDiscussionEndTime(episodeRequest.getDiscussionEndDt());
			}	*/		
			List<TumorBoardDiscussion> tbList = new ArrayList<TumorBoardDiscussion>();
			tbList.add(tbDiscussion);
			episode.setTumorBoardDiscussionCollection(tbList);
			//---------------- add virtual mdt forum Begin --------------------------
			TbDiscussionForum tbDiscussionForum = new TbDiscussionForum();
			tbDiscussionForum.setCase1(new Case1(episodeRequest.getCaseId()));
			tbDiscussionForum.setOptionsConsidered(episodeRequest.getOptionConsideredComment());
			tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
			tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
			DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			if (episodeRequest.getDiscussionStartDt() != null && !episodeRequest.getDiscussionStartDt().equals("")) {
			  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
			  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
			} else {
				tbDiscussionForum.setDiscussiondt(null);
			}
			if (episodeRequest.getDiscussionEndDt() != null && !episodeRequest.getDiscussionEndDt().equals("")) {
			  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
			  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
			} else {
				tbDiscussionForum.setDiscussionEndTime(null);
			}
			tbDiscussionForum.setStatus(episodeRequest.getStatus());
			tbDiscussionForum.setEpisode(episode);
			List<TbDiscussionForum> tbDiscussionForumList = new ArrayList<TbDiscussionForum>();
			tbDiscussionForumList.add(tbDiscussionForum);
			episode.setTbDiscussionForumCollection(tbDiscussionForumList);
			//---------------- add virtual mdt forum End --------------------------
			if ((episodeRequest.getCasehistory() != null && !episodeRequest
					.getCasehistory().trim().equals(""))
					|| ((episodeRequest.getComorbidities() != null && !episodeRequest
							.getComorbidities().trim().equals("")))
					|| ((episodeRequest.getOtherHistory() != null && !episodeRequest
							.getOtherHistory().trim().equals("")))) {
				PersonalMedicalHistoryPK perHistoryPK = new PersonalMedicalHistoryPK();
				perHistoryPK.setPatientId(episodeRequest.getPatientId());
				perHistoryPK.setMedHistDate(new Date());
				PersonalMedicalHistory medicalHistory = new PersonalMedicalHistory();
				medicalHistory.setPersonalMedicalHistoryPK(perHistoryPK);
				medicalHistory.setComments(episodeRequest.getCasehistory());
				medicalHistory.setMajorComorbidities(episodeRequest
						.getComorbidities());
				medicalHistory
						.setOtherHistory(episodeRequest.getOtherHistory());
				medicalHistory.setTraumaHx(episodeRequest.getTraumaHx());
				medicalHistory.setRtHx(episodeRequest.getRtHx());
				medicalHistory.setToxicChemicals(episodeRequest
						.getToxicChemicals());
				episodeDao.addPersonalMedicalHistory(medicalHistory);
			}

			ReproductiveHistoryPK reproductiveHistoryPK = new ReproductiveHistoryPK();
			reproductiveHistoryPK.setPatientId(episodeRequest.getPatientId());
			reproductiveHistoryPK.setRHDt(new Date());
			ReproductiveHistory reproductiveHistory = new ReproductiveHistory();
			reproductiveHistory.setReproductiveHistoryPK(reproductiveHistoryPK);
			reproductiveHistory.setBirthControlPillsUsed(episodeRequest
					.getBcp());
			reproductiveHistory.setNoDeliveries(episodeRequest
					.getNoOfDelivery());
			reproductiveHistory.setNoPregnancies(episodeRequest
					.getNoOfPregnancy());
			episodeDao.addReproductiveHistory(reproductiveHistory);
			if (episodeRequest.getFamilyHistory() != null
					&& !episodeRequest.getFamilyHistory().trim().equals("")) {
				FamilyHistoryPK familyHistoryPK = new FamilyHistoryPK();
				familyHistoryPK.setPatientId(episodeRequest.getPatientId());
				familyHistoryPK.setFHDate(new Date());
				FamilyHistory familyHistory = new FamilyHistory();
				familyHistory.setFamilyHistoryPK(familyHistoryPK);
				familyHistory.setFamilyHistoryComments(episodeRequest
						.getFamilyHistory());
				episodeDao.addFamilyHistory(familyHistory);
			}
			Case1 case1 = caseDao.getCaseById(episodeRequest.getCaseId());
			case1.setMenopauseStatus(episodeRequest.getMenopauseStatus());
			if (episodeRequest.getFunctionalStatus() != null
					&& episodeRequest.getFunctionalStatus() != 0) {
				case1.setFunctionalStatus(new Functionalstatus(episodeRequest
						.getFunctionalStatus()));
			}
			//---------------get caseStatus from Episode request and set to case1 table ----satart
			case1.setCaseStatus(episodeRequest.getCaseStatus());
			//---------------get caseStatus from Episode request and set to case1 table ----end
			caseDao.updateCase(case1);
			List<Encounter> encounterList = new ArrayList<Encounter>();
			Encounter encounter = null;

			if (episodeRequest.getPhysicalExamList() != null
					&& episodeRequest.getPhysicalExamList().size() > 0) {
				for (PhysicalExamRequest p : episodeRequest
						.getPhysicalExamList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(p.getPhysicalExamDate());
					PhysicalExam physicalExam = new PhysicalExam();
					physicalExam.setCBEReport(p.getPhysicalExamReport());
					physicalExam.setCaseId(case1);
					physicalExam.setEncounter(encounter);
					encounter.setPhysicalExam(physicalExam);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getSurgicalProcedureList() != null
					&& episodeRequest.getSurgicalProcedureList().size() > 0) {
				for (SurgicalProcedureRequest s : episodeRequest
						.getSurgicalProcedureList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(s.getSurgicalProcedureDate());
					Surgery surgery = new Surgery();
					surgery.setSurgeryTypeId(new SurgeryType(s
							.getSurgicalProcedureType()));
					surgery.setCaseId(case1);
					surgery.setEncounter(encounter);
					encounter.setSurgery(surgery);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getImagingList() != null
					&& episodeRequest.getImagingList().size() > 0) {
				for (ImagingRequest i : episodeRequest.getImagingList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(i.getImagingDate());
					DiagnosticWorkup d = new DiagnosticWorkup();
					d.setDxWkupTypeId(new WorkupKindType(i.getImagingType()));
					d.setCaseId(case1);
					d.setEncounter(encounter);
					encounter.setDiagnosticWorkup(d);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getBiopsyList() != null
					&& episodeRequest.getBiopsyList().size() > 0) {
				for (BiopsyRequest b : episodeRequest.getBiopsyList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(b.getBiopsyDate());
					Biopsy biopsy = new Biopsy();
					biopsy.setBiopsyTypeId(new BiopsyType(b.getBiopsyType()));
					biopsy.setCaseId(case1);
					biopsy.setEncounter(encounter);
					encounter.setBiopsy(biopsy);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}
			episode.setEncounterCollection(encounterList);
			Integer episodeId = episodeDao.addEpisode(episode);

			CcbrQuestion ccbrQuestion = new CcbrQuestion();
			ccbrQuestion.setQuestiomtext(episodeRequest.getReasonForPresentation());
		    ccbrQuestion = episodeDao.addCcbrQuestionInitialy(ccbrQuestion);
            TbDiscussionForumQuestion tbDiscussionForumQuestion = new TbDiscussionForumQuestion();
            tbDiscussionForumQuestion.setQuestion(episodeRequest.getReasonForPresentation()); //deafult question should be
            tbDiscussionForumQuestion.setQuestionDate(new Date());
            tbDiscussionForumQuestion.setCCBRQuestionId(ccbrQuestion);
            tbDiscussionForumQuestion.setPhysicianId(new Physician(episodeRequest.getPhysicianId()));
            tbDiscussionForumQuestion.setTBDiscussionId(tbDiscussionForum);
            Integer tbDiscussionForumQuestionID = episodeDao.addTbDiscussionForumQuestionInitialy(tbDiscussionForumQuestion);
			
			episodeRequest.setEpisodeId(episodeId);
			if (episode.getTumorBoardDiscussionCollection() != null
					&& episode.getTumorBoardDiscussionCollection().size() > 0) {
				episodeRequest
						.setTumorBoardId(new ArrayList<TumorBoardDiscussion>(
								episode.getTumorBoardDiscussionCollection())
								.get(0).getTBDiscussionId());
			}
			Case1 ca = caseDao.getCaseById(episodeRequest.getCaseId());
			episodeRequest.setImagingList(new ArrayList<ImagingRequest>());
			ArrayList<ImagingRequest> imagingList = new ArrayList<ImagingRequest>();
			ImagingRequest image = null;
			for (DiagnosticWorkup d : ca.getDiagnosticWorkupCollection()) {
				image = new ImagingRequest();
				image.setEncounterId(d.getEncounterId());
				image.setImagingDate(d.getEncounter().getEncounterDt());
				image.setImagingType(d.getDxWkupTypeId().getTypeId());
				imagingList.add(image);
			}
			episodeRequest.setImagingList(imagingList);
			episodeRequest.setBiopsyList(new ArrayList<BiopsyRequest>());
			ArrayList<BiopsyRequest> biopsyList = new ArrayList<BiopsyRequest>();
			BiopsyRequest biopsy = null;
			for (Biopsy b : ca.getBiopsyCollection()) {
				biopsy = new BiopsyRequest();
				biopsy.setEncounterId(b.getEncounter().getEncounterId());
				biopsy.setBiopsyDate(b.getEncounter().getEncounterDt());
				biopsy.setBiopsyType(b.getBiopsyTypeId().getTypeId());
				biopsyList.add(biopsy);
			}
			episodeRequest.setBiopsyList(biopsyList);
			episodeRequest
					.setPhysicalExamList(new ArrayList<PhysicalExamRequest>());
			ArrayList<PhysicalExamRequest> physicalList = new ArrayList<PhysicalExamRequest>();
			PhysicalExamRequest exam = null;
			for (PhysicalExam p : ca.getPhysicalExamCollection()) {
				exam = new PhysicalExamRequest();
				exam.setEncounterId(p.getEncounterId());
				exam.setPhysicalExamDate(p.getEncounter().getEncounterDt());
				exam.setPhysicalExamReport(p.getCBEReport());
				physicalList.add(exam);
			}
			episodeRequest.setPhysicalExamList(physicalList);
			episodeRequest
					.setSurgicalProcedureList(new ArrayList<SurgicalProcedureRequest>());
			ArrayList<SurgicalProcedureRequest> surgeryList = new ArrayList<SurgicalProcedureRequest>();
			SurgicalProcedureRequest surgery = null;
			for (Surgery s : ca.getSurgeryCollection()) {
				surgery = new SurgicalProcedureRequest();
				surgery.setEncounterId(s.getEncounterId());
				surgery.setSurgicalProcedureDate(s.getEncounter()
						.getEncounterDt());
				surgery.setSurgicalProcedureType(s.getSurgeryTypeId()
						.getTypeId());
				surgeryList.add(surgery);
			}
			episodeRequest.setSurgicalProcedureList(surgeryList);

			/*restTemplate.postForObject(hubUrl + "episode/addEpisode.json",
					episodeRequest, MedikmResponse.class);*/
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setEpisodeId(episodeId);
			episodeResponse.setTBDiscussionId(tbDiscussionForum.getTBDiscussionId());
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		}else {
			logger.error("Authentication Failed");
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			episodeResponse.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	} catch (Exception ex) {
			logger.error("Error in EpisodeServiceImpl : " + ex.getMessage());
			ex.printStackTrace();
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);

		}
		return episodeResponse;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public EpisodeResponse editGynEpisode(EpisodeRequest episodeRequest, String ipAddress) {
		logger.info("Gyn Episode Update Start");
		EpisodeResponse episodeResponse = new EpisodeResponse();
		try {
			if (authenticationService.authenticateAuthToken(episodeRequest.getAuthToken(), ipAddress)) {
			Episode episode = episodeDao.getEpisodeById(episodeRequest
					.getEpisodeId());
			if (episode != null) {
				DiseaseStatus diseaseStatus = new DiseaseStatus(
						episodeRequest.getDiseaseType());
				episode.setDiseaseType(diseaseStatus);
				episode.setCaseId(new Case1(episodeRequest.getCaseId()));
				episode.setHrt(episodeRequest.getHrt());
				episode.setImagingFindings(episodeRequest.getImagingFindings());
				episode.setRelativeIntraoperativeFindings(episodeRequest
						.getRelativeIntraoperativeFindings());
				episode.setFrozenSectionFindings(episodeRequest
						.getFrozenSectionFindings());
				episode.setPathologyFindings(episodeRequest
						.getPathologyFindings());
				episode.setBiopsyFindings(episodeRequest.getBiopsyFindings());
				if (!episodeRequest.getNextVisitDate().equals("")) {
					DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
				  	String nextVisitDate=episodeRequest.getNextVisitDate();
				  	episode.setNextVisitDate(fmt.parse(nextVisitDate));
				} else {
					episode.setNextVisitDate(null);
				}
				
				Collection<TumorBoardDiscussion> tumorboardCollection = episode.getTumorBoardDiscussionCollection();
				List<TumorBoardDiscussion> tumorBoardList = new ArrayList<TumorBoardDiscussion>(tumorboardCollection);
				
				
				if(tumorBoardList!=null && tumorBoardList.size()>0){
					
					TumorBoardDiscussion tumorBoardDiscussion=null;
					if(tumorBoardList.size()==0){
						tumorBoardDiscussion=tumorBoardList.get(0);
					}else if(tumorBoardList.size()>=1){
						List<TumorBoardDiscussion> tbdList=new ArrayList<TumorBoardDiscussion>();
						for (TumorBoardDiscussion tbd : tumorBoardList) {
							if(tbd.getDiscussiondt()!=null){
								tbdList.add(tbd);
							}
							/*if(tbd.getDiscussionEndTime()!=null){															
								tbdList.add(tbd);
							}*/
						}
						if(tbdList.size()>0){
							Collections.sort(tbdList,Collections.reverseOrder());
							tumorBoardDiscussion=tbdList.get(0);
						}else{
							tumorBoardDiscussion=tumorBoardList.get(tumorBoardList.size()-1);
						}
					}
					if(tumorBoardDiscussion!=null){
						tumorBoardDiscussion.setPrimaryQuestionAskedtoTB(episodeRequest
								.getReasonForPresentation());
						if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
							
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceDate=episodeRequest.getDiscussionDt();
						  	tumorBoardDiscussion.setDiscussiondt(fmt.parse(conferenceDate));

						} else {
							tumorBoardDiscussion.setDiscussiondt(null);
						}
						tumorBoardList.set(0, tumorBoardDiscussion);
					}
				}else {
					TumorBoardDiscussion tumorBoard = new TumorBoardDiscussion();
					tumorBoard.setPrimaryQuestionAskedtoTB(episodeRequest
							.getReasonForPresentation());
					if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
						
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceDate=episodeRequest.getDiscussionDt();
					  	tumorBoard.setDiscussiondt(fmt.parse(conferenceDate));

					} else {
						tumorBoard.setDiscussiondt(null);
					}
					tumorBoardList.set(0, tumorBoard);
				}
				episode.setTumorBoardDiscussionCollection(tumorBoardList);
				//============================== Edit virtual mdt Begin ==========================================
				Collection<TbDiscussionForum> tbDiscussionForumCollection=episode.getTbDiscussionForumCollection();
				List<TbDiscussionForum> tbDiscussionForumList = new ArrayList<TbDiscussionForum>(tbDiscussionForumCollection);
				TbDiscussionForum tbDiscussionForum=null;
				//-----   if tbDiscussionForumList is not empty --------------------
				if(tbDiscussionForumList!=null && tbDiscussionForumList.size()>0){

					if(tbDiscussionForumList.size()==0){
						tbDiscussionForum=tbDiscussionForumList.get(0);
					}else if(tbDiscussionForumList.size()>=1){
						List<TbDiscussionForum> tbdList=new ArrayList<TbDiscussionForum>();
						for (TbDiscussionForum tbd : tbDiscussionForumList) {
							if(tbd.getDiscussiondt()!=null){
								tbdList.add(tbd);
							}
						}
						if(tbdList.size()>0){
							Collections.sort(tbdList,Collections.reverseOrder());
							tbDiscussionForum=tbdList.get(0);
						}else{
							tbDiscussionForum=tbDiscussionForumList.get(tbDiscussionForumList.size()-1);
						}
					}
					if(tbDiscussionForum!=null){
						tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
						//tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
						tbDiscussionForum.setStatus(episodeRequest.getStatus());
						if (episodeRequest.getDiscussionStartDt()!=null && !episodeRequest.getDiscussionStartDt().equals("")) {
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
						  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
						}else {
							tbDiscussionForum.setDiscussiondt(null);
						}
						if (episodeRequest.getDiscussionEndDt()!=null && !episodeRequest.getDiscussionEndDt().equals("")) {
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
						  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
						}else {
							tbDiscussionForum.setDiscussionEndTime(null);
						}
						tbDiscussionForumList.set(0, tbDiscussionForum);
					}
				}else{
					//-----   if tbDiscussionForumList is empty -----------------
					tbDiscussionForum=new TbDiscussionForum();
					tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
					//tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
					tbDiscussionForum.setStatus(episodeRequest.getStatus());
					if (episodeRequest.getDiscussionStartDt()!=null && !episodeRequest.getDiscussionStartDt().equals("")) {
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
					  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
					}else {
						tbDiscussionForum.setDiscussiondt(null);
					}
					if (episodeRequest.getDiscussionEndDt()!=null && !episodeRequest.getDiscussionEndDt().equals("")) {
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
					  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
					}else {
						tbDiscussionForum.setDiscussionEndTime(null);
					}
					tbDiscussionForumList.set(0, tbDiscussionForum);
				}
				episode.setTbDiscussionForumCollection(tbDiscussionForumList);
				if ((episodeRequest.getCasehistory() != null && !episodeRequest.getCasehistory().trim().equals(""))
						|| ((episodeRequest.getComorbidities() != null && !episodeRequest.getComorbidities().trim().equals("")))
						|| ((episodeRequest.getOtherHistory() != null && !episodeRequest.getOtherHistory().trim().equals(""))) 
						|| (episodeRequest.getAdequatePreviousSurgery() != null)
						|| (episodeRequest.getClinicalPresentation() != null)
						|| (episodeRequest.getIncidentalFinding() != null)
						|| ((episodeRequest.getBmi() != null && !episodeRequest.getBmi().trim().equals("")))
						|| ((episodeRequest.getSymptomsId() != null))) {
					PersonalMedicalHistoryPK perHistoryPK = new PersonalMedicalHistoryPK();
					perHistoryPK.setPatientId(episodeRequest.getPatientId());
					perHistoryPK.setMedHistDate(new Date());
					PersonalMedicalHistory medicalHistory = new PersonalMedicalHistory();
					medicalHistory.setPersonalMedicalHistoryPK(perHistoryPK);
					medicalHistory.setComments(episodeRequest.getCasehistory());
					medicalHistory.setMajorComorbidities(episodeRequest
							.getComorbidities());
					medicalHistory.setOtherHistory(episodeRequest
							.getOtherHistory());
					medicalHistory.setAdequatePreviousSurgery(episodeRequest.getAdequatePreviousSurgery());
					medicalHistory.setClinicalPresentation(episodeRequest.getClinicalPresentation());
					medicalHistory.setIncidentalFinding(episodeRequest.getIncidentalFinding());
					medicalHistory.setBmi(episodeRequest.getBmi());
					//medicalHistory.setSymptoms(episodeDao.getSymptomsById(episodeRequest.getSymptomsId()));
					episodeDao.addPersonalMedicalHistory(medicalHistory);
				}

				/*ReproductiveHistory reproductiveHistory = episodeDao
						.getReproductiveHistory(episodeRequest.getPatientId());
				if (reproductiveHistory != null) {
					reproductiveHistory.setBirthControlPillsUsed(episodeRequest
							.getBcp());
					reproductiveHistory.setNoDeliveries(episodeRequest
							.getNoOfDelivery());
					reproductiveHistory.setNoPregnancies(episodeRequest
							.getNoOfPregnancy());
					episodeDao.updateReproductiveHistory(reproductiveHistory);
				} else*/ {
					ReproductiveHistory reproductiveHistory;
					ReproductiveHistoryPK reproductiveHistoryPK = new ReproductiveHistoryPK();
					reproductiveHistoryPK.setPatientId(episodeRequest
							.getPatientId());
					reproductiveHistoryPK.setRHDt(new Date());
					reproductiveHistory = new ReproductiveHistory();
					reproductiveHistory
							.setReproductiveHistoryPK(reproductiveHistoryPK);
					reproductiveHistory.setBirthControlPillsUsed(episodeRequest
							.getBcp());
					reproductiveHistory.setNoDeliveries(episodeRequest
							.getNoOfDelivery());
					reproductiveHistory.setNoPregnancies(episodeRequest
							.getNoOfPregnancy());
					episodeDao.addReproductiveHistory(reproductiveHistory);
				}
				if (episodeRequest.getFamilyHistory() != null
						&& !episodeRequest.getFamilyHistory().trim().equals("")) {
					FamilyHistory familyHistory;
					FamilyHistoryPK familyHistoryPK = new FamilyHistoryPK();
					familyHistoryPK.setPatientId(episodeRequest.getPatientId());
					familyHistoryPK.setFHDate(new Date());
					familyHistory = new FamilyHistory();
					familyHistory.setFamilyHistoryPK(familyHistoryPK);
					familyHistory.setFamilyHistoryComments(episodeRequest
							.getFamilyHistory());
					episodeDao.addFamilyHistory(familyHistory);
				}
				Case1 case1 = caseDao.getCaseById(episodeRequest.getCaseId());
				case1.setMenopauseStatus(episodeRequest.getMenopauseStatus());
				if (episodeRequest.getFunctionalStatus() != null
						&& episodeRequest.getFunctionalStatus() != 0) {
					case1.setFunctionalStatus(new Functionalstatus(
							episodeRequest.getFunctionalStatus()));
				}
				case1.removeAllDiseaseSymptomsCollection();
				if(episodeRequest.getSymptomsId()!=null && episodeRequest.getSymptomsId().size()>0){
					List<DiseaseSymptoms> caseDiseaseSymptomsList=new ArrayList<DiseaseSymptoms>();
					for(Integer symptomsId : episodeRequest.getSymptomsId()){
						
							DiseaseSymptoms diseaseSymptoms=new DiseaseSymptoms();
							diseaseSymptoms.setSymptomsId(new Symptoms(symptomsId));
							diseaseSymptoms.setCaseId(case1);
							caseDiseaseSymptomsList.add(diseaseSymptoms);
					}
					case1.addAllDiseaseSymptomsCollection(caseDiseaseSymptomsList);
				}
				//---------------get caseStatus from Episode request and set to case1 table ----satart
				case1.setCaseStatus(episodeRequest.getCaseStatus());
				//---------------get caseStatus from Episode request and set to case1 table ----end
				caseDao.updateCase(case1);
				
				List<Encounter> encounterList = new ArrayList<Encounter>();
				Encounter encounter = null;

				if (episodeRequest.getPhysicalExamList() != null
						&& episodeRequest.getPhysicalExamList().size() > 0) {
					for (PhysicalExamRequest p : episodeRequest
							.getPhysicalExamList()) {
						encounter = episodeDao.getEncounterById(p
								.getEncounterId());
						if (encounter != null) {
							logger.info("updating Physical Exam");
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(p.getPhysicalExamDate());
							PhysicalExam physicalExam = encounter
									.getPhysicalExam();
							// physicalExam.setEncounterId(encounter.getEncounterId());
							physicalExam
									.setCBEReport(p.getPhysicalExamReport());
							physicalExam.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							physicalExam.setEncounter(encounter);
							encounter.setPhysicalExam(physicalExam);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(p.getPhysicalExamDate());
							PhysicalExam physicalExam = new PhysicalExam();
							physicalExam
									.setCBEReport(p.getPhysicalExamReport());
							physicalExam.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							physicalExam.setEncounter(encounter);
							encounter.setPhysicalExam(physicalExam);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getSurgicalProcedureList() != null
						&& episodeRequest.getSurgicalProcedureList().size() > 0) {
					for (SurgicalProcedureRequest s : episodeRequest
							.getSurgicalProcedureList()) {
						encounter = episodeDao.getEncounterById(s
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(s
									.getSurgicalProcedureDate());
							Surgery surgery = encounter.getSurgery();
							surgery.setSurgeryTypeId(new SurgeryType(s
									.getSurgicalProcedureType()));
							surgery.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							surgery.setEncounter(encounter);
							encounter.setSurgery(surgery);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(s
									.getSurgicalProcedureDate());
							Surgery surgery = new Surgery();
							surgery.setSurgeryTypeId(new SurgeryType(s
									.getSurgicalProcedureType()));
							logger.info("Surgical procedure type = "
									+ s.getSurgicalProcedureType());
							surgery.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							surgery.setEncounter(encounter);
							encounter.setSurgery(surgery);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}
				if (episodeRequest.getImagingList() != null
						&& episodeRequest.getImagingList().size() > 0) {
					for (ImagingRequest i : episodeRequest.getImagingList()) {
						encounter = episodeDao.getEncounterById(i
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(i.getImagingDate());
							DiagnosticWorkup d = encounter
									.getDiagnosticWorkup();
							d.setDxWkupTypeId(new WorkupKindType(i
									.getImagingType()));
							d.setCaseId(new Case1(episodeRequest.getCaseId()));
							d.setEncounter(encounter);
							encounter.setDiagnosticWorkup(d);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(i.getImagingDate());
							DiagnosticWorkup d = new DiagnosticWorkup();
							d.setDxWkupTypeId(new WorkupKindType(i
									.getImagingType()));
							d.setCaseId(new Case1(episodeRequest.getCaseId()));
							d.setEncounter(encounter);
							encounter.setDiagnosticWorkup(d);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getBiopsyList() != null
						&& episodeRequest.getBiopsyList().size() > 0) {
					for (BiopsyRequest b : episodeRequest.getBiopsyList()) {
						encounter = episodeDao.getEncounterById(b
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(b.getBiopsyDate());
							Biopsy biopsy = encounter.getBiopsy();
							biopsy.setBiopsyTypeId(new BiopsyType(b
									.getBiopsyType()));
							biopsy.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							biopsy.setEncounter(encounter);
							encounter.setBiopsy(biopsy);
							encounter.setEpisodeId(episode);

						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(b.getBiopsyDate());
							Biopsy biopsy = new Biopsy();
							biopsy.setBiopsyTypeId(new BiopsyType(b
									.getBiopsyType()));
							biopsy.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							biopsy.setEncounter(encounter);
							encounter.setBiopsy(biopsy);
							encounter.setEpisodeId(episode);

						}

						encounterList.add(encounter);
					}
				}
				episode.setEncounterCollection(encounterList);
				episodeDao.updateEpisode(episode);
				logger.info("EPisode Edited Successfully");
				Case1 ca = caseDao.getCaseById(episodeRequest.getCaseId());
				episodeRequest.setImagingList(new ArrayList<ImagingRequest>());
				ArrayList<ImagingRequest> imagingList = new ArrayList<ImagingRequest>();
				ImagingRequest image = null;
				for (DiagnosticWorkup d : ca.getDiagnosticWorkupCollection()) {
					image = new ImagingRequest();
					image.setEncounterId(d.getEncounterId());
					image.setImagingDate(d.getEncounter().getEncounterDt());
					image.setImagingType(d.getDxWkupTypeId().getTypeId());
					imagingList.add(image);
				}
				episodeRequest.setImagingList(imagingList);
				episodeRequest.setBiopsyList(new ArrayList<BiopsyRequest>());
				ArrayList<BiopsyRequest> biopsyList = new ArrayList<BiopsyRequest>();
				BiopsyRequest biopsy = null;
				for (Biopsy b : ca.getBiopsyCollection()) {
					biopsy = new BiopsyRequest();
					biopsy.setEncounterId(b.getEncounter().getEncounterId());
					biopsy.setBiopsyDate(b.getEncounter().getEncounterDt());
					biopsy.setBiopsyType(b.getBiopsyTypeId().getTypeId());
					biopsyList.add(biopsy);
				}
				episodeRequest.setBiopsyList(biopsyList);
				episodeRequest
						.setPhysicalExamList(new ArrayList<PhysicalExamRequest>());
				ArrayList<PhysicalExamRequest> physicalList = new ArrayList<PhysicalExamRequest>();
				PhysicalExamRequest exam = null;
				for (PhysicalExam p : ca.getPhysicalExamCollection()) {
					exam = new PhysicalExamRequest();
					exam.setEncounterId(p.getEncounterId());
					exam.setPhysicalExamDate(p.getEncounter().getEncounterDt());
					exam.setPhysicalExamReport(p.getCBEReport());
					physicalList.add(exam);
				}
				episodeRequest.setPhysicalExamList(physicalList);
				episodeRequest
						.setSurgicalProcedureList(new ArrayList<SurgicalProcedureRequest>());
				ArrayList<SurgicalProcedureRequest> surgeryList = new ArrayList<SurgicalProcedureRequest>();
				SurgicalProcedureRequest surgery = null;
				for (Surgery s : ca.getSurgeryCollection()) {
					surgery = new SurgicalProcedureRequest();
					surgery.setEncounterId(s.getEncounterId());
					surgery.setSurgicalProcedureDate(s.getEncounter()
							.getEncounterDt());
					surgery.setSurgicalProcedureType(s.getSurgeryTypeId()
							.getTypeId());
					surgeryList.add(surgery);
				}
				episodeRequest.setSurgicalProcedureList(surgeryList);

				/*restTemplate.postForObject(hubUrl + "episode/editEpisode.json",
						episodeRequest, MedikmResponse.class);*/
				episodeResponse.setAuthenticationKey("");
				episodeResponse.setTBDiscussionId(tbDiscussionForum.getTBDiscussionId());
				episodeResponse
						.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				episodeResponse
						.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			} else {
				episodeResponse=addGynEpisode(episodeRequest, ipAddress);
			}
		} else {
			logger.error("Authentication Failed");
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			episodeResponse.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			logger.error("Error in update Episode : " + ex);
			ex.printStackTrace();
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		return episodeResponse;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public EpisodeResponse editSurcomaEpisode(EpisodeRequest episodeRequest, String ipAddress) {
		logger.info("Gyn Episode Update Start");
		EpisodeResponse episodeResponse = new EpisodeResponse();
		try {
			if (authenticationService.authenticateAuthToken(episodeRequest.getAuthToken(), ipAddress)) {
			Episode episode = episodeDao.getEpisodeById(episodeRequest
					.getEpisodeId());
			if (episode != null) {
				DiseaseStatus diseaseStatus = new DiseaseStatus(
						episodeRequest.getDiseaseType());
				episode.setDiseaseType(diseaseStatus);
				episode.setCaseId(new Case1(episodeRequest.getCaseId()));
				episode.setHrt(episodeRequest.getHrt());
				episode.setImagingFindings(episodeRequest.getImagingFindings());
				episode.setRelativeIntraoperativeFindings(episodeRequest
						.getRelativeIntraoperativeFindings());
				episode.setFrozenSectionFindings(episodeRequest
						.getFrozenSectionFindings());
				episode.setPathologyFindings(episodeRequest
						.getPathologyFindings());
				episode.setBiopsyFindings(episodeRequest.getBiopsyFindings());
				Collection<TumorBoardDiscussion> tumorboardCollection = episode.getTumorBoardDiscussionCollection();
				List<TumorBoardDiscussion> tumorBoardList = new ArrayList<TumorBoardDiscussion>(tumorboardCollection);
				
				
				if(tumorBoardList!=null && tumorBoardList.size()>0){
					
					TumorBoardDiscussion tumorBoardDiscussion=null;
					if(tumorBoardList.size()==0){
						tumorBoardDiscussion=tumorBoardList.get(0);
					}else if(tumorBoardList.size()>=1){
						List<TumorBoardDiscussion> tbdList=new ArrayList<TumorBoardDiscussion>();
						for (TumorBoardDiscussion tbd : tumorBoardList) {
							if(tbd.getDiscussiondt()!=null){
								tbdList.add(tbd);
							}
							/*if(tbd.getDiscussionEndTime()!=null){															
								tbdList.add(tbd);
							}*/
						}
						if(tbdList.size()>0){
							Collections.sort(tbdList,Collections.reverseOrder());
							tumorBoardDiscussion=tbdList.get(0);
						}else{
							tumorBoardDiscussion=tumorBoardList.get(tumorBoardList.size()-1);
						}
					}
					if(tumorBoardDiscussion!=null){
						tumorBoardDiscussion.setPrimaryQuestionAskedtoTB(episodeRequest
								.getReasonForPresentation());
						if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
							
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceDate=episodeRequest.getDiscussionDt();
						  	tumorBoardDiscussion.setDiscussiondt(fmt.parse(conferenceDate));

						} else {
							tumorBoardDiscussion.setDiscussiondt(null);
						}
						tumorBoardList.set(0, tumorBoardDiscussion);
					}
				}else {
					TumorBoardDiscussion tumorBoard = new TumorBoardDiscussion();
					tumorBoard.setPrimaryQuestionAskedtoTB(episodeRequest
							.getReasonForPresentation());
					if (episodeRequest.getDiscussionDt() != null &&!episodeRequest.getDiscussionDt().equals("")) {
						
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceDate=episodeRequest.getDiscussionDt();
					  	tumorBoard.setDiscussiondt(fmt.parse(conferenceDate));

					} else {
						tumorBoard.setDiscussiondt(null);
					}
					tumorBoardList.set(0, tumorBoard);
				}
				episode.setTumorBoardDiscussionCollection(tumorBoardList);
				//============================== Edit virtual mdt Begin ==========================================
				Collection<TbDiscussionForum> tbDiscussionForumCollection=episode.getTbDiscussionForumCollection();
				List<TbDiscussionForum> tbDiscussionForumList = new ArrayList<TbDiscussionForum>(tbDiscussionForumCollection);
				TbDiscussionForum tbDiscussionForum=null;
				//-----   if tbDiscussionForumList is not empty --------------------
				if(tbDiscussionForumList!=null && tbDiscussionForumList.size()>0){

					if(tbDiscussionForumList.size()==0){
						tbDiscussionForum=tbDiscussionForumList.get(0);
					}else if(tbDiscussionForumList.size()>=1){
						List<TbDiscussionForum> tbdList=new ArrayList<TbDiscussionForum>();
						for (TbDiscussionForum tbd : tbDiscussionForumList) {
							if(tbd.getDiscussiondt()!=null){
								tbdList.add(tbd);
							}
						}
						if(tbdList.size()>0){
							Collections.sort(tbdList,Collections.reverseOrder());
							tbDiscussionForum=tbdList.get(0);
						}else{
							tbDiscussionForum=tbDiscussionForumList.get(tbDiscussionForumList.size()-1);
						}
					}
					if(tbDiscussionForum!=null){
						tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
						//tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
						tbDiscussionForum.setStatus(episodeRequest.getStatus());
						if (episodeRequest.getDiscussionStartDt()!=null && !episodeRequest.getDiscussionStartDt().equals("")) {
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
						  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
						}else {
							tbDiscussionForum.setDiscussiondt(null);
						}
						if (episodeRequest.getDiscussionEndDt()!=null && !episodeRequest.getDiscussionEndDt().equals("")) {
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
						  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
						}else {
							tbDiscussionForum.setDiscussionEndTime(null);
						}
						tbDiscussionForumList.set(0, tbDiscussionForum);
					}
				}else{
					//-----   if tbDiscussionForumList is empty -----------------
					tbDiscussionForum=new TbDiscussionForum();
					tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
					//tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
					tbDiscussionForum.setStatus(episodeRequest.getStatus());
					if (episodeRequest.getDiscussionStartDt()!=null && !episodeRequest.getDiscussionStartDt().equals("")) {
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
					  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
					}else {
						tbDiscussionForum.setDiscussiondt(null);
					}
					if (episodeRequest.getDiscussionEndDt()!=null && !episodeRequest.getDiscussionEndDt().equals("")) {
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
					  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
					}else {
						tbDiscussionForum.setDiscussionEndTime(null);
					}
					tbDiscussionForumList.set(0, tbDiscussionForum);
				}
				episode.setTbDiscussionForumCollection(tbDiscussionForumList);
				if ((episodeRequest.getCasehistory() != null && !episodeRequest
						.getCasehistory().trim().equals(""))
						|| ((episodeRequest.getComorbidities() != null && !episodeRequest
								.getComorbidities().trim().equals("")))) {
					PersonalMedicalHistoryPK perHistoryPK = new PersonalMedicalHistoryPK();
					perHistoryPK.setPatientId(episodeRequest.getPatientId());
					perHistoryPK.setMedHistDate(new Date());
					PersonalMedicalHistory medicalHistory = new PersonalMedicalHistory();
					medicalHistory.setPersonalMedicalHistoryPK(perHistoryPK);
					medicalHistory.setComments(episodeRequest.getCasehistory());
					medicalHistory.setMajorComorbidities(episodeRequest
							.getComorbidities());
					medicalHistory.setOtherHistory(episodeRequest
							.getOtherHistory());
					medicalHistory.setTraumaHx(episodeRequest.getTraumaHx());
					medicalHistory.setRtHx(episodeRequest.getRtHx());
					medicalHistory.setToxicChemicals(episodeRequest
							.getToxicChemicals());
					episodeDao.addPersonalMedicalHistory(medicalHistory);
				}

				/*ReproductiveHistory reproductiveHistory = episodeDao
						.getReproductiveHistory(episodeRequest.getPatientId());
				if (reproductiveHistory != null) {
					reproductiveHistory.setBirthControlPillsUsed(episodeRequest
							.getBcp());
					reproductiveHistory.setNoDeliveries(episodeRequest
							.getNoOfDelivery());
					reproductiveHistory.setNoPregnancies(episodeRequest
							.getNoOfPregnancy());
					episodeDao.updateReproductiveHistory(reproductiveHistory);
				} else */{
					ReproductiveHistory reproductiveHistory;
					ReproductiveHistoryPK reproductiveHistoryPK = new ReproductiveHistoryPK();
					reproductiveHistoryPK.setPatientId(episodeRequest
							.getPatientId());
					reproductiveHistoryPK.setRHDt(new Date());
					reproductiveHistory = new ReproductiveHistory();
					reproductiveHistory
							.setReproductiveHistoryPK(reproductiveHistoryPK);
					reproductiveHistory.setBirthControlPillsUsed(episodeRequest
							.getBcp());
					reproductiveHistory.setNoDeliveries(episodeRequest
							.getNoOfDelivery());
					reproductiveHistory.setNoPregnancies(episodeRequest
							.getNoOfPregnancy());
					episodeDao.addReproductiveHistory(reproductiveHistory);
				}
				if (episodeRequest.getFamilyHistory() != null
						&& !episodeRequest.getFamilyHistory().trim().equals("")) {
					FamilyHistory familyHistory;
					FamilyHistoryPK familyHistoryPK = new FamilyHistoryPK();
					familyHistoryPK.setPatientId(episodeRequest.getPatientId());
					familyHistoryPK.setFHDate(new Date());
					familyHistory = new FamilyHistory();
					familyHistory.setFamilyHistoryPK(familyHistoryPK);
					familyHistory.setFamilyHistoryComments(episodeRequest
							.getFamilyHistory());
					episodeDao.addFamilyHistory(familyHistory);
				}
				Case1 case1 = caseDao.getCaseById(episodeRequest.getCaseId());
				case1.setMenopauseStatus(episodeRequest.getMenopauseStatus());
				if (episodeRequest.getFunctionalStatus() != null
						&& episodeRequest.getFunctionalStatus() != 0) {
					case1.setFunctionalStatus(new Functionalstatus(
							episodeRequest.getFunctionalStatus()));
				}
				//---------------get caseStatus from Episode request and set to case1 table ----satart
				case1.setCaseStatus(episodeRequest.getCaseStatus());
				//---------------get caseStatus from Episode request and set to case1 table ----end
				caseDao.updateCase(case1);
				List<Encounter> encounterList = new ArrayList<Encounter>();
				Encounter encounter = null;

				if (episodeRequest.getPhysicalExamList() != null
						&& episodeRequest.getPhysicalExamList().size() > 0) {
					for (PhysicalExamRequest p : episodeRequest
							.getPhysicalExamList()) {
						encounter = episodeDao.getEncounterById(p
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(p.getPhysicalExamDate());
							PhysicalExam physicalExam = encounter
									.getPhysicalExam();
							physicalExam
									.setCBEReport(p.getPhysicalExamReport());
							physicalExam.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							physicalExam.setEncounter(encounter);
							encounter.setPhysicalExam(physicalExam);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(p.getPhysicalExamDate());
							PhysicalExam physicalExam = new PhysicalExam();
							physicalExam
									.setCBEReport(p.getPhysicalExamReport());
							physicalExam.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							physicalExam.setEncounter(encounter);
							encounter.setPhysicalExam(physicalExam);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getSurgicalProcedureList() != null
						&& episodeRequest.getSurgicalProcedureList().size() > 0) {
					for (SurgicalProcedureRequest s : episodeRequest
							.getSurgicalProcedureList()) {
						encounter = episodeDao.getEncounterById(s
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(s
									.getSurgicalProcedureDate());
							Surgery surgery = encounter.getSurgery();
							surgery.setSurgeryTypeId(new SurgeryType(s
									.getSurgicalProcedureType()));
							surgery.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							surgery.setEncounter(encounter);
							encounter.setSurgery(surgery);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(s
									.getSurgicalProcedureDate());
							Surgery surgery = new Surgery();
							surgery.setSurgeryTypeId(new SurgeryType(s
									.getSurgicalProcedureType()));
							surgery.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							surgery.setEncounter(encounter);
							encounter.setSurgery(surgery);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getImagingList() != null
						&& episodeRequest.getImagingList().size() > 0) {
					for (ImagingRequest i : episodeRequest.getImagingList()) {
						encounter = episodeDao.getEncounterById(i
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(i.getImagingDate());
							DiagnosticWorkup d = encounter
									.getDiagnosticWorkup();
							d.setDxWkupTypeId(new WorkupKindType(i
									.getImagingType()));
							d.setCaseId(new Case1(episodeRequest.getCaseId()));
							d.setEncounter(encounter);
							encounter.setDiagnosticWorkup(d);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(i.getImagingDate());
							DiagnosticWorkup d = new DiagnosticWorkup();
							d.setDxWkupTypeId(new WorkupKindType(i
									.getImagingType()));
							d.setCaseId(new Case1(episodeRequest.getCaseId()));
							d.setEncounter(encounter);
							encounter.setDiagnosticWorkup(d);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getBiopsyList() != null
						&& episodeRequest.getBiopsyList().size() > 0) {
					for (BiopsyRequest b : episodeRequest.getBiopsyList()) {
						encounter = episodeDao.getEncounterById(b
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(b.getBiopsyDate());
							Biopsy biopsy = encounter.getBiopsy();
							biopsy.setBiopsyTypeId(new BiopsyType(b
									.getBiopsyType()));
							biopsy.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							biopsy.setEncounter(encounter);
							encounter.setBiopsy(biopsy);
							encounter.setEpisodeId(episode);

						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(b.getBiopsyDate());
							Biopsy biopsy = new Biopsy();
							biopsy.setBiopsyTypeId(new BiopsyType(b
									.getBiopsyType()));
							biopsy.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							biopsy.setEncounter(encounter);
							encounter.setBiopsy(biopsy);
							encounter.setEpisodeId(episode);

						}

						encounterList.add(encounter);
					}
				}
				episode.setEncounterCollection(encounterList);
				episodeDao.updateEpisode(episode);
				logger.info("EPisode Edited Successfully");
				Case1 ca = caseDao.getCaseById(episodeRequest.getCaseId());
				episodeRequest.setImagingList(new ArrayList<ImagingRequest>());
				ArrayList<ImagingRequest> imagingList = new ArrayList<ImagingRequest>();
				ImagingRequest image = null;
				for (DiagnosticWorkup d : ca.getDiagnosticWorkupCollection()) {
					image = new ImagingRequest();
					image.setEncounterId(d.getEncounterId());
					image.setImagingDate(d.getEncounter().getEncounterDt());
					image.setImagingType(d.getDxWkupTypeId().getTypeId());
					imagingList.add(image);
				}
				episodeRequest.setImagingList(imagingList);
				episodeRequest.setBiopsyList(new ArrayList<BiopsyRequest>());
				ArrayList<BiopsyRequest> biopsyList = new ArrayList<BiopsyRequest>();
				BiopsyRequest biopsy = null;
				for (Biopsy b : ca.getBiopsyCollection()) {
					biopsy = new BiopsyRequest();
					biopsy.setEncounterId(b.getEncounter().getEncounterId());
					biopsy.setBiopsyDate(b.getEncounter().getEncounterDt());
					biopsy.setBiopsyType(b.getBiopsyTypeId().getTypeId());
					biopsyList.add(biopsy);
				}
				episodeRequest.setBiopsyList(biopsyList);
				episodeRequest
						.setPhysicalExamList(new ArrayList<PhysicalExamRequest>());
				ArrayList<PhysicalExamRequest> physicalList = new ArrayList<PhysicalExamRequest>();
				PhysicalExamRequest exam = null;
				for (PhysicalExam p : ca.getPhysicalExamCollection()) {
					exam = new PhysicalExamRequest();
					exam.setEncounterId(p.getEncounterId());
					exam.setPhysicalExamDate(p.getEncounter().getEncounterDt());
					exam.setPhysicalExamReport(p.getCBEReport());
					physicalList.add(exam);
				}
				episodeRequest.setPhysicalExamList(physicalList);
				episodeRequest
						.setSurgicalProcedureList(new ArrayList<SurgicalProcedureRequest>());
				ArrayList<SurgicalProcedureRequest> surgeryList = new ArrayList<SurgicalProcedureRequest>();
				SurgicalProcedureRequest surgery = null;
				for (Surgery s : ca.getSurgeryCollection()) {
					surgery = new SurgicalProcedureRequest();
					surgery.setEncounterId(s.getEncounterId());
					surgery.setSurgicalProcedureDate(s.getEncounter()
							.getEncounterDt());
					surgery.setSurgicalProcedureType(s.getSurgeryTypeId()
							.getTypeId());
					surgeryList.add(surgery);
				}
				episodeRequest.setSurgicalProcedureList(surgeryList);
				episodeResponse.setAuthenticationKey("");
				episodeResponse.setTBDiscussionId(tbDiscussionForum.getTBDiscussionId());
				episodeResponse
						.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				episodeResponse
						.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			} else {
				episodeResponse=addSurcomaEpisode(episodeRequest, ipAddress);
			}
		}else {
			logger.error("Authentication Failed");
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			episodeResponse.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	} catch (Exception ex) {
			logger.error("Error in update Episode : " + ex);
			ex.printStackTrace();
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		return episodeResponse;
	}

	@Transactional
	@Override
	public EpisodeResponse addGUEpisode(EpisodeRequest episodeRequest, String ipAddress) {
		logger.info("Start :Add Episode data in GU Onlology");
		EpisodeResponse episodeResponse = new EpisodeResponse();
		
		try {
			if (authenticationService.authenticateAuthToken(episodeRequest.getAuthToken(), ipAddress)) {
				Episode episode = new Episode();
			if (episodeRequest.getDiseaseType() != null
					&& episodeRequest.getDiseaseType() != 0) {
				DiseaseStatus diseaseStatus = new DiseaseStatus(
						episodeRequest.getDiseaseType());
				episode.setDiseaseType(diseaseStatus);
			}
			episode.setCaseId(new Case1(episodeRequest.getCaseId()));
			episode.setHrt(episodeRequest.getHrt());
			episode.setImagingFindings(episodeRequest.getImagingFindings());
			episode.setBiopsyFindings(episodeRequest.getBiopsyFindings());
			episode.setRelativeIntraoperativeFindings(episodeRequest
					.getRelativeIntraoperativeFindings());
			episode.setFrozenSectionFindings(episodeRequest
					.getFrozenSectionFindings());
			episode.setPathologyFindings(episodeRequest.getPathologyFindings());
			//episode.setRecommendedPlan(episodeRequest.getRecommendedPlan());
			TumorBoardDiscussion tbDiscussion = new TumorBoardDiscussion();
			tbDiscussion.setCaseId(new Case1(episodeRequest.getCaseId()));
			tbDiscussion.setPrimaryQuestionAskedtoTB(episodeRequest
					.getReasonForPresentation());
			tbDiscussion.setOptionsConsidered(episodeRequest.getOptionConsideredComment());
			tbDiscussion.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
			if (episodeRequest.getDiscussionDt() != null &&!episodeRequest.getDiscussionDt().equals("")) {
				
				DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			  	String conferenceDate=episodeRequest.getDiscussionDt();
			  	tbDiscussion.setDiscussiondt(fmt.parse(conferenceDate));

			} else {
				//tbDiscussion.setDiscussiondt(episodeRequest.getDiscussionDt());
			}
			tbDiscussion.setEpisodeId(episode);
			List<TumorBoardDiscussion> tbList = new ArrayList<TumorBoardDiscussion>();
			tbList.add(tbDiscussion);
			episode.setTumorBoardDiscussionCollection(tbList);
			//---------------- add virtual mdt forum Begin --------------------------
			TbDiscussionForum tbDiscussionForum = new TbDiscussionForum();
			tbDiscussionForum.setCase1(new Case1(episodeRequest.getCaseId()));
			tbDiscussionForum.setOptionsConsidered(episodeRequest.getOptionConsideredComment());
			tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
			tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
			DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			if (episodeRequest.getDiscussionStartDt() != null && !episodeRequest.getDiscussionStartDt().equals("")) {
				logger.info("tbDiscussionForum (V. MDC) start date : "+ episodeRequest.getDiscussionStartDt());
				
			  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
			  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
			} else {
				tbDiscussionForum.setDiscussiondt(null);
			}
			if (episodeRequest.getDiscussionEndDt() != null && !episodeRequest.getDiscussionEndDt().equals("")) {
				logger.info("tbDiscussionForum (V. MDC) End date : "+ episodeRequest.getDiscussionEndDt());
				
			  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
			  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
			} else {
				tbDiscussionForum.setDiscussionEndTime(null);
			}
			tbDiscussionForum.setStatus(episodeRequest.getStatus());
			tbDiscussionForum.setEpisode(episode);
			List<TbDiscussionForum> tbDiscussionForumList = new ArrayList<TbDiscussionForum>();
			tbDiscussionForumList.add(tbDiscussionForum);
			episode.setTbDiscussionForumCollection(tbDiscussionForumList);
			//---------------- add virtual mdt forum End --------------------------
			if ((episodeRequest.getCasehistory() != null && !episodeRequest
					.getCasehistory().trim().equals(""))
					|| ((episodeRequest.getComorbidities() != null && !episodeRequest
							.getComorbidities().trim().equals("")))
					|| ((episodeRequest.getOtherHistory() != null && !episodeRequest
							.getOtherHistory().trim().equals("")))||(episodeRequest.getCadmiumLevel() != null)
					||(episodeRequest.getCalciumLevel() != null)|| (episodeRequest.getProstatitis() != null)) {
				PersonalMedicalHistoryPK perHistoryPK = new PersonalMedicalHistoryPK();
				perHistoryPK.setPatientId(episodeRequest.getPatientId());
				perHistoryPK.setMedHistDate(new Date());
				PersonalMedicalHistory medicalHistory = new PersonalMedicalHistory();
				medicalHistory.setPersonalMedicalHistoryPK(perHistoryPK);
				medicalHistory.setComments(episodeRequest.getCasehistory());
				medicalHistory.setMajorComorbidities(episodeRequest
						.getComorbidities());
				medicalHistory.setCadmiumLevel(episodeRequest.getCadmiumLevel());
				medicalHistory.setCalciumLevel(episodeRequest.getCalciumLevel());
				medicalHistory.setProstatitis(episodeRequest.getProstatitis());
				medicalHistory
						.setOtherHistory(episodeRequest.getOtherHistory());
				medicalHistory.setCadmiumLevel(episodeRequest.getCadmiumLevel());
				episodeDao.addPersonalMedicalHistory(medicalHistory);
			}
			ReproductiveHistoryPK reproductiveHistoryPK = new ReproductiveHistoryPK();
			reproductiveHistoryPK.setPatientId(episodeRequest.getPatientId());
			reproductiveHistoryPK.setRHDt(new Date());
			ReproductiveHistory reproductiveHistory = new ReproductiveHistory();
			reproductiveHistory.setReproductiveHistoryPK(reproductiveHistoryPK);
			reproductiveHistory.setBirthControlPillsUsed(episodeRequest
					.getBcp());
			reproductiveHistory.setNoDeliveries(episodeRequest
					.getNoOfDelivery());
			reproductiveHistory.setNoPregnancies(episodeRequest
					.getNoOfPregnancy());
			episodeDao.addReproductiveHistory(reproductiveHistory);
			if (episodeRequest.getFamilyHistory() != null
					&& !episodeRequest.getFamilyHistory().trim().equals("")) {
				FamilyHistoryPK familyHistoryPK = new FamilyHistoryPK();
				familyHistoryPK.setPatientId(episodeRequest.getPatientId());
				familyHistoryPK.setFHDate(new Date());
				FamilyHistory familyHistory = new FamilyHistory();
				familyHistory.setFamilyHistoryPK(familyHistoryPK);
				familyHistory.setFamilyHistoryComments(episodeRequest
						.getFamilyHistory());
				episodeDao.addFamilyHistory(familyHistory);
			}
			Case1 case1 = caseDao.getCaseById(episodeRequest.getCaseId());

			if (episodeRequest.getFunctionalStatus() != null
					&& episodeRequest.getFunctionalStatus() != 0) {
				case1.setFunctionalStatus(new Functionalstatus(episodeRequest
						.getFunctionalStatus()));
			}
			//---------------get caseStatus from Episode request and set to case1 table ----satart
			case1.setCaseStatus(episodeRequest.getCaseStatus());
			//---------------get caseStatus from Episode request and set to case1 table ----end
			caseDao.updateCase(case1);
			List<Encounter> encounterList = new ArrayList<Encounter>();
			Encounter encounter = null;

			if (episodeRequest.getPhysicalExamList() != null
					&& episodeRequest.getPhysicalExamList().size() > 0) {
				for (PhysicalExamRequest p : episodeRequest
						.getPhysicalExamList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(p.getPhysicalExamDate());
					PhysicalExam physicalExam = new PhysicalExam();
					physicalExam.setCBEReport(p.getPhysicalExamReport());
					physicalExam.setCaseId(case1);
					physicalExam.setEncounter(encounter);
					encounter.setPhysicalExam(physicalExam);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getSurgicalProcedureList() != null
					&& episodeRequest.getSurgicalProcedureList().size() > 0) {
				for (SurgicalProcedureRequest s : episodeRequest
						.getSurgicalProcedureList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(s.getSurgicalProcedureDate());
					Surgery surgery = new Surgery();
					surgery.setSurgeryTypeId(new SurgeryType(s
							.getSurgicalProcedureType()));
					surgery.setCaseId(case1);
					surgery.setEncounter(encounter);
					encounter.setSurgery(surgery);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getImagingList() != null
					&& episodeRequest.getImagingList().size() > 0) {
				for (ImagingRequest i : episodeRequest.getImagingList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(i.getImagingDate());
					DiagnosticWorkup d = new DiagnosticWorkup();
					d.setDxWkupTypeId(new WorkupKindType(i.getImagingType()));
					d.setCaseId(case1);
					d.setEncounter(encounter);
					encounter.setDiagnosticWorkup(d);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}

			if (episodeRequest.getBiopsyList() != null
					&& episodeRequest.getBiopsyList().size() > 0) {
				for (BiopsyRequest b : episodeRequest.getBiopsyList()) {
					encounter = new Encounter();
					encounter.setCaseId(case1);
					encounter.setEncounterDt(b.getBiopsyDate());
					Biopsy biopsy = new Biopsy();
					biopsy.setBiopsyTypeId(new BiopsyType(b.getBiopsyType()));
					biopsy.setCaseId(case1);
					biopsy.setEncounter(encounter);
					encounter.setBiopsy(biopsy);
					encounter.setEpisodeId(episode);
					encounterList.add(encounter);
				}
			}
			episode.setEncounterCollection(encounterList);
			Integer episodeId = episodeDao.addEpisode(episode);
			
			CcbrQuestion ccbrQuestion = new CcbrQuestion();
			ccbrQuestion.setQuestiomtext(episodeRequest.getReasonForPresentation());
		    ccbrQuestion = episodeDao.addCcbrQuestionInitialy(ccbrQuestion);
            TbDiscussionForumQuestion tbDiscussionForumQuestion = new TbDiscussionForumQuestion();
            tbDiscussionForumQuestion.setQuestion(episodeRequest.getReasonForPresentation()); //deafult question should be
            tbDiscussionForumQuestion.setQuestionDate(new Date());
            tbDiscussionForumQuestion.setCCBRQuestionId(ccbrQuestion);
            tbDiscussionForumQuestion.setPhysicianId(new Physician(episodeRequest.getPhysicianId()));
            tbDiscussionForumQuestion.setTBDiscussionId(tbDiscussionForum);
            Integer tbDiscussionForumQuestionID = episodeDao.addTbDiscussionForumQuestionInitialy(tbDiscussionForumQuestion);
            
			episodeRequest.setEpisodeId(episodeId);
			if (episode.getTumorBoardDiscussionCollection() != null
					&& episode.getTumorBoardDiscussionCollection().size() > 0) {
				episodeRequest
						.setTumorBoardId(new ArrayList<TumorBoardDiscussion>(
								episode.getTumorBoardDiscussionCollection())
								.get(0).getTBDiscussionId());
			}
			Case1 ca = caseDao.getCaseById(episodeRequest.getCaseId());
			episodeRequest.setImagingList(new ArrayList<ImagingRequest>());
			ArrayList<ImagingRequest> imagingList = new ArrayList<ImagingRequest>();
			ImagingRequest image = null;
			for (DiagnosticWorkup d : ca.getDiagnosticWorkupCollection()) {
				image = new ImagingRequest();
				image.setEncounterId(d.getEncounterId());
				image.setImagingDate(d.getEncounter().getEncounterDt());
				image.setImagingType(d.getDxWkupTypeId().getTypeId());
				imagingList.add(image);
			}
			episodeRequest.setImagingList(imagingList);
			episodeRequest.setBiopsyList(new ArrayList<BiopsyRequest>());
			ArrayList<BiopsyRequest> biopsyList = new ArrayList<BiopsyRequest>();
			BiopsyRequest biopsy = null;
			for (Biopsy b : ca.getBiopsyCollection()) {
				biopsy = new BiopsyRequest();
				biopsy.setEncounterId(b.getEncounter().getEncounterId());
				biopsy.setBiopsyDate(b.getEncounter().getEncounterDt());
				biopsy.setBiopsyType(b.getBiopsyTypeId().getTypeId());
				biopsyList.add(biopsy);
			}
			episodeRequest.setBiopsyList(biopsyList);
			episodeRequest
					.setPhysicalExamList(new ArrayList<PhysicalExamRequest>());
			ArrayList<PhysicalExamRequest> physicalList = new ArrayList<PhysicalExamRequest>();
			PhysicalExamRequest exam = null;
			for (PhysicalExam p : ca.getPhysicalExamCollection()) {
				exam = new PhysicalExamRequest();
				exam.setEncounterId(p.getEncounterId());
				exam.setPhysicalExamDate(p.getEncounter().getEncounterDt());
				exam.setPhysicalExamReport(p.getCBEReport());
				physicalList.add(exam);
			}
			episodeRequest.setPhysicalExamList(physicalList);
			episodeRequest
					.setSurgicalProcedureList(new ArrayList<SurgicalProcedureRequest>());
			ArrayList<SurgicalProcedureRequest> surgeryList = new ArrayList<SurgicalProcedureRequest>();
			SurgicalProcedureRequest surgery = null;
			for (Surgery s : ca.getSurgeryCollection()) {
				surgery = new SurgicalProcedureRequest();
				surgery.setEncounterId(s.getEncounterId());
				surgery.setSurgicalProcedureDate(s.getEncounter()
						.getEncounterDt());
				surgery.setSurgicalProcedureType(s.getSurgeryTypeId()
						.getTypeId());
				surgeryList.add(surgery);
			}
			episodeRequest.setSurgicalProcedureList(surgeryList);
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setEpisodeId(episodeId);
			episodeResponse.setTBDiscussionId(tbDiscussionForum.getTBDiscussionId());
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		} else {
			logger.error("Authentication Failed");
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			episodeResponse.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			logger.error("Error in EpisodeServiceImpl : " + ex.getMessage());
			ex.printStackTrace();
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);

		}
		return episodeResponse;
	}

	@Transactional
	@Override
	public EpisodeResponse editGUEpisode(EpisodeRequest episodeRequest, String ipAddress) {
		logger.info("Episode Update Start");
		EpisodeResponse episodeResponse = new EpisodeResponse();
		try {
			if (authenticationService.authenticateAuthToken(episodeRequest.getAuthToken(), ipAddress)) {
			Episode episode = episodeDao.getEpisodeById(episodeRequest
					.getEpisodeId());
			if (episode != null) {
				DiseaseStatus diseaseStatus = new DiseaseStatus(
						episodeRequest.getDiseaseType());
				episode.setDiseaseType(diseaseStatus);
				episode.setCaseId(new Case1(episodeRequest.getCaseId()));
				episode.setHrt(episodeRequest.getHrt());
				episode.setImagingFindings(episodeRequest.getImagingFindings());
				episode.setBiopsyFindings(episodeRequest.getBiopsyFindings());
				episode.setFrozenSectionFindings(episodeRequest
						.getFrozenSectionFindings());
				episode.setPathologyFindings(episodeRequest
						.getPathologyFindings());
				episode.setRelativeIntraoperativeFindings(episodeRequest
						.getRelativeIntraoperativeFindings());
				//episode.setRecommendedPlan(episodeRequest.getRecommendedPlan());
				Collection<TumorBoardDiscussion> tumorboardCollection = episode.getTumorBoardDiscussionCollection();
				List<TumorBoardDiscussion> tumorBoardList = new ArrayList<TumorBoardDiscussion>(tumorboardCollection);
				
				
				if(tumorBoardList!=null && tumorBoardList.size()>0){
					
					TumorBoardDiscussion tumorBoardDiscussion=null;
					if(tumorBoardList.size()==0){
						tumorBoardDiscussion=tumorBoardList.get(0);
					}else if(tumorBoardList.size()>=1){
						List<TumorBoardDiscussion> tbdList=new ArrayList<TumorBoardDiscussion>();
						for (TumorBoardDiscussion tbd : tumorBoardList) {
							if(tbd.getDiscussiondt()!=null){
								tbdList.add(tbd);
							}
							/*if(tbd.getDiscussionEndTime()!=null){															
								tbdList.add(tbd);
							}*/
						}
						if(tbdList.size()>0){
							Collections.sort(tbdList,Collections.reverseOrder());
							tumorBoardDiscussion=tbdList.get(0);
						}else{
							tumorBoardDiscussion=tumorBoardList.get(tumorBoardList.size()-1);
						}
					}
					if(tumorBoardDiscussion!=null){
						tumorBoardDiscussion.setPrimaryQuestionAskedtoTB(episodeRequest
								.getReasonForPresentation());
						if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
							
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceDate=episodeRequest.getDiscussionDt();
						  	tumorBoardDiscussion.setDiscussiondt(fmt.parse(conferenceDate));

						} else {
							tumorBoardDiscussion.setDiscussiondt(null);
						}
						tumorBoardList.set(0, tumorBoardDiscussion);
					}
				}else {
					TumorBoardDiscussion tumorBoard = new TumorBoardDiscussion();
					tumorBoard.setPrimaryQuestionAskedtoTB(episodeRequest
							.getReasonForPresentation());
					if (episodeRequest.getDiscussionDt() != null && !episodeRequest.getDiscussionDt().equals("")) {
						
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceDate=episodeRequest.getDiscussionDt();
					  	tumorBoard.setDiscussiondt(fmt.parse(conferenceDate));

					} else {
						tumorBoard.setDiscussiondt(null);
					}
					tumorBoardList.set(0, tumorBoard);
				}
				episode.setTumorBoardDiscussionCollection(tumorBoardList);
				//============================== Edit virtual mdt Begin ==========================================
				Collection<TbDiscussionForum> tbDiscussionForumCollection=episode.getTbDiscussionForumCollection();
				List<TbDiscussionForum> tbDiscussionForumList = new ArrayList<TbDiscussionForum>(tbDiscussionForumCollection);
				TbDiscussionForum tbDiscussionForum=null;
				//-----   if tbDiscussionForumList is not empty --------------------
				if(tbDiscussionForumList!=null && tbDiscussionForumList.size()>0){

					if(tbDiscussionForumList.size()==0){
						tbDiscussionForum=tbDiscussionForumList.get(0);
					}else if(tbDiscussionForumList.size()>=1){
						List<TbDiscussionForum> tbdList=new ArrayList<TbDiscussionForum>();
						for (TbDiscussionForum tbd : tbDiscussionForumList) {
							if(tbd.getDiscussiondt()!=null){
								tbdList.add(tbd);
							}
						}
						if(tbdList.size()>0){
							Collections.sort(tbdList,Collections.reverseOrder());
							tbDiscussionForum=tbdList.get(0);
						}else{
							tbDiscussionForum=tbDiscussionForumList.get(tbDiscussionForumList.size()-1);
						}
					}
					if(tbDiscussionForum!=null){
						tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
						//tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
						tbDiscussionForum.setStatus(episodeRequest.getStatus());
						if (episodeRequest.getDiscussionStartDt()!=null && !episodeRequest.getDiscussionStartDt().equals("")) {
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
						  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
						}else {
							tbDiscussionForum.setDiscussiondt(null);
						}
						if (episodeRequest.getDiscussionEndDt()!=null && !episodeRequest.getDiscussionEndDt().equals("")) {
							DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
						  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
						}else {
							tbDiscussionForum.setDiscussionEndTime(null);
						}
						tbDiscussionForumList.set(0, tbDiscussionForum);
					}
				}else{
					//-----   if tbDiscussionForumList is empty -----------------
					tbDiscussionForum=new TbDiscussionForum();
					tbDiscussionForum.setPrimaryQuestionAskedtoTB(episodeRequest.getReasonForPresentation());
					//tbDiscussionForum.setFinalTBrecommendation(episodeRequest.getRecommendedPlan());
					tbDiscussionForum.setStatus(episodeRequest.getStatus());
					if (episodeRequest.getDiscussionStartDt()!=null && !episodeRequest.getDiscussionStartDt().equals("")) {
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceStartDate=episodeRequest.getDiscussionStartDt();
					  	tbDiscussionForum.setDiscussiondt(fmt.parse(conferenceStartDate));
					}else {
						tbDiscussionForum.setDiscussiondt(null);
					}
					if (episodeRequest.getDiscussionEndDt()!=null && !episodeRequest.getDiscussionEndDt().equals("")) {
						DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
					  	String conferenceEndDate=episodeRequest.getDiscussionEndDt();
					  	tbDiscussionForum.setDiscussionEndTime(fmt.parse(conferenceEndDate));
					}else {
						tbDiscussionForum.setDiscussionEndTime(null);
					}
					tbDiscussionForumList.set(0, tbDiscussionForum);
				}
				episode.setTbDiscussionForumCollection(tbDiscussionForumList);
				if ((episodeRequest.getCasehistory() != null && !episodeRequest
						.getCasehistory().trim().equals(""))
						|| ((episodeRequest.getComorbidities() != null && !episodeRequest
								.getComorbidities().trim().equals("")))
						|| ((episodeRequest.getOtherHistory() != null && !episodeRequest
								.getOtherHistory().trim().equals("")))||(episodeRequest.getCadmiumLevel() != null)
						||(episodeRequest.getCalciumLevel() != null)|| (episodeRequest.getProstatitis() != null)) {
					PersonalMedicalHistoryPK perHistoryPK = new PersonalMedicalHistoryPK();
					perHistoryPK.setPatientId(episodeRequest.getPatientId());
					perHistoryPK.setMedHistDate(new Date());
					PersonalMedicalHistory medicalHistory = new PersonalMedicalHistory();
					medicalHistory.setPersonalMedicalHistoryPK(perHistoryPK);
					medicalHistory.setComments(episodeRequest.getCasehistory());
					medicalHistory.setMajorComorbidities(episodeRequest
							.getComorbidities());
					medicalHistory.setCadmiumLevel(episodeRequest.getCadmiumLevel());
					medicalHistory.setCalciumLevel(episodeRequest.getCalciumLevel());
					medicalHistory.setProstatitis(episodeRequest.getProstatitis());
					medicalHistory
							.setOtherHistory(episodeRequest.getOtherHistory());
					medicalHistory.setCadmiumLevel(episodeRequest.getCadmiumLevel());
					episodeDao.addPersonalMedicalHistory(medicalHistory);
				}
				{
					ReproductiveHistoryPK reproductiveHistoryPK = new ReproductiveHistoryPK();
					reproductiveHistoryPK.setPatientId(episodeRequest
							.getPatientId());
					reproductiveHistoryPK.setRHDt(new Date());
					ReproductiveHistory reproductiveHistory = new ReproductiveHistory();
					reproductiveHistory
							.setReproductiveHistoryPK(reproductiveHistoryPK);
					reproductiveHistory.setBirthControlPillsUsed(episodeRequest
							.getBcp());
					reproductiveHistory.setNoDeliveries(episodeRequest
							.getNoOfDelivery());
					reproductiveHistory.setNoPregnancies(episodeRequest
							.getNoOfPregnancy());
					episodeDao.addReproductiveHistory(reproductiveHistory);
				}
				if (episodeRequest.getFamilyHistory() != null
						&& !episodeRequest.getFamilyHistory().trim().equals("")) {
					FamilyHistoryPK familyHistoryPK = new FamilyHistoryPK();
					familyHistoryPK.setPatientId(episodeRequest.getPatientId());
					familyHistoryPK.setFHDate(new Date());
					FamilyHistory familyHistory = new FamilyHistory();
					familyHistory.setFamilyHistoryPK(familyHistoryPK);
					familyHistory.setFamilyHistoryComments(episodeRequest
							.getFamilyHistory());
					episodeDao.addFamilyHistory(familyHistory);
				}
				Case1 case1 = caseDao.getCaseById(episodeRequest.getCaseId());
				case1.setMenopauseStatus(episodeRequest.getMenopauseStatus());
				if (episodeRequest.getFunctionalStatus() != null
						&& episodeRequest.getFunctionalStatus() != 0) {
					case1.setFunctionalStatus(new Functionalstatus(
							episodeRequest.getFunctionalStatus()));
				}
				//---------------get caseStatus from Episode request and set to case1 table ----satart
				case1.setCaseStatus(episodeRequest.getCaseStatus());
				//---------------get caseStatus from Episode request and set to case1 table ----end
				caseDao.updateCase(case1);
				List<Encounter> encounterList = new ArrayList<Encounter>();
				Encounter encounter = null;

				if (episodeRequest.getPhysicalExamList() != null
						&& episodeRequest.getPhysicalExamList().size() > 0) {
					for (PhysicalExamRequest p : episodeRequest
							.getPhysicalExamList()) {
						encounter = episodeDao.getEncounterById(p
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(p.getPhysicalExamDate());
							PhysicalExam physicalExam = encounter
									.getPhysicalExam();
							physicalExam
									.setCBEReport(p.getPhysicalExamReport());
							physicalExam.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							physicalExam.setEncounter(encounter);
							encounter.setPhysicalExam(physicalExam);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(p.getPhysicalExamDate());
							PhysicalExam physicalExam = new PhysicalExam();
							physicalExam
									.setCBEReport(p.getPhysicalExamReport());
							physicalExam.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							physicalExam.setEncounter(encounter);
							encounter.setPhysicalExam(physicalExam);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getSurgicalProcedureList() != null
						&& episodeRequest.getSurgicalProcedureList().size() > 0) {
					for (SurgicalProcedureRequest s : episodeRequest
							.getSurgicalProcedureList()) {
						encounter = episodeDao.getEncounterById(s
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(s
									.getSurgicalProcedureDate());
							Surgery surgery = encounter.getSurgery();
							surgery.setSurgeryTypeId(new SurgeryType(s
									.getSurgicalProcedureType()));
							surgery.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							surgery.setEncounter(encounter);
							encounter.setSurgery(surgery);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(s
									.getSurgicalProcedureDate());
							Surgery surgery = new Surgery();
							surgery.setSurgeryTypeId(new SurgeryType(s
									.getSurgicalProcedureType()));
							logger.info("Surgical procedure type = "
									+ s.getSurgicalProcedureType());
							surgery.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							surgery.setEncounter(encounter);
							encounter.setSurgery(surgery);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getImagingList() != null
						&& episodeRequest.getImagingList().size() > 0) {
					for (ImagingRequest i : episodeRequest.getImagingList()) {
						encounter = episodeDao.getEncounterById(i
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(i.getImagingDate());
							DiagnosticWorkup d = encounter
									.getDiagnosticWorkup();
							d.setDxWkupTypeId(new WorkupKindType(i
									.getImagingType()));
							d.setCaseId(new Case1(episodeRequest.getCaseId()));
							d.setEncounter(encounter);
							encounter.setDiagnosticWorkup(d);
							encounter.setEpisodeId(episode);
						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(i.getImagingDate());
							DiagnosticWorkup d = new DiagnosticWorkup();
							d.setDxWkupTypeId(new WorkupKindType(i
									.getImagingType()));
							d.setCaseId(new Case1(episodeRequest.getCaseId()));
							d.setEncounter(encounter);
							encounter.setDiagnosticWorkup(d);
							encounter.setEpisodeId(episode);
						}
						encounterList.add(encounter);
					}
				}

				if (episodeRequest.getBiopsyList() != null
						&& episodeRequest.getBiopsyList().size() > 0) {
					for (BiopsyRequest b : episodeRequest.getBiopsyList()) {
						encounter = episodeDao.getEncounterById(b
								.getEncounterId());
						if (encounter != null) {
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(b.getBiopsyDate());
							Biopsy biopsy = encounter.getBiopsy();
							biopsy.setBiopsyTypeId(new BiopsyType(b
									.getBiopsyType()));
							biopsy.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							biopsy.setEncounter(encounter);
							encounter.setBiopsy(biopsy);
							encounter.setEpisodeId(episode);

						} else {
							encounter = new Encounter();
							encounter.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							encounter.setEncounterDt(b.getBiopsyDate());
							Biopsy biopsy = new Biopsy();
							biopsy.setBiopsyTypeId(new BiopsyType(b
									.getBiopsyType()));
							biopsy.setCaseId(new Case1(episodeRequest
									.getCaseId()));
							biopsy.setEncounter(encounter);
							encounter.setBiopsy(biopsy);
							encounter.setEpisodeId(episode);

						}

						encounterList.add(encounter);
					}
				}
				episode.setEncounterCollection(encounterList);
				episodeDao.updateEpisode(episode);
				logger.info("EPisode Edited Successfully");
				Case1 ca = caseDao.getCaseById(episodeRequest.getCaseId());
				episodeRequest.setImagingList(new ArrayList<ImagingRequest>());
				ArrayList<ImagingRequest> imagingList = new ArrayList<ImagingRequest>();
				ImagingRequest image = null;
				for (DiagnosticWorkup d : ca.getDiagnosticWorkupCollection()) {
					image = new ImagingRequest();
					image.setEncounterId(d.getEncounterId());
					image.setImagingDate(d.getEncounter().getEncounterDt());
					image.setImagingType(d.getDxWkupTypeId().getTypeId());
					imagingList.add(image);
				}
				episodeRequest.setImagingList(imagingList);
				episodeRequest.setBiopsyList(new ArrayList<BiopsyRequest>());
				ArrayList<BiopsyRequest> biopsyList = new ArrayList<BiopsyRequest>();
				BiopsyRequest biopsy = null;
				for (Biopsy b : ca.getBiopsyCollection()) {
					biopsy = new BiopsyRequest();
					biopsy.setEncounterId(b.getEncounter().getEncounterId());
					biopsy.setBiopsyDate(b.getEncounter().getEncounterDt());
					biopsy.setBiopsyType(b.getBiopsyTypeId().getTypeId());
					biopsyList.add(biopsy);
				}
				episodeRequest.setBiopsyList(biopsyList);
				episodeRequest
						.setPhysicalExamList(new ArrayList<PhysicalExamRequest>());
				ArrayList<PhysicalExamRequest> physicalList = new ArrayList<PhysicalExamRequest>();
				PhysicalExamRequest exam = null;
				for (PhysicalExam p : ca.getPhysicalExamCollection()) {
					exam = new PhysicalExamRequest();
					exam.setEncounterId(p.getEncounterId());
					exam.setPhysicalExamDate(p.getEncounter().getEncounterDt());
					exam.setPhysicalExamReport(p.getCBEReport());
					physicalList.add(exam);
				}
				episodeRequest.setPhysicalExamList(physicalList);
				episodeRequest
						.setSurgicalProcedureList(new ArrayList<SurgicalProcedureRequest>());
				ArrayList<SurgicalProcedureRequest> surgeryList = new ArrayList<SurgicalProcedureRequest>();
				SurgicalProcedureRequest surgery = null;
				for (Surgery s : ca.getSurgeryCollection()) {
					surgery = new SurgicalProcedureRequest();
					surgery.setEncounterId(s.getEncounterId());
					surgery.setSurgicalProcedureDate(s.getEncounter()
							.getEncounterDt());
					surgery.setSurgicalProcedureType(s.getSurgeryTypeId()
							.getTypeId());
					surgeryList.add(surgery);
				}
				episodeRequest.setSurgicalProcedureList(surgeryList);

				episodeResponse.setAuthenticationKey("");
				episodeResponse.setTBDiscussionId(tbDiscussionForum.getTBDiscussionId());
				episodeResponse
						.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				episodeResponse
						.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			} else {
				episodeResponse=addGUEpisode(episodeRequest, ipAddress);
				logger.info("New episode create with Id : ");
			}
		}else {
			logger.error("Authentication Failed");
			episodeResponse.setAuthenticationKey("");
			episodeResponse.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			episodeResponse.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	} catch (Exception ex) {
			logger.error("Error in update Episode : " + ex);
			ex.printStackTrace();
			episodeResponse
					.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			episodeResponse
					.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		return episodeResponse;
	}
}

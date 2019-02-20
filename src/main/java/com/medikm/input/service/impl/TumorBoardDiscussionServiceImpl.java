package com.medikm.input.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.TbDiscussionForumDao;
import com.medikm.input.dao.TumorBoardDiscussionDao;
import com.medikm.input.entity.Case1;
import com.medikm.input.entity.Episode;
import com.medikm.input.entity.TbDiscussionForum;
import com.medikm.input.entity.TumorBoardDiscussion;
import com.medikm.input.entity.TumorBoardDiscussionAnswers;
import com.medikm.input.entity.TumorBoardDiscussionQuestion;
import com.medikm.input.request.TbDiscussionAnswerRequest;
import com.medikm.input.request.TbDiscussionForumRequest;
import com.medikm.input.request.TbDiscussionQuestionRequest;
import com.medikm.input.request.TumorBoardDiscussionRequest;
import com.medikm.input.response.TbDiscussionForumResponse;
import com.medikm.input.response.TumorBoardDiscussionResponse;
import com.medikm.input.service.TumorboardDiscussionService;
import com.medikm.input.util.AuthenticationService;
import com.medikm.input.util.MedikmConstants;

@Service("TumorboardDiscussionService")
public class TumorBoardDiscussionServiceImpl implements TumorboardDiscussionService {

	@Autowired
	private TumorBoardDiscussionDao tumorBoardDiscussionDao;
	@Autowired
	private AuthenticationService authenticationService;

	@Autowired
	private TbDiscussionForumDao tbDiscussionForumDao;
	Logger log = Logger.getLogger(TumorBoardDiscussionServiceImpl.class);

	@Override
	@Transactional
	public TumorBoardDiscussionResponse addTumorBoardDiscussion(TumorBoardDiscussionRequest tumorBoardDiscussionRequest,
			String ipAddress) {
		TumorBoardDiscussionResponse response = new TumorBoardDiscussionResponse();
		try {
			if (authenticationService.authenticateAuthToken(tumorBoardDiscussionRequest.getAuthToken(), ipAddress)) {
				TumorBoardDiscussion tbd = tumorBoardDiscussionDao
						.getTumorBoardDiscussionById(tumorBoardDiscussionRequest.getTbDiscussionId());
				if (tbd != null) {
					if (tumorBoardDiscussionRequest.getDiscussiondt() != null) {
						Calendar c1 = Calendar.getInstance();
						c1.setTime(tumorBoardDiscussionRequest.getDiscussiondt());
						c1.set(Calendar.HOUR_OF_DAY, 0);
						c1.set(Calendar.MINUTE, 0);
						c1.set(Calendar.SECOND, 0);
						c1.set(Calendar.MILLISECOND, 0);
						Date tbDate = c1.getTime();
						tbd.setDiscussiondt(tbDate);

					}
					if (tumorBoardDiscussionRequest.getDiscussionEndDate() != null) {
						Calendar c1 = Calendar.getInstance();
						c1.setTime(tumorBoardDiscussionRequest.getDiscussionEndDate());
						c1.set(Calendar.HOUR_OF_DAY, 0);
						c1.set(Calendar.MINUTE, 0);
						c1.set(Calendar.SECOND, 0);
						c1.set(Calendar.MILLISECOND, 0);
						Date tbDate = c1.getTime();
						tbd.setDiscussionEndTime(tbDate);
					}

					// Patient Preferences
					tbd.setOptionsConsidered(tumorBoardDiscussionRequest.getOptionsConsidered());
					tbd.setComparativeEffectivenessAnalysis(
							tumorBoardDiscussionRequest.getComparativeEffectivenessAnalysis());
					tbd.setPatientPreferences(tumorBoardDiscussionRequest.getPatientPreferences());

					// set option consideration or Options Generated
					tbd.setOptionsGenerated(tumorBoardDiscussionRequest.getOptionsGenerated());

					// set patient Considered
					tbd.setPatientInputConsidered(tumorBoardDiscussionRequest.getPatientInputConsidered());

					tbd.setPrimaryQuestionAskedtoTB(tumorBoardDiscussionRequest.getPrimaryQuestionAskedtoTB());
					// Set Literature Consulted
					tbd.setLiteratureConsulted(tumorBoardDiscussionRequest.getLiteratureConsulted());
					// Set Clinical Trails
					tbd.setClinicalTrailsComment(tumorBoardDiscussionRequest.getClinicalTrailsComment());
					tbd.setClinicalTrailsDiscussed(tumorBoardDiscussionRequest.getClinicalTrailsDiscussed());
					tbd.setClinicalTrailsEligible(tumorBoardDiscussionRequest.getClinicalTrailsEligible());
					// set patient Preferences:
					tbd.setPatientPreferences(tumorBoardDiscussionRequest.getPatientPreferences());
					tbd.setPatientInputConsideredComment(
							tumorBoardDiscussionRequest.getPatientInputConsideredComment());
					tbd.setPatientInputConsidered(tumorBoardDiscussionRequest.getPatientInputConsidered());

					// Literature Consulted

					tbd.setLiteratureConsulted(tumorBoardDiscussionRequest.getLiteratureConsulted());
					tbd.setPubResearchUsed(tumorBoardDiscussionRequest.getPubResearchUsed());

					// CPG Consulted/discussed
					tbd.setNCCNGuidelineMet(tumorBoardDiscussionRequest.getnCCNGuidelineMet());
					tbd.setNCCNGuidelineMetComment(tumorBoardDiscussionRequest.getNCCNGuidelineMetComment());
					// Algorithm used/comment
					tbd.setIsAlgorithmUsed(tumorBoardDiscussionRequest.getIsAlgorithmUsed());
					tbd.setIsAlgorithmUsedComment(tumorBoardDiscussionRequest.getIsAlgorithmUsedComment());
					// Eligible used/comment/discussed
					tbd.setClinicalTrailsComment(tumorBoardDiscussionRequest.getClinicalTrailsComment());
					tbd.setClinicalTrailsDiscussed(tumorBoardDiscussionRequest.getClinicalTrailsDiscussed());
					tbd.setClinicalTrailsEligible(tumorBoardDiscussionRequest.getClinicalTrailsEligible());
					// Options generated comment
					tbd.setOptionsGenerated(tumorBoardDiscussionRequest.getOptionsGenerated());
					// Diverging Opinion/comment
					tbd.setDivergingOpinios(tumorBoardDiscussionRequest.getDivergingOpinios());
					tbd.setDivergingOpiniosComment(tumorBoardDiscussionRequest.getDivergingOpiniosComment());
					// Consensus Reached
					tbd.setConsensusReached(tumorBoardDiscussionRequest.getConsensusReached());
					tbd.setConsensusReachedComment(tumorBoardDiscussionRequest.getConsensusReachedComment());

					// Recommended Plan
					tbd.setFinalTBrecommendation(tumorBoardDiscussionRequest.getFinalTBrecommendation());
					tbd.setComparativeEffectivenessAnalysis(
							tumorBoardDiscussionRequest.getComparativeEffectivenessAnalysis());
					tbd.setPathway(tumorBoardDiscussionRequest.getPathway());
					tbd.setSubPathway(tumorBoardDiscussionRequest.getSubPathway());
					tbd.setComment(tumorBoardDiscussionRequest.getComment());
					// tb discussion question answer inserting start
					TumorBoardDiscussionQuestion tbq = null;
					TumorBoardDiscussionAnswers tba = null;
					List<TumorBoardDiscussionQuestion> tbqList = tbd.getTumorBoardDiscussionQuestionList(); // new
					// ArrayList<TumorBoardDiscussionQuestion>();
					List<TumorBoardDiscussionAnswers> tbaList = null;
					if (tumorBoardDiscussionRequest.getQuestionList() != null) {
						if (tbqList != null && tbqList.size() > 0) {
							for (TbDiscussionQuestionRequest q : tumorBoardDiscussionRequest.getQuestionList()) {
								// log.info("Question Id "+q.getQuestionId());
								if (tbqList.contains(q)) {
									int index = tbqList.indexOf(q);
									TumorBoardDiscussionQuestion question = tbqList.get(index);
									question.setQuestionText(q.getQuestionText());
									tbaList = question.getTumorBoardDiscussionAnswersList();
									if (q.getAnswerList() != null && q.getAnswerList().size() > 0) {
										if (tbaList != null && tbaList.size() > 0) {
											for (TbDiscussionAnswerRequest a : q.getAnswerList()) {
												if (tbaList.contains(a) && tbaList.indexOf(a) > -1) {
													TumorBoardDiscussionAnswers answer = tbaList
															.get(tbaList.indexOf(a));
													answer.setAnswerText(a.getAnswerText());
													answer.setConcurrence(a.getConcurrence());
													answer.setDiscurrence(a.getDiscurrence());
													tbaList.set(tbaList.indexOf(a), answer);
												} else {
													tba = new TumorBoardDiscussionAnswers();
													tba.setAnswerText(a.getAnswerText());
													tba.setDateAnswered(new Date());
													tba.setQuestionId(question);
													tba.setConcurrence(a.getConcurrence());
													tba.setDiscurrence(a.getDiscurrence());
													tbaList.add(tba);
												}
											}
										} else {
											tbaList = new ArrayList<TumorBoardDiscussionAnswers>();
											for (TbDiscussionAnswerRequest a : q.getAnswerList()) {
												tba = new TumorBoardDiscussionAnswers();
												tba.setAnswerText(a.getAnswerText());
												tba.setDateAnswered(new Date());
												tba.setQuestionId(question);
												tba.setConcurrence(a.getConcurrence());
												tba.setDiscurrence(a.getDiscurrence());
												tbaList.add(tba);
											}
										}

										question.setTumorBoardDiscussionAnswersList(tbaList);
										tbqList.set(index, question);
									}

								} else {

									tbq = new TumorBoardDiscussionQuestion();
									tbq.setQuestionText(q.getQuestionText());
									tbq.setCaseId(new Case1(tumorBoardDiscussionRequest.getCaseId()));
									tbq.setEpisodeId(new Episode(tumorBoardDiscussionRequest.getEpisodeId()));
									tbq.setTbDiscussionId(tbd);
									tbq.setDateAsked(new Date());
									tbaList = new ArrayList<TumorBoardDiscussionAnswers>();

									if (q.getAnswerList() != null) {
										for (TbDiscussionAnswerRequest a : q.getAnswerList()) {
											tba = new TumorBoardDiscussionAnswers();
											tba.setAnswerText(a.getAnswerText());
											tba.setDateAnswered(new Date());
											tba.setQuestionId(tbq);
											tba.setConcurrence(a.getConcurrence());
											tba.setDiscurrence(a.getDiscurrence());
											tbaList.add(tba);
										}
									}
									tbq.setTumorBoardDiscussionAnswersList(tbaList);
									tbqList.add(tbq);
								}

							}
						} else {
							for (TbDiscussionQuestionRequest q : tumorBoardDiscussionRequest.getQuestionList()) {
								tbq = new TumorBoardDiscussionQuestion();
								tbq.setQuestionText(q.getQuestionText());
								tbq.setCaseId(new Case1(tumorBoardDiscussionRequest.getCaseId()));
								tbq.setEpisodeId(new Episode(tumorBoardDiscussionRequest.getEpisodeId()));
								tbq.setTbDiscussionId(tbd);
								tbq.setDateAsked(new Date());
								tbaList = new ArrayList<TumorBoardDiscussionAnswers>();

								if (q.getAnswerList() != null) {
									for (TbDiscussionAnswerRequest a : q.getAnswerList()) {
										tba = new TumorBoardDiscussionAnswers();
										tba.setAnswerText(a.getAnswerText());
										tba.setDateAnswered(new Date());
										tba.setQuestionId(tbq);
										tba.setConcurrence(a.getConcurrence());
										tba.setDiscurrence(a.getDiscurrence());
										tbaList.add(tba);
									}
								}
								tbq.setTumorBoardDiscussionAnswersList(tbaList);
								tbqList.add(tbq);
							}
						}
					}
					tbd.setTumorBoardDiscussionQuestionList(tbqList);
					// tb discussion question answer inserting end
					tumorBoardDiscussionDao.updateTumorBoardDiscussion(tbd);
					response.setAuthenticationKey("");
					response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
					response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				} else {
					log.info("Tb Discussion Id not found");
				}

			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}

		return response;
	}

	public TumorBoardDiscussionResponse addNewTumorBoardDiscussion(
			TumorBoardDiscussionRequest tumorBoardDiscussionRequest, String ipAddress) {
		TumorBoardDiscussionResponse response = new TumorBoardDiscussionResponse();
		try {
			if (authenticationService.authenticateAuthToken(tumorBoardDiscussionRequest.getAuthToken(), ipAddress)) {
				TumorBoardDiscussion tbd = new TumorBoardDiscussion();
				if (tumorBoardDiscussionRequest.getDiscussiondt() != null) {
					Calendar c1 = Calendar.getInstance();
					c1.setTime(tumorBoardDiscussionRequest.getDiscussiondt());
					c1.set(Calendar.HOUR_OF_DAY, 0);
					c1.set(Calendar.MINUTE, 0);
					c1.set(Calendar.SECOND, 0);
					c1.set(Calendar.MILLISECOND, 0);
					Date tbDate = c1.getTime();
					tbd.setDiscussiondt(tbDate);

				}
				if (tumorBoardDiscussionRequest.getDiscussionEndDate() != null) {
					Calendar c1 = Calendar.getInstance();
					c1.setTime(tumorBoardDiscussionRequest.getDiscussionEndDate());
					c1.set(Calendar.HOUR_OF_DAY, 0);
					c1.set(Calendar.MINUTE, 0);
					c1.set(Calendar.SECOND, 0);
					c1.set(Calendar.MILLISECOND, 0);
					Date tbDate = c1.getTime();
					tbd.setDiscussionEndTime(tbDate);
				}
				Case1 case1 = new Case1();
				case1.setCaseId(tumorBoardDiscussionRequest.getCaseId());
				tbd.setCaseId(case1);
				Episode episode = new Episode();
				episode.setEpisodeId(tumorBoardDiscussionRequest.getEpisodeId());
				tbd.setEpisodeId(episode);
				// tbd.setEpisodeId(tumorBoardDiscussionRequest.getEpisodeId());

				tbd.setOptionsConsidered(tumorBoardDiscussionRequest.getOptionsConsidered());
				tbd.setComparativeEffectivenessAnalysis(
						tumorBoardDiscussionRequest.getComparativeEffectivenessAnalysis());
				tbd.setPatientPreferences(tumorBoardDiscussionRequest.getPatientPreferences());

				// set option consideration or Options Generated
				tbd.setOptionsGenerated(tumorBoardDiscussionRequest.getOptionsGenerated());

				// set patient Considered
				tbd.setPatientInputConsidered(tumorBoardDiscussionRequest.getPatientInputConsidered());
				// Set Literature Consulted
				tbd.setLiteratureConsulted(tumorBoardDiscussionRequest.getLiteratureConsulted());
				tbd.setPrimaryQuestionAskedtoTB(tumorBoardDiscussionRequest.getPrimaryQuestionAskedtoTB());
				// Set Clinical Trails
				tbd.setClinicalTrailsComment(tumorBoardDiscussionRequest.getClinicalTrailsComment());
				tbd.setClinicalTrailsDiscussed(tumorBoardDiscussionRequest.getClinicalTrailsDiscussed());
				tbd.setClinicalTrailsEligible(tumorBoardDiscussionRequest.getClinicalTrailsEligible());
				// set patient Preferences:
				tbd.setPatientPreferences(tumorBoardDiscussionRequest.getPatientPreferences());
				tbd.setPatientInputConsideredComment(tumorBoardDiscussionRequest.getPatientInputConsideredComment());
				tbd.setPatientInputConsidered(tumorBoardDiscussionRequest.getPatientInputConsidered());

				// Literature Consulted

				tbd.setLiteratureConsulted(tumorBoardDiscussionRequest.getLiteratureConsulted());
				tbd.setPubResearchUsed(tumorBoardDiscussionRequest.getPubResearchUsed());

				// CPG Consulted/discussed
				tbd.setNCCNGuidelineMet(tumorBoardDiscussionRequest.getnCCNGuidelineMet());
				tbd.setNCCNGuidelineMetComment(tumorBoardDiscussionRequest.getNCCNGuidelineMetComment());
				// Algorithm used/comment
				tbd.setIsAlgorithmUsed(tumorBoardDiscussionRequest.getIsAlgorithmUsed());
				tbd.setIsAlgorithmUsedComment(tumorBoardDiscussionRequest.getIsAlgorithmUsedComment());
				// Eligible used/comment/discussed
				tbd.setClinicalTrailsComment(tumorBoardDiscussionRequest.getClinicalTrailsComment());
				tbd.setClinicalTrailsDiscussed(tumorBoardDiscussionRequest.getClinicalTrailsDiscussed());
				tbd.setClinicalTrailsEligible(tumorBoardDiscussionRequest.getClinicalTrailsEligible());
				// Options generated comment
				tbd.setOptionsGenerated(tumorBoardDiscussionRequest.getOptionsGenerated());
				// Diverging Opinion/comment
				tbd.setDivergingOpinios(tumorBoardDiscussionRequest.getDivergingOpinios());
				tbd.setDivergingOpiniosComment(tumorBoardDiscussionRequest.getDivergingOpiniosComment());
				// Consensus Reached
				tbd.setConsensusReached(tumorBoardDiscussionRequest.getConsensusReached());
				tbd.setConsensusReachedComment(tumorBoardDiscussionRequest.getConsensusReachedComment());

				// Recommended Plan
				tbd.setFinalTBrecommendation(tumorBoardDiscussionRequest.getFinalTBrecommendation());
				tbd.setComparativeEffectivenessAnalysis(
						tumorBoardDiscussionRequest.getComparativeEffectivenessAnalysis());
				tbd.setPathway(tumorBoardDiscussionRequest.getPathway());
				tbd.setSubPathway(tumorBoardDiscussionRequest.getSubPathway());
				tbd.setComment(tumorBoardDiscussionRequest.getComment());
				// tb discussion question answer inserting start
				TumorBoardDiscussionQuestion tbq = null;
				TumorBoardDiscussionAnswers tba = null;
				List<TumorBoardDiscussionQuestion> tbqList = new ArrayList<TumorBoardDiscussionQuestion>(); // new
				// ArrayList<TumorBoardDiscussionQuestion>();
				List<TumorBoardDiscussionAnswers> tbaList = null;
				if (tumorBoardDiscussionRequest.getQuestionList() != null) {
					for (TbDiscussionQuestionRequest q : tumorBoardDiscussionRequest.getQuestionList()) {
						tbq = new TumorBoardDiscussionQuestion();
						tbq.setQuestionText(q.getQuestionText());
						tbq.setCaseId(new Case1(tumorBoardDiscussionRequest.getCaseId()));
						tbq.setEpisodeId(new Episode(tumorBoardDiscussionRequest.getEpisodeId()));

						tbq.setTbDiscussionId(tbd);
						tbq.setDateAsked(new Date());
						tbaList = new ArrayList<TumorBoardDiscussionAnswers>();
						if (q.getAnswerList() != null) {
							for (TbDiscussionAnswerRequest a : q.getAnswerList()) {
								log.info("answer\n" + a.getAnswerText() + "\n");
								tba = new TumorBoardDiscussionAnswers();
								tba.setAnswerText(a.getAnswerText());
								tba.setDateAnswered(new Date());
								tba.setQuestionId(tbq);
								tba.setConcurrence(a.getConcurrence());
								tba.setDiscurrence(a.getDiscurrence());
								tbaList.add(tba);
							}
						}
						tbq.setTumorBoardDiscussionAnswersList(tbaList);
						tbqList.add(tbq);
					}

				}
				tbd.setTumorBoardDiscussionQuestionList(tbqList);
				// tb discussion question answer inserting end
				Integer tbDiscussionId = tumorBoardDiscussionDao.addTumorBoardDiscussion(tbd);
				response.setTBDiscussionId(tbDiscussionId);
				response.setAuthenticationKey("");
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}

		return response;

	}

	@Override
	public TbDiscussionForumResponse addTbDiscussionForum(TbDiscussionForumRequest tbDiscussionForumRequest,
			String ipAddress) {
		TbDiscussionForumResponse response = new TbDiscussionForumResponse();
		try {
			if (authenticationService.authenticateAuthToken(tbDiscussionForumRequest.getAuthToken(), ipAddress)) {
				TbDiscussionForum tbdforum = tbDiscussionForumDao
						.getTbDiscussionForumById(tbDiscussionForumRequest.getTbDiscussionId());

				if (tbdforum != null) {
					if (tbDiscussionForumRequest.getDiscussiondt() != null) {
						/*
						 * Calendar c1 = Calendar.getInstance();
						 * c1.setTime(tbDiscussionForumRequest.getDiscussiondt()
						 * ); c1.set(Calendar.HOUR_OF_DAY, 0);
						 * c1.set(Calendar.MINUTE, 0); c1.set(Calendar.SECOND,
						 * 0); c1.set(Calendar.MILLISECOND, 0); Date tbDate =
						 * c1.getTime();
						 */
						tbdforum.setDiscussiondt(tbDiscussionForumRequest.getDiscussiondt());
					}
					if (tbDiscussionForumRequest.getDiscussionEndDate() != null) {
						/*
						 * Calendar c1 = Calendar.getInstance();
						 * c1.setTime(tbDiscussionForumRequest.
						 * getDiscussionEndDate()); c1.set(Calendar.HOUR_OF_DAY,
						 * 0); c1.set(Calendar.MINUTE, 0);
						 * c1.set(Calendar.SECOND, 0);
						 * c1.set(Calendar.MILLISECOND, 0); Date tbDate =
						 * c1.getTime();
						 */
						tbdforum.setDiscussionEndTime(tbDiscussionForumRequest.getDiscussionEndDate());
					}
					// Patient Preferences
					tbdforum.setOptionsConsidered(tbDiscussionForumRequest.getOptionsConsidered());
					tbdforum.setComparativeEffectivenessAnalysis(
							tbDiscussionForumRequest.getComparativeEffectivenessAnalysis());
					tbdforum.setPatientPreferences(tbDiscussionForumRequest.getPatientPreferences());

					// set option consideration or Options Generated
					tbdforum.setOptionsGenerated(tbDiscussionForumRequest.getOptionsGenerated());

					// set Primary Question to be asked
					tbdforum.setPrimaryQuestionAskedtoTB(tbDiscussionForumRequest.getPrimaryQuestionAskedtoTB());

					// set patient Considered
					tbdforum.setPatientInputConsidered(tbDiscussionForumRequest.getPatientInputConsidered());
					// Set Literature Consulted
					tbdforum.setLiteratureConsulted(tbDiscussionForumRequest.getLiteratureConsulted());
					// Set Clinical Trails
					tbdforum.setClinicalTrailsComment(tbDiscussionForumRequest.getClinicalTrailsComment());
					tbdforum.setClinicalTrailsDiscussed(tbDiscussionForumRequest.getClinicalTrailsDiscussed());
					tbdforum.setClinicalTrailsEligible(tbDiscussionForumRequest.getClinicalTrailsEligible());
					// set patient Preferences:
					tbdforum.setPatientPreferences(tbDiscussionForumRequest.getPatientPreferences());
					tbdforum.setPatientInputConsideredComment(
							tbDiscussionForumRequest.getPatientInputConsideredComment());
					tbdforum.setPatientInputConsidered(tbDiscussionForumRequest.getPatientInputConsidered());

					// Literature Consulted

					tbdforum.setLiteratureConsulted(tbDiscussionForumRequest.getLiteratureConsulted());
					tbdforum.setPubResearchUsed(tbDiscussionForumRequest.getPubResearchUsed());

					// CPG Consulted/discussed
					tbdforum.setNCCNGuidelineMet(tbDiscussionForumRequest.getnCCNGuidelineMet());
					tbdforum.setNCCNGuidelineMetComment(tbDiscussionForumRequest.getNCCNGuidelineMetComment());
					// Algorithm used/comment
					tbdforum.setIsAlgorithmUsed(tbDiscussionForumRequest.getIsAlgorithmUsed());
					tbdforum.setIsAlgorithmUsedComment(tbDiscussionForumRequest.getIsAlgorithmUsedComment());
					// Eligible used/comment/discussed
					tbdforum.setClinicalTrailsComment(tbDiscussionForumRequest.getClinicalTrailsComment());
					tbdforum.setClinicalTrailsDiscussed(tbDiscussionForumRequest.getClinicalTrailsDiscussed());
					tbdforum.setClinicalTrailsEligible(tbDiscussionForumRequest.getClinicalTrailsEligible());
					// Options generated comment
					tbdforum.setOptionsGenerated(tbDiscussionForumRequest.getOptionsGenerated());
					// Diverging Opinion/comment
					tbdforum.setDivergingOpinios(tbDiscussionForumRequest.getDivergingOpinios());
					tbdforum.setDivergingOpiniosComment(tbDiscussionForumRequest.getDivergingOpiniosComment());
					// Consensus Reached
					tbdforum.setConsensusReached(tbDiscussionForumRequest.getConsensusReached());
					tbdforum.setConsensusReachedComment(tbDiscussionForumRequest.getConsensusReachedComment());

					// Recommended Plan
					tbdforum.setFinalTBrecommendation(tbDiscussionForumRequest.getFinalTBrecommendation());
					tbdforum.setComparativeEffectivenessAnalysis(
							tbDiscussionForumRequest.getComparativeEffectivenessAnalysis());

					tbdforum.setStatus(tbDiscussionForumRequest.getStatus());
					tbDiscussionForumDao.updateTbDiscussionForum(tbdforum);
					response.setAuthenticationKey("");
					response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
					response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				} else {
					log.info("Tb DiscussionForum Id not found");
				}

			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}

		return response;
	}

	public TbDiscussionForumResponse addNewTbDiscussionForum(TbDiscussionForumRequest tbDiscussionForumRequest,
			String ipAddress) {
		TbDiscussionForumResponse response = new TbDiscussionForumResponse();
		try {
			if (authenticationService.authenticateAuthToken(tbDiscussionForumRequest.getAuthToken(), ipAddress)) {
				TbDiscussionForum tbdforum = new TbDiscussionForum();

				if (tbDiscussionForumRequest.getDiscussiondt() != null) {
					/*
					 * Calendar c1 = Calendar.getInstance();
					 * c1.setTime(tbDiscussionForumRequest.getDiscussiondt());
					 * c1.set(Calendar.HOUR_OF_DAY, 0); c1.set(Calendar.MINUTE,
					 * 0); c1.set(Calendar.SECOND, 0);
					 * c1.set(Calendar.MILLISECOND, 0); Date tbDate =
					 * c1.getTime();
					 */
					tbdforum.setDiscussiondt(tbDiscussionForumRequest.getDiscussiondt());
				}
				if (tbDiscussionForumRequest.getDiscussionEndDate() != null) {
					/*
					 * Calendar c1 = Calendar.getInstance();
					 * c1.setTime(tbDiscussionForumRequest.getDiscussionEndDate(
					 * )); c1.set(Calendar.HOUR_OF_DAY, 0);
					 * c1.set(Calendar.MINUTE, 0); c1.set(Calendar.SECOND, 0);
					 * c1.set(Calendar.MILLISECOND, 0); Date tbDate =
					 * c1.getTime();
					 */
					tbdforum.setDiscussionEndTime(tbDiscussionForumRequest.getDiscussionEndDate());
				}
				// caeId
				Case1 case1 = new Case1();
				case1.setCaseId(tbDiscussionForumRequest.getCaseId());
				tbdforum.setCase1(case1);
				// episodeId
				Episode episode = new Episode();
				episode.setEpisodeId(tbDiscussionForumRequest.getEpisodeId());
				tbdforum.setEpisode(episode);
				// Patient Preferences
				tbdforum.setOptionsConsidered(tbDiscussionForumRequest.getOptionsConsidered());
				tbdforum.setComparativeEffectivenessAnalysis(
						tbDiscussionForumRequest.getComparativeEffectivenessAnalysis());
				tbdforum.setPatientPreferences(tbDiscussionForumRequest.getPatientPreferences());

				// set option consideration or Options Generated
				tbdforum.setOptionsGenerated(tbDiscussionForumRequest.getOptionsGenerated());

				// set Primary Question to be asked
				tbdforum.setPrimaryQuestionAskedtoTB(tbDiscussionForumRequest.getPrimaryQuestionAskedtoTB());

				// set patient Considered
				tbdforum.setPatientInputConsidered(tbDiscussionForumRequest.getPatientInputConsidered());
				// Set Literature Consulted
				tbdforum.setLiteratureConsulted(tbDiscussionForumRequest.getLiteratureConsulted());
				// Set Clinical Trails
				tbdforum.setClinicalTrailsComment(tbDiscussionForumRequest.getClinicalTrailsComment());
				tbdforum.setClinicalTrailsDiscussed(tbDiscussionForumRequest.getClinicalTrailsDiscussed());
				tbdforum.setClinicalTrailsEligible(tbDiscussionForumRequest.getClinicalTrailsEligible());
				// set patient Preferences:
				tbdforum.setPatientPreferences(tbDiscussionForumRequest.getPatientPreferences());
				tbdforum.setPatientInputConsideredComment(tbDiscussionForumRequest.getPatientInputConsideredComment());
				tbdforum.setPatientInputConsidered(tbDiscussionForumRequest.getPatientInputConsidered());

				// Literature Consulted

				tbdforum.setLiteratureConsulted(tbDiscussionForumRequest.getLiteratureConsulted());
				tbdforum.setPubResearchUsed(tbDiscussionForumRequest.getPubResearchUsed());

				// CPG Consulted/discussed
				tbdforum.setNCCNGuidelineMet(tbDiscussionForumRequest.getnCCNGuidelineMet());
				tbdforum.setNCCNGuidelineMetComment(tbDiscussionForumRequest.getNCCNGuidelineMetComment());
				// Algorithm used/comment
				tbdforum.setIsAlgorithmUsed(tbDiscussionForumRequest.getIsAlgorithmUsed());
				tbdforum.setIsAlgorithmUsedComment(tbDiscussionForumRequest.getIsAlgorithmUsedComment());
				// Eligible used/comment/discussed
				tbdforum.setClinicalTrailsComment(tbDiscussionForumRequest.getClinicalTrailsComment());
				tbdforum.setClinicalTrailsDiscussed(tbDiscussionForumRequest.getClinicalTrailsDiscussed());
				tbdforum.setClinicalTrailsEligible(tbDiscussionForumRequest.getClinicalTrailsEligible());
				// Options generated comment
				tbdforum.setOptionsGenerated(tbDiscussionForumRequest.getOptionsGenerated());
				// Diverging Opinion/comment
				tbdforum.setDivergingOpinios(tbDiscussionForumRequest.getDivergingOpinios());
				tbdforum.setDivergingOpiniosComment(tbDiscussionForumRequest.getDivergingOpiniosComment());
				// Consensus Reached
				tbdforum.setConsensusReached(tbDiscussionForumRequest.getConsensusReached());
				tbdforum.setConsensusReachedComment(tbDiscussionForumRequest.getConsensusReachedComment());

				// Recommended Plan
				tbdforum.setFinalTBrecommendation(tbDiscussionForumRequest.getFinalTBrecommendation());
				tbdforum.setComparativeEffectivenessAnalysis(
						tbDiscussionForumRequest.getComparativeEffectivenessAnalysis());
				tbdforum.setStatus(tbDiscussionForumRequest.getStatus());

				Integer tbDiscussionId = tbDiscussionForumDao.addTbDiscussionForum(tbdforum);
				response.setTbDiscussionId(tbDiscussionId);
				response.setAuthenticationKey("");
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);

			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}

		return response;
	}
}

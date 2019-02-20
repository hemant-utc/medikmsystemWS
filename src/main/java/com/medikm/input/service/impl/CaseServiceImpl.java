/**
 * 
 */
package com.medikm.input.service.impl;

import java.sql.Timestamp;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.CaseDao;
import com.medikm.input.dao.PatientDao;
import com.medikm.input.entity.CareFacility;
import com.medikm.input.entity.Case1;
import com.medikm.input.entity.DiseaseSubType;
import com.medikm.input.entity.DiseaseType;
import com.medikm.input.entity.Patient;
import com.medikm.input.request.CaseRequest;
import com.medikm.input.request.SimilarCaseRequest;
import com.medikm.input.response.CaseResponse;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.service.CaseService;
import com.medikm.input.util.AuthenticationService;
import com.medikm.input.util.MedikmConstants;
import com.medikm.utility.SimilarCases;

/**
 * @author Saikat
 * 
 */
@Service("caseService")
public class CaseServiceImpl implements CaseService {

	private static final long serialVersionUID = -6061356781274859935L;

	Logger log = Logger.getLogger(CaseServiceImpl.class);

	@Value("${hub.url.value}")
	private String hubUrl;

	@Autowired
	private CaseDao caseDao;

	@Autowired
	private PatientDao patientDao;

	@Autowired
	private AuthenticationService authenticationService;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public CaseResponse addBreastCase(CaseRequest caseRequest, String ipAddress) {

		CaseResponse response = new CaseResponse();
		try {
			if (authenticationService.authenticateAuthToken(caseRequest.getAuthToken(), ipAddress)) {
				Case1 ca = new Case1();
				BeanUtils.copyProperties(ca, caseRequest);
				ca.setERStatus(caseRequest.getErStatus());
				ca.setERPercent(caseRequest.getErPercent());
				ca.setPRStatus(caseRequest.getPrStatus());
				ca.setPRPercent(caseRequest.getPrPercent());
				ca.setHER2Status(caseRequest.getHer2Status());
				ca.setClinicalStage(caseRequest.getClinicalStage());
				ca.setCreatedBy(caseRequest.getCreatedBy());
				ca.setDiseasePropagation(caseRequest.getDiseasePropagation());
				java.util.Date date = new java.util.Date();
				ca.setCreationTime(new Timestamp(date.getTime()));

				if (caseRequest.getReferingPhysicia() != null) {
					ca.setReferingPhysiciaId(caseDao.getPhysicianById(caseRequest.getReferingPhysicia()));
				}
				if (caseRequest.getPathologistId() != null) {
					ca.setPathologist(caseDao.getPhysicianById(caseRequest.getPathologistId()));
				}
				if (caseRequest.getMedOncPhysician() != null) {
					ca.setMedOncPhysicianId(caseDao.getPhysicianById(caseRequest.getMedOncPhysician()));
				}
				if (caseRequest.getRadOncPhysician() != null) {
					ca.setRadOncPhysicianId(caseDao.getPhysicianById(caseRequest.getRadOncPhysician()));
				}
				if (caseRequest.getPlasticSurgeon() != null) {
					ca.setPlasticSurgeonId(caseDao.getPhysicianById(caseRequest.getPlasticSurgeon()));
				}
				if (caseRequest.getSurgOncPhysician() != null) {
					ca.setSurgOncPhysicianId(caseDao.getPhysicianById(caseRequest.getSurgOncPhysician()));
				}
				if (caseRequest.getDiseaseTypeId() != null) {
					DiseaseType diseaseType = new DiseaseType();
					diseaseType.setDiseaseTypeId(caseRequest.getDiseaseTypeId());
					ca.setDiseaseType(diseaseType);
				}
				if (caseRequest.getFacilityId() != null) {
					CareFacility careFacility = new CareFacility();
					careFacility.setFacilityId(caseRequest.getFacilityId());
					ca.setCareFacility(careFacility);
				}
				ca.setCancerSubTypeId(caseDao.getCancerSubTypeById(caseRequest.getCancerSubType()));
				ca.setCancerTypeId(caseDao.getCancerTypeById(caseRequest.getCancerType()));
				ca.setGenetics(caseDao.getGeneticsById(caseRequest.getGeneticsId()));
				ca.setGenomics(caseDao.getGemonicsById(caseRequest.getGenomicsId()));
				ca.setFinalTNMStageId(caseDao.getTnmStageById(caseRequest.getFinalTNMStage()));
				ca.setWorkingTNMStageId(caseDao.getTnmStageById(caseRequest.getWorkingTNMStage()));
				ca.setCaseStatus(caseRequest.getCaseStatus());
				Patient p = new Patient();
				if (caseRequest.getPatientId() != null && caseRequest.getPatientId() > 0) {
					p = patientDao.getPatientById(caseRequest.getPatientId());
					ca.setPatient(p);
				}
				Integer caseId = caseDao.insertCase(ca);
				caseRequest.setCaseId(caseId);

				response.setAuthenticationKey(caseRequest.getAuthToken());
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				response.setCaseId(caseId);
			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
				response.setCaseId(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setCaseId(0);
		}
		return response;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public MedikmResponse editBreastCase(CaseRequest caseRequest, String ipAddress) {

		MedikmResponse response = new MedikmResponse();
		log.info("Starting case edit in input system");
		try {
			if (authenticationService.authenticateAuthToken(caseRequest.getAuthToken(), ipAddress)) {
				Case1 ca = caseDao.getCaseById(caseRequest.getCaseId());
				String previousCaseStatus = ca.getCaseStatus();
				BeanUtils.copyProperties(ca, caseRequest);
				ca.setERStatus(caseRequest.getErStatus());
				ca.setERPercent(caseRequest.getErPercent());
				ca.setPRStatus(caseRequest.getPrStatus());
				ca.setPRPercent(caseRequest.getPrPercent());
				ca.setHER2Status(caseRequest.getHer2Status());
				ca.setClinicalStage(caseRequest.getClinicalStage());
				ca.setDiseasePropagation(caseRequest.getDiseasePropagation());
				ca.setCreatedBy(caseRequest.getCreatedBy());
				ca.setLastUpdatedBy(caseRequest.getLastUpdatedBy());
				if (caseRequest.getReferingPhysicia() != null) {
					ca.setReferingPhysiciaId(caseDao.getPhysicianById(caseRequest.getReferingPhysicia()));
				}
				if (caseRequest.getPathologistId() != null) {
					ca.setPathologist(caseDao.getPhysicianById(caseRequest.getPathologistId()));
				}
				if (caseRequest.getMedOncPhysician() != null) {
					ca.setMedOncPhysicianId(caseDao.getPhysicianById(caseRequest.getMedOncPhysician()));
				}
				if (caseRequest.getRadOncPhysician() != null) {
					ca.setRadOncPhysicianId(caseDao.getPhysicianById(caseRequest.getRadOncPhysician()));
				}
				if (caseRequest.getPlasticSurgeon() != null) {
					ca.setPlasticSurgeonId(caseDao.getPhysicianById(caseRequest.getPlasticSurgeon()));
				}
				if (caseRequest.getSurgOncPhysician() != null) {
					ca.setSurgOncPhysicianId(caseDao.getPhysicianById(caseRequest.getSurgOncPhysician()));
				}
				if (caseRequest.getDiseaseTypeId() != null) {
					DiseaseType diseaseType = new DiseaseType();
					diseaseType.setDiseaseTypeId(caseRequest.getDiseaseTypeId());
					ca.setDiseaseType(diseaseType);
				}
				if (caseRequest.getFacilityId() != null) {
					CareFacility careFacility = new CareFacility();
					careFacility.setFacilityId(caseRequest.getFacilityId());
					ca.setCareFacility(careFacility);
				}
				ca.setCancerSubTypeId(caseDao.getCancerSubTypeById(caseRequest.getCancerSubType()));
				ca.setCancerTypeId(caseDao.getCancerTypeById(caseRequest.getCancerType()));
				ca.setGenetics(caseDao.getGeneticsById(caseRequest.getGeneticsId()));
				ca.setGenomics(caseDao.getGemonicsById(caseRequest.getGenomicsId()));
				ca.setFinalTNMStageId(caseDao.getTnmStageById(caseRequest.getFinalTNMStage()));
				ca.setWorkingTNMStageId(caseDao.getTnmStageById(caseRequest.getWorkingTNMStage()));
				Patient p = new Patient();
				if (caseRequest.getPatientId() != null && caseRequest.getPatientId() > 0) {
					p = patientDao.getPatientById(caseRequest.getPatientId());
					ca.setPatient(p);
				}
				ca.setCaseStatus(previousCaseStatus);
				caseDao.updateCase(ca);
				log.info("Case edited successfully in input System");
				caseRequest.setPatientId(ca.getPatient().getPatientId());

				response.setAuthenticationKey(caseRequest.getAuthToken());
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
			log.error("Error in edit case : " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("Case edit End in input System");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.medikm.input.service.CaseService#addGynCase(com.medikm.input.request
	 * .CaseRequest)
	 */
	@Override
	public CaseResponse addGynCase(CaseRequest caseRequest, String ipAddress) {
		CaseResponse response = new CaseResponse();
		try {
			if (authenticationService.authenticateAuthToken(caseRequest.getAuthToken(), ipAddress)) {
				Case1 ca = new Case1();
				BeanUtils.copyProperties(ca, caseRequest);
				ca.setClinicalStage(caseRequest.getClinicalStage());
				ca.setDiseasePropagation(caseRequest.getDiseasePropagation());
				if (caseRequest.getDiseaseSubType() != null) {
					DiseaseSubType diseaseSubType = new DiseaseSubType();
					diseaseSubType.setDiseaseSubTypeId(caseRequest.getDiseaseSubType());
					ca.setDiseaseSubTypeId(diseaseSubType);
				}

				if (caseRequest.getReferingPhysicia() != null) {
					ca.setReferingPhysiciaId(caseDao.getPhysicianById(caseRequest.getReferingPhysicia()));
				}
				if (caseRequest.getPathologistId() != null) {
					ca.setPathologist(caseDao.getPhysicianById(caseRequest.getPathologistId()));
				}
				if (caseRequest.getGynOncologistId() != null) {
					ca.setGynOncologist(caseDao.getPhysicianById(caseRequest.getGynOncologistId()));
				}
				if (caseRequest.getRadOncPhysician() != null) {
					ca.setRadOncPhysicianId(caseDao.getPhysicianById(caseRequest.getRadOncPhysician()));
				}
				if (caseRequest.getDiseaseTypeId() != null) {
					DiseaseType diseaseType = new DiseaseType();
					diseaseType.setDiseaseTypeId(caseRequest.getDiseaseTypeId());
					ca.setDiseaseType(diseaseType);
				}
				if (caseRequest.getFacilityId() != null) {
					CareFacility careFacility = new CareFacility();
					careFacility.setFacilityId(caseRequest.getFacilityId());
					ca.setCareFacility(careFacility);
				}
				java.util.Date date = new java.util.Date();
				ca.setCreationTime(new Timestamp(date.getTime()));
				ca.setCancerSubTypeId(caseDao.getCancerSubTypeById(caseRequest.getCancerSubType()));
				ca.setCancerTypeId(caseDao.getCancerTypeById(caseRequest.getCancerType()));
				ca.setGenetics(caseDao.getGeneticsById(caseRequest.getGeneticsId()));
				ca.setGenomics(caseDao.getGemonicsById(caseRequest.getGenomicsId()));
				ca.setFinalTNMStageId(caseDao.getTnmStageById(caseRequest.getFinalTNMStage()));
				ca.setWorkingTNMStageId(caseDao.getTnmStageById(caseRequest.getWorkingTNMStage()));
				ca.setTumorLocation(caseDao.getTLocationById(caseRequest.gettLocationId()));
				Patient p = new Patient();
				if (caseRequest.getPatientId() != null && caseRequest.getPatientId() > 0) {
					p = patientDao.getPatientById(caseRequest.getPatientId());
					ca.setPatient(p);
				}
				ca.setCreatedBy(caseRequest.getCreatedBy());
				ca.setCaseStatus(caseRequest.getCaseStatus());
				Integer caseId = caseDao.insertCase(ca);
				caseRequest.setCaseId(caseId);

				response.setAuthenticationKey(caseRequest.getAuthToken());
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				response.setCaseId(caseId);
			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
				response.setCaseId(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setCaseId(0);
		}
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.medikm.input.service.CaseService#addSurcomaCase(com.medikm.input.
	 * request .CaseRequest)
	 */
	@Override
	public CaseResponse addSurcomaCase(CaseRequest caseRequest, String ipAddress) {
		CaseResponse response = new CaseResponse();
		try {
			if (authenticationService.authenticateAuthToken(caseRequest.getAuthToken(), ipAddress)) {
				Case1 ca = new Case1();
				BeanUtils.copyProperties(ca, caseRequest);
				ca.setClinicalStage(caseRequest.getClinicalStage());
				ca.setDiseasePropagation(caseRequest.getDiseasePropagation());
				if (caseRequest.getReferingPhysicia() != null) {
					ca.setReferingPhysiciaId(caseDao.getPhysicianById(caseRequest.getReferingPhysicia()));
				}
				if (caseRequest.getPathologistId() != null) {
					ca.setPathologist(caseDao.getPhysicianById(caseRequest.getPathologistId()));
				}
				if (caseRequest.getMedOncPhysician() != null) {
					ca.setMedOncPhysicianId(caseDao.getPhysicianById(caseRequest.getMedOncPhysician()));
				}
				if (caseRequest.getRadOncPhysician() != null) {
					ca.setRadOncPhysicianId(caseDao.getPhysicianById(caseRequest.getRadOncPhysician()));
				}
				if (caseRequest.getSurgOncPhysician() != null) {
					ca.setSurgOncPhysicianId(caseDao.getPhysicianById(caseRequest.getSurgOncPhysician()));
				}
				if (caseRequest.getPlasticSurgeon() != null) {
					ca.setPlasticSurgeonId(caseDao.getPhysicianById(caseRequest.getPlasticSurgeon()));
				}
				if (caseRequest.getDiseaseTypeId() != null) {
					DiseaseType diseaseType = new DiseaseType();
					diseaseType.setDiseaseTypeId(caseRequest.getDiseaseTypeId());
					ca.setDiseaseType(diseaseType);
				}
				if (caseRequest.getFacilityId() != null) {
					CareFacility careFacility = new CareFacility();
					careFacility.setFacilityId(caseRequest.getFacilityId());
					ca.setCareFacility(careFacility);
				}
				java.util.Date date = new java.util.Date();
				ca.setCreationTime(new Timestamp(date.getTime()));
				ca.setCancerSubTypeId(caseDao.getCancerSubTypeById(caseRequest.getCancerSubType()));
				ca.setCancerTypeId(caseDao.getCancerTypeById(caseRequest.getCancerType()));
				ca.setGenetics(caseDao.getGeneticsById(caseRequest.getGeneticsId()));
				ca.setGenomics(caseDao.getGemonicsById(caseRequest.getGenomicsId()));
				ca.setFinalTNMStageId(caseDao.getTnmStageById(caseRequest.getFinalTNMStage()));
				ca.setWorkingTNMStageId(caseDao.getTnmStageById(caseRequest.getWorkingTNMStage()));
				Patient p = new Patient();
				if (caseRequest.getPatientId() != null && caseRequest.getPatientId() > 0) {
					p = patientDao.getPatientById(caseRequest.getPatientId());
					ca.setPatient(p);
				}
				ca.setCreatedBy(caseRequest.getCreatedBy());
				ca.setCaseStatus(caseRequest.getCaseStatus());
				Integer caseId = caseDao.insertCase(ca);
				caseRequest.setCaseId(caseId);

				response.setAuthenticationKey(caseRequest.getAuthToken());
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				response.setCaseId(caseId);
			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
				response.setCaseId(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setCaseId(0);
		}
		return response;
	}

	@Override
	public MedikmResponse editGynCase(CaseRequest caseRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		log.info("Starting case edit in input system");
		try {
			if (authenticationService.authenticateAuthToken(caseRequest.getAuthToken(), ipAddress)) {
				Case1 ca = caseDao.getCaseById(caseRequest.getCaseId());
				String previousCaseStatus = ca.getCaseStatus();
				BeanUtils.copyProperties(ca, caseRequest);
				ca.setClinicalStage(caseRequest.getClinicalStage());
				ca.setDiseasePropagation(caseRequest.getDiseasePropagation());
				ca.setCreatedBy(caseRequest.getCreatedBy());
				ca.setLastUpdatedBy(caseRequest.getLastUpdatedBy());
				if (caseRequest.getDiseaseSubType() != null) {
					DiseaseSubType diseaseSubType = new DiseaseSubType();
					diseaseSubType.setDiseaseSubTypeId(caseRequest.getDiseaseSubType());
					ca.setDiseaseSubTypeId(diseaseSubType);
				}
				if (caseRequest.getReferingPhysicia() != null) {
					ca.setReferingPhysiciaId(caseDao.getPhysicianById(caseRequest.getReferingPhysicia()));
				}
				if (caseRequest.getPathologistId() != null) {
					ca.setPathologist(caseDao.getPhysicianById(caseRequest.getPathologistId()));
				}
				if (caseRequest.getGynOncologistId() != null) {
					ca.setGynOncologist(caseDao.getPhysicianById(caseRequest.getGynOncologistId()));
				}
				if (caseRequest.getRadOncPhysician() != null) {
					ca.setRadOncPhysicianId(caseDao.getPhysicianById(caseRequest.getRadOncPhysician()));
				}

				if (caseRequest.getDiseaseTypeId() != null) {
					DiseaseType diseaseType = new DiseaseType();
					diseaseType.setDiseaseTypeId(caseRequest.getDiseaseTypeId());
					ca.setDiseaseType(diseaseType);
				}
				if (caseRequest.getFacilityId() != null) {
					CareFacility careFacility = new CareFacility();
					careFacility.setFacilityId(caseRequest.getFacilityId());
					ca.setCareFacility(careFacility);
				}
				ca.setCancerSubTypeId(caseDao.getCancerSubTypeById(caseRequest.getCancerSubType()));
				ca.setCancerTypeId(caseDao.getCancerTypeById(caseRequest.getCancerType()));
				ca.setGenetics(caseDao.getGeneticsById(caseRequest.getGeneticsId()));
				ca.setGenomics(caseDao.getGemonicsById(caseRequest.getGenomicsId()));
				ca.setFinalTNMStageId(caseDao.getTnmStageById(caseRequest.getFinalTNMStage()));
				ca.setWorkingTNMStageId(caseDao.getTnmStageById(caseRequest.getWorkingTNMStage()));
				ca.setTumorLocation(caseDao.getTLocationById(caseRequest.gettLocationId()));
				Patient p = new Patient();
				if (caseRequest.getPatientId() != null && caseRequest.getPatientId() > 0) {
					p = patientDao.getPatientById(caseRequest.getPatientId());
					ca.setPatient(p);
				}
				ca.setCaseStatus(previousCaseStatus);
				caseDao.updateCase(ca);
				log.info("Case edited successfully in input System");
				caseRequest.setPatientId(ca.getPatient().getPatientId());

				response.setAuthenticationKey(caseRequest.getAuthToken());
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
			log.error("Error in edit case : " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("Case edit End in input System");
		return response;
	}

	@Override
	public MedikmResponse editSurcomaCase(CaseRequest caseRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		log.info("Starting case edit in input system");
		try {
			if (authenticationService.authenticateAuthToken(caseRequest.getAuthToken(), ipAddress)) {
				Case1 ca = caseDao.getCaseById(caseRequest.getCaseId());
				String previousCaseStatus = ca.getCaseStatus();
				BeanUtils.copyProperties(ca, caseRequest);
				ca.setClinicalStage(caseRequest.getClinicalStage());
				ca.setDiseasePropagation(caseRequest.getDiseasePropagation());
				ca.setCreatedBy(caseRequest.getCreatedBy());
				ca.setLastUpdatedBy(caseRequest.getLastUpdatedBy());
				if (caseRequest.getReferingPhysicia() != null) {
					ca.setReferingPhysiciaId(caseDao.getPhysicianById(caseRequest.getReferingPhysicia()));
				}
				if (caseRequest.getPathologistId() != null) {
					ca.setPathologist(caseDao.getPhysicianById(caseRequest.getPathologistId()));
				}
				if (caseRequest.getMedOncPhysician() != null) {
					ca.setMedOncPhysicianId(caseDao.getPhysicianById(caseRequest.getMedOncPhysician()));
				}
				if (caseRequest.getRadOncPhysician() != null) {
					ca.setRadOncPhysicianId(caseDao.getPhysicianById(caseRequest.getRadOncPhysician()));
				}

				if (caseRequest.getSurgOncPhysician() != null) {
					ca.setSurgOncPhysicianId(caseDao.getPhysicianById(caseRequest.getSurgOncPhysician()));
				}
				if (caseRequest.getPlasticSurgeon() != null) {
					ca.setPlasticSurgeonId(caseDao.getPhysicianById(caseRequest.getPlasticSurgeon()));
				}
				if (caseRequest.getDiseaseTypeId() != null) {
					DiseaseType diseaseType = new DiseaseType();
					diseaseType.setDiseaseTypeId(caseRequest.getDiseaseTypeId());
					ca.setDiseaseType(diseaseType);
				}
				if (caseRequest.getFacilityId() != null) {
					CareFacility careFacility = new CareFacility();
					careFacility.setFacilityId(caseRequest.getFacilityId());
					ca.setCareFacility(careFacility);
				}
				ca.setCancerSubTypeId(caseDao.getCancerSubTypeById(caseRequest.getCancerSubType()));
				ca.setCancerTypeId(caseDao.getCancerTypeById(caseRequest.getCancerType()));
				ca.setGenetics(caseDao.getGeneticsById(caseRequest.getGeneticsId()));
				ca.setGenomics(caseDao.getGemonicsById(caseRequest.getGenomicsId()));
				ca.setFinalTNMStageId(caseDao.getTnmStageById(caseRequest.getFinalTNMStage()));
				ca.setWorkingTNMStageId(caseDao.getTnmStageById(caseRequest.getWorkingTNMStage()));
				Patient p = new Patient();
				if (caseRequest.getPatientId() != null && caseRequest.getPatientId() > 0) {
					p = patientDao.getPatientById(caseRequest.getPatientId());
					ca.setPatient(p);
				}
				ca.setCaseStatus(previousCaseStatus);
				caseDao.updateCase(ca);
				log.info("Case edited successfully in input System");
				caseRequest.setPatientId(ca.getPatient().getPatientId());

				response.setAuthenticationKey(caseRequest.getAuthToken());
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
			log.error("Error in edit case : " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("Case edit End in input System");
		return response;
	}

	@Override
	public CaseResponse addGUOncologyCase(CaseRequest caseRequest, String ipAddress) {

		CaseResponse response = new CaseResponse();
		try {
			if (authenticationService.authenticateAuthToken(caseRequest.getAuthToken(), ipAddress)) {
				Case1 ca = new Case1();
				BeanUtils.copyProperties(ca, caseRequest);

				if (caseRequest.getDiseaseSubType() != null) {
					DiseaseSubType diseaseSubType = new DiseaseSubType();
					diseaseSubType.setDiseaseSubTypeId(caseRequest.getDiseaseSubType());
					ca.setDiseaseSubTypeId(diseaseSubType);
				}
				ca.setDiseasePropagation(caseRequest.getDiseasePropagation());
				java.util.Date date = new java.util.Date();
				ca.setCreationTime(new Timestamp(date.getTime()));
				if (caseRequest.getReferingPhysicia() != null) {
					ca.setReferingPhysiciaId(caseDao.getPhysicianById(caseRequest.getReferingPhysicia()));
				}
				if (caseRequest.getPathologistId() != null) {
					ca.setPathologist(caseDao.getPhysicianById(caseRequest.getPathologistId()));
				}
				if (caseRequest.getMedOncPhysician() != null) {
					ca.setMedOncPhysicianId(caseDao.getPhysicianById(caseRequest.getMedOncPhysician()));
				}
				if (caseRequest.getRadOncPhysician() != null) {
					ca.setRadOncPhysicianId(caseDao.getPhysicianById(caseRequest.getRadOncPhysician()));
				}
				if (caseRequest.getPlasticSurgeon() != null) {
					ca.setPlasticSurgeonId(caseDao.getPhysicianById(caseRequest.getPlasticSurgeon()));
				}
				if (caseRequest.getSurgOncPhysician() != null) {
					ca.setSurgOncPhysicianId(caseDao.getPhysicianById(caseRequest.getSurgOncPhysician()));
				}
				if (caseRequest.getDiseaseTypeId() != null) {
					DiseaseType diseaseType = new DiseaseType();
					diseaseType.setDiseaseTypeId(caseRequest.getDiseaseTypeId());
					ca.setDiseaseType(diseaseType);
				}
				if (caseRequest.getFacilityId() != null) {
					CareFacility careFacility = new CareFacility();
					careFacility.setFacilityId(caseRequest.getFacilityId());
					ca.setCareFacility(careFacility);
				}
				ca.setCancerSubTypeId(caseDao.getCancerSubTypeById(caseRequest.getCancerSubType()));
				ca.setCancerTypeId(caseDao.getCancerTypeById(caseRequest.getCancerType()));
				ca.setGenetics(caseDao.getGeneticsById(caseRequest.getGeneticsId()));
				ca.setGenomics(caseDao.getGemonicsById(caseRequest.getGenomicsId()));
				ca.setFinalTNMStageId(caseDao.getTnmStageById(caseRequest.getFinalTNMStage()));
				ca.setWorkingTNMStageId(caseDao.getTnmStageById(caseRequest.getWorkingTNMStage()));
				ca.setTumorLocation(caseDao.getTLocationById(caseRequest.gettLocationId()));
				Patient p = new Patient();
				if (caseRequest.getPatientId() != null && caseRequest.getPatientId() > 0) {
					p = patientDao.getPatientById(caseRequest.getPatientId());
					ca.setPatient(p);
				}
				ca.setCreatedBy(caseRequest.getCreatedBy());
				ca.setCaseStatus(caseRequest.getCaseStatus());
				Integer caseId = caseDao.insertCase(ca);
				caseRequest.setCaseId(caseId);

				response.setAuthenticationKey(caseRequest.getAuthToken());
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				response.setCaseId(caseId);
			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
				response.setCaseId(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setCaseId(0);
		}
		return response;
	}

	@Override
	public MedikmResponse editGUOncologyCase(CaseRequest caseRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		log.info("Starting case edit in input system");
		try {
			if (authenticationService.authenticateAuthToken(caseRequest.getAuthToken(), ipAddress)) {
				Case1 ca = caseDao.getCaseById(caseRequest.getCaseId());
				String previousCaseStatus = ca.getCaseStatus();
				BeanUtils.copyProperties(ca, caseRequest);
				ca.setERStatus(caseRequest.getErStatus());
				ca.setERPercent(caseRequest.getErPercent());
				ca.setPRStatus(caseRequest.getPrStatus());
				ca.setPRPercent(caseRequest.getPrPercent());
				ca.setHER2Status(caseRequest.getHer2Status());
				ca.setClinicalStage(caseRequest.getClinicalStage());
				ca.setDiseasePropagation(caseRequest.getDiseasePropagation());
				ca.setCreatedBy(caseRequest.getCreatedBy());
				ca.setLastUpdatedBy(caseRequest.getLastUpdatedBy());
				if (caseRequest.getDiseaseSubType() != null) {
					DiseaseSubType diseaseSubType = new DiseaseSubType();
					diseaseSubType.setDiseaseSubTypeId(caseRequest.getDiseaseSubType());
					ca.setDiseaseSubTypeId(diseaseSubType);
				}
				if (caseRequest.getReferingPhysicia() != null) {
					ca.setReferingPhysiciaId(caseDao.getPhysicianById(caseRequest.getReferingPhysicia()));
				}

				if (caseRequest.getPathologistId() != null) {
					ca.setPathologist(caseDao.getPhysicianById(caseRequest.getPathologistId()));
				}
				if (caseRequest.getMedOncPhysician() != null) {
					ca.setMedOncPhysicianId(caseDao.getPhysicianById(caseRequest.getMedOncPhysician()));
				}
				if (caseRequest.getRadOncPhysician() != null) {
					ca.setRadOncPhysicianId(caseDao.getPhysicianById(caseRequest.getRadOncPhysician()));
				}
				if (caseRequest.getPlasticSurgeon() != null) {
					ca.setPlasticSurgeonId(caseDao.getPhysicianById(caseRequest.getPlasticSurgeon()));
				}
				if (caseRequest.getSurgOncPhysician() != null) {
					ca.setSurgOncPhysicianId(caseDao.getPhysicianById(caseRequest.getSurgOncPhysician()));
				}
				if (caseRequest.getDiseaseTypeId() != null) {
					DiseaseType diseaseType = new DiseaseType();
					diseaseType.setDiseaseTypeId(caseRequest.getDiseaseTypeId());
					ca.setDiseaseType(diseaseType);
				}
				if (caseRequest.getFacilityId() != null) {
					CareFacility careFacility = new CareFacility();
					careFacility.setFacilityId(caseRequest.getFacilityId());
					ca.setCareFacility(careFacility);
				}
				ca.setCancerSubTypeId(caseDao.getCancerSubTypeById(caseRequest.getCancerSubType()));
				ca.setCancerTypeId(caseDao.getCancerTypeById(caseRequest.getCancerType()));
				ca.setGenetics(caseDao.getGeneticsById(caseRequest.getGeneticsId()));
				ca.setGenomics(caseDao.getGemonicsById(caseRequest.getGenomicsId()));
				ca.setFinalTNMStageId(caseDao.getTnmStageById(caseRequest.getFinalTNMStage()));
				ca.setWorkingTNMStageId(caseDao.getTnmStageById(caseRequest.getWorkingTNMStage()));
				ca.setTumorLocation(caseDao.getTLocationById(caseRequest.gettLocationId()));
				Patient p = new Patient();
				if (caseRequest.getPatientId() != null && caseRequest.getPatientId() > 0) {
					p = patientDao.getPatientById(caseRequest.getPatientId());
					ca.setPatient(p);
				}
				ca.setCaseStatus(previousCaseStatus);
				caseDao.updateCase(ca);
				log.info("Case edited successfully in input System");
				caseRequest.setPatientId(ca.getPatient().getPatientId());

				response.setAuthenticationKey(caseRequest.getAuthToken());
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
			log.error("Error in edit case : " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("Case edit End in input System");
		return response;
	}

	@Override
	public CaseResponse getAllSimilarCases(SimilarCaseRequest caseRequest, String ipAddress) {
		log.info("Starting get All Similar Case in input system");
		Integer caseId = caseRequest.getCaseId();
		CaseResponse response = new CaseResponse();
		try {
			if (authenticationService.authenticateAuthToken(caseRequest.getAuthToken(), ipAddress)) {
				if (caseId != null) {
					SimilarCases similarCases = new SimilarCases();
					response.setCaseId(caseId);
					response.setSimilarCaseDetails(similarCases.getSimilarCase(caseRequest));
					log.info("get similar cases succsessfully");
					response.setAuthenticationKey(caseRequest.getAuthToken());
					response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
					response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				} else {
					log.info("case id does not found");
					response.setCaseId(0);
					response.setResponseCode("500");
					response.setResponseMessage("case id does not found");
				}
			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Error in get All Similar Cases : " + e);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("Ending get All Similar Case in input system");
		return response;
	}

}

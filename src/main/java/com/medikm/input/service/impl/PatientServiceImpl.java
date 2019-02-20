/**
 * 
 */
package com.medikm.input.service.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.PatientDao;
import com.medikm.input.entity.Patient;
import com.medikm.input.entity.Race;
import com.medikm.input.request.PatientRequest;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.response.PatientResponse;
import com.medikm.input.service.PatientService;
import com.medikm.input.util.AuthenticationService;
import com.medikm.input.util.MedikmConstants;

/**
 * @author Saikat
 * 
 */
@SuppressWarnings({ "unchecked", "unused" })
@Service("PatientService")
public class PatientServiceImpl implements PatientService {

	@Value("${hub.url.value}")
	private String hubUrl;

	@Autowired
	private PatientDao patientDao;

	@Autowired
	private AuthenticationService authenticationService;

	private Logger log = Logger.getLogger(PatientServiceImpl.class);

	@Override
	@Transactional
	public PatientResponse addPatient(PatientRequest patient, HttpServletRequest request) {
		log.info("In Patient Service :: Inserting Patient Start");
		PatientResponse response = new PatientResponse();
		String ipAddress = request.getRemoteAddr();
		try {
			if (authenticationService.authenticateAuthToken(patient.getAuthToken(), ipAddress)) {
				Patient p = new Patient();
				BeanUtils.copyProperties(p, patient);
				p.setFunctionalStatus(patientDao.getFunctionalStatusById(patient.getFunctionalStatusId()));
				p.setRace(patientDao.getRaceById(patient.getRaceId()));
				p.setFName(patient.getFirstName());
				p.setLName(patient.getLastName());
				Integer patientId = patientDao.insertPatient(p);
				patient.setPatientId(patientId);
				ObjectMapper om = new ObjectMapper();
				Map<String, Object> m = om.convertValue(patient, Map.class);

				response.setAuthenticationKey(patient.getAuthToken());
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				response.setPatientId(patientId);
			} else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
				response.setPatientId(0);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in addPatient Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setPatientId(0);
		}
		log.info("In Patient Service :: Inserting Patient End");
		return response;
	}

	@Override
	public MedikmResponse editPatient(PatientRequest patient, HttpServletRequest request) {
		MedikmResponse response = new MedikmResponse();
		String ipAddress = request.getRemoteAddr();
		try {
			log.info("In Patient Service :: Editing Patient Start");
			if (authenticationService.authenticateAuthToken(patient.getAuthToken(), ipAddress)) {
				Patient p = patientDao.getPatientById(patient.getPatientId());
				BeanUtils.copyProperties(p, patient);
				p.setFunctionalStatus(patientDao.getFunctionalStatusById(patient.getFunctionalStatusId()));
				// p.setRace(patientDao.getRaceById(patient.getRaceId()));
				p.setFName(patient.getFirstName());
				p.setLName(patient.getLastName());

				if (patient.getRaceId() != null && patient.getRaceId() != 0 && !patient.getRaceId().equals("")) {
					Race race = new Race(patient.getRaceId());
					p.setRace(race);
				}
				if (patient.getRaceId() == 0) {
					p.setRace(null);
				}
				patientDao.updatePatient(p);
				// ObjectMapper om=new ObjectMapper();
				// Map<String, Object> m=om.convertValue(patient, Map.class);
				/*
				 * restTemplate.postForObject(hubUrl +
				 * "patient/editPatient.json", patient, MedikmResponse.class);
				 */
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
			log.error("Error in editPatient Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("In Patient Service :: Editing Patient End");
		return response;
	}

}

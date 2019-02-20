package com.medikm.input.service;

import javax.servlet.http.HttpServletRequest;

import com.medikm.input.request.PatientRequest;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.response.PatientResponse;

/**
 * @author Saikat
 *
 */

public interface PatientService {

	public PatientResponse addPatient(PatientRequest patient, HttpServletRequest request);

	public MedikmResponse editPatient(PatientRequest patient, HttpServletRequest request);

}

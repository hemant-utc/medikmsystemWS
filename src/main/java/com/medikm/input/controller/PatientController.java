package com.medikm.input.controller;

import javax.servlet.http.HttpServletRequest;

import com.medikm.input.request.PatientRequest;
import com.medikm.input.response.MedikmResponse;

public interface PatientController {

	/**
	 * This method will add patient detail
	 * 
	 * @param patient
	 * @return MedikmResponse
	 */
	public MedikmResponse addPatient(PatientRequest patient, HttpServletRequest request);

	/**
	 * This method will edit patient detail
	 * 
	 * @param patient
	 * @return MedikmResponse
	 */
	public MedikmResponse editPatient(PatientRequest patient, HttpServletRequest request);
}

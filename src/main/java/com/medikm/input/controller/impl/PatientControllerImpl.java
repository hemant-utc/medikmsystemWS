/**
 * 
 */
package com.medikm.input.controller.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medikm.input.controller.PatientController;
import com.medikm.input.request.PatientRequest;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.response.PatientResponse;
import com.medikm.input.service.PatientService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Saikat
 *
 */
@Controller
@Api(value = "Patient Controller", tags = {
		"Patient Controller" }, produces = "application/json", consumes = "application/json")
@RequestMapping("/patient")
public class PatientControllerImpl implements PatientController {

	Logger log = Logger.getLogger(PatientControllerImpl.class);

	@Autowired
	private PatientService patientService;

	@Override
	@ApiOperation(value = "Add Patient", notes = "Patient Added.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = PatientResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = PatientResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = PatientResponse.class) })
	@RequestMapping(value = "/addPatient", method = RequestMethod.POST)
	@ResponseBody
	public PatientResponse addPatient(@ApiParam(value = "Patient Request") @RequestBody PatientRequest patient,
			HttpServletRequest request) {
		log.info("Inserting Patient");
		return patientService.addPatient(patient, request);
	}

	@Override
	@ApiOperation(value = "Edit Patient", notes = "Patient Edited.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/editPatient", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editPatient(@RequestBody PatientRequest patient, HttpServletRequest request) {
		log.info("Editing Patient");
		return patientService.editPatient(patient, request);
	}

}

package com.medikm.input.controller.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medikm.input.controller.CaseController;
import com.medikm.input.request.CaseRequest;
import com.medikm.input.request.SimilarCaseRequest;
import com.medikm.input.response.CaseResponse;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.service.CaseService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping("/case")
@Api(value = "Case Controller", tags = {
		"Case Controller" }, produces = "application/json", consumes = "application/json")
public class CaseControllerImpl implements CaseController {

	@Autowired
	private CaseService caseService;

	@Override
	@ApiOperation(value = "Add Case", notes = "Case Added.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = CaseResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = CaseResponse.class),
			@ApiResponse(code = 500, message = "Failed | Disease Type does not found", response = CaseResponse.class) })
	@RequestMapping(value = "/addCase", method = RequestMethod.POST)
	@ResponseBody
	public CaseResponse createCase(@ApiParam(value = "Case Request") @RequestBody CaseRequest caseRequest,
			HttpServletRequest request) {
		Integer diseaseId = caseRequest.getDiseaseTypeId();
		String ipAddress = request.getRemoteAddr();
		
		if (diseaseId != null) {
			if (diseaseId == 1) {
				return caseService.addBreastCase(caseRequest, ipAddress);
			} else if (diseaseId == 2) {
				return caseService.addGynCase(caseRequest, ipAddress);
			} else if (diseaseId == 3) {
				return caseService.addSurcomaCase(caseRequest, ipAddress);
			} else {

				return caseService.addGUOncologyCase(caseRequest, ipAddress);
			}
		} else {
			CaseResponse caseResponse = new CaseResponse();
			caseResponse.setCaseId(0);
			caseResponse.setResponseCode("500");
			caseResponse.setResponseMessage("Disease Type does not found");
			return caseResponse;
		}
	}

	@Override
	@ApiOperation(value = "Edit Case", notes = "Case Edited.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed | Disease Type does not found", response = MedikmResponse.class) })
	@RequestMapping(value = "/editCase", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editCase(@ApiParam(value = "Case Request") @RequestBody CaseRequest caseRequest,
			HttpServletRequest request) {
		Integer diseaseId = caseRequest.getDiseaseTypeId();
		String ipAddress = request.getRemoteAddr();
		
		if (diseaseId != null) {
			if (diseaseId == 1) {
				return caseService.editBreastCase(caseRequest, ipAddress);
			} else if (diseaseId == 2) {
				return caseService.editGynCase(caseRequest, ipAddress);
			} else if (diseaseId == 3) {
				return caseService.editSurcomaCase(caseRequest, ipAddress);
			} else {
				return caseService.editGUOncologyCase(caseRequest, ipAddress);
			}
		} else {
			CaseResponse caseResponse = new CaseResponse();
			caseResponse.setCaseId(0);
			caseResponse.setResponseCode("500");
			caseResponse.setResponseMessage("Disease Type does not found");
			return caseResponse;
		}
	}

	@Override
	@ApiOperation(value = "Get All Similar Case", notes = "Get All Similar Case.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = CaseResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = CaseResponse.class),
			@ApiResponse(code = 500, message = "Failed | Disease Type does not found", response = CaseResponse.class) })
	@RequestMapping(value = "/getSimilarCases", method = RequestMethod.POST)
	@ResponseBody
	public CaseResponse getAllSimilarCase(
			@ApiParam(value = "Similar Case Request") @RequestBody SimilarCaseRequest caseRequest,
			HttpServletRequest request) {
		Integer diseaseId = caseRequest.getDiseaseTypeId();
		String ipAddress = request.getRemoteAddr();
		
		if (diseaseId != null) {
			return caseService.getAllSimilarCases(caseRequest, ipAddress);
		} else {
			CaseResponse caseResponse = new CaseResponse();
			caseResponse.setCaseId(0);
			caseResponse.setResponseCode("500");
			caseResponse.setResponseMessage("Disease Type does not found");
			return caseResponse;
		}

	}

}

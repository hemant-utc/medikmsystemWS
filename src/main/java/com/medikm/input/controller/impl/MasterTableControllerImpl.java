package com.medikm.input.controller.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medikm.input.controller.MasterTableController;
import com.medikm.input.request.BiopsyTypeRequest;
import com.medikm.input.request.CancerSubTypeRequest;
import com.medikm.input.request.CancerTypeRequest;
import com.medikm.input.request.FunctionalStatusRequest;
import com.medikm.input.request.ImagingStatusRequest;
import com.medikm.input.request.PhysicianRequest;
import com.medikm.input.request.ReasonForPresentationRequest;
import com.medikm.input.request.TreatmentRequest;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.response.PhysicianResponse;
import com.medikm.input.service.MasterTableService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping("/masterInput")
@Api(value = "Master Table Controller", tags = {
		"Master Table Controller." }, produces = "application/json", consumes = "application/json")
public class MasterTableControllerImpl implements MasterTableController {

	/**
	 * Author: Dhiraj Singh
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	@Autowired
	private MasterTableService masterTableService;

	@Override
	@ApiOperation(value = "Add Race", notes = "Add Race")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 302, message = "Exist | Username already exist.", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/addRace/{raceName}", method = RequestMethod.PUT)
	@ResponseBody
	public MedikmResponse addRace(@ApiParam(value = "Race Name") @PathVariable String raceName,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.addRace(raceName, ipAddress);

	}

	@Override
	@ApiOperation(value = "Add Physician", notes = "Add Physician.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = PhysicianResponse.class),
			@ApiResponse(code = 302, message = "Exist | Username already exist.", response = PhysicianResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = PhysicianResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = PhysicianResponse.class) })
	@RequestMapping(value = "/addPhysician", method = RequestMethod.POST)
	@ResponseBody
	public PhysicianResponse addPhysician(
			@ApiParam(value = "Physician Request") @RequestBody PhysicianRequest physicianRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.addPhysician(physicianRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Edit Physician", notes = "Edit Physician.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 302, message = "Exist | Username already exist.", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/editPhysician", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editPhysician(
			@ApiParam(value = "Physician Request") @RequestBody PhysicianRequest physicianRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.editPhysician(physicianRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add Cancer Type", notes = "Add Cancer Type.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 302, message = "Exist", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/addCancerType", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse addCancerType(
			@ApiParam(value = "Cancer Type Request") @RequestBody CancerTypeRequest cancerTypeRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.addCancerType(cancerTypeRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Edit Cancer Type", notes = "Edit Cancer Type.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 302, message = "Exist", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/editCancerType", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editCancerType(
			@ApiParam(value = "Cancer Type Request") @RequestBody CancerTypeRequest cancerTypeRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.editCancerType(cancerTypeRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add Cancer Sub Type", notes = "Add Cancer Sub Type.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 302, message = "Exist", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/addCancerSubType", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse addCancerSubType(
			@ApiParam(value = "Cancer Sub Type Request") @RequestBody CancerSubTypeRequest cancerSubTypeRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.addCancerSubType(cancerSubTypeRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Edit Cancer Sub Type", notes = "Edit Cancer Sub Type.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 302, message = "Exist", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/editCancerSubType", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editCancerSubType(
			@ApiParam(value = "Cancer Sub Type Request") @RequestBody CancerSubTypeRequest cancerSubTypeRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.editCancerSubType(cancerSubTypeRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add Functional Status", notes = "Add Functional Status.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/addFunctionalStatus", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse addFunctionalStatus(
			@ApiParam(value = "Functional Status Request") @RequestBody FunctionalStatusRequest functionalStatusRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.addFunctionalStatus(functionalStatusRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Edit FunctionalStatus", notes = "Edit FunctionalStatus.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/editFunctionalStatus", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editFunctionalStatus(
			@ApiParam(value = "Functional Status Request") @RequestBody FunctionalStatusRequest functionalStatusRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.editFunctionalStatus(functionalStatusRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add Imaging", notes = "Add Imaging.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/addImaging", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse addImaging(
			@ApiParam(value = "Imaging Status Request") @RequestBody ImagingStatusRequest imagingStatusRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.addImagingStatus(imagingStatusRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Edit Imaging", notes = "Edit Imaging.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/editImaging", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editImaging(
			@ApiParam(value = "Imaging Status Request") @RequestBody ImagingStatusRequest imagingStatusRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.editImagingStatus(imagingStatusRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add Biopsy Type", notes = "Biopsy examination type added.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/addBiopsyType", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse addBiopsy(
			@ApiParam(value = "BiopsyTypeRequest") @RequestBody BiopsyTypeRequest biopsyTypeRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.addBiopsyType(biopsyTypeRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Edit Biopsy Type", notes = "Biopsy examination type Edited.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/editBiopsyType", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editBiopsy(
			@ApiParam(value = "BiopsyTypeRequest") @RequestBody BiopsyTypeRequest biopsyTypeRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.editBiopsyType(biopsyTypeRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add Reason For Presentation", notes = "Add Reason For Presentation.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/addReasonForPresentation", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse addReasonForPresentation(
			@ApiParam(value = "Reason For Presentation Request") @RequestBody ReasonForPresentationRequest reasonForPresentationRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.addReasonForPresentation(reasonForPresentationRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Edit Reason For Presentation", notes = "Edit Reason For Presentation.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/editReasonForPresentation", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editReasonForPresentation(
			@ApiParam(value = "Reason For Presentation Request") @RequestBody ReasonForPresentationRequest reasonForPresentationRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.editReasonForPresentation(reasonForPresentationRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add Treatment", notes = "Add Treatment")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/addTreatment", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse addTreatment(
			@ApiParam(value = "Treatment Request") @RequestBody TreatmentRequest treatmentRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.addTreadment(treatmentRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Edit Treatment", notes = "Edit Treatment")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/editTreatment", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse editTreatment(
			@ApiParam(value = "Treatment Request") @RequestBody TreatmentRequest treatmentRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.editTreatment(treatmentRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Update User Status", notes = "Update User Status")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@RequestMapping(value = "/updateUserStatus", method = RequestMethod.POST)
	@ResponseBody
	public MedikmResponse updateUserStatus(
			@ApiParam(value = "Physician Request") @RequestBody PhysicianRequest physician,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return masterTableService.updateUserStatus(physician, ipAddress);
	}

}

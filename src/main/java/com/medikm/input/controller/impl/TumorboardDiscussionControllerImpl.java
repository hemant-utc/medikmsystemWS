package com.medikm.input.controller.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medikm.input.controller.TumorboardDiscussionController;
import com.medikm.input.request.TbDiscussionForumRequest;
import com.medikm.input.request.TumorBoardDiscussionRequest;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.response.TumorBoardDiscussionResponse;
import com.medikm.input.service.TumorboardDiscussionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@Api(value = "Tumor Board Discussion Controller", tags = {
		"Tumor Board Discussion Controller" }, produces = "application/json", consumes = "application/json")
@RequestMapping("/tumorboardDiscussion")
public class TumorboardDiscussionControllerImpl implements TumorboardDiscussionController {

	@Autowired
	TumorboardDiscussionService tumorboardDiscussionService;

	@Override
	@ApiOperation(value = "Add Tumor Board Discussion", notes = "Tumor Board Discussion Added.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = TumorBoardDiscussionResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = TumorBoardDiscussionResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = TumorBoardDiscussionResponse.class) })
	@ResponseBody
	@RequestMapping(value = "/addTumorBoardDiscussion", method = RequestMethod.POST)
	public TumorBoardDiscussionResponse addTumorBoardDiscussion(
			@ApiParam(value = "Tumor Board Discussion Request") @RequestBody TumorBoardDiscussionRequest tumorBoardDiscussionRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return tumorboardDiscussionService.addTumorBoardDiscussion(tumorBoardDiscussionRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add Tumor Board Discussion Forum", notes = "Tumor Board Discussion Forum Added.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = MedikmResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@ResponseBody
	@RequestMapping(value = "/addTumorBoardDiscussionForum", method = RequestMethod.POST)
	public MedikmResponse addTbDiscussionForum(
			@ApiParam(value = "Tumor Board Discussion Forum Request") @RequestBody TbDiscussionForumRequest tbDiscussionForumRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return tumorboardDiscussionService.addTbDiscussionForum(tbDiscussionForumRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add New Tumor Board Discussion Forum", notes = "New Tumor Board Discussion Forum Added.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success, response = MedikmResponse.class"),
			@ApiResponse(code = 525, message = "Authentication Failed", response = MedikmResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = MedikmResponse.class) })
	@ResponseBody
	@RequestMapping(value = "/addNewTumorBoardDiscussionForum", method = RequestMethod.POST)
	public MedikmResponse addNewTbDiscussionForum(
			@ApiParam(value = "Tumor Board Discussion Forum Request") @RequestBody TbDiscussionForumRequest tbDiscussionForumRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return tumorboardDiscussionService.addNewTbDiscussionForum(tbDiscussionForumRequest, ipAddress);
	}

	@Override
	@ApiOperation(value = "Add New Tumor Board Discussion", notes = "New Tumor Board Discussion Added.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = TumorBoardDiscussionResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = TumorBoardDiscussionResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = TumorBoardDiscussionResponse.class) })
	@ResponseBody
	@RequestMapping(value = "/addNewTumorBoardDiscussion", method = RequestMethod.POST)
	public TumorBoardDiscussionResponse addNewTbDiscussion(
			@ApiParam(value = "Tumor Board Discussion Request") @RequestBody TumorBoardDiscussionRequest tumorBoardDiscussionRequest,
			HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		return tumorboardDiscussionService.addNewTumorBoardDiscussion(tumorBoardDiscussionRequest, ipAddress);
	}

}

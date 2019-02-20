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

import com.medikm.input.controller.EpisodeController;
import com.medikm.input.request.EpisodeRequest;
import com.medikm.input.response.EpisodeResponse;
import com.medikm.input.service.EpisodeService;

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
@RequestMapping("/episode")
@Api(value = "Episode Controller", tags = {
		"Episode Controller" }, produces = "application/json", consumes = "application/json")
public class EpisodeControllerImpl implements EpisodeController {

	/**
	 * 
	 */
	Logger logger = Logger.getLogger(EpisodeControllerImpl.class);
	private static final long serialVersionUID = -1642108802790933372L;

	@Autowired
	private EpisodeService episodeService;

	@Override
	@ApiOperation(value = "Add Episode", notes = "Episode Added.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = EpisodeResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = EpisodeResponse.class),
			@ApiResponse(code = 500, message = "Failed | No disease type found", response = EpisodeResponse.class) })
	@RequestMapping(value = "/addEpisode", method = RequestMethod.POST)
	@ResponseBody
	public EpisodeResponse addEpisode(@ApiParam(value = "Episode Request") @RequestBody EpisodeRequest episodeRequest,
			HttpServletRequest request) {
		Integer diseaseType = episodeRequest.getDiseaseType();
		String ipAddress = request.getRemoteAddr();
		if (diseaseType != null) {
			if (diseaseType == 1) {
				return episodeService.addBreastEpisode(episodeRequest, ipAddress);
			} else if (diseaseType == 2) {
				return episodeService.addGynEpisode(episodeRequest, ipAddress);
			} else if (diseaseType == 3) {
				return episodeService.addSurcomaEpisode(episodeRequest, ipAddress);
			} else if (diseaseType == 4) {
				return episodeService.addGUEpisode(episodeRequest, ipAddress);
			}

			return null;
		} else {
			EpisodeResponse episodeResponse = new EpisodeResponse();
			episodeResponse.setEpisodeId(0);
			episodeResponse.setResponseCode("500");
			episodeResponse.setResponseMessage("No disease type found");
			return episodeResponse;
		}

	}

	@Override
	@ApiOperation(value = "Edit Episode", notes = "Episode Edited.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = EpisodeResponse.class),
			@ApiResponse(code = 525, message = "Authentication Failed", response = EpisodeResponse.class),
			@ApiResponse(code = 500, message = "Failed | No disease type found", response = EpisodeResponse.class) })
	@RequestMapping(value = "/editEpisode", method = RequestMethod.POST)
	@ResponseBody
	public EpisodeResponse editEpisode(@ApiParam(value = "Episode Request") @RequestBody EpisodeRequest episodeRequest,
			HttpServletRequest request) {
		logger.info("Reason For Representation : " + episodeRequest.getReasonForPresentation());
		Integer diseaseType = episodeRequest.getDiseaseType();
		String ipAddress = request.getRemoteAddr();
		if (diseaseType != null) {
			if (diseaseType == 1) {
				return episodeService.editBreastEpisode(episodeRequest, ipAddress);
			} else if (diseaseType == 2) {
				return episodeService.editGynEpisode(episodeRequest, ipAddress);
			} else if (diseaseType == 3) {
				return episodeService.editSurcomaEpisode(episodeRequest, ipAddress);
			} else if (diseaseType == 4) {
				return episodeService.editGUEpisode(episodeRequest, ipAddress);
			}
			return null;
		} else {
			EpisodeResponse episodeResponse = new EpisodeResponse();
			episodeResponse.setEpisodeId(0);
			episodeResponse.setResponseCode("500");
			episodeResponse.setResponseMessage("No disease type found");
			return episodeResponse;
		}
	}

}

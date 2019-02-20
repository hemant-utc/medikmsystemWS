package com.medikm.input.controller;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import com.medikm.input.request.EpisodeRequest;
import com.medikm.input.response.EpisodeResponse;

/**
 * This interface is about Episode section
 * 
 * @author LMS
 *
 */
public interface EpisodeController extends Serializable {

	/**
	 * This method will add new episode
	 * 
	 * @param episodeRequest
	 * @return
	 */
	public EpisodeResponse addEpisode(EpisodeRequest episodeRequest, HttpServletRequest request);

	/**
	 * This method will edit episode
	 * 
	 * @param episodeRequest
	 * @return
	 */
	public EpisodeResponse editEpisode(EpisodeRequest episodeRequest, HttpServletRequest request);
}

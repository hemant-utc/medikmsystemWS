/**
 * 
 */
package com.medikm.input.service;

import java.io.Serializable;

import com.medikm.input.request.EpisodeRequest;
import com.medikm.input.response.EpisodeResponse;

/**
 * @author Saikat
 *
 */
public interface EpisodeService extends Serializable {

	public EpisodeResponse addBreastEpisode(EpisodeRequest episodeRequest, String ipAddress);

	public EpisodeResponse editBreastEpisode(EpisodeRequest episodeRequest, String ipAddress);

	public EpisodeResponse addGynEpisode(EpisodeRequest episodeRequest, String ipAddress);

	public EpisodeResponse addSurcomaEpisode(EpisodeRequest episodeRequest, String ipAddress);

	public EpisodeResponse editGynEpisode(EpisodeRequest episodeRequest, String ipAddress);

	public EpisodeResponse editSurcomaEpisode(EpisodeRequest episodeRequest, String ipAddress);

	public EpisodeResponse addGUEpisode(EpisodeRequest episodeRequest, String ipAddress);

	public EpisodeResponse editGUEpisode(EpisodeRequest episodeRequest, String ipAddress);
	
}

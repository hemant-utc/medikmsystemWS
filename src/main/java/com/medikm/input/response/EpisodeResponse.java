/**
 * 
 */
package com.medikm.input.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Saikat
 *
 */
@ApiModel(value = "Episode Response", description = "Episode Response", subTypes = { MedikmResponse.class })
public class EpisodeResponse extends MedikmResponse {

	private static final long serialVersionUID = 5399542600720370116L;

	private Integer episodeId;
	private Integer tBDiscussionId;

	/**
	 * @return the episodeId
	 */
	@ApiModelProperty(value = "Episode Id", notes = "Episode Id", dataType = "Integer")
	public Integer getEpisodeId() {
		return episodeId;
	}

	/**
	 * @param episodeId
	 *            the episodeId to set
	 */
	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}

	/**
	 * @param tBDiscussionId
	 *            the tBDiscussionId to set
	 */
	public void setTBDiscussionId(Integer tBDiscussionId) {
		this.tBDiscussionId = tBDiscussionId;
	}

	/**
	 * @return the tBDiscussionId
	 */
	@ApiModelProperty(value = "TB Discussion Id", notes = "TB Discussion Id", dataType = "Integer")
	public Integer getTBDiscussionId() {
		return tBDiscussionId;
	}
}

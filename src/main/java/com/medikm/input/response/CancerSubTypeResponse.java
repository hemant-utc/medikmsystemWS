/**
 * 
 */
package com.medikm.input.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Monika
 *
 */
@ApiModel(value = "Cancer Sub Type Response", description = "Cancer Sub Type Response.", subTypes = {
		MedikmResponse.class })
public class CancerSubTypeResponse extends MedikmResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	private Integer canSubTypeId;

	@ApiModelProperty(value = "Cancer Subtype Id", notes = "Cancer Subtype Id", dataType = "Integer")
	public Integer getCanSubTypeId() {
		return canSubTypeId;
	}

	public void setCanSubTypeId(Integer canSubTypeId) {
		this.canSubTypeId = canSubTypeId;
	}

}

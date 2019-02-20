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
@ApiModel(value = "Cancer Type Response", description = "Cancer Type Response.", subTypes = { MedikmResponse.class })
public class CancerTypeResponse extends MedikmResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	private Integer canTypeId;

	@ApiModelProperty(value = "Cancer Type Id", notes = "Cancer Type Id", dataType = "Integer")
	public Integer getCanTypeId() {
		return canTypeId;
	}

	public void setCanTypeId(Integer canTypeId) {
		this.canTypeId = canTypeId;
	}

}

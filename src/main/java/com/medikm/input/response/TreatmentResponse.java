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
@ApiModel(value = "Treatment Response", description = "Treatment Response.", subTypes = { MedikmResponse.class })
public class TreatmentResponse extends MedikmResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	private Integer typeId;

	@ApiModelProperty(value = "Type Id", notes = "Type Id", dataType = "Integer")
	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

}

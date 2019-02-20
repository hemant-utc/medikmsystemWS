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
@ApiModel(value = "Biopsy Type Response", description = "Biopsy Type Response.", subTypes = { MedikmResponse.class })
public class BiopsyTypeResponse extends MedikmResponse {

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

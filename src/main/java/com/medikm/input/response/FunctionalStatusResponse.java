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
@ApiModel(value = "Functional Status Response", description = "Functional Status Response.", subTypes = {
		MedikmResponse.class })
public class FunctionalStatusResponse extends MedikmResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	private Integer id;

	@ApiModelProperty(value = "Id", notes = "Id", dataType = "Integer")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}

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
@ApiModel(value = "Physician Response", description = "Physician Response.", subTypes = { MedikmResponse.class })
public class PhysicianResponse extends MedikmResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	private Integer physicianId;

	@ApiModelProperty(value = "Physician Id", notes = "Physician Id", dataType = "Integer")
	public Integer getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(Integer physicianId) {
		this.physicianId = physicianId;
	}

}

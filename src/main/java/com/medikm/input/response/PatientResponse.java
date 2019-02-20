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
@ApiModel(value = "Patient Response", description = "Patient Response", subTypes = { MedikmResponse.class })
public class PatientResponse extends MedikmResponse {

	private static final long serialVersionUID = 1968002218324455978L;

	/**
	 * @param args
	 */
	private Integer patientId;

	/**
	 * @return the patientId
	 */
	@ApiModelProperty(value = "Patient Id", notes = "Patient Id", dataType = "Integer")
	public Integer getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

}

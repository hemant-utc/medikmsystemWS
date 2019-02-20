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
@ApiModel(value = "Case Response", description = "Case Response", subTypes = { MedikmResponse.class })
public class CaseResponse extends MedikmResponse {

	private static final long serialVersionUID = -7967728101293578512L;

	private Integer caseId;

	private String similarCaseDetails;

	/**
	 * @return the caseId
	 */
	@ApiModelProperty(value = "Case Id", notes = "Case Id", dataType = "Integer")
	public Integer getCaseId() {
		return caseId;
	}

	/**
	 * @param caseId
	 *            the caseId to set
	 */
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	@ApiModelProperty(value = "Similar Case Details", notes = "Similar Case Details", dataType = "String")
	public String getSimilarCaseDetails() {
		return similarCaseDetails;
	}

	public void setSimilarCaseDetails(String similarCaseDetails) {
		this.similarCaseDetails = similarCaseDetails;
	}

}

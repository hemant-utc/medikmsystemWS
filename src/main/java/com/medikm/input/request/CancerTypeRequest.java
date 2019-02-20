package com.medikm.input.request;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Monika
 *
 */
@ApiModel(value = "Cancer Type Request", description = "Cancer Type Request.")
@XmlRootElement(name = "cancerTypeRequest")
public class CancerTypeRequest {

	private Integer canTypeId;
	private String cName;
	private String comments;
	private Integer diseaseType;
	private Integer diseaseSubTypeId;
	private String authToken;

	@ApiModelProperty(value = "Cancer Type Id", notes = "Cancer Type Id", dataType = "Integer")
	public Integer getCanTypeId() {
		return canTypeId;
	}

	public void setCanTypeId(Integer canTypeId) {
		this.canTypeId = canTypeId;
	}

	@ApiModelProperty(value = "Cancer Name", notes = "Cancer Name", dataType = "String")
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@ApiModelProperty(value = "Comments", notes = "Comments", dataType = "String")
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@ApiModelProperty(value = "Disease Type", notes = "Disease Type", dataType = "Integer")
	public Integer getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(Integer diseaseType) {
		this.diseaseType = diseaseType;
	}

	@ApiModelProperty(value = "Disease Subtype Id", notes = "Disease Subtype Id", dataType = "Integer")
	public Integer getDiseaseSubTypeId() {
		return diseaseSubTypeId;
	}

	public void setDiseaseSubTypeId(Integer diseaseSubTypeId) {
		this.diseaseSubTypeId = diseaseSubTypeId;
	}

	/**
	 * @return the authToken
	 */
	@ApiModelProperty(value = "Auth Token", notes = "Auth Token", dataType = "String")
	public String getAuthToken() {
		return authToken;
	}

	/**
	 * @param authToken
	 *            the authToken to set
	 */
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

}

package com.medikm.input.request;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Monika
 *
 */
@ApiModel(value = "Treatment Request", description = "Treatment Request.")
@XmlRootElement(name = "SurgeryType")
public class TreatmentRequest {

	private Integer typeId;
	private String sName;
	private Integer diseaseSubTypeId;
	private String authToken;

	@ApiModelProperty(value = "Type Id", notes = "Type Id", dataType = "Integer")
	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@ApiModelProperty(value = "Name", notes = "Name", dataType = "String")
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@ApiModelProperty(value = "Disease SubType Id", notes = "Disease SubType Id", dataType = "Integer")
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

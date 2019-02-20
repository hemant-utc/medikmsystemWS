package com.medikm.input.request;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Monika
 *
 */
@ApiModel(value = "Imaging Status Request", description = "Imaging Status Request.")
@XmlRootElement(name = "imagingStatusRequest")
public class ImagingStatusRequest {
	
	private Integer typeId;
	private String name;
	private Integer refId;
	private Integer diseaseTypeId;
	private String authToken;

	@ApiModelProperty(value = "Disease Type Id", notes = "Disease Type Id", dataType = "Integer")
	public Integer getDiseaseTypeId() {
		return diseaseTypeId;
	}

	public void setDiseaseTypeId(Integer diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	@ApiModelProperty(value = "Ref Id", notes = "Ref Id", dataType = "Integer")
	public Integer getRefId() {
		return refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	@ApiModelProperty(value = "Type Id", notes = "Type Id", dataType = "Integer")
	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@ApiModelProperty(value = "Name", notes = "Name", dataType = "String")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

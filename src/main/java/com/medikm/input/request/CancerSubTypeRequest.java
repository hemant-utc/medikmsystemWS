package com.medikm.input.request;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Monika
 *
 */
@ApiModel(value = "Cancer SubType Request", description = "Cancer SubType Request.")
@XmlRootElement(name = "cancerSubTypeRequest")
public class CancerSubTypeRequest {

	private Integer canSubTypeId;
	private String name;
	private Integer cancerType;
	private String authToken;

	@ApiModelProperty(value = "Cancer SubType Id", notes = "Cancer SubType Id", dataType = "Integer")
	public Integer getCanSubTypeId() {
		return canSubTypeId;
	}

	public void setCanSubTypeId(Integer canSubTypeId) {
		this.canSubTypeId = canSubTypeId;
	}

	@ApiModelProperty(value = "Name", notes = "Name", dataType = "String")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ApiModelProperty(value = "Cancer Type", notes = "Cancer Type", dataType = "Integer")
	public Integer getCancerType() {
		return cancerType;
	}

	public void setCancerType(Integer cancerType) {
		this.cancerType = cancerType;
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

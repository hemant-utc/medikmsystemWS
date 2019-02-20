package com.medikm.input.request;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Monika
 *
 */
@ApiModel(value = "Functional Status Request", description = "Functional Status Request.")
@XmlRootElement(name = "functionalStatusRequest")
public class FunctionalStatusRequest {

	private Integer id;
	private String status;
	private String authToken;

	@ApiModelProperty(value = "Id", notes = "Id", dataType = "Integer")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ApiModelProperty(value = "Status", notes = "Status", dataType = "String")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

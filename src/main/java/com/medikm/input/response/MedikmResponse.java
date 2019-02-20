package com.medikm.input.response;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Saikat
 *
 */
@ApiModel(value = "MedikmResponse", description = "MedikmResponse class used for returning medikmresponse", subTypes = {
		Serializable.class })
public class MedikmResponse implements Serializable {

	private static final long serialVersionUID = 9085030999215205054L;

	private String responseCode;
	private String responseMessage;
	private String authenticationKey;

	/**
	 * @return the responseCode
	 */
	@ApiModelProperty(value = "Response Code", notes = "Response Code", dataType = "String")
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode
	 *            the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @return the responseMessage
	 */
	@ApiModelProperty(value = "Response Message", notes = "Response Message", dataType = "String")
	public String getResponseMessage() {
		return responseMessage;
	}

	/**
	 * @param responseMessage
	 *            the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	/**
	 * @return the authenticationKey
	 */
	@ApiModelProperty(value = "Authentication Key", notes = "Authentication Key", dataType = "String")
	public String getAuthenticationKey() {
		return authenticationKey;
	}

	/**
	 * @param authenticationKey
	 *            the authenticationKey to set
	 */
	public void setAuthenticationKey(String authenticationKey) {
		this.authenticationKey = authenticationKey;
	}

}

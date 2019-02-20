package com.medikm.input.exception;

/**
 * 
 * @author Saikat
 *
 */
public class MedikmAuthenticationFailureException extends RuntimeException {

	private static final long serialVersionUID = 3711046647966879011L;

	@SuppressWarnings("unused")
	private String customMsg;

	public MedikmAuthenticationFailureException(String customMsg) {
		this.customMsg = customMsg;
	}
}

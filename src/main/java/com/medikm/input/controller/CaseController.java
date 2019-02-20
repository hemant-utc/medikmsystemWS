package com.medikm.input.controller;

import javax.servlet.http.HttpServletRequest;

import com.medikm.input.request.CaseRequest;
import com.medikm.input.request.SimilarCaseRequest;
import com.medikm.input.response.CaseResponse;
import com.medikm.input.response.MedikmResponse;

public interface CaseController {

	/**
	 * This method use to create new case
	 * 
	 * @param caseRequest
	 * @return
	 */
	public MedikmResponse createCase(CaseRequest caseRequest, HttpServletRequest request);

	/**
	 * This method use to edit case
	 * 
	 * @param caseRequest
	 * @return
	 */
	public MedikmResponse editCase(CaseRequest caseRequest, HttpServletRequest request);

	/**
	 * This method use to retrieve all similar cases
	 * 
	 * @param caseRequest
	 * @return
	 */
	public CaseResponse getAllSimilarCase(SimilarCaseRequest caseRequest, HttpServletRequest request);
}

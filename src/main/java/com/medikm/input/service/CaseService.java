/**
 * 
 */
package com.medikm.input.service;

import java.io.Serializable;

import com.medikm.input.request.CaseRequest;
import com.medikm.input.request.SimilarCaseRequest;
import com.medikm.input.response.CaseResponse;
import com.medikm.input.response.MedikmResponse;

/**
 * @author Saikat
 *
 */
public interface CaseService extends Serializable {

	/**
	 * @param caseRequest
	 * @return
	 */
	public CaseResponse addBreastCase(CaseRequest caseRequest, String ipAddress);

	/**
	 * This method is to add Breast Cancer Case
	 * 
	 * @param caseRequest
	 * @return
	 */
	public MedikmResponse editBreastCase(CaseRequest caseRequest, String ipAddress);

	/**
	 * This method is to add GYN Case
	 * 
	 * @param caseRequest
	 * @return CaseResponse
	 */
	public CaseResponse addGynCase(CaseRequest caseRequest, String ipAddress);

	/**
	 * This method is to edit GYN Case
	 * 
	 * @param caseRequest
	 * @return
	 */

	public MedikmResponse editGynCase(CaseRequest caseRequest, String ipAddress);

	/**
	 * This method is to add STM/Surcoma Case
	 * 
	 * @param caseRequest
	 * @return
	 */
	public CaseResponse addSurcomaCase(CaseRequest caseRequest, String ipAddress);

	/**
	 * This method is to edit STM/Surcoma Case
	 * 
	 * @param caseRequest
	 * @return
	 */
	public MedikmResponse editSurcomaCase(CaseRequest caseRequest, String ipAddress);

	/**
	 * This method is to add GU Oncology Case
	 * 
	 * @param caseRequest
	 * @return
	 */
	public CaseResponse addGUOncologyCase(CaseRequest caseRequest, String ipAddress);

	/**
	 * This method is to edit GU Oncology Case
	 * 
	 * @param caseRequest
	 * @return
	 */
	public MedikmResponse editGUOncologyCase(CaseRequest caseRequest, String ipAddress);

	/**
	 * This method is to get all similar cases
	 * 
	 * @param SimilarCaseRequest
	 * @return CaseResponse
	 */
	public CaseResponse getAllSimilarCases(SimilarCaseRequest caseRequest, String ipAddress);

}

package com.medikm.input.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;

import com.medikm.input.request.BiopsyTypeRequest;
import com.medikm.input.request.CancerSubTypeRequest;
import com.medikm.input.request.CancerTypeRequest;
import com.medikm.input.request.FunctionalStatusRequest;
import com.medikm.input.request.ImagingStatusRequest;
import com.medikm.input.request.PhysicianRequest;
import com.medikm.input.request.ReasonForPresentationRequest;
import com.medikm.input.request.TreatmentRequest;
import com.medikm.input.response.MedikmResponse;

public interface MasterTableController /* extends Serializable */ {

	/**
	 * This method will add new race data
	 * 
	 * @param raceName
	 * @return
	 */
	public MedikmResponse addRace(@PathVariable String raceName, HttpServletRequest request);

	/**
	 * This method will add new physician
	 * 
	 * @param physicianRequest
	 * @return
	 */
	public MedikmResponse addPhysician(PhysicianRequest physicianRequest, HttpServletRequest request);

	/**
	 * This method will update physician
	 * 
	 * @param physicianRequest
	 * @return
	 */
	public MedikmResponse editPhysician(PhysicianRequest physicianRequest, HttpServletRequest request);

	/**
	 * This method will addcancer type
	 * 
	 * @param cancerTypeRequest
	 * @return
	 */
	public MedikmResponse addCancerType(CancerTypeRequest cancerTypeRequest, HttpServletRequest request);

	/**
	 * This method will edit cancer type
	 * 
	 * @param cancerTypeRequest
	 * @return
	 */
	public MedikmResponse editCancerType(CancerTypeRequest cancerTypeRequest, HttpServletRequest request);

	/**
	 * This method will add cancer sub type
	 * 
	 * @param cancerSubTypeRequest
	 * @return
	 */
	public MedikmResponse addCancerSubType(CancerSubTypeRequest cancerSubTypeRequest, HttpServletRequest request);

	/**
	 * This method will edit cancer sub type
	 * 
	 * @param cancerSubTypeRequest
	 * @return
	 */
	public MedikmResponse editCancerSubType(CancerSubTypeRequest cancerSubTypeRequest, HttpServletRequest request);

	/**
	 * This method will add functional status
	 * 
	 * @param functionalStatusRequest
	 * @return
	 */
	public MedikmResponse addFunctionalStatus(FunctionalStatusRequest functionalStatusRequest,
			HttpServletRequest request);

	/**
	 * This method will update functional status
	 * 
	 * @param functionalStatusRequest
	 * @return
	 */
	public MedikmResponse editFunctionalStatus(FunctionalStatusRequest functionalStatusRequest,
			HttpServletRequest request);

	/**
	 * This method will add imaging data
	 * 
	 * @param imagingStatusRequest
	 * @return
	 */
	public MedikmResponse addImaging(ImagingStatusRequest imagingStatusRequest, HttpServletRequest request);

	/**
	 * This method will update imaging data
	 * 
	 * @param imagingStatusRequest
	 * @return
	 */
	public MedikmResponse editImaging(ImagingStatusRequest imagingStatusRequest, HttpServletRequest request);

	/**
	 * This method will add biopsy detail
	 * 
	 * @param biopsyTypeRequest
	 * @return
	 */
	public MedikmResponse addBiopsy(BiopsyTypeRequest biopsyTypeRequest, HttpServletRequest request);

	/**
	 * This method will edit biopsy detail
	 * 
	 * @param biopsyTypeRequest
	 * @return
	 */
	public MedikmResponse editBiopsy(BiopsyTypeRequest biopsyTypeRequest, HttpServletRequest request);

	/**
	 * This method will add reason for presentation
	 * 
	 * @param reasonForPresentationRequest
	 * @return
	 */
	public MedikmResponse addReasonForPresentation(ReasonForPresentationRequest reasonForPresentationRequest,
			HttpServletRequest request);

	/**
	 * This method will update reason for presentation
	 * 
	 * @param reasonForPresentationRequest
	 * @return
	 */
	public MedikmResponse editReasonForPresentation(ReasonForPresentationRequest reasonForPresentationRequest,
			HttpServletRequest request);

	/**
	 * This method will add Treatment detail
	 * 
	 * @param treatmentRequest
	 * @return
	 */
	public MedikmResponse addTreatment(TreatmentRequest treatmentRequest, HttpServletRequest request);

	/**
	 * This method will update Treatment detail
	 * 
	 * @param treatmentRequest
	 * @return
	 */
	public MedikmResponse editTreatment(TreatmentRequest treatmentRequest, HttpServletRequest request);

	/**
	 * This method will update user status
	 * 
	 * @param physician
	 * @return
	 */
	public MedikmResponse updateUserStatus(PhysicianRequest physician, HttpServletRequest request);

}

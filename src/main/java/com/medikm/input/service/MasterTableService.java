package com.medikm.input.service;

import java.io.Serializable;

import com.medikm.input.request.BiopsyTypeRequest;
import com.medikm.input.request.CancerSubTypeRequest;
import com.medikm.input.request.CancerTypeRequest;
import com.medikm.input.request.FunctionalStatusRequest;
import com.medikm.input.request.ImagingStatusRequest;
import com.medikm.input.request.PhysicianRequest;
import com.medikm.input.request.ReasonForPresentationRequest;
import com.medikm.input.request.TreatmentRequest;
import com.medikm.input.response.BiopsyTypeResponse;
import com.medikm.input.response.CancerSubTypeResponse;
import com.medikm.input.response.CancerTypeResponse;
import com.medikm.input.response.FunctionalStatusResponse;
import com.medikm.input.response.ImagingStatusResponse;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.response.PhysicianResponse;
import com.medikm.input.response.ReasonForPresentationResponse;
import com.medikm.input.response.TreatmentResponse;

/**
 * 
 * Author : Dhiraj Singh
 * 
 **/

public interface MasterTableService extends Serializable {

	public MedikmResponse addRace(String raceName, String ipAddress);

	public PhysicianResponse addPhysician(PhysicianRequest physician, String ipAddress);

	public MedikmResponse editPhysician(PhysicianRequest physician, String ipAddress);

	public CancerTypeResponse addCancerType(CancerTypeRequest cancerTypeRequest, String ipAddress);

	public MedikmResponse editCancerType(CancerTypeRequest cancerTypeRequest, String ipAddress);

	public CancerSubTypeResponse addCancerSubType(CancerSubTypeRequest cancerSubTypeRequest, String ipAddress);

	public MedikmResponse editCancerSubType(CancerSubTypeRequest cancerSubTypeRequest, String ipAddress);

	public FunctionalStatusResponse addFunctionalStatus(FunctionalStatusRequest functionalStatusRequest, String ipAddress);

	public MedikmResponse editFunctionalStatus(FunctionalStatusRequest functionalStatusRequest, String ipAddress);

	public ImagingStatusResponse addImagingStatus(ImagingStatusRequest imagingStatusRequest, String ipAddress);

	public MedikmResponse editImagingStatus(ImagingStatusRequest imagingStatusRequest, String ipAddress);

	public BiopsyTypeResponse addBiopsyType(BiopsyTypeRequest biopsyTypeRequest, String ipAddress);

	public MedikmResponse editBiopsyType(BiopsyTypeRequest biopsyTypeRequest, String ipAddress);

	public ReasonForPresentationResponse addReasonForPresentation(ReasonForPresentationRequest reasonForPresentationRequest, String ipAddress);

	public MedikmResponse editReasonForPresentation(ReasonForPresentationRequest reasonForPresentationRequest, String ipAddress);

	public TreatmentResponse addTreadment(TreatmentRequest treatmentRequest, String ipAddress);

	public MedikmResponse editTreatment(TreatmentRequest treatmentRequest, String ipAddress);

	public MedikmResponse updateUserStatus(PhysicianRequest physician, String ipAddress);

}

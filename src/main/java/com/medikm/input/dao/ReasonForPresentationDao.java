package com.medikm.input.dao;

import com.medikm.input.entity.ReasonForPresentation;

public interface ReasonForPresentationDao {

	public Integer insertReasonForPresentation(ReasonForPresentation reasonForPresentation);

	public void updateReasonForPresentation(ReasonForPresentation reasonForPresentation);

	public ReasonForPresentation getReasonForPresentationeById(Integer Id);

	public Integer getLastReasonForPresentationId();

}

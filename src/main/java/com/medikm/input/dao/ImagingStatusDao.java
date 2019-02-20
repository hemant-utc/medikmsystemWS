package com.medikm.input.dao;

import com.medikm.input.entity.DiseaseType;
import com.medikm.input.entity.DxWkType;
import com.medikm.input.entity.WorkupKindType;

public interface ImagingStatusDao {

	public Integer insertImagingStatus(WorkupKindType workupKindType);

	public void updateImagingStatus(WorkupKindType workupKindType);

	public WorkupKindType getImagingStatusById(Integer Id);

	public DxWkType getDxWkTypeById(Integer Id);

	public Integer getLastImagingStatusId();

	public DiseaseType getDiseaseTypeById(Integer diseaseTypeId);

}

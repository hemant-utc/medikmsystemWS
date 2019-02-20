package com.medikm.input.dao;

import java.util.List;

import com.medikm.input.entity.DiseaseSubType;
import com.medikm.input.entity.SurgeryType;

public interface TreatmentDao {

	public Integer insertTreatmentType(SurgeryType surgeryType);

	public void updateTreatmentType(SurgeryType surgeryType);

	public SurgeryType getTreatmentTypeById(Integer typeId);

	public Integer getLastTreatmentTypeId();

	public List<DiseaseSubType> getDiseaseSubTypeList();

	public DiseaseSubType getDiseaseSubTypeById(Integer diseaseSubTypeId);
	
}

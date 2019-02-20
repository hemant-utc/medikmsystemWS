package com.medikm.input.dao;

import java.util.List;

import com.medikm.input.entity.CancerType;
import com.medikm.input.entity.DiseaseSubType;
import com.medikm.input.entity.DiseaseType;

public interface CancerTypeDao {

	public Integer insertCancerType(CancerType cancerType);

	public void updateCancerType(CancerType cancerType);

	public CancerType getCancerTypeById(Integer cancerTypeId);

	public Integer getLastCancerTypeId();

	public List<DiseaseType> getDiseaseTypeList();

	public DiseaseType getDiseaseTypeById(Integer diseaseTypeId);

	public List<DiseaseSubType> getDiseaseSubTypeList();

	public DiseaseSubType getDiseaseSubTypeById(Integer diseaseSubTypeId);

	public boolean isCancerTypeExist(CancerType c);
	
}

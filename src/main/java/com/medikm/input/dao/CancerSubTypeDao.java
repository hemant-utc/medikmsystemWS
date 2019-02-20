package com.medikm.input.dao;

import java.util.List;

import com.medikm.input.entity.CancerSubType;
import com.medikm.input.entity.CancerType;

public interface CancerSubTypeDao {

	public Integer insertCancerSubType(CancerSubType cancerSubType);

	public void updateCancerSubType(CancerSubType cancerSubType);

	public CancerSubType getCancerSubTypeById(Integer cancerSubTypeId);

	public Integer getLastCancerSubTypeId();

	public List<CancerType> getCancerTypeList();

	public CancerType getCancerTypeById(Integer cancerTypeId);

	public boolean isCancerSubTypeExist(CancerSubType c);

}

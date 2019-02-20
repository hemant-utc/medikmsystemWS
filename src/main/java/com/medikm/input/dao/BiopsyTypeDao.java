package com.medikm.input.dao;

import com.medikm.input.entity.BiopsyType;

public interface BiopsyTypeDao {

	public Integer insertBiopsyType(BiopsyType biopsyType);

	public void updateBiopsyType(BiopsyType biopsyType);

	public BiopsyType getBiopsyTypeById(Integer Id);

	public Integer getLastBiopsyTypeId();

}

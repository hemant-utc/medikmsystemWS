package com.medikm.input.dao;
import java.util.List;

import com.medikm.input.entity.CancerType;
import com.medikm.input.entity.CareFacility;
import com.medikm.input.entity.DiseaseType;
import com.medikm.input.entity.Physician;
import com.medikm.input.entity.PhysicianSpeciality;

public interface PhysicianDao {
	 public Integer insertPhysician(Physician physician);
	 
	 public void updatePhysician(Physician p);
	 
	 public Physician getPhysicanById(Integer physicianId);
	 
	 public Physician getPhysicanByEmailId(String emailId);
	 
	 public Integer getLastPhysicianId();
	 
	 public List<CancerType>getCancerList();
	 
	 public CancerType getCancerTypeById(Integer cancerTypeId);
	 
	 public List<DiseaseType>getDiseaseTypeList();
	 
	 public DiseaseType getDiseaseTypeById(Integer diseaseTypeId);
	 
	 public List<CareFacility> getFacilityTypeList();
	 
	 public CareFacility getFacilityTypeById(Integer facilityId);
	 
	 public List<PhysicianSpeciality> getPhysicianSpeList();
	 
	 public PhysicianSpeciality getPhysicianSpecialityById(Integer specilityId);
}

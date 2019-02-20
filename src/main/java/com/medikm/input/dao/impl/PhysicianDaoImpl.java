/**
 * 
 */
package com.medikm.input.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.PhysicianDao;
import com.medikm.input.entity.CancerType;
import com.medikm.input.entity.CareFacility;
import com.medikm.input.entity.DiseaseType;
import com.medikm.input.entity.FacilityType;
import com.medikm.input.entity.Physician;
import com.medikm.input.entity.PhysicianSpeciality;

/**
 * @author Monika
 * 
 */
@Repository("PhysicianDao")
public class PhysicianDaoImpl implements PhysicianDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer insertPhysician(Physician physician) {
		hibernateTemplate.save(physician);
		return physician.getPhysicianId();
	}

	@Override
	@Transactional
	public void updatePhysician(Physician p) {
		hibernateTemplate.merge(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Physician getPhysicanById(Integer physicianId) {
		List<Physician> physicianList = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(Physician.class).add(Restrictions.eq("physicianId", physicianId)));
		if (physicianList != null && physicianList.size() > 0) {
			return physicianList.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Physician getPhysicanByEmailId(String emailId) {
		List<Physician> physicianList = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Physician.class).add(Restrictions.eq("eMailId", emailId)));
		if (physicianList != null && physicianList.size() > 0) {
			return physicianList.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Integer getLastPhysicianId() {
		hibernateTemplate.setMaxResults(1);
		List<Integer> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(Physician.class).setProjection(Projections.max("physicianId")));
		hibernateTemplate.setMaxResults(0);
		return li.get(0);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<CancerType> getCancerList() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(CancerType.class));
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<DiseaseType> getDiseaseTypeList() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(DiseaseType.class));
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<CareFacility> getFacilityTypeList() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(FacilityType.class));
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<PhysicianSpeciality> getPhysicianSpeList() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(PhysicianSpeciality.class));
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public CancerType getCancerTypeById(Integer cancerTypeId) {
		List<CancerType> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(CancerType.class).add(Restrictions.eq("canTypeId", cancerTypeId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public DiseaseType getDiseaseTypeById(Integer diseaseTypeId) {
		List<DiseaseType> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(DiseaseType.class).add(Restrictions.eq("diseaseTypeId", diseaseTypeId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public CareFacility getFacilityTypeById(Integer facilityId) {
		List<CareFacility> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(CareFacility.class).add(Restrictions.eq("facilityId", facilityId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public PhysicianSpeciality getPhysicianSpecialityById(Integer specilityId) {
		List<PhysicianSpeciality> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(PhysicianSpeciality.class).add(Restrictions.eq("typeId", specilityId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

}

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

import com.medikm.input.dao.TreatmentDao;
import com.medikm.input.entity.DiseaseSubType;
import com.medikm.input.entity.SurgeryType;

/**
 * @author Monika
 * 
 */
@Repository("TreatmentDao")
public class TreatmentDaoImpl implements TreatmentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.medikm.input.dao.TreatmentDao#insertTreatment(com.medikm.input.entity
	 * .SurgeryType)
	 */

	@Override
	@Transactional
	public Integer insertTreatmentType(SurgeryType surgeryType) {
		hibernateTemplate.save(surgeryType);
		return surgeryType.getTypeId();
	}

	@Override
	@Transactional
	public void updateTreatmentType(SurgeryType surgeryType) {
		hibernateTemplate.merge(surgeryType);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Integer getLastTreatmentTypeId() {
		hibernateTemplate.setMaxResults(1);
		List<Integer> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(SurgeryType.class).setProjection(Projections.max("typeId")));
		hibernateTemplate.setMaxResults(0);
		return li.get(0);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<DiseaseSubType> getDiseaseSubTypeList() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(DiseaseSubType.class));
	}

	@SuppressWarnings("unchecked")
	@Override
	public SurgeryType getTreatmentTypeById(Integer typeId) {
		List<SurgeryType> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(SurgeryType.class).add(Restrictions.eq("typeId", typeId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public DiseaseSubType getDiseaseSubTypeById(Integer diseaseSubTypeId) {
		List<DiseaseSubType> li = hibernateTemplate.findByCriteria(DetachedCriteria.forClass(DiseaseSubType.class)
				.add(Restrictions.eq("diseaseSubTypeId", diseaseSubTypeId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

}

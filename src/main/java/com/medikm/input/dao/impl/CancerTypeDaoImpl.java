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

import com.medikm.input.dao.CancerTypeDao;
import com.medikm.input.entity.CancerType;
import com.medikm.input.entity.DiseaseSubType;
import com.medikm.input.entity.DiseaseType;

/**
 * @author Monika
 * 
 */
@Repository("CancerTypeDao")
public class CancerTypeDaoImpl implements CancerTypeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer insertCancerType(CancerType cancerType) {
		hibernateTemplate.save(cancerType);
		return cancerType.getCanTypeId();
	}

	@Override
	@Transactional
	public void updateCancerType(CancerType cancerType) {
		hibernateTemplate.merge(cancerType);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Integer getLastCancerTypeId() {
		hibernateTemplate.setMaxResults(1);
		List<Integer> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(CancerType.class).setProjection(Projections.max("canTypeId")));
		hibernateTemplate.setMaxResults(0);
		return li.get(0);
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
	public List<DiseaseSubType> getDiseaseSubTypeList() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(DiseaseSubType.class));
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
	public DiseaseSubType getDiseaseSubTypeById(Integer diseaseSubTypeId) {
		List<DiseaseSubType> li = hibernateTemplate.findByCriteria(DetachedCriteria.forClass(DiseaseSubType.class)
				.add(Restrictions.eq("diseaseSubTypeId", diseaseSubTypeId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public boolean isCancerTypeExist(CancerType c) {
		List<CancerType> li = hibernateTemplate.findByCriteria(DetachedCriteria.forClass(CancerType.class)
				.add(Restrictions.eq("cName", c.getCName()))
				.add(Restrictions.eq("diseasetypeId.diseaseTypeId", c.getDiseasetypeId().getDiseaseTypeId()))
				.add(Restrictions.eq("diseaseSubType.diseaseSubTypeId", c.getDiseaseSubType().getDiseaseSubTypeId())));
		if (li != null && li.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

}

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

import com.medikm.input.dao.CancerSubTypeDao;
import com.medikm.input.entity.CancerSubType;
import com.medikm.input.entity.CancerType;

/**
 * @author Monika
 * 
 */
@Repository("CancerSubTypeDao")
public class CancerSubTypeDaoImpl implements CancerSubTypeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer insertCancerSubType(CancerSubType cancerSubType) {
		hibernateTemplate.save(cancerSubType);
		return cancerSubType.getCanSubTypeId();
	}

	@Override
	@Transactional
	public void updateCancerSubType(CancerSubType cancerSubType) {
		hibernateTemplate.merge(cancerSubType);

	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Integer getLastCancerSubTypeId() {
		hibernateTemplate.setMaxResults(1);
		List<Integer> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(CancerSubType.class).setProjection(Projections.max("canSubTypeId")));
		hibernateTemplate.setMaxResults(0);
		return li.get(0);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<CancerType> getCancerTypeList() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(CancerType.class));
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
	public CancerSubType getCancerSubTypeById(Integer cancerSubTypeId) {
		List<CancerSubType> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(CancerSubType.class).add(Restrictions.eq("canSubTypeId", cancerSubTypeId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean isCancerSubTypeExist(CancerSubType c) {
		List<CancerSubType> li = hibernateTemplate.findByCriteria(DetachedCriteria.forClass(CancerSubType.class)
				.add(Restrictions.eq("name", c.getName())).add(Restrictions.eq("cancerTypeId", c.getCancerTypeId())));
		if (li != null && li.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
}
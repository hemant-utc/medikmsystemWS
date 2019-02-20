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

import com.medikm.input.dao.BiopsyTypeDao;
import com.medikm.input.entity.BiopsyType;

/**
 * @author Monika
 * 
 */
@Repository("BiopsyTypeDao")
public class BiopsyTypeDaoImpl implements BiopsyTypeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer insertBiopsyType(BiopsyType biopsyType) {
		hibernateTemplate.save(biopsyType);
		return biopsyType.getTypeId();
	}

	@Override
	@Transactional
	public void updateBiopsyType(BiopsyType biopsyType) {
		hibernateTemplate.merge(biopsyType);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Integer getLastBiopsyTypeId() {
		hibernateTemplate.setMaxResults(1);
		List<Integer> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(BiopsyType.class).setProjection(Projections.max("typeId")));
		hibernateTemplate.setMaxResults(0);
		return li.get(0);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public BiopsyType getBiopsyTypeById(Integer Id) {
		List<BiopsyType> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(BiopsyType.class).add(Restrictions.eq("typeId", Id)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

}

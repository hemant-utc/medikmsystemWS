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

import com.medikm.input.dao.ImagingStatusDao;
import com.medikm.input.entity.DiseaseType;
import com.medikm.input.entity.DxWkType;
import com.medikm.input.entity.WorkupKindType;

/**
 * @author Monika
 * 
 */
@Repository("ImagingStatusDao")
public class ImagingStatusDaoImpl implements ImagingStatusDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer insertImagingStatus(WorkupKindType workupKindType) {
		hibernateTemplate.save(workupKindType);
		return workupKindType.getTypeId();
	}

	@Override
	@Transactional
	public void updateImagingStatus(WorkupKindType workupKindType) {
		hibernateTemplate.merge(workupKindType);

	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Integer getLastImagingStatusId() {
		hibernateTemplate.setMaxResults(1);
		List<Integer> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(WorkupKindType.class).setProjection(Projections.max("typeId")));
		hibernateTemplate.setMaxResults(0);
		return li.get(0);
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
	public WorkupKindType getImagingStatusById(Integer Id) {
		List<WorkupKindType> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(WorkupKindType.class).add(Restrictions.eq("typeId", Id)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public DxWkType getDxWkTypeById(Integer Id) {
		List<DxWkType> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(DxWkType.class).add(Restrictions.eq("typeId", Id)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

}

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

import com.medikm.input.dao.ReasonForPresentationDao;
import com.medikm.input.entity.ReasonForPresentation;

/**
 * @author Monika
 * 
 */
@Repository("ReasonForPresentationDao")
public class ReasonForPresentationDaoImpl implements ReasonForPresentationDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer insertReasonForPresentation(ReasonForPresentation reasonForPresentation) {
		hibernateTemplate.save(reasonForPresentation);
		return reasonForPresentation.getTypeId();
	}

	@Override
	@Transactional
	public void updateReasonForPresentation(ReasonForPresentation reasonForPresentation) {
		hibernateTemplate.merge(reasonForPresentation);

	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Integer getLastReasonForPresentationId() {
		hibernateTemplate.setMaxResults(1);
		List<Integer> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(ReasonForPresentation.class).setProjection(Projections.max("typeId")));
		hibernateTemplate.setMaxResults(0);
		return li.get(0);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public ReasonForPresentation getReasonForPresentationeById(Integer Id) {
		List<ReasonForPresentation> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(ReasonForPresentation.class).add(Restrictions.eq("typeId", Id)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

}

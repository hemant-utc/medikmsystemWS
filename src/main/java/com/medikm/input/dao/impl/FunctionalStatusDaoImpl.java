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

import com.medikm.input.dao.FunctionalStatusDao;
import com.medikm.input.entity.Functionalstatus;

/**
 * @author Monika
 * 
 */
@Repository("FunctionalStatusDao")
public class FunctionalStatusDaoImpl implements FunctionalStatusDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer insertFunctionalStatus(Functionalstatus functionalStatus) {
		hibernateTemplate.save(functionalStatus);
		return functionalStatus.getId();
	}

	@Override
	@Transactional
	public void updateFunctionalStatus(Functionalstatus functionalStatus) {
		hibernateTemplate.merge(functionalStatus);

	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Integer getLastFunctionalStatusId() {
		hibernateTemplate.setMaxResults(1);
		List<Integer> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Functionalstatus.class).setProjection(Projections.max("id")));
		hibernateTemplate.setMaxResults(0);
		return li.get(0);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Functionalstatus getFunctionalStatusById(Integer Id) {
		List<Functionalstatus> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Functionalstatus.class).add(Restrictions.eq("id", Id)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

}

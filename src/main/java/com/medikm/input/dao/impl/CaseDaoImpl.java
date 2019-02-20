package com.medikm.input.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.CaseDao;
import com.medikm.input.entity.CancerSubType;
import com.medikm.input.entity.CancerType;
import com.medikm.input.entity.Case1;
import com.medikm.input.entity.Gemonics;
import com.medikm.input.entity.Genetics;
import com.medikm.input.entity.Physician;
import com.medikm.input.entity.TnmStage;
import com.medikm.input.entity.TumorLocation;

/**
 * 
 * @author Saikat
 * 
 */

@Repository("caseDao")
public class CaseDaoImpl implements CaseDao {

	private static final long serialVersionUID = 3611949764031452128L;

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public Integer insertCase(Case1 case1) {
		hibernateTemplate.save(case1);
		return case1.getCaseId();

	}

	@Transactional
	@Override
	public void updateCase(Case1 case1) {
		hibernateTemplate.merge(case1);

	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Physician getPhysicianById(Integer id) {
		List<Physician> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Physician.class).add(Restrictions.eq("physicianId", id)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings({ "unchecked" })
	@Transactional
	@Override
	public CancerSubType getCancerSubTypeById(Integer canSubTypeId) {
		List<CancerSubType> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(CancerSubType.class).add(Restrictions.eq("canSubTypeId", canSubTypeId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public CancerType getCancerTypeById(Integer canTypeId) {
		List<CancerType> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(CancerType.class).add(Restrictions.eq("canTypeId", canTypeId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Genetics getGeneticsById(Integer id) {
		List<Genetics> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Genetics.class).add(Restrictions.eq("id", id)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Gemonics getGemonicsById(Integer id) {
		List<Gemonics> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Gemonics.class).add(Restrictions.eq("id", id)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public TnmStage getTnmStageById(Integer stageId) {
		List<TnmStage> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(TnmStage.class).add(Restrictions.eq("stageId", stageId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public TumorLocation getTLocationById(Integer tLocationId) {
		List<TumorLocation> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(TumorLocation.class).add(Restrictions.eq("tumorLocationId", tLocationId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@Transactional
	public Case1 getCaseById(final Integer caseId) {
		/*
		 * List<Case1>
		 * li=hibernateTemplate.findByCriteria(DetachedCriteria.forClass(Case1.
		 * class).add(Restrictions.eq("caseId", caseId)));
		 */
		final String hqlString = "select distinct case1 from Case1 case1 where case1.caseId=:caseId";
		List<Case1> li = hibernateTemplate.execute(new HibernateCallback<List>() {

			public List doInHibernate(Session s) throws HibernateException {
				Query sql = s.createQuery(hqlString);
				sql.setParameter("caseId", caseId);
				return sql.list();
			}
		});
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Override
	public SessionFactory getSessionFactory() {

		return hibernateTemplate.getSessionFactory();

	}

}

package com.medikm.input.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.TumorBoardDiscussionDao;
import com.medikm.input.entity.TumorBoardDiscussion;

/**
 * 
 * @author Dhiraj Singh
 *
 */
@Repository("TumorBoardDiscussionDao")
public class TumorBoardDiscussionDaoImpl implements TumorBoardDiscussionDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer updateTumorBoardDiscussion(TumorBoardDiscussion tumorBoardDiscussion) {
		hibernateTemplate.update(tumorBoardDiscussion);
		return tumorBoardDiscussion.getTBDiscussionId();
	}

	@Override
	@Transactional
	public Integer addTumorBoardDiscussion(TumorBoardDiscussion tumorBoardDiscussion) {
		hibernateTemplate.save(tumorBoardDiscussion);
		return tumorBoardDiscussion.getTBDiscussionId();
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public TumorBoardDiscussion getTumorBoardDiscussionById(Integer tumorBoardId) {
		List<TumorBoardDiscussion> li = hibernateTemplate.findByCriteria(DetachedCriteria
				.forClass(TumorBoardDiscussion.class).add(Restrictions.eq("tBDiscussionId", tumorBoardId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

}

package com.medikm.input.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.TbDiscussionForumDao;
import com.medikm.input.entity.TbDiscussionForum;

/**
 * 
 * @author Dhiraj Singh
 *
 */
@Repository("TbDiscussionForumDao")
public class TbDiscussionForumDaoImpl implements TbDiscussionForumDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer updateTbDiscussionForum(TbDiscussionForum tumorBoardDiscussion) {
		hibernateTemplate.update(tumorBoardDiscussion);
		return tumorBoardDiscussion.getTBDiscussionId();
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public TbDiscussionForum getTbDiscussionForumById(Integer tumorBoardId) {
		List<TbDiscussionForum> li = hibernateTemplate.findByCriteria(DetachedCriteria.forClass(TbDiscussionForum.class)
				.add(Restrictions.eq("tBDiscussionId", tumorBoardId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Override
	public Integer addTbDiscussionForum(TbDiscussionForum tbDiscussionForum) {
		hibernateTemplate.save(tbDiscussionForum);
		return tbDiscussionForum.getTBDiscussionId();
	}

}

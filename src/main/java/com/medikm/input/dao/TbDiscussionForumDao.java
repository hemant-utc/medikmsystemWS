package com.medikm.input.dao;

import com.medikm.input.entity.TbDiscussionForum;

public interface TbDiscussionForumDao {

	public TbDiscussionForum getTbDiscussionForumById(Integer tumorBoardId);

	public Integer updateTbDiscussionForum(TbDiscussionForum tbDiscussionForum);

	public Integer addTbDiscussionForum(TbDiscussionForum tbDiscussionForum);
	
}

package com.medikm.input.dao;

import com.medikm.input.entity.TumorBoardDiscussion;

public interface TumorBoardDiscussionDao {

	public TumorBoardDiscussion getTumorBoardDiscussionById(Integer tumorBoardId);

	public Integer updateTumorBoardDiscussion(TumorBoardDiscussion tumorBoardDiscussion);

	public Integer addTumorBoardDiscussion(TumorBoardDiscussion tumorBoardDiscussion);
	
}

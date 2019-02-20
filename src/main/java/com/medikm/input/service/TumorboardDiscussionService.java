package com.medikm.input.service;

import com.medikm.input.request.TbDiscussionForumRequest;
import com.medikm.input.request.TumorBoardDiscussionRequest;
import com.medikm.input.response.TbDiscussionForumResponse;
import com.medikm.input.response.TumorBoardDiscussionResponse;

public interface TumorboardDiscussionService {

	public TumorBoardDiscussionResponse addTumorBoardDiscussion(TumorBoardDiscussionRequest tumorBoardDiscussionRequest,
			String ipAddress);

	public TbDiscussionForumResponse addTbDiscussionForum(TbDiscussionForumRequest tbDiscussionForumRequest,
			String ipAddress);

	public TumorBoardDiscussionResponse addNewTumorBoardDiscussion(
			TumorBoardDiscussionRequest tumorBoardDiscussionRequest, String ipAddress);

	public TbDiscussionForumResponse addNewTbDiscussionForum(TbDiscussionForumRequest tbDiscussionForumRequest,
			String ipAddress);
	
}

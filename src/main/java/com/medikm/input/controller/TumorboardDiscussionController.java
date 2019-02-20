package com.medikm.input.controller;

import javax.servlet.http.HttpServletRequest;

import com.medikm.input.request.TbDiscussionForumRequest;
import com.medikm.input.request.TumorBoardDiscussionRequest;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.response.TumorBoardDiscussionResponse;

/**
 * 
 * @author LMS
 *
 */
public interface TumorboardDiscussionController {
	
	/**
	 * This method will edit TB Discussion (MDC minutes) data
	 * 
	 * @param tumorBoardDiscussionRequest
	 * @return TumorBoardDiscussionResponse
	 */
	public TumorBoardDiscussionResponse addTumorBoardDiscussion(TumorBoardDiscussionRequest tumorBoardDiscussionRequest,
			HttpServletRequest request);

	/**
	 * This method will Add TB Discussion Forum(Edit Virtual MDC Minutes)
	 * 
	 * @param tbDiscussionForumRequest
	 * @return MedikmResponse
	 */
	public MedikmResponse addTbDiscussionForum(TbDiscussionForumRequest tbDiscussionForumRequest,
			HttpServletRequest request);

	/**
	 * This method will Add TB Discussion (Add MDC Minutes)
	 * 
	 * @param tumorBoardDiscussionRequest
	 * @return
	 */
	public MedikmResponse addNewTbDiscussion(TumorBoardDiscussionRequest tumorBoardDiscussionRequest,
			HttpServletRequest request);

	/**
	 * This method will Edit TB Discussion Forum(Edit Virtual MDC Minutes)
	 * 
	 * @param tbDiscussionForumRequest
	 * @return
	 */
	public MedikmResponse addNewTbDiscussionForum(TbDiscussionForumRequest tbDiscussionForumRequest,
			HttpServletRequest request);
}

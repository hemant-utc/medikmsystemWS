/**
 * 
 */
package com.medikm.input.response;

import java.util.Date;

/**
 * @author Saikat
 *
 */
public class TbDiscussionForumResponse extends MedikmResponse {

	private static final long serialVersionUID = -7967728101293578512L;

	private Integer tbDiscussionId;
	private Date discussionEndDate;

	public Date getDiscussionEndDate() {
		return discussionEndDate;
	}

	public void setDiscussionEndDate(Date discussionEndDate) {
		this.discussionEndDate = discussionEndDate;
	}

	public Integer getTbDiscussionId() {
		return tbDiscussionId;
	}

	public void setTbDiscussionId(Integer tbDiscussionId) {
		this.tbDiscussionId = tbDiscussionId;
	}

}

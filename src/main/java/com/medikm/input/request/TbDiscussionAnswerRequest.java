/**
 * 
 */
package com.medikm.input.request;

import com.medikm.input.entity.TumorBoardDiscussionAnswers;

/**
 * @author Saikat
 *
 */
public class TbDiscussionAnswerRequest {

	private Integer answerId;
	private Integer questionId;
	private String answerText;
	private Short concurrence;
	private Short discurrence;

	/**
	 * @return the answerId
	 */
	public Integer getAnswerId() {
		return answerId;
	}

	/**
	 * @param answerId
	 *            the answerId to set
	 */
	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	/**
	 * @return the questionId
	 */
	public Integer getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId
	 *            the questionId to set
	 */
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the answerText
	 */
	public String getAnswerText() {
		return answerText;
	}

	/**
	 * @param answerText
	 *            the answerText to set
	 */
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	/**
	 * @return the concurrence
	 */
	public Short getConcurrence() {
		return concurrence;
	}

	/**
	 * @param concurrence
	 *            the concurrence to set
	 */
	public void setConcurrence(Short concurrence) {
		this.concurrence = concurrence;
	}

	/**
	 * @return the discurrence
	 */
	public Short getDiscurrence() {
		return discurrence;
	}

	/**
	 * @param discurrence
	 *            the discurrence to set
	 */
	public void setDiscurrence(Short discurrence) {
		this.discurrence = discurrence;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (answerId != null ? answerId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TbDiscussionAnswerRequest)) {
			if (!(object instanceof TumorBoardDiscussionAnswers)) {
				return false;
			}
			TumorBoardDiscussionAnswers request = (TumorBoardDiscussionAnswers) object;
			if ((this.answerId == null && request.getAnswerId() != null)
					|| (this.answerId != null && !this.answerId.equals(request.getAnswerId()))) {
				return false;
			}
			return true;

		}
		TbDiscussionAnswerRequest other = (TbDiscussionAnswerRequest) object;
		if ((this.answerId == null && other.answerId != null)
				|| (this.answerId != null && !this.answerId.equals(other.answerId))) {
			return false;
		}
		return true;
	}
}

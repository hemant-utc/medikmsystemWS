/**
 * 
 */
package com.medikm.input.request;

import java.util.List;

import com.medikm.input.entity.TumorBoardDiscussionQuestion;

/**
 * @author Saikat
 *
 */
public class TbDiscussionQuestionRequest {

	private Integer questionId;
	private String questionText;
	private List<TbDiscussionAnswerRequest> answerList;

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
	 * @return the questionText
	 */
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * @param questionText
	 *            the questionText to set
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	/**
	 * @return the answerList
	 */
	public List<TbDiscussionAnswerRequest> getAnswerList() {
		return answerList;
	}

	/**
	 * @param answerList
	 *            the answerList to set
	 */
	public void setAnswerList(List<TbDiscussionAnswerRequest> answerList) {
		this.answerList = answerList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (questionId != null ? questionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TbDiscussionQuestionRequest)) {
			if (!(object instanceof TumorBoardDiscussionQuestion)) {
				return false;
			}
			TumorBoardDiscussionQuestion other = (TumorBoardDiscussionQuestion) object;
			if ((this.questionId == null && other.getQuestionId() != null)
					|| (this.questionId != null && !this.questionId.equals(other.getQuestionId()))) {
				return false;
			}
			return true;
		}
		TbDiscussionQuestionRequest other = (TbDiscussionQuestionRequest) object;
		if ((this.questionId == null && other.questionId != null)
				|| (this.questionId != null && !this.questionId.equals(other.questionId))) {
			return false;
		}
		return true;
	}

}

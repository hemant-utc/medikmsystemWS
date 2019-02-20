/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import com.medikm.input.request.TbDiscussionAnswerRequest;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "tumor_board_discussion_answers")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "TumorBoardDiscussionAnswers.findAll", query = "SELECT t FROM TumorBoardDiscussionAnswers t") })
public class TumorBoardDiscussionAnswers implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "answer_id")
	private Integer answerId;
	@Lob
	@Column(name = "answer_text")
	private String answerText;
	@Column(name = "date_answered")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAnswered;
	@Column(name = "concurrence")
	private Short concurrence;
	@Column(name = "discurrence")
	private Short discurrence;
	@JoinColumn(name = "question_id", referencedColumnName = "question_id")
	@ManyToOne(optional = false)
	private TumorBoardDiscussionQuestion questionId;

	public TumorBoardDiscussionAnswers() {
	}

	public TumorBoardDiscussionAnswers(Integer answerId) {
		this.answerId = answerId;
	}

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public Date getDateAnswered() {
		return dateAnswered;
	}

	public void setDateAnswered(Date dateAnswered) {
		this.dateAnswered = dateAnswered;
	}

	public TumorBoardDiscussionQuestion getQuestionId() {
		return questionId;
	}

	public void setQuestionId(TumorBoardDiscussionQuestion questionId) {
		this.questionId = questionId;
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
		if (!(object instanceof TumorBoardDiscussionAnswers)) {
			if (!(object instanceof TbDiscussionAnswerRequest)) {
				return false;
			}
			TbDiscussionAnswerRequest request = (TbDiscussionAnswerRequest) object;
			if ((this.answerId == null && request.getAnswerId() != null)
					|| (this.answerId != null && !this.answerId.equals(request.getAnswerId()))) {
				return false;
			}
			return true;

		}
		TumorBoardDiscussionAnswers other = (TumorBoardDiscussionAnswers) object;
		if ((this.answerId == null && other.answerId != null)
				|| (this.answerId != null && !this.answerId.equals(other.answerId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.TumorBoardDiscussionAnswers[ answerId=" + answerId + " ]";
	}

}

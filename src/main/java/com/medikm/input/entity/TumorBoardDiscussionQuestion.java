/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.medikm.input.request.TbDiscussionQuestionRequest;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "tumor_board_discussion_question")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "TumorBoardDiscussionQuestion.findAll", query = "SELECT t FROM TumorBoardDiscussionQuestion t") })
public class TumorBoardDiscussionQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "question_id")
	private Integer questionId;
	@Column(name = "question_text")
	private String questionText;
	@Column(name = "date_asked")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAsked;
	@JoinColumn(name = "episode_id", referencedColumnName = "Episode_Id")
	@ManyToOne(optional = false)
	private Episode episodeId;
	@JoinColumn(name = "case_id", referencedColumnName = "Case_Id")
	@ManyToOne(optional = false)
	private Case1 caseId;
	@JoinColumn(name = "tb_discussion_id", referencedColumnName = "TB_Discussion_Id")
	@ManyToOne(optional = false)
	private TumorBoardDiscussion tbDiscussionId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "questionId")
	private List<TumorBoardDiscussionAnswers> tumorBoardDiscussionAnswersList;

	public TumorBoardDiscussionQuestion() {
	}

	public TumorBoardDiscussionQuestion(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public Date getDateAsked() {
		return dateAsked;
	}

	public void setDateAsked(Date dateAsked) {
		this.dateAsked = dateAsked;
	}

	public Episode getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(Episode episodeId) {
		this.episodeId = episodeId;
	}

	public Case1 getCaseId() {
		return caseId;
	}

	public void setCaseId(Case1 caseId) {
		this.caseId = caseId;
	}

	public TumorBoardDiscussion getTbDiscussionId() {
		return tbDiscussionId;
	}

	public void setTbDiscussionId(TumorBoardDiscussion tbDiscussionId) {
		this.tbDiscussionId = tbDiscussionId;
	}

	@XmlTransient
	public List<TumorBoardDiscussionAnswers> getTumorBoardDiscussionAnswersList() {
		return tumorBoardDiscussionAnswersList;
	}

	public void setTumorBoardDiscussionAnswersList(List<TumorBoardDiscussionAnswers> tumorBoardDiscussionAnswersList) {
		this.tumorBoardDiscussionAnswersList = tumorBoardDiscussionAnswersList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (questionId != null ? questionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TumorBoardDiscussionQuestion)) {
			if (!(object instanceof TbDiscussionQuestionRequest)) {
				return false;
			}
			TbDiscussionQuestionRequest other = (TbDiscussionQuestionRequest) object;
			if ((this.questionId == null && other.getQuestionId() != null)
					|| (this.questionId != null && !this.questionId.equals(other.getQuestionId()))) {
				return false;
			}
			return true;
		}
		TumorBoardDiscussionQuestion other = (TumorBoardDiscussionQuestion) object;
		if ((this.questionId == null && other.questionId != null)
				|| (this.questionId != null && !this.questionId.equals(other.questionId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.entity.TumorBoardDiscussionQuestion[ questionId=" + questionId + " ]";
	}

}

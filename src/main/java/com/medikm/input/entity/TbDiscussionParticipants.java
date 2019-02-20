/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saikat
 */
@Entity
@Table(name = "tb_discussion_participants")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "TbDiscussionParticipants.findAll", query = "SELECT t FROM TbDiscussionParticipants t") })
public class TbDiscussionParticipants implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected TbDiscussionParticipantsPK tbDiscussionParticipantsPK;
	@Basic(optional = false)
	@Column(name = "Physician_Speciality")
	private int physicianSpeciality;
	@JoinColumn(name = "TB_Discussion_id", referencedColumnName = "TB_Discussion_Id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private TumorBoardDiscussion tumorBoardDiscussion;

	public TbDiscussionParticipants() {
	}

	public TbDiscussionParticipants(TbDiscussionParticipantsPK tbDiscussionParticipantsPK) {
		this.tbDiscussionParticipantsPK = tbDiscussionParticipantsPK;
	}

	public TbDiscussionParticipants(TbDiscussionParticipantsPK tbDiscussionParticipantsPK, int physicianSpeciality) {
		this.tbDiscussionParticipantsPK = tbDiscussionParticipantsPK;
		this.physicianSpeciality = physicianSpeciality;
	}

	public TbDiscussionParticipants(int tBDiscussionid, int tBpartphyid) {
		this.tbDiscussionParticipantsPK = new TbDiscussionParticipantsPK(tBDiscussionid, tBpartphyid);
	}

	public TbDiscussionParticipantsPK getTbDiscussionParticipantsPK() {
		return tbDiscussionParticipantsPK;
	}

	public void setTbDiscussionParticipantsPK(TbDiscussionParticipantsPK tbDiscussionParticipantsPK) {
		this.tbDiscussionParticipantsPK = tbDiscussionParticipantsPK;
	}

	public int getPhysicianSpeciality() {
		return physicianSpeciality;
	}

	public void setPhysicianSpeciality(int physicianSpeciality) {
		this.physicianSpeciality = physicianSpeciality;
	}

	public TumorBoardDiscussion getTumorBoardDiscussion() {
		return tumorBoardDiscussion;
	}

	public void setTumorBoardDiscussion(TumorBoardDiscussion tumorBoardDiscussion) {
		this.tumorBoardDiscussion = tumorBoardDiscussion;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tbDiscussionParticipantsPK != null ? tbDiscussionParticipantsPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TbDiscussionParticipants)) {
			return false;
		}
		TbDiscussionParticipants other = (TbDiscussionParticipants) object;
		if ((this.tbDiscussionParticipantsPK == null && other.tbDiscussionParticipantsPK != null)
				|| (this.tbDiscussionParticipantsPK != null
						&& !this.tbDiscussionParticipantsPK.equals(other.tbDiscussionParticipantsPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TbDiscussionParticipants[ tbDiscussionParticipantsPK="
				+ tbDiscussionParticipantsPK + " ]";
	}

}

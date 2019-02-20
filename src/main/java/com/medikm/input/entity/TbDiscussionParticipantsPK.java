/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medikm.input.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Saikat
 */
@SuppressWarnings("serial")
@Embeddable
public class TbDiscussionParticipantsPK implements Serializable {
	@Basic(optional = false)
	@Column(name = "TB_Discussion_id")
	private int tBDiscussionid;
	@Basic(optional = false)
	@Column(name = "TB_part_phy_id")
	private int tBpartphyid;

	public TbDiscussionParticipantsPK() {
	}

	public TbDiscussionParticipantsPK(int tBDiscussionid, int tBpartphyid) {
		this.tBDiscussionid = tBDiscussionid;
		this.tBpartphyid = tBpartphyid;
	}

	public int getTBDiscussionid() {
		return tBDiscussionid;
	}

	public void setTBDiscussionid(int tBDiscussionid) {
		this.tBDiscussionid = tBDiscussionid;
	}

	public int getTBpartphyid() {
		return tBpartphyid;
	}

	public void setTBpartphyid(int tBpartphyid) {
		this.tBpartphyid = tBpartphyid;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) tBDiscussionid;
		hash += (int) tBpartphyid;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TbDiscussionParticipantsPK)) {
			return false;
		}
		TbDiscussionParticipantsPK other = (TbDiscussionParticipantsPK) object;
		if (this.tBDiscussionid != other.tBDiscussionid) {
			return false;
		}
		if (this.tBpartphyid != other.tBpartphyid) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.medikm.input.entity.TbDiscussionParticipantsPK[ tBDiscussionid=" + tBDiscussionid + ", tBpartphyid="
				+ tBpartphyid + " ]";
	}

}

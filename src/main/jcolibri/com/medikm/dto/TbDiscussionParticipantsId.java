package com.medikm.dto;

/**
 * TbDiscussionParticipantsId entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class TbDiscussionParticipantsId implements java.io.Serializable {

	// Fields

	private TumorBoardDiscussion tumorBoardDiscussion;
	private Integer tbPartPhyId;

	// Constructors

	/** default constructor */
	public TbDiscussionParticipantsId() {
	}

	/** full constructor */
	public TbDiscussionParticipantsId(TumorBoardDiscussion tumorBoardDiscussion, Integer tbPartPhyId) {
		this.tumorBoardDiscussion = tumorBoardDiscussion;
		this.tbPartPhyId = tbPartPhyId;
	}

	// Property accessors

	public TumorBoardDiscussion getTumorBoardDiscussion() {
		return this.tumorBoardDiscussion;
	}

	public void setTumorBoardDiscussion(TumorBoardDiscussion tumorBoardDiscussion) {
		this.tumorBoardDiscussion = tumorBoardDiscussion;
	}

	public Integer getTbPartPhyId() {
		return this.tbPartPhyId;
	}

	public void setTbPartPhyId(Integer tbPartPhyId) {
		this.tbPartPhyId = tbPartPhyId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbDiscussionParticipantsId))
			return false;
		TbDiscussionParticipantsId castOther = (TbDiscussionParticipantsId) other;

		return ((this.getTumorBoardDiscussion() == castOther.getTumorBoardDiscussion())
				|| (this.getTumorBoardDiscussion() != null && castOther.getTumorBoardDiscussion() != null
						&& this.getTumorBoardDiscussion().equals(castOther.getTumorBoardDiscussion())))
				&& ((this.getTbPartPhyId() == castOther.getTbPartPhyId())
						|| (this.getTbPartPhyId() != null && castOther.getTbPartPhyId() != null
								&& this.getTbPartPhyId().equals(castOther.getTbPartPhyId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTumorBoardDiscussion() == null ? 0 : this.getTumorBoardDiscussion().hashCode());
		result = 37 * result + (getTbPartPhyId() == null ? 0 : this.getTbPartPhyId().hashCode());
		return result;
	}

}
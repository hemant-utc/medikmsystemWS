package com.medikm.dto;

/**
 * TbDiscussionParticipants entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class TbDiscussionParticipants implements java.io.Serializable {

	// Fields

	private TbDiscussionParticipantsId id;
	private Integer physicianSpeciality;

	// Constructors

	/** default constructor */
	public TbDiscussionParticipants() {
	}

	/** full constructor */
	public TbDiscussionParticipants(TbDiscussionParticipantsId id, Integer physicianSpeciality) {
		this.id = id;
		this.physicianSpeciality = physicianSpeciality;
	}

	// Property accessors

	public TbDiscussionParticipantsId getId() {
		return this.id;
	}

	public void setId(TbDiscussionParticipantsId id) {
		this.id = id;
	}

	public Integer getPhysicianSpeciality() {
		return this.physicianSpeciality;
	}

	public void setPhysicianSpeciality(Integer physicianSpeciality) {
		this.physicianSpeciality = physicianSpeciality;
	}

}
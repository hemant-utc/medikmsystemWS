package com.medikm.dto;

/**
 * EncounterPhysician entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EncounterPhysician implements java.io.Serializable {

	// Fields

	private EncounterPhysicianId id;
	private String physicanEncounterNote;

	// Constructors

	/** default constructor */
	public EncounterPhysician() {
	}

	/** minimal constructor */
	public EncounterPhysician(EncounterPhysicianId id) {
		this.id = id;
	}

	/** full constructor */
	public EncounterPhysician(EncounterPhysicianId id, String physicanEncounterNote) {
		this.id = id;
		this.physicanEncounterNote = physicanEncounterNote;
	}

	// Property accessors

	public EncounterPhysicianId getId() {
		return this.id;
	}

	public void setId(EncounterPhysicianId id) {
		this.id = id;
	}

	public String getPhysicanEncounterNote() {
		return this.physicanEncounterNote;
	}

	public void setPhysicanEncounterNote(String physicanEncounterNote) {
		this.physicanEncounterNote = physicanEncounterNote;
	}

}
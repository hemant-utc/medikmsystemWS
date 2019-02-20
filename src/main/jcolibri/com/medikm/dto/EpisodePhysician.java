package com.medikm.dto;

import java.sql.Timestamp;

/**
 * EpisodePhysician entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class EpisodePhysician implements java.io.Serializable {

	// Fields

	private EpisodePhysicianId id;
	private String physicanNotes;
	private Timestamp dateOfFirstPEncounter;

	// Constructors

	/** default constructor */
	public EpisodePhysician() {
	}

	/** minimal constructor */
	public EpisodePhysician(EpisodePhysicianId id) {
		this.id = id;
	}

	/** full constructor */
	public EpisodePhysician(EpisodePhysicianId id, String physicanNotes, Timestamp dateOfFirstPEncounter) {
		this.id = id;
		this.physicanNotes = physicanNotes;
		this.dateOfFirstPEncounter = dateOfFirstPEncounter;
	}

	// Property accessors

	public EpisodePhysicianId getId() {
		return this.id;
	}

	public void setId(EpisodePhysicianId id) {
		this.id = id;
	}

	public String getPhysicanNotes() {
		return this.physicanNotes;
	}

	public void setPhysicanNotes(String physicanNotes) {
		this.physicanNotes = physicanNotes;
	}

	public Timestamp getDateOfFirstPEncounter() {
		return this.dateOfFirstPEncounter;
	}

	public void setDateOfFirstPEncounter(Timestamp dateOfFirstPEncounter) {
		this.dateOfFirstPEncounter = dateOfFirstPEncounter;
	}

}
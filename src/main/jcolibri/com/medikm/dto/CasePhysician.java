package com.medikm.dto;

import java.sql.Timestamp;

/**
 * CasePhysician entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "serial" })
public class CasePhysician implements java.io.Serializable {

	// Fields

	private CasePhysicianId id;
	private String physicanNotes;
	private Timestamp dtFirstPEncounter;

	// Constructors

	/** default constructor */
	public CasePhysician() {
	}

	/** minimal constructor */
	public CasePhysician(CasePhysicianId id) {
		this.id = id;
	}

	/** full constructor */
	public CasePhysician(CasePhysicianId id, String physicanNotes, Timestamp dtFirstPEncounter) {
		this.id = id;
		this.physicanNotes = physicanNotes;
		this.dtFirstPEncounter = dtFirstPEncounter;
	}

	// Property accessors

	public CasePhysicianId getId() {
		return this.id;
	}

	public void setId(CasePhysicianId id) {
		this.id = id;
	}

	public String getPhysicanNotes() {
		return this.physicanNotes;
	}

	public void setPhysicanNotes(String physicanNotes) {
		this.physicanNotes = physicanNotes;
	}

	public Timestamp getDtFirstPEncounter() {
		return this.dtFirstPEncounter;
	}

	public void setDtFirstPEncounter(Timestamp dtFirstPEncounter) {
		this.dtFirstPEncounter = dtFirstPEncounter;
	}

}
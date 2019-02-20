package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Race entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class Race implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String race;
	private Set patients = new HashSet(0);

	// Constructors

	/** default constructor */
	public Race() {
	}

	/** minimal constructor */
	public Race(Integer typeId, String race) {
		this.typeId = typeId;
		this.race = race;
	}

	/** full constructor */
	public Race(Integer typeId, String race, Set patients) {
		this.typeId = typeId;
		this.race = race;
		this.patients = patients;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Set getPatients() {
		return this.patients;
	}

	public void setPatients(Set patients) {
		this.patients = patients;
	}

}
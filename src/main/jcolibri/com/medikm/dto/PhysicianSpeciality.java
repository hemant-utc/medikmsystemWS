package com.medikm.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * PhysicianSpeciality entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class PhysicianSpeciality implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String name;
	private Set physicians = new HashSet(0);

	// Constructors

	/** default constructor */
	public PhysicianSpeciality() {
	}

	/** minimal constructor */
	public PhysicianSpeciality(Integer typeId, String name) {
		this.typeId = typeId;
		this.name = name;
	}

	/** full constructor */
	public PhysicianSpeciality(Integer typeId, String name, Set physicians) {
		this.typeId = typeId;
		this.name = name;
		this.physicians = physicians;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getPhysicians() {
		return this.physicians;
	}

	public void setPhysicians(Set physicians) {
		this.physicians = physicians;
	}

}